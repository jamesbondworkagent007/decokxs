package com.okinc.core.util.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33070mpX;
import o.mAQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class ScanConfig implements Parcelable {
    public static final Parcelable.Creator<ScanConfig> CREATOR = new Creator();
    public final boolean AEQbTJ;
    public final String AYXKKw;
    public final String AhwBna;
    public final String DbNXlk;
    public final String EZpvd;
    public final boolean KWHzl;
    public final boolean OLrzqt;
    public final boolean copydefault;
    public final MyCodeLanding djBIcL;
    public final boolean gEmmrt;
    public final ScanViewType valueOf;
    public final String values;

    public static final class Creator implements Parcelable.Creator<ScanConfig> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ScanConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ScanConfig(parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, ScanViewType.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, MyCodeLanding.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ScanConfig[] newArray(int i) {
            return new ScanConfig[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ScanConfig() {
        this(false, null, null, null, null, false, null, false, false, null, false, null, 4095, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AhwBna() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean DbNXlk() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ScanViewType KWHzl() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MyCodeLanding OLrzqt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ScanConfig OLrzqt(boolean z, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z2, String str5, boolean z3, boolean z4, @NotNull ScanViewType scanViewType, boolean z5, @NotNull MyCodeLanding myCodeLanding) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(scanViewType, "");
        Intrinsics.checkNotNullParameter(myCodeLanding, "");
        return new ScanConfig(z, str, str2, str3, str4, z2, str5, z3, z4, scanViewType, z5, myCodeLanding);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.AYXKKw;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean djBIcL() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScanConfig)) {
            return false;
        }
        ScanConfig scanConfig = (ScanConfig) obj;
        return this.AEQbTJ == scanConfig.AEQbTJ && Intrinsics.EZpvd((Object) this.values, (Object) scanConfig.values) && Intrinsics.EZpvd((Object) this.DbNXlk, (Object) scanConfig.DbNXlk) && Intrinsics.EZpvd((Object) this.AYXKKw, (Object) scanConfig.AYXKKw) && Intrinsics.EZpvd((Object) this.AhwBna, (Object) scanConfig.AhwBna) && this.copydefault == scanConfig.copydefault && Intrinsics.EZpvd((Object) this.EZpvd, (Object) scanConfig.EZpvd) && this.OLrzqt == scanConfig.OLrzqt && this.gEmmrt == scanConfig.gEmmrt && this.valueOf == scanConfig.valueOf && this.KWHzl == scanConfig.KWHzl && this.djBIcL == scanConfig.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean gEmmrt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.AEQbTJ);
        int iHashCode2 = this.values.hashCode();
        int iHashCode3 = this.DbNXlk.hashCode();
        int iHashCode4 = this.AYXKKw.hashCode();
        int iHashCode5 = this.AhwBna.hashCode();
        int iHashCode6 = Boolean.hashCode(this.copydefault);
        String str = this.EZpvd;
        return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.OLrzqt)) * 31) + Boolean.hashCode(this.gEmmrt)) * 31) + this.valueOf.hashCode()) * 31) + Boolean.hashCode(this.KWHzl)) * 31) + this.djBIcL.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ScanConfig(isAlbumShow=" + this.AEQbTJ + ", titleString=" + this.values + ", subTitleString=" + this.DbNXlk + ", scanDescString=" + this.AYXKKw + ", scanErrorString=" + this.AhwBna + ", isContinuousScan=" + this.copydefault + ", customViewExtensionName=" + this.EZpvd + ", isActivityResult=" + this.OLrzqt + ", isShowPayQRCode=" + this.gEmmrt + ", scanViewType=" + this.valueOf + ", isE2E=" + this.KWHzl + ", myCodeLanding=" + this.djBIcL + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean values() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.AEQbTJ ? 1 : 0);
        parcel.writeString(this.values);
        parcel.writeString(this.DbNXlk);
        parcel.writeString(this.AYXKKw);
        parcel.writeString(this.AhwBna);
        parcel.writeInt(this.copydefault ? 1 : 0);
        parcel.writeString(this.EZpvd);
        parcel.writeInt(this.OLrzqt ? 1 : 0);
        parcel.writeInt(this.gEmmrt ? 1 : 0);
        this.valueOf.writeToParcel(parcel, i);
        parcel.writeInt(this.KWHzl ? 1 : 0);
        this.djBIcL.writeToParcel(parcel, i);
    }

    public ScanConfig(boolean z, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z2, String str5, boolean z3, boolean z4, @NotNull ScanViewType scanViewType, boolean z5, @NotNull MyCodeLanding myCodeLanding) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(scanViewType, "");
        Intrinsics.checkNotNullParameter(myCodeLanding, "");
        this.AEQbTJ = z;
        this.values = str;
        this.DbNXlk = str2;
        this.AYXKKw = str3;
        this.AhwBna = str4;
        this.copydefault = z2;
        this.EZpvd = str5;
        this.OLrzqt = z3;
        this.gEmmrt = z4;
        this.valueOf = scanViewType;
        this.KWHzl = z5;
        this.djBIcL = myCodeLanding;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x008a: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r26v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? true : (r14v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r26v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0010: INVOKE (wrap:int:0x000e: SGET  A[WRAPPED] o.mAQ.Activity.EZpvd int) STATIC call: o.mpX.AYXKKw(int):java.lang.String A[MD:(int):java.lang.String (m), WRAPPED] (LINE:12)) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r26v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r26v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0025: INVOKE (wrap:int:0x0023: SGET  A[WRAPPED] o.mAQ.Activity.OLrzqt int) STATIC call: o.mpX.AYXKKw(int):java.lang.String A[MD:(int):java.lang.String (m), WRAPPED] (LINE:14)) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r26v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0032: INVOKE (wrap:int:0x0030: SGET  A[WRAPPED] o.mAQ.Activity.AhwBna int) STATIC call: o.mpX.AYXKKw(int):java.lang.String A[MD:(int):java.lang.String (m), WRAPPED] (LINE:15)) : (r18v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0039: ARITH (r26v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r19v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0042: ARITH (r26v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x004a: ARITH (r26v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? false : (r21v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0052: ARITH (r26v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r22v0 boolean) : true)
  (wrap:com.okinc.core.util.model.ScanViewType:?: TERNARY null = ((wrap:int:0x0059: ARITH (r26v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x005d: SGET  A[WRAPPED] (LINE:20) com.okinc.core.util.model.ScanViewType.CAMERA com.okinc.core.util.model.ScanViewType) : (r23v0 com.okinc.core.util.model.ScanViewType))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0062: ARITH (r26v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r24v0 boolean) : false)
  (wrap:com.okinc.core.util.model.MyCodeLanding:?: TERNARY null = ((wrap:int:0x0069: ARITH (r26v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x006d: SGET  A[WRAPPED] (LINE:22) com.okinc.core.util.model.MyCodeLanding.IM_FIRST com.okinc.core.util.model.MyCodeLanding) : (r25v0 com.okinc.core.util.model.MyCodeLanding))
 A[MD:(boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, boolean, boolean, com.okinc.core.util.model.ScanViewType, boolean, com.okinc.core.util.model.MyCodeLanding):void (m)] (LINE:10) call: com.okinc.core.util.model.ScanConfig.<init>(boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, boolean, boolean, com.okinc.core.util.model.ScanViewType, boolean, com.okinc.core.util.model.MyCodeLanding):void type: THIS */
    public /* synthetic */ ScanConfig(boolean z, String str, String str2, String str3, String str4, boolean z2, String str5, boolean z3, boolean z4, ScanViewType scanViewType, boolean z5, MyCodeLanding myCodeLanding, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? C33070mpX.AYXKKw(mAQ.Activity.EZpvd) : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? C33070mpX.AYXKKw(mAQ.Activity.OLrzqt) : str3, (i & 16) != 0 ? C33070mpX.AYXKKw(mAQ.Activity.AhwBna) : str4, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? false : z3, (i & 256) == 0 ? z4 : true, (i & 512) != 0 ? ScanViewType.CAMERA : scanViewType, (i & 1024) == 0 ? z5 : false, (i & 2048) != 0 ? MyCodeLanding.IM_FIRST : myCodeLanding);
    }
}
