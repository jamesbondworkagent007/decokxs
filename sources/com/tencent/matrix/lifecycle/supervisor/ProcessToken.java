package com.tencent.matrix.lifecycle.supervisor;

import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.RemoteException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C58014ytL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class ProcessToken implements Parcelable {
    public final String AEQbTJ;
    public final int EZpvd;
    public final IBinder KWHzl;
    public final boolean OLrzqt;
    public final String copydefault;
    public static final ActionBar Companion = new ActionBar(null);
    public static final Parcelable.Creator<ProcessToken> CREATOR = new Parcelable.Creator<ProcessToken>() { // from class: com.tencent.matrix.lifecycle.supervisor.ProcessToken$Companion$CREATOR$1
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ProcessToken createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ProcessToken(parcel);
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ProcessToken[] newArray(int i) {
            return new ProcessToken[i];
        }
    };

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.AEQbTJ;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.tencent.matrix.lifecycle.supervisor.ProcessToken.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public static /* synthetic */ ProcessToken current$default(ActionBar actionBar, Context context, String str, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                str = "";
            }
            if ((i & 4) != 0) {
                z = false;
            }
            return actionBar.EZpvd(context, str, z);
        }

        public final ProcessToken EZpvd(@NotNull Context context, @NotNull String str, boolean z) throws Throwable {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            int iMyPid = Process.myPid();
            String strOLrzqt = C58014ytL.OLrzqt(context);
            Intrinsics.checkNotNullExpressionValue(strOLrzqt, "");
            return new ProcessToken(iMyPid, strOLrzqt, str, z);
        }
    }

    public ProcessToken(int i, @NotNull String str, @NotNull String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.KWHzl = new Binder();
        this.EZpvd = i;
        this.copydefault = str;
        this.AEQbTJ = str2;
        this.OLrzqt = z;
    }

    public ProcessToken(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "");
        IBinder strongBinder = parcel.readStrongBinder();
        Intrinsics.checkNotNullExpressionValue(strongBinder, "");
        this.KWHzl = strongBinder;
        this.EZpvd = parcel.readInt();
        String string = parcel.readString();
        this.copydefault = string == null ? "" : string;
        String string2 = parcel.readString();
        this.AEQbTJ = string2 != null ? string2 : "";
        this.OLrzqt = parcel.readInt() != 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeStrongBinder(this.KWHzl);
        parcel.writeInt(this.EZpvd);
        parcel.writeString(this.copydefault);
        parcel.writeString(this.AEQbTJ);
        parcel.writeInt(this.OLrzqt ? 1 : 0);
    }

    public final void copydefault(@NotNull IBinder.DeathRecipient deathRecipient) throws RemoteException {
        Intrinsics.checkNotNullParameter(deathRecipient, "");
        this.KWHzl.linkToDeath(deathRecipient, 0);
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ProcessToken)) {
            return false;
        }
        ProcessToken processToken = (ProcessToken) obj;
        return Intrinsics.EZpvd((Object) this.copydefault, (Object) processToken.copydefault) && this.EZpvd == processToken.EZpvd;
    }

    public int hashCode() {
        return (this.EZpvd * 31) + this.copydefault.hashCode();
    }

    public String toString() {
        return "ProcessToken(pid=" + this.EZpvd + ", name='" + this.copydefault + "', statefulName = " + this.AEQbTJ + ", state = " + this.OLrzqt + ')';
    }
}
