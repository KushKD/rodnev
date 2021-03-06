package vendorapplication.utilities;

import vendorapplication.entities.UserApplicationEntity;

public class CalculateAmount {


    public static String calculateAmount(UserApplicationEntity user){
        Integer numberOfDays = user.getTotalDays();
        String amountToDeposit = null;
        Double fee = 0.0;
        Double security = 0.0;


        if(user.getSubcategory().getSubCategoryId() == 2){
           return calculateFeeInCaseOfTent(user);

        }else if(user.getSubcategory().getSubCategoryId() == 5 || user.getSubcategory().getSubCategoryId() == 6 || user.getSubcategory().getSubCategoryId() == 7){
            return calculateFeeInCaseOfHome_Serial_Adver(user);
        }else if(user.getSubcategory().getSubCategoryId() == 3){
            return calculateFeeInCaseOfFilmShooting(user);
        }else if(user.getSubcategory().getSubCategoryId() == 4){
            return calculateFeeInCaseOfDocumentaryFilms(user);
        }else if(user.getSubcategory().getSubCategoryId() == 28 ||
                user.getSubcategory().getSubCategoryId() == 13 ||
                user.getSubcategory().getSubCategoryId() == 15 ||
                user.getSubcategory().getSubCategoryId() == 16 ||
                user.getSubcategory().getSubCategoryId() == 18){

            return calculateFeeInCaseOfParaGliging_Yark_Horse_Raft_SnowScooters(user);
        } else{
            return calculateFeeInCaseOfothers(user);
        }
    }

    /**
     * Calculate Amount Left Rest Out Cases.
     * @param user
     * @return
     */

    private static String calculateFeeInCaseOfothers(UserApplicationEntity user) {
        Integer numberOfDays = user.getTotalDays();
        String amountToDeposit = null;
        Double fee = 0.0;
        Double security = 0.0;

        for(int i=0; i<user.getApp_items().size(); i++){
            Double itemFee = 0.0;
            itemFee =
                    Double.parseDouble(user.getApp_items().get(i).getItem().getFee()) +
                            Double.parseDouble(user.getApp_items().get(i).getItem().getFee_bdo()) ;
            fee += itemFee;
            security = Double.parseDouble(user.getApp_items().get(i).getItem().getSecurityAmount());
        }
        return Double.toString(fee + security);
    }

    /**
     * Caluculate Amount 28 snow scooters, 13 PAraGliding, 15 yark, 16 horse, 18 raft
     */

    private static String calculateFeeInCaseOfParaGliging_Yark_Horse_Raft_SnowScooters(UserApplicationEntity user) {
        Integer numberOfDays = user.getTotalDays();
        String amountToDeposit = null;
        Double fee = 0.0;
        Double security = 0.0;

        for(int i=0; i<user.getApp_items().size(); i++){
            Double itemFee = 0.0;
            itemFee =
                    Double.parseDouble(user.getApp_items().get(i).getItem().getFee()) +
                            Double.parseDouble(user.getApp_items().get(i).getItem().getFee_bdo()) ;
            fee += itemFee;
            security = Double.parseDouble(user.getApp_items().get(i).getItem().getSecurityAmount());
        }
        return Double.toString((fee * Integer.parseInt(user.getNumberItems())) + security);

    }


    /**
     * Caluculate Amount in case of Tent ID 2
     */

    private static String calculateFeeInCaseOfTent(UserApplicationEntity user){

        Integer numberOfDays = user.getTotalDays();
        String amountToDeposit = null;
        Double fee = 0.0;
        Double security = 0.0;

        for(int i=0; i<user.getApp_items().size(); i++){
            Double itemFee = 0.0;
            itemFee =    (Double.parseDouble(user.getApp_items().get(i).getItem().getFee()) +
                    Double.parseDouble(user.getApp_items().get(i).getItem().getFee_bdo())) *
            user.getApp_items().get(i).getTentNumber();

                    fee += itemFee;
            security = Double.parseDouble(user.getApp_items().get(i).getItem().getSecurityAmount());
        }
        return Double.toString((fee * user.getTotalDays()) + security);

    }

    /**
     * Home Local Video
     * Advertisements
     * Serials TV
     * Calculate Money In  case if ID  5,6,7
     */
    private static String calculateFeeInCaseOfHome_Serial_Adver(UserApplicationEntity user){

        Integer numberOfDays = user.getTotalDays();
        String amountToDeposit = null;
        Double fee = 0.0;
        Double security = 0.0;

        for(int i=0; i<user.getApp_items().size(); i++){
            Double itemFee = 0.0;
            itemFee =    Double.parseDouble(user.getApp_items().get(i).getItem().getFee()) +
                    Double.parseDouble(user.getApp_items().get(i).getItem().getFee_bdo()) ;
            fee += itemFee;
            security = Double.parseDouble(user.getApp_items().get(i).getItem().getSecurityAmount());
        }
        return Double.toString((fee * user.getTotalDays()) + security);

    }

    /**
     * Film Shooting
     * Calculate Amount in case of 3
     */
    private static String calculateFeeInCaseOfFilmShooting(UserApplicationEntity user){

        Integer numberOfDays = user.getTotalDays();
        String amountToDeposit = null;
        Double fee = 0.0;
        Double security = 0.0;

        for(int i=0; i<user.getApp_items().size(); i++){
            Double itemFee = 0.0;
            itemFee =    Double.parseDouble(user.getApp_items().get(i).getItem().getFee()) +
                    Double.parseDouble(user.getApp_items().get(i).getItem().getFee_bdo()) ;
            fee += itemFee;
            security = Double.parseDouble(user.getApp_items().get(i).getItem().getSecurityAmount());
        }

        return Double.toString((fee) + security);

    }

    /**
     * Documentary Films
     * Calculate Amount in case ID 4
     */
    private static String calculateFeeInCaseOfDocumentaryFilms(UserApplicationEntity user){

        Integer numberOfDays = user.getTotalDays();
        String amountToDeposit = null;
        Double fee = 0.0;
        Double security = 0.0;

        for(int i=0; i<user.getApp_items().size(); i++){
            Double itemFee = 0.0;
            itemFee =    Double.parseDouble(user.getApp_items().get(i).getItem().getFee()) +
                    Double.parseDouble(user.getApp_items().get(i).getItem().getFee_bdo()) ;
            fee += itemFee;
            security = Double.parseDouble(user.getApp_items().get(i).getItem().getSecurityAmount());
        }
        return Double.toString((fee) + security);

    }

}
