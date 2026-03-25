package com.geetest.gtc4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes21.dex */
public final class n3 implements h6 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.h6
    public final String a(IBinder iBinder) {
        h5 f5Var;
        int i = g5.f453a;
        if (iBinder == null) {
            f5Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.android.creator.IdsSupplier");
            f5Var = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof h5)) ? new f5(iBinder) : (h5) iInterfaceQueryLocalInterface;
        }
        if (f5Var == null) {
            throw new e6("IdsSupplier is null");
        }
        f5 f5Var2 = (f5) f5Var;
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.android.creator.IdsSupplier");
            f5Var2.f448a.transact(3, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readString();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
