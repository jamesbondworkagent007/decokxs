package com.okinc.business.dex.api.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class TradeParam implements Parcelable {
    public static final String BTC_CHAIN_ID = "0";
    private static final TradeParam DEFAULT;
    private final Integer addressType;
    private final String fromAmount;
    private final CoinInfo fromCoinInfo;
    private boolean isFromWalletCoinDetail;
    private final boolean isOldTradingDialog;
    private final Boolean recordSwapTypeCache;
    private final String sourcePageName;
    private final int srcType;
    private final String strategyType;
    private final String swapType;
    private final CoinInfo toCoinInfo;
    private final String tradeMode;
    private final String type;
    private final String walletId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<TradeParam> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<TradeParam> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TradeParam createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            Parcelable.Creator<CoinInfo> creator = CoinInfo.CREATOR;
            CoinInfo coinInfoCreateFromParcel = creator.createFromParcel(parcel);
            CoinInfo coinInfoCreateFromParcel2 = creator.createFromParcel(parcel);
            String string3 = parcel.readString();
            Boolean boolValueOf = null;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string4 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            String string5 = parcel.readString();
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new TradeParam(string, string2, coinInfoCreateFromParcel, coinInfoCreateFromParcel2, string3, numValueOf, string4, z, string5, boolValueOf, parcel.readInt() != 0, parcel.readString(), parcel.readInt(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TradeParam[] newArray(int i) {
            return new TradeParam[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final Integer component6() {
        return this.addressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.walletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component10() {
        return this.recordSwapTypeCache;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component11() {
        return this.isOldTradingDialog;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.sourcePageName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component13() {
        return this.srcType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.strategyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CoinInfo component3() {
        return this.fromCoinInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CoinInfo component4() {
        return this.toCoinInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.fromAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.swapType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component8() {
        return this.isFromWalletCoinDetail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.tradeMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeParam copy(@NotNull String str, @NotNull String str2, @NotNull CoinInfo coinInfo, @NotNull CoinInfo coinInfo2, @NotNull String str3, Integer num, String str4, boolean z, String str5, Boolean bool, boolean z2, @NotNull String str6, int i, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(coinInfo, "");
        Intrinsics.checkNotNullParameter(coinInfo2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new TradeParam(str, str2, coinInfo, coinInfo2, str3, num, str4, z, str5, bool, z2, str6, i, str7);
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
        if (!(obj instanceof TradeParam)) {
            return false;
        }
        TradeParam tradeParam = (TradeParam) obj;
        return Intrinsics.EZpvd((Object) this.walletId, (Object) tradeParam.walletId) && Intrinsics.EZpvd((Object) this.type, (Object) tradeParam.type) && Intrinsics.EZpvd(this.fromCoinInfo, tradeParam.fromCoinInfo) && Intrinsics.EZpvd(this.toCoinInfo, tradeParam.toCoinInfo) && Intrinsics.EZpvd((Object) this.fromAmount, (Object) tradeParam.fromAmount) && Intrinsics.EZpvd(this.addressType, tradeParam.addressType) && Intrinsics.EZpvd((Object) this.swapType, (Object) tradeParam.swapType) && this.isFromWalletCoinDetail == tradeParam.isFromWalletCoinDetail && Intrinsics.EZpvd((Object) this.tradeMode, (Object) tradeParam.tradeMode) && Intrinsics.EZpvd(this.recordSwapTypeCache, tradeParam.recordSwapTypeCache) && this.isOldTradingDialog == tradeParam.isOldTradingDialog && Intrinsics.EZpvd((Object) this.sourcePageName, (Object) tradeParam.sourcePageName) && this.srcType == tradeParam.srcType && Intrinsics.EZpvd((Object) this.strategyType, (Object) tradeParam.strategyType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromAmount() {
        return this.fromAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CoinInfo getFromCoinInfo() {
        return this.fromCoinInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getRecordSwapTypeCache() {
        return this.recordSwapTypeCache;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSourcePageName() {
        return this.sourcePageName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSrcType() {
        return this.srcType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStrategyType() {
        return this.strategyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSwapType() {
        return this.swapType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CoinInfo getToCoinInfo() {
        return this.toCoinInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradeMode() {
        return this.tradeMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWalletId() {
        return this.walletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.walletId.hashCode();
        int iHashCode2 = this.type.hashCode();
        int iHashCode3 = this.fromCoinInfo.hashCode();
        int iHashCode4 = this.toCoinInfo.hashCode();
        int iHashCode5 = this.fromAmount.hashCode();
        Integer num = this.addressType;
        int iHashCode6 = num == null ? 0 : num.hashCode();
        String str = this.swapType;
        int iHashCode7 = str == null ? 0 : str.hashCode();
        int iHashCode8 = Boolean.hashCode(this.isFromWalletCoinDetail);
        String str2 = this.tradeMode;
        int iHashCode9 = str2 == null ? 0 : str2.hashCode();
        Boolean bool = this.recordSwapTypeCache;
        return (((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (bool != null ? bool.hashCode() : 0)) * 31) + Boolean.hashCode(this.isOldTradingDialog)) * 31) + this.sourcePageName.hashCode()) * 31) + Integer.hashCode(this.srcType)) * 31) + this.strategyType.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isFromWalletCoinDetail() {
        return this.isFromWalletCoinDetail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isOldTradingDialog() {
        return this.isOldTradingDialog;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFromWalletCoinDetail(boolean z) {
        this.isFromWalletCoinDetail = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TradeParam(walletId=" + this.walletId + ", type=" + this.type + ", fromCoinInfo=" + this.fromCoinInfo + ", toCoinInfo=" + this.toCoinInfo + ", fromAmount=" + this.fromAmount + ", addressType=" + this.addressType + ", swapType=" + this.swapType + ", isFromWalletCoinDetail=" + this.isFromWalletCoinDetail + ", tradeMode=" + this.tradeMode + ", recordSwapTypeCache=" + this.recordSwapTypeCache + ", isOldTradingDialog=" + this.isOldTradingDialog + ", sourcePageName=" + this.sourcePageName + ", srcType=" + this.srcType + ", strategyType=" + this.strategyType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.walletId);
        parcel.writeString(this.type);
        this.fromCoinInfo.writeToParcel(parcel, i);
        this.toCoinInfo.writeToParcel(parcel, i);
        parcel.writeString(this.fromAmount);
        Integer num = this.addressType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.swapType);
        parcel.writeInt(this.isFromWalletCoinDetail ? 1 : 0);
        parcel.writeString(this.tradeMode);
        Boolean bool = this.recordSwapTypeCache;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeInt(this.isOldTradingDialog ? 1 : 0);
        parcel.writeString(this.sourcePageName);
        parcel.writeInt(this.srcType);
        parcel.writeString(this.strategyType);
    }

    public /* synthetic */ TradeParam(int i, String str, String str2, CoinInfo coinInfo, CoinInfo coinInfo2, String str3, Integer num, String str4, boolean z, String str5, Boolean bool, boolean z2, String str6, int i2, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, TradeParam$$serializer.INSTANCE.getDescriptor());
        }
        this.walletId = str;
        this.type = str2;
        this.fromCoinInfo = coinInfo;
        this.toCoinInfo = coinInfo2;
        if ((i & 16) == 0) {
            this.fromAmount = "";
        } else {
            this.fromAmount = str3;
        }
        if ((i & 32) == 0) {
            this.addressType = null;
        } else {
            this.addressType = num;
        }
        if ((i & 64) == 0) {
            this.swapType = null;
        } else {
            this.swapType = str4;
        }
        if ((i & 128) == 0) {
            this.isFromWalletCoinDetail = false;
        } else {
            this.isFromWalletCoinDetail = z;
        }
        if ((i & 256) == 0) {
            this.tradeMode = null;
        } else {
            this.tradeMode = str5;
        }
        if ((i & 512) == 0) {
            this.recordSwapTypeCache = null;
        } else {
            this.recordSwapTypeCache = bool;
        }
        if ((i & 1024) == 0) {
            this.isOldTradingDialog = false;
        } else {
            this.isOldTradingDialog = z2;
        }
        if ((i & 2048) == 0) {
            this.sourcePageName = "";
        } else {
            this.sourcePageName = str6;
        }
        if ((i & 4096) == 0) {
            this.srcType = 0;
        } else {
            this.srcType = i2;
        }
        this.strategyType = (i & 8192) == 0 ? "0" : str7;
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_api(TradeParam tradeParam, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, tradeParam.walletId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, tradeParam.type);
        CoinInfo$$serializer coinInfo$$serializer = CoinInfo$$serializer.INSTANCE;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, coinInfo$$serializer, tradeParam.fromCoinInfo);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, coinInfo$$serializer, tradeParam.toCoinInfo);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) tradeParam.fromAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, tradeParam.fromAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || tradeParam.addressType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, IntSerializer.INSTANCE, tradeParam.addressType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || tradeParam.swapType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, tradeParam.swapType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || tradeParam.isFromWalletCoinDetail) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 7, tradeParam.isFromWalletCoinDetail);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || tradeParam.tradeMode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, tradeParam.tradeMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || tradeParam.recordSwapTypeCache != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, BooleanSerializer.INSTANCE, tradeParam.recordSwapTypeCache);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || tradeParam.isOldTradingDialog) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 10, tradeParam.isOldTradingDialog);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) tradeParam.sourcePageName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, tradeParam.sourcePageName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || tradeParam.srcType != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 12, tradeParam.srcType);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) && Intrinsics.EZpvd((Object) tradeParam.strategyType, (Object) "0")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 13, tradeParam.strategyType);
    }

    public TradeParam(@NotNull String str, @NotNull String str2, @NotNull CoinInfo coinInfo, @NotNull CoinInfo coinInfo2, @NotNull String str3, Integer num, String str4, boolean z, String str5, Boolean bool, boolean z2, @NotNull String str6, int i, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(coinInfo, "");
        Intrinsics.checkNotNullParameter(coinInfo2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.walletId = str;
        this.type = str2;
        this.fromCoinInfo = coinInfo;
        this.toCoinInfo = coinInfo2;
        this.fromAmount = str3;
        this.addressType = num;
        this.swapType = str4;
        this.isFromWalletCoinDetail = z;
        this.tradeMode = str5;
        this.recordSwapTypeCache = bool;
        this.isOldTradingDialog = z2;
        this.sourcePageName = str6;
        this.srcType = i;
        this.strategyType = str7;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0064: CONSTRUCTOR 
  (r19v0 java.lang.String)
  (r20v0 java.lang.String)
  (r21v0 com.okinc.business.dex.api.bean.CoinInfo)
  (r22v0 com.okinc.business.dex.api.bean.CoinInfo)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r33v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x000c: ARITH (r33v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r24v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r33v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r25v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001d: ARITH (r33v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? false : (r26v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r33v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r27v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x002e: ARITH (r33v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r28v0 java.lang.Boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0036: ARITH (r33v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? false : (r29v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003e: ARITH (r33v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0046: ARITH (r33v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r31v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004f: ARITH (r33v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("0") : (r32v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, com.okinc.business.dex.api.bean.CoinInfo, com.okinc.business.dex.api.bean.CoinInfo, java.lang.String, java.lang.Integer, java.lang.String, boolean, java.lang.String, java.lang.Boolean, boolean, java.lang.String, int, java.lang.String):void (m)] (LINE:66) call: com.okinc.business.dex.api.bean.TradeParam.<init>(java.lang.String, java.lang.String, com.okinc.business.dex.api.bean.CoinInfo, com.okinc.business.dex.api.bean.CoinInfo, java.lang.String, java.lang.Integer, java.lang.String, boolean, java.lang.String, java.lang.Boolean, boolean, java.lang.String, int, java.lang.String):void type: THIS */
    public /* synthetic */ TradeParam(String str, String str2, CoinInfo coinInfo, CoinInfo coinInfo2, String str3, Integer num, String str4, boolean z, String str5, Boolean bool, boolean z2, String str6, int i, String str7, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, coinInfo, coinInfo2, (i2 & 16) != 0 ? "" : str3, (i2 & 32) != 0 ? null : num, (i2 & 64) != 0 ? null : str4, (i2 & 128) != 0 ? false : z, (i2 & 256) != 0 ? null : str5, (i2 & 512) != 0 ? null : bool, (i2 & 1024) != 0 ? false : z2, (i2 & 2048) != 0 ? "" : str6, (i2 & 4096) != 0 ? 0 : i, (i2 & 8192) != 0 ? "0" : str7);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.api.bean.TradeParam.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TradeParam> serializer() {
            return TradeParam$$serializer.INSTANCE;
        }

        public final TradeParam AEQbTJ() {
            return TradeParam.DEFAULT;
        }
    }

    static {
        String str = null;
        String str2 = null;
        DEFAULT = new TradeParam("", "", new CoinInfo(str, (String) null, false, (String) null, 15, (DefaultConstructorMarker) null), new CoinInfo(str2, (String) null, false, (String) null, 15, (DefaultConstructorMarker) null), str, (Integer) (0 == true ? 1 : 0), (String) null, false, (String) null, (Boolean) (0 == true ? 1 : 0), false, str2, 0, (String) null, 16368, (DefaultConstructorMarker) null);
    }

    public final Integer getBtcAddressType() {
        String chainId = this.fromCoinInfo.getChainId();
        String chainId2 = this.toCoinInfo.getChainId();
        if (chainId.length() > 0 && Intrinsics.EZpvd((Object) chainId, (Object) "0")) {
            return this.addressType;
        }
        if (chainId2.length() <= 0 || !Intrinsics.EZpvd((Object) chainId2, (Object) "0")) {
            return null;
        }
        return this.addressType;
    }

    public final String getChainId() {
        String chainId = this.fromCoinInfo.getChainId();
        return chainId.length() == 0 ? this.toCoinInfo.getChainId() : chainId;
    }
}
