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
public final class BotAddInvestLimitResponse {
    private String maxAdditionalInvestment;
    private String minAdditionalInvestment;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BotAddInvestLimitResponse() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BotAddInvestLimitResponse copy$default(BotAddInvestLimitResponse botAddInvestLimitResponse, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = botAddInvestLimitResponse.minAdditionalInvestment;
        }
        if ((i & 2) != 0) {
            str2 = botAddInvestLimitResponse.maxAdditionalInvestment;
        }
        return botAddInvestLimitResponse.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.minAdditionalInvestment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.maxAdditionalInvestment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotAddInvestLimitResponse copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new BotAddInvestLimitResponse(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BotAddInvestLimitResponse)) {
            return false;
        }
        BotAddInvestLimitResponse botAddInvestLimitResponse = (BotAddInvestLimitResponse) obj;
        return Intrinsics.EZpvd((Object) this.minAdditionalInvestment, (Object) botAddInvestLimitResponse.minAdditionalInvestment) && Intrinsics.EZpvd((Object) this.maxAdditionalInvestment, (Object) botAddInvestLimitResponse.maxAdditionalInvestment);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxAdditionalInvestment() {
        return this.maxAdditionalInvestment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinAdditionalInvestment() {
        return this.minAdditionalInvestment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.minAdditionalInvestment.hashCode() * 31) + this.maxAdditionalInvestment.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxAdditionalInvestment(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.maxAdditionalInvestment = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMinAdditionalInvestment(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.minAdditionalInvestment = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BotAddInvestLimitResponse(minAdditionalInvestment=" + this.minAdditionalInvestment + ", maxAdditionalInvestment=" + this.maxAdditionalInvestment + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.BotAddInvestLimitResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BotAddInvestLimitResponse> serializer() {
            return BotAddInvestLimitResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BotAddInvestLimitResponse(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.minAdditionalInvestment = "";
        } else {
            this.minAdditionalInvestment = str;
        }
        if ((i & 2) == 0) {
            this.maxAdditionalInvestment = "";
        } else {
            this.maxAdditionalInvestment = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(BotAddInvestLimitResponse botAddInvestLimitResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) botAddInvestLimitResponse.minAdditionalInvestment, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, botAddInvestLimitResponse.minAdditionalInvestment);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd((Object) botAddInvestLimitResponse.maxAdditionalInvestment, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 1, botAddInvestLimitResponse.maxAdditionalInvestment);
    }

    public BotAddInvestLimitResponse(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.minAdditionalInvestment = str;
        this.maxAdditionalInvestment = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:4306) call: com.okinc.unify_trade.biz.BotAddInvestLimitResponse.<init>(java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ BotAddInvestLimitResponse(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
