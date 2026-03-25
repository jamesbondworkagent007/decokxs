package o;

import android.os.Parcelable;
import com.tencent.matrix.util.MemInfo;

/* JADX INFO: renamed from: o.ysN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public interface InterfaceC57963ysN extends android.os.IInterface {
    void EZpvd(java.lang.String str, java.lang.String str2, int i) throws android.os.RemoteException;

    void EZpvd(java.lang.String str, java.lang.String str2, int i, boolean z) throws android.os.RemoteException;

    void OLrzqt(java.lang.String str, java.lang.String str2, boolean z) throws android.os.RemoteException;

    MemInfo copydefault() throws android.os.RemoteException;

    /* JADX INFO: renamed from: o.ysN$StateListAnimator */
    public static abstract class StateListAnimator extends android.os.Binder implements InterfaceC57963ysN {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }

        public StateListAnimator() {
            attachInterface(this, "com.tencent.matrix.lifecycle.supervisor.ISubordinateProxy");
        }

        public static InterfaceC57963ysN EZpvd(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.tencent.matrix.lifecycle.supervisor.ISubordinateProxy");
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof InterfaceC57963ysN)) {
                return (InterfaceC57963ysN) iInterfaceQueryLocalInterface;
            }
            return new Application(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.tencent.matrix.lifecycle.supervisor.ISubordinateProxy");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.tencent.matrix.lifecycle.supervisor.ISubordinateProxy");
                return true;
            }
            if (i == 1) {
                OLrzqt(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
                parcel2.writeNoException();
            } else if (i == 2) {
                EZpvd(parcel.readString(), parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
            } else if (i == 3) {
                EZpvd(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() != 0);
                parcel2.writeNoException();
            } else if (i == 4) {
                MemInfo memInfoCopydefault = copydefault();
                parcel2.writeNoException();
                ActionBar.copydefault(parcel2, memInfoCopydefault, 1);
            } else {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            return true;
        }

        /* JADX INFO: renamed from: o.ysN$StateListAnimator$Application */
        /* JADX INFO: loaded from: classes17.dex */
        public static class Application implements InterfaceC57963ysN {
            public android.os.IBinder AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.AEQbTJ;
            }

            public Application(android.os.IBinder iBinder) {
                this.AEQbTJ = iBinder;
            }

            @Override // o.InterfaceC57963ysN
            public void OLrzqt(java.lang.String str, java.lang.String str2, boolean z) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.tencent.matrix.lifecycle.supervisor.ISubordinateProxy");
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.AEQbTJ.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // o.InterfaceC57963ysN
            public void EZpvd(java.lang.String str, java.lang.String str2, int i) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.tencent.matrix.lifecycle.supervisor.ISubordinateProxy");
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeInt(i);
                    this.AEQbTJ.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // o.InterfaceC57963ysN
            public void EZpvd(java.lang.String str, java.lang.String str2, int i, boolean z) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.tencent.matrix.lifecycle.supervisor.ISubordinateProxy");
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.AEQbTJ.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // o.InterfaceC57963ysN
            public MemInfo copydefault() throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.tencent.matrix.lifecycle.supervisor.ISubordinateProxy");
                    this.AEQbTJ.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (MemInfo) ActionBar.AEQbTJ(parcelObtain2, MemInfo.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.ysN$ActionBar */
    /* JADX INFO: loaded from: classes17.dex */
    public static class ActionBar {
        public static <T> T AEQbTJ(android.os.Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        public static <T extends android.os.Parcelable> void copydefault(android.os.Parcel parcel, T t, int i) {
            if (t != null) {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            } else {
                parcel.writeInt(0);
            }
        }
    }
}
