package com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model;

import com.okinc.business.web3pay.lib.core.model.FromToType;
import com.okinc.business.web3pay.lib.core.model.GasPayType;
import com.okinc.business.web3pay.lib.core.model.OrderStatus;
import com.okinc.business.web3pay.lib.core.model.OrderType;
import com.okinc.business.web3pay.lib.core.model.ProductCode;
import com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.BaseOrderDetailApiModel;
import java.lang.annotation.Annotation;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C31337lsC;
import o.C56392yDr;
import o.C56524yIo;
import o.InterfaceC56387yDm;
import o.InterfaceC56551yJo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public abstract class BaseOrderDetailApiModel {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.lsx
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return BaseOrderDetailApiModel._init_$_anonymous_();
        }
    });

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.BaseOrderDetailApiModel.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ BaseOrderDetailApiModel(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final /* synthetic */ void write$Self(BaseOrderDetailApiModel baseOrderDetailApiModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C31337lsC applyExtraFields(@NotNull C31337lsC c31337lsC) {
        Intrinsics.checkNotNullParameter(c31337lsC, "");
        return c31337lsC;
    }

    public abstract String getActivationFeeTokenAmount();

    public abstract String getActivationFeeUsdAmount();

    public abstract String getAreaCode();

    public abstract String getChainIndex();

    public abstract long getCreateTime();

    public abstract String getErrMsg();

    public abstract Integer getFailedType();

    public abstract String getFeeTokenAmount();

    public abstract int getFeeTokenDecimal();

    public abstract String getFeeTokenSymbol();

    public abstract String getFeeTokenUsdAmount();

    public abstract String getFrom();

    public abstract Integer getFromType();

    public abstract int getGasPayType();

    public abstract String getMerchantId();

    public abstract String getNetworkLogo();

    public abstract String getNetworkName();

    public abstract String getOrderId();

    public abstract int getOrderType();

    public abstract String getParentOrderId();

    public abstract String getProductCode();

    public abstract int getStatus();

    public abstract Long getTimeToCancel();

    public abstract String getTo();

    public abstract Integer getToType();

    public abstract String getTokenAddress();

    public abstract String getTokenAmount();

    public abstract int getTokenDecimal();

    public abstract String getTokenLogo();

    public abstract String getTokenSymbol();

    public abstract String getTokenUsdAmount();

    public abstract String getTransferComment();

    public abstract String getTxHash();

    public abstract String getUopHash();

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.BaseOrderDetailApiModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer KWHzl() {
            return (KSerializer) BaseOrderDetailApiModel.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<BaseOrderDetailApiModel> serializer() {
            return KWHzl();
        }
    }

    private BaseOrderDetailApiModel() {
    }

    public /* synthetic */ BaseOrderDetailApiModel(int i, SerializationConstructorMarker serializationConstructorMarker) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return new SealedClassSerializer("com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.BaseOrderDetailApiModel", C56524yIo.AEQbTJ(BaseOrderDetailApiModel.class), new InterfaceC56551yJo[]{C56524yIo.AEQbTJ(CardAuthOrderDetailApiModel.class), C56524yIo.AEQbTJ(ConvertOrderDetailApiModel.class), C56524yIo.AEQbTJ(OrderDetailApiModel.class), C56524yIo.AEQbTJ(RedPacketOrderDetailApiModel.class)}, new KSerializer[]{CardAuthOrderDetailApiModel$$serializer.INSTANCE, ConvertOrderDetailApiModel$$serializer.INSTANCE, OrderDetailApiModel$$serializer.INSTANCE, RedPacketOrderDetailApiModel$$serializer.INSTANCE}, new Annotation[0]);
    }

    public C31337lsC toDomainModel() {
        String orderId = getOrderId();
        String parentOrderId = getParentOrderId();
        String uopHash = getUopHash();
        String txHash = getTxHash();
        if (txHash == null) {
            txHash = "";
        }
        if (uopHash != null && uopHash.length() != 0 && !StringsKt__StringsKt.fARcdN((CharSequence) uopHash)) {
            txHash = uopHash;
        }
        String chainIndex = getChainIndex();
        OrderType orderTypeOLrzqt = OrderType.Companion.OLrzqt(getOrderType());
        String from = getFrom();
        String str = from == null ? "" : from;
        FromToType.StateListAnimator stateListAnimator = FromToType.Companion;
        FromToType fromToTypeCopydefault = stateListAnimator.copydefault(getFromType());
        String to = getTo();
        if (to == null) {
            to = "";
        }
        String areaCode = getAreaCode();
        FromToType fromToTypeCopydefault2 = stateListAnimator.copydefault(getToType());
        String tokenAmount = getTokenAmount();
        String str2 = tokenAmount == null ? "0" : tokenAmount;
        int tokenDecimal = getTokenDecimal();
        String tokenUsdAmount = getTokenUsdAmount();
        String str3 = tokenUsdAmount == null ? "0" : tokenUsdAmount;
        String tokenLogo = getTokenLogo();
        String tokenSymbol = getTokenSymbol();
        String tokenAddress = getTokenAddress();
        String feeTokenAmount = getFeeTokenAmount();
        String str4 = feeTokenAmount == null ? "0" : feeTokenAmount;
        int feeTokenDecimal = getFeeTokenDecimal();
        String feeTokenSymbol = getFeeTokenSymbol();
        String feeTokenUsdAmount = getFeeTokenUsdAmount();
        String str5 = feeTokenUsdAmount == null ? "0" : feeTokenUsdAmount;
        OrderStatus orderStatusEZpvd = OrderStatus.Companion.EZpvd(getStatus());
        String errMsg = getErrMsg();
        Integer failedType = getFailedType();
        String transferComment = getTransferComment();
        long createTime = getCreateTime();
        Long timeToCancel = getTimeToCancel();
        return applyExtraFields(new C31337lsC(orderId, parentOrderId, txHash, chainIndex, orderTypeOLrzqt, str, fromToTypeCopydefault, to, areaCode, fromToTypeCopydefault2, str2, tokenDecimal, str3, tokenLogo, tokenSymbol, tokenAddress, str4, feeTokenDecimal, feeTokenSymbol, str5, orderStatusEZpvd, errMsg, failedType, transferComment, createTime, timeToCancel != null ? timeToCancel.longValue() : 0L, GasPayType.Companion.copydefault(getGasPayType()), getNetworkName(), getNetworkLogo(), getActivationFeeTokenAmount(), getActivationFeeUsdAmount(), null, null, null, getMerchantId(), ProductCode.Companion.AEQbTJ(getProductCode()), null, null, null, Integer.MIN_VALUE, 115, null));
    }
}
