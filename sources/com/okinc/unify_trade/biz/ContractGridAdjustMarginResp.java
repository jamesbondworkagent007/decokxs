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
public final class ContractGridAdjustMarginResp {
    private String algoId;
    private String lever;
    private String maxAmt;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ContractGridAdjustMarginResp() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ContractGridAdjustMarginResp copy$default(ContractGridAdjustMarginResp contractGridAdjustMarginResp, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = contractGridAdjustMarginResp.algoId;
        }
        if ((i & 2) != 0) {
            str2 = contractGridAdjustMarginResp.maxAmt;
        }
        if ((i & 4) != 0) {
            str3 = contractGridAdjustMarginResp.lever;
        }
        return contractGridAdjustMarginResp.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.maxAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.lever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ContractGridAdjustMarginResp copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new ContractGridAdjustMarginResp(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContractGridAdjustMarginResp)) {
            return false;
        }
        ContractGridAdjustMarginResp contractGridAdjustMarginResp = (ContractGridAdjustMarginResp) obj;
        return Intrinsics.EZpvd((Object) this.algoId, (Object) contractGridAdjustMarginResp.algoId) && Intrinsics.EZpvd((Object) this.maxAmt, (Object) contractGridAdjustMarginResp.maxAmt) && Intrinsics.EZpvd((Object) this.lever, (Object) contractGridAdjustMarginResp.lever);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlgoId() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLever() {
        return this.lever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxAmt() {
        return this.maxAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.algoId.hashCode() * 31) + this.maxAmt.hashCode()) * 31) + this.lever.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAlgoId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.algoId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLever(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.lever = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxAmt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.maxAmt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ContractGridAdjustMarginResp(algoId=" + this.algoId + ", maxAmt=" + this.maxAmt + ", lever=" + this.lever + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.ContractGridAdjustMarginResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ContractGridAdjustMarginResp> serializer() {
            return ContractGridAdjustMarginResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ContractGridAdjustMarginResp(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        this.algoId = (i & 1) == 0 ? "0" : str;
        if ((i & 2) == 0) {
            this.maxAmt = "";
        } else {
            this.maxAmt = str2;
        }
        if ((i & 4) == 0) {
            this.lever = "";
        } else {
            this.lever = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(ContractGridAdjustMarginResp contractGridAdjustMarginResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) contractGridAdjustMarginResp.algoId, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, contractGridAdjustMarginResp.algoId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) contractGridAdjustMarginResp.maxAmt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, contractGridAdjustMarginResp.maxAmt);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd((Object) contractGridAdjustMarginResp.lever, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, contractGridAdjustMarginResp.lever);
    }

    public ContractGridAdjustMarginResp(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.algoId = str;
        this.maxAmt = str2;
        this.lever = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0012: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("0") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000d: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:2694) call: com.okinc.unify_trade.biz.ContractGridAdjustMarginResp.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ ContractGridAdjustMarginResp(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "0" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
