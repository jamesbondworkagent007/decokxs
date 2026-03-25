package com.okinc.buysell.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.buysell.api.data.BSCFlowType;
import com.okinc.buysell.api.data.BSCOrderFrequency;
import com.okinc.buysell.api.data.BSCOrderType;
import com.okinc.buysell.api.data.OKPaymentSourceLegacy;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class BSCEntranceParameters implements Parcelable {
    public static final Parcelable.Creator<BSCEntranceParameters> CREATOR = new Creator();
    public final String AEQbTJ;
    public final BSCOrderFrequency AYXKKw;
    public final BSCFlowType AhwBna;
    public final OKPaymentSourceLegacy AkhnZx;
    public final boolean DbNXlk;
    public final BSCDexTokenParameters EZpvd;
    public final String KWHzl;
    public final String OLrzqt;
    public BSCBuySellBaseCurrencyInfo copydefault;
    public final BSCProConvertEntranceParameters djBIcL;
    public final String fIwbmz;
    public final boolean fetchVPNInfo;
    public final String gEmmrt;
    public String isConnected;
    public final BSCOrderType valueOf;
    public final BSCTargetTab values;

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<BSCEntranceParameters> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BSCEntranceParameters createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new BSCEntranceParameters(BSCTargetTab.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : BSCBuySellBaseCurrencyInfo.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), BSCOrderType.valueOf(parcel.readString()), BSCOrderFrequency.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() != 0, OKPaymentSourceLegacy.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : BSCDexTokenParameters.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : BSCProConvertEntranceParameters.CREATOR.createFromParcel(parcel), BSCFlowType.valueOf(parcel.readString()), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BSCEntranceParameters[] newArray(int i) {
            return new BSCEntranceParameters[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BSCEntranceParameters() {
        this(null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, 65535, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BSCOrderFrequency AYXKKw() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AkhnZx() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean DbNXlk() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BSCDexTokenParameters EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BSCEntranceParameters KWHzl(@NotNull BSCTargetTab bSCTargetTab, @NotNull String str, @NotNull String str2, BSCBuySellBaseCurrencyInfo bSCBuySellBaseCurrencyInfo, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull BSCOrderType bSCOrderType, @NotNull BSCOrderFrequency bSCOrderFrequency, @NotNull String str6, boolean z, @NotNull OKPaymentSourceLegacy oKPaymentSourceLegacy, BSCDexTokenParameters bSCDexTokenParameters, BSCProConvertEntranceParameters bSCProConvertEntranceParameters, @NotNull BSCFlowType bSCFlowType, boolean z2) {
        Intrinsics.checkNotNullParameter(bSCTargetTab, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(bSCOrderType, "");
        Intrinsics.checkNotNullParameter(bSCOrderFrequency, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(oKPaymentSourceLegacy, "");
        Intrinsics.checkNotNullParameter(bSCFlowType, "");
        return new BSCEntranceParameters(bSCTargetTab, str, str2, bSCBuySellBaseCurrencyInfo, str3, str4, str5, bSCOrderType, bSCOrderFrequency, str6, z, oKPaymentSourceLegacy, bSCDexTokenParameters, bSCProConvertEntranceParameters, bSCFlowType, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.isConnected = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BSCBuySellBaseCurrencyInfo OLrzqt() {
        return this.copydefault;
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
    public final BSCProConvertEntranceParameters djBIcL() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BSCEntranceParameters)) {
            return false;
        }
        BSCEntranceParameters bSCEntranceParameters = (BSCEntranceParameters) obj;
        return this.values == bSCEntranceParameters.values && Intrinsics.EZpvd((Object) this.KWHzl, (Object) bSCEntranceParameters.KWHzl) && Intrinsics.EZpvd((Object) this.isConnected, (Object) bSCEntranceParameters.isConnected) && Intrinsics.EZpvd(this.copydefault, bSCEntranceParameters.copydefault) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) bSCEntranceParameters.AEQbTJ) && Intrinsics.EZpvd((Object) this.gEmmrt, (Object) bSCEntranceParameters.gEmmrt) && Intrinsics.EZpvd((Object) this.fIwbmz, (Object) bSCEntranceParameters.fIwbmz) && this.valueOf == bSCEntranceParameters.valueOf && this.AYXKKw == bSCEntranceParameters.AYXKKw && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) bSCEntranceParameters.OLrzqt) && this.DbNXlk == bSCEntranceParameters.DbNXlk && this.AkhnZx == bSCEntranceParameters.AkhnZx && Intrinsics.EZpvd(this.EZpvd, bSCEntranceParameters.EZpvd) && Intrinsics.EZpvd(this.djBIcL, bSCEntranceParameters.djBIcL) && this.AhwBna == bSCEntranceParameters.AhwBna && this.fetchVPNInfo == bSCEntranceParameters.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fJNWhG() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BSCTargetTab fetchVPNInfo() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BSCFlowType gEmmrt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.values.hashCode();
        int iHashCode2 = this.KWHzl.hashCode();
        int iHashCode3 = this.isConnected.hashCode();
        BSCBuySellBaseCurrencyInfo bSCBuySellBaseCurrencyInfo = this.copydefault;
        int iHashCode4 = bSCBuySellBaseCurrencyInfo == null ? 0 : bSCBuySellBaseCurrencyInfo.hashCode();
        int iHashCode5 = this.AEQbTJ.hashCode();
        int iHashCode6 = this.gEmmrt.hashCode();
        int iHashCode7 = this.fIwbmz.hashCode();
        int iHashCode8 = this.valueOf.hashCode();
        int iHashCode9 = this.AYXKKw.hashCode();
        int iHashCode10 = this.OLrzqt.hashCode();
        int iHashCode11 = Boolean.hashCode(this.DbNXlk);
        int iHashCode12 = this.AkhnZx.hashCode();
        BSCDexTokenParameters bSCDexTokenParameters = this.EZpvd;
        int iHashCode13 = bSCDexTokenParameters == null ? 0 : bSCDexTokenParameters.hashCode();
        BSCProConvertEntranceParameters bSCProConvertEntranceParameters = this.djBIcL;
        return (((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + (bSCProConvertEntranceParameters != null ? bSCProConvertEntranceParameters.hashCode() : 0)) * 31) + this.AhwBna.hashCode()) * 31) + Boolean.hashCode(this.fetchVPNInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isConnected() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BSCEntranceParameters(targetTab=" + this.values + ", baseCurrency=" + this.KWHzl + ", quoteCurrency=" + this.isConnected + ", bscBuySellBaseCurrencyInfo=" + this.copydefault + ", baseAmount=" + this.AEQbTJ + ", quoteAmount=" + this.gEmmrt + ", topUpCurrency=" + this.fIwbmz + ", orderType=" + this.valueOf + ", frequencyType=" + this.AYXKKw + ", deeplinkFrequency=" + this.OLrzqt + ", showCryptoCoachmark=" + this.DbNXlk + ", source=" + this.AkhnZx + ", dexTokenParameters=" + this.EZpvd + ", proConvertParameters=" + this.djBIcL + ", flowType=" + this.AhwBna + ", showAddAccountToast=" + this.fetchVPNInfo + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BSCOrderType valueOf() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKPaymentSourceLegacy values() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.values.name());
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.isConnected);
        BSCBuySellBaseCurrencyInfo bSCBuySellBaseCurrencyInfo = this.copydefault;
        if (bSCBuySellBaseCurrencyInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bSCBuySellBaseCurrencyInfo.writeToParcel(parcel, i);
        }
        parcel.writeString(this.AEQbTJ);
        parcel.writeString(this.gEmmrt);
        parcel.writeString(this.fIwbmz);
        parcel.writeString(this.valueOf.name());
        parcel.writeString(this.AYXKKw.name());
        parcel.writeString(this.OLrzqt);
        parcel.writeInt(this.DbNXlk ? 1 : 0);
        parcel.writeString(this.AkhnZx.name());
        BSCDexTokenParameters bSCDexTokenParameters = this.EZpvd;
        if (bSCDexTokenParameters == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bSCDexTokenParameters.writeToParcel(parcel, i);
        }
        BSCProConvertEntranceParameters bSCProConvertEntranceParameters = this.djBIcL;
        if (bSCProConvertEntranceParameters == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bSCProConvertEntranceParameters.writeToParcel(parcel, i);
        }
        parcel.writeString(this.AhwBna.name());
        parcel.writeInt(this.fetchVPNInfo ? 1 : 0);
    }

    public BSCEntranceParameters(@NotNull BSCTargetTab bSCTargetTab, @NotNull String str, @NotNull String str2, BSCBuySellBaseCurrencyInfo bSCBuySellBaseCurrencyInfo, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull BSCOrderType bSCOrderType, @NotNull BSCOrderFrequency bSCOrderFrequency, @NotNull String str6, boolean z, @NotNull OKPaymentSourceLegacy oKPaymentSourceLegacy, BSCDexTokenParameters bSCDexTokenParameters, BSCProConvertEntranceParameters bSCProConvertEntranceParameters, @NotNull BSCFlowType bSCFlowType, boolean z2) {
        Intrinsics.checkNotNullParameter(bSCTargetTab, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(bSCOrderType, "");
        Intrinsics.checkNotNullParameter(bSCOrderFrequency, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(oKPaymentSourceLegacy, "");
        Intrinsics.checkNotNullParameter(bSCFlowType, "");
        this.values = bSCTargetTab;
        this.KWHzl = str;
        this.isConnected = str2;
        this.copydefault = bSCBuySellBaseCurrencyInfo;
        this.AEQbTJ = str3;
        this.gEmmrt = str4;
        this.fIwbmz = str5;
        this.valueOf = bSCOrderType;
        this.AYXKKw = bSCOrderFrequency;
        this.OLrzqt = str6;
        this.DbNXlk = z;
        this.AkhnZx = oKPaymentSourceLegacy;
        this.EZpvd = bSCDexTokenParameters;
        this.djBIcL = bSCProConvertEntranceParameters;
        this.AhwBna = bSCFlowType;
        this.fetchVPNInfo = z2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00ad: CONSTRUCTOR 
  (wrap:com.okinc.buysell.api.BSCTargetTab:?: TERNARY null = ((wrap:int:0x0002: ARITH (r34v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0006: SGET  A[WRAPPED] (LINE:200) com.okinc.buysell.api.BSCTargetTab.BUY com.okinc.buysell.api.BSCTargetTab) : (r18v0 com.okinc.buysell.api.BSCTargetTab))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r34v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r34v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:com.okinc.buysell.api.BSCBuySellBaseCurrencyInfo:?: TERNARY null = ((wrap:int:0x001d: ARITH (r34v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.buysell.api.BSCBuySellBaseCurrencyInfo) : (r21v0 com.okinc.buysell.api.BSCBuySellBaseCurrencyInfo))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r34v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r34v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0035: ARITH (r34v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:com.okinc.buysell.api.data.BSCOrderType:?: TERNARY null = ((wrap:int:0x003d: ARITH (r34v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0041: SGET  A[WRAPPED] (LINE:207) com.okinc.buysell.api.data.BSCOrderType.ONE_TIME com.okinc.buysell.api.data.BSCOrderType) : (r25v0 com.okinc.buysell.api.data.BSCOrderType))
  (wrap:com.okinc.buysell.api.data.BSCOrderFrequency:?: TERNARY null = ((wrap:int:0x0046: ARITH (r34v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x004a: SGET  A[WRAPPED] (LINE:208) com.okinc.buysell.api.data.BSCOrderFrequency.NO_FREQ com.okinc.buysell.api.data.BSCOrderFrequency) : (r26v0 com.okinc.buysell.api.data.BSCOrderFrequency))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004f: ARITH (r34v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r27v0 java.lang.String) : (""))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0056: ARITH (r34v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? false : (r28v0 boolean))
  (wrap:com.okinc.buysell.api.data.OKPaymentSourceLegacy:?: TERNARY null = ((wrap:int:0x005e: ARITH (r34v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0062: SGET  A[WRAPPED] (LINE:211) com.okinc.buysell.api.data.OKPaymentSourceLegacy.PAYMENT_INTERNAL_FLOW com.okinc.buysell.api.data.OKPaymentSourceLegacy) : (r29v0 com.okinc.buysell.api.data.OKPaymentSourceLegacy))
  (wrap:com.okinc.buysell.api.BSCDexTokenParameters:?: TERNARY null = ((wrap:int:0x0067: ARITH (r34v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.buysell.api.BSCDexTokenParameters) : (r30v0 com.okinc.buysell.api.BSCDexTokenParameters))
  (wrap:com.okinc.buysell.api.BSCProConvertEntranceParameters:?: TERNARY null = ((wrap:int:0x006f: ARITH (r34v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.buysell.api.BSCProConvertEntranceParameters) : (r31v0 com.okinc.buysell.api.BSCProConvertEntranceParameters))
  (wrap:com.okinc.buysell.api.data.BSCFlowType:?: TERNARY null = ((wrap:int:0x0077: ARITH (r34v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x007b: SGET  A[WRAPPED] (LINE:214) com.okinc.buysell.api.data.BSCFlowType.ONSHORE com.okinc.buysell.api.data.BSCFlowType) : (r32v0 com.okinc.buysell.api.data.BSCFlowType))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0083: ARITH (r34v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? false : (r33v0 boolean))
 A[MD:(com.okinc.buysell.api.BSCTargetTab, java.lang.String, java.lang.String, com.okinc.buysell.api.BSCBuySellBaseCurrencyInfo, java.lang.String, java.lang.String, java.lang.String, com.okinc.buysell.api.data.BSCOrderType, com.okinc.buysell.api.data.BSCOrderFrequency, java.lang.String, boolean, com.okinc.buysell.api.data.OKPaymentSourceLegacy, com.okinc.buysell.api.BSCDexTokenParameters, com.okinc.buysell.api.BSCProConvertEntranceParameters, com.okinc.buysell.api.data.BSCFlowType, boolean):void (m)] (LINE:199) call: com.okinc.buysell.api.BSCEntranceParameters.<init>(com.okinc.buysell.api.BSCTargetTab, java.lang.String, java.lang.String, com.okinc.buysell.api.BSCBuySellBaseCurrencyInfo, java.lang.String, java.lang.String, java.lang.String, com.okinc.buysell.api.data.BSCOrderType, com.okinc.buysell.api.data.BSCOrderFrequency, java.lang.String, boolean, com.okinc.buysell.api.data.OKPaymentSourceLegacy, com.okinc.buysell.api.BSCDexTokenParameters, com.okinc.buysell.api.BSCProConvertEntranceParameters, com.okinc.buysell.api.data.BSCFlowType, boolean):void type: THIS */
    public /* synthetic */ BSCEntranceParameters(BSCTargetTab bSCTargetTab, String str, String str2, BSCBuySellBaseCurrencyInfo bSCBuySellBaseCurrencyInfo, String str3, String str4, String str5, BSCOrderType bSCOrderType, BSCOrderFrequency bSCOrderFrequency, String str6, boolean z, OKPaymentSourceLegacy oKPaymentSourceLegacy, BSCDexTokenParameters bSCDexTokenParameters, BSCProConvertEntranceParameters bSCProConvertEntranceParameters, BSCFlowType bSCFlowType, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? BSCTargetTab.BUY : bSCTargetTab, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? null : bSCBuySellBaseCurrencyInfo, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? "" : str5, (i & 128) != 0 ? BSCOrderType.ONE_TIME : bSCOrderType, (i & 256) != 0 ? BSCOrderFrequency.NO_FREQ : bSCOrderFrequency, (i & 512) == 0 ? str6 : "", (i & 1024) != 0 ? false : z, (i & 2048) != 0 ? OKPaymentSourceLegacy.PAYMENT_INTERNAL_FLOW : oKPaymentSourceLegacy, (i & 4096) != 0 ? null : bSCDexTokenParameters, (i & 8192) != 0 ? null : bSCProConvertEntranceParameters, (i & 16384) != 0 ? BSCFlowType.ONSHORE : bSCFlowType, (i & 32768) != 0 ? false : z2);
    }
}
