package org.learn.exception;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class ArithmeticExceptionMapper implements ExceptionMapper<ArithmeticException> {

    @Override
    public Response toResponse(ArithmeticException e) {

        return Response
                .status(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode())
                .type(MediaType.TEXT_PLAIN)
                .entity("Catching ArithmeticExceptionMapper : "+ e.getMessage())
                .build();
    }
}