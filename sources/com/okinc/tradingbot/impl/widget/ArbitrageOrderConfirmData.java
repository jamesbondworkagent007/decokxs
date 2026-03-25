package com.okinc.tradingbot.impl.widget;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class ArbitrageOrderConfirmData implements Parcelable {
    public static final Parcelable.Creator<ArbitrageOrderConfirmData> CREATOR = new Creator();
    public boolean AEQbTJ;
    public String AYXKKw;
    public String AhwBna;
    public boolean AkhnZx;
    public String DbNXlk;
    public String EZpvd;
    public String KWHzl;
    public String OLrzqt;
    public String copydefault;
    public Integer djBIcL;
    public String fARcdN;
    public Integer fIwbmz;
    public String fJNWhG;
    public Boolean fetchVPNInfo;
    public String gEmmrt;
    public Pair<String, String> isConnected;
    public String valueOf;
    public String values;

    public static final class Creator implements Parcelable.Creator<ArbitrageOrderConfirmData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ArbitrageOrderConfirmData createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            Pair pair = (Pair) parcel.readSerializable();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            String string11 = parcel.readString();
            boolean z2 = parcel.readInt() != 0;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ArbitrageOrderConfirmData(string, string2, string3, string4, string5, string6, string7, pair, string8, string9, string10, z, string11, z2, numValueOf, numValueOf2, boolValueOf, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ArbitrageOrderConfirmData[] newArray(int i) {
            return new ArbitrageOrderConfirmData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ArbitrageOrderConfirmData() {
        this(null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, 262143, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer AhwBna() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AkhnZx() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String DbNXlk() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArbitrageOrderConfirmData OLrzqt(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, Pair<String, String> pair, @NotNull String str8, @NotNull String str9, @NotNull String str10, boolean z, @NotNull String str11, boolean z2, Integer num, Integer num2, Boolean bool, String str12) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        return new ArbitrageOrderConfirmData(str, str2, str3, str4, str5, str6, str7, pair, str8, str9, str10, z, str11, z2, num, num2, bool, str12);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.KWHzl;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Pair<String, String> djBIcL() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ArbitrageOrderConfirmData)) {
            return false;
        }
        ArbitrageOrderConfirmData arbitrageOrderConfirmData = (ArbitrageOrderConfirmData) obj;
        return Intrinsics.EZpvd((Object) this.AYXKKw, (Object) arbitrageOrderConfirmData.AYXKKw) && Intrinsics.EZpvd((Object) this.copydefault, (Object) arbitrageOrderConfirmData.copydefault) && Intrinsics.EZpvd((Object) this.gEmmrt, (Object) arbitrageOrderConfirmData.gEmmrt) && Intrinsics.EZpvd((Object) this.AhwBna, (Object) arbitrageOrderConfirmData.AhwBna) && Intrinsics.EZpvd((Object) this.DbNXlk, (Object) arbitrageOrderConfirmData.DbNXlk) && Intrinsics.EZpvd((Object) this.values, (Object) arbitrageOrderConfirmData.values) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) arbitrageOrderConfirmData.KWHzl) && Intrinsics.EZpvd(this.isConnected, arbitrageOrderConfirmData.isConnected) && Intrinsics.EZpvd((Object) this.fJNWhG, (Object) arbitrageOrderConfirmData.fJNWhG) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) arbitrageOrderConfirmData.EZpvd) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) arbitrageOrderConfirmData.OLrzqt) && this.AkhnZx == arbitrageOrderConfirmData.AkhnZx && Intrinsics.EZpvd((Object) this.fARcdN, (Object) arbitrageOrderConfirmData.fARcdN) && this.AEQbTJ == arbitrageOrderConfirmData.AEQbTJ && Intrinsics.EZpvd(this.fIwbmz, arbitrageOrderConfirmData.fIwbmz) && Intrinsics.EZpvd(this.djBIcL, arbitrageOrderConfirmData.djBIcL) && Intrinsics.EZpvd(this.fetchVPNInfo, arbitrageOrderConfirmData.fetchVPNInfo) && Intrinsics.EZpvd((Object) this.valueOf, (Object) arbitrageOrderConfirmData.valueOf);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fetchVPNInfo() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AYXKKw.hashCode();
        int iHashCode2 = this.copydefault.hashCode();
        int iHashCode3 = this.gEmmrt.hashCode();
        int iHashCode4 = this.AhwBna.hashCode();
        int iHashCode5 = this.DbNXlk.hashCode();
        int iHashCode6 = this.values.hashCode();
        int iHashCode7 = this.KWHzl.hashCode();
        Pair<String, String> pair = this.isConnected;
        int iHashCode8 = pair == null ? 0 : pair.hashCode();
        int iHashCode9 = this.fJNWhG.hashCode();
        int iHashCode10 = this.EZpvd.hashCode();
        int iHashCode11 = this.OLrzqt.hashCode();
        int iHashCode12 = Boolean.hashCode(this.AkhnZx);
        int iHashCode13 = this.fARcdN.hashCode();
        int iHashCode14 = Boolean.hashCode(this.AEQbTJ);
        Integer num = this.fIwbmz;
        int iHashCode15 = num == null ? 0 : num.hashCode();
        Integer num2 = this.djBIcL;
        int iHashCode16 = num2 == null ? 0 : num2.hashCode();
        Boolean bool = this.fetchVPNInfo;
        int iHashCode17 = bool == null ? 0 : bool.hashCode();
        String str = this.valueOf;
        return (((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isConnected() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ArbitrageOrderConfirmData(coinName=" + this.AYXKKw + ", coinIcon=" + this.copydefault + ", leverage=" + this.gEmmrt + ", mgnMode=" + this.AhwBna + ", side=" + this.DbNXlk + ", sideDes=" + this.values + ", amount=" + this.KWHzl + ", price=" + this.isConnected + ", unit=" + this.fJNWhG + ", amountUnit=" + this.EZpvd + ", balance=" + this.OLrzqt + ", showSpotLevel=" + this.AkhnZx + ", valueUnit=" + this.fARcdN + ", auto=" + this.AEQbTJ + ", takerRange=" + this.fIwbmz + ", makerRange=" + this.djBIcL + ", showCoinNameMargin=" + this.fetchVPNInfo + ", coinNameMargin=" + this.valueOf + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer values() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.AYXKKw);
        parcel.writeString(this.copydefault);
        parcel.writeString(this.gEmmrt);
        parcel.writeString(this.AhwBna);
        parcel.writeString(this.DbNXlk);
        parcel.writeString(this.values);
        parcel.writeString(this.KWHzl);
        parcel.writeSerializable(this.isConnected);
        parcel.writeString(this.fJNWhG);
        parcel.writeString(this.EZpvd);
        parcel.writeString(this.OLrzqt);
        parcel.writeInt(this.AkhnZx ? 1 : 0);
        parcel.writeString(this.fARcdN);
        parcel.writeInt(this.AEQbTJ ? 1 : 0);
        Integer num = this.fIwbmz;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.djBIcL;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Boolean bool = this.fetchVPNInfo;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.valueOf);
    }

    public ArbitrageOrderConfirmData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, Pair<String, String> pair, @NotNull String str8, @NotNull String str9, @NotNull String str10, boolean z, @NotNull String str11, boolean z2, Integer num, Integer num2, Boolean bool, String str12) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        this.AYXKKw = str;
        this.copydefault = str2;
        this.gEmmrt = str3;
        this.AhwBna = str4;
        this.DbNXlk = str5;
        this.values = str6;
        this.KWHzl = str7;
        this.isConnected = pair;
        this.fJNWhG = str8;
        this.EZpvd = str9;
        this.OLrzqt = str10;
        this.AkhnZx = z;
        this.fARcdN = str11;
        this.AEQbTJ = z2;
        this.fIwbmz = num;
        this.djBIcL = num2;
        this.fetchVPNInfo = bool;
        this.valueOf = str12;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00c2: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r38v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r38v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r38v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r38v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r38v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r38v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r38v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:kotlin.Pair:?: TERNARY null = ((wrap:int:0x003c: ARITH (r38v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null kotlin.Pair) : (r27v0 kotlin.Pair))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r38v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r38v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r38v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x005c: ARITH (r38v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? false : (r31v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0065: ARITH (r38v0 int) & (4096 int) A[WRAPPED]) == (0 int)) ? (r32v0 java.lang.String) : (""))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x006c: ARITH (r38v0 int) & (8192 int) A[WRAPPED]) == (0 int)) ? (r33v0 boolean) : false)
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0073: ARITH (r38v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r34v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x007e: ARITH (r38v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r35v0 java.lang.Integer))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0089: ARITH (r38v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r36v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0094: ARITH (r38v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r37v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlin.Pair<java.lang.String, java.lang.String>, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, boolean, java.lang.Integer, java.lang.Integer, java.lang.Boolean, java.lang.String):void (m)] (LINE:114) call: com.okinc.tradingbot.impl.widget.ArbitrageOrderConfirmData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlin.Pair, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, boolean, java.lang.Integer, java.lang.Integer, java.lang.Boolean, java.lang.String):void type: THIS */
    public /* synthetic */ ArbitrageOrderConfirmData(String str, String str2, String str3, String str4, String str5, String str6, String str7, Pair pair, String str8, String str9, String str10, boolean z, String str11, boolean z2, Integer num, Integer num2, Boolean bool, String str12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? null : pair, (i & 256) != 0 ? "" : str8, (i & 512) != 0 ? "" : str9, (i & 1024) != 0 ? "" : str10, (i & 2048) != 0 ? false : z, (i & 4096) == 0 ? str11 : "", (i & 8192) == 0 ? z2 : false, (i & 16384) != 0 ? null : num, (i & 32768) != 0 ? null : num2, (i & 65536) != 0 ? null : bool, (i & 131072) != 0 ? null : str12);
    }
}
