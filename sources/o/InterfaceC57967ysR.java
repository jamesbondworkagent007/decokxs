package o;

import android.os.Parcelable;
import com.tencent.matrix.lifecycle.supervisor.ProcessToken;
import o.InterfaceC57963ysN;

/* JADX INFO: renamed from: o.ysR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public interface InterfaceC57967ysR extends android.os.IInterface {
    void EZpvd(ProcessToken processToken) throws android.os.RemoteException;

    void EZpvd(ProcessToken[] processTokenArr, InterfaceC57963ysN interfaceC57963ysN) throws android.os.RemoteException;

    java.lang.String KWHzl() throws android.os.RemoteException;

    void KWHzl(ProcessToken processToken) throws android.os.RemoteException;

    void KWHzl(java.lang.String str) throws android.os.RemoteException;

    void OLrzqt(ProcessToken processToken) throws android.os.RemoteException;

    void copydefault(ProcessToken processToken) throws android.os.RemoteException;

    /* JADX INFO: renamed from: o.ysR$StateListAnimator */
    public static abstract class StateListAnimator extends android.os.Binder implements InterfaceC57967ysR {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }

        public StateListAnimator() {
            attachInterface(this, "com.tencent.matrix.lifecycle.supervisor.ISupervisorProxy");
        }

        public static InterfaceC57967ysR AEQbTJ(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.tencent.matrix.lifecycle.supervisor.ISupervisorProxy");
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof InterfaceC57967ysR)) {
                return (InterfaceC57967ysR) iInterfaceQueryLocalInterface;
            }
            return new Activity(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.tencent.matrix.lifecycle.supervisor.ISupervisorProxy");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.tencent.matrix.lifecycle.supervisor.ISupervisorProxy");
                return true;
            }
            switch (i) {
                case 1:
                    EZpvd((ProcessToken[]) parcel.createTypedArray(ProcessToken.CREATOR), InterfaceC57963ysN.StateListAnimator.EZpvd(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 2:
                    KWHzl((ProcessToken) Application.AEQbTJ(parcel, ProcessToken.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 3:
                    KWHzl(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 4:
                    EZpvd((ProcessToken) Application.AEQbTJ(parcel, ProcessToken.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    OLrzqt((ProcessToken) Application.AEQbTJ(parcel, ProcessToken.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    copydefault((ProcessToken) Application.AEQbTJ(parcel, ProcessToken.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 7:
                    java.lang.String strKWHzl = KWHzl();
                    parcel2.writeNoException();
                    parcel2.writeString(strKWHzl);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        /* JADX INFO: renamed from: o.ysR$StateListAnimator$Activity */
        public static class Activity implements InterfaceC57967ysR {
            public android.os.IBinder AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.AEQbTJ;
            }

            public Activity(android.os.IBinder iBinder) {
                this.AEQbTJ = iBinder;
            }

            @Override // o.InterfaceC57967ysR
            public void EZpvd(ProcessToken[] processTokenArr, InterfaceC57963ysN interfaceC57963ysN) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.tencent.matrix.lifecycle.supervisor.ISupervisorProxy");
                    parcelObtain.writeTypedArray(processTokenArr, 0);
                    parcelObtain.writeStrongInterface(interfaceC57963ysN);
                    this.AEQbTJ.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // o.InterfaceC57967ysR
            public void KWHzl(ProcessToken processToken) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.tencent.matrix.lifecycle.supervisor.ISupervisorProxy");
                    Application.EZpvd(parcelObtain, processToken, 0);
                    this.AEQbTJ.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // o.InterfaceC57967ysR
            public void KWHzl(java.lang.String str) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.tencent.matrix.lifecycle.supervisor.ISupervisorProxy");
                    parcelObtain.writeString(str);
                    this.AEQbTJ.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // o.InterfaceC57967ysR
            public void EZpvd(ProcessToken processToken) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.tencent.matrix.lifecycle.supervisor.ISupervisorProxy");
                    Application.EZpvd(parcelObtain, processToken, 0);
                    this.AEQbTJ.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // o.InterfaceC57967ysR
            public void OLrzqt(ProcessToken processToken) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.tencent.matrix.lifecycle.supervisor.ISupervisorProxy");
                    Application.EZpvd(parcelObtain, processToken, 0);
                    this.AEQbTJ.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // o.InterfaceC57967ysR
            public void copydefault(ProcessToken processToken) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.tencent.matrix.lifecycle.supervisor.ISupervisorProxy");
                    Application.EZpvd(parcelObtain, processToken, 0);
                    this.AEQbTJ.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // o.InterfaceC57967ysR
            public java.lang.String KWHzl() throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.tencent.matrix.lifecycle.supervisor.ISupervisorProxy");
                    this.AEQbTJ.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.ysR$Application */
    public static class Application {
        public static <T> T AEQbTJ(android.os.Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        public static <T extends android.os.Parcelable> void EZpvd(android.os.Parcel parcel, T t, int i) {
            if (t != null) {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            } else {
                parcel.writeInt(0);
            }
        }
    }
}
