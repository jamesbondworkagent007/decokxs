package com.okinc.okx.paymentapi.service;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okpaymentapi.data.remote.model.management.Channel;
import com.okinc.okpaymentapi.data.remote.model.management.PaymentMethod;
import com.okinc.okpaymentapi.data.remote.model.management.TradeType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class CurrencyPreviewPageParameters implements Parcelable {
    public static final Parcelable.Creator<CurrencyPreviewPageParameters> CREATOR = new Creator();
    public ConvertPreviewParameters AEQbTJ;
    public P2pPaymentParameters AYXKKw;
    public boolean AhwBna;
    public String AkhnZx;
    public RecurringBuyOrderType AuCTel;
    public String DbNXlk;
    public String EZpvd;
    public DexPreviewParameters KWHzl;
    public Channel OLrzqt;
    public String copydefault;
    public boolean djBIcL;
    public OKPaymentSource ejfBZ;
    public String fARcdN;
    public int fIwbmz;
    public boolean fJNWhG;
    public String fetchVPNInfo;
    public int gEmmrt;
    public Boolean getFieldNames;
    public TradeType getNewProxyInstance;
    public String isConnected;
    public Boolean valueOf;
    public PaymentMethod values;

    public static final class Creator implements Parcelable.Creator<CurrencyPreviewPageParameters> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CurrencyPreviewPageParameters createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            TradeType tradeTypeCreateFromParcel = TradeType.CREATOR.createFromParcel(parcel);
            boolean z = parcel.readInt() != 0;
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            P2pPaymentParameters p2pPaymentParametersCreateFromParcel = parcel.readInt() == 0 ? null : P2pPaymentParameters.CREATOR.createFromParcel(parcel);
            String string6 = parcel.readString();
            Channel channelCreateFromParcel = parcel.readInt() == 0 ? null : Channel.CREATOR.createFromParcel(parcel);
            PaymentMethod paymentMethodCreateFromParcel = parcel.readInt() == 0 ? null : PaymentMethod.CREATOR.createFromParcel(parcel);
            String string7 = parcel.readString();
            RecurringBuyOrderType recurringBuyOrderTypeCreateFromParcel = RecurringBuyOrderType.CREATOR.createFromParcel(parcel);
            boolean z2 = parcel.readInt() != 0;
            ConvertPreviewParameters convertPreviewParametersCreateFromParcel = parcel.readInt() == 0 ? null : ConvertPreviewParameters.CREATOR.createFromParcel(parcel);
            DexPreviewParameters dexPreviewParametersCreateFromParcel = parcel.readInt() == 0 ? null : DexPreviewParameters.CREATOR.createFromParcel(parcel);
            OKPaymentSource oKPaymentSourceValueOf = parcel.readInt() == 0 ? null : OKPaymentSource.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new CurrencyPreviewPageParameters(string, string2, string3, string4, string5, tradeTypeCreateFromParcel, z, i, i2, p2pPaymentParametersCreateFromParcel, string6, channelCreateFromParcel, paymentMethodCreateFromParcel, string7, recurringBuyOrderTypeCreateFromParcel, z2, convertPreviewParametersCreateFromParcel, dexPreviewParametersCreateFromParcel, oKPaymentSourceValueOf, boolValueOf, boolValueOf2, parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CurrencyPreviewPageParameters[] newArray(int i) {
            return new CurrencyPreviewPageParameters[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CurrencyPreviewPageParameters copydefault(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull TradeType tradeType, boolean z, int i, int i2, P2pPaymentParameters p2pPaymentParameters, @NotNull String str6, Channel channel, PaymentMethod paymentMethod, String str7, @NotNull RecurringBuyOrderType recurringBuyOrderType, boolean z2, ConvertPreviewParameters convertPreviewParameters, DexPreviewParameters dexPreviewParameters, OKPaymentSource oKPaymentSource, Boolean bool, Boolean bool2, boolean z3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(tradeType, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(recurringBuyOrderType, "");
        return new CurrencyPreviewPageParameters(str, str2, str3, str4, str5, tradeType, z, i, i2, p2pPaymentParameters, str6, channel, paymentMethod, str7, recurringBuyOrderType, z2, convertPreviewParameters, dexPreviewParameters, oKPaymentSource, bool, bool2, z3);
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
        if (!(obj instanceof CurrencyPreviewPageParameters)) {
            return false;
        }
        CurrencyPreviewPageParameters currencyPreviewPageParameters = (CurrencyPreviewPageParameters) obj;
        return Intrinsics.EZpvd((Object) this.fetchVPNInfo, (Object) currencyPreviewPageParameters.fetchVPNInfo) && Intrinsics.EZpvd((Object) this.isConnected, (Object) currencyPreviewPageParameters.isConnected) && Intrinsics.EZpvd((Object) this.AkhnZx, (Object) currencyPreviewPageParameters.AkhnZx) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) currencyPreviewPageParameters.EZpvd) && Intrinsics.EZpvd((Object) this.copydefault, (Object) currencyPreviewPageParameters.copydefault) && this.getNewProxyInstance == currencyPreviewPageParameters.getNewProxyInstance && this.AhwBna == currencyPreviewPageParameters.AhwBna && this.fIwbmz == currencyPreviewPageParameters.fIwbmz && this.gEmmrt == currencyPreviewPageParameters.gEmmrt && Intrinsics.EZpvd(this.AYXKKw, currencyPreviewPageParameters.AYXKKw) && Intrinsics.EZpvd((Object) this.DbNXlk, (Object) currencyPreviewPageParameters.DbNXlk) && Intrinsics.EZpvd(this.OLrzqt, currencyPreviewPageParameters.OLrzqt) && Intrinsics.EZpvd(this.values, currencyPreviewPageParameters.values) && Intrinsics.EZpvd((Object) this.fARcdN, (Object) currencyPreviewPageParameters.fARcdN) && Intrinsics.EZpvd(this.AuCTel, currencyPreviewPageParameters.AuCTel) && this.fJNWhG == currencyPreviewPageParameters.fJNWhG && Intrinsics.EZpvd(this.AEQbTJ, currencyPreviewPageParameters.AEQbTJ) && Intrinsics.EZpvd(this.KWHzl, currencyPreviewPageParameters.KWHzl) && this.ejfBZ == currencyPreviewPageParameters.ejfBZ && Intrinsics.EZpvd(this.valueOf, currencyPreviewPageParameters.valueOf) && Intrinsics.EZpvd(this.getFieldNames, currencyPreviewPageParameters.getFieldNames) && this.djBIcL == currencyPreviewPageParameters.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.fetchVPNInfo.hashCode();
        int iHashCode2 = this.isConnected.hashCode();
        int iHashCode3 = this.AkhnZx.hashCode();
        int iHashCode4 = this.EZpvd.hashCode();
        int iHashCode5 = this.copydefault.hashCode();
        int iHashCode6 = this.getNewProxyInstance.hashCode();
        int iHashCode7 = Boolean.hashCode(this.AhwBna);
        int iHashCode8 = Integer.hashCode(this.fIwbmz);
        int iHashCode9 = Integer.hashCode(this.gEmmrt);
        P2pPaymentParameters p2pPaymentParameters = this.AYXKKw;
        int iHashCode10 = p2pPaymentParameters == null ? 0 : p2pPaymentParameters.hashCode();
        int iHashCode11 = this.DbNXlk.hashCode();
        Channel channel = this.OLrzqt;
        int iHashCode12 = channel == null ? 0 : channel.hashCode();
        PaymentMethod paymentMethod = this.values;
        int iHashCode13 = paymentMethod == null ? 0 : paymentMethod.hashCode();
        String str = this.fARcdN;
        int iHashCode14 = str == null ? 0 : str.hashCode();
        int iHashCode15 = this.AuCTel.hashCode();
        int iHashCode16 = Boolean.hashCode(this.fJNWhG);
        ConvertPreviewParameters convertPreviewParameters = this.AEQbTJ;
        int iHashCode17 = convertPreviewParameters == null ? 0 : convertPreviewParameters.hashCode();
        DexPreviewParameters dexPreviewParameters = this.KWHzl;
        int iHashCode18 = dexPreviewParameters == null ? 0 : dexPreviewParameters.hashCode();
        OKPaymentSource oKPaymentSource = this.ejfBZ;
        int iHashCode19 = oKPaymentSource == null ? 0 : oKPaymentSource.hashCode();
        Boolean bool = this.valueOf;
        int iHashCode20 = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.getFieldNames;
        return (((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + (bool2 == null ? 0 : bool2.hashCode())) * 31) + Boolean.hashCode(this.djBIcL);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CurrencyPreviewPageParameters(quoteCurrency=" + this.fetchVPNInfo + ", quoteCurrencyIcon=" + this.isConnected + ", quoteCurrencySymbol=" + this.AkhnZx + ", baseCurrency=" + this.EZpvd + ", baseCurrencyIcon=" + this.copydefault + ", tradeType=" + this.getNewProxyInstance + ", needQuote=" + this.AhwBna + ", standard=" + this.fIwbmz + ", inputType=" + this.gEmmrt + ", p2pPayment=" + this.AYXKKw + ", paymentName=" + this.DbNXlk + ", channel=" + this.OLrzqt + ", paymentMethod=" + this.values + ", slipRate=" + this.fARcdN + ", recurringBuyType=" + this.AuCTel + ", shouldShowPeggedCurrency=" + this.fJNWhG + ", convertPreviewParameters=" + this.AEQbTJ + ", dexPreviewParameters=" + this.KWHzl + ", source=" + this.ejfBZ + ", isFromBsc=" + this.valueOf + ", twoFactorAuthNeeded=" + this.getFieldNames + ", isRewardEligible=" + this.djBIcL + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.fetchVPNInfo);
        parcel.writeString(this.isConnected);
        parcel.writeString(this.AkhnZx);
        parcel.writeString(this.EZpvd);
        parcel.writeString(this.copydefault);
        this.getNewProxyInstance.writeToParcel(parcel, i);
        parcel.writeInt(this.AhwBna ? 1 : 0);
        parcel.writeInt(this.fIwbmz);
        parcel.writeInt(this.gEmmrt);
        P2pPaymentParameters p2pPaymentParameters = this.AYXKKw;
        if (p2pPaymentParameters == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            p2pPaymentParameters.writeToParcel(parcel, i);
        }
        parcel.writeString(this.DbNXlk);
        Channel channel = this.OLrzqt;
        if (channel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            channel.writeToParcel(parcel, i);
        }
        PaymentMethod paymentMethod = this.values;
        if (paymentMethod == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            paymentMethod.writeToParcel(parcel, i);
        }
        parcel.writeString(this.fARcdN);
        this.AuCTel.writeToParcel(parcel, i);
        parcel.writeInt(this.fJNWhG ? 1 : 0);
        ConvertPreviewParameters convertPreviewParameters = this.AEQbTJ;
        if (convertPreviewParameters == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            convertPreviewParameters.writeToParcel(parcel, i);
        }
        DexPreviewParameters dexPreviewParameters = this.KWHzl;
        if (dexPreviewParameters == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dexPreviewParameters.writeToParcel(parcel, i);
        }
        OKPaymentSource oKPaymentSource = this.ejfBZ;
        if (oKPaymentSource == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(oKPaymentSource.name());
        }
        Boolean bool = this.valueOf;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.getFieldNames;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        parcel.writeInt(this.djBIcL ? 1 : 0);
    }

    public CurrencyPreviewPageParameters(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull TradeType tradeType, boolean z, int i, int i2, P2pPaymentParameters p2pPaymentParameters, @NotNull String str6, Channel channel, PaymentMethod paymentMethod, String str7, @NotNull RecurringBuyOrderType recurringBuyOrderType, boolean z2, ConvertPreviewParameters convertPreviewParameters, DexPreviewParameters dexPreviewParameters, OKPaymentSource oKPaymentSource, Boolean bool, Boolean bool2, boolean z3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(tradeType, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(recurringBuyOrderType, "");
        this.fetchVPNInfo = str;
        this.isConnected = str2;
        this.AkhnZx = str3;
        this.EZpvd = str4;
        this.copydefault = str5;
        this.getNewProxyInstance = tradeType;
        this.AhwBna = z;
        this.fIwbmz = i;
        this.gEmmrt = i2;
        this.AYXKKw = p2pPaymentParameters;
        this.DbNXlk = str6;
        this.OLrzqt = channel;
        this.values = paymentMethod;
        this.fARcdN = str7;
        this.AuCTel = recurringBuyOrderType;
        this.fJNWhG = z2;
        this.AEQbTJ = convertPreviewParameters;
        this.KWHzl = dexPreviewParameters;
        this.ejfBZ = oKPaymentSource;
        this.valueOf = bool;
        this.getFieldNames = bool2;
        this.djBIcL = z3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00f1: CONSTRUCTOR 
  (r27v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r49v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r49v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (r30v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r49v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:com.okinc.okpaymentapi.data.remote.model.management.TradeType:?: TERNARY null = ((wrap:int:0x001c: ARITH (r49v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0022: SGET  A[WRAPPED] (LINE:914) com.okinc.okpaymentapi.data.remote.model.management.TradeType.BUY com.okinc.okpaymentapi.data.remote.model.management.TradeType) : (r32v0 com.okinc.okpaymentapi.data.remote.model.management.TradeType))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0026: ARITH (r49v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r33v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x002f: ARITH (r49v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r34v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0037: ARITH (r49v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r35v0 int))
  (wrap:com.okinc.okx.paymentapi.service.P2pPaymentParameters:?: TERNARY null = ((wrap:int:0x003f: ARITH (r49v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okx.paymentapi.service.P2pPaymentParameters) : (r36v0 com.okinc.okx.paymentapi.service.P2pPaymentParameters))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0048: ARITH (r49v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r37v0 java.lang.String))
  (wrap:com.okinc.okpaymentapi.data.remote.model.management.Channel:?: TERNARY null = ((wrap:int:0x0050: ARITH (r49v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okpaymentapi.data.remote.model.management.Channel) : (r38v0 com.okinc.okpaymentapi.data.remote.model.management.Channel))
  (wrap:com.okinc.okpaymentapi.data.remote.model.management.PaymentMethod:?: TERNARY null = ((wrap:int:0x0058: ARITH (r49v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okpaymentapi.data.remote.model.management.PaymentMethod) : (r39v0 com.okinc.okpaymentapi.data.remote.model.management.PaymentMethod))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0061: ARITH (r49v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r40v0 java.lang.String))
  (wrap:com.okinc.okx.paymentapi.service.RecurringBuyOrderType:?: TERNARY null = ((wrap:int:0x006a: ARITH (r49v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x009b: CONSTRUCTOR 
  (null java.lang.String)
  (0 int)
  (null java.lang.String)
  (null java.lang.String)
  (null java.lang.String)
  (null java.lang.String)
  (null java.lang.String)
  (null java.lang.String)
  (255 int)
  (null kotlin.jvm.internal.DefaultConstructorMarker)
 A[MD:(java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:923) call: com.okinc.okx.paymentapi.service.RecurringBuyOrderType.<init>(java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r41v0 com.okinc.okx.paymentapi.service.RecurringBuyOrderType))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00a3: ARITH (32768 int) & (r49v0 int) A[WRAPPED]) != (0 int)) ? false : (r42v0 boolean))
  (wrap:com.okinc.okx.paymentapi.service.ConvertPreviewParameters:?: TERNARY null = ((wrap:int:0x00ad: ARITH (65536 int) & (r49v0 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okx.paymentapi.service.ConvertPreviewParameters) : (r43v0 com.okinc.okx.paymentapi.service.ConvertPreviewParameters))
  (wrap:com.okinc.okx.paymentapi.service.DexPreviewParameters:?: TERNARY null = ((wrap:int:0x00b7: ARITH (131072 int) & (r49v0 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okx.paymentapi.service.DexPreviewParameters) : (r44v0 com.okinc.okx.paymentapi.service.DexPreviewParameters))
  (wrap:com.okinc.okx.paymentapi.service.OKPaymentSource:?: TERNARY null = ((wrap:int:0x00c1: ARITH (262144 int) & (r49v0 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okx.paymentapi.service.OKPaymentSource) : (r45v0 com.okinc.okx.paymentapi.service.OKPaymentSource))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x00cb: ARITH (524288 int) & (r49v0 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00d0: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r46v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x00d7: ARITH (1048576 int) & (r49v0 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00dc: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r47v0 java.lang.Boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00e3: ARITH (r49v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? false : (r48v0 boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.okpaymentapi.data.remote.model.management.TradeType, boolean, int, int, com.okinc.okx.paymentapi.service.P2pPaymentParameters, java.lang.String, com.okinc.okpaymentapi.data.remote.model.management.Channel, com.okinc.okpaymentapi.data.remote.model.management.PaymentMethod, java.lang.String, com.okinc.okx.paymentapi.service.RecurringBuyOrderType, boolean, com.okinc.okx.paymentapi.service.ConvertPreviewParameters, com.okinc.okx.paymentapi.service.DexPreviewParameters, com.okinc.okx.paymentapi.service.OKPaymentSource, java.lang.Boolean, java.lang.Boolean, boolean):void (m)] (LINE:908) call: com.okinc.okx.paymentapi.service.CurrencyPreviewPageParameters.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.okpaymentapi.data.remote.model.management.TradeType, boolean, int, int, com.okinc.okx.paymentapi.service.P2pPaymentParameters, java.lang.String, com.okinc.okpaymentapi.data.remote.model.management.Channel, com.okinc.okpaymentapi.data.remote.model.management.PaymentMethod, java.lang.String, com.okinc.okx.paymentapi.service.RecurringBuyOrderType, boolean, com.okinc.okx.paymentapi.service.ConvertPreviewParameters, com.okinc.okx.paymentapi.service.DexPreviewParameters, com.okinc.okx.paymentapi.service.OKPaymentSource, java.lang.Boolean, java.lang.Boolean, boolean):void type: THIS */
    public /* synthetic */ CurrencyPreviewPageParameters(String str, String str2, String str3, String str4, String str5, TradeType tradeType, boolean z, int i, int i2, P2pPaymentParameters p2pPaymentParameters, String str6, Channel channel, PaymentMethod paymentMethod, String str7, RecurringBuyOrderType recurringBuyOrderType, boolean z2, ConvertPreviewParameters convertPreviewParameters, DexPreviewParameters dexPreviewParameters, OKPaymentSource oKPaymentSource, Boolean bool, Boolean bool2, boolean z3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? "" : str3, str4, (i3 & 16) != 0 ? "" : str5, (i3 & 32) != 0 ? TradeType.BUY : tradeType, (i3 & 64) != 0 ? false : z, (i3 & 128) != 0 ? 0 : i, (i3 & 256) != 0 ? 0 : i2, (i3 & 512) != 0 ? null : p2pPaymentParameters, (i3 & 1024) != 0 ? "" : str6, (i3 & 2048) != 0 ? null : channel, (i3 & 4096) != 0 ? null : paymentMethod, (i3 & 8192) != 0 ? null : str7, (i3 & 16384) != 0 ? new RecurringBuyOrderType(null, 0, null, null, null, null, null, null, 255, null) : recurringBuyOrderType, (32768 & i3) != 0 ? false : z2, (65536 & i3) != 0 ? null : convertPreviewParameters, (131072 & i3) != 0 ? null : dexPreviewParameters, (262144 & i3) != 0 ? null : oKPaymentSource, (524288 & i3) != 0 ? Boolean.FALSE : bool, (1048576 & i3) != 0 ? Boolean.FALSE : bool2, (i3 & 2097152) != 0 ? false : z3);
    }
}
