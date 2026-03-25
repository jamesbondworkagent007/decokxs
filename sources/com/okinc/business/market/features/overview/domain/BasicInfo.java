package com.okinc.business.market.features.overview.domain;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class BasicInfo implements Parcelable {
    public static final Parcelable.Creator<BasicInfo> CREATOR = new Creator();
    public final String AEQbTJ;
    public final String AYXKKw;
    public final String AhwBna;
    public final String AkhnZx;
    public final String EZpvd;
    public final boolean KWHzl;
    public final String OLrzqt;
    public final String copydefault;
    public final boolean djBIcL;
    public final boolean gEmmrt;
    public final String valueOf;

    public static final class Creator implements Parcelable.Creator<BasicInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BasicInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new BasicInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BasicInfo[] newArray(int i) {
            return new BasicInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BasicInfo() {
        this(null, null, null, null, null, false, false, false, null, null, null, 2047, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AYXKKw() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BasicInfo copydefault(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, boolean z, boolean z2, boolean z3, @NotNull String str6, @NotNull String str7, @NotNull String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        return new BasicInfo(str, str2, str3, str4, str5, z, z2, z3, str6, str7, str8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.valueOf;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean djBIcL() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BasicInfo)) {
            return false;
        }
        BasicInfo basicInfo = (BasicInfo) obj;
        return Intrinsics.EZpvd((Object) this.AkhnZx, (Object) basicInfo.AkhnZx) && Intrinsics.EZpvd((Object) this.AYXKKw, (Object) basicInfo.AYXKKw) && Intrinsics.EZpvd((Object) this.AhwBna, (Object) basicInfo.AhwBna) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) basicInfo.OLrzqt) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) basicInfo.AEQbTJ) && this.KWHzl == basicInfo.KWHzl && this.gEmmrt == basicInfo.gEmmrt && this.djBIcL == basicInfo.djBIcL && Intrinsics.EZpvd((Object) this.EZpvd, (Object) basicInfo.EZpvd) && Intrinsics.EZpvd((Object) this.valueOf, (Object) basicInfo.valueOf) && Intrinsics.EZpvd((Object) this.copydefault, (Object) basicInfo.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((this.AkhnZx.hashCode() * 31) + this.AYXKKw.hashCode()) * 31) + this.AhwBna.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + Boolean.hashCode(this.KWHzl)) * 31) + Boolean.hashCode(this.gEmmrt)) * 31) + Boolean.hashCode(this.djBIcL)) * 31) + this.EZpvd.hashCode()) * 31) + this.valueOf.hashCode()) * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BasicInfo(tokenSymbol=" + this.AkhnZx + ", tokenName=" + this.AYXKKw + ", tokenContractAddress=" + this.AhwBna + ", chainName=" + this.OLrzqt + ", chainLogoUrl=" + this.AEQbTJ + ", isNativeToken=" + this.KWHzl + ", isStableCoin=" + this.gEmmrt + ", isStockToken=" + this.djBIcL + ", devCreateTokenCount=" + this.EZpvd + ", launchedTokenCount=" + this.valueOf + ", description=" + this.copydefault + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean values() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.AkhnZx);
        parcel.writeString(this.AYXKKw);
        parcel.writeString(this.AhwBna);
        parcel.writeString(this.OLrzqt);
        parcel.writeString(this.AEQbTJ);
        parcel.writeInt(this.KWHzl ? 1 : 0);
        parcel.writeInt(this.gEmmrt ? 1 : 0);
        parcel.writeInt(this.djBIcL ? 1 : 0);
        parcel.writeString(this.EZpvd);
        parcel.writeString(this.valueOf);
        parcel.writeString(this.copydefault);
    }

    public BasicInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, boolean z, boolean z2, boolean z3, @NotNull String str6, @NotNull String str7, @NotNull String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        this.AkhnZx = str;
        this.AYXKKw = str2;
        this.AhwBna = str3;
        this.OLrzqt = str4;
        this.AEQbTJ = str5;
        this.KWHzl = z;
        this.gEmmrt = z2;
        this.djBIcL = z3;
        this.EZpvd = str6;
        this.valueOf = str7;
        this.copydefault = str8;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x006d: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r24v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r24v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r24v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r24v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0021: ARITH (r24v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0029: ARITH (r24v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r18v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0032: ARITH (r24v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r19v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x003a: ARITH (r24v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r20v0 boolean) : false)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0041: ARITH (r24v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0049: ARITH (r24v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0051: ARITH (r24v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r23v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:56) call: com.okinc.business.market.features.overview.domain.BasicInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ BasicInfo(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3, String str6, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? false : z, (i & 64) != 0 ? false : z2, (i & 128) == 0 ? z3 : false, (i & 256) != 0 ? "" : str6, (i & 512) != 0 ? "" : str7, (i & 1024) == 0 ? str8 : "");
    }
}
