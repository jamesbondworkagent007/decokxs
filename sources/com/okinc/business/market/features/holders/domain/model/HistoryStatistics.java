package com.okinc.business.market.features.holders.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class HistoryStatistics implements Parcelable {
    public static final Parcelable.Creator<HistoryStatistics> CREATOR = new Creator();
    public final String AEQbTJ;
    public final String AYXKKw;
    public final String AhwBna;
    public final String AkhnZx;
    public final String AuCTel;
    public final String DbNXlk;
    public final String EZpvd;
    public final String KWHzl;
    public final int OLrzqt;
    public final String copydefault;
    public final String djBIcL;
    public final String ejfBZ;
    public final String fetchVPNInfo;
    public final String gEmmrt;
    public final String isConnected;
    public final String valueOf;
    public final String values;

    public static final class Creator implements Parcelable.Creator<HistoryStatistics> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HistoryStatistics createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new HistoryStatistics(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HistoryStatistics[] newArray(int i) {
            return new HistoryStatistics[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public HistoryStatistics() {
        this(0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131071, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HistoryStatistics KWHzl(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16) {
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
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        return new HistoryStatistics(i, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.AEQbTJ;
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
    public final String djBIcL() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HistoryStatistics)) {
            return false;
        }
        HistoryStatistics historyStatistics = (HistoryStatistics) obj;
        return this.OLrzqt == historyStatistics.OLrzqt && Intrinsics.EZpvd((Object) this.AuCTel, (Object) historyStatistics.AuCTel) && Intrinsics.EZpvd((Object) this.ejfBZ, (Object) historyStatistics.ejfBZ) && Intrinsics.EZpvd((Object) this.gEmmrt, (Object) historyStatistics.gEmmrt) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) historyStatistics.EZpvd) && Intrinsics.EZpvd((Object) this.copydefault, (Object) historyStatistics.copydefault) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) historyStatistics.KWHzl) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) historyStatistics.AEQbTJ) && Intrinsics.EZpvd((Object) this.AkhnZx, (Object) historyStatistics.AkhnZx) && Intrinsics.EZpvd((Object) this.isConnected, (Object) historyStatistics.isConnected) && Intrinsics.EZpvd((Object) this.fetchVPNInfo, (Object) historyStatistics.fetchVPNInfo) && Intrinsics.EZpvd((Object) this.values, (Object) historyStatistics.values) && Intrinsics.EZpvd((Object) this.valueOf, (Object) historyStatistics.valueOf) && Intrinsics.EZpvd((Object) this.DbNXlk, (Object) historyStatistics.DbNXlk) && Intrinsics.EZpvd((Object) this.djBIcL, (Object) historyStatistics.djBIcL) && Intrinsics.EZpvd((Object) this.AYXKKw, (Object) historyStatistics.AYXKKw) && Intrinsics.EZpvd((Object) this.AhwBna, (Object) historyStatistics.AhwBna);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((((((Integer.hashCode(this.OLrzqt) * 31) + this.AuCTel.hashCode()) * 31) + this.ejfBZ.hashCode()) * 31) + this.gEmmrt.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + this.AkhnZx.hashCode()) * 31) + this.isConnected.hashCode()) * 31) + this.fetchVPNInfo.hashCode()) * 31) + this.values.hashCode()) * 31) + this.valueOf.hashCode()) * 31) + this.DbNXlk.hashCode()) * 31) + this.djBIcL.hashCode()) * 31) + this.AYXKKw.hashCode()) * 31) + this.AhwBna.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HistoryStatistics(chainId=" + this.OLrzqt + ", tokenAddress=" + this.AuCTel + ", walletAddress=" + this.ejfBZ + ", lastTradeTime=" + this.gEmmrt + ", buyCount=" + this.EZpvd + ", buyAmount=" + this.copydefault + ", buyValue=" + this.KWHzl + ", boughtAvgPrice=" + this.AEQbTJ + ", sellCount=" + this.AkhnZx + ", sellAmount=" + this.isConnected + ", sellValue=" + this.fetchVPNInfo + ", soldAvgPrice=" + this.values + ", holdAmount=" + this.valueOf + ", maxHoldAmount=" + this.DbNXlk + ", holdVolume=" + this.djBIcL + ", holdAmountPercentage=" + this.AYXKKw + ", explorerUrl=" + this.AhwBna + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.OLrzqt);
        parcel.writeString(this.AuCTel);
        parcel.writeString(this.ejfBZ);
        parcel.writeString(this.gEmmrt);
        parcel.writeString(this.EZpvd);
        parcel.writeString(this.copydefault);
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.AEQbTJ);
        parcel.writeString(this.AkhnZx);
        parcel.writeString(this.isConnected);
        parcel.writeString(this.fetchVPNInfo);
        parcel.writeString(this.values);
        parcel.writeString(this.valueOf);
        parcel.writeString(this.DbNXlk);
        parcel.writeString(this.djBIcL);
        parcel.writeString(this.AYXKKw);
        parcel.writeString(this.AhwBna);
    }

    public HistoryStatistics(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16) {
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
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        this.OLrzqt = i;
        this.AuCTel = str;
        this.ejfBZ = str2;
        this.gEmmrt = str3;
        this.EZpvd = str4;
        this.copydefault = str5;
        this.KWHzl = str6;
        this.AEQbTJ = str7;
        this.AkhnZx = str8;
        this.isConnected = str9;
        this.fetchVPNInfo = str10;
        this.values = str11;
        this.valueOf = str12;
        this.DbNXlk = str13;
        this.djBIcL = str14;
        this.AYXKKw = str15;
        this.AhwBna = str16;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00ba: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0002: ARITH (r36v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r19v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r36v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r36v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r36v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r36v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r36v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r36v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r36v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r36v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r36v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r36v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r36v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r36v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006c: ARITH (r36v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0076: ARITH (r36v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0082: ARITH (r36v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008d: ARITH (r36v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
 A[MD:(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:7) call: com.okinc.business.market.features.holders.domain.model.HistoryStatistics.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ HistoryStatistics(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? "" : str5, (i2 & 64) != 0 ? "" : str6, (i2 & 128) != 0 ? "" : str7, (i2 & 256) != 0 ? "" : str8, (i2 & 512) != 0 ? "" : str9, (i2 & 1024) != 0 ? "" : str10, (i2 & 2048) != 0 ? "" : str11, (i2 & 4096) != 0 ? "" : str12, (i2 & 8192) != 0 ? "" : str13, (i2 & 16384) != 0 ? "" : str14, (i2 & 32768) != 0 ? "" : str15, (i2 & 65536) != 0 ? "" : str16);
    }
}
