package hw_9;

abstract class Application extends Phone{

    private String applicationName;

    public void setApplicationName(String applicationName){
        this.applicationName = applicationName;
    }
    public String getApplicationName(){
        return applicationName;
    }

    public abstract String openApplication();
    public abstract String closeApplication();

}
