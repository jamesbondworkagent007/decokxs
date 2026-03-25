package com.okinc.business.dexlogic.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.AudioStats;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.business.dex.api.bean.TokenBase;
import com.okinc.business.dex.trade.order.domain.model.OrderSide;
import com.okinc.business.dex.trade.order.domain.model.OrderSubStatus;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedModeParams;
import com.okinc.business.trade.features.home.ui.cefi.common.TxDirection;
import java.math.RoundingMode;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C22420hey;
import o.C22822hmc;
import o.C23271hvA;
import o.C23313hvq;
import o.C25352ivB;
import o.C33129mqd;
import o.InterfaceC20067gZr;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class OrderDetailBean implements Parcelable, InterfaceC20067gZr {
    private String abnormalStatus;
    private final String approveMethod;
    private boolean assetDelay;
    private String assetDelayTime;
    private final String boostVolume;
    private final String boostWeight;
    private final DexMultiChildOrderInfoVo bridgeChildOrderDetailVo;
    private String bridgeEstimatedTime;
    private String bridgeFee;
    private String bridgeFeeUsd;
    private final OrderDetailDefiPlatformInfo defiPlatformInfo;
    private DexGasStationFeeDetailVOX dexGasStationFeeDetailVO;
    private String estimateBridgeFeeAmount;
    private String estimateBridgeFeeAmountUsd;
    private String estimatedTime;
    private final String expireTime;
    private String finalExploreUrl;
    private String forRefuelFromAmount;
    private String freeGas;
    private final String from;
    private final String fromAmount;
    private final String fromChainId;
    private final String fromChainLogoUrl;
    private final String fromChainName;
    private final DexMultiChildOrderInfoVo fromChildOrderDetailVo;
    private String fromEstimatedTime;
    private String fromGasTokenPriceUsd;
    private final String fromIcon;
    private final String fromSwapMevInfo;
    private final String fromTokenAddress;
    private final boolean fromTokenIsCurrency;
    private final String fromTokenSymbol;
    private DexGasStationActivity gasStationActivityReward;
    private final String hiddenFromOrder;
    private boolean hiddenOtherFee;
    private final String isDisplayServiceFee;
    private final int isHasSaving;
    private final int isHasSurplus;
    private boolean isMemeTimeOut;
    private final String isNativeToken;
    private final String isNativeToken4FromToken;
    private String mevInfo;
    private String nativeTokenSymbol;
    private String networkFee;
    private String orderCompletionTime;
    private final String orderId;
    private final String orderType;
    private final String originBridgeEstimatedTime;
    private final String originFromEstimatedTime;
    private String otherFees;
    private String price;
    private final String priorityFee;
    private final String quoteToAmount;
    private final String quoteToValueUsd;
    private String receiveTokenAmount;
    private String receiveTokenExploreUrl;
    private String receiveTokenStatus;
    private String receiveTokenSymbol;
    private String receiveTokenTxHash;
    private String receiveWalletAddress;
    private RelativeTransactionVO relativeTransaction;
    private final String savingValueUSD;
    private String serviceFee;
    private String serviceFeeRate;
    private final String serviceFeeSwitch;
    private String serviceFeeTokenSymbol;
    private String serviceFeeUsd;
    private final String slippageValue;
    private final String specialOrderType;
    private String status;
    private final int strategyMode;
    private final String surplusAmount;
    private final String surplusValueUSD;
    private final String swapTradeType;
    private final String time;
    private final String timeoutTimestamp;
    private String toAmount;
    private final String toAmountValueUsd;
    private final String toChainId;
    private final String toChainLogoUrl;
    private final String toChainName;
    private final String toChainNativeTokenSymbol;
    private final DexMultiChildOrderInfoVo toChildOrderDetailVo;
    private String toGasTokenPriceUsd;
    private final String toIcon;
    private String toSwapFee;
    private final String toSwapMevInfo;
    private final String toSwapServiceFee;
    private final String toSwapServiceFeeTokenSymbol;
    private final String toSwapServiceFeeUsd;
    private final String toTokenAddress;
    private final boolean toTokenIsCurrency;
    private final String toTokenSymbol;
    private final String totalSlippage;
    private final int tradeMode;
    private String transactionHash;
    private final String transactionTypeMultiLanguage;

    @SerializedName(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION)
    private final String txDirection;
    private String willNeedManualClaim;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<OrderDetailBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<OrderDetailBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OrderDetailBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new OrderDetailBean(parcel.readInt() == 0 ? null : DexMultiChildOrderInfoVo.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : DexMultiChildOrderInfoVo.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : DexMultiChildOrderInfoVo.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : DexGasStationActivity.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : RelativeTransactionVO.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : OrderDetailDefiPlatformInfo.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readInt() == 0 ? null : DexGasStationFeeDetailVOX.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OrderDetailBean[] newArray(int i) {
            return new OrderDetailBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OrderDetailBean() {
        this((DexMultiChildOrderInfoVo) null, (String) null, (String) null, (String) null, (DexMultiChildOrderInfoVo) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (DexMultiChildOrderInfoVo) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (DexGasStationActivity) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (RelativeTransactionVO) null, (String) null, false, false, (String) null, (String) null, (OrderDetailDefiPlatformInfo) null, 0, (DexGasStationFeeDetailVOX) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, false, (String) null, (String) null, (String) null, (String) null, 0, (String) null, (String) null, 0, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, -1, -1, -1, 7, (DefaultConstructorMarker) null);
    }

    @SerialName(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION)
    public static /* synthetic */ void getTxDirection$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiChildOrderInfoVo component1() {
        return this.bridgeChildOrderDetailVo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.willNeedManualClaim;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.swapTradeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.time;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.toAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.toChainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.toChainLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiChildOrderInfoVo component16() {
        return this.toChildOrderDetailVo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.toIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.toTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.transactionHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.fromAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.networkFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.otherFees;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.fromChainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.toChainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.nativeTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component27() {
        return this.expireTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component28() {
        return this.receiveTokenStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component29() {
        return this.receiveTokenTxHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.fromChainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component30() {
        return this.receiveTokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component31() {
        return this.receiveTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component32() {
        return this.receiveWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component33() {
        return this.receiveTokenExploreUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component34() {
        return this.abnormalStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component35() {
        return this.hiddenFromOrder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component36() {
        return this.estimatedTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component37() {
        return this.bridgeFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component38() {
        return this.toSwapFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component39() {
        return this.toChainNativeTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.fromChainLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component40() {
        return this.hiddenOtherFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component41() {
        return this.forRefuelFromAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexGasStationActivity component42() {
        return this.gasStationActivityReward;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component43() {
        return this.fromGasTokenPriceUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component44() {
        return this.toGasTokenPriceUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component45() {
        return this.finalExploreUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component46() {
        return this.timeoutTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component47() {
        return this.orderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component48() {
        return this.specialOrderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component49() {
        return this.freeGas;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiChildOrderInfoVo component5() {
        return this.fromChildOrderDetailVo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component50() {
        return this.fromEstimatedTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component51() {
        return this.bridgeEstimatedTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component52() {
        return this.originFromEstimatedTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component53() {
        return this.estimateBridgeFeeAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component54() {
        return this.estimateBridgeFeeAmountUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component55() {
        return this.bridgeFeeUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component56() {
        return this.originBridgeEstimatedTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component57() {
        return this.orderCompletionTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component58() {
        return this.isNativeToken4FromToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component59() {
        return this.isNativeToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.fromIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component60() {
        return this.fromTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component61() {
        return this.toTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component62() {
        return this.mevInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component63() {
        return this.fromSwapMevInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component64() {
        return this.toSwapMevInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RelativeTransactionVO component65() {
        return this.relativeTransaction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component66() {
        return this.priorityFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component67() {
        return this.isMemeTimeOut;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component68() {
        return this.assetDelay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component69() {
        return this.assetDelayTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.fromTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component70() {
        return this.totalSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OrderDetailDefiPlatformInfo component71() {
        return this.defiPlatformInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component72() {
        return this.tradeMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexGasStationFeeDetailVOX component73() {
        return this.dexGasStationFeeDetailVO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component74() {
        return this.serviceFeeUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component75() {
        return this.serviceFeeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component76() {
        return this.serviceFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component77() {
        return this.serviceFeeTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component78() {
        return this.isDisplayServiceFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component79() {
        return this.toSwapServiceFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component80() {
        return this.toSwapServiceFeeUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component81() {
        return this.toSwapServiceFeeTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component82() {
        return this.serviceFeeSwitch;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component83() {
        return this.fromTokenIsCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component84() {
        return this.toTokenIsCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component85() {
        return this.txDirection;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component86() {
        return this.approveMethod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component87() {
        return this.transactionTypeMultiLanguage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component88() {
        return this.slippageValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component89() {
        return this.strategyMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component90() {
        return this.boostVolume;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component91() {
        return this.boostWeight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component92() {
        return this.isHasSaving;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component93() {
        return this.isHasSurplus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component94() {
        return this.savingValueUSD;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component95() {
        return this.surplusAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component96() {
        return this.surplusValueUSD;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component97() {
        return this.toAmountValueUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component98() {
        return this.quoteToAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component99() {
        return this.quoteToValueUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OrderDetailBean copy(DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, @NotNull String str, @NotNull String str2, @NotNull String str3, DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo2, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo3, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, @NotNull String str25, @NotNull String str26, @NotNull String str27, @NotNull String str28, String str29, @NotNull String str30, @NotNull String str31, @NotNull String str32, @NotNull String str33, @NotNull String str34, @NotNull String str35, @NotNull String str36, boolean z, @NotNull String str37, DexGasStationActivity dexGasStationActivity, @NotNull String str38, @NotNull String str39, @NotNull String str40, @NotNull String str41, @NotNull String str42, @NotNull String str43, @NotNull String str44, @NotNull String str45, @NotNull String str46, @NotNull String str47, @NotNull String str48, @NotNull String str49, @NotNull String str50, @NotNull String str51, @NotNull String str52, @NotNull String str53, @NotNull String str54, @NotNull String str55, @NotNull String str56, @NotNull String str57, String str58, String str59, RelativeTransactionVO relativeTransactionVO, @NotNull String str60, boolean z2, boolean z3, @NotNull String str61, @NotNull String str62, OrderDetailDefiPlatformInfo orderDetailDefiPlatformInfo, int i, DexGasStationFeeDetailVOX dexGasStationFeeDetailVOX, @NotNull String str63, @NotNull String str64, @NotNull String str65, @NotNull String str66, @NotNull String str67, @NotNull String str68, @NotNull String str69, @NotNull String str70, @NotNull String str71, boolean z4, boolean z5, @NotNull String str72, @NotNull String str73, @NotNull String str74, @NotNull String str75, int i2, @NotNull String str76, @NotNull String str77, int i3, int i4, @NotNull String str78, @NotNull String str79, @NotNull String str80, @NotNull String str81, @NotNull String str82, @NotNull String str83) {
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
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str20, "");
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(str22, "");
        Intrinsics.checkNotNullParameter(str23, "");
        Intrinsics.checkNotNullParameter(str24, "");
        Intrinsics.checkNotNullParameter(str25, "");
        Intrinsics.checkNotNullParameter(str26, "");
        Intrinsics.checkNotNullParameter(str27, "");
        Intrinsics.checkNotNullParameter(str28, "");
        Intrinsics.checkNotNullParameter(str30, "");
        Intrinsics.checkNotNullParameter(str31, "");
        Intrinsics.checkNotNullParameter(str32, "");
        Intrinsics.checkNotNullParameter(str33, "");
        Intrinsics.checkNotNullParameter(str34, "");
        Intrinsics.checkNotNullParameter(str35, "");
        Intrinsics.checkNotNullParameter(str36, "");
        Intrinsics.checkNotNullParameter(str37, "");
        Intrinsics.checkNotNullParameter(str38, "");
        Intrinsics.checkNotNullParameter(str39, "");
        Intrinsics.checkNotNullParameter(str40, "");
        Intrinsics.checkNotNullParameter(str41, "");
        Intrinsics.checkNotNullParameter(str42, "");
        Intrinsics.checkNotNullParameter(str43, "");
        Intrinsics.checkNotNullParameter(str44, "");
        Intrinsics.checkNotNullParameter(str45, "");
        Intrinsics.checkNotNullParameter(str46, "");
        Intrinsics.checkNotNullParameter(str47, "");
        Intrinsics.checkNotNullParameter(str48, "");
        Intrinsics.checkNotNullParameter(str49, "");
        Intrinsics.checkNotNullParameter(str50, "");
        Intrinsics.checkNotNullParameter(str51, "");
        Intrinsics.checkNotNullParameter(str52, "");
        Intrinsics.checkNotNullParameter(str53, "");
        Intrinsics.checkNotNullParameter(str54, "");
        Intrinsics.checkNotNullParameter(str55, "");
        Intrinsics.checkNotNullParameter(str56, "");
        Intrinsics.checkNotNullParameter(str57, "");
        Intrinsics.checkNotNullParameter(str60, "");
        Intrinsics.checkNotNullParameter(str61, "");
        Intrinsics.checkNotNullParameter(str62, "");
        Intrinsics.checkNotNullParameter(str63, "");
        Intrinsics.checkNotNullParameter(str64, "");
        Intrinsics.checkNotNullParameter(str65, "");
        Intrinsics.checkNotNullParameter(str66, "");
        Intrinsics.checkNotNullParameter(str67, "");
        Intrinsics.checkNotNullParameter(str68, "");
        Intrinsics.checkNotNullParameter(str69, "");
        Intrinsics.checkNotNullParameter(str70, "");
        Intrinsics.checkNotNullParameter(str71, "");
        Intrinsics.checkNotNullParameter(str72, "");
        Intrinsics.checkNotNullParameter(str73, "");
        Intrinsics.checkNotNullParameter(str74, "");
        Intrinsics.checkNotNullParameter(str75, "");
        Intrinsics.checkNotNullParameter(str76, "");
        Intrinsics.checkNotNullParameter(str77, "");
        Intrinsics.checkNotNullParameter(str78, "");
        Intrinsics.checkNotNullParameter(str79, "");
        Intrinsics.checkNotNullParameter(str80, "");
        Intrinsics.checkNotNullParameter(str81, "");
        Intrinsics.checkNotNullParameter(str82, "");
        Intrinsics.checkNotNullParameter(str83, "");
        return new OrderDetailBean(dexMultiChildOrderInfoVo, str, str2, str3, dexMultiChildOrderInfoVo2, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, dexMultiChildOrderInfoVo3, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, str35, str36, z, str37, dexGasStationActivity, str38, str39, str40, str41, str42, str43, str44, str45, str46, str47, str48, str49, str50, str51, str52, str53, str54, str55, str56, str57, str58, str59, relativeTransactionVO, str60, z2, z3, str61, str62, orderDetailDefiPlatformInfo, i, dexGasStationFeeDetailVOX, str63, str64, str65, str66, str67, str68, str69, str70, str71, z4, z5, str72, str73, str74, str75, i2, str76, str77, i3, i4, str78, str79, str80, str81, str82, str83);
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
        if (!(obj instanceof OrderDetailBean)) {
            return false;
        }
        OrderDetailBean orderDetailBean = (OrderDetailBean) obj;
        return Intrinsics.EZpvd(this.bridgeChildOrderDetailVo, orderDetailBean.bridgeChildOrderDetailVo) && Intrinsics.EZpvd((Object) this.fromAmount, (Object) orderDetailBean.fromAmount) && Intrinsics.EZpvd((Object) this.fromChainId, (Object) orderDetailBean.fromChainId) && Intrinsics.EZpvd((Object) this.fromChainLogoUrl, (Object) orderDetailBean.fromChainLogoUrl) && Intrinsics.EZpvd(this.fromChildOrderDetailVo, orderDetailBean.fromChildOrderDetailVo) && Intrinsics.EZpvd((Object) this.fromIcon, (Object) orderDetailBean.fromIcon) && Intrinsics.EZpvd((Object) this.fromTokenSymbol, (Object) orderDetailBean.fromTokenSymbol) && Intrinsics.EZpvd((Object) this.orderId, (Object) orderDetailBean.orderId) && Intrinsics.EZpvd((Object) this.status, (Object) orderDetailBean.status) && Intrinsics.EZpvd((Object) this.willNeedManualClaim, (Object) orderDetailBean.willNeedManualClaim) && Intrinsics.EZpvd((Object) this.swapTradeType, (Object) orderDetailBean.swapTradeType) && Intrinsics.EZpvd((Object) this.time, (Object) orderDetailBean.time) && Intrinsics.EZpvd((Object) this.toAmount, (Object) orderDetailBean.toAmount) && Intrinsics.EZpvd((Object) this.toChainId, (Object) orderDetailBean.toChainId) && Intrinsics.EZpvd((Object) this.toChainLogoUrl, (Object) orderDetailBean.toChainLogoUrl) && Intrinsics.EZpvd(this.toChildOrderDetailVo, orderDetailBean.toChildOrderDetailVo) && Intrinsics.EZpvd((Object) this.toIcon, (Object) orderDetailBean.toIcon) && Intrinsics.EZpvd((Object) this.toTokenSymbol, (Object) orderDetailBean.toTokenSymbol) && Intrinsics.EZpvd((Object) this.transactionHash, (Object) orderDetailBean.transactionHash) && Intrinsics.EZpvd((Object) this.networkFee, (Object) orderDetailBean.networkFee) && Intrinsics.EZpvd((Object) this.otherFees, (Object) orderDetailBean.otherFees) && Intrinsics.EZpvd((Object) this.price, (Object) orderDetailBean.price) && Intrinsics.EZpvd((Object) this.from, (Object) orderDetailBean.from) && Intrinsics.EZpvd((Object) this.fromChainName, (Object) orderDetailBean.fromChainName) && Intrinsics.EZpvd((Object) this.toChainName, (Object) orderDetailBean.toChainName) && Intrinsics.EZpvd((Object) this.nativeTokenSymbol, (Object) orderDetailBean.nativeTokenSymbol) && Intrinsics.EZpvd((Object) this.expireTime, (Object) orderDetailBean.expireTime) && Intrinsics.EZpvd((Object) this.receiveTokenStatus, (Object) orderDetailBean.receiveTokenStatus) && Intrinsics.EZpvd((Object) this.receiveTokenTxHash, (Object) orderDetailBean.receiveTokenTxHash) && Intrinsics.EZpvd((Object) this.receiveTokenAmount, (Object) orderDetailBean.receiveTokenAmount) && Intrinsics.EZpvd((Object) this.receiveTokenSymbol, (Object) orderDetailBean.receiveTokenSymbol) && Intrinsics.EZpvd((Object) this.receiveWalletAddress, (Object) orderDetailBean.receiveWalletAddress) && Intrinsics.EZpvd((Object) this.receiveTokenExploreUrl, (Object) orderDetailBean.receiveTokenExploreUrl) && Intrinsics.EZpvd((Object) this.abnormalStatus, (Object) orderDetailBean.abnormalStatus) && Intrinsics.EZpvd((Object) this.hiddenFromOrder, (Object) orderDetailBean.hiddenFromOrder) && Intrinsics.EZpvd((Object) this.estimatedTime, (Object) orderDetailBean.estimatedTime) && Intrinsics.EZpvd((Object) this.bridgeFee, (Object) orderDetailBean.bridgeFee) && Intrinsics.EZpvd((Object) this.toSwapFee, (Object) orderDetailBean.toSwapFee) && Intrinsics.EZpvd((Object) this.toChainNativeTokenSymbol, (Object) orderDetailBean.toChainNativeTokenSymbol) && this.hiddenOtherFee == orderDetailBean.hiddenOtherFee && Intrinsics.EZpvd((Object) this.forRefuelFromAmount, (Object) orderDetailBean.forRefuelFromAmount) && Intrinsics.EZpvd(this.gasStationActivityReward, orderDetailBean.gasStationActivityReward) && Intrinsics.EZpvd((Object) this.fromGasTokenPriceUsd, (Object) orderDetailBean.fromGasTokenPriceUsd) && Intrinsics.EZpvd((Object) this.toGasTokenPriceUsd, (Object) orderDetailBean.toGasTokenPriceUsd) && Intrinsics.EZpvd((Object) this.finalExploreUrl, (Object) orderDetailBean.finalExploreUrl) && Intrinsics.EZpvd((Object) this.timeoutTimestamp, (Object) orderDetailBean.timeoutTimestamp) && Intrinsics.EZpvd((Object) this.orderType, (Object) orderDetailBean.orderType) && Intrinsics.EZpvd((Object) this.specialOrderType, (Object) orderDetailBean.specialOrderType) && Intrinsics.EZpvd((Object) this.freeGas, (Object) orderDetailBean.freeGas) && Intrinsics.EZpvd((Object) this.fromEstimatedTime, (Object) orderDetailBean.fromEstimatedTime) && Intrinsics.EZpvd((Object) this.bridgeEstimatedTime, (Object) orderDetailBean.bridgeEstimatedTime) && Intrinsics.EZpvd((Object) this.originFromEstimatedTime, (Object) orderDetailBean.originFromEstimatedTime) && Intrinsics.EZpvd((Object) this.estimateBridgeFeeAmount, (Object) orderDetailBean.estimateBridgeFeeAmount) && Intrinsics.EZpvd((Object) this.estimateBridgeFeeAmountUsd, (Object) orderDetailBean.estimateBridgeFeeAmountUsd) && Intrinsics.EZpvd((Object) this.bridgeFeeUsd, (Object) orderDetailBean.bridgeFeeUsd) && Intrinsics.EZpvd((Object) this.originBridgeEstimatedTime, (Object) orderDetailBean.originBridgeEstimatedTime) && Intrinsics.EZpvd((Object) this.orderCompletionTime, (Object) orderDetailBean.orderCompletionTime) && Intrinsics.EZpvd((Object) this.isNativeToken4FromToken, (Object) orderDetailBean.isNativeToken4FromToken) && Intrinsics.EZpvd((Object) this.isNativeToken, (Object) orderDetailBean.isNativeToken) && Intrinsics.EZpvd((Object) this.fromTokenAddress, (Object) orderDetailBean.fromTokenAddress) && Intrinsics.EZpvd((Object) this.toTokenAddress, (Object) orderDetailBean.toTokenAddress) && Intrinsics.EZpvd((Object) this.mevInfo, (Object) orderDetailBean.mevInfo) && Intrinsics.EZpvd((Object) this.fromSwapMevInfo, (Object) orderDetailBean.fromSwapMevInfo) && Intrinsics.EZpvd((Object) this.toSwapMevInfo, (Object) orderDetailBean.toSwapMevInfo) && Intrinsics.EZpvd(this.relativeTransaction, orderDetailBean.relativeTransaction) && Intrinsics.EZpvd((Object) this.priorityFee, (Object) orderDetailBean.priorityFee) && this.isMemeTimeOut == orderDetailBean.isMemeTimeOut && this.assetDelay == orderDetailBean.assetDelay && Intrinsics.EZpvd((Object) this.assetDelayTime, (Object) orderDetailBean.assetDelayTime) && Intrinsics.EZpvd((Object) this.totalSlippage, (Object) orderDetailBean.totalSlippage) && Intrinsics.EZpvd(this.defiPlatformInfo, orderDetailBean.defiPlatformInfo) && this.tradeMode == orderDetailBean.tradeMode && Intrinsics.EZpvd(this.dexGasStationFeeDetailVO, orderDetailBean.dexGasStationFeeDetailVO) && Intrinsics.EZpvd((Object) this.serviceFeeUsd, (Object) orderDetailBean.serviceFeeUsd) && Intrinsics.EZpvd((Object) this.serviceFeeRate, (Object) orderDetailBean.serviceFeeRate) && Intrinsics.EZpvd((Object) this.serviceFee, (Object) orderDetailBean.serviceFee) && Intrinsics.EZpvd((Object) this.serviceFeeTokenSymbol, (Object) orderDetailBean.serviceFeeTokenSymbol) && Intrinsics.EZpvd((Object) this.isDisplayServiceFee, (Object) orderDetailBean.isDisplayServiceFee) && Intrinsics.EZpvd((Object) this.toSwapServiceFee, (Object) orderDetailBean.toSwapServiceFee) && Intrinsics.EZpvd((Object) this.toSwapServiceFeeUsd, (Object) orderDetailBean.toSwapServiceFeeUsd) && Intrinsics.EZpvd((Object) this.toSwapServiceFeeTokenSymbol, (Object) orderDetailBean.toSwapServiceFeeTokenSymbol) && Intrinsics.EZpvd((Object) this.serviceFeeSwitch, (Object) orderDetailBean.serviceFeeSwitch) && this.fromTokenIsCurrency == orderDetailBean.fromTokenIsCurrency && this.toTokenIsCurrency == orderDetailBean.toTokenIsCurrency && Intrinsics.EZpvd((Object) this.txDirection, (Object) orderDetailBean.txDirection) && Intrinsics.EZpvd((Object) this.approveMethod, (Object) orderDetailBean.approveMethod) && Intrinsics.EZpvd((Object) this.transactionTypeMultiLanguage, (Object) orderDetailBean.transactionTypeMultiLanguage) && Intrinsics.EZpvd((Object) this.slippageValue, (Object) orderDetailBean.slippageValue) && this.strategyMode == orderDetailBean.strategyMode && Intrinsics.EZpvd((Object) this.boostVolume, (Object) orderDetailBean.boostVolume) && Intrinsics.EZpvd((Object) this.boostWeight, (Object) orderDetailBean.boostWeight) && this.isHasSaving == orderDetailBean.isHasSaving && this.isHasSurplus == orderDetailBean.isHasSurplus && Intrinsics.EZpvd((Object) this.savingValueUSD, (Object) orderDetailBean.savingValueUSD) && Intrinsics.EZpvd((Object) this.surplusAmount, (Object) orderDetailBean.surplusAmount) && Intrinsics.EZpvd((Object) this.surplusValueUSD, (Object) orderDetailBean.surplusValueUSD) && Intrinsics.EZpvd((Object) this.toAmountValueUsd, (Object) orderDetailBean.toAmountValueUsd) && Intrinsics.EZpvd((Object) this.quoteToAmount, (Object) orderDetailBean.quoteToAmount) && Intrinsics.EZpvd((Object) this.quoteToValueUsd, (Object) orderDetailBean.quoteToValueUsd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAbnormalStatus() {
        return this.abnormalStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getApproveMethod() {
        return this.approveMethod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getAssetDelay() {
        return this.assetDelay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAssetDelayTime() {
        return this.assetDelayTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBoostVolume() {
        return this.boostVolume;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBoostWeight() {
        return this.boostWeight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiChildOrderInfoVo getBridgeChildOrderDetailVo() {
        return this.bridgeChildOrderDetailVo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBridgeEstimatedTime() {
        return this.bridgeEstimatedTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBridgeFee() {
        return this.bridgeFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBridgeFeeUsd() {
        return this.bridgeFeeUsd;
    }

    @Override // o.InterfaceC20067gZr
    public boolean getCanResume() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC20067gZr
    public String getChainId() {
        return this.fromChainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC20067gZr
    public String getChainLogo() {
        return this.fromChainLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC20067gZr
    public String getChainName() {
        return this.fromChainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC20067gZr
    public String getCreateTime() {
        return this.time;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OrderDetailDefiPlatformInfo getDefiPlatformInfo() {
        return this.defiPlatformInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexGasStationFeeDetailVOX getDexGasStationFeeDetailVO() {
        return this.dexGasStationFeeDetailVO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEstimateBridgeFeeAmount() {
        return this.estimateBridgeFeeAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEstimateBridgeFeeAmountUsd() {
        return this.estimateBridgeFeeAmountUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEstimatedTime() {
        return this.estimatedTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExpireTime() {
        return this.expireTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFinalExploreUrl() {
        return this.finalExploreUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getForRefuelFromAmount() {
        return this.forRefuelFromAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFreeGas() {
        return this.freeGas;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFrom() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromAmount() {
        return this.fromAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromChainId() {
        return this.fromChainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromChainLogoUrl() {
        return this.fromChainLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromChainName() {
        return this.fromChainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiChildOrderInfoVo getFromChildOrderDetailVo() {
        return this.fromChildOrderDetailVo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromEstimatedTime() {
        return this.fromEstimatedTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromGasTokenPriceUsd() {
        return this.fromGasTokenPriceUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromIcon() {
        return this.fromIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC20067gZr
    public boolean getFromIsCurrency() {
        return this.fromTokenIsCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromSwapMevInfo() {
        return this.fromSwapMevInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC20067gZr
    public String getFromTokenAddress() {
        return this.fromTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC20067gZr
    public String getFromTokenAmount() {
        return this.fromAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getFromTokenIsCurrency() {
        return this.fromTokenIsCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC20067gZr
    public String getFromTokenLogo() {
        return this.fromIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC20067gZr
    public String getFromTokenSymbol() {
        return this.fromTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexGasStationActivity getGasStationActivityReward() {
        return this.gasStationActivityReward;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHiddenFromOrder() {
        return this.hiddenFromOrder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getHiddenOtherFee() {
        return this.hiddenOtherFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMevInfo() {
        return this.mevInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNativeTokenSymbol() {
        return this.nativeTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetworkFee() {
        return this.networkFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderCompletionTime() {
        return this.orderCompletionTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC20067gZr
    public String getOrderId() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderType() {
        return this.orderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOriginBridgeEstimatedTime() {
        return this.originBridgeEstimatedTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOriginFromEstimatedTime() {
        return this.originFromEstimatedTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOtherFees() {
        return this.otherFees;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrice() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPriorityFee() {
        return this.priorityFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteToAmount() {
        return this.quoteToAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteToValueUsd() {
        return this.quoteToValueUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReceiveTokenAmount() {
        return this.receiveTokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReceiveTokenExploreUrl() {
        return this.receiveTokenExploreUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReceiveTokenStatus() {
        return this.receiveTokenStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReceiveTokenSymbol() {
        return this.receiveTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReceiveTokenTxHash() {
        return this.receiveTokenTxHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReceiveWalletAddress() {
        return this.receiveWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RelativeTransactionVO getRelativeTransaction() {
        return this.relativeTransaction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSavingValueUSD() {
        return this.savingValueUSD;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getServiceFee() {
        return this.serviceFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getServiceFeeRate() {
        return this.serviceFeeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getServiceFeeSwitch() {
        return this.serviceFeeSwitch;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getServiceFeeTokenSymbol() {
        return this.serviceFeeTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getServiceFeeUsd() {
        return this.serviceFeeUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlippageValue() {
        return this.slippageValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSpecialOrderType() {
        return this.specialOrderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC20067gZr
    public int getStrategyMode() {
        return this.strategyMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSurplusAmount() {
        return this.surplusAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSurplusValueUSD() {
        return this.surplusValueUSD;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSwapTradeType() {
        return this.swapTradeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTime() {
        return this.time;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTimeoutTimestamp() {
        return this.timeoutTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToAmount() {
        return this.toAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToAmountValueUsd() {
        return this.toAmountValueUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToChainId() {
        return this.toChainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToChainLogoUrl() {
        return this.toChainLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToChainName() {
        return this.toChainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToChainNativeTokenSymbol() {
        return this.toChainNativeTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiChildOrderInfoVo getToChildOrderDetailVo() {
        return this.toChildOrderDetailVo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToGasTokenPriceUsd() {
        return this.toGasTokenPriceUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToIcon() {
        return this.toIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC20067gZr
    public boolean getToIsCurrency() {
        return this.toTokenIsCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToSwapFee() {
        return this.toSwapFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToSwapMevInfo() {
        return this.toSwapMevInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToSwapServiceFee() {
        return this.toSwapServiceFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToSwapServiceFeeTokenSymbol() {
        return this.toSwapServiceFeeTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToSwapServiceFeeUsd() {
        return this.toSwapServiceFeeUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC20067gZr
    public String getToTokenAddress() {
        return this.toTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC20067gZr
    public String getToTokenCurrencyAmount() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getToTokenIsCurrency() {
        return this.toTokenIsCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC20067gZr
    public String getToTokenLogo() {
        return this.toIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC20067gZr
    public String getToTokenSymbol() {
        return this.toTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalSlippage() {
        return this.totalSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTradeMode() {
        return this.tradeMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTransactionHash() {
        return this.transactionHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTransactionTypeMultiLanguage() {
        return this.transactionTypeMultiLanguage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTxDirection() {
        return this.txDirection;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWillNeedManualClaim() {
        return this.willNeedManualClaim;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo = this.bridgeChildOrderDetailVo;
        int iHashCode = dexMultiChildOrderInfoVo == null ? 0 : dexMultiChildOrderInfoVo.hashCode();
        int iHashCode2 = this.fromAmount.hashCode();
        int iHashCode3 = this.fromChainId.hashCode();
        int iHashCode4 = this.fromChainLogoUrl.hashCode();
        DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo2 = this.fromChildOrderDetailVo;
        int iHashCode5 = dexMultiChildOrderInfoVo2 == null ? 0 : dexMultiChildOrderInfoVo2.hashCode();
        int iHashCode6 = this.fromIcon.hashCode();
        int iHashCode7 = this.fromTokenSymbol.hashCode();
        int iHashCode8 = this.orderId.hashCode();
        int iHashCode9 = this.status.hashCode();
        int iHashCode10 = this.willNeedManualClaim.hashCode();
        int iHashCode11 = this.swapTradeType.hashCode();
        int iHashCode12 = this.time.hashCode();
        int iHashCode13 = this.toAmount.hashCode();
        int iHashCode14 = this.toChainId.hashCode();
        int iHashCode15 = this.toChainLogoUrl.hashCode();
        DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo3 = this.toChildOrderDetailVo;
        int iHashCode16 = dexMultiChildOrderInfoVo3 == null ? 0 : dexMultiChildOrderInfoVo3.hashCode();
        int iHashCode17 = this.toIcon.hashCode();
        int iHashCode18 = this.toTokenSymbol.hashCode();
        int iHashCode19 = this.transactionHash.hashCode();
        int iHashCode20 = this.networkFee.hashCode();
        int iHashCode21 = this.otherFees.hashCode();
        int iHashCode22 = this.price.hashCode();
        int iHashCode23 = this.from.hashCode();
        int iHashCode24 = this.fromChainName.hashCode();
        int iHashCode25 = this.toChainName.hashCode();
        int iHashCode26 = this.nativeTokenSymbol.hashCode();
        int iHashCode27 = this.expireTime.hashCode();
        int iHashCode28 = this.receiveTokenStatus.hashCode();
        int iHashCode29 = this.receiveTokenTxHash.hashCode();
        int iHashCode30 = this.receiveTokenAmount.hashCode();
        int iHashCode31 = this.receiveTokenSymbol.hashCode();
        String str = this.receiveWalletAddress;
        int iHashCode32 = str == null ? 0 : str.hashCode();
        int iHashCode33 = this.receiveTokenExploreUrl.hashCode();
        int iHashCode34 = this.abnormalStatus.hashCode();
        int iHashCode35 = this.hiddenFromOrder.hashCode();
        int iHashCode36 = this.estimatedTime.hashCode();
        int iHashCode37 = this.bridgeFee.hashCode();
        int iHashCode38 = this.toSwapFee.hashCode();
        int iHashCode39 = this.toChainNativeTokenSymbol.hashCode();
        int iHashCode40 = Boolean.hashCode(this.hiddenOtherFee);
        int iHashCode41 = this.forRefuelFromAmount.hashCode();
        DexGasStationActivity dexGasStationActivity = this.gasStationActivityReward;
        int iHashCode42 = dexGasStationActivity == null ? 0 : dexGasStationActivity.hashCode();
        int iHashCode43 = this.fromGasTokenPriceUsd.hashCode();
        int iHashCode44 = this.toGasTokenPriceUsd.hashCode();
        int iHashCode45 = this.finalExploreUrl.hashCode();
        int iHashCode46 = this.timeoutTimestamp.hashCode();
        int iHashCode47 = this.orderType.hashCode();
        int iHashCode48 = this.specialOrderType.hashCode();
        int iHashCode49 = this.freeGas.hashCode();
        int iHashCode50 = this.fromEstimatedTime.hashCode();
        int iHashCode51 = this.bridgeEstimatedTime.hashCode();
        int iHashCode52 = this.originFromEstimatedTime.hashCode();
        int iHashCode53 = this.estimateBridgeFeeAmount.hashCode();
        int iHashCode54 = this.estimateBridgeFeeAmountUsd.hashCode();
        int iHashCode55 = this.bridgeFeeUsd.hashCode();
        int iHashCode56 = this.originBridgeEstimatedTime.hashCode();
        int iHashCode57 = this.orderCompletionTime.hashCode();
        int iHashCode58 = this.isNativeToken4FromToken.hashCode();
        int iHashCode59 = this.isNativeToken.hashCode();
        int iHashCode60 = this.fromTokenAddress.hashCode();
        int iHashCode61 = this.toTokenAddress.hashCode();
        int iHashCode62 = this.mevInfo.hashCode();
        String str2 = this.fromSwapMevInfo;
        int iHashCode63 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.toSwapMevInfo;
        int iHashCode64 = str3 == null ? 0 : str3.hashCode();
        RelativeTransactionVO relativeTransactionVO = this.relativeTransaction;
        int iHashCode65 = relativeTransactionVO == null ? 0 : relativeTransactionVO.hashCode();
        int iHashCode66 = this.priorityFee.hashCode();
        int iHashCode67 = Boolean.hashCode(this.isMemeTimeOut);
        int iHashCode68 = Boolean.hashCode(this.assetDelay);
        int iHashCode69 = this.assetDelayTime.hashCode();
        int iHashCode70 = this.totalSlippage.hashCode();
        OrderDetailDefiPlatformInfo orderDetailDefiPlatformInfo = this.defiPlatformInfo;
        int iHashCode71 = orderDetailDefiPlatformInfo == null ? 0 : orderDetailDefiPlatformInfo.hashCode();
        int iHashCode72 = Integer.hashCode(this.tradeMode);
        DexGasStationFeeDetailVOX dexGasStationFeeDetailVOX = this.dexGasStationFeeDetailVO;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + iHashCode34) * 31) + iHashCode35) * 31) + iHashCode36) * 31) + iHashCode37) * 31) + iHashCode38) * 31) + iHashCode39) * 31) + iHashCode40) * 31) + iHashCode41) * 31) + iHashCode42) * 31) + iHashCode43) * 31) + iHashCode44) * 31) + iHashCode45) * 31) + iHashCode46) * 31) + iHashCode47) * 31) + iHashCode48) * 31) + iHashCode49) * 31) + iHashCode50) * 31) + iHashCode51) * 31) + iHashCode52) * 31) + iHashCode53) * 31) + iHashCode54) * 31) + iHashCode55) * 31) + iHashCode56) * 31) + iHashCode57) * 31) + iHashCode58) * 31) + iHashCode59) * 31) + iHashCode60) * 31) + iHashCode61) * 31) + iHashCode62) * 31) + iHashCode63) * 31) + iHashCode64) * 31) + iHashCode65) * 31) + iHashCode66) * 31) + iHashCode67) * 31) + iHashCode68) * 31) + iHashCode69) * 31) + iHashCode70) * 31) + iHashCode71) * 31) + iHashCode72) * 31) + (dexGasStationFeeDetailVOX == null ? 0 : dexGasStationFeeDetailVOX.hashCode())) * 31) + this.serviceFeeUsd.hashCode()) * 31) + this.serviceFeeRate.hashCode()) * 31) + this.serviceFee.hashCode()) * 31) + this.serviceFeeTokenSymbol.hashCode()) * 31) + this.isDisplayServiceFee.hashCode()) * 31) + this.toSwapServiceFee.hashCode()) * 31) + this.toSwapServiceFeeUsd.hashCode()) * 31) + this.toSwapServiceFeeTokenSymbol.hashCode()) * 31) + this.serviceFeeSwitch.hashCode()) * 31) + Boolean.hashCode(this.fromTokenIsCurrency)) * 31) + Boolean.hashCode(this.toTokenIsCurrency)) * 31) + this.txDirection.hashCode()) * 31) + this.approveMethod.hashCode()) * 31) + this.transactionTypeMultiLanguage.hashCode()) * 31) + this.slippageValue.hashCode()) * 31) + Integer.hashCode(this.strategyMode)) * 31) + this.boostVolume.hashCode()) * 31) + this.boostWeight.hashCode()) * 31) + Integer.hashCode(this.isHasSaving)) * 31) + Integer.hashCode(this.isHasSurplus)) * 31) + this.savingValueUSD.hashCode()) * 31) + this.surplusAmount.hashCode()) * 31) + this.surplusValueUSD.hashCode()) * 31) + this.toAmountValueUsd.hashCode()) * 31) + this.quoteToAmount.hashCode()) * 31) + this.quoteToValueUsd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isDisplayServiceFee() {
        return this.isDisplayServiceFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int isHasSaving() {
        return this.isHasSaving;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int isHasSurplus() {
        return this.isHasSurplus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isMemeTimeOut() {
        return this.isMemeTimeOut;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isNativeToken() {
        return this.isNativeToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isNativeToken4FromToken() {
        return this.isNativeToken4FromToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean orderHasSurplus() {
        return this.isHasSurplus == 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAbnormalStatus(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.abnormalStatus = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAssetDelay(boolean z) {
        this.assetDelay = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAssetDelayTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.assetDelayTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBridgeEstimatedTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.bridgeEstimatedTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBridgeFee(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.bridgeFee = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBridgeFeeUsd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.bridgeFeeUsd = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDexGasStationFeeDetailVO(DexGasStationFeeDetailVOX dexGasStationFeeDetailVOX) {
        this.dexGasStationFeeDetailVO = dexGasStationFeeDetailVOX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEstimateBridgeFeeAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.estimateBridgeFeeAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEstimateBridgeFeeAmountUsd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.estimateBridgeFeeAmountUsd = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEstimatedTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.estimatedTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFinalExploreUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.finalExploreUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setForRefuelFromAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.forRefuelFromAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFreeGas(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.freeGas = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFromEstimatedTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fromEstimatedTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFromGasTokenPriceUsd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fromGasTokenPriceUsd = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGasStationActivityReward(DexGasStationActivity dexGasStationActivity) {
        this.gasStationActivityReward = dexGasStationActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHiddenOtherFee(boolean z) {
        this.hiddenOtherFee = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMemeTimeOut(boolean z) {
        this.isMemeTimeOut = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMevInfo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.mevInfo = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNativeTokenSymbol(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.nativeTokenSymbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNetworkFee(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.networkFee = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrderCompletionTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.orderCompletionTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOtherFees(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.otherFees = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.price = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setReceiveTokenAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.receiveTokenAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setReceiveTokenExploreUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.receiveTokenExploreUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setReceiveTokenStatus(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.receiveTokenStatus = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setReceiveTokenSymbol(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.receiveTokenSymbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setReceiveTokenTxHash(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.receiveTokenTxHash = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setReceiveWalletAddress(String str) {
        this.receiveWalletAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRelativeTransaction(RelativeTransactionVO relativeTransactionVO) {
        this.relativeTransaction = relativeTransactionVO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setServiceFee(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.serviceFee = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setServiceFeeRate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.serviceFeeRate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setServiceFeeTokenSymbol(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.serviceFeeTokenSymbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setServiceFeeUsd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.serviceFeeUsd = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStatus(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.status = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setToAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.toAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setToGasTokenPriceUsd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.toGasTokenPriceUsd = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setToSwapFee(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.toSwapFee = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTransactionHash(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.transactionHash = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWillNeedManualClaim(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.willNeedManualClaim = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OrderDetailBean(bridgeChildOrderDetailVo=" + this.bridgeChildOrderDetailVo + ", fromAmount=" + this.fromAmount + ", fromChainId=" + this.fromChainId + ", fromChainLogoUrl=" + this.fromChainLogoUrl + ", fromChildOrderDetailVo=" + this.fromChildOrderDetailVo + ", fromIcon=" + this.fromIcon + ", fromTokenSymbol=" + this.fromTokenSymbol + ", orderId=" + this.orderId + ", status=" + this.status + ", willNeedManualClaim=" + this.willNeedManualClaim + ", swapTradeType=" + this.swapTradeType + ", time=" + this.time + ", toAmount=" + this.toAmount + ", toChainId=" + this.toChainId + ", toChainLogoUrl=" + this.toChainLogoUrl + ", toChildOrderDetailVo=" + this.toChildOrderDetailVo + ", toIcon=" + this.toIcon + ", toTokenSymbol=" + this.toTokenSymbol + ", transactionHash=" + this.transactionHash + ", networkFee=" + this.networkFee + ", otherFees=" + this.otherFees + ", price=" + this.price + ", from=" + this.from + ", fromChainName=" + this.fromChainName + ", toChainName=" + this.toChainName + ", nativeTokenSymbol=" + this.nativeTokenSymbol + ", expireTime=" + this.expireTime + ", receiveTokenStatus=" + this.receiveTokenStatus + ", receiveTokenTxHash=" + this.receiveTokenTxHash + ", receiveTokenAmount=" + this.receiveTokenAmount + ", receiveTokenSymbol=" + this.receiveTokenSymbol + ", receiveWalletAddress=" + this.receiveWalletAddress + ", receiveTokenExploreUrl=" + this.receiveTokenExploreUrl + ", abnormalStatus=" + this.abnormalStatus + ", hiddenFromOrder=" + this.hiddenFromOrder + ", estimatedTime=" + this.estimatedTime + ", bridgeFee=" + this.bridgeFee + ", toSwapFee=" + this.toSwapFee + ", toChainNativeTokenSymbol=" + this.toChainNativeTokenSymbol + ", hiddenOtherFee=" + this.hiddenOtherFee + ", forRefuelFromAmount=" + this.forRefuelFromAmount + ", gasStationActivityReward=" + this.gasStationActivityReward + ", fromGasTokenPriceUsd=" + this.fromGasTokenPriceUsd + ", toGasTokenPriceUsd=" + this.toGasTokenPriceUsd + ", finalExploreUrl=" + this.finalExploreUrl + ", timeoutTimestamp=" + this.timeoutTimestamp + ", orderType=" + this.orderType + ", specialOrderType=" + this.specialOrderType + ", freeGas=" + this.freeGas + ", fromEstimatedTime=" + this.fromEstimatedTime + ", bridgeEstimatedTime=" + this.bridgeEstimatedTime + ", originFromEstimatedTime=" + this.originFromEstimatedTime + ", estimateBridgeFeeAmount=" + this.estimateBridgeFeeAmount + ", estimateBridgeFeeAmountUsd=" + this.estimateBridgeFeeAmountUsd + ", bridgeFeeUsd=" + this.bridgeFeeUsd + ", originBridgeEstimatedTime=" + this.originBridgeEstimatedTime + ", orderCompletionTime=" + this.orderCompletionTime + ", isNativeToken4FromToken=" + this.isNativeToken4FromToken + ", isNativeToken=" + this.isNativeToken + ", fromTokenAddress=" + this.fromTokenAddress + ", toTokenAddress=" + this.toTokenAddress + ", mevInfo=" + this.mevInfo + ", fromSwapMevInfo=" + this.fromSwapMevInfo + ", toSwapMevInfo=" + this.toSwapMevInfo + ", relativeTransaction=" + this.relativeTransaction + ", priorityFee=" + this.priorityFee + ", isMemeTimeOut=" + this.isMemeTimeOut + ", assetDelay=" + this.assetDelay + ", assetDelayTime=" + this.assetDelayTime + ", totalSlippage=" + this.totalSlippage + ", defiPlatformInfo=" + this.defiPlatformInfo + ", tradeMode=" + this.tradeMode + ", dexGasStationFeeDetailVO=" + this.dexGasStationFeeDetailVO + ", serviceFeeUsd=" + this.serviceFeeUsd + ", serviceFeeRate=" + this.serviceFeeRate + ", serviceFee=" + this.serviceFee + ", serviceFeeTokenSymbol=" + this.serviceFeeTokenSymbol + ", isDisplayServiceFee=" + this.isDisplayServiceFee + ", toSwapServiceFee=" + this.toSwapServiceFee + ", toSwapServiceFeeUsd=" + this.toSwapServiceFeeUsd + ", toSwapServiceFeeTokenSymbol=" + this.toSwapServiceFeeTokenSymbol + ", serviceFeeSwitch=" + this.serviceFeeSwitch + ", fromTokenIsCurrency=" + this.fromTokenIsCurrency + ", toTokenIsCurrency=" + this.toTokenIsCurrency + ", txDirection=" + this.txDirection + ", approveMethod=" + this.approveMethod + ", transactionTypeMultiLanguage=" + this.transactionTypeMultiLanguage + ", slippageValue=" + this.slippageValue + ", strategyMode=" + this.strategyMode + ", boostVolume=" + this.boostVolume + ", boostWeight=" + this.boostWeight + ", isHasSaving=" + this.isHasSaving + ", isHasSurplus=" + this.isHasSurplus + ", savingValueUSD=" + this.savingValueUSD + ", surplusAmount=" + this.surplusAmount + ", surplusValueUSD=" + this.surplusValueUSD + ", toAmountValueUsd=" + this.toAmountValueUsd + ", quoteToAmount=" + this.quoteToAmount + ", quoteToValueUsd=" + this.quoteToValueUsd + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo = this.bridgeChildOrderDetailVo;
        if (dexMultiChildOrderInfoVo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dexMultiChildOrderInfoVo.writeToParcel(parcel, i);
        }
        parcel.writeString(this.fromAmount);
        parcel.writeString(this.fromChainId);
        parcel.writeString(this.fromChainLogoUrl);
        DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo2 = this.fromChildOrderDetailVo;
        if (dexMultiChildOrderInfoVo2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dexMultiChildOrderInfoVo2.writeToParcel(parcel, i);
        }
        parcel.writeString(this.fromIcon);
        parcel.writeString(this.fromTokenSymbol);
        parcel.writeString(this.orderId);
        parcel.writeString(this.status);
        parcel.writeString(this.willNeedManualClaim);
        parcel.writeString(this.swapTradeType);
        parcel.writeString(this.time);
        parcel.writeString(this.toAmount);
        parcel.writeString(this.toChainId);
        parcel.writeString(this.toChainLogoUrl);
        DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo3 = this.toChildOrderDetailVo;
        if (dexMultiChildOrderInfoVo3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dexMultiChildOrderInfoVo3.writeToParcel(parcel, i);
        }
        parcel.writeString(this.toIcon);
        parcel.writeString(this.toTokenSymbol);
        parcel.writeString(this.transactionHash);
        parcel.writeString(this.networkFee);
        parcel.writeString(this.otherFees);
        parcel.writeString(this.price);
        parcel.writeString(this.from);
        parcel.writeString(this.fromChainName);
        parcel.writeString(this.toChainName);
        parcel.writeString(this.nativeTokenSymbol);
        parcel.writeString(this.expireTime);
        parcel.writeString(this.receiveTokenStatus);
        parcel.writeString(this.receiveTokenTxHash);
        parcel.writeString(this.receiveTokenAmount);
        parcel.writeString(this.receiveTokenSymbol);
        parcel.writeString(this.receiveWalletAddress);
        parcel.writeString(this.receiveTokenExploreUrl);
        parcel.writeString(this.abnormalStatus);
        parcel.writeString(this.hiddenFromOrder);
        parcel.writeString(this.estimatedTime);
        parcel.writeString(this.bridgeFee);
        parcel.writeString(this.toSwapFee);
        parcel.writeString(this.toChainNativeTokenSymbol);
        parcel.writeInt(this.hiddenOtherFee ? 1 : 0);
        parcel.writeString(this.forRefuelFromAmount);
        DexGasStationActivity dexGasStationActivity = this.gasStationActivityReward;
        if (dexGasStationActivity == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dexGasStationActivity.writeToParcel(parcel, i);
        }
        parcel.writeString(this.fromGasTokenPriceUsd);
        parcel.writeString(this.toGasTokenPriceUsd);
        parcel.writeString(this.finalExploreUrl);
        parcel.writeString(this.timeoutTimestamp);
        parcel.writeString(this.orderType);
        parcel.writeString(this.specialOrderType);
        parcel.writeString(this.freeGas);
        parcel.writeString(this.fromEstimatedTime);
        parcel.writeString(this.bridgeEstimatedTime);
        parcel.writeString(this.originFromEstimatedTime);
        parcel.writeString(this.estimateBridgeFeeAmount);
        parcel.writeString(this.estimateBridgeFeeAmountUsd);
        parcel.writeString(this.bridgeFeeUsd);
        parcel.writeString(this.originBridgeEstimatedTime);
        parcel.writeString(this.orderCompletionTime);
        parcel.writeString(this.isNativeToken4FromToken);
        parcel.writeString(this.isNativeToken);
        parcel.writeString(this.fromTokenAddress);
        parcel.writeString(this.toTokenAddress);
        parcel.writeString(this.mevInfo);
        parcel.writeString(this.fromSwapMevInfo);
        parcel.writeString(this.toSwapMevInfo);
        RelativeTransactionVO relativeTransactionVO = this.relativeTransaction;
        if (relativeTransactionVO == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            relativeTransactionVO.writeToParcel(parcel, i);
        }
        parcel.writeString(this.priorityFee);
        parcel.writeInt(this.isMemeTimeOut ? 1 : 0);
        parcel.writeInt(this.assetDelay ? 1 : 0);
        parcel.writeString(this.assetDelayTime);
        parcel.writeString(this.totalSlippage);
        OrderDetailDefiPlatformInfo orderDetailDefiPlatformInfo = this.defiPlatformInfo;
        if (orderDetailDefiPlatformInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            orderDetailDefiPlatformInfo.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.tradeMode);
        DexGasStationFeeDetailVOX dexGasStationFeeDetailVOX = this.dexGasStationFeeDetailVO;
        if (dexGasStationFeeDetailVOX == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dexGasStationFeeDetailVOX.writeToParcel(parcel, i);
        }
        parcel.writeString(this.serviceFeeUsd);
        parcel.writeString(this.serviceFeeRate);
        parcel.writeString(this.serviceFee);
        parcel.writeString(this.serviceFeeTokenSymbol);
        parcel.writeString(this.isDisplayServiceFee);
        parcel.writeString(this.toSwapServiceFee);
        parcel.writeString(this.toSwapServiceFeeUsd);
        parcel.writeString(this.toSwapServiceFeeTokenSymbol);
        parcel.writeString(this.serviceFeeSwitch);
        parcel.writeInt(this.fromTokenIsCurrency ? 1 : 0);
        parcel.writeInt(this.toTokenIsCurrency ? 1 : 0);
        parcel.writeString(this.txDirection);
        parcel.writeString(this.approveMethod);
        parcel.writeString(this.transactionTypeMultiLanguage);
        parcel.writeString(this.slippageValue);
        parcel.writeInt(this.strategyMode);
        parcel.writeString(this.boostVolume);
        parcel.writeString(this.boostWeight);
        parcel.writeInt(this.isHasSaving);
        parcel.writeInt(this.isHasSurplus);
        parcel.writeString(this.savingValueUSD);
        parcel.writeString(this.surplusAmount);
        parcel.writeString(this.surplusValueUSD);
        parcel.writeString(this.toAmountValueUsd);
        parcel.writeString(this.quoteToAmount);
        parcel.writeString(this.quoteToValueUsd);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.bean.OrderDetailBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OrderDetailBean> serializer() {
            return OrderDetailBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OrderDetailBean(int i, int i2, int i3, int i4, DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, String str, String str2, String str3, DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo2, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo3, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, boolean z, String str37, DexGasStationActivity dexGasStationActivity, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47, String str48, String str49, String str50, String str51, String str52, String str53, String str54, String str55, String str56, String str57, String str58, String str59, RelativeTransactionVO relativeTransactionVO, String str60, boolean z2, boolean z3, String str61, String str62, OrderDetailDefiPlatformInfo orderDetailDefiPlatformInfo, int i5, DexGasStationFeeDetailVOX dexGasStationFeeDetailVOX, String str63, String str64, String str65, String str66, String str67, String str68, String str69, String str70, String str71, boolean z4, boolean z5, String str72, String str73, String str74, String str75, int i6, String str76, String str77, int i7, int i8, String str78, String str79, String str80, String str81, String str82, String str83, SerializationConstructorMarker serializationConstructorMarker) {
        String toChainName;
        String toTokenSymbol;
        String toChainName2;
        String toTokenSymbol2;
        if ((i & 1) == 0) {
            this.bridgeChildOrderDetailVo = null;
        } else {
            this.bridgeChildOrderDetailVo = dexMultiChildOrderInfoVo;
        }
        String str84 = "";
        if ((i & 2) == 0) {
            this.fromAmount = "";
        } else {
            this.fromAmount = str;
        }
        if ((i & 4) == 0) {
            this.fromChainId = "";
        } else {
            this.fromChainId = str2;
        }
        if ((i & 8) == 0) {
            this.fromChainLogoUrl = "";
        } else {
            this.fromChainLogoUrl = str3;
        }
        if ((i & 16) == 0) {
            this.fromChildOrderDetailVo = null;
        } else {
            this.fromChildOrderDetailVo = dexMultiChildOrderInfoVo2;
        }
        if ((i & 32) == 0) {
            this.fromIcon = "";
        } else {
            this.fromIcon = str4;
        }
        if ((i & 64) == 0) {
            this.fromTokenSymbol = "";
        } else {
            this.fromTokenSymbol = str5;
        }
        if ((i & 128) == 0) {
            this.orderId = "";
        } else {
            this.orderId = str6;
        }
        if ((i & 256) == 0) {
            this.status = "";
        } else {
            this.status = str7;
        }
        if ((i & 512) == 0) {
            this.willNeedManualClaim = "0";
        } else {
            this.willNeedManualClaim = str8;
        }
        if ((i & 1024) == 0) {
            this.swapTradeType = "";
        } else {
            this.swapTradeType = str9;
        }
        if ((i & 2048) == 0) {
            this.time = "";
        } else {
            this.time = str10;
        }
        if ((i & 4096) == 0) {
            this.toAmount = "";
        } else {
            this.toAmount = str11;
        }
        if ((i & 8192) == 0) {
            this.toChainId = "";
        } else {
            this.toChainId = str12;
        }
        if ((i & 16384) == 0) {
            this.toChainLogoUrl = "";
        } else {
            this.toChainLogoUrl = str13;
        }
        if ((i & 32768) == 0) {
            this.toChildOrderDetailVo = null;
        } else {
            this.toChildOrderDetailVo = dexMultiChildOrderInfoVo3;
        }
        if ((i & 65536) == 0) {
            this.toIcon = "";
        } else {
            this.toIcon = str14;
        }
        if ((i & 131072) == 0) {
            this.toTokenSymbol = "";
        } else {
            this.toTokenSymbol = str15;
        }
        if ((262144 & i) == 0) {
            this.transactionHash = "";
        } else {
            this.transactionHash = str16;
        }
        if ((524288 & i) == 0) {
            this.networkFee = "";
        } else {
            this.networkFee = str17;
        }
        if ((1048576 & i) == 0) {
            this.otherFees = "";
        } else {
            this.otherFees = str18;
        }
        if ((2097152 & i) == 0) {
            this.price = "";
        } else {
            this.price = str19;
        }
        if ((4194304 & i) == 0) {
            this.from = "";
        } else {
            this.from = str20;
        }
        if ((8388608 & i) == 0) {
            this.fromChainName = "";
        } else {
            this.fromChainName = str21;
        }
        if ((16777216 & i) == 0) {
            this.toChainName = "";
        } else {
            this.toChainName = str22;
        }
        if ((33554432 & i) == 0) {
            this.nativeTokenSymbol = "";
        } else {
            this.nativeTokenSymbol = str23;
        }
        if ((67108864 & i) == 0) {
            this.expireTime = "0";
        } else {
            this.expireTime = str24;
        }
        if ((134217728 & i) == 0) {
            this.receiveTokenStatus = "0";
        } else {
            this.receiveTokenStatus = str25;
        }
        if ((268435456 & i) == 0) {
            this.receiveTokenTxHash = "";
        } else {
            this.receiveTokenTxHash = str26;
        }
        if ((536870912 & i) == 0) {
            this.receiveTokenAmount = "";
        } else {
            this.receiveTokenAmount = str27;
        }
        if ((1073741824 & i) == 0) {
            this.receiveTokenSymbol = "";
        } else {
            this.receiveTokenSymbol = str28;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.receiveWalletAddress = null;
        } else {
            this.receiveWalletAddress = str29;
        }
        if ((i2 & 1) == 0) {
            this.receiveTokenExploreUrl = "";
        } else {
            this.receiveTokenExploreUrl = str30;
        }
        if ((i2 & 2) == 0) {
            this.abnormalStatus = "";
        } else {
            this.abnormalStatus = str31;
        }
        String str85 = (i2 & 4) == 0 ? MultiTransferSignData.DEFAULT_INTERVAL : str32;
        this.hiddenFromOrder = str85;
        if ((i2 & 8) == 0) {
            this.estimatedTime = "0";
        } else {
            this.estimatedTime = str33;
        }
        if ((i2 & 16) == 0) {
            this.bridgeFee = "";
        } else {
            this.bridgeFee = str34;
        }
        if ((i2 & 32) == 0) {
            this.toSwapFee = "";
        } else {
            this.toSwapFee = str35;
        }
        if ((i2 & 64) == 0) {
            this.toChainNativeTokenSymbol = "";
        } else {
            this.toChainNativeTokenSymbol = str36;
        }
        if ((i2 & 128) == 0) {
            this.hiddenOtherFee = false;
        } else {
            this.hiddenOtherFee = z;
        }
        if ((i2 & 256) == 0) {
            this.forRefuelFromAmount = "";
        } else {
            this.forRefuelFromAmount = str37;
        }
        this.gasStationActivityReward = (i2 & 512) == 0 ? new DexGasStationActivity(0, "") : dexGasStationActivity;
        if ((i2 & 1024) == 0) {
            this.fromGasTokenPriceUsd = "";
        } else {
            this.fromGasTokenPriceUsd = str38;
        }
        if ((i2 & 2048) == 0) {
            this.toGasTokenPriceUsd = "";
        } else {
            this.toGasTokenPriceUsd = str39;
        }
        if ((i2 & 4096) == 0) {
            this.finalExploreUrl = "";
        } else {
            this.finalExploreUrl = str40;
        }
        if ((i2 & 8192) == 0) {
            this.timeoutTimestamp = "";
        } else {
            this.timeoutTimestamp = str41;
        }
        this.orderType = (i2 & 16384) == 0 ? "1" : str42;
        if ((i2 & 32768) == 0) {
            this.specialOrderType = "";
        } else {
            this.specialOrderType = str43;
        }
        this.freeGas = (i2 & 65536) != 0 ? str44 : "0";
        if ((i2 & 131072) == 0) {
            this.fromEstimatedTime = "";
        } else {
            this.fromEstimatedTime = str45;
        }
        if ((262144 & i2) == 0) {
            this.bridgeEstimatedTime = "";
        } else {
            this.bridgeEstimatedTime = str46;
        }
        if ((524288 & i2) == 0) {
            this.originFromEstimatedTime = "";
        } else {
            this.originFromEstimatedTime = str47;
        }
        if ((1048576 & i2) == 0) {
            this.estimateBridgeFeeAmount = "";
        } else {
            this.estimateBridgeFeeAmount = str48;
        }
        if ((2097152 & i2) == 0) {
            this.estimateBridgeFeeAmountUsd = "";
        } else {
            this.estimateBridgeFeeAmountUsd = str49;
        }
        if ((4194304 & i2) == 0) {
            this.bridgeFeeUsd = "";
        } else {
            this.bridgeFeeUsd = str50;
        }
        if ((8388608 & i2) == 0) {
            this.originBridgeEstimatedTime = "";
        } else {
            this.originBridgeEstimatedTime = str51;
        }
        if ((16777216 & i2) == 0) {
            this.orderCompletionTime = "";
        } else {
            this.orderCompletionTime = str52;
        }
        if ((33554432 & i2) == 0) {
            this.isNativeToken4FromToken = "";
        } else {
            this.isNativeToken4FromToken = str53;
        }
        if ((67108864 & i2) == 0) {
            this.isNativeToken = "";
        } else {
            this.isNativeToken = str54;
        }
        if ((134217728 & i2) == 0) {
            this.fromTokenAddress = "";
        } else {
            this.fromTokenAddress = str55;
        }
        if ((268435456 & i2) == 0) {
            this.toTokenAddress = "";
        } else {
            this.toTokenAddress = str56;
        }
        if ((536870912 & i2) == 0) {
            this.mevInfo = "";
        } else {
            this.mevInfo = str57;
        }
        if ((1073741824 & i2) == 0) {
            this.fromSwapMevInfo = "";
        } else {
            this.fromSwapMevInfo = str58;
        }
        if ((i2 & Integer.MIN_VALUE) == 0) {
            this.toSwapMevInfo = "";
        } else {
            this.toSwapMevInfo = str59;
        }
        if ((i3 & 1) == 0) {
            this.relativeTransaction = null;
        } else {
            this.relativeTransaction = relativeTransactionVO;
        }
        if ((i3 & 2) == 0) {
            this.priorityFee = "";
        } else {
            this.priorityFee = str60;
        }
        if ((i3 & 4) == 0) {
            this.isMemeTimeOut = false;
        } else {
            this.isMemeTimeOut = z2;
        }
        if ((i3 & 8) == 0) {
            this.assetDelay = false;
        } else {
            this.assetDelay = z3;
        }
        if ((i3 & 16) == 0) {
            this.assetDelayTime = "";
        } else {
            this.assetDelayTime = str61;
        }
        if ((i3 & 32) == 0) {
            this.totalSlippage = "";
        } else {
            this.totalSlippage = str62;
        }
        if ((i3 & 64) == 0) {
            this.defiPlatformInfo = null;
        } else {
            this.defiPlatformInfo = orderDetailDefiPlatformInfo;
        }
        this.tradeMode = (i3 & 128) == 0 ? TradeMode.SwapMode.getType() : i5;
        if ((i3 & 256) == 0) {
            this.dexGasStationFeeDetailVO = null;
        } else {
            this.dexGasStationFeeDetailVO = dexGasStationFeeDetailVOX;
        }
        if ((i3 & 512) == 0) {
            this.serviceFeeUsd = "";
        } else {
            this.serviceFeeUsd = str63;
        }
        if ((i3 & 1024) == 0) {
            this.serviceFeeRate = "";
        } else {
            this.serviceFeeRate = str64;
        }
        if ((i3 & 2048) == 0) {
            this.serviceFee = "";
        } else {
            this.serviceFee = str65;
        }
        if ((i3 & 4096) == 0) {
            this.serviceFeeTokenSymbol = "";
        } else {
            this.serviceFeeTokenSymbol = str66;
        }
        if ((i3 & 8192) == 0) {
            this.isDisplayServiceFee = "";
        } else {
            this.isDisplayServiceFee = str67;
        }
        if ((i3 & 16384) == 0) {
            this.toSwapServiceFee = "";
        } else {
            this.toSwapServiceFee = str68;
        }
        if ((i3 & 32768) == 0) {
            this.toSwapServiceFeeUsd = "";
        } else {
            this.toSwapServiceFeeUsd = str69;
        }
        if ((i3 & 65536) == 0) {
            this.toSwapServiceFeeTokenSymbol = "";
        } else {
            this.toSwapServiceFeeTokenSymbol = str70;
        }
        if ((i3 & 131072) == 0) {
            this.serviceFeeSwitch = "";
        } else {
            this.serviceFeeSwitch = str71;
        }
        if ((262144 & i3) == 0) {
            this.fromTokenIsCurrency = false;
        } else {
            this.fromTokenIsCurrency = z4;
        }
        if ((524288 & i3) == 0) {
            this.toTokenIsCurrency = false;
        } else {
            this.toTokenIsCurrency = z5;
        }
        if ((1048576 & i3) == 0) {
            this.txDirection = "";
        } else {
            this.txDirection = str72;
        }
        if ((2097152 & i3) == 0) {
            this.approveMethod = "";
        } else {
            this.approveMethod = str73;
        }
        if ((4194304 & i3) == 0) {
            this.transactionTypeMultiLanguage = "";
        } else {
            this.transactionTypeMultiLanguage = str74;
        }
        if ((8388608 & i3) == 0) {
            this.slippageValue = "";
        } else {
            this.slippageValue = str75;
        }
        if ((16777216 & i3) == 0) {
            this.strategyMode = 0;
        } else {
            this.strategyMode = i6;
        }
        if ((33554432 & i3) == 0) {
            this.boostVolume = "";
        } else {
            this.boostVolume = str76;
        }
        if ((67108864 & i3) == 0) {
            this.boostWeight = "";
        } else {
            this.boostWeight = str77;
        }
        if ((134217728 & i3) == 0) {
            this.isHasSaving = 0;
        } else {
            this.isHasSaving = i7;
        }
        if ((268435456 & i3) == 0) {
            this.isHasSurplus = 0;
        } else {
            this.isHasSurplus = i8;
        }
        if ((536870912 & i3) == 0) {
            this.savingValueUSD = "";
        } else {
            this.savingValueUSD = str78;
        }
        if ((1073741824 & i3) == 0) {
            this.surplusAmount = "";
        } else {
            this.surplusAmount = str79;
        }
        if ((Integer.MIN_VALUE & i3) == 0) {
            this.surplusValueUSD = "";
        } else {
            this.surplusValueUSD = str80;
        }
        if ((i4 & 1) == 0) {
            this.toAmountValueUsd = "";
        } else {
            this.toAmountValueUsd = str81;
        }
        if ((i4 & 2) == 0) {
            this.quoteToAmount = "";
        } else {
            this.quoteToAmount = str82;
        }
        if ((i4 & 4) == 0) {
            this.quoteToValueUsd = "";
        } else {
            this.quoteToValueUsd = str83;
        }
        DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo4 = this.fromChildOrderDetailVo;
        if (dexMultiChildOrderInfoVo4 != null) {
            dexMultiChildOrderInfoVo4.setMainStatus(this.status);
            dexMultiChildOrderInfoVo4.setMainEstimatedTime(this.estimatedTime);
            dexMultiChildOrderInfoVo4.setMainFromAddress(this.from);
            dexMultiChildOrderInfoVo4.setFromEstimatedTime(this.fromEstimatedTime);
            dexMultiChildOrderInfoVo4.setOriginFromEstimatedTime(this.originFromEstimatedTime);
            dexMultiChildOrderInfoVo4.setSwapTradeType(this.swapTradeType);
            dexMultiChildOrderInfoVo4.setHiddenFromOrder(str85);
            dexMultiChildOrderInfoVo4.setPayOrder(false);
            dexMultiChildOrderInfoVo4.setToAmountOut(Intrinsics.EZpvd((Object) dexMultiChildOrderInfoVo4.getSwapTradeType(), (Object) "2") ? dexMultiChildOrderInfoVo4.getFromAmountIn() : dexMultiChildOrderInfoVo4.getToAmountOut());
        }
        DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo5 = this.bridgeChildOrderDetailVo;
        if (dexMultiChildOrderInfoVo5 != null) {
            dexMultiChildOrderInfoVo5.setPayOrder(false);
            dexMultiChildOrderInfoVo5.setMainStatus(this.status);
            dexMultiChildOrderInfoVo5.setMainFromAddress(this.from);
            dexMultiChildOrderInfoVo5.setMainEstimatedTime(this.estimatedTime);
            dexMultiChildOrderInfoVo5.setBridgeEstimatedTime(this.bridgeEstimatedTime);
            dexMultiChildOrderInfoVo5.setOriginBridgeEstimatedTime(this.originBridgeEstimatedTime);
            dexMultiChildOrderInfoVo5.setSwapTradeType(this.swapTradeType);
            dexMultiChildOrderInfoVo5.setHiddenFromOrder(str85);
            DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo6 = this.fromChildOrderDetailVo;
            dexMultiChildOrderInfoVo5.setLastChildOrderToTokenSymbol((dexMultiChildOrderInfoVo6 == null || (toTokenSymbol2 = dexMultiChildOrderInfoVo6.getToTokenSymbol()) == null) ? "" : toTokenSymbol2);
            DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo7 = this.fromChildOrderDetailVo;
            dexMultiChildOrderInfoVo5.setLastChildOrderChainName((dexMultiChildOrderInfoVo7 == null || (toChainName2 = dexMultiChildOrderInfoVo7.getToChainName()) == null) ? "" : toChainName2);
        }
        DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo8 = this.toChildOrderDetailVo;
        if (dexMultiChildOrderInfoVo8 != null) {
            dexMultiChildOrderInfoVo8.setPayOrder(false);
            dexMultiChildOrderInfoVo8.setMainFromAddress(this.from);
            dexMultiChildOrderInfoVo8.setMainStatus(this.status);
            dexMultiChildOrderInfoVo8.setMainEstimatedTime(this.estimatedTime);
            dexMultiChildOrderInfoVo8.setSwapTradeType(this.swapTradeType);
            DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo9 = this.bridgeChildOrderDetailVo;
            dexMultiChildOrderInfoVo8.setLastChildOrderToTokenSymbol((dexMultiChildOrderInfoVo9 == null || (toTokenSymbol = dexMultiChildOrderInfoVo9.getToTokenSymbol()) == null) ? "" : toTokenSymbol);
            DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo10 = this.bridgeChildOrderDetailVo;
            if (dexMultiChildOrderInfoVo10 != null && (toChainName = dexMultiChildOrderInfoVo10.getToChainName()) != null) {
                str84 = toChainName;
            }
            dexMultiChildOrderInfoVo8.setLastChildOrderChainName(str84);
            dexMultiChildOrderInfoVo8.setHiddenFromOrder(str85);
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(OrderDetailBean orderDetailBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || orderDetailBean.bridgeChildOrderDetailVo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, DexMultiChildOrderInfoVo$$serializer.INSTANCE, orderDetailBean.bridgeChildOrderDetailVo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) orderDetailBean.fromAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, orderDetailBean.fromAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) orderDetailBean.fromChainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, orderDetailBean.fromChainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) orderDetailBean.fromChainLogoUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, orderDetailBean.fromChainLogoUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || orderDetailBean.fromChildOrderDetailVo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, DexMultiChildOrderInfoVo$$serializer.INSTANCE, orderDetailBean.fromChildOrderDetailVo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) orderDetailBean.fromIcon, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, orderDetailBean.fromIcon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) orderDetailBean.getFromTokenSymbol(), (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, orderDetailBean.getFromTokenSymbol());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) orderDetailBean.getOrderId(), (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, orderDetailBean.getOrderId());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) orderDetailBean.status, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, orderDetailBean.status);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) orderDetailBean.willNeedManualClaim, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, orderDetailBean.willNeedManualClaim);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) orderDetailBean.swapTradeType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, orderDetailBean.swapTradeType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) orderDetailBean.time, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, orderDetailBean.time);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) orderDetailBean.toAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, orderDetailBean.toAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) orderDetailBean.toChainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, orderDetailBean.toChainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) orderDetailBean.toChainLogoUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, orderDetailBean.toChainLogoUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || orderDetailBean.toChildOrderDetailVo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, DexMultiChildOrderInfoVo$$serializer.INSTANCE, orderDetailBean.toChildOrderDetailVo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) orderDetailBean.toIcon, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, orderDetailBean.toIcon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) orderDetailBean.getToTokenSymbol(), (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 17, orderDetailBean.getToTokenSymbol());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd((Object) orderDetailBean.transactionHash, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 18, orderDetailBean.transactionHash);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd((Object) orderDetailBean.networkFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 19, orderDetailBean.networkFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd((Object) orderDetailBean.otherFees, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 20, orderDetailBean.otherFees);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !Intrinsics.EZpvd((Object) orderDetailBean.price, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 21, orderDetailBean.price);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || !Intrinsics.EZpvd((Object) orderDetailBean.from, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 22, orderDetailBean.from);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || !Intrinsics.EZpvd((Object) orderDetailBean.fromChainName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 23, orderDetailBean.fromChainName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || !Intrinsics.EZpvd((Object) orderDetailBean.toChainName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 24, orderDetailBean.toChainName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || !Intrinsics.EZpvd((Object) orderDetailBean.nativeTokenSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 25, orderDetailBean.nativeTokenSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || !Intrinsics.EZpvd((Object) orderDetailBean.expireTime, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 26, orderDetailBean.expireTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || !Intrinsics.EZpvd((Object) orderDetailBean.receiveTokenStatus, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 27, orderDetailBean.receiveTokenStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || !Intrinsics.EZpvd((Object) orderDetailBean.receiveTokenTxHash, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 28, orderDetailBean.receiveTokenTxHash);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || !Intrinsics.EZpvd((Object) orderDetailBean.receiveTokenAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 29, orderDetailBean.receiveTokenAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || !Intrinsics.EZpvd((Object) orderDetailBean.receiveTokenSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 30, orderDetailBean.receiveTokenSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || orderDetailBean.receiveWalletAddress != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 31, StringSerializer.INSTANCE, orderDetailBean.receiveWalletAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || !Intrinsics.EZpvd((Object) orderDetailBean.receiveTokenExploreUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 32, orderDetailBean.receiveTokenExploreUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) || !Intrinsics.EZpvd((Object) orderDetailBean.abnormalStatus, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 33, orderDetailBean.abnormalStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 34) || !Intrinsics.EZpvd((Object) orderDetailBean.hiddenFromOrder, (Object) MultiTransferSignData.DEFAULT_INTERVAL)) {
            compositeEncoder.encodeStringElement(serialDescriptor, 34, orderDetailBean.hiddenFromOrder);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 35) || !Intrinsics.EZpvd((Object) orderDetailBean.estimatedTime, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 35, orderDetailBean.estimatedTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 36) || !Intrinsics.EZpvd((Object) orderDetailBean.bridgeFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 36, orderDetailBean.bridgeFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 37) || !Intrinsics.EZpvd((Object) orderDetailBean.toSwapFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 37, orderDetailBean.toSwapFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 38) || !Intrinsics.EZpvd((Object) orderDetailBean.toChainNativeTokenSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 38, orderDetailBean.toChainNativeTokenSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 39) || orderDetailBean.hiddenOtherFee) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 39, orderDetailBean.hiddenOtherFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 40) || !Intrinsics.EZpvd((Object) orderDetailBean.forRefuelFromAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 40, orderDetailBean.forRefuelFromAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 41) || !Intrinsics.EZpvd(orderDetailBean.gasStationActivityReward, new DexGasStationActivity(0, ""))) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 41, DexGasStationActivity$$serializer.INSTANCE, orderDetailBean.gasStationActivityReward);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 42) || !Intrinsics.EZpvd((Object) orderDetailBean.fromGasTokenPriceUsd, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 42, orderDetailBean.fromGasTokenPriceUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 43) || !Intrinsics.EZpvd((Object) orderDetailBean.toGasTokenPriceUsd, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 43, orderDetailBean.toGasTokenPriceUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 44) || !Intrinsics.EZpvd((Object) orderDetailBean.finalExploreUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 44, orderDetailBean.finalExploreUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 45) || !Intrinsics.EZpvd((Object) orderDetailBean.timeoutTimestamp, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 45, orderDetailBean.timeoutTimestamp);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 46) || !Intrinsics.EZpvd((Object) orderDetailBean.orderType, (Object) "1")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 46, orderDetailBean.orderType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 47) || !Intrinsics.EZpvd((Object) orderDetailBean.specialOrderType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 47, orderDetailBean.specialOrderType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 48) || !Intrinsics.EZpvd((Object) orderDetailBean.freeGas, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 48, orderDetailBean.freeGas);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 49) || !Intrinsics.EZpvd((Object) orderDetailBean.fromEstimatedTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 49, orderDetailBean.fromEstimatedTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 50) || !Intrinsics.EZpvd((Object) orderDetailBean.bridgeEstimatedTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 50, orderDetailBean.bridgeEstimatedTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 51) || !Intrinsics.EZpvd((Object) orderDetailBean.originFromEstimatedTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 51, orderDetailBean.originFromEstimatedTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 52) || !Intrinsics.EZpvd((Object) orderDetailBean.estimateBridgeFeeAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 52, orderDetailBean.estimateBridgeFeeAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 53) || !Intrinsics.EZpvd((Object) orderDetailBean.estimateBridgeFeeAmountUsd, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 53, orderDetailBean.estimateBridgeFeeAmountUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 54) || !Intrinsics.EZpvd((Object) orderDetailBean.bridgeFeeUsd, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 54, orderDetailBean.bridgeFeeUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 55) || !Intrinsics.EZpvd((Object) orderDetailBean.originBridgeEstimatedTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 55, orderDetailBean.originBridgeEstimatedTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 56) || !Intrinsics.EZpvd((Object) orderDetailBean.orderCompletionTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 56, orderDetailBean.orderCompletionTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 57) || !Intrinsics.EZpvd((Object) orderDetailBean.isNativeToken4FromToken, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 57, orderDetailBean.isNativeToken4FromToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 58) || !Intrinsics.EZpvd((Object) orderDetailBean.isNativeToken, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 58, orderDetailBean.isNativeToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 59) || !Intrinsics.EZpvd((Object) orderDetailBean.getFromTokenAddress(), (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 59, orderDetailBean.getFromTokenAddress());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 60) || !Intrinsics.EZpvd((Object) orderDetailBean.getToTokenAddress(), (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 60, orderDetailBean.getToTokenAddress());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 61) || !Intrinsics.EZpvd((Object) orderDetailBean.mevInfo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 61, orderDetailBean.mevInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 62) || !Intrinsics.EZpvd((Object) orderDetailBean.fromSwapMevInfo, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 62, StringSerializer.INSTANCE, orderDetailBean.fromSwapMevInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 63) || !Intrinsics.EZpvd((Object) orderDetailBean.toSwapMevInfo, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 63, StringSerializer.INSTANCE, orderDetailBean.toSwapMevInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 64) || orderDetailBean.relativeTransaction != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 64, RelativeTransactionVO$$serializer.INSTANCE, orderDetailBean.relativeTransaction);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 65) || !Intrinsics.EZpvd((Object) orderDetailBean.priorityFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 65, orderDetailBean.priorityFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 66) || orderDetailBean.isMemeTimeOut) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 66, orderDetailBean.isMemeTimeOut);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 67) || orderDetailBean.assetDelay) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 67, orderDetailBean.assetDelay);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 68) || !Intrinsics.EZpvd((Object) orderDetailBean.assetDelayTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 68, orderDetailBean.assetDelayTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 69) || !Intrinsics.EZpvd((Object) orderDetailBean.totalSlippage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 69, orderDetailBean.totalSlippage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 70) || orderDetailBean.defiPlatformInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 70, OrderDetailDefiPlatformInfo$$serializer.INSTANCE, orderDetailBean.defiPlatformInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 71) || orderDetailBean.tradeMode != TradeMode.SwapMode.getType()) {
            compositeEncoder.encodeIntElement(serialDescriptor, 71, orderDetailBean.tradeMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 72) || orderDetailBean.dexGasStationFeeDetailVO != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 72, DexGasStationFeeDetailVOX$$serializer.INSTANCE, orderDetailBean.dexGasStationFeeDetailVO);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 73) || !Intrinsics.EZpvd((Object) orderDetailBean.serviceFeeUsd, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 73, orderDetailBean.serviceFeeUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 74) || !Intrinsics.EZpvd((Object) orderDetailBean.serviceFeeRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 74, orderDetailBean.serviceFeeRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 75) || !Intrinsics.EZpvd((Object) orderDetailBean.serviceFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 75, orderDetailBean.serviceFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 76) || !Intrinsics.EZpvd((Object) orderDetailBean.serviceFeeTokenSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 76, orderDetailBean.serviceFeeTokenSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 77) || !Intrinsics.EZpvd((Object) orderDetailBean.isDisplayServiceFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 77, orderDetailBean.isDisplayServiceFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 78) || !Intrinsics.EZpvd((Object) orderDetailBean.toSwapServiceFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 78, orderDetailBean.toSwapServiceFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 79) || !Intrinsics.EZpvd((Object) orderDetailBean.toSwapServiceFeeUsd, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 79, orderDetailBean.toSwapServiceFeeUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 80) || !Intrinsics.EZpvd((Object) orderDetailBean.toSwapServiceFeeTokenSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 80, orderDetailBean.toSwapServiceFeeTokenSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 81) || !Intrinsics.EZpvd((Object) orderDetailBean.serviceFeeSwitch, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 81, orderDetailBean.serviceFeeSwitch);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 82) || orderDetailBean.fromTokenIsCurrency) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 82, orderDetailBean.fromTokenIsCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 83) || orderDetailBean.toTokenIsCurrency) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 83, orderDetailBean.toTokenIsCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 84) || !Intrinsics.EZpvd((Object) orderDetailBean.txDirection, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 84, orderDetailBean.txDirection);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 85) || !Intrinsics.EZpvd((Object) orderDetailBean.approveMethod, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 85, orderDetailBean.approveMethod);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 86) || !Intrinsics.EZpvd((Object) orderDetailBean.transactionTypeMultiLanguage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 86, orderDetailBean.transactionTypeMultiLanguage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 87) || !Intrinsics.EZpvd((Object) orderDetailBean.slippageValue, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 87, orderDetailBean.slippageValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 88) || orderDetailBean.getStrategyMode() != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 88, orderDetailBean.getStrategyMode());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 89) || !Intrinsics.EZpvd((Object) orderDetailBean.boostVolume, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 89, orderDetailBean.boostVolume);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 90) || !Intrinsics.EZpvd((Object) orderDetailBean.boostWeight, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 90, orderDetailBean.boostWeight);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 91) || orderDetailBean.isHasSaving != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 91, orderDetailBean.isHasSaving);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 92) || orderDetailBean.isHasSurplus != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 92, orderDetailBean.isHasSurplus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 93) || !Intrinsics.EZpvd((Object) orderDetailBean.savingValueUSD, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 93, orderDetailBean.savingValueUSD);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 94) || !Intrinsics.EZpvd((Object) orderDetailBean.surplusAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 94, orderDetailBean.surplusAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 95) || !Intrinsics.EZpvd((Object) orderDetailBean.surplusValueUSD, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 95, orderDetailBean.surplusValueUSD);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 96) || !Intrinsics.EZpvd((Object) orderDetailBean.toAmountValueUsd, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 96, orderDetailBean.toAmountValueUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 97) || !Intrinsics.EZpvd((Object) orderDetailBean.quoteToAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 97, orderDetailBean.quoteToAmount);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 98) && Intrinsics.EZpvd((Object) orderDetailBean.quoteToValueUsd, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 98, orderDetailBean.quoteToValueUsd);
    }

    public OrderDetailBean(DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, @NotNull String str, @NotNull String str2, @NotNull String str3, DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo2, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo3, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, @NotNull String str25, @NotNull String str26, @NotNull String str27, @NotNull String str28, String str29, @NotNull String str30, @NotNull String str31, @NotNull String str32, @NotNull String str33, @NotNull String str34, @NotNull String str35, @NotNull String str36, boolean z, @NotNull String str37, DexGasStationActivity dexGasStationActivity, @NotNull String str38, @NotNull String str39, @NotNull String str40, @NotNull String str41, @NotNull String str42, @NotNull String str43, @NotNull String str44, @NotNull String str45, @NotNull String str46, @NotNull String str47, @NotNull String str48, @NotNull String str49, @NotNull String str50, @NotNull String str51, @NotNull String str52, @NotNull String str53, @NotNull String str54, @NotNull String str55, @NotNull String str56, @NotNull String str57, String str58, String str59, RelativeTransactionVO relativeTransactionVO, @NotNull String str60, boolean z2, boolean z3, @NotNull String str61, @NotNull String str62, OrderDetailDefiPlatformInfo orderDetailDefiPlatformInfo, int i, DexGasStationFeeDetailVOX dexGasStationFeeDetailVOX, @NotNull String str63, @NotNull String str64, @NotNull String str65, @NotNull String str66, @NotNull String str67, @NotNull String str68, @NotNull String str69, @NotNull String str70, @NotNull String str71, boolean z4, boolean z5, @NotNull String str72, @NotNull String str73, @NotNull String str74, @NotNull String str75, int i2, @NotNull String str76, @NotNull String str77, int i3, int i4, @NotNull String str78, @NotNull String str79, @NotNull String str80, @NotNull String str81, @NotNull String str82, @NotNull String str83) {
        String toChainName;
        String toTokenSymbol;
        String toChainName2;
        String toTokenSymbol2;
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
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str20, "");
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(str22, "");
        Intrinsics.checkNotNullParameter(str23, "");
        Intrinsics.checkNotNullParameter(str24, "");
        Intrinsics.checkNotNullParameter(str25, "");
        Intrinsics.checkNotNullParameter(str26, "");
        Intrinsics.checkNotNullParameter(str27, "");
        Intrinsics.checkNotNullParameter(str28, "");
        Intrinsics.checkNotNullParameter(str30, "");
        Intrinsics.checkNotNullParameter(str31, "");
        Intrinsics.checkNotNullParameter(str32, "");
        Intrinsics.checkNotNullParameter(str33, "");
        Intrinsics.checkNotNullParameter(str34, "");
        Intrinsics.checkNotNullParameter(str35, "");
        Intrinsics.checkNotNullParameter(str36, "");
        Intrinsics.checkNotNullParameter(str37, "");
        Intrinsics.checkNotNullParameter(str38, "");
        Intrinsics.checkNotNullParameter(str39, "");
        Intrinsics.checkNotNullParameter(str40, "");
        Intrinsics.checkNotNullParameter(str41, "");
        Intrinsics.checkNotNullParameter(str42, "");
        Intrinsics.checkNotNullParameter(str43, "");
        Intrinsics.checkNotNullParameter(str44, "");
        Intrinsics.checkNotNullParameter(str45, "");
        Intrinsics.checkNotNullParameter(str46, "");
        Intrinsics.checkNotNullParameter(str47, "");
        Intrinsics.checkNotNullParameter(str48, "");
        Intrinsics.checkNotNullParameter(str49, "");
        Intrinsics.checkNotNullParameter(str50, "");
        Intrinsics.checkNotNullParameter(str51, "");
        Intrinsics.checkNotNullParameter(str52, "");
        Intrinsics.checkNotNullParameter(str53, "");
        Intrinsics.checkNotNullParameter(str54, "");
        Intrinsics.checkNotNullParameter(str55, "");
        Intrinsics.checkNotNullParameter(str56, "");
        Intrinsics.checkNotNullParameter(str57, "");
        Intrinsics.checkNotNullParameter(str60, "");
        Intrinsics.checkNotNullParameter(str61, "");
        Intrinsics.checkNotNullParameter(str62, "");
        Intrinsics.checkNotNullParameter(str63, "");
        Intrinsics.checkNotNullParameter(str64, "");
        Intrinsics.checkNotNullParameter(str65, "");
        Intrinsics.checkNotNullParameter(str66, "");
        Intrinsics.checkNotNullParameter(str67, "");
        Intrinsics.checkNotNullParameter(str68, "");
        Intrinsics.checkNotNullParameter(str69, "");
        Intrinsics.checkNotNullParameter(str70, "");
        Intrinsics.checkNotNullParameter(str71, "");
        Intrinsics.checkNotNullParameter(str72, "");
        Intrinsics.checkNotNullParameter(str73, "");
        Intrinsics.checkNotNullParameter(str74, "");
        Intrinsics.checkNotNullParameter(str75, "");
        Intrinsics.checkNotNullParameter(str76, "");
        Intrinsics.checkNotNullParameter(str77, "");
        Intrinsics.checkNotNullParameter(str78, "");
        Intrinsics.checkNotNullParameter(str79, "");
        Intrinsics.checkNotNullParameter(str80, "");
        Intrinsics.checkNotNullParameter(str81, "");
        Intrinsics.checkNotNullParameter(str82, "");
        Intrinsics.checkNotNullParameter(str83, "");
        this.bridgeChildOrderDetailVo = dexMultiChildOrderInfoVo;
        this.fromAmount = str;
        this.fromChainId = str2;
        this.fromChainLogoUrl = str3;
        this.fromChildOrderDetailVo = dexMultiChildOrderInfoVo2;
        this.fromIcon = str4;
        this.fromTokenSymbol = str5;
        this.orderId = str6;
        this.status = str7;
        this.willNeedManualClaim = str8;
        this.swapTradeType = str9;
        this.time = str10;
        this.toAmount = str11;
        this.toChainId = str12;
        this.toChainLogoUrl = str13;
        this.toChildOrderDetailVo = dexMultiChildOrderInfoVo3;
        this.toIcon = str14;
        this.toTokenSymbol = str15;
        this.transactionHash = str16;
        this.networkFee = str17;
        this.otherFees = str18;
        this.price = str19;
        this.from = str20;
        this.fromChainName = str21;
        this.toChainName = str22;
        this.nativeTokenSymbol = str23;
        this.expireTime = str24;
        this.receiveTokenStatus = str25;
        this.receiveTokenTxHash = str26;
        this.receiveTokenAmount = str27;
        this.receiveTokenSymbol = str28;
        this.receiveWalletAddress = str29;
        this.receiveTokenExploreUrl = str30;
        this.abnormalStatus = str31;
        this.hiddenFromOrder = str32;
        this.estimatedTime = str33;
        this.bridgeFee = str34;
        this.toSwapFee = str35;
        this.toChainNativeTokenSymbol = str36;
        this.hiddenOtherFee = z;
        this.forRefuelFromAmount = str37;
        this.gasStationActivityReward = dexGasStationActivity;
        this.fromGasTokenPriceUsd = str38;
        this.toGasTokenPriceUsd = str39;
        this.finalExploreUrl = str40;
        this.timeoutTimestamp = str41;
        this.orderType = str42;
        this.specialOrderType = str43;
        this.freeGas = str44;
        this.fromEstimatedTime = str45;
        this.bridgeEstimatedTime = str46;
        this.originFromEstimatedTime = str47;
        this.estimateBridgeFeeAmount = str48;
        this.estimateBridgeFeeAmountUsd = str49;
        this.bridgeFeeUsd = str50;
        this.originBridgeEstimatedTime = str51;
        this.orderCompletionTime = str52;
        this.isNativeToken4FromToken = str53;
        this.isNativeToken = str54;
        this.fromTokenAddress = str55;
        this.toTokenAddress = str56;
        this.mevInfo = str57;
        this.fromSwapMevInfo = str58;
        this.toSwapMevInfo = str59;
        this.relativeTransaction = relativeTransactionVO;
        this.priorityFee = str60;
        this.isMemeTimeOut = z2;
        this.assetDelay = z3;
        this.assetDelayTime = str61;
        this.totalSlippage = str62;
        this.defiPlatformInfo = orderDetailDefiPlatformInfo;
        this.tradeMode = i;
        this.dexGasStationFeeDetailVO = dexGasStationFeeDetailVOX;
        this.serviceFeeUsd = str63;
        this.serviceFeeRate = str64;
        this.serviceFee = str65;
        this.serviceFeeTokenSymbol = str66;
        this.isDisplayServiceFee = str67;
        this.toSwapServiceFee = str68;
        this.toSwapServiceFeeUsd = str69;
        this.toSwapServiceFeeTokenSymbol = str70;
        this.serviceFeeSwitch = str71;
        this.fromTokenIsCurrency = z4;
        this.toTokenIsCurrency = z5;
        this.txDirection = str72;
        this.approveMethod = str73;
        this.transactionTypeMultiLanguage = str74;
        this.slippageValue = str75;
        this.strategyMode = i2;
        this.boostVolume = str76;
        this.boostWeight = str77;
        this.isHasSaving = i3;
        this.isHasSurplus = i4;
        this.savingValueUSD = str78;
        this.surplusAmount = str79;
        this.surplusValueUSD = str80;
        this.toAmountValueUsd = str81;
        this.quoteToAmount = str82;
        this.quoteToValueUsd = str83;
        if (dexMultiChildOrderInfoVo2 != null) {
            dexMultiChildOrderInfoVo2.setMainStatus(str7);
            dexMultiChildOrderInfoVo2.setMainEstimatedTime(this.estimatedTime);
            dexMultiChildOrderInfoVo2.setMainFromAddress(str20);
            dexMultiChildOrderInfoVo2.setFromEstimatedTime(this.fromEstimatedTime);
            dexMultiChildOrderInfoVo2.setOriginFromEstimatedTime(str47);
            dexMultiChildOrderInfoVo2.setSwapTradeType(str9);
            dexMultiChildOrderInfoVo2.setHiddenFromOrder(str32);
            dexMultiChildOrderInfoVo2.setPayOrder(false);
            dexMultiChildOrderInfoVo2.setToAmountOut(Intrinsics.EZpvd((Object) dexMultiChildOrderInfoVo2.getSwapTradeType(), (Object) "2") ? dexMultiChildOrderInfoVo2.getFromAmountIn() : dexMultiChildOrderInfoVo2.getToAmountOut());
        }
        if (dexMultiChildOrderInfoVo != null) {
            dexMultiChildOrderInfoVo.setPayOrder(false);
            dexMultiChildOrderInfoVo.setMainStatus(this.status);
            dexMultiChildOrderInfoVo.setMainFromAddress(str20);
            dexMultiChildOrderInfoVo.setMainEstimatedTime(this.estimatedTime);
            dexMultiChildOrderInfoVo.setBridgeEstimatedTime(this.bridgeEstimatedTime);
            dexMultiChildOrderInfoVo.setOriginBridgeEstimatedTime(str51);
            dexMultiChildOrderInfoVo.setSwapTradeType(str9);
            dexMultiChildOrderInfoVo.setHiddenFromOrder(str32);
            dexMultiChildOrderInfoVo.setLastChildOrderToTokenSymbol((dexMultiChildOrderInfoVo2 == null || (toTokenSymbol2 = dexMultiChildOrderInfoVo2.getToTokenSymbol()) == null) ? "" : toTokenSymbol2);
            dexMultiChildOrderInfoVo.setLastChildOrderChainName((dexMultiChildOrderInfoVo2 == null || (toChainName2 = dexMultiChildOrderInfoVo2.getToChainName()) == null) ? "" : toChainName2);
        }
        if (dexMultiChildOrderInfoVo3 != null) {
            dexMultiChildOrderInfoVo3.setPayOrder(false);
            dexMultiChildOrderInfoVo3.setMainFromAddress(str20);
            dexMultiChildOrderInfoVo3.setMainStatus(this.status);
            dexMultiChildOrderInfoVo3.setMainEstimatedTime(this.estimatedTime);
            dexMultiChildOrderInfoVo3.setSwapTradeType(str9);
            dexMultiChildOrderInfoVo3.setLastChildOrderToTokenSymbol((dexMultiChildOrderInfoVo == null || (toTokenSymbol = dexMultiChildOrderInfoVo.getToTokenSymbol()) == null) ? "" : toTokenSymbol);
            dexMultiChildOrderInfoVo3.setLastChildOrderChainName((dexMultiChildOrderInfoVo == null || (toChainName = dexMultiChildOrderInfoVo.getToChainName()) == null) ? "" : toChainName);
            dexMultiChildOrderInfoVo3.setHiddenFromOrder(str32);
        }
    }

    public /* synthetic */ OrderDetailBean(DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, String str, String str2, String str3, DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo2, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo3, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, boolean z, String str37, DexGasStationActivity dexGasStationActivity, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47, String str48, String str49, String str50, String str51, String str52, String str53, String str54, String str55, String str56, String str57, String str58, String str59, RelativeTransactionVO relativeTransactionVO, String str60, boolean z2, boolean z3, String str61, String str62, OrderDetailDefiPlatformInfo orderDetailDefiPlatformInfo, int i, DexGasStationFeeDetailVOX dexGasStationFeeDetailVOX, String str63, String str64, String str65, String str66, String str67, String str68, String str69, String str70, String str71, boolean z4, boolean z5, String str72, String str73, String str74, String str75, int i2, String str76, String str77, int i3, int i4, String str78, String str79, String str80, String str81, String str82, String str83, int i5, int i6, int i7, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z6;
        DexGasStationActivity dexGasStationActivity2;
        String str84;
        DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo4 = (i5 & 1) != 0 ? null : dexMultiChildOrderInfoVo;
        String str85 = (i5 & 2) != 0 ? "" : str;
        String str86 = (i5 & 4) != 0 ? "" : str2;
        String str87 = (i5 & 8) != 0 ? "" : str3;
        DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo5 = (i5 & 16) != 0 ? null : dexMultiChildOrderInfoVo2;
        String str88 = (i5 & 32) != 0 ? "" : str4;
        String str89 = (i5 & 64) != 0 ? "" : str5;
        String str90 = (i5 & 128) != 0 ? "" : str6;
        String str91 = (i5 & 256) != 0 ? "" : str7;
        String str92 = (i5 & 512) != 0 ? "0" : str8;
        String str93 = (i5 & 1024) != 0 ? "" : str9;
        String str94 = (i5 & 2048) != 0 ? "" : str10;
        String str95 = (i5 & 4096) != 0 ? "" : str11;
        String str96 = (i5 & 8192) != 0 ? "" : str12;
        String str97 = (i5 & 16384) != 0 ? "" : str13;
        DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo6 = (i5 & 32768) != 0 ? null : dexMultiChildOrderInfoVo3;
        String str98 = (i5 & 65536) != 0 ? "" : str14;
        String str99 = (i5 & 131072) != 0 ? "" : str15;
        String str100 = (i5 & 262144) != 0 ? "" : str16;
        String str101 = (i5 & 524288) != 0 ? "" : str17;
        String str102 = (i5 & 1048576) != 0 ? "" : str18;
        String str103 = (i5 & 2097152) != 0 ? "" : str19;
        String str104 = (i5 & 4194304) != 0 ? "" : str20;
        String str105 = (i5 & 8388608) != 0 ? "" : str21;
        String str106 = (i5 & 16777216) != 0 ? "" : str22;
        String str107 = (i5 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str23;
        String str108 = (i5 & 67108864) != 0 ? "0" : str24;
        String str109 = (i5 & 134217728) != 0 ? "0" : str25;
        String str110 = (i5 & 268435456) != 0 ? "" : str26;
        String str111 = (i5 & 536870912) != 0 ? "" : str27;
        String str112 = (i5 & 1073741824) != 0 ? "" : str28;
        String str113 = (i5 & Integer.MIN_VALUE) != 0 ? null : str29;
        String str114 = (i6 & 1) != 0 ? "" : str30;
        String str115 = (i6 & 2) != 0 ? "" : str31;
        String str116 = (i6 & 4) != 0 ? MultiTransferSignData.DEFAULT_INTERVAL : str32;
        String str117 = (i6 & 8) != 0 ? "0" : str33;
        String str118 = (i6 & 16) != 0 ? "" : str34;
        String str119 = (i6 & 32) != 0 ? "" : str35;
        String str120 = (i6 & 64) != 0 ? "" : str36;
        String str121 = str113;
        String str122 = str97;
        boolean z7 = (i6 & 128) != 0 ? false : z;
        String str123 = (i6 & 256) != 0 ? "" : str37;
        if ((i6 & 512) != 0) {
            z6 = z7;
            dexGasStationActivity2 = new DexGasStationActivity(0, "");
        } else {
            z6 = z7;
            dexGasStationActivity2 = dexGasStationActivity;
        }
        str84 = "";
        this(dexMultiChildOrderInfoVo4, str85, str86, str87, dexMultiChildOrderInfoVo5, str88, str89, str90, str91, str92, str93, str94, str95, str96, str122, dexMultiChildOrderInfoVo6, str98, str99, str100, str101, str102, str103, str104, str105, str106, str107, str108, str109, str110, str111, str112, str121, str114, str115, str116, str117, str118, str119, str120, z6, str123, dexGasStationActivity2, (i6 & 1024) != 0 ? "" : str38, (i6 & 2048) != 0 ? str84 : str39, (i6 & 4096) != 0 ? str84 : str40, (i6 & 8192) != 0 ? str84 : str41, (i6 & 16384) != 0 ? "1" : str42, (i6 & 32768) != 0 ? str84 : str43, (i6 & 65536) != 0 ? "0" : str44, (i6 & 131072) != 0 ? str84 : str45, (i6 & 262144) != 0 ? str84 : str46, (i6 & 524288) != 0 ? str84 : str47, (i6 & 1048576) != 0 ? str84 : str48, (i6 & 2097152) != 0 ? str84 : str49, (i6 & 4194304) != 0 ? str84 : str50, (i6 & 8388608) != 0 ? str84 : str51, (i6 & 16777216) != 0 ? str84 : str52, (i6 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? str84 : str53, (i6 & 67108864) != 0 ? str84 : str54, (i6 & 134217728) != 0 ? str84 : str55, (i6 & 268435456) != 0 ? str84 : str56, (i6 & 536870912) != 0 ? str84 : str57, (i6 & 1073741824) != 0 ? str84 : str58, (i6 & Integer.MIN_VALUE) != 0 ? str84 : str59, (i7 & 1) != 0 ? null : relativeTransactionVO, (i7 & 2) != 0 ? str84 : str60, (i7 & 4) != 0 ? false : z2, (i7 & 8) != 0 ? false : z3, (i7 & 16) != 0 ? str84 : str61, (i7 & 32) != 0 ? str84 : str62, (i7 & 64) != 0 ? null : orderDetailDefiPlatformInfo, (i7 & 128) != 0 ? TradeMode.SwapMode.getType() : i, (i7 & 256) != 0 ? null : dexGasStationFeeDetailVOX, (i7 & 512) != 0 ? str84 : str63, (i7 & 1024) != 0 ? str84 : str64, (i7 & 2048) != 0 ? str84 : str65, (i7 & 4096) != 0 ? str84 : str66, (i7 & 8192) != 0 ? str84 : str67, (i7 & 16384) != 0 ? str84 : str68, (i7 & 32768) != 0 ? str84 : str69, (i7 & 65536) != 0 ? str84 : str70, (i7 & 131072) != 0 ? str84 : str71, (i7 & 262144) != 0 ? false : z4, (i7 & 524288) != 0 ? false : z5, (i7 & 1048576) != 0 ? str84 : str72, (i7 & 2097152) != 0 ? str84 : str73, (i7 & 4194304) != 0 ? str84 : str74, (i7 & 8388608) != 0 ? str84 : str75, (i7 & 16777216) != 0 ? 0 : i2, (i7 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? str84 : str76, (i7 & 67108864) != 0 ? str84 : str77, (i7 & 134217728) != 0 ? 0 : i3, (i7 & 268435456) != 0 ? 0 : i4, (i7 & 536870912) != 0 ? str84 : str78, (i7 & 1073741824) != 0 ? str84 : str79, (i7 & Integer.MIN_VALUE) != 0 ? str84 : str80, (i8 & 1) != 0 ? str84 : str81, (i8 & 2) != 0 ? str84 : str82, (i8 & 4) == 0 ? str83 : "");
    }

    public final int getDirection() {
        Integer intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(this.txDirection);
        return intOrNull != null ? intOrNull.intValue() : TxDirection.BUY.getValue();
    }

    public final String getFromNetworkFeeSymbol() {
        return yDY.gEmmrt("4", "5").contains(this.swapTradeType) ? getToTokenSymbol() : this.nativeTokenSymbol;
    }

    public final boolean isOpenServiceFee() {
        return Intrinsics.EZpvd((Object) this.serviceFeeSwitch, (Object) "1");
    }

    public final String getReviseBridgeEstimatedTime(String str) {
        if (str != null && C23313hvq.OLrzqt(this.bridgeEstimatedTime, str)) {
            return C33129mqd.gEmmrt(str);
        }
        return this.bridgeEstimatedTime;
    }

    public final boolean isBridgeTimeOut() {
        return Intrinsics.EZpvd((Object) this.bridgeEstimatedTime, (Object) "0") || this.bridgeEstimatedTime.length() == 0;
    }

    public final boolean isFromTimeOut() {
        return Intrinsics.EZpvd((Object) this.fromEstimatedTime, (Object) "0") || this.fromEstimatedTime.length() == 0;
    }

    public final boolean isFreeGas() {
        return Intrinsics.EZpvd((Object) this.freeGas, (Object) "1");
    }

    private final boolean isFromNativeToken() {
        return Intrinsics.EZpvd((Object) this.isNativeToken4FromToken, (Object) "1");
    }

    private final boolean isToNativeToken() {
        return Intrinsics.EZpvd((Object) this.isNativeToken, (Object) "1");
    }

    public final boolean isCrossChainSwap() {
        return Intrinsics.EZpvd((Object) this.swapTradeType, (Object) "3");
    }

    public final boolean isBridge() {
        return Intrinsics.EZpvd((Object) this.swapTradeType, (Object) "2");
    }

    public final boolean isBridgeToType() {
        return Intrinsics.EZpvd((Object) this.hiddenFromOrder, (Object) "1");
    }

    public final boolean isFromBridgeType() {
        return Intrinsics.EZpvd((Object) this.hiddenFromOrder, (Object) MultiTransferSignData.DEFAULT_INTERVAL) && this.toChildOrderDetailVo == null;
    }

    public final boolean isFromBridgeToType() {
        return Intrinsics.EZpvd((Object) this.hiddenFromOrder, (Object) MultiTransferSignData.DEFAULT_INTERVAL) && this.toChildOrderDetailVo != null;
    }

    private final boolean isMemeBuyTransaction() {
        return getDirection() == TransactionType.Buy.getType() && Intrinsics.EZpvd((Object) this.swapTradeType, (Object) "7");
    }

    public final boolean isOutTime() {
        return (!C22822hmc.EZpvd(this.status) && C23313hvq.copydefault(this.estimatedTime, 0)) || this.estimatedTime.length() == 0;
    }

    public final boolean isShowCountDownView() {
        if (C23313hvq.OLrzqt(Long.valueOf(getLeftTimeBy5Minute()), 0)) {
            return Intrinsics.EZpvd((Object) this.status, (Object) "0") || Intrinsics.EZpvd((Object) this.status, (Object) "-4");
        }
        return false;
    }

    public final long getLeftTimeBy5Minute() {
        objSubCheckS$default = C23313hvq.OLrzqt(this.estimatedTime, 0) ? 300000L : C23313hvq.subCheckS$default(C23313hvq.addCheckS$default(this.time, objSubCheckS$default, null, null, null, 14, null), Long.valueOf(System.currentTimeMillis()), null, null, null, 14, null);
        if (C23313hvq.valueOf(objSubCheckS$default, 0)) {
            return 0L;
        }
        return C33129mqd.valueOf(objSubCheckS$default);
    }

    public final boolean isOutOfTimeBy5Minute() {
        if (C23313hvq.valueOf(Long.valueOf(getLeftTimeBy5Minute()), 0)) {
            return Intrinsics.EZpvd((Object) this.status, (Object) "0") || Intrinsics.EZpvd((Object) this.status, (Object) "-4");
        }
        return false;
    }

    public final boolean isFromBitCoinChain() {
        return Intrinsics.EZpvd((Object) this.specialOrderType, (Object) "1");
    }

    public final DexMultiChildOrderInfoVo getPayChildOrder() {
        String str = this.fromAmount;
        String fromTokenSymbol = getFromTokenSymbol();
        String str2 = this.fromIcon;
        String str3 = this.status;
        String str4 = this.fromChainName;
        String str5 = this.from;
        String str6 = this.swapTradeType;
        String str7 = this.estimatedTime;
        RelativeTransactionVO relativeTransactionVO = this.relativeTransaction;
        return new DexMultiChildOrderInfoVo((DexBridgeOrderInfoVo) null, (DexBridgeShadowTokenPairInfoVo) null, MultiTransferSignData.DEFAULT_INTERVAL, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, "1", str, fromTokenSymbol, (String) null, (String) null, "-", (String) null, str2, (String) null, str4, (String) null, false, str6, str3, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, true, (String) null, false, false, false, false, false, false, (DexGasStationActivity) null, (String) null, false, false, false, str7, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, str5, this.specialOrderType, relativeTransactionVO, (String) null, -26556421, 37740542, (DefaultConstructorMarker) null);
    }

    public final DexMultiChildOrderInfoVo getToMainOrder() {
        String str = this.toAmount;
        String toTokenSymbol = getToTokenSymbol();
        String str2 = this.toIcon;
        String str3 = this.status;
        String str4 = this.from;
        String str5 = this.toChainName;
        String str6 = this.swapTradeType;
        String str7 = this.estimatedTime;
        RelativeTransactionVO relativeTransactionVO = this.relativeTransaction;
        return new DexMultiChildOrderInfoVo((DexBridgeOrderInfoVo) null, (DexBridgeShadowTokenPairInfoVo) null, MultiTransferSignData.DEFAULT_INTERVAL, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, str3, str, toTokenSymbol, (String) null, (String) null, "", (String) null, str2, (String) null, str5, (String) null, false, str6, str3, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, false, false, false, false, false, false, (DexGasStationActivity) null, (String) null, false, false, false, str7, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, str4, this.specialOrderType, relativeTransactionVO, (String) null, -30750725, 37740543, (DefaultConstructorMarker) null);
    }

    public final boolean isBridgeStatus() {
        DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo = this.bridgeChildOrderDetailVo;
        return C33129mqd.OLrzqt(dexMultiChildOrderInfoVo != null ? dexMultiChildOrderInfoVo.getStatus() : null, MultiTransferSignData.DEFAULT_INTERVAL);
    }

    public final boolean isReceiveWaiting() {
        return C33129mqd.OLrzqt(this.receiveTokenStatus, "1");
    }

    public final boolean isReceiveTerminalTransforming() {
        return C33129mqd.OLrzqt(this.receiveTokenStatus, "2");
    }

    public final boolean isReceiveSuccess() {
        return C33129mqd.OLrzqt(this.receiveTokenStatus, "3");
    }

    public final String getGasDropFromAmountFormat() {
        return C23271hvA.getShowDataWithSymbol$default(C23271hvA.copydefault, this.forRefuelFromAmount, C25352ivB.EZpvd(getFromTokenSymbol()), false, RoundingMode.DOWN, false, false, 52, null);
    }

    public final String getReceiveAmountShowData() {
        return C23271hvA.getShowData$default(C23271hvA.copydefault, this.receiveTokenAmount, false, RoundingMode.DOWN, false, false, 26, null);
    }

    public final String getReceiveAmountFormat() {
        return C23271hvA.getShowDataWithSymbol$default(C23271hvA.copydefault, this.receiveTokenAmount, C25352ivB.EZpvd(this.receiveTokenSymbol), false, RoundingMode.DOWN, false, false, 52, null);
    }

    public final boolean isHideGasDropView() {
        return Intrinsics.EZpvd((Object) this.receiveTokenStatus, (Object) "0") || C22420hey.KWHzl(this.swapTradeType);
    }

    public final boolean isDiscountGasStation() {
        DexGasStationActivity dexGasStationActivity = this.gasStationActivityReward;
        return C33129mqd.OLrzqt(dexGasStationActivity != null ? Integer.valueOf(dexGasStationActivity.isParticipateActivity()) : null, "1") && C33129mqd.OLrzqt(this.swapTradeType, "4");
    }

    public final boolean isSingleSwapStyle() {
        return Intrinsics.EZpvd((Object) this.swapTradeType, (Object) "4") || Intrinsics.EZpvd((Object) this.swapTradeType, (Object) "1") || Intrinsics.EZpvd((Object) this.swapTradeType, (Object) "7");
    }

    public final boolean isGasStation() {
        return Intrinsics.EZpvd((Object) this.swapTradeType, (Object) "4") || Intrinsics.EZpvd((Object) this.swapTradeType, (Object) "5");
    }

    public final boolean needShowWithdrawalHash() {
        RelativeTransactionVO relativeTransactionVO = this.relativeTransaction;
        return C33129mqd.OLrzqt((CharSequence) (relativeTransactionVO != null ? relativeTransactionVO.getTransactionHash() : null));
    }

    public final boolean isEstimatedBridgeFeesEmpty() {
        return this.estimateBridgeFeeAmount.length() == 0 || this.estimateBridgeFeeAmount.contentEquals("0");
    }

    public final TokenBase getMemeModeTokenBase() {
        if (isMemeBuyTransaction()) {
            String str = this.toChainId;
            String str2 = this.toChainName;
            String toTokenAddress = getToTokenAddress();
            String str3 = this.toIcon;
            String str4 = this.toChainLogoUrl;
            return new TokenBase(str, toTokenAddress, str3, str4, str4, getToTokenSymbol(), getToTokenSymbol(), 0, 0, 0, 0, null, null, null, null, str2, null, 0, 0, false, null, null, false, false, null, null, null, 0, false, null, null, false, -32896, null);
        }
        String str5 = this.fromChainId;
        String str6 = this.fromChainName;
        String fromTokenAddress = getFromTokenAddress();
        String str7 = this.fromIcon;
        String str8 = this.fromChainLogoUrl;
        return new TokenBase(str5, fromTokenAddress, str7, str8, str8, getFromTokenSymbol(), getFromTokenSymbol(), 0, 0, 0, 0, null, null, null, null, str6, null, 0, 0, false, null, null, false, false, null, null, null, 0, false, null, null, false, -32896, null);
    }

    public final AdvancedModeParams getAdvancedModeParams() {
        return new AdvancedModeParams(new DexMultiTokenInfoBean((String) null, this.fromChainId, (String) null, (String) null, (String) null, (String) null, getFromTokenAddress(), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, AudioStats.AUDIO_AMPLITUDE_NONE, false, (String) null, (String) null, (String) null, false, 0, (String) null, (Integer) null, (String) null, (String) null, 0, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (TokenInfoForApp) null, -67, 134217727, (DefaultConstructorMarker) null), new DexMultiTokenInfoBean((String) null, this.toChainId, (String) null, (String) null, (String) null, (String) null, getToTokenAddress(), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, AudioStats.AUDIO_AMPLITUDE_NONE, false, (String) null, (String) null, (String) null, false, 0, (String) null, (Integer) null, (String) null, (String) null, 0, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (TokenInfoForApp) null, -67, 134217727, (DefaultConstructorMarker) null), TxDirection.Companion.KWHzl(getDirection()), Intrinsics.EZpvd((Object) this.status, (Object) MultiTransferSignData.DEFAULT_INTERVAL) ? this.fromAmount : "", null, null, 48, null);
    }

    public final boolean isDisplayServiceFeeSection() {
        return Intrinsics.EZpvd((Object) this.isDisplayServiceFee, (Object) "1");
    }

    public final String getBridgeFromTokenSymbol() {
        DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo = this.bridgeChildOrderDetailVo;
        String fromTokenSymbol = dexMultiChildOrderInfoVo != null ? dexMultiChildOrderInfoVo.getFromTokenSymbol() : null;
        return fromTokenSymbol == null ? "" : fromTokenSymbol;
    }

    public final String getBridgeToTokenSymbol() {
        DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo = this.bridgeChildOrderDetailVo;
        String toTokenSymbol = dexMultiChildOrderInfoVo != null ? dexMultiChildOrderInfoVo.getToTokenSymbol() : null;
        return toTokenSymbol == null ? "" : toTokenSymbol;
    }

    public final boolean isOrderInRedeemStatus() {
        return yDY.gEmmrt("200", "201", "202").contains(this.status);
    }

    @Override // o.InterfaceC20067gZr
    public String getToTokenAmount() {
        String str = this.toAmount;
        if (C23313hvq.copydefault(str, -1)) {
            str = null;
        }
        return str == null ? "" : str;
    }

    @Override // o.InterfaceC20067gZr
    public OrderSubStatus getOrderStatus() {
        return OrderSubStatus.Companion.KWHzl(C33129mqd.AhwBna(this.status));
    }

    @Override // o.InterfaceC20067gZr
    public OrderSide getOrderSide() {
        return OrderSide.Companion.KWHzl(C33129mqd.gEmmrt(Integer.valueOf(getDirection())));
    }

    public boolean isFromNative() {
        return isFromNativeToken();
    }

    public boolean isToNative() {
        return isToNativeToken();
    }
}
