package api.farmacia.application.exception;

public class NotFound extends RuntimeException{

    public NotFound(String msg){
        super(msg);
    }

    public NotFound(String msg,Throwable throwable){
        super(msg);
    }
}
