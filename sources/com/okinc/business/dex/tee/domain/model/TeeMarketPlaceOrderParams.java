package com.okinc.business.dex.tee.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.dexlogic.bean.DexRouterList;
import com.okinc.business.dexlogic.bean.DexRouterList$$serializer;
import com.okinc.business.dexlogic.bean.ServiceFeeInfo;
import com.okinc.business.dexlogic.bean.ServiceFeeInfo$$serializer;
import com.okinc.business.dexlogic.bean.TraceData;
import com.okinc.business.dexlogic.bean.TraceData$$serializer;
import com.okinc.business.dexlogic.bean.TradeMode;
import com.okinc.business.dexlogic.main.swap.trade.referral.data.ReferralParam;
import com.okinc.business.dexlogic.main.swap.trade.referral.data.ReferralParam$$serializer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class TeeMarketPlaceOrderParams implements Parcelable {
    private final String accountId;
    private final String amount;
    private final String businessType;
    private final String chainId;
    private final String chainName;
    private final List<DexRouterList> dexRouterList;
    private final String direction;
    private final Boolean enableJito;
    private final String expireTime;
    private final String fromTokenAddress;
    private final String fromTokenDecimals;
    private final String gasPrice;
    private final String gasUsed;
    private final boolean isAutoConfirmQuotaRemaining;
    private final boolean isOKXPlatform;
    private final String maxSlippage;
    private final String mevInfo;
    private final String minimumReceived;
    private final String orderSource;
    private final String priorityFee;
    private final String priorityFeeType;
    private final String quoteId;
    private final ReferralParam refParam;
    private final String routerModeType;
    private final ServiceFeeInfo serviceFeeInfo;
    private final String slippage;
    private final String slippageType;
    private final StrategyType strategyType;
    private final String teeId;
    private final String toAmount;
    private final String toTokenAddress;
    private final String toTokenDecimals;
    private final TpslConfig tpslConfig;
    private final TraceData traceData;
    private final TradeMode tradeMode;
    private final String userWalletAddress;
    private final String walletAddress;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<TeeMarketPlaceOrderParams> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, EnumsKt.createSimpleEnumSerializer("com.okinc.business.dex.tee.domain.model.StrategyType", StrategyType.values()), null, null, null, null, null, null, null, null, null, null, null, EnumsKt.createSimpleEnumSerializer("com.okinc.business.dexlogic.bean.TradeMode", TradeMode.values()), null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(DexRouterList$$serializer.INSTANCE), null, null, null, null, null, null, null, null};

    public static final class Creator implements Parcelable.Creator<TeeMarketPlaceOrderParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TeeMarketPlaceOrderParams createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            StrategyType strategyTypeValueOf = StrategyType.valueOf(parcel.readString());
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            TpslConfig tpslConfigCreateFromParcel = parcel.readInt() == 0 ? null : TpslConfig.CREATOR.createFromParcel(parcel);
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            ServiceFeeInfo serviceFeeInfoCreateFromParcel = parcel.readInt() == 0 ? null : ServiceFeeInfo.CREATOR.createFromParcel(parcel);
            TradeMode tradeModeValueOf = TradeMode.valueOf(parcel.readString());
            TraceData traceDataCreateFromParcel = parcel.readInt() == 0 ? null : TraceData.CREATOR.createFromParcel(parcel);
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            String string14 = parcel.readString();
            String string15 = parcel.readString();
            String string16 = parcel.readString();
            String string17 = parcel.readString();
            String string18 = parcel.readString();
            String string19 = parcel.readString();
            String string20 = parcel.readString();
            String string21 = parcel.readString();
            String string22 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int i2 = 0;
            while (i2 != i) {
                arrayList.add(DexRouterList.CREATOR.createFromParcel(parcel));
                i2++;
                i = i;
            }
            return new TeeMarketPlaceOrderParams(string, string2, strategyTypeValueOf, string3, string4, string5, string6, tpslConfigCreateFromParcel, string7, string8, boolValueOf, string9, string10, serviceFeeInfoCreateFromParcel, tradeModeValueOf, traceDataCreateFromParcel, string11, string12, string13, string14, string15, string16, string17, string18, string19, string20, string21, string22, arrayList, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), ReferralParam.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TeeMarketPlaceOrderParams[] newArray(int i) {
            return new TeeMarketPlaceOrderParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.teeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.gasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component11() {
        return this.enableJito;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.gasUsed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.mevInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ServiceFeeInfo component14() {
        return this.serviceFeeInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeMode component15() {
        return this.tradeMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TraceData component16() {
        return this.traceData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.direction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.walletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.businessType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.fromTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.toTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.slippageType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.slippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.userWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component27() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component28() {
        return this.toAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DexRouterList> component29() {
        return this.dexRouterList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyType component3() {
        return this.strategyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component30() {
        return this.expireTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component31() {
        return this.fromTokenDecimals;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component32() {
        return this.toTokenDecimals;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component33() {
        return this.minimumReceived;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component34() {
        return this.quoteId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ReferralParam component35() {
        return this.refParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component36() {
        return this.isOKXPlatform;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component37() {
        return this.isAutoConfirmQuotaRemaining;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.maxSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.priorityFeeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.priorityFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.routerModeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TpslConfig component8() {
        return this.tpslConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.orderSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TeeMarketPlaceOrderParams copy(@NotNull String str, @NotNull String str2, @NotNull StrategyType strategyType, String str3, @NotNull String str4, @NotNull String str5, String str6, TpslConfig tpslConfig, String str7, String str8, Boolean bool, @NotNull String str9, String str10, ServiceFeeInfo serviceFeeInfo, @NotNull TradeMode tradeMode, TraceData traceData, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull List<DexRouterList> list, @NotNull String str23, @NotNull String str24, @NotNull String str25, @NotNull String str26, @NotNull String str27, @NotNull ReferralParam referralParam, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(strategyType, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(tradeMode, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str20, "");
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(str22, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str23, "");
        Intrinsics.checkNotNullParameter(str24, "");
        Intrinsics.checkNotNullParameter(str25, "");
        Intrinsics.checkNotNullParameter(str26, "");
        Intrinsics.checkNotNullParameter(str27, "");
        Intrinsics.checkNotNullParameter(referralParam, "");
        return new TeeMarketPlaceOrderParams(str, str2, strategyType, str3, str4, str5, str6, tpslConfig, str7, str8, bool, str9, str10, serviceFeeInfo, tradeMode, traceData, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, list, str23, str24, str25, str26, str27, referralParam, z, z2);
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
        if (!(obj instanceof TeeMarketPlaceOrderParams)) {
            return false;
        }
        TeeMarketPlaceOrderParams teeMarketPlaceOrderParams = (TeeMarketPlaceOrderParams) obj;
        return Intrinsics.EZpvd((Object) this.teeId, (Object) teeMarketPlaceOrderParams.teeId) && Intrinsics.EZpvd((Object) this.walletAddress, (Object) teeMarketPlaceOrderParams.walletAddress) && this.strategyType == teeMarketPlaceOrderParams.strategyType && Intrinsics.EZpvd((Object) this.maxSlippage, (Object) teeMarketPlaceOrderParams.maxSlippage) && Intrinsics.EZpvd((Object) this.priorityFeeType, (Object) teeMarketPlaceOrderParams.priorityFeeType) && Intrinsics.EZpvd((Object) this.priorityFee, (Object) teeMarketPlaceOrderParams.priorityFee) && Intrinsics.EZpvd((Object) this.routerModeType, (Object) teeMarketPlaceOrderParams.routerModeType) && Intrinsics.EZpvd(this.tpslConfig, teeMarketPlaceOrderParams.tpslConfig) && Intrinsics.EZpvd((Object) this.orderSource, (Object) teeMarketPlaceOrderParams.orderSource) && Intrinsics.EZpvd((Object) this.gasPrice, (Object) teeMarketPlaceOrderParams.gasPrice) && Intrinsics.EZpvd(this.enableJito, teeMarketPlaceOrderParams.enableJito) && Intrinsics.EZpvd((Object) this.gasUsed, (Object) teeMarketPlaceOrderParams.gasUsed) && Intrinsics.EZpvd((Object) this.mevInfo, (Object) teeMarketPlaceOrderParams.mevInfo) && Intrinsics.EZpvd(this.serviceFeeInfo, teeMarketPlaceOrderParams.serviceFeeInfo) && this.tradeMode == teeMarketPlaceOrderParams.tradeMode && Intrinsics.EZpvd(this.traceData, teeMarketPlaceOrderParams.traceData) && Intrinsics.EZpvd((Object) this.direction, (Object) teeMarketPlaceOrderParams.direction) && Intrinsics.EZpvd((Object) this.chainId, (Object) teeMarketPlaceOrderParams.chainId) && Intrinsics.EZpvd((Object) this.chainName, (Object) teeMarketPlaceOrderParams.chainName) && Intrinsics.EZpvd((Object) this.businessType, (Object) teeMarketPlaceOrderParams.businessType) && Intrinsics.EZpvd((Object) this.fromTokenAddress, (Object) teeMarketPlaceOrderParams.fromTokenAddress) && Intrinsics.EZpvd((Object) this.toTokenAddress, (Object) teeMarketPlaceOrderParams.toTokenAddress) && Intrinsics.EZpvd((Object) this.amount, (Object) teeMarketPlaceOrderParams.amount) && Intrinsics.EZpvd((Object) this.slippageType, (Object) teeMarketPlaceOrderParams.slippageType) && Intrinsics.EZpvd((Object) this.slippage, (Object) teeMarketPlaceOrderParams.slippage) && Intrinsics.EZpvd((Object) this.userWalletAddress, (Object) teeMarketPlaceOrderParams.userWalletAddress) && Intrinsics.EZpvd((Object) this.accountId, (Object) teeMarketPlaceOrderParams.accountId) && Intrinsics.EZpvd((Object) this.toAmount, (Object) teeMarketPlaceOrderParams.toAmount) && Intrinsics.EZpvd(this.dexRouterList, teeMarketPlaceOrderParams.dexRouterList) && Intrinsics.EZpvd((Object) this.expireTime, (Object) teeMarketPlaceOrderParams.expireTime) && Intrinsics.EZpvd((Object) this.fromTokenDecimals, (Object) teeMarketPlaceOrderParams.fromTokenDecimals) && Intrinsics.EZpvd((Object) this.toTokenDecimals, (Object) teeMarketPlaceOrderParams.toTokenDecimals) && Intrinsics.EZpvd((Object) this.minimumReceived, (Object) teeMarketPlaceOrderParams.minimumReceived) && Intrinsics.EZpvd((Object) this.quoteId, (Object) teeMarketPlaceOrderParams.quoteId) && Intrinsics.EZpvd(this.refParam, teeMarketPlaceOrderParams.refParam) && this.isOKXPlatform == teeMarketPlaceOrderParams.isOKXPlatform && this.isAutoConfirmQuotaRemaining == teeMarketPlaceOrderParams.isAutoConfirmQuotaRemaining;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountId() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBusinessType() {
        return this.businessType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainName() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DexRouterList> getDexRouterList() {
        return this.dexRouterList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDirection() {
        return this.direction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getEnableJito() {
        return this.enableJito;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExpireTime() {
        return this.expireTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromTokenAddress() {
        return this.fromTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromTokenDecimals() {
        return this.fromTokenDecimals;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGasPrice() {
        return this.gasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGasUsed() {
        return this.gasUsed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxSlippage() {
        return this.maxSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMevInfo() {
        return this.mevInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinimumReceived() {
        return this.minimumReceived;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderSource() {
        return this.orderSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPriorityFee() {
        return this.priorityFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPriorityFeeType() {
        return this.priorityFeeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteId() {
        return this.quoteId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ReferralParam getRefParam() {
        return this.refParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRouterModeType() {
        return this.routerModeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ServiceFeeInfo getServiceFeeInfo() {
        return this.serviceFeeInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlippage() {
        return this.slippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlippageType() {
        return this.slippageType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyType getStrategyType() {
        return this.strategyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTeeId() {
        return this.teeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToAmount() {
        return this.toAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToTokenAddress() {
        return this.toTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToTokenDecimals() {
        return this.toTokenDecimals;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TpslConfig getTpslConfig() {
        return this.tpslConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TraceData getTraceData() {
        return this.traceData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeMode getTradeMode() {
        return this.tradeMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserWalletAddress() {
        return this.userWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWalletAddress() {
        return this.walletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.teeId.hashCode();
        int iHashCode2 = this.walletAddress.hashCode();
        int iHashCode3 = this.strategyType.hashCode();
        String str = this.maxSlippage;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        int iHashCode5 = this.priorityFeeType.hashCode();
        int iHashCode6 = this.priorityFee.hashCode();
        String str2 = this.routerModeType;
        int iHashCode7 = str2 == null ? 0 : str2.hashCode();
        TpslConfig tpslConfig = this.tpslConfig;
        int iHashCode8 = tpslConfig == null ? 0 : tpslConfig.hashCode();
        String str3 = this.orderSource;
        int iHashCode9 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.gasPrice;
        int iHashCode10 = str4 == null ? 0 : str4.hashCode();
        Boolean bool = this.enableJito;
        int iHashCode11 = bool == null ? 0 : bool.hashCode();
        int iHashCode12 = this.gasUsed.hashCode();
        String str5 = this.mevInfo;
        int iHashCode13 = str5 == null ? 0 : str5.hashCode();
        ServiceFeeInfo serviceFeeInfo = this.serviceFeeInfo;
        int iHashCode14 = serviceFeeInfo == null ? 0 : serviceFeeInfo.hashCode();
        int iHashCode15 = this.tradeMode.hashCode();
        TraceData traceData = this.traceData;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + (traceData == null ? 0 : traceData.hashCode())) * 31) + this.direction.hashCode()) * 31) + this.chainId.hashCode()) * 31) + this.chainName.hashCode()) * 31) + this.businessType.hashCode()) * 31) + this.fromTokenAddress.hashCode()) * 31) + this.toTokenAddress.hashCode()) * 31) + this.amount.hashCode()) * 31) + this.slippageType.hashCode()) * 31) + this.slippage.hashCode()) * 31) + this.userWalletAddress.hashCode()) * 31) + this.accountId.hashCode()) * 31) + this.toAmount.hashCode()) * 31) + this.dexRouterList.hashCode()) * 31) + this.expireTime.hashCode()) * 31) + this.fromTokenDecimals.hashCode()) * 31) + this.toTokenDecimals.hashCode()) * 31) + this.minimumReceived.hashCode()) * 31) + this.quoteId.hashCode()) * 31) + this.refParam.hashCode()) * 31) + Boolean.hashCode(this.isOKXPlatform)) * 31) + Boolean.hashCode(this.isAutoConfirmQuotaRemaining);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isAutoConfirmQuotaRemaining() {
        return this.isAutoConfirmQuotaRemaining;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isOKXPlatform() {
        return this.isOKXPlatform;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TeeMarketPlaceOrderParams(teeId=" + this.teeId + ", walletAddress=" + this.walletAddress + ", strategyType=" + this.strategyType + ", maxSlippage=" + this.maxSlippage + ", priorityFeeType=" + this.priorityFeeType + ", priorityFee=" + this.priorityFee + ", routerModeType=" + this.routerModeType + ", tpslConfig=" + this.tpslConfig + ", orderSource=" + this.orderSource + ", gasPrice=" + this.gasPrice + ", enableJito=" + this.enableJito + ", gasUsed=" + this.gasUsed + ", mevInfo=" + this.mevInfo + ", serviceFeeInfo=" + this.serviceFeeInfo + ", tradeMode=" + this.tradeMode + ", traceData=" + this.traceData + ", direction=" + this.direction + ", chainId=" + this.chainId + ", chainName=" + this.chainName + ", businessType=" + this.businessType + ", fromTokenAddress=" + this.fromTokenAddress + ", toTokenAddress=" + this.toTokenAddress + ", amount=" + this.amount + ", slippageType=" + this.slippageType + ", slippage=" + this.slippage + ", userWalletAddress=" + this.userWalletAddress + ", accountId=" + this.accountId + ", toAmount=" + this.toAmount + ", dexRouterList=" + this.dexRouterList + ", expireTime=" + this.expireTime + ", fromTokenDecimals=" + this.fromTokenDecimals + ", toTokenDecimals=" + this.toTokenDecimals + ", minimumReceived=" + this.minimumReceived + ", quoteId=" + this.quoteId + ", refParam=" + this.refParam + ", isOKXPlatform=" + this.isOKXPlatform + ", isAutoConfirmQuotaRemaining=" + this.isAutoConfirmQuotaRemaining + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.teeId);
        parcel.writeString(this.walletAddress);
        parcel.writeString(this.strategyType.name());
        parcel.writeString(this.maxSlippage);
        parcel.writeString(this.priorityFeeType);
        parcel.writeString(this.priorityFee);
        parcel.writeString(this.routerModeType);
        TpslConfig tpslConfig = this.tpslConfig;
        if (tpslConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            tpslConfig.writeToParcel(parcel, i);
        }
        parcel.writeString(this.orderSource);
        parcel.writeString(this.gasPrice);
        Boolean bool = this.enableJito;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.gasUsed);
        parcel.writeString(this.mevInfo);
        ServiceFeeInfo serviceFeeInfo = this.serviceFeeInfo;
        if (serviceFeeInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            serviceFeeInfo.writeToParcel(parcel, i);
        }
        parcel.writeString(this.tradeMode.name());
        TraceData traceData = this.traceData;
        if (traceData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            traceData.writeToParcel(parcel, i);
        }
        parcel.writeString(this.direction);
        parcel.writeString(this.chainId);
        parcel.writeString(this.chainName);
        parcel.writeString(this.businessType);
        parcel.writeString(this.fromTokenAddress);
        parcel.writeString(this.toTokenAddress);
        parcel.writeString(this.amount);
        parcel.writeString(this.slippageType);
        parcel.writeString(this.slippage);
        parcel.writeString(this.userWalletAddress);
        parcel.writeString(this.accountId);
        parcel.writeString(this.toAmount);
        List<DexRouterList> list = this.dexRouterList;
        parcel.writeInt(list.size());
        Iterator<DexRouterList> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.expireTime);
        parcel.writeString(this.fromTokenDecimals);
        parcel.writeString(this.toTokenDecimals);
        parcel.writeString(this.minimumReceived);
        parcel.writeString(this.quoteId);
        this.refParam.writeToParcel(parcel, i);
        parcel.writeInt(this.isOKXPlatform ? 1 : 0);
        parcel.writeInt(this.isAutoConfirmQuotaRemaining ? 1 : 0);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.tee.domain.model.TeeMarketPlaceOrderParams.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TeeMarketPlaceOrderParams> serializer() {
            return TeeMarketPlaceOrderParams$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TeeMarketPlaceOrderParams(int i, int i2, String str, String str2, StrategyType strategyType, String str3, String str4, String str5, String str6, TpslConfig tpslConfig, String str7, String str8, Boolean bool, String str9, String str10, ServiceFeeInfo serviceFeeInfo, TradeMode tradeMode, TraceData traceData, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, List list, String str23, String str24, String str25, String str26, String str27, ReferralParam referralParam, boolean z, boolean z2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((-1073725436 != (i & (-1073725436))) | (5 != (i2 & 5))) {
            PluginExceptionsKt.throwArrayMissingFieldException(new int[]{i, i2}, new int[]{-1073725436, 5}, TeeMarketPlaceOrderParams$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.teeId = "";
        } else {
            this.teeId = str;
        }
        if ((i & 2) == 0) {
            this.walletAddress = "";
        } else {
            this.walletAddress = str2;
        }
        this.strategyType = strategyType;
        if ((i & 8) == 0) {
            this.maxSlippage = null;
        } else {
            this.maxSlippage = str3;
        }
        if ((i & 16) == 0) {
            this.priorityFeeType = "";
        } else {
            this.priorityFeeType = str4;
        }
        if ((i & 32) == 0) {
            this.priorityFee = "";
        } else {
            this.priorityFee = str5;
        }
        if ((i & 64) == 0) {
            this.routerModeType = null;
        } else {
            this.routerModeType = str6;
        }
        if ((i & 128) == 0) {
            this.tpslConfig = null;
        } else {
            this.tpslConfig = tpslConfig;
        }
        if ((i & 256) == 0) {
            this.orderSource = null;
        } else {
            this.orderSource = str7;
        }
        if ((i & 512) == 0) {
            this.gasPrice = null;
        } else {
            this.gasPrice = str8;
        }
        if ((i & 1024) == 0) {
            this.enableJito = null;
        } else {
            this.enableJito = bool;
        }
        if ((i & 2048) == 0) {
            this.gasUsed = "";
        } else {
            this.gasUsed = str9;
        }
        if ((i & 4096) == 0) {
            this.mevInfo = null;
        } else {
            this.mevInfo = str10;
        }
        if ((i & 8192) == 0) {
            this.serviceFeeInfo = null;
        } else {
            this.serviceFeeInfo = serviceFeeInfo;
        }
        this.tradeMode = tradeMode;
        if ((32768 & i) == 0) {
            this.traceData = null;
        } else {
            this.traceData = traceData;
        }
        if ((65536 & i) == 0) {
            this.direction = "";
        } else {
            this.direction = str11;
        }
        if ((131072 & i) == 0) {
            this.chainId = "";
        } else {
            this.chainId = str12;
        }
        if ((262144 & i) == 0) {
            this.chainName = "";
        } else {
            this.chainName = str13;
        }
        if ((524288 & i) == 0) {
            this.businessType = "";
        } else {
            this.businessType = str14;
        }
        if ((1048576 & i) == 0) {
            this.fromTokenAddress = "";
        } else {
            this.fromTokenAddress = str15;
        }
        if ((2097152 & i) == 0) {
            this.toTokenAddress = "";
        } else {
            this.toTokenAddress = str16;
        }
        if ((4194304 & i) == 0) {
            this.amount = "";
        } else {
            this.amount = str17;
        }
        if ((8388608 & i) == 0) {
            this.slippageType = "";
        } else {
            this.slippageType = str18;
        }
        if ((16777216 & i) == 0) {
            this.slippage = "";
        } else {
            this.slippage = str19;
        }
        if ((33554432 & i) == 0) {
            this.userWalletAddress = "";
        } else {
            this.userWalletAddress = str20;
        }
        if ((67108864 & i) == 0) {
            this.accountId = "";
        } else {
            this.accountId = str21;
        }
        if ((134217728 & i) == 0) {
            this.toAmount = "";
        } else {
            this.toAmount = str22;
        }
        this.dexRouterList = (268435456 & i) == 0 ? yDY.AhwBna() : list;
        if ((i & 536870912) == 0) {
            this.expireTime = "";
        } else {
            this.expireTime = str23;
        }
        this.fromTokenDecimals = str24;
        this.toTokenDecimals = str25;
        this.minimumReceived = str26;
        if ((i2 & 2) == 0) {
            this.quoteId = "";
        } else {
            this.quoteId = str27;
        }
        this.refParam = referralParam;
        if ((i2 & 8) == 0) {
            this.isOKXPlatform = false;
        } else {
            this.isOKXPlatform = z;
        }
        if ((i2 & 16) == 0) {
            this.isAutoConfirmQuotaRemaining = false;
        } else {
            this.isAutoConfirmQuotaRemaining = z2;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(TeeMarketPlaceOrderParams teeMarketPlaceOrderParams, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) teeMarketPlaceOrderParams.teeId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, teeMarketPlaceOrderParams.teeId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) teeMarketPlaceOrderParams.walletAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, teeMarketPlaceOrderParams.walletAddress);
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], teeMarketPlaceOrderParams.strategyType);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || teeMarketPlaceOrderParams.maxSlippage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, teeMarketPlaceOrderParams.maxSlippage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) teeMarketPlaceOrderParams.priorityFeeType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, teeMarketPlaceOrderParams.priorityFeeType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) teeMarketPlaceOrderParams.priorityFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, teeMarketPlaceOrderParams.priorityFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || teeMarketPlaceOrderParams.routerModeType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, teeMarketPlaceOrderParams.routerModeType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || teeMarketPlaceOrderParams.tpslConfig != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, TpslConfig$$serializer.INSTANCE, teeMarketPlaceOrderParams.tpslConfig);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || teeMarketPlaceOrderParams.orderSource != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, teeMarketPlaceOrderParams.orderSource);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || teeMarketPlaceOrderParams.gasPrice != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, teeMarketPlaceOrderParams.gasPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || teeMarketPlaceOrderParams.enableJito != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, BooleanSerializer.INSTANCE, teeMarketPlaceOrderParams.enableJito);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) teeMarketPlaceOrderParams.gasUsed, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, teeMarketPlaceOrderParams.gasUsed);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || teeMarketPlaceOrderParams.mevInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, teeMarketPlaceOrderParams.mevInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || teeMarketPlaceOrderParams.serviceFeeInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, ServiceFeeInfo$$serializer.INSTANCE, teeMarketPlaceOrderParams.serviceFeeInfo);
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 14, kSerializerArr[14], teeMarketPlaceOrderParams.tradeMode);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || teeMarketPlaceOrderParams.traceData != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, TraceData$$serializer.INSTANCE, teeMarketPlaceOrderParams.traceData);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) teeMarketPlaceOrderParams.direction, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, teeMarketPlaceOrderParams.direction);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) teeMarketPlaceOrderParams.chainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 17, teeMarketPlaceOrderParams.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd((Object) teeMarketPlaceOrderParams.chainName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 18, teeMarketPlaceOrderParams.chainName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd((Object) teeMarketPlaceOrderParams.businessType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 19, teeMarketPlaceOrderParams.businessType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd((Object) teeMarketPlaceOrderParams.fromTokenAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 20, teeMarketPlaceOrderParams.fromTokenAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !Intrinsics.EZpvd((Object) teeMarketPlaceOrderParams.toTokenAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 21, teeMarketPlaceOrderParams.toTokenAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || !Intrinsics.EZpvd((Object) teeMarketPlaceOrderParams.amount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 22, teeMarketPlaceOrderParams.amount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || !Intrinsics.EZpvd((Object) teeMarketPlaceOrderParams.slippageType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 23, teeMarketPlaceOrderParams.slippageType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || !Intrinsics.EZpvd((Object) teeMarketPlaceOrderParams.slippage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 24, teeMarketPlaceOrderParams.slippage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || !Intrinsics.EZpvd((Object) teeMarketPlaceOrderParams.userWalletAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 25, teeMarketPlaceOrderParams.userWalletAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || !Intrinsics.EZpvd((Object) teeMarketPlaceOrderParams.accountId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 26, teeMarketPlaceOrderParams.accountId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || !Intrinsics.EZpvd((Object) teeMarketPlaceOrderParams.toAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 27, teeMarketPlaceOrderParams.toAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || !Intrinsics.EZpvd(teeMarketPlaceOrderParams.dexRouterList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 28, kSerializerArr[28], teeMarketPlaceOrderParams.dexRouterList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || !Intrinsics.EZpvd((Object) teeMarketPlaceOrderParams.expireTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 29, teeMarketPlaceOrderParams.expireTime);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 30, teeMarketPlaceOrderParams.fromTokenDecimals);
        compositeEncoder.encodeStringElement(serialDescriptor, 31, teeMarketPlaceOrderParams.toTokenDecimals);
        compositeEncoder.encodeStringElement(serialDescriptor, 32, teeMarketPlaceOrderParams.minimumReceived);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) || !Intrinsics.EZpvd((Object) teeMarketPlaceOrderParams.quoteId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 33, teeMarketPlaceOrderParams.quoteId);
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 34, ReferralParam$$serializer.INSTANCE, teeMarketPlaceOrderParams.refParam);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 35) || teeMarketPlaceOrderParams.isOKXPlatform) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 35, teeMarketPlaceOrderParams.isOKXPlatform);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 36) || teeMarketPlaceOrderParams.isAutoConfirmQuotaRemaining) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 36, teeMarketPlaceOrderParams.isAutoConfirmQuotaRemaining);
        }
    }

    public TeeMarketPlaceOrderParams(@NotNull String str, @NotNull String str2, @NotNull StrategyType strategyType, String str3, @NotNull String str4, @NotNull String str5, String str6, TpslConfig tpslConfig, String str7, String str8, Boolean bool, @NotNull String str9, String str10, ServiceFeeInfo serviceFeeInfo, @NotNull TradeMode tradeMode, TraceData traceData, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull List<DexRouterList> list, @NotNull String str23, @NotNull String str24, @NotNull String str25, @NotNull String str26, @NotNull String str27, @NotNull ReferralParam referralParam, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(strategyType, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(tradeMode, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str20, "");
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(str22, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str23, "");
        Intrinsics.checkNotNullParameter(str24, "");
        Intrinsics.checkNotNullParameter(str25, "");
        Intrinsics.checkNotNullParameter(str26, "");
        Intrinsics.checkNotNullParameter(str27, "");
        Intrinsics.checkNotNullParameter(referralParam, "");
        this.teeId = str;
        this.walletAddress = str2;
        this.strategyType = strategyType;
        this.maxSlippage = str3;
        this.priorityFeeType = str4;
        this.priorityFee = str5;
        this.routerModeType = str6;
        this.tpslConfig = tpslConfig;
        this.orderSource = str7;
        this.gasPrice = str8;
        this.enableJito = bool;
        this.gasUsed = str9;
        this.mevInfo = str10;
        this.serviceFeeInfo = serviceFeeInfo;
        this.tradeMode = tradeMode;
        this.traceData = traceData;
        this.direction = str11;
        this.chainId = str12;
        this.chainName = str13;
        this.businessType = str14;
        this.fromTokenAddress = str15;
        this.toTokenAddress = str16;
        this.amount = str17;
        this.slippageType = str18;
        this.slippage = str19;
        this.userWalletAddress = str20;
        this.accountId = str21;
        this.toAmount = str22;
        this.dexRouterList = list;
        this.expireTime = str23;
        this.fromTokenDecimals = str24;
        this.toTokenDecimals = str25;
        this.minimumReceived = str26;
        this.quoteId = str27;
        this.refParam = referralParam;
        this.isOKXPlatform = z;
        this.isAutoConfirmQuotaRemaining = z2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0134: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r79v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r79v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r43v0 java.lang.String))
  (r44v0 com.okinc.business.dex.tee.domain.model.StrategyType)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r79v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r45v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r79v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r46v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r79v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r47v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r79v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r48v0 java.lang.String))
  (wrap:com.okinc.business.dex.tee.domain.model.TpslConfig:?: TERNARY null = ((wrap:int:0x0035: ARITH (r79v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dex.tee.domain.model.TpslConfig) : (r49v0 com.okinc.business.dex.tee.domain.model.TpslConfig))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003d: ARITH (r79v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r50v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0045: ARITH (r79v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r51v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x004d: ARITH (r79v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r52v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0055: ARITH (r79v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r53v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005d: ARITH (r79v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r54v0 java.lang.String))
  (wrap:com.okinc.business.dexlogic.bean.ServiceFeeInfo:?: TERNARY null = ((wrap:int:0x0066: ARITH (r79v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.ServiceFeeInfo) : (r55v0 com.okinc.business.dexlogic.bean.ServiceFeeInfo))
  (r56v0 com.okinc.business.dexlogic.bean.TradeMode)
  (wrap:com.okinc.business.dexlogic.bean.TraceData:?: TERNARY null = ((wrap:int:0x0072: ARITH (32768 int) & (r79v0 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.TraceData) : (r57v0 com.okinc.business.dexlogic.bean.TraceData))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007c: ARITH (65536 int) & (r79v0 int) A[WRAPPED]) != (0 int)) ? ("") : (r58v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0086: ARITH (131072 int) & (r79v0 int) A[WRAPPED]) != (0 int)) ? ("") : (r59v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0090: ARITH (262144 int) & (r79v0 int) A[WRAPPED]) != (0 int)) ? ("") : (r60v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x009a: ARITH (524288 int) & (r79v0 int) A[WRAPPED]) != (0 int)) ? ("") : (r61v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a4: ARITH (1048576 int) & (r79v0 int) A[WRAPPED]) != (0 int)) ? ("") : (r62v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ae: ARITH (2097152 int) & (r79v0 int) A[WRAPPED]) != (0 int)) ? ("") : (r63v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b8: ARITH (4194304 int) & (r79v0 int) A[WRAPPED]) != (0 int)) ? ("") : (r64v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00c2: ARITH (8388608 int) & (r79v0 int) A[WRAPPED]) != (0 int)) ? ("") : (r65v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00cc: ARITH (16777216 int) & (r79v0 int) A[WRAPPED]) != (0 int)) ? ("") : (r66v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00d6: ARITH (33554432 int) & (r79v0 int) A[WRAPPED]) != (0 int)) ? ("") : (r67v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00e0: ARITH (67108864 int) & (r79v0 int) A[WRAPPED]) != (0 int)) ? ("") : (r68v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ea: ARITH (134217728 int) & (r79v0 int) A[WRAPPED]) != (0 int)) ? ("") : (r69v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x00f4: ARITH (268435456 int) & (r79v0 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00fb: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:153)) : (r70v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0102: ARITH (r79v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? ("") : (r71v0 java.lang.String))
  (r72v0 java.lang.String)
  (r73v0 java.lang.String)
  (r74v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x010a: ARITH (r80v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r75v0 java.lang.String))
  (r76v0 com.okinc.business.dexlogic.main.swap.trade.referral.data.ReferralParam)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0113: ARITH (r80v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r77v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x011d: ARITH (r80v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r78v0 boolean))
 A[MD:(java.lang.String, java.lang.String, com.okinc.business.dex.tee.domain.model.StrategyType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dex.tee.domain.model.TpslConfig, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, com.okinc.business.dexlogic.bean.ServiceFeeInfo, com.okinc.business.dexlogic.bean.TradeMode, com.okinc.business.dexlogic.bean.TraceData, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.business.dexlogic.bean.DexRouterList>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dexlogic.main.swap.trade.referral.data.ReferralParam, boolean, boolean):void (m)] (LINE:124) call: com.okinc.business.dex.tee.domain.model.TeeMarketPlaceOrderParams.<init>(java.lang.String, java.lang.String, com.okinc.business.dex.tee.domain.model.StrategyType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dex.tee.domain.model.TpslConfig, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, com.okinc.business.dexlogic.bean.ServiceFeeInfo, com.okinc.business.dexlogic.bean.TradeMode, com.okinc.business.dexlogic.bean.TraceData, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dexlogic.main.swap.trade.referral.data.ReferralParam, boolean, boolean):void type: THIS */
    public /* synthetic */ TeeMarketPlaceOrderParams(String str, String str2, StrategyType strategyType, String str3, String str4, String str5, String str6, TpslConfig tpslConfig, String str7, String str8, Boolean bool, String str9, String str10, ServiceFeeInfo serviceFeeInfo, TradeMode tradeMode, TraceData traceData, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, List list, String str23, String str24, String str25, String str26, String str27, ReferralParam referralParam, boolean z, boolean z2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, strategyType, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : tpslConfig, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? null : str8, (i & 1024) != 0 ? null : bool, (i & 2048) != 0 ? "" : str9, (i & 4096) != 0 ? null : str10, (i & 8192) != 0 ? null : serviceFeeInfo, tradeMode, (32768 & i) != 0 ? null : traceData, (65536 & i) != 0 ? "" : str11, (131072 & i) != 0 ? "" : str12, (262144 & i) != 0 ? "" : str13, (524288 & i) != 0 ? "" : str14, (1048576 & i) != 0 ? "" : str15, (2097152 & i) != 0 ? "" : str16, (4194304 & i) != 0 ? "" : str17, (8388608 & i) != 0 ? "" : str18, (16777216 & i) != 0 ? "" : str19, (33554432 & i) != 0 ? "" : str20, (67108864 & i) != 0 ? "" : str21, (134217728 & i) != 0 ? "" : str22, (268435456 & i) != 0 ? yDY.AhwBna() : list, (i & 536870912) != 0 ? "" : str23, str24, str25, str26, (i2 & 2) != 0 ? "" : str27, referralParam, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? false : z2);
    }
}
