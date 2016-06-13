package pl.piotrswiatek.kalkulatordiabetyka;

/**
 * Created by Piter on 2016-06-10.
 */
public class User {
    private String userName;
    private String password;
    private GlycemyMeasurment measurment;

    public User(){};

    public User(String userName, GlycemyMeasurment measurment){
        this.userName = userName;
        this.measurment = measurment;
    }

    public User(String userName, String pasword, GlycemyMeasurment measurment){
        this.userName = userName;
        this.password = pasword;
        this.measurment = measurment;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public GlycemyMeasurment getMeasurment() {
        return measurment;
    }

    public void setMeasurment(GlycemyMeasurment measurment) {
        this.measurment = measurment;
    }

    public void saveUserToDB(){

    }
}
