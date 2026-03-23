package btth;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        HospitalBusiness hospitalBusiness = new HospitalBusiness();
        hospitalBusiness.getDailyRevenue(new Date());
    }
}
