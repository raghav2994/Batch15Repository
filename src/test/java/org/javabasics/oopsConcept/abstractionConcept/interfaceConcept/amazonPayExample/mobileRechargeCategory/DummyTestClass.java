package org.javabasics.oopsConcept.abstractionConcept.interfaceConcept.amazonPayExample.mobileRechargeCategory;

public class DummyTestClass {

    public static void main(String[] args){

        MobileRechargeLandingPage mWeb = new MobileRechargeMWebLandingPage();
        MobileRechargeLandingPage desktop = new MobileRechargeDesktopLandingPage();
        MobileRechargeLandingPage android = new MobileRechargeAndroidLandingPage();

        mWeb.clickOnAmazonPay();
        mWeb.clickOnMobileRecharge();
        mWeb.enterMobileNumberWhichHasToBeRechaged();

        desktop.clickOnAmazonPay();
        desktop.clickOnMobileRecharge();
        desktop.enterMobileNumberWhichHasToBeRechaged();

        android.clickOnAmazonPay();
        android.clickOnMobileRecharge();
        android.enterMobileNumberWhichHasToBeRechaged();

    }
}
