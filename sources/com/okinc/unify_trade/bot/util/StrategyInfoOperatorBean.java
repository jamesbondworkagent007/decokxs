package com.okinc.unify_trade.bot.util;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class StrategyInfoOperatorBean implements Parcelable {
    public static final Parcelable.Creator<StrategyInfoOperatorBean> CREATOR = new Creator();
    public final String AEQbTJ;
    public final String AYXKKw;
    public final String AhwBna;
    public final String AkhnZx;
    public final String DbNXlk;
    public final String EZpvd;
    public final String KWHzl;
    public final ArrayList<String> OLrzqt;
    public final String copydefault;
    public final boolean djBIcL;
    public final String fetchVPNInfo;
    public final boolean gEmmrt;
    public final int isConnected;
    public final boolean valueOf;
    public final boolean values;

    public static final class Creator implements Parcelable.Creator<StrategyInfoOperatorBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StrategyInfoOperatorBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new StrategyInfoOperatorBean(parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0, parcel.createStringArrayList());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StrategyInfoOperatorBean[] newArray(int i) {
            return new StrategyInfoOperatorBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public StrategyInfoOperatorBean() {
        this(false, null, null, null, null, null, null, null, null, 0, false, false, null, false, null, 32767, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AYXKKw() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AhwBna() {
        return this.isConnected == 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AkhnZx() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<String> EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyInfoOperatorBean OLrzqt(boolean z, String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, String str6, String str7, String str8, int i, boolean z2, boolean z3, @NotNull String str9, boolean z4, ArrayList<String> arrayList) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str9, "");
        return new StrategyInfoOperatorBean(z, str, str2, str3, str4, str5, str6, str7, str8, i, z2, z3, str9, z4, arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.AhwBna;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StrategyInfoOperatorBean)) {
            return false;
        }
        StrategyInfoOperatorBean strategyInfoOperatorBean = (StrategyInfoOperatorBean) obj;
        return this.valueOf == strategyInfoOperatorBean.valueOf && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) strategyInfoOperatorBean.AEQbTJ) && Intrinsics.EZpvd((Object) this.AhwBna, (Object) strategyInfoOperatorBean.AhwBna) && Intrinsics.EZpvd((Object) this.fetchVPNInfo, (Object) strategyInfoOperatorBean.fetchVPNInfo) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) strategyInfoOperatorBean.KWHzl) && Intrinsics.EZpvd((Object) this.copydefault, (Object) strategyInfoOperatorBean.copydefault) && Intrinsics.EZpvd((Object) this.AYXKKw, (Object) strategyInfoOperatorBean.AYXKKw) && Intrinsics.EZpvd((Object) this.DbNXlk, (Object) strategyInfoOperatorBean.DbNXlk) && Intrinsics.EZpvd((Object) this.AkhnZx, (Object) strategyInfoOperatorBean.AkhnZx) && this.isConnected == strategyInfoOperatorBean.isConnected && this.values == strategyInfoOperatorBean.values && this.gEmmrt == strategyInfoOperatorBean.gEmmrt && Intrinsics.EZpvd((Object) this.EZpvd, (Object) strategyInfoOperatorBean.EZpvd) && this.djBIcL == strategyInfoOperatorBean.djBIcL && Intrinsics.EZpvd(this.OLrzqt, strategyInfoOperatorBean.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean fetchVPNInfo() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean gEmmrt() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.valueOf);
        String str = this.AEQbTJ;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        int iHashCode3 = this.AhwBna.hashCode();
        int iHashCode4 = this.fetchVPNInfo.hashCode();
        int iHashCode5 = this.KWHzl.hashCode();
        int iHashCode6 = this.copydefault.hashCode();
        String str2 = this.AYXKKw;
        int iHashCode7 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.DbNXlk;
        int iHashCode8 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.AkhnZx;
        int iHashCode9 = str4 == null ? 0 : str4.hashCode();
        int iHashCode10 = Integer.hashCode(this.isConnected);
        int iHashCode11 = Boolean.hashCode(this.values);
        int iHashCode12 = Boolean.hashCode(this.gEmmrt);
        int iHashCode13 = this.EZpvd.hashCode();
        int iHashCode14 = Boolean.hashCode(this.djBIcL);
        ArrayList<String> arrayList = this.OLrzqt;
        return (((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + (arrayList == null ? 0 : arrayList.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "StrategyInfoOperatorBean(isHistory=" + this.valueOf + ", copyType=" + this.AEQbTJ + ", ordType=" + this.AhwBna + ", state=" + this.fetchVPNInfo + ", instType=" + this.KWHzl + ", instId=" + this.copydefault + ", profit=" + this.AYXKKw + ", status=" + this.DbNXlk + ", tradeSide=" + this.AkhnZx + ", source=" + this.isConnected + ", supportEarlyFill=" + this.values + ", isContractGridPosition=" + this.gEmmrt + ", dcdState=" + this.EZpvd + ", isReInvestment=" + this.djBIcL + ", forbidden=" + this.OLrzqt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.valueOf ? 1 : 0);
        parcel.writeString(this.AEQbTJ);
        parcel.writeString(this.AhwBna);
        parcel.writeString(this.fetchVPNInfo);
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.copydefault);
        parcel.writeString(this.AYXKKw);
        parcel.writeString(this.DbNXlk);
        parcel.writeString(this.AkhnZx);
        parcel.writeInt(this.isConnected);
        parcel.writeInt(this.values ? 1 : 0);
        parcel.writeInt(this.gEmmrt ? 1 : 0);
        parcel.writeString(this.EZpvd);
        parcel.writeInt(this.djBIcL ? 1 : 0);
        parcel.writeStringList(this.OLrzqt);
    }

    public StrategyInfoOperatorBean(boolean z, String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, String str6, String str7, String str8, int i, boolean z2, boolean z3, @NotNull String str9, boolean z4, ArrayList<String> arrayList) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str9, "");
        this.valueOf = z;
        this.AEQbTJ = str;
        this.AhwBna = str2;
        this.fetchVPNInfo = str3;
        this.KWHzl = str4;
        this.copydefault = str5;
        this.AYXKKw = str6;
        this.DbNXlk = str7;
        this.AkhnZx = str8;
        this.isConnected = i;
        this.values = z2;
        this.gEmmrt = z3;
        this.EZpvd = str9;
        this.djBIcL = z4;
        this.OLrzqt = arrayList;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x009b: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r32v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r17v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r32v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r32v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r32v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r32v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r32v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0036: ARITH (r32v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003e: ARITH (r32v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0046: ARITH (r32v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r25v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x004e: ARITH (r32v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r26v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0056: ARITH (r32v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? false : (r27v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x005e: ARITH (r32v0 int) & (2048 int) A[WRAPPED]) == (0 int)) ? (r28v0 boolean) : false)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0065: ARITH (r32v0 int) & (4096 int) A[WRAPPED]) == (0 int)) ? (r29v0 java.lang.String) : (""))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x006c: ARITH (r32v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? true : (r30v0 boolean))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0074: ARITH (r32v0 int) & (16384 int) A[WRAPPED]) == (0 int)) ? (r31v0 java.util.ArrayList) : (null java.util.ArrayList))
 A[MD:(boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, boolean, boolean, java.lang.String, boolean, java.util.ArrayList<java.lang.String>):void (m)] (LINE:993) call: com.okinc.unify_trade.bot.util.StrategyInfoOperatorBean.<init>(boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, boolean, boolean, java.lang.String, boolean, java.util.ArrayList):void type: THIS */
    public /* synthetic */ StrategyInfoOperatorBean(boolean z, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, boolean z2, boolean z3, String str9, boolean z4, ArrayList arrayList, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? "" : str5, (i2 & 64) != 0 ? null : str6, (i2 & 128) != 0 ? null : str7, (i2 & 256) != 0 ? null : str8, (i2 & 512) != 0 ? 0 : i, (i2 & 1024) != 0 ? false : z2, (i2 & 2048) == 0 ? z3 : false, (i2 & 4096) == 0 ? str9 : "", (i2 & 8192) != 0 ? true : z4, (i2 & 16384) == 0 ? arrayList : null);
    }
}
