package org.javabasics.oopsConcept.abstractionConcept.interfaceConcept.amazonPayExample.mobileRechargeCategory;

public class MobileRechargeDesktopLandingPage implements MobileRechargeLandingPage {


    @Override
    public void clickOnAmazonPay() {
        System.out.println("Clicking on Amazon Pay from Desktop");

    }

    @Override
    public void clickOnMobileRecharge() {
        System.out.println("Clicking on Mobile Recharge from Desktop");

    }

    @Override
    public void enterMobileNumberWhichHasToBeRechaged() {
        System.out.println("Entering Mobile Number from Desktop");

    }
}
