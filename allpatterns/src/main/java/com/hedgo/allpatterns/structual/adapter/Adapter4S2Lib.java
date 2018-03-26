package com.hedgo.allpatterns.structual.adapter;

//Taki warper na biblioteke supplier'a. Jego brzydkie API jest tlumaczone na nasze, przez co latwo wymieniac w przyszlosci supplierow (good!)
//Jednoczenie adapter jest ACL - Anti-Coruption-Layer, warstwa zabezpieczajaca przed uszkodzeniem
public class Adapter4S2Lib implements AdapterLib {

    UglySupplier2Lib uglySupplier2Lib;

    public Adapter4S2Lib(UglySupplier2Lib uglySupplier2Lib) {
        this.uglySupplier2Lib = uglySupplier2Lib;
    }

    public void beautifulMethod1() { System.out.println("beautiful1"); uglySupplier2Lib.veryUglyMethod1();};
    public void beautifulMethod2() { System.out.println("beautiful2, in ugly is not present"); };
    public void beautifulMethod3() { System.out.println("beautiful3"); uglySupplier2Lib.veryUglyMethod3();};
}

