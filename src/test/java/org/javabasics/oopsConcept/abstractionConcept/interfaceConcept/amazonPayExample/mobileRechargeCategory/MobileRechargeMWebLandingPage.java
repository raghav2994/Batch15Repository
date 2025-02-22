package org.javabasics.oopsConcept.abstractionConcept.interfaceConcept.amazonPayExample.mobileRechargeCategory;

public class MobileRechargeMWebLandingPage implements MobileRechargeLandingPage{
    @Override
    public void clickOnAmazonPay() {
        System.out.println("Clicking on Amazon Pay from mWeb");

    }

    @Override
    public void clickOnMobileRecharge() {
        System.out.println("Clicking on Mobile Recharge from mWeb");

    }

    @Override
    public void enterMobileNumberWhichHasToBeRechaged() {
        System.out.println("Entering Mobile Number from mWeb");

    }
}
