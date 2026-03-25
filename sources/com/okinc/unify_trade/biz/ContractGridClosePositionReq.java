package com.okinc.unify_trade.biz;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class ContractGridClosePositionReq {
    private String algoId;
    private String instId;
    private Boolean mktClose;
    private String px;
    private String sz;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ContractGridClosePositionReq() {
        this((String) null, (String) null, (String) null, (String) null, (Boolean) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ContractGridClosePositionReq copy$default(ContractGridClosePositionReq contractGridClosePositionReq, String str, String str2, String str3, String str4, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = contractGridClosePositionReq.algoId;
        }
        if ((i & 2) != 0) {
            str2 = contractGridClosePositionReq.instId;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = contractGridClosePositionReq.sz;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = contractGridClosePositionReq.px;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            bool = contractGridClosePositionReq.mktClose;
        }
        return contractGridClosePositionReq.copy(str, str5, str6, str7, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.sz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.px;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component5() {
        return this.mktClose;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ContractGridClosePositionReq copy(@NotNull String str, String str2, String str3, String str4, Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        return new ContractGridClosePositionReq(str, str2, str3, str4, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContractGridClosePositionReq)) {
            return false;
        }
        ContractGridClosePositionReq contractGridClosePositionReq = (ContractGridClosePositionReq) obj;
        return Intrinsics.EZpvd((Object) this.algoId, (Object) contractGridClosePositionReq.algoId) && Intrinsics.EZpvd((Object) this.instId, (Object) contractGridClosePositionReq.instId) && Intrinsics.EZpvd((Object) this.sz, (Object) contractGridClosePositionReq.sz) && Intrinsics.EZpvd((Object) this.px, (Object) contractGridClosePositionReq.px) && Intrinsics.EZpvd(this.mktClose, contractGridClosePositionReq.mktClose);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlgoId() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getMktClose() {
        return this.mktClose;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPx() {
        return this.px;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSz() {
        return this.sz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.algoId.hashCode();
        String str = this.instId;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.sz;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.px;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        Boolean bool = this.mktClose;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (bool != null ? bool.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAlgoId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.algoId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstId(String str) {
        this.instId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMktClose(Boolean bool) {
        this.mktClose = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPx(String str) {
        this.px = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSz(String str) {
        this.sz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ContractGridClosePositionReq(algoId=" + this.algoId + ", instId=" + this.instId + ", sz=" + this.sz + ", px=" + this.px + ", mktClose=" + this.mktClose + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.ContractGridClosePositionReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ContractGridClosePositionReq> serializer() {
            return ContractGridClosePositionReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ContractGridClosePositionReq(int i, String str, String str2, String str3, String str4, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        this.algoId = (i & 1) == 0 ? "0" : str;
        if ((i & 2) == 0) {
            this.instId = null;
        } else {
            this.instId = str2;
        }
        if ((i & 4) == 0) {
            this.sz = "";
        } else {
            this.sz = str3;
        }
        if ((i & 8) == 0) {
            this.px = "";
        } else {
            this.px = str4;
        }
        if ((i & 16) == 0) {
            this.mktClose = null;
        } else {
            this.mktClose = bool;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(ContractGridClosePositionReq contractGridClosePositionReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) contractGridClosePositionReq.algoId, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, contractGridClosePositionReq.algoId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || contractGridClosePositionReq.instId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, contractGridClosePositionReq.instId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) contractGridClosePositionReq.sz, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, contractGridClosePositionReq.sz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) contractGridClosePositionReq.px, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, contractGridClosePositionReq.px);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && contractGridClosePositionReq.mktClose == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.INSTANCE, contractGridClosePositionReq.mktClose);
    }

    public ContractGridClosePositionReq(@NotNull String str, String str2, String str3, String str4, Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        this.algoId = str;
        this.instId = str2;
        this.sz = str3;
        this.px = str4;
        this.mktClose = bool;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("0") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000e: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r9v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r7v0 java.lang.String) : (""))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x001d: ARITH (r9v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r8v0 java.lang.Boolean) : (null java.lang.Boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean):void (m)] (LINE:2624) call: com.okinc.unify_trade.biz.ContractGridClosePositionReq.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean):void type: THIS */
    public /* synthetic */ ContractGridClosePositionReq(String str, String str2, String str3, String str4, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "0" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? "" : str3, (i & 8) == 0 ? str4 : "", (i & 16) == 0 ? bool : null);
    }
}
