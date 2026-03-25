package com.okinc.unify_trade.biz;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class ContractGridAdjustMarginReq {
    private String algoId;
    private String amt;
    private String percent;
    private boolean reinvest;
    private String type;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ContractGridAdjustMarginReq() {
        this((String) null, (String) null, (String) null, (String) null, false, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ContractGridAdjustMarginReq copy$default(ContractGridAdjustMarginReq contractGridAdjustMarginReq, String str, String str2, String str3, String str4, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = contractGridAdjustMarginReq.algoId;
        }
        if ((i & 2) != 0) {
            str2 = contractGridAdjustMarginReq.type;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = contractGridAdjustMarginReq.amt;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = contractGridAdjustMarginReq.percent;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            z = contractGridAdjustMarginReq.reinvest;
        }
        return contractGridAdjustMarginReq.copy(str, str5, str6, str7, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.amt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.percent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component5() {
        return this.reinvest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ContractGridAdjustMarginReq copy(@NotNull String str, @NotNull String str2, @NotNull String str3, String str4, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new ContractGridAdjustMarginReq(str, str2, str3, str4, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContractGridAdjustMarginReq)) {
            return false;
        }
        ContractGridAdjustMarginReq contractGridAdjustMarginReq = (ContractGridAdjustMarginReq) obj;
        return Intrinsics.EZpvd((Object) this.algoId, (Object) contractGridAdjustMarginReq.algoId) && Intrinsics.EZpvd((Object) this.type, (Object) contractGridAdjustMarginReq.type) && Intrinsics.EZpvd((Object) this.amt, (Object) contractGridAdjustMarginReq.amt) && Intrinsics.EZpvd((Object) this.percent, (Object) contractGridAdjustMarginReq.percent) && this.reinvest == contractGridAdjustMarginReq.reinvest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlgoId() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmt() {
        return this.amt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPercent() {
        return this.percent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getReinvest() {
        return this.reinvest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.algoId.hashCode();
        int iHashCode2 = this.type.hashCode();
        int iHashCode3 = this.amt.hashCode();
        String str = this.percent;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.reinvest);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAlgoId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.algoId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAmt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.amt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPercent(String str) {
        this.percent = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setReinvest(boolean z) {
        this.reinvest = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.type = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ContractGridAdjustMarginReq(algoId=" + this.algoId + ", type=" + this.type + ", amt=" + this.amt + ", percent=" + this.percent + ", reinvest=" + this.reinvest + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.ContractGridAdjustMarginReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ContractGridAdjustMarginReq> serializer() {
            return ContractGridAdjustMarginReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ContractGridAdjustMarginReq(int i, String str, String str2, String str3, String str4, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        this.algoId = (i & 1) == 0 ? "0" : str;
        if ((i & 2) == 0) {
            this.type = "";
        } else {
            this.type = str2;
        }
        if ((i & 4) == 0) {
            this.amt = "";
        } else {
            this.amt = str3;
        }
        if ((i & 8) == 0) {
            this.percent = "";
        } else {
            this.percent = str4;
        }
        if ((i & 16) == 0) {
            this.reinvest = false;
        } else {
            this.reinvest = z;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(ContractGridAdjustMarginReq contractGridAdjustMarginReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) contractGridAdjustMarginReq.algoId, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, contractGridAdjustMarginReq.algoId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) contractGridAdjustMarginReq.type, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, contractGridAdjustMarginReq.type);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) contractGridAdjustMarginReq.amt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, contractGridAdjustMarginReq.amt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) contractGridAdjustMarginReq.percent, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, contractGridAdjustMarginReq.percent);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || contractGridAdjustMarginReq.reinvest) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 4, contractGridAdjustMarginReq.reinvest);
        }
    }

    public ContractGridAdjustMarginReq(@NotNull String str, @NotNull String str2, @NotNull String str3, String str4, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.algoId = str;
        this.type = str2;
        this.amt = str3;
        this.percent = str4;
        this.reinvest = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0028: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("0") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r9v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r7v0 java.lang.String) : (""))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001c: ARITH (r9v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r8v0 boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void (m)] (LINE:2668) call: com.okinc.unify_trade.biz.ContractGridAdjustMarginReq.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ ContractGridAdjustMarginReq(String str, String str2, String str3, String str4, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "0" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) == 0 ? str4 : "", (i & 16) != 0 ? false : z);
    }
}
