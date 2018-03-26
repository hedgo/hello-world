package com.hedgo.allpatterns.structual.adapter;

//Taki warper na biblioteke supplier'a. Jego brzydkie API jest tlumaczone na nasze, przez co latwo wymieniac w przyszlosci supplierow (good!)
//Jednoczenie adapter jest ACL - Anti-Coruption-Layer, warstwa zabezpieczajaca przed uszkodzeniem
public class Adapter4S1Lib implements AdapterLib {

    UglySupplier1Lib uglySupplier1Lib;

    public Adapter4S1Lib(UglySupplier1Lib uglySupplier1Lib) {
        this.uglySupplier1Lib = uglySupplier1Lib;
    }

    public void beautifulMethod1() { System.out.println("beautiful1"); uglySupplier1Lib.uglyMethod1();};
    public void beautifulMethod2() { System.out.println("beautiful2"); uglySupplier1Lib.uglyMethod2();};
    public void beautifulMethod3() { System.out.println("beautiful3, in ugly is not present"); };
}
