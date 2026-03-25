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
public final class StrategyStatusChangeData {
    public static final int $stable = 0;
    public final StrategyUseStatusEnum status;
    public final String strategyId;
    public final DexStrategyModeEnum strategyMode;
    public static final Companion Companion = new Companion(null);
    public static final KSerializer<Object>[] $childSerializers = {null, EnumsKt.createSimpleEnumSerializer("com.okinc.business.dex.trade.copytrading.home.data.DexStrategyModeEnum", DexStrategyModeEnum.values()), EnumsKt.createSimpleEnumSerializer("com.okinc.business.dex.trade.copytrading.home.data.StrategyUseStatusEnum", StrategyUseStatusEnum.values())};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ StrategyStatusChangeData copy$default(StrategyStatusChangeData strategyStatusChangeData, String str, DexStrategyModeEnum dexStrategyModeEnum, StrategyUseStatusEnum strategyUseStatusEnum, int i, Object obj) {
        if ((i & 1) != 0) {
            str = strategyStatusChangeData.strategyId;
        }
        if ((i & 2) != 0) {
            dexStrategyModeEnum = strategyStatusChangeData.strategyMode;
        }
        if ((i & 4) != 0) {
            strategyUseStatusEnum = strategyStatusChangeData.status;
        }
        return strategyStatusChangeData.KWHzl(str, dexStrategyModeEnum, strategyUseStatusEnum);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyStatusChangeData KWHzl(@NotNull String str, @NotNull DexStrategyModeEnum dexStrategyModeEnum, @NotNull StrategyUseStatusEnum strategyUseStatusEnum) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(dexStrategyModeEnum, "");
        Intrinsics.checkNotNullParameter(strategyUseStatusEnum, "");
        return new StrategyStatusChangeData(str, dexStrategyModeEnum, strategyUseStatusEnum);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StrategyStatusChangeData)) {
            return false;
        }
        StrategyStatusChangeData strategyStatusChangeData = (StrategyStatusChangeData) obj;
        return Intrinsics.EZpvd((Object) this.strategyId, (Object) strategyStatusChangeData.strategyId) && this.strategyMode == strategyStatusChangeData.strategyMode && this.status == strategyStatusChangeData.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.strategyId.hashCode() * 31) + this.strategyMode.hashCode()) * 31) + this.status.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "StrategyStatusChangeData(strategyId=" + this.strategyId + ", strategyMode=" + this.strategyMode + ", status=" + this.status + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.copytrading.home.data.StrategyStatusChangeData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<StrategyStatusChangeData> serializer() {
            return StrategyStatusChangeData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ StrategyStatusChangeData(int i, String str, DexStrategyModeEnum dexStrategyModeEnum, StrategyUseStatusEnum strategyUseStatusEnum, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, StrategyStatusChangeData$$serializer.INSTANCE.getDescriptor());
        }
        this.strategyId = str;
        this.strategyMode = dexStrategyModeEnum;
        this.status = strategyUseStatusEnum;
    }

    public static final /* synthetic */ void AEQbTJ(StrategyStatusChangeData strategyStatusChangeData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, strategyStatusChangeData.strategyId);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], strategyStatusChangeData.strategyMode);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], strategyStatusChangeData.status);
    }

    public StrategyStatusChangeData(@NotNull String str, @NotNull DexStrategyModeEnum dexStrategyModeEnum, @NotNull StrategyUseStatusEnum strategyUseStatusEnum) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(dexStrategyModeEnum, "");
        Intrinsics.checkNotNullParameter(strategyUseStatusEnum, "");
        this.strategyId = str;
        this.strategyMode = dexStrategyModeEnum;
        this.status = strategyUseStatusEnum;
    }
}
