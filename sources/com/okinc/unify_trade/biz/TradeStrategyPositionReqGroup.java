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
public final class TradeStrategyPositionReqGroup {
    private String algoId;
    private boolean hasWs;
    private String ordType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TradeStrategyPositionReqGroup copy$default(TradeStrategyPositionReqGroup tradeStrategyPositionReqGroup, boolean z, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = tradeStrategyPositionReqGroup.hasWs;
        }
        if ((i & 2) != 0) {
            str = tradeStrategyPositionReqGroup.algoId;
        }
        if ((i & 4) != 0) {
            str2 = tradeStrategyPositionReqGroup.ordType;
        }
        return tradeStrategyPositionReqGroup.copy(z, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.hasWs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.ordType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeStrategyPositionReqGroup copy(boolean z, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new TradeStrategyPositionReqGroup(z, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TradeStrategyPositionReqGroup)) {
            return false;
        }
        TradeStrategyPositionReqGroup tradeStrategyPositionReqGroup = (TradeStrategyPositionReqGroup) obj;
        return this.hasWs == tradeStrategyPositionReqGroup.hasWs && Intrinsics.EZpvd((Object) this.algoId, (Object) tradeStrategyPositionReqGroup.algoId) && Intrinsics.EZpvd((Object) this.ordType, (Object) tradeStrategyPositionReqGroup.ordType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlgoId() {
        return this.algoId;
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
    public int hashCode() {
        return (((Boolean.hashCode(this.hasWs) * 31) + this.algoId.hashCode()) * 31) + this.ordType.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAlgoId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.algoId = str;
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
    public String toString() {
        return "TradeStrategyPositionReqGroup(hasWs=" + this.hasWs + ", algoId=" + this.algoId + ", ordType=" + this.ordType + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.TradeStrategyPositionReqGroup.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TradeStrategyPositionReqGroup> serializer() {
            return TradeStrategyPositionReqGroup$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TradeStrategyPositionReqGroup(int i, boolean z, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, TradeStrategyPositionReqGroup$$serializer.INSTANCE.getDescriptor());
        }
        this.hasWs = z;
        this.algoId = str;
        this.ordType = str2;
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(TradeStrategyPositionReqGroup tradeStrategyPositionReqGroup, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeBooleanElement(serialDescriptor, 0, tradeStrategyPositionReqGroup.hasWs);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, tradeStrategyPositionReqGroup.algoId);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, tradeStrategyPositionReqGroup.ordType);
    }

    public TradeStrategyPositionReqGroup(boolean z, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.hasWs = z;
        this.algoId = str;
        this.ordType = str2;
    }
}
