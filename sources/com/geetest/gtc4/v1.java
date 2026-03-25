package com.geetest.gtc4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes21.dex */
public final class v1 implements h6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w1 f521a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public v1(w1 w1Var) {
        this.f521a = w1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.h6
    public final String a(IBinder iBinder) {
        n4 l4Var;
        int i = m4.f477a;
        if (iBinder == null) {
            l4Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.coolpad.deviceidsupport.IDeviceIdManager");
            l4Var = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof n4)) ? new l4(iBinder) : (n4) iInterfaceQueryLocalInterface;
        }
        if (l4Var == null) {
            throw new e6("IDeviceIdManager is null");
        }
        String packageName = this.f521a.f527a.getPackageName();
        l4 l4Var2 = (l4) l4Var;
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.coolpad.deviceidsupport.IDeviceIdManager");
            parcelObtain.writeString(packageName);
            l4Var2.f474a.transact(2, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readString();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
