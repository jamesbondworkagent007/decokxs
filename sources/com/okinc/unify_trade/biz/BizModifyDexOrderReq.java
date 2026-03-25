package com.okinc.unify_trade.biz;

import com.okinc.dex.StopOrderQuoteVO;
import com.okinc.dex.StopOrderQuoteVO$$serializer;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class BizModifyDexOrderReq {
    private String orderId;
    private List<StopOrderQuoteVO> stopOrders;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(StopOrderQuoteVO$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderId() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<StopOrderQuoteVO> getStopOrders() {
        return this.stopOrders;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrderId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.orderId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStopOrders(@NotNull List<StopOrderQuoteVO> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.stopOrders = list;
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.BizModifyDexOrderReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BizModifyDexOrderReq> serializer() {
            return BizModifyDexOrderReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BizModifyDexOrderReq(int i, String str, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, BizModifyDexOrderReq$$serializer.INSTANCE.getDescriptor());
        }
        this.orderId = str;
        this.stopOrders = list;
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(BizModifyDexOrderReq bizModifyDexOrderReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, bizModifyDexOrderReq.orderId);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], bizModifyDexOrderReq.stopOrders);
    }

    public BizModifyDexOrderReq(@NotNull String str, @NotNull List<StopOrderQuoteVO> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.orderId = str;
        this.stopOrders = list;
    }
}
