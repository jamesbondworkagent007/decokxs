package com.bytedance.dr.impl;

import android.os.IBinder;
import android.os.Parcel;
import android.util.Pair;
import com.bytedance.bdtracker.c6;
import com.bytedance.dr.aidl.a;

/* JADX INFO: loaded from: classes2.dex */
public class a implements c6.b<com.bytedance.dr.aidl.a, Pair<String, Boolean>> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public a(b bVar) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object a(IBinder iBinder) {
        return a.AbstractBinderC0187a.a(iBinder);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public Object a(Object obj) {
        com.bytedance.dr.aidl.a aVar = (com.bytedance.dr.aidl.a) obj;
        if (aVar == null) {
            return null;
        }
        a.AbstractBinderC0187a.C0188a c0188a = (a.AbstractBinderC0187a.C0188a) aVar;
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
            c0188a.f316a.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            String string = parcelObtain2.readString();
            parcelObtain2.recycle();
            parcelObtain.recycle();
            parcelObtain = Parcel.obtain();
            parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                c0188a.f316a.transact(2, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                boolean z = parcelObtain2.readInt() != 0;
                parcelObtain2.recycle();
                parcelObtain.recycle();
                return new Pair(string, Boolean.valueOf(z));
            } finally {
            }
        } finally {
        }
    }
}
