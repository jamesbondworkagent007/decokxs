package com.okinc.business.dex.trade.copytrading.home.data;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class StrategyPnLData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final int buyCountDelta;
    public final double buyUsdValueDelta;
    public final double realizedPnLUsd;
    public final int sellCountDelta;
    public final double sellUsdValueDelta;
    public final double unrealizedPnLUsd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyPnLData OLrzqt(int i, double d, int i2, double d2, double d3, double d4) {
        return new StrategyPnLData(i, d, i2, d2, d3, d4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StrategyPnLData)) {
            return false;
        }
        StrategyPnLData strategyPnLData = (StrategyPnLData) obj;
        return this.buyCountDelta == strategyPnLData.buyCountDelta && Double.compare(this.buyUsdValueDelta, strategyPnLData.buyUsdValueDelta) == 0 && this.sellCountDelta == strategyPnLData.sellCountDelta && Double.compare(this.sellUsdValueDelta, strategyPnLData.sellUsdValueDelta) == 0 && Double.compare(this.realizedPnLUsd, strategyPnLData.realizedPnLUsd) == 0 && Double.compare(this.unrealizedPnLUsd, strategyPnLData.unrealizedPnLUsd) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((Integer.hashCode(this.buyCountDelta) * 31) + Double.hashCode(this.buyUsdValueDelta)) * 31) + Integer.hashCode(this.sellCountDelta)) * 31) + Double.hashCode(this.sellUsdValueDelta)) * 31) + Double.hashCode(this.realizedPnLUsd)) * 31) + Double.hashCode(this.unrealizedPnLUsd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "StrategyPnLData(buyCountDelta=" + this.buyCountDelta + ", buyUsdValueDelta=" + this.buyUsdValueDelta + ", sellCountDelta=" + this.sellCountDelta + ", sellUsdValueDelta=" + this.sellUsdValueDelta + ", realizedPnLUsd=" + this.realizedPnLUsd + ", unrealizedPnLUsd=" + this.unrealizedPnLUsd + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.copytrading.home.data.StrategyPnLData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<StrategyPnLData> serializer() {
            return StrategyPnLData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ StrategyPnLData(int i, int i2, double d, int i3, double d2, double d3, double d4, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i, 63, StrategyPnLData$$serializer.INSTANCE.getDescriptor());
        }
        this.buyCountDelta = i2;
        this.buyUsdValueDelta = d;
        this.sellCountDelta = i3;
        this.sellUsdValueDelta = d2;
        this.realizedPnLUsd = d3;
        this.unrealizedPnLUsd = d4;
    }

    public static final /* synthetic */ void OLrzqt(StrategyPnLData strategyPnLData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeIntElement(serialDescriptor, 0, strategyPnLData.buyCountDelta);
        compositeEncoder.encodeDoubleElement(serialDescriptor, 1, strategyPnLData.buyUsdValueDelta);
        compositeEncoder.encodeIntElement(serialDescriptor, 2, strategyPnLData.sellCountDelta);
        compositeEncoder.encodeDoubleElement(serialDescriptor, 3, strategyPnLData.sellUsdValueDelta);
        compositeEncoder.encodeDoubleElement(serialDescriptor, 4, strategyPnLData.realizedPnLUsd);
        compositeEncoder.encodeDoubleElement(serialDescriptor, 5, strategyPnLData.unrealizedPnLUsd);
    }

    public StrategyPnLData(int i, double d, int i2, double d2, double d3, double d4) {
        this.buyCountDelta = i;
        this.buyUsdValueDelta = d;
        this.sellCountDelta = i2;
        this.sellUsdValueDelta = d2;
        this.realizedPnLUsd = d3;
        this.unrealizedPnLUsd = d4;
    }
}
