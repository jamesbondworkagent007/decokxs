package com.okinc.business.dex.tee.domain.model;

import com.okinc.business.dex.trade.order.domain.model.LimitOrderDetailBean;
import com.okinc.business.dex.trade.order.domain.model.LimitOrderDetailBean$$serializer;
import com.okinc.business.dexlogic.bean.OrderDetailBean;
import com.okinc.business.dexlogic.bean.OrderDetailBean$$serializer;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class SignAndBroadcastRes {
    private final OrderDetailBean marketOrderDetail;
    private final String tpslOrderFailMsg;
    private final List<LimitOrderDetailBean> tpslStrategyOrderDetail;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(LimitOrderDetailBean$$serializer.INSTANCE), null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SignAndBroadcastRes() {
        this((List) null, (OrderDetailBean) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.dex.tee.domain.model.SignAndBroadcastRes */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SignAndBroadcastRes copy$default(SignAndBroadcastRes signAndBroadcastRes, List list, OrderDetailBean orderDetailBean, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = signAndBroadcastRes.tpslStrategyOrderDetail;
        }
        if ((i & 2) != 0) {
            orderDetailBean = signAndBroadcastRes.marketOrderDetail;
        }
        if ((i & 4) != 0) {
            str = signAndBroadcastRes.tpslOrderFailMsg;
        }
        return signAndBroadcastRes.copy(list, orderDetailBean, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<LimitOrderDetailBean> component1() {
        return this.tpslStrategyOrderDetail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OrderDetailBean component2() {
        return this.marketOrderDetail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.tpslOrderFailMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignAndBroadcastRes copy(List<LimitOrderDetailBean> list, OrderDetailBean orderDetailBean, String str) {
        return new SignAndBroadcastRes(list, orderDetailBean, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignAndBroadcastRes)) {
            return false;
        }
        SignAndBroadcastRes signAndBroadcastRes = (SignAndBroadcastRes) obj;
        return Intrinsics.EZpvd(this.tpslStrategyOrderDetail, signAndBroadcastRes.tpslStrategyOrderDetail) && Intrinsics.EZpvd(this.marketOrderDetail, signAndBroadcastRes.marketOrderDetail) && Intrinsics.EZpvd((Object) this.tpslOrderFailMsg, (Object) signAndBroadcastRes.tpslOrderFailMsg);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OrderDetailBean getMarketOrderDetail() {
        return this.marketOrderDetail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTpslOrderFailMsg() {
        return this.tpslOrderFailMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<LimitOrderDetailBean> getTpslStrategyOrderDetail() {
        return this.tpslStrategyOrderDetail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        List<LimitOrderDetailBean> list = this.tpslStrategyOrderDetail;
        int iHashCode = list == null ? 0 : list.hashCode();
        OrderDetailBean orderDetailBean = this.marketOrderDetail;
        int iHashCode2 = orderDetailBean == null ? 0 : orderDetailBean.hashCode();
        String str = this.tpslOrderFailMsg;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str != null ? str.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SignAndBroadcastRes(tpslStrategyOrderDetail=" + this.tpslStrategyOrderDetail + ", marketOrderDetail=" + this.marketOrderDetail + ", tpslOrderFailMsg=" + this.tpslOrderFailMsg + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.tee.domain.model.SignAndBroadcastRes.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SignAndBroadcastRes> serializer() {
            return SignAndBroadcastRes$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SignAndBroadcastRes(int i, List list, OrderDetailBean orderDetailBean, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.tpslStrategyOrderDetail = null;
        } else {
            this.tpslStrategyOrderDetail = list;
        }
        if ((i & 2) == 0) {
            this.marketOrderDetail = null;
        } else {
            this.marketOrderDetail = orderDetailBean;
        }
        if ((i & 4) == 0) {
            this.tpslOrderFailMsg = null;
        } else {
            this.tpslOrderFailMsg = str;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(SignAndBroadcastRes signAndBroadcastRes, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || signAndBroadcastRes.tpslStrategyOrderDetail != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], signAndBroadcastRes.tpslStrategyOrderDetail);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || signAndBroadcastRes.marketOrderDetail != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, OrderDetailBean$$serializer.INSTANCE, signAndBroadcastRes.marketOrderDetail);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && signAndBroadcastRes.tpslOrderFailMsg == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, signAndBroadcastRes.tpslOrderFailMsg);
    }

    public SignAndBroadcastRes(List<LimitOrderDetailBean> list, OrderDetailBean orderDetailBean, String str) {
        this.tpslStrategyOrderDetail = list;
        this.marketOrderDetail = orderDetailBean;
        this.tpslOrderFailMsg = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r2v0 java.util.List))
  (wrap:com.okinc.business.dexlogic.bean.OrderDetailBean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.OrderDetailBean) : (r3v0 com.okinc.business.dexlogic.bean.OrderDetailBean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
 A[MD:(java.util.List<com.okinc.business.dex.trade.order.domain.model.LimitOrderDetailBean>, com.okinc.business.dexlogic.bean.OrderDetailBean, java.lang.String):void (m)] (LINE:183) call: com.okinc.business.dex.tee.domain.model.SignAndBroadcastRes.<init>(java.util.List, com.okinc.business.dexlogic.bean.OrderDetailBean, java.lang.String):void type: THIS */
    public /* synthetic */ SignAndBroadcastRes(List list, OrderDetailBean orderDetailBean, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : orderDetailBean, (i & 4) != 0 ? null : str);
    }
}
