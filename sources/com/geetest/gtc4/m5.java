package com.geetest.gtc4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes21.dex */
public final class m5 implements h6 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.h6
    public final String a(IBinder iBinder) {
        t4 r4Var;
        int i = s4.f504a;
        if (iBinder == null) {
            r4Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.zui.deviceidservice.IDeviceidInterface");
            r4Var = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof t4)) ? new r4(iBinder) : (t4) iInterfaceQueryLocalInterface;
        }
        if (r4Var == null) {
            throw new e6("IDeviceidInterface is null");
        }
        r4 r4Var2 = (r4) r4Var;
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.zui.deviceidservice.IDeviceidInterface");
            r4Var2.f499a.transact(3, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            if (!(parcelObtain2.readInt() != 0)) {
                throw new e6("IDeviceidInterface#isSupport return false");
            }
            parcelObtain = Parcel.obtain();
            parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.zui.deviceidservice.IDeviceidInterface");
                r4Var2.f499a.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readString();
            } finally {
            }
        } finally {
        }
    }
}
