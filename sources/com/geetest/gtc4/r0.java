package com.geetest.gtc4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes21.dex */
public final class r0 implements h6 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.h6
    public final String a(IBinder iBinder) {
        w4 u4Var;
        int i = v4.f524a;
        if (iBinder == null) {
            u4Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.asus.msa.SupplementaryDID.IDidAidlInterface");
            u4Var = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof w4)) ? new u4(iBinder) : (w4) iInterfaceQueryLocalInterface;
        }
        if (u4Var == null) {
            throw new e6("IDidAidlInterface is null");
        }
        u4 u4Var2 = (u4) u4Var;
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.asus.msa.SupplementaryDID.IDidAidlInterface");
            u4Var2.f518a.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            if (!(parcelObtain2.readInt() != 0)) {
                throw new e6("IDidAidlInterface#isSupport return false");
            }
            parcelObtain = Parcel.obtain();
            parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.asus.msa.SupplementaryDID.IDidAidlInterface");
                u4Var2.f518a.transact(3, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readString();
            } finally {
            }
        } finally {
        }
    }
}
