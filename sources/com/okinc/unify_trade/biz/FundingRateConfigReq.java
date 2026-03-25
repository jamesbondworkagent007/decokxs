package com.okinc.unify_trade.biz;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class FundingRateConfigReq {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String fundingRateAlertActive;
    private final String fundingRateAlertThreshold;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FundingRateConfigReq() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ FundingRateConfigReq copy$default(FundingRateConfigReq fundingRateConfigReq, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fundingRateConfigReq.fundingRateAlertThreshold;
        }
        if ((i & 2) != 0) {
            str2 = fundingRateConfigReq.fundingRateAlertActive;
        }
        return fundingRateConfigReq.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.fundingRateAlertThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.fundingRateAlertActive;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FundingRateConfigReq copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new FundingRateConfigReq(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FundingRateConfigReq)) {
            return false;
        }
        FundingRateConfigReq fundingRateConfigReq = (FundingRateConfigReq) obj;
        return Intrinsics.EZpvd((Object) this.fundingRateAlertThreshold, (Object) fundingRateConfigReq.fundingRateAlertThreshold) && Intrinsics.EZpvd((Object) this.fundingRateAlertActive, (Object) fundingRateConfigReq.fundingRateAlertActive);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFundingRateAlertActive() {
        return this.fundingRateAlertActive;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFundingRateAlertThreshold() {
        return this.fundingRateAlertThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.fundingRateAlertThreshold.hashCode() * 31) + this.fundingRateAlertActive.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FundingRateConfigReq(fundingRateAlertThreshold=" + this.fundingRateAlertThreshold + ", fundingRateAlertActive=" + this.fundingRateAlertActive + ")";
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.FundingRateConfigReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FundingRateConfigReq> serializer() {
            return FundingRateConfigReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FundingRateConfigReq(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.fundingRateAlertThreshold = "";
        } else {
            this.fundingRateAlertThreshold = str;
        }
        if ((i & 2) == 0) {
            this.fundingRateAlertActive = "";
        } else {
            this.fundingRateAlertActive = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(FundingRateConfigReq fundingRateConfigReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) fundingRateConfigReq.fundingRateAlertThreshold, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, fundingRateConfigReq.fundingRateAlertThreshold);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd((Object) fundingRateConfigReq.fundingRateAlertActive, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 1, fundingRateConfigReq.fundingRateAlertActive);
    }

    public FundingRateConfigReq(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.fundingRateAlertThreshold = str;
        this.fundingRateAlertActive = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:359) call: com.okinc.unify_trade.biz.FundingRateConfigReq.<init>(java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ FundingRateConfigReq(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
