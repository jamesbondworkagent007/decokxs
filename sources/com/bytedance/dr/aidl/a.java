package com.bytedance.dr.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes2.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: com.bytedance.dr.aidl.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0187a extends Binder implements a {

        /* JADX INFO: renamed from: com.bytedance.dr.aidl.a$a$a, reason: collision with other inner class name */
        public static class C0188a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f316a;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public C0188a(IBinder iBinder) {
                this.f316a = iBinder;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f316a;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static a a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof a)) ? new C0188a(iBinder) : (a) iInterfaceQueryLocalInterface;
        }
    }
}
