package TransportCompany.Exceptions;

public class CompanyException extends Exception{
    public CompanyException(Exception exception){
        super(exception);
    }

    public CompanyException(String str, Exception exception){
        super(str, exception);
    }

    public CompanyException(String str){
        super(str);
    }
}
