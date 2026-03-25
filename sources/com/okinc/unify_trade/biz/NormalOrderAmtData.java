package com.okinc.unify_trade.biz;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class NormalOrderAmtData {
    private String advanceLimitAmt;
    private String limitMarketAmt;
    private String stopAmt;
    private String triggerAmt;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NormalOrderAmtData() {
        this((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ NormalOrderAmtData copy$default(NormalOrderAmtData normalOrderAmtData, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = normalOrderAmtData.limitMarketAmt;
        }
        if ((i & 2) != 0) {
            str2 = normalOrderAmtData.advanceLimitAmt;
        }
        if ((i & 4) != 0) {
            str3 = normalOrderAmtData.stopAmt;
        }
        if ((i & 8) != 0) {
            str4 = normalOrderAmtData.triggerAmt;
        }
        return normalOrderAmtData.copy(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.limitMarketAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.advanceLimitAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.stopAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.triggerAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NormalOrderAmtData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new NormalOrderAmtData(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NormalOrderAmtData)) {
            return false;
        }
        NormalOrderAmtData normalOrderAmtData = (NormalOrderAmtData) obj;
        return Intrinsics.EZpvd((Object) this.limitMarketAmt, (Object) normalOrderAmtData.limitMarketAmt) && Intrinsics.EZpvd((Object) this.advanceLimitAmt, (Object) normalOrderAmtData.advanceLimitAmt) && Intrinsics.EZpvd((Object) this.stopAmt, (Object) normalOrderAmtData.stopAmt) && Intrinsics.EZpvd((Object) this.triggerAmt, (Object) normalOrderAmtData.triggerAmt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAdvanceLimitAmt() {
        return this.advanceLimitAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLimitMarketAmt() {
        return this.limitMarketAmt;
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
        return (((((this.limitMarketAmt.hashCode() * 31) + this.advanceLimitAmt.hashCode()) * 31) + this.stopAmt.hashCode()) * 31) + this.triggerAmt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAdvanceLimitAmt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.advanceLimitAmt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLimitMarketAmt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.limitMarketAmt = str;
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
        return "NormalOrderAmtData(limitMarketAmt=" + this.limitMarketAmt + ", advanceLimitAmt=" + this.advanceLimitAmt + ", stopAmt=" + this.stopAmt + ", triggerAmt=" + this.triggerAmt + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.NormalOrderAmtData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<NormalOrderAmtData> serializer() {
            return NormalOrderAmtData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ NormalOrderAmtData(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.limitMarketAmt = "0";
        } else {
            this.limitMarketAmt = str;
        }
        if ((i & 2) == 0) {
            this.advanceLimitAmt = "0";
        } else {
            this.advanceLimitAmt = str2;
        }
        if ((i & 4) == 0) {
            this.stopAmt = "0";
        } else {
            this.stopAmt = str3;
        }
        if ((i & 8) == 0) {
            this.triggerAmt = "0";
        } else {
            this.triggerAmt = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(NormalOrderAmtData normalOrderAmtData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) normalOrderAmtData.limitMarketAmt, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, normalOrderAmtData.limitMarketAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) normalOrderAmtData.advanceLimitAmt, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, normalOrderAmtData.advanceLimitAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) normalOrderAmtData.stopAmt, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, normalOrderAmtData.stopAmt);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd((Object) normalOrderAmtData.triggerAmt, (Object) "0")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 3, normalOrderAmtData.triggerAmt);
    }

    public NormalOrderAmtData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.limitMarketAmt = str;
        this.advanceLimitAmt = str2;
        this.stopAmt = str3;
        this.triggerAmt = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("0") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("0") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("0") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("0") : (r5v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:2597) call: com.okinc.unify_trade.biz.NormalOrderAmtData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ NormalOrderAmtData(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "0" : str, (i & 2) != 0 ? "0" : str2, (i & 4) != 0 ? "0" : str3, (i & 8) != 0 ? "0" : str4);
    }
}
