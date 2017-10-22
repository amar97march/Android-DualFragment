package com.example.amar97march.dualfragment;

import java.io.Serializable;

/**
 * Created by amar97march on 18-08-2017.
 */

public class NameAndAddress implements Serializable {
    private String mName;
    private String mAddress1;
    private String mAddress2;
    private String mZipCode;
    public NameAndAddress(String name, String address1, String address2, String zipCode){
        mName = name;
        mAddress1 = address1;
        mAddress2 = address2;
        mZipCode = zipCode;
    }

    public String getName() {
        return mName;
    }

    public String getZipCode() {
        return mZipCode;
    }

    public String getAddress2() {
        return mAddress2;
    }

    public String getAddress1() {
        return mAddress1;
    }
}
