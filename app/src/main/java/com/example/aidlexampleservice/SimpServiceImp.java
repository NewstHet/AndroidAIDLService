package com.example.aidlexampleservice;

import android.os.RemoteException;

import com.example.aidl.ISimp;

public class SimpServiceImp extends ISimp.Stub {

    @Override
    public String getMessage() throws RemoteException {
        return "Metal Up Your Ass";
    }
}