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

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class BotOrderListReqGroup {
    private boolean hasWs;
    private StrategyHistoryListReq historyReq;
    private boolean isHistory;
    private String originalType;
    private StrategyPendingListReq pendingReq;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BotOrderListReqGroup copy$default(BotOrderListReqGroup botOrderListReqGroup, boolean z, boolean z2, StrategyPendingListReq strategyPendingListReq, StrategyHistoryListReq strategyHistoryListReq, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = botOrderListReqGroup.isHistory;
        }
        if ((i & 2) != 0) {
            z2 = botOrderListReqGroup.hasWs;
        }
        boolean z3 = z2;
        if ((i & 4) != 0) {
            strategyPendingListReq = botOrderListReqGroup.pendingReq;
        }
        StrategyPendingListReq strategyPendingListReq2 = strategyPendingListReq;
        if ((i & 8) != 0) {
            strategyHistoryListReq = botOrderListReqGroup.historyReq;
        }
        StrategyHistoryListReq strategyHistoryListReq2 = strategyHistoryListReq;
        if ((i & 16) != 0) {
            str = botOrderListReqGroup.originalType;
        }
        return botOrderListReqGroup.copy(z, z3, strategyPendingListReq2, strategyHistoryListReq2, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.isHistory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.hasWs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyPendingListReq component3() {
        return this.pendingReq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyHistoryListReq component4() {
        return this.historyReq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.originalType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotOrderListReqGroup copy(boolean z, boolean z2, @NotNull StrategyPendingListReq strategyPendingListReq, @NotNull StrategyHistoryListReq strategyHistoryListReq, @NotNull String str) {
        Intrinsics.checkNotNullParameter(strategyPendingListReq, "");
        Intrinsics.checkNotNullParameter(strategyHistoryListReq, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new BotOrderListReqGroup(z, z2, strategyPendingListReq, strategyHistoryListReq, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BotOrderListReqGroup)) {
            return false;
        }
        BotOrderListReqGroup botOrderListReqGroup = (BotOrderListReqGroup) obj;
        return this.isHistory == botOrderListReqGroup.isHistory && this.hasWs == botOrderListReqGroup.hasWs && Intrinsics.EZpvd(this.pendingReq, botOrderListReqGroup.pendingReq) && Intrinsics.EZpvd(this.historyReq, botOrderListReqGroup.historyReq) && Intrinsics.EZpvd((Object) this.originalType, (Object) botOrderListReqGroup.originalType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getHasWs() {
        return this.hasWs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyHistoryListReq getHistoryReq() {
        return this.historyReq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOriginalType() {
        return this.originalType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyPendingListReq getPendingReq() {
        return this.pendingReq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((Boolean.hashCode(this.isHistory) * 31) + Boolean.hashCode(this.hasWs)) * 31) + this.pendingReq.hashCode()) * 31) + this.historyReq.hashCode()) * 31) + this.originalType.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isHistory() {
        return this.isHistory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHasWs(boolean z) {
        this.hasWs = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHistory(boolean z) {
        this.isHistory = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHistoryReq(@NotNull StrategyHistoryListReq strategyHistoryListReq) {
        Intrinsics.checkNotNullParameter(strategyHistoryListReq, "");
        this.historyReq = strategyHistoryListReq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOriginalType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.originalType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPendingReq(@NotNull StrategyPendingListReq strategyPendingListReq) {
        Intrinsics.checkNotNullParameter(strategyPendingListReq, "");
        this.pendingReq = strategyPendingListReq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BotOrderListReqGroup(isHistory=" + this.isHistory + ", hasWs=" + this.hasWs + ", pendingReq=" + this.pendingReq + ", historyReq=" + this.historyReq + ", originalType=" + this.originalType + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.BotOrderListReqGroup.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BotOrderListReqGroup> serializer() {
            return BotOrderListReqGroup$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BotOrderListReqGroup(int i, boolean z, boolean z2, StrategyPendingListReq strategyPendingListReq, StrategyHistoryListReq strategyHistoryListReq, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (16 != (i & 16)) {
            PluginExceptionsKt.throwMissingFieldException(i, 16, BotOrderListReqGroup$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.isHistory = false;
        } else {
            this.isHistory = z;
        }
        if ((i & 2) == 0) {
            this.hasWs = false;
        } else {
            this.hasWs = z2;
        }
        if ((i & 4) == 0) {
            this.pendingReq = new StrategyPendingListReq();
        } else {
            this.pendingReq = strategyPendingListReq;
        }
        if ((i & 8) == 0) {
            this.historyReq = new StrategyHistoryListReq();
        } else {
            this.historyReq = strategyHistoryListReq;
        }
        this.originalType = str;
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(BotOrderListReqGroup botOrderListReqGroup, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || botOrderListReqGroup.isHistory) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 0, botOrderListReqGroup.isHistory);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || botOrderListReqGroup.hasWs) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 1, botOrderListReqGroup.hasWs);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(botOrderListReqGroup.pendingReq, new StrategyPendingListReq())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, StrategyPendingListReq$$serializer.INSTANCE, botOrderListReqGroup.pendingReq);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd(botOrderListReqGroup.historyReq, new StrategyHistoryListReq())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 3, StrategyHistoryListReq$$serializer.INSTANCE, botOrderListReqGroup.historyReq);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 4, botOrderListReqGroup.originalType);
    }

    public BotOrderListReqGroup(boolean z, boolean z2, @NotNull StrategyPendingListReq strategyPendingListReq, @NotNull StrategyHistoryListReq strategyHistoryListReq, @NotNull String str) {
        Intrinsics.checkNotNullParameter(strategyPendingListReq, "");
        Intrinsics.checkNotNullParameter(strategyHistoryListReq, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.isHistory = z;
        this.hasWs = z2;
        this.pendingReq = strategyPendingListReq;
        this.historyReq = strategyHistoryListReq;
        this.originalType = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0025: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r8v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0008: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r9v0 boolean))
  (wrap:com.okinc.unify_trade.biz.StrategyPendingListReq:0x0018: TERNARY null = ((wrap:int:0x000f: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.unify_trade.biz.StrategyPendingListReq:0x0015: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:1016) call: com.okinc.unify_trade.biz.StrategyPendingListReq.<init>():void type: CONSTRUCTOR) : (r10v0 com.okinc.unify_trade.biz.StrategyPendingListReq))
  (wrap:com.okinc.unify_trade.biz.StrategyHistoryListReq:?: TERNARY null = ((wrap:int:0x0019: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.unify_trade.biz.StrategyHistoryListReq:0x001f: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:1017) call: com.okinc.unify_trade.biz.StrategyHistoryListReq.<init>():void type: CONSTRUCTOR) : (r11v0 com.okinc.unify_trade.biz.StrategyHistoryListReq))
  (r12v0 java.lang.String)
 A[MD:(boolean, boolean, com.okinc.unify_trade.biz.StrategyPendingListReq, com.okinc.unify_trade.biz.StrategyHistoryListReq, java.lang.String):void (m)] (LINE:1013) call: com.okinc.unify_trade.biz.BotOrderListReqGroup.<init>(boolean, boolean, com.okinc.unify_trade.biz.StrategyPendingListReq, com.okinc.unify_trade.biz.StrategyHistoryListReq, java.lang.String):void type: THIS */
    public /* synthetic */ BotOrderListReqGroup(boolean z, boolean z2, StrategyPendingListReq strategyPendingListReq, StrategyHistoryListReq strategyHistoryListReq, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? new StrategyPendingListReq() : strategyPendingListReq, (i & 8) != 0 ? new StrategyHistoryListReq() : strategyHistoryListReq, str);
    }
}
