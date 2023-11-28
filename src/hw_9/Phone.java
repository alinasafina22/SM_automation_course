package hw_9;

abstract class Phone {

    private String phoneName;
    private String phoneImei;

    public void setPhoneName(String phoneName){
        this.phoneName = phoneName;
    }
    public String getPhoneName(){
        return phoneName;
    }
    public void setPhoneImei(String phoneImei){
        this.phoneName = phoneImei;
    }
    public String getPhoneImei(){
        return phoneImei;
    }
}
