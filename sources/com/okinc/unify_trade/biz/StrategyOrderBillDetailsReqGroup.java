package com.okinc.unify_trade.biz;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class StrategyOrderBillDetailsReqGroup {
    private boolean hasWs;
    private String ordType;
    private StrategyOrderBillDetailsReq req;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ StrategyOrderBillDetailsReqGroup copy$default(StrategyOrderBillDetailsReqGroup strategyOrderBillDetailsReqGroup, boolean z, StrategyOrderBillDetailsReq strategyOrderBillDetailsReq, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = strategyOrderBillDetailsReqGroup.hasWs;
        }
        if ((i & 2) != 0) {
            strategyOrderBillDetailsReq = strategyOrderBillDetailsReqGroup.req;
        }
        if ((i & 4) != 0) {
            str = strategyOrderBillDetailsReqGroup.ordType;
        }
        return strategyOrderBillDetailsReqGroup.copy(z, strategyOrderBillDetailsReq, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.hasWs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyOrderBillDetailsReq component2() {
        return this.req;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.ordType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyOrderBillDetailsReqGroup copy(boolean z, @NotNull StrategyOrderBillDetailsReq strategyOrderBillDetailsReq, @NotNull String str) {
        Intrinsics.checkNotNullParameter(strategyOrderBillDetailsReq, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new StrategyOrderBillDetailsReqGroup(z, strategyOrderBillDetailsReq, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StrategyOrderBillDetailsReqGroup)) {
            return false;
        }
        StrategyOrderBillDetailsReqGroup strategyOrderBillDetailsReqGroup = (StrategyOrderBillDetailsReqGroup) obj;
        return this.hasWs == strategyOrderBillDetailsReqGroup.hasWs && Intrinsics.EZpvd(this.req, strategyOrderBillDetailsReqGroup.req) && Intrinsics.EZpvd((Object) this.ordType, (Object) strategyOrderBillDetailsReqGroup.ordType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getHasWs() {
        return this.hasWs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrdType() {
        return this.ordType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyOrderBillDetailsReq getReq() {
        return this.req;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((Boolean.hashCode(this.hasWs) * 31) + this.req.hashCode()) * 31) + this.ordType.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHasWs(boolean z) {
        this.hasWs = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrdType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ordType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setReq(@NotNull StrategyOrderBillDetailsReq strategyOrderBillDetailsReq) {
        Intrinsics.checkNotNullParameter(strategyOrderBillDetailsReq, "");
        this.req = strategyOrderBillDetailsReq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "StrategyOrderBillDetailsReqGroup(hasWs=" + this.hasWs + ", req=" + this.req + ", ordType=" + this.ordType + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.StrategyOrderBillDetailsReqGroup.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<StrategyOrderBillDetailsReqGroup> serializer() {
            return StrategyOrderBillDetailsReqGroup$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ StrategyOrderBillDetailsReqGroup(int i, boolean z, StrategyOrderBillDetailsReq strategyOrderBillDetailsReq, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, StrategyOrderBillDetailsReqGroup$$serializer.INSTANCE.getDescriptor());
        }
        this.hasWs = z;
        this.req = strategyOrderBillDetailsReq;
        if ((i & 4) == 0) {
            this.ordType = "";
        } else {
            this.ordType = str;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(StrategyOrderBillDetailsReqGroup strategyOrderBillDetailsReqGroup, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeBooleanElement(serialDescriptor, 0, strategyOrderBillDetailsReqGroup.hasWs);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, StrategyOrderBillDetailsReq$$serializer.INSTANCE, strategyOrderBillDetailsReqGroup.req);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd((Object) strategyOrderBillDetailsReqGroup.ordType, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, strategyOrderBillDetailsReqGroup.ordType);
    }

    public StrategyOrderBillDetailsReqGroup(boolean z, @NotNull StrategyOrderBillDetailsReq strategyOrderBillDetailsReq, @NotNull String str) {
        Intrinsics.checkNotNullParameter(strategyOrderBillDetailsReq, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.hasWs = z;
        this.req = strategyOrderBillDetailsReq;
        this.ordType = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 boolean)
  (r2v0 com.okinc.unify_trade.biz.StrategyOrderBillDetailsReq)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
 A[MD:(boolean, com.okinc.unify_trade.biz.StrategyOrderBillDetailsReq, java.lang.String):void (m)] (LINE:1844) call: com.okinc.unify_trade.biz.StrategyOrderBillDetailsReqGroup.<init>(boolean, com.okinc.unify_trade.biz.StrategyOrderBillDetailsReq, java.lang.String):void type: THIS */
    public /* synthetic */ StrategyOrderBillDetailsReqGroup(boolean z, StrategyOrderBillDetailsReq strategyOrderBillDetailsReq, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, strategyOrderBillDetailsReq, (i & 4) != 0 ? "" : str);
    }
}
