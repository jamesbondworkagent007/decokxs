package com.tencent.matrix.util;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C56529yIt;
import o.C57911yrO;
import o.C57958ysI;
import o.C57968ysS;
import o.C58001ysz;
import o.C58014ytL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class ProcessInfo implements Parcelable {
    public static final CREATOR CREATOR = new CREATOR(null);
    public final boolean AEQbTJ;
    public final int EZpvd;
    public final String KWHzl;
    public final String OLrzqt;
    public final boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ProcessInfo() {
        this(0, null, null, false, false, 31, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ProcessInfo copy$default(ProcessInfo processInfo, int i, String str, String str2, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = processInfo.EZpvd;
        }
        if ((i2 & 2) != 0) {
            str = processInfo.OLrzqt;
        }
        String str3 = str;
        if ((i2 & 4) != 0) {
            str2 = processInfo.KWHzl;
        }
        String str4 = str2;
        if ((i2 & 8) != 0) {
            z = processInfo.copydefault;
        }
        boolean z3 = z;
        if ((i2 & 16) != 0) {
            z2 = processInfo.AEQbTJ;
        }
        return processInfo.EZpvd(i, str3, str4, z3, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProcessInfo EZpvd(int i, @NotNull String str, @NotNull String str2, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new ProcessInfo(i, str, str2, z, z2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProcessInfo)) {
            return false;
        }
        ProcessInfo processInfo = (ProcessInfo) obj;
        return this.EZpvd == processInfo.EZpvd && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) processInfo.OLrzqt) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) processInfo.KWHzl) && this.copydefault == processInfo.copydefault && this.AEQbTJ == processInfo.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [int] */
    /* JADX WARN: Type inference failed for: r4v2 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.EZpvd);
        int iHashCode2 = this.OLrzqt.hashCode();
        int iHashCode3 = this.KWHzl.hashCode();
        boolean z = this.copydefault;
        ?? r3 = z;
        if (z) {
            r3 = 1;
        }
        boolean z2 = this.AEQbTJ;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + r3) * 31) + (z2 ? 1 : z2);
    }

    public ProcessInfo(int i, @NotNull String str, @NotNull String str2, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.EZpvd = i;
        this.OLrzqt = str;
        this.KWHzl = str2;
        this.copydefault = z;
        this.AEQbTJ = z2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ProcessInfo(int i, String str, String str2, boolean z, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) throws Throwable {
        i = (i2 & 1) != 0 ? Process.myPid() : i;
        if ((i2 & 2) != 0) {
            str = C58014ytL.OLrzqt(C57911yrO.EZpvd().KWHzl());
            Intrinsics.checkNotNullExpressionValue(str, "");
        }
        this(i, str, (i2 & 4) != 0 ? StringsKt__StringsKt.substringAfterLast$default(C58001ysz.AEQbTJ.values(), '.', (String) null, 2, (Object) null) : str2, (i2 & 8) != 0 ? C57958ysI.AEQbTJ.AEQbTJ() : z, (i2 & 16) != 0 ? C57968ysS.KWHzl.djBIcL() : z2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ProcessInfo(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "");
        int i = parcel.readInt();
        String string = parcel.readString();
        String str = string == null ? "default" : string;
        String string2 = parcel.readString();
        this(i, str, string2 == null ? "default" : string2, parcel.readByte() != 0, parcel.readByte() != 0);
    }

    public String toString() {
        C56529yIt c56529yIt = C56529yIt.KWHzl;
        String str = String.format("%-21s\t%-21s %-21s %-21s %-21s", Arrays.copyOf(new Object[]{this.OLrzqt, "Activity=" + this.KWHzl, "AppForeground=" + this.AEQbTJ, "ProcessForeground=" + this.copydefault, "Pid=" + this.EZpvd}, 5));
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.EZpvd);
        parcel.writeString(this.OLrzqt);
        parcel.writeString(this.KWHzl);
        parcel.writeByte(this.copydefault ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.AEQbTJ ? (byte) 1 : (byte) 0);
    }

    public static final class CREATOR implements Parcelable.Creator<ProcessInfo> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.tencent.matrix.util.ProcessInfo.CREATOR.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ProcessInfo createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ProcessInfo(parcel);
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ProcessInfo[] newArray(int i) {
            return new ProcessInfo[i];
        }
    }
}
