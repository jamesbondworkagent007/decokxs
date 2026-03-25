package com.okinc.business.dexlogic.main.swap.trade.status.helper;

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

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class TradeStep {
    private final boolean doNext;
    private boolean hasCheck;
    private final boolean showState;
    private final SwapState state;
    private final CheckStep step;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {EnumsKt.createSimpleEnumSerializer("com.okinc.business.dexlogic.main.swap.trade.status.helper.CheckStep", CheckStep.values()), null, EnumsKt.createSimpleEnumSerializer("com.okinc.business.dexlogic.main.swap.trade.status.helper.SwapState", SwapState.values()), null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TradeStep copy$default(TradeStep tradeStep, CheckStep checkStep, boolean z, SwapState swapState, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            checkStep = tradeStep.step;
        }
        if ((i & 2) != 0) {
            z = tradeStep.hasCheck;
        }
        boolean z4 = z;
        if ((i & 4) != 0) {
            swapState = tradeStep.state;
        }
        SwapState swapState2 = swapState;
        if ((i & 8) != 0) {
            z2 = tradeStep.showState;
        }
        boolean z5 = z2;
        if ((i & 16) != 0) {
            z3 = tradeStep.doNext;
        }
        return tradeStep.copy(checkStep, z4, swapState2, z5, z3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CheckStep component1() {
        return this.step;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.hasCheck;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SwapState component3() {
        return this.state;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.showState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component5() {
        return this.doNext;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeStep copy(@NotNull CheckStep checkStep, boolean z, @NotNull SwapState swapState, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(checkStep, "");
        Intrinsics.checkNotNullParameter(swapState, "");
        return new TradeStep(checkStep, z, swapState, z2, z3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getDoNext() {
        return this.doNext;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getHasCheck() {
        return this.hasCheck;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getShowState() {
        return this.showState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SwapState getState() {
        return this.state;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CheckStep getStep() {
        return this.step;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.step.hashCode() * 31) + Boolean.hashCode(this.hasCheck)) * 31) + this.state.hashCode()) * 31) + Boolean.hashCode(this.showState)) * 31) + Boolean.hashCode(this.doNext);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHasCheck(boolean z) {
        this.hasCheck = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TradeStep(step=" + this.step + ", hasCheck=" + this.hasCheck + ", state=" + this.state + ", showState=" + this.showState + ", doNext=" + this.doNext + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.main.swap.trade.status.helper.TradeStep.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TradeStep> serializer() {
            return TradeStep$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TradeStep(int i, CheckStep checkStep, boolean z, SwapState swapState, boolean z2, boolean z3, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i, 31, TradeStep$$serializer.INSTANCE.getDescriptor());
        }
        this.step = checkStep;
        this.hasCheck = z;
        this.state = swapState;
        this.showState = z2;
        this.doNext = z3;
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(TradeStep tradeStep, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], tradeStep.step);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 1, tradeStep.hasCheck);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], tradeStep.state);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 3, tradeStep.showState);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 4, tradeStep.doNext);
    }

    public TradeStep(@NotNull CheckStep checkStep, boolean z, @NotNull SwapState swapState, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(checkStep, "");
        Intrinsics.checkNotNullParameter(swapState, "");
        this.step = checkStep;
        this.hasCheck = z;
        this.state = swapState;
        this.showState = z2;
        this.doNext = z3;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof TradeStep)) {
            TradeStep tradeStep = (TradeStep) obj;
            if (tradeStep.step == this.step && tradeStep.hasCheck == this.hasCheck && tradeStep.state == this.state && tradeStep.showState == this.showState && tradeStep.doNext == this.doNext) {
                return true;
            }
        }
        return false;
    }
}
