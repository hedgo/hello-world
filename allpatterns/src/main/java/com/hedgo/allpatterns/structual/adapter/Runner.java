package com.hedgo.allpatterns.structual.adapter;

public class Runner {

    public static void main(String[] args) {

        //Tu wybieram ktora brzydka bilblioteke dostawcy zastosuje: 1 czy 2. Wiecej innego kodu nie trzeba zmieniac.
        //AdapterLib adapterLib = new Adapter4S1Lib(new UglySupplier1Lib());
        AdapterLib adapterLib = new Adapter4S2Lib(new UglySupplier2Lib());

        adapterLib.beautifulMethod1();
        adapterLib.beautifulMethod2();
        adapterLib.beautifulMethod3();

    }
}
