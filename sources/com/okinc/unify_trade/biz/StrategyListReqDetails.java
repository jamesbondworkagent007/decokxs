package com.okinc.unify_trade.biz;

import com.okinc.biz.StrategyType;
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

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class StrategyListReqDetails {
    private String algoId;
    private boolean hasWs;
    private StrategyType originalType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, EnumsKt.createSimpleEnumSerializer("com.okinc.biz.StrategyType", StrategyType.values())};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ StrategyListReqDetails copy$default(StrategyListReqDetails strategyListReqDetails, boolean z, String str, StrategyType strategyType, int i, Object obj) {
        if ((i & 1) != 0) {
            z = strategyListReqDetails.hasWs;
        }
        if ((i & 2) != 0) {
            str = strategyListReqDetails.algoId;
        }
        if ((i & 4) != 0) {
            strategyType = strategyListReqDetails.originalType;
        }
        return strategyListReqDetails.copy(z, str, strategyType);
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
    public final StrategyType component3() {
        return this.originalType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyListReqDetails copy(boolean z, @NotNull String str, @NotNull StrategyType strategyType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(strategyType, "");
        return new StrategyListReqDetails(z, str, strategyType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StrategyListReqDetails)) {
            return false;
        }
        StrategyListReqDetails strategyListReqDetails = (StrategyListReqDetails) obj;
        return this.hasWs == strategyListReqDetails.hasWs && Intrinsics.EZpvd((Object) this.algoId, (Object) strategyListReqDetails.algoId) && this.originalType == strategyListReqDetails.originalType;
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
    public final StrategyType getOriginalType() {
        return this.originalType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((Boolean.hashCode(this.hasWs) * 31) + this.algoId.hashCode()) * 31) + this.originalType.hashCode();
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
    public final void setOriginalType(@NotNull StrategyType strategyType) {
        Intrinsics.checkNotNullParameter(strategyType, "");
        this.originalType = strategyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "StrategyListReqDetails(hasWs=" + this.hasWs + ", algoId=" + this.algoId + ", originalType=" + this.originalType + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.StrategyListReqDetails.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<StrategyListReqDetails> serializer() {
            return StrategyListReqDetails$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ StrategyListReqDetails(int i, boolean z, String str, StrategyType strategyType, SerializationConstructorMarker serializationConstructorMarker) {
        if (6 != (i & 6)) {
            PluginExceptionsKt.throwMissingFieldException(i, 6, StrategyListReqDetails$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.hasWs = false;
        } else {
            this.hasWs = z;
        }
        this.algoId = str;
        this.originalType = strategyType;
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(StrategyListReqDetails strategyListReqDetails, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || strategyListReqDetails.hasWs) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 0, strategyListReqDetails.hasWs);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 1, strategyListReqDetails.algoId);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], strategyListReqDetails.originalType);
    }

    public StrategyListReqDetails(boolean z, @NotNull String str, @NotNull StrategyType strategyType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(strategyType, "");
        this.hasWs = z;
        this.algoId = str;
        this.originalType = strategyType;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r1v0 boolean))
  (r2v0 java.lang.String)
  (r3v0 com.okinc.biz.StrategyType)
 A[MD:(boolean, java.lang.String, com.okinc.biz.StrategyType):void (m)] (LINE:2289) call: com.okinc.unify_trade.biz.StrategyListReqDetails.<init>(boolean, java.lang.String, com.okinc.biz.StrategyType):void type: THIS */
    public /* synthetic */ StrategyListReqDetails(boolean z, String str, StrategyType strategyType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, str, strategyType);
    }
}
