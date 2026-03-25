package com.tencent.matrix.util;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.matrix.util.PssInfo;
import com.tencent.matrix.util.StatusInfo;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C58008ytF;
import o.C59442zhC;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes17.dex */
public final class MemInfo implements Parcelable {
    public C58008ytF AEQbTJ;
    public SystemInfo AYXKKw;
    public JavaMemInfo EZpvd;
    public PssInfo KWHzl;
    public long OLrzqt;
    public PssInfo copydefault;
    public StatusInfo djBIcL;
    public NativeMemInfo gEmmrt;
    public ProcessInfo valueOf;
    public static final Activity Companion = new Activity(null);
    public static final Parcelable.Creator<MemInfo> CREATOR = new Parcelable.Creator<MemInfo>() { // from class: com.tencent.matrix.util.MemInfo$Companion$CREATOR$1
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MemInfo createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new MemInfo(parcel);
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MemInfo[] newArray(int i) {
            return new MemInfo[i];
        }
    };

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MemInfo() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MemInfo EZpvd(ProcessInfo processInfo, StatusInfo statusInfo, JavaMemInfo javaMemInfo, NativeMemInfo nativeMemInfo, SystemInfo systemInfo, PssInfo pssInfo, PssInfo pssInfo2, C58008ytF c58008ytF) {
        return new MemInfo(processInfo, statusInfo, javaMemInfo, nativeMemInfo, systemInfo, pssInfo, pssInfo2, c58008ytF);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(long j) {
        this.OLrzqt = j;
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
        if (!(obj instanceof MemInfo)) {
            return false;
        }
        MemInfo memInfo = (MemInfo) obj;
        return Intrinsics.EZpvd(this.valueOf, memInfo.valueOf) && Intrinsics.EZpvd(this.djBIcL, memInfo.djBIcL) && Intrinsics.EZpvd(this.EZpvd, memInfo.EZpvd) && Intrinsics.EZpvd(this.gEmmrt, memInfo.gEmmrt) && Intrinsics.EZpvd(this.AYXKKw, memInfo.AYXKKw) && Intrinsics.EZpvd(this.copydefault, memInfo.copydefault) && Intrinsics.EZpvd(this.KWHzl, memInfo.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, memInfo.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        ProcessInfo processInfo = this.valueOf;
        int iHashCode = processInfo == null ? 0 : processInfo.hashCode();
        StatusInfo statusInfo = this.djBIcL;
        int iHashCode2 = statusInfo == null ? 0 : statusInfo.hashCode();
        JavaMemInfo javaMemInfo = this.EZpvd;
        int iHashCode3 = javaMemInfo == null ? 0 : javaMemInfo.hashCode();
        NativeMemInfo nativeMemInfo = this.gEmmrt;
        int iHashCode4 = nativeMemInfo == null ? 0 : nativeMemInfo.hashCode();
        SystemInfo systemInfo = this.AYXKKw;
        int iHashCode5 = systemInfo == null ? 0 : systemInfo.hashCode();
        PssInfo pssInfo = this.copydefault;
        int iHashCode6 = pssInfo == null ? 0 : pssInfo.hashCode();
        PssInfo pssInfo2 = this.KWHzl;
        int iHashCode7 = pssInfo2 == null ? 0 : pssInfo2.hashCode();
        C58008ytF c58008ytF = this.AEQbTJ;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (c58008ytF != null ? c58008ytF.hashCode() : 0);
    }

    public MemInfo(ProcessInfo processInfo, StatusInfo statusInfo, JavaMemInfo javaMemInfo, NativeMemInfo nativeMemInfo, SystemInfo systemInfo, PssInfo pssInfo, PssInfo pssInfo2, C58008ytF c58008ytF) {
        this.valueOf = processInfo;
        this.djBIcL = statusInfo;
        this.EZpvd = javaMemInfo;
        this.gEmmrt = nativeMemInfo;
        this.AYXKKw = systemInfo;
        this.copydefault = pssInfo;
        this.KWHzl = pssInfo2;
        this.AEQbTJ = c58008ytF;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.tencent.matrix.util.StatusInfo.Activity.get$default(com.tencent.matrix.util.StatusInfo$Activity, int, int, java.lang.Object):com.tencent.matrix.util.StatusInfo */
    public /* synthetic */ MemInfo(ProcessInfo processInfo, StatusInfo statusInfo, JavaMemInfo javaMemInfo, NativeMemInfo nativeMemInfo, SystemInfo systemInfo, PssInfo pssInfo, PssInfo pssInfo2, C58008ytF c58008ytF, int i, DefaultConstructorMarker defaultConstructorMarker) {
        C58008ytF c58008ytF2;
        ProcessInfo processInfo2 = (i & 1) != 0 ? new ProcessInfo(0, null, null, false, false, 31, null) : processInfo;
        List list = null;
        byte b = 0;
        int i2 = 1;
        StatusInfo statusInfo2 = (i & 2) != 0 ? StatusInfo.Activity.get$default(StatusInfo.Companion, 0, 1, null) : statusInfo;
        JavaMemInfo javaMemInfo2 = (i & 4) != 0 ? new JavaMemInfo(0L, 0L, 0L, 0L, 0, 0, 63, null) : javaMemInfo;
        NativeMemInfo nativeMemInfo2 = (i & 8) != 0 ? new NativeMemInfo(0L, 0L, 0L, 7, null) : nativeMemInfo;
        SystemInfo systemInfoEZpvd = (i & 16) != 0 ? SystemInfo.Companion.EZpvd() : systemInfo;
        PssInfo pssInfo3 = (i & 32) != 0 ? null : pssInfo;
        PssInfo pssInfo4 = (i & 64) != 0 ? null : pssInfo2;
        if ((i & 128) != 0) {
            c58008ytF2 = new C58008ytF(list, i2, b == true ? 1 : 0);
        } else {
            c58008ytF2 = c58008ytF;
        }
        this(processInfo2, statusInfo2, javaMemInfo2, nativeMemInfo2, systemInfoEZpvd, pssInfo3, pssInfo4, c58008ytF2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MemInfo(@NotNull Parcel parcel) {
        this((ProcessInfo) parcel.readParcelable(ProcessInfo.class.getClassLoader()), (StatusInfo) parcel.readParcelable(StatusInfo.class.getClassLoader()), (JavaMemInfo) parcel.readParcelable(JavaMemInfo.class.getClassLoader()), (NativeMemInfo) parcel.readParcelable(NativeMemInfo.class.getClassLoader()), (SystemInfo) parcel.readParcelable(SystemInfo.class.getClassLoader()), (PssInfo) parcel.readParcelable(PssInfo.class.getClassLoader()), (PssInfo) parcel.readParcelable(PssInfo.class.getClassLoader()), null);
        Intrinsics.checkNotNullParameter(parcel, "");
        this.OLrzqt = parcel.readLong();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('\n');
        sb.append(C59442zhC.fJNWhG("\n                |>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> MemInfo <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<\n                |> Process   : " + this.valueOf + "\n                |> Status    : " + this.djBIcL + "\n                |> SystemInfo: " + this.AYXKKw + "\n                |> Java      : " + this.EZpvd + "\n                |> Native    : " + this.gEmmrt + "\n                |> Dbg-Pss   : " + this.KWHzl + "\n                |> AMS-Pss   : " + this.copydefault + "\n                |> FgService : " + this.AEQbTJ + "\n                |>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<\n            "));
        String str = "\n";
        if (this.OLrzqt > 0) {
            str = "\n| cost : " + this.OLrzqt;
        }
        sb.append(str);
        return sb.toString();
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.tencent.matrix.util.MemInfo.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final MemInfo OLrzqt() {
            long jCurrentTimeMillis = System.currentTimeMillis();
            PssInfo.Activity activity = PssInfo.Companion;
            MemInfo memInfo = new MemInfo(null, null, null, null, null, activity.KWHzl(), activity.copydefault(), null, CipherSuite.TLS_DHE_RSA_WITH_AES_256_GCM_SHA384, null);
            memInfo.copydefault(System.currentTimeMillis() - jCurrentTimeMillis);
            return memInfo;
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeParcelable(this.valueOf, i);
        parcel.writeParcelable(this.djBIcL, i);
        parcel.writeParcelable(this.EZpvd, i);
        parcel.writeParcelable(this.gEmmrt, i);
        parcel.writeParcelable(this.AYXKKw, i);
        parcel.writeParcelable(this.copydefault, i);
        parcel.writeParcelable(this.KWHzl, i);
        parcel.writeLong(this.OLrzqt);
    }
}
