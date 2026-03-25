package com.okinc.tradingbot.impl.order.strategy.spotdca.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class SpotDcaEditParam implements Parcelable {
    public static final Parcelable.Creator<SpotDcaEditParam> CREATOR = new Creator();
    public final String AEQbTJ;
    public final SpotDcaAdvancedParams AYXKKw;
    public final String AhwBna;
    public final String AkhnZx;
    public final SpotDcaAdvancedParams DbNXlk;
    public final String EZpvd;
    public final String KWHzl;
    public final String OLrzqt;
    public final String copydefault;
    public final String djBIcL;
    public final String gEmmrt;
    public final boolean isConnected;
    public final String valueOf;
    public final String values;

    public static final class Creator implements Parcelable.Creator<SpotDcaEditParam> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SpotDcaEditParam createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SpotDcaEditParam(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : SpotDcaAdvancedParams.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? SpotDcaAdvancedParams.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SpotDcaEditParam[] newArray(int i) {
            return new SpotDcaEditParam[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SpotDcaEditParam() {
        this(null, null, null, null, null, null, null, null, false, null, null, null, null, null, 16383, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SpotDcaAdvancedParams AhwBna() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SpotDcaAdvancedParams DbNXlk() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SpotDcaEditParam copydefault(String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, String str6, String str7, String str8, boolean z, SpotDcaAdvancedParams spotDcaAdvancedParams, SpotDcaAdvancedParams spotDcaAdvancedParams2, @NotNull String str9, @NotNull String str10, String str11) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        return new SpotDcaEditParam(str, str2, str3, str4, str5, str6, str7, str8, z, spotDcaAdvancedParams, spotDcaAdvancedParams2, str9, str10, str11);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.OLrzqt;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpotDcaEditParam)) {
            return false;
        }
        SpotDcaEditParam spotDcaEditParam = (SpotDcaEditParam) obj;
        return Intrinsics.EZpvd((Object) this.KWHzl, (Object) spotDcaEditParam.KWHzl) && Intrinsics.EZpvd((Object) this.valueOf, (Object) spotDcaEditParam.valueOf) && Intrinsics.EZpvd((Object) this.AkhnZx, (Object) spotDcaEditParam.AkhnZx) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) spotDcaEditParam.AEQbTJ) && Intrinsics.EZpvd((Object) this.values, (Object) spotDcaEditParam.values) && Intrinsics.EZpvd((Object) this.AhwBna, (Object) spotDcaEditParam.AhwBna) && Intrinsics.EZpvd((Object) this.copydefault, (Object) spotDcaEditParam.copydefault) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) spotDcaEditParam.OLrzqt) && this.isConnected == spotDcaEditParam.isConnected && Intrinsics.EZpvd(this.DbNXlk, spotDcaEditParam.DbNXlk) && Intrinsics.EZpvd(this.AYXKKw, spotDcaEditParam.AYXKKw) && Intrinsics.EZpvd((Object) this.djBIcL, (Object) spotDcaEditParam.djBIcL) && Intrinsics.EZpvd((Object) this.gEmmrt, (Object) spotDcaEditParam.gEmmrt) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) spotDcaEditParam.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fetchVPNInfo() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.KWHzl;
        int iHashCode = str == null ? 0 : str.hashCode();
        int iHashCode2 = this.valueOf.hashCode();
        int iHashCode3 = this.AkhnZx.hashCode();
        int iHashCode4 = this.AEQbTJ.hashCode();
        int iHashCode5 = this.values.hashCode();
        String str2 = this.AhwBna;
        int iHashCode6 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.copydefault;
        int iHashCode7 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.OLrzqt;
        int iHashCode8 = str4 == null ? 0 : str4.hashCode();
        int iHashCode9 = Boolean.hashCode(this.isConnected);
        SpotDcaAdvancedParams spotDcaAdvancedParams = this.DbNXlk;
        int iHashCode10 = spotDcaAdvancedParams == null ? 0 : spotDcaAdvancedParams.hashCode();
        SpotDcaAdvancedParams spotDcaAdvancedParams2 = this.AYXKKw;
        int iHashCode11 = spotDcaAdvancedParams2 == null ? 0 : spotDcaAdvancedParams2.hashCode();
        int iHashCode12 = this.djBIcL.hashCode();
        int iHashCode13 = this.gEmmrt.hashCode();
        String str5 = this.EZpvd;
        return (((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isConnected() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SpotDcaEditParam(algoId=" + this.KWHzl + ", pxSteps=" + this.valueOf + ", tpPct=" + this.AkhnZx + ", initOrdAmt=" + this.AEQbTJ + ", safetyOrdAmt=" + this.values + ", maxSafetyOrds=" + this.AhwBna + ", curUsageAmt=" + this.copydefault + ", maxPotentialUsageAmt=" + this.OLrzqt + ", reserveFunds=" + this.isConnected + ", spotDcaAdvancedParams=" + this.DbNXlk + ", preAdvancedParams=" + this.AYXKKw + ", preCurrentInvestment=" + this.djBIcL + ", preMaxInvestment=" + this.gEmmrt + ", additionalFunds=" + this.EZpvd + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean values() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.valueOf);
        parcel.writeString(this.AkhnZx);
        parcel.writeString(this.AEQbTJ);
        parcel.writeString(this.values);
        parcel.writeString(this.AhwBna);
        parcel.writeString(this.copydefault);
        parcel.writeString(this.OLrzqt);
        parcel.writeInt(this.isConnected ? 1 : 0);
        SpotDcaAdvancedParams spotDcaAdvancedParams = this.DbNXlk;
        if (spotDcaAdvancedParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            spotDcaAdvancedParams.writeToParcel(parcel, i);
        }
        SpotDcaAdvancedParams spotDcaAdvancedParams2 = this.AYXKKw;
        if (spotDcaAdvancedParams2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            spotDcaAdvancedParams2.writeToParcel(parcel, i);
        }
        parcel.writeString(this.djBIcL);
        parcel.writeString(this.gEmmrt);
        parcel.writeString(this.EZpvd);
    }

    public SpotDcaEditParam(String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, String str6, String str7, String str8, boolean z, SpotDcaAdvancedParams spotDcaAdvancedParams, SpotDcaAdvancedParams spotDcaAdvancedParams2, @NotNull String str9, @NotNull String str10, String str11) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        this.KWHzl = str;
        this.valueOf = str2;
        this.AkhnZx = str3;
        this.AEQbTJ = str4;
        this.values = str5;
        this.AhwBna = str6;
        this.copydefault = str7;
        this.OLrzqt = str8;
        this.isConnected = z;
        this.DbNXlk = spotDcaAdvancedParams;
        this.AYXKKw = spotDcaAdvancedParams2;
        this.djBIcL = str9;
        this.gEmmrt = str10;
        this.EZpvd = str11;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0091: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r30v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r30v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r30v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r30v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r30v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r30v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0035: ARITH (r30v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003d: ARITH (r30v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0045: ARITH (r30v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? false : (r24v0 boolean))
  (wrap:com.okinc.tradingbot.impl.order.strategy.spotdca.model.SpotDcaAdvancedParams:?: TERNARY null = ((wrap:int:0x004d: ARITH (r30v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.tradingbot.impl.order.strategy.spotdca.model.SpotDcaAdvancedParams) : (r25v0 com.okinc.tradingbot.impl.order.strategy.spotdca.model.SpotDcaAdvancedParams))
  (wrap:com.okinc.tradingbot.impl.order.strategy.spotdca.model.SpotDcaAdvancedParams:?: TERNARY null = ((wrap:int:0x0055: ARITH (r30v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r26v0 com.okinc.tradingbot.impl.order.strategy.spotdca.model.SpotDcaAdvancedParams) : (null com.okinc.tradingbot.impl.order.strategy.spotdca.model.SpotDcaAdvancedParams))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r30v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r30v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006c: ARITH (r30v0 int) & (8192 int) A[WRAPPED]) == (0 int)) ? (r29v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, com.okinc.tradingbot.impl.order.strategy.spotdca.model.SpotDcaAdvancedParams, com.okinc.tradingbot.impl.order.strategy.spotdca.model.SpotDcaAdvancedParams, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:29) call: com.okinc.tradingbot.impl.order.strategy.spotdca.model.SpotDcaEditParam.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, com.okinc.tradingbot.impl.order.strategy.spotdca.model.SpotDcaAdvancedParams, com.okinc.tradingbot.impl.order.strategy.spotdca.model.SpotDcaAdvancedParams, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SpotDcaEditParam(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, SpotDcaAdvancedParams spotDcaAdvancedParams, SpotDcaAdvancedParams spotDcaAdvancedParams2, String str9, String str10, String str11, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? false : z, (i & 512) != 0 ? null : spotDcaAdvancedParams, (i & 1024) == 0 ? spotDcaAdvancedParams2 : null, (i & 2048) != 0 ? "" : str9, (i & 4096) != 0 ? "" : str10, (i & 8192) == 0 ? str11 : "");
    }
}
