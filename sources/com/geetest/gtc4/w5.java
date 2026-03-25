package com.geetest.gtc4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes21.dex */
public final class w5 implements h6 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.h6
    public final String a(IBinder iBinder) {
        v5 t5Var;
        int i = u5.f519a;
        if (iBinder == null) {
            t5Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.bun.lib.MsaIdInterface");
            t5Var = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof v5)) ? new t5(iBinder) : (v5) iInterfaceQueryLocalInterface;
        }
        if (t5Var == null) {
            throw new e6("MsaIdInterface is null");
        }
        t5 t5Var2 = (t5) t5Var;
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.bun.lib.MsaIdInterface");
            t5Var2.f514a.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            if (!(parcelObtain2.readInt() != 0)) {
                throw new e6("MsaIdInterface#isSupported return false");
            }
            parcelObtain = Parcel.obtain();
            parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.bun.lib.MsaIdInterface");
                t5Var2.f514a.transact(3, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readString();
            } finally {
            }
        } finally {
        }
    }
}
