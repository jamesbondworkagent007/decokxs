package com.okinc.unify_trade.biz;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class BizCancelBatchOrderReq {
    private String businessLine;
    private String instId;
    private String ordId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBusinessLine() {
        return this.businessLine;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrdId() {
        return this.ordId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBusinessLine(String str) {
        this.businessLine = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.instId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrdId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ordId = str;
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.BizCancelBatchOrderReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BizCancelBatchOrderReq> serializer() {
            return BizCancelBatchOrderReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BizCancelBatchOrderReq(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, BizCancelBatchOrderReq$$serializer.INSTANCE.getDescriptor());
        }
        this.ordId = str;
        this.instId = str2;
        if ((i & 4) == 0) {
            this.businessLine = null;
        } else {
            this.businessLine = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(BizCancelBatchOrderReq bizCancelBatchOrderReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, bizCancelBatchOrderReq.ordId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, bizCancelBatchOrderReq.instId);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && bizCancelBatchOrderReq.businessLine == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, bizCancelBatchOrderReq.businessLine);
    }

    public BizCancelBatchOrderReq(@NotNull String str, @NotNull String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.ordId = str;
        this.instId = str2;
        this.businessLine = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:534) call: com.okinc.unify_trade.biz.BizCancelBatchOrderReq.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ BizCancelBatchOrderReq(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3);
    }
}
