package TransportCompany.Exceptions;

public class FactoryException extends CompanyException{
    public FactoryException(Exception exception){
        super(exception);
    }

    public FactoryException(String str, Exception exception){
        super(str, exception);
    }

    public FactoryException(String str){
        super(str);
    }
}
