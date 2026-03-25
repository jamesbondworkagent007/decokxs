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
public final class ContractGridSyncParamResp {
    private String algoClOrdId;
    private String algoId;
    private String sCode;
    private String sMsg;
    private String tag;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ContractGridSyncParamResp() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ContractGridSyncParamResp copy$default(ContractGridSyncParamResp contractGridSyncParamResp, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = contractGridSyncParamResp.algoClOrdId;
        }
        if ((i & 2) != 0) {
            str2 = contractGridSyncParamResp.algoId;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = contractGridSyncParamResp.sCode;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = contractGridSyncParamResp.sMsg;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = contractGridSyncParamResp.tag;
        }
        return contractGridSyncParamResp.copy(str, str6, str7, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.algoClOrdId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.sCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.sMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ContractGridSyncParamResp copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new ContractGridSyncParamResp(str, str2, str3, str4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContractGridSyncParamResp)) {
            return false;
        }
        ContractGridSyncParamResp contractGridSyncParamResp = (ContractGridSyncParamResp) obj;
        return Intrinsics.EZpvd((Object) this.algoClOrdId, (Object) contractGridSyncParamResp.algoClOrdId) && Intrinsics.EZpvd((Object) this.algoId, (Object) contractGridSyncParamResp.algoId) && Intrinsics.EZpvd((Object) this.sCode, (Object) contractGridSyncParamResp.sCode) && Intrinsics.EZpvd((Object) this.sMsg, (Object) contractGridSyncParamResp.sMsg) && Intrinsics.EZpvd((Object) this.tag, (Object) contractGridSyncParamResp.tag);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlgoClOrdId() {
        return this.algoClOrdId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlgoId() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSCode() {
        return this.sCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSMsg() {
        return this.sMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTag() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.algoClOrdId.hashCode() * 31) + this.algoId.hashCode()) * 31) + this.sCode.hashCode()) * 31) + this.sMsg.hashCode()) * 31) + this.tag.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAlgoClOrdId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.algoClOrdId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAlgoId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.algoId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.sCode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSMsg(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.sMsg = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTag(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tag = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ContractGridSyncParamResp(algoClOrdId=" + this.algoClOrdId + ", algoId=" + this.algoId + ", sCode=" + this.sCode + ", sMsg=" + this.sMsg + ", tag=" + this.tag + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.ContractGridSyncParamResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ContractGridSyncParamResp> serializer() {
            return ContractGridSyncParamResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ContractGridSyncParamResp(int i, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.algoClOrdId = "0";
        } else {
            this.algoClOrdId = str;
        }
        if ((i & 2) == 0) {
            this.algoId = "0";
        } else {
            this.algoId = str2;
        }
        if ((i & 4) == 0) {
            this.sCode = "";
        } else {
            this.sCode = str3;
        }
        if ((i & 8) == 0) {
            this.sMsg = "";
        } else {
            this.sMsg = str4;
        }
        if ((i & 16) == 0) {
            this.tag = "";
        } else {
            this.tag = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(ContractGridSyncParamResp contractGridSyncParamResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) contractGridSyncParamResp.algoClOrdId, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, contractGridSyncParamResp.algoClOrdId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) contractGridSyncParamResp.algoId, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, contractGridSyncParamResp.algoId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) contractGridSyncParamResp.sCode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, contractGridSyncParamResp.sCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) contractGridSyncParamResp.sMsg, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, contractGridSyncParamResp.sMsg);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && Intrinsics.EZpvd((Object) contractGridSyncParamResp.tag, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 4, contractGridSyncParamResp.tag);
    }

    public ContractGridSyncParamResp(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.algoClOrdId = str;
        this.algoId = str2;
        this.sCode = str3;
        this.sMsg = str4;
        this.tag = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("0") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r9v0 int) & (2 int) A[WRAPPED]) == (0 int)) ? (r5v0 java.lang.String) : ("0"))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r9v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r9v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:2702) call: com.okinc.unify_trade.biz.ContractGridSyncParamResp.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ ContractGridSyncParamResp(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "0" : str, (i & 2) == 0 ? str2 : "0", (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5);
    }
}
