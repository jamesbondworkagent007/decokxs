package com.okinc.business.dex.trade.copytrading.home.data;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class StrategyWithPnL {
    public static final int $stable = 0;
    public final StrategyPnLData pnl;
    public final String strategyId;
    public final DexStrategyModeEnum strategyMode;
    public static final Companion Companion = new Companion(null);
    public static final KSerializer<Object>[] $childSerializers = {null, EnumsKt.createSimpleEnumSerializer("com.okinc.business.dex.trade.copytrading.home.data.DexStrategyModeEnum", DexStrategyModeEnum.values()), null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ StrategyWithPnL copy$default(StrategyWithPnL strategyWithPnL, String str, DexStrategyModeEnum dexStrategyModeEnum, StrategyPnLData strategyPnLData, int i, Object obj) {
        if ((i & 1) != 0) {
            str = strategyWithPnL.strategyId;
        }
        if ((i & 2) != 0) {
            dexStrategyModeEnum = strategyWithPnL.strategyMode;
        }
        if ((i & 4) != 0) {
            strategyPnLData = strategyWithPnL.pnl;
        }
        return strategyWithPnL.EZpvd(str, dexStrategyModeEnum, strategyPnLData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyWithPnL EZpvd(@NotNull String str, @NotNull DexStrategyModeEnum dexStrategyModeEnum, @NotNull StrategyPnLData strategyPnLData) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(dexStrategyModeEnum, "");
        Intrinsics.checkNotNullParameter(strategyPnLData, "");
        return new StrategyWithPnL(str, dexStrategyModeEnum, strategyPnLData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StrategyWithPnL)) {
            return false;
        }
        StrategyWithPnL strategyWithPnL = (StrategyWithPnL) obj;
        return Intrinsics.EZpvd((Object) this.strategyId, (Object) strategyWithPnL.strategyId) && this.strategyMode == strategyWithPnL.strategyMode && Intrinsics.EZpvd(this.pnl, strategyWithPnL.pnl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.strategyId.hashCode() * 31) + this.strategyMode.hashCode()) * 31) + this.pnl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "StrategyWithPnL(strategyId=" + this.strategyId + ", strategyMode=" + this.strategyMode + ", pnl=" + this.pnl + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.copytrading.home.data.StrategyWithPnL.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<StrategyWithPnL> serializer() {
            return StrategyWithPnL$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ StrategyWithPnL(int i, String str, DexStrategyModeEnum dexStrategyModeEnum, StrategyPnLData strategyPnLData, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, StrategyWithPnL$$serializer.INSTANCE.getDescriptor());
        }
        this.strategyId = str;
        this.strategyMode = dexStrategyModeEnum;
        this.pnl = strategyPnLData;
    }

    public static final /* synthetic */ void OLrzqt(StrategyWithPnL strategyWithPnL, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, strategyWithPnL.strategyId);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], strategyWithPnL.strategyMode);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, StrategyPnLData$$serializer.INSTANCE, strategyWithPnL.pnl);
    }

    public StrategyWithPnL(@NotNull String str, @NotNull DexStrategyModeEnum dexStrategyModeEnum, @NotNull StrategyPnLData strategyPnLData) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(dexStrategyModeEnum, "");
        Intrinsics.checkNotNullParameter(strategyPnLData, "");
        this.strategyId = str;
        this.strategyMode = dexStrategyModeEnum;
        this.pnl = strategyPnLData;
    }
}
