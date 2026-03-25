package com.okinc.business.dex.trade.order.domain.model;

import com.okinc.business.dex.tee.domain.model.Rules;
import com.okinc.business.dex.trade.order.domain.model.OpenOrderData;
import com.okinc.business.dexlogic.bean.DexAutoSlippageInfoParam;
import com.okinc.business.dexlogic.bean.DexGasStationActivity;
import com.okinc.business.dexlogic.bean.DexGasStationFeeDetailVOX;
import com.okinc.business.dexlogic.bean.DexMultiChildOrderInfoVo;
import com.okinc.business.dexlogic.bean.OrderDetailBean;
import com.okinc.business.dexlogic.bean.OrderDetailBean$$serializer;
import com.okinc.business.dexlogic.bean.OrderDetailDefiPlatformInfo;
import com.okinc.business.dexlogic.bean.RelativeTransactionVO;
import com.okinc.business.dexlogic.bean.ServiceFeeInfo;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C31200lpY;
import o.C56392yDr;
import o.InterfaceC20067gZr;
import o.InterfaceC56387yDm;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class OpenOrderData {
    private final InterfaceC56387yDm isMarketOrder$delegate;
    private final OrderDetailBean marketOrderInfo;
    private final InterfaceC56387yDm orderDetailInfo$delegate;
    private final int orderType;
    private final InterfaceC56387yDm orderTypeEnum$delegate;
    private final LimitOrderDetailBean strategyOrderInfo;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OpenOrderData() {
        this((LimitOrderDetailBean) null, (OrderDetailBean) null, 0, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ OpenOrderData copy$default(OpenOrderData openOrderData, LimitOrderDetailBean limitOrderDetailBean, OrderDetailBean orderDetailBean, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            limitOrderDetailBean = openOrderData.strategyOrderInfo;
        }
        if ((i2 & 2) != 0) {
            orderDetailBean = openOrderData.marketOrderInfo;
        }
        if ((i2 & 4) != 0) {
            i = openOrderData.orderType;
        }
        return openOrderData.copy(limitOrderDetailBean, orderDetailBean, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LimitOrderDetailBean component1() {
        return this.strategyOrderInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OrderDetailBean component2() {
        return this.marketOrderInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.orderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OpenOrderData copy(LimitOrderDetailBean limitOrderDetailBean, OrderDetailBean orderDetailBean, int i) {
        return new OpenOrderData(limitOrderDetailBean, orderDetailBean, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OpenOrderData)) {
            return false;
        }
        OpenOrderData openOrderData = (OpenOrderData) obj;
        return Intrinsics.EZpvd(this.strategyOrderInfo, openOrderData.strategyOrderInfo) && Intrinsics.EZpvd(this.marketOrderInfo, openOrderData.marketOrderInfo) && this.orderType == openOrderData.orderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OrderDetailBean getMarketOrderInfo() {
        return this.marketOrderInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getOrderType() {
        return this.orderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LimitOrderDetailBean getStrategyOrderInfo() {
        return this.strategyOrderInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        LimitOrderDetailBean limitOrderDetailBean = this.strategyOrderInfo;
        int iHashCode = limitOrderDetailBean == null ? 0 : limitOrderDetailBean.hashCode();
        OrderDetailBean orderDetailBean = this.marketOrderInfo;
        return (((iHashCode * 31) + (orderDetailBean != null ? orderDetailBean.hashCode() : 0)) * 31) + Integer.hashCode(this.orderType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OpenOrderData(strategyOrderInfo=" + this.strategyOrderInfo + ", marketOrderInfo=" + this.marketOrderInfo + ", orderType=" + this.orderType + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.order.domain.model.OpenOrderData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OpenOrderData> serializer() {
            return OpenOrderData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OpenOrderData(int i, LimitOrderDetailBean limitOrderDetailBean, OrderDetailBean orderDetailBean, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.strategyOrderInfo = null;
        } else {
            this.strategyOrderInfo = limitOrderDetailBean;
        }
        if ((i & 2) == 0) {
            this.marketOrderInfo = null;
        } else {
            this.marketOrderInfo = orderDetailBean;
        }
        if ((i & 4) == 0) {
            this.orderType = -1;
        } else {
            this.orderType = i2;
        }
        this.orderTypeEnum$delegate = C56392yDr.copydefault(new Function0() { // from class: o.gZh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return OpenOrderData._init_$lambda$3(this.copydefault);
            }
        });
        this.isMarketOrder$delegate = C56392yDr.copydefault(new Function0() { // from class: o.gZi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(OpenOrderData._init_$lambda$4(this.KWHzl));
            }
        });
        this.orderDetailInfo$delegate = C56392yDr.copydefault(new Function0() { // from class: o.gZn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return OpenOrderData._init_$lambda$5(this.AEQbTJ);
            }
        });
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(OpenOrderData openOrderData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || openOrderData.strategyOrderInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, LimitOrderDetailBean$$serializer.INSTANCE, openOrderData.strategyOrderInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || openOrderData.marketOrderInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, OrderDetailBean$$serializer.INSTANCE, openOrderData.marketOrderInfo);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && openOrderData.orderType == -1) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 2, openOrderData.orderType);
    }

    public OpenOrderData(LimitOrderDetailBean limitOrderDetailBean, OrderDetailBean orderDetailBean, int i) {
        this.strategyOrderInfo = limitOrderDetailBean;
        this.marketOrderInfo = orderDetailBean;
        this.orderType = i;
        this.orderTypeEnum$delegate = C56392yDr.copydefault(new Function0() { // from class: o.gZm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return OpenOrderData.orderTypeEnum_delegate$lambda$0(this.OLrzqt);
            }
        });
        this.isMarketOrder$delegate = C56392yDr.copydefault(new Function0() { // from class: o.gZj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(OpenOrderData.isMarketOrder_delegate$lambda$1(this.copydefault));
            }
        });
        this.orderDetailInfo$delegate = C56392yDr.copydefault(new Function0() { // from class: o.gZk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return OpenOrderData.orderDetailInfo_delegate$lambda$2(this.KWHzl);
            }
        });
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:com.okinc.business.dex.trade.order.domain.model.LimitOrderDetailBean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dex.trade.order.domain.model.LimitOrderDetailBean) : (r2v0 com.okinc.business.dex.trade.order.domain.model.LimitOrderDetailBean))
  (wrap:com.okinc.business.dexlogic.bean.OrderDetailBean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.OrderDetailBean) : (r3v0 com.okinc.business.dexlogic.bean.OrderDetailBean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r4v0 int))
 A[MD:(com.okinc.business.dex.trade.order.domain.model.LimitOrderDetailBean, com.okinc.business.dexlogic.bean.OrderDetailBean, int):void (m)] (LINE:19) call: com.okinc.business.dex.trade.order.domain.model.OpenOrderData.<init>(com.okinc.business.dex.trade.order.domain.model.LimitOrderDetailBean, com.okinc.business.dexlogic.bean.OrderDetailBean, int):void type: THIS */
    public /* synthetic */ OpenOrderData(LimitOrderDetailBean limitOrderDetailBean, OrderDetailBean orderDetailBean, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : limitOrderDetailBean, (i2 & 2) != 0 ? null : orderDetailBean, (i2 & 4) != 0 ? -1 : i);
    }

    public final OrderStrategyType getOrderTypeEnum() {
        return (OrderStrategyType) this.orderTypeEnum$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrderStrategyType _init_$lambda$3(OpenOrderData openOrderData) {
        return OrderStrategyType.Companion.copydefault(openOrderData.orderType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrderStrategyType orderTypeEnum_delegate$lambda$0(OpenOrderData openOrderData) {
        return OrderStrategyType.Companion.copydefault(openOrderData.orderType);
    }

    public final boolean isMarketOrder() {
        return ((Boolean) this.isMarketOrder$delegate.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$4(OpenOrderData openOrderData) {
        return openOrderData.getOrderTypeEnum() == OrderStrategyType.Market;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isMarketOrder_delegate$lambda$1(OpenOrderData openOrderData) {
        return openOrderData.getOrderTypeEnum() == OrderStrategyType.Market;
    }

    public final InterfaceC20067gZr getOrderDetailInfo() {
        return (InterfaceC20067gZr) this.orderDetailInfo$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC20067gZr _init_$lambda$5(OpenOrderData openOrderData) {
        if (openOrderData.isMarketOrder()) {
            OrderDetailBean orderDetailBean = openOrderData.marketOrderInfo;
            if (orderDetailBean != null) {
                return orderDetailBean;
            }
            return (OrderDetailBean) C31200lpY.copydefault(new OrderDetailBean((DexMultiChildOrderInfoVo) null, (String) null, (String) null, (String) null, (DexMultiChildOrderInfoVo) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (DexMultiChildOrderInfoVo) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (DexGasStationActivity) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (RelativeTransactionVO) null, (String) null, false, false, (String) null, (String) null, (OrderDetailDefiPlatformInfo) null, 0, (DexGasStationFeeDetailVOX) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, false, (String) null, (String) null, (String) null, (String) null, 0, (String) null, (String) null, 0, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, -1, -1, -1, 7, (DefaultConstructorMarker) null), "marketOrderInfo can't be null, orderType=" + openOrderData.orderType);
        }
        LimitOrderDetailBean limitOrderDetailBean = openOrderData.strategyOrderInfo;
        if (limitOrderDetailBean != null) {
            return limitOrderDetailBean;
        }
        return (LimitOrderDetailBean) C31200lpY.copydefault(new LimitOrderDetailBean((String) null, (String) null, (String) null, (String) null, (String) null, 0, (String) null, (String) null, (TokenInfo) null, (TokenInfo) null, (TriggerInfo) null, (String) null, (String) null, (DexAutoSlippageInfoParam) null, (LimitOrderDetailNetworkFeeInfo) null, (ServiceFeeInfo) null, (String) null, (String) null, (LimitOrderDetailProviderInfo) null, (LimitOrderDetailTransactionInfo) null, (List) null, (String) null, (String) null, (String) null, false, 0, (String) null, (String) null, (Rules) null, 0, (Integer) null, 0, (String) null, (BoostInfo) null, (LimitSurplus) null, -1, 7, (DefaultConstructorMarker) null), "strategyOrderInfo can't be null, orderType=" + openOrderData.orderType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC20067gZr orderDetailInfo_delegate$lambda$2(OpenOrderData openOrderData) {
        if (openOrderData.isMarketOrder()) {
            OrderDetailBean orderDetailBean = openOrderData.marketOrderInfo;
            if (orderDetailBean != null) {
                return orderDetailBean;
            }
            return (OrderDetailBean) C31200lpY.copydefault(new OrderDetailBean((DexMultiChildOrderInfoVo) null, (String) null, (String) null, (String) null, (DexMultiChildOrderInfoVo) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (DexMultiChildOrderInfoVo) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (DexGasStationActivity) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (RelativeTransactionVO) null, (String) null, false, false, (String) null, (String) null, (OrderDetailDefiPlatformInfo) null, 0, (DexGasStationFeeDetailVOX) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, false, (String) null, (String) null, (String) null, (String) null, 0, (String) null, (String) null, 0, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, -1, -1, -1, 7, (DefaultConstructorMarker) null), "marketOrderInfo can't be null, orderType=" + openOrderData.orderType);
        }
        LimitOrderDetailBean limitOrderDetailBean = openOrderData.strategyOrderInfo;
        if (limitOrderDetailBean != null) {
            return limitOrderDetailBean;
        }
        return (LimitOrderDetailBean) C31200lpY.copydefault(new LimitOrderDetailBean((String) null, (String) null, (String) null, (String) null, (String) null, 0, (String) null, (String) null, (TokenInfo) null, (TokenInfo) null, (TriggerInfo) null, (String) null, (String) null, (DexAutoSlippageInfoParam) null, (LimitOrderDetailNetworkFeeInfo) null, (ServiceFeeInfo) null, (String) null, (String) null, (LimitOrderDetailProviderInfo) null, (LimitOrderDetailTransactionInfo) null, (List) null, (String) null, (String) null, (String) null, false, 0, (String) null, (String) null, (Rules) null, 0, (Integer) null, 0, (String) null, (BoostInfo) null, (LimitSurplus) null, -1, 7, (DefaultConstructorMarker) null), "strategyOrderInfo can't be null, orderType=" + openOrderData.orderType);
    }
}
