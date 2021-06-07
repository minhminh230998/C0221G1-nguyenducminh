package model.service.validate;

public class Validate {
    public boolean checkCustomerId(String idCustomer){
        String regex="^KH-[0-9]{4}$";
        return idCustomer.matches(regex);
    }
    public boolean checkServiceId(String idService){
        String regex="^DV-[0-9]{4}$";
        return idService.matches(regex);
    }
}
