package com.okinc.okx.paymentapi.service;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okpaymentapi.data.remote.model.management.OrderFrequency;
import com.okinc.okpaymentapi.data.remote.model.management.OrderType;
import com.okinc.okpaymentapi.data.remote.model.management.TradeType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class BuySellInputPageParameters implements Parcelable {
    public static final Parcelable.Creator<BuySellInputPageParameters> CREATOR = new Creator();
    public String AEQbTJ;
    public String AYXKKw;
    public boolean AhwBna;
    public TradeType AkhnZx;
    public String EZpvd;
    public String KWHzl;
    public final OrderFrequency OLrzqt;
    public BuySellBaseCurrencyInfo copydefault;
    public final OrderType djBIcL;
    public String gEmmrt;
    public final String isConnected;
    public String valueOf;
    public final OKPaymentSource values;

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<BuySellInputPageParameters> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BuySellInputPageParameters createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new BuySellInputPageParameters(TradeType.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : BuySellBaseCurrencyInfo.CREATOR.createFromParcel(parcel), OKPaymentSource.valueOf(parcel.readString()), parcel.readString(), OrderType.valueOf(parcel.readString()), OrderFrequency.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BuySellInputPageParameters[] newArray(int i) {
            return new BuySellInputPageParameters[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BuySellInputPageParameters OLrzqt(@NotNull TradeType tradeType, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, BuySellBaseCurrencyInfo buySellBaseCurrencyInfo, @NotNull OKPaymentSource oKPaymentSource, @NotNull String str5, @NotNull OrderType orderType, @NotNull OrderFrequency orderFrequency, @NotNull String str6, @NotNull String str7, boolean z) {
        Intrinsics.checkNotNullParameter(tradeType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(oKPaymentSource, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(orderType, "");
        Intrinsics.checkNotNullParameter(orderFrequency, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new BuySellInputPageParameters(tradeType, str, str2, str3, str4, buySellBaseCurrencyInfo, oKPaymentSource, str5, orderType, orderFrequency, str6, str7, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BuySellInputPageParameters)) {
            return false;
        }
        BuySellInputPageParameters buySellInputPageParameters = (BuySellInputPageParameters) obj;
        return this.AkhnZx == buySellInputPageParameters.AkhnZx && Intrinsics.EZpvd((Object) this.gEmmrt, (Object) buySellInputPageParameters.gEmmrt) && Intrinsics.EZpvd((Object) this.valueOf, (Object) buySellInputPageParameters.valueOf) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) buySellInputPageParameters.KWHzl) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) buySellInputPageParameters.AEQbTJ) && Intrinsics.EZpvd(this.copydefault, buySellInputPageParameters.copydefault) && this.values == buySellInputPageParameters.values && Intrinsics.EZpvd((Object) this.isConnected, (Object) buySellInputPageParameters.isConnected) && this.djBIcL == buySellInputPageParameters.djBIcL && this.OLrzqt == buySellInputPageParameters.OLrzqt && Intrinsics.EZpvd((Object) this.AYXKKw, (Object) buySellInputPageParameters.AYXKKw) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) buySellInputPageParameters.EZpvd) && this.AhwBna == buySellInputPageParameters.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AkhnZx.hashCode();
        int iHashCode2 = this.gEmmrt.hashCode();
        int iHashCode3 = this.valueOf.hashCode();
        int iHashCode4 = this.KWHzl.hashCode();
        int iHashCode5 = this.AEQbTJ.hashCode();
        BuySellBaseCurrencyInfo buySellBaseCurrencyInfo = this.copydefault;
        return (((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (buySellBaseCurrencyInfo == null ? 0 : buySellBaseCurrencyInfo.hashCode())) * 31) + this.values.hashCode()) * 31) + this.isConnected.hashCode()) * 31) + this.djBIcL.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + this.AYXKKw.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + Boolean.hashCode(this.AhwBna);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BuySellInputPageParameters(tradeType=" + this.AkhnZx + ", quoteAmount=" + this.gEmmrt + ", quoteCurrency=" + this.valueOf + ", baseAmount=" + this.KWHzl + ", baseCurrency=" + this.AEQbTJ + ", buySellBaseCurrencyInfo=" + this.copydefault + ", source=" + this.values + ", topUpCurrency=" + this.isConnected + ", orderType=" + this.djBIcL + ", frequencyType=" + this.OLrzqt + ", minLimit=" + this.AYXKKw + ", maxLimit=" + this.EZpvd + ", showAddAccountToast=" + this.AhwBna + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        this.AkhnZx.writeToParcel(parcel, i);
        parcel.writeString(this.gEmmrt);
        parcel.writeString(this.valueOf);
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.AEQbTJ);
        BuySellBaseCurrencyInfo buySellBaseCurrencyInfo = this.copydefault;
        if (buySellBaseCurrencyInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            buySellBaseCurrencyInfo.writeToParcel(parcel, i);
        }
        parcel.writeString(this.values.name());
        parcel.writeString(this.isConnected);
        parcel.writeString(this.djBIcL.name());
        parcel.writeString(this.OLrzqt.name());
        parcel.writeString(this.AYXKKw);
        parcel.writeString(this.EZpvd);
        parcel.writeInt(this.AhwBna ? 1 : 0);
    }

    public BuySellInputPageParameters(@NotNull TradeType tradeType, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, BuySellBaseCurrencyInfo buySellBaseCurrencyInfo, @NotNull OKPaymentSource oKPaymentSource, @NotNull String str5, @NotNull OrderType orderType, @NotNull OrderFrequency orderFrequency, @NotNull String str6, @NotNull String str7, boolean z) {
        Intrinsics.checkNotNullParameter(tradeType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(oKPaymentSource, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(orderType, "");
        Intrinsics.checkNotNullParameter(orderFrequency, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.AkhnZx = tradeType;
        this.gEmmrt = str;
        this.valueOf = str2;
        this.KWHzl = str3;
        this.AEQbTJ = str4;
        this.copydefault = buySellBaseCurrencyInfo;
        this.values = oKPaymentSource;
        this.isConnected = str5;
        this.djBIcL = orderType;
        this.OLrzqt = orderFrequency;
        this.AYXKKw = str6;
        this.EZpvd = str7;
        this.AhwBna = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0070: CONSTRUCTOR 
  (wrap:com.okinc.okpaymentapi.data.remote.model.management.TradeType:?: TERNARY null = ((wrap:int:0x0002: ARITH (r30v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0008: SGET  A[WRAPPED] (LINE:808) com.okinc.okpaymentapi.data.remote.model.management.TradeType.BUY com.okinc.okpaymentapi.data.remote.model.management.TradeType) : (r17v0 com.okinc.okpaymentapi.data.remote.model.management.TradeType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r30v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r30v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r30v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r30v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:com.okinc.okx.paymentapi.service.BuySellBaseCurrencyInfo:?: TERNARY null = ((wrap:int:0x002e: ARITH (r30v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okx.paymentapi.service.BuySellBaseCurrencyInfo) : (r22v0 com.okinc.okx.paymentapi.service.BuySellBaseCurrencyInfo))
  (r23v0 com.okinc.okx.paymentapi.service.OKPaymentSource)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0037: ARITH (r30v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:com.okinc.okpaymentapi.data.remote.model.management.OrderType:?: TERNARY null = ((wrap:int:0x003f: ARITH (r30v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0045: SGET  A[WRAPPED] (LINE:816) com.okinc.okpaymentapi.data.remote.model.management.OrderType.ONE_TIME com.okinc.okpaymentapi.data.remote.model.management.OrderType) : (r25v0 com.okinc.okpaymentapi.data.remote.model.management.OrderType))
  (wrap:com.okinc.okpaymentapi.data.remote.model.management.OrderFrequency:?: TERNARY null = ((wrap:int:0x0049: ARITH (r30v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x004f: SGET  A[WRAPPED] (LINE:817) com.okinc.okpaymentapi.data.remote.model.management.OrderFrequency.NO_FREQ com.okinc.okpaymentapi.data.remote.model.management.OrderFrequency) : (r26v0 com.okinc.okpaymentapi.data.remote.model.management.OrderFrequency))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0053: ARITH (r30v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005b: ARITH (r30v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0063: ARITH (r30v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? false : (r29v0 boolean))
 A[MD:(com.okinc.okpaymentapi.data.remote.model.management.TradeType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.okx.paymentapi.service.BuySellBaseCurrencyInfo, com.okinc.okx.paymentapi.service.OKPaymentSource, java.lang.String, com.okinc.okpaymentapi.data.remote.model.management.OrderType, com.okinc.okpaymentapi.data.remote.model.management.OrderFrequency, java.lang.String, java.lang.String, boolean):void (m)] (LINE:807) call: com.okinc.okx.paymentapi.service.BuySellInputPageParameters.<init>(com.okinc.okpaymentapi.data.remote.model.management.TradeType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.okx.paymentapi.service.BuySellBaseCurrencyInfo, com.okinc.okx.paymentapi.service.OKPaymentSource, java.lang.String, com.okinc.okpaymentapi.data.remote.model.management.OrderType, com.okinc.okpaymentapi.data.remote.model.management.OrderFrequency, java.lang.String, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ BuySellInputPageParameters(TradeType tradeType, String str, String str2, String str3, String str4, BuySellBaseCurrencyInfo buySellBaseCurrencyInfo, OKPaymentSource oKPaymentSource, String str5, OrderType orderType, OrderFrequency orderFrequency, String str6, String str7, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? TradeType.BUY : tradeType, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? null : buySellBaseCurrencyInfo, oKPaymentSource, (i & 128) != 0 ? "" : str5, (i & 256) != 0 ? OrderType.ONE_TIME : orderType, (i & 512) != 0 ? OrderFrequency.NO_FREQ : orderFrequency, (i & 1024) != 0 ? "" : str6, (i & 2048) != 0 ? "" : str7, (i & 4096) != 0 ? false : z);
    }
}
