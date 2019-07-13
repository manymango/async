package com.stumbleupon.async;

public class DeferredTest {

    public static void main(String[] args) {
        Deferred<String> deferred = Deferred.fromResult("1");
        deferred.addCallbackDeferring(s ->{
            System.out.println(s);
            System.out.println(s);
            return Deferred.fromResult("2");
        }).addCallback(s ->{
            System.out.println(s);
            System.out.println(s);
            return 2;
        });
    }

}
