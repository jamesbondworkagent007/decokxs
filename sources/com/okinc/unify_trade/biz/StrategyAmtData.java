package com.okinc.unify_trade.biz;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class StrategyAmtData {
    private String moveStopAmt;
    private String stopAmt;
    private String triggerAmt;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public StrategyAmtData() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ StrategyAmtData copy$default(StrategyAmtData strategyAmtData, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = strategyAmtData.stopAmt;
        }
        if ((i & 2) != 0) {
            str2 = strategyAmtData.triggerAmt;
        }
        if ((i & 4) != 0) {
            str3 = strategyAmtData.moveStopAmt;
        }
        return strategyAmtData.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.stopAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.triggerAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.moveStopAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyAmtData copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new StrategyAmtData(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StrategyAmtData)) {
            return false;
        }
        StrategyAmtData strategyAmtData = (StrategyAmtData) obj;
        return Intrinsics.EZpvd((Object) this.stopAmt, (Object) strategyAmtData.stopAmt) && Intrinsics.EZpvd((Object) this.triggerAmt, (Object) strategyAmtData.triggerAmt) && Intrinsics.EZpvd((Object) this.moveStopAmt, (Object) strategyAmtData.moveStopAmt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMoveStopAmt() {
        return this.moveStopAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStopAmt() {
        return this.stopAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTriggerAmt() {
        return this.triggerAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.stopAmt.hashCode() * 31) + this.triggerAmt.hashCode()) * 31) + this.moveStopAmt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMoveStopAmt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.moveStopAmt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStopAmt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.stopAmt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTriggerAmt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.triggerAmt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "StrategyAmtData(stopAmt=" + this.stopAmt + ", triggerAmt=" + this.triggerAmt + ", moveStopAmt=" + this.moveStopAmt + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.StrategyAmtData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<StrategyAmtData> serializer() {
            return StrategyAmtData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ StrategyAmtData(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.stopAmt = "0";
        } else {
            this.stopAmt = str;
        }
        if ((i & 2) == 0) {
            this.triggerAmt = "0";
        } else {
            this.triggerAmt = str2;
        }
        if ((i & 4) == 0) {
            this.moveStopAmt = "0";
        } else {
            this.moveStopAmt = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(StrategyAmtData strategyAmtData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) strategyAmtData.stopAmt, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, strategyAmtData.stopAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) strategyAmtData.triggerAmt, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, strategyAmtData.triggerAmt);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd((Object) strategyAmtData.moveStopAmt, (Object) "0")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, strategyAmtData.moveStopAmt);
    }

    public StrategyAmtData(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.stopAmt = str;
        this.triggerAmt = str2;
        this.moveStopAmt = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("0") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("0") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("0") : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:2615) call: com.okinc.unify_trade.biz.StrategyAmtData.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ StrategyAmtData(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "0" : str, (i & 2) != 0 ? "0" : str2, (i & 4) != 0 ? "0" : str3);
    }
}
