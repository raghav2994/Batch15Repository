package org.javabasics.oopsConcept.abstractionConcept.interfaceConcept.amazonPayExample.mobileRechargeCategory;

public class MobileRechargeAndroidLandingPage implements MobileRechargeLandingPage{
    @Override
    public void clickOnAmazonPay() {
        System.out.println("Clicking on Amazon Pay from Android");
    }

    @Override
    public void clickOnMobileRecharge() {
        System.out.println("Clicking on Mobile Recharge from Android");

    }

    @Override
    public void enterMobileNumberWhichHasToBeRechaged() {
        System.out.println("Entering Mobile Number from Android");

    }
}
