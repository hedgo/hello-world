package com.hedgo.allpatterns.structual.facade;

//Fasady sa dobre dla a) ukrycia zlozonosci systemu b) podlaczenia do nowego kodu kawalkow legacy
public class MainFacade {

    private Hall hall = new Hall();
    private Photographer photographer = new Photographer();
    private Restaurant restaurant = new Restaurant();
    private Vehicle vehicle = new Vehicle();

    public void organizeWedding() {
        hall.book();
        photographer.book();
        restaurant.placeOrder();
        vehicle.reserve();
    }
}
