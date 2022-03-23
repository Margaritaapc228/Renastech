package Day_33Map_GC_StringBuffer;

import java.security.spec.PSSParameterSpec;

public class C3GarbageCollector {

    public void finalize(){
        System.out.println("Object is about to be removed!!");
    }

    public static void main(String[] args) {

        TV myTV = new TV();

        myTV = null;

        for (int i=0; i<1000;i++){
            System.gc();
            System.out.println(i);

        }

    }
}

    class TV{}

