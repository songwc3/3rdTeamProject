package spring.project.groupware.academy.employee.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.CONFLICT)
public class BadRequestException extends RuntimeException {

    public BadRequestException(String message){
        super(message);
    }

}
