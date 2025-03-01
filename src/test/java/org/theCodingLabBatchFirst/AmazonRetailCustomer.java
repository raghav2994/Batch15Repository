package org.theCodingLabBatchFirst;

public class AmazonRetailCustomer {

   static String todayDeal;

    public static void clickOnTodaysDeal(){
        todayDeal = "Raghav";
        System.out.println("Today Deal is " + todayDeal);
    }

    public static void clickOnMobileDeals(){
        System.out.println("Mobile deals");
    }

    public static String getTitleOfTodaysDealPage(){
        String title = "Shipping Page";
        return title;
    }

    public static void main(String[] args) {
        String fetched_Title = getTitleOfTodaysDealPage();
        if(fetched_Title == "Today's Deal"){
            System.out.println("Successfull Page");
        }
        else
        {
            System.out.println("Incorrect Page");
        }
    }

}
