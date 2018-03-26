package com.hedgo.allpatterns;


import com.hedgo.allpatterns.creational.singleton.MySingleton;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        MySingleton.getInstance().showMessage();
    }
}

/*
 * @author Sumith Puri
https://dzone.com/articles/gof-design-patterns-using-java-part-1
 */

/* WERSJA Z TWORZENIEM OBIEKTU PRZY PIERWSZYM UZYCIU
package com.sumsoft.design.patterns.singleton.threadsafe;

public class ProductionHouse {

    private static ProductionHouse productionHouse = null;

    private ProductionHouse() {

    }

    public static synchronized ProductionHouse getInstance() {

        if(productionHouse == null) {

            productionHouse = new ProductionHouse();

        }

        return productionHouse;

    }

}*/

/* WERSJA Z TWORZENIEM OBIEKTU PRZY PIERWSZYM UZYCIU (ZOPTYMALIZOWANA, BEZ SYNCHRONIZED NA METODZIE)
package com.sumsoft.design.patterns.singleton.doublechecked;
public class ProductionHouse {

    private static ProductionHouse productionHouse = null;

    private ProductionHouse() {

    }

    public static ProductionHouse getInstance() {

        if(productionHouse == null) {

            synchronized(ProductionHouse.class) {

                if(productionHouse == null) {

                    productionHouse = new ProductionHouse();

                }

            }

        }

        return productionHouse;

    }

}
*/


