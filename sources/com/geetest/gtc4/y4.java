package com.geetest.gtc4;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes21.dex */
public final class y4 implements z4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IBinder f539a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public y4(IBinder iBinder) {
        this.f539a = iBinder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.z4
    public final String a(String str, String str2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.heytap.openid.IOpenID");
            parcelObtain.writeString(str);
            parcelObtain.writeString(str2);
            parcelObtain.writeString("OUID");
            if (!this.f539a.transact(1, parcelObtain, parcelObtain2, 0)) {
                int i = e5.f441a;
            }
            parcelObtain2.readException();
            return parcelObtain2.readString();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f539a;
    }
}
