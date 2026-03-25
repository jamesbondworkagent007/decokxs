package com.geetest.gtc4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes21.dex */
public final class e4 implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IBinder f440a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public e4(IBinder iBinder) {
        this.f440a = iBinder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String a() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                if (!TextUtils.isEmpty(null)) {
                    parcelObtain.writeString(null);
                }
                if (!TextUtils.isEmpty(null)) {
                    parcelObtain.writeString(null);
                }
                if (!TextUtils.isEmpty(null)) {
                    parcelObtain.writeString(null);
                }
                this.f440a.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readString();
            } catch (Throwable unused) {
                parcelObtain.recycle();
                parcelObtain2.recycle();
                return "";
            }
        } catch (Exception unused2) {
            return "";
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f440a;
    }
}
