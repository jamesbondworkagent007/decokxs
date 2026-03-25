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
public final class MinInvestResp {
    private String minBaseSz;
    private String minInvestment;
    private String minQuoteSz;
    private String minSourceSz;
    private String singleAmt;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MinInvestResp() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ MinInvestResp copy$default(MinInvestResp minInvestResp, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = minInvestResp.minInvestment;
        }
        if ((i & 2) != 0) {
            str2 = minInvestResp.minBaseSz;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = minInvestResp.minQuoteSz;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = minInvestResp.singleAmt;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = minInvestResp.minSourceSz;
        }
        return minInvestResp.copy(str, str6, str7, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.minInvestment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.minBaseSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.minQuoteSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.singleAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.minSourceSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MinInvestResp copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new MinInvestResp(str, str2, str3, str4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MinInvestResp)) {
            return false;
        }
        MinInvestResp minInvestResp = (MinInvestResp) obj;
        return Intrinsics.EZpvd((Object) this.minInvestment, (Object) minInvestResp.minInvestment) && Intrinsics.EZpvd((Object) this.minBaseSz, (Object) minInvestResp.minBaseSz) && Intrinsics.EZpvd((Object) this.minQuoteSz, (Object) minInvestResp.minQuoteSz) && Intrinsics.EZpvd((Object) this.singleAmt, (Object) minInvestResp.singleAmt) && Intrinsics.EZpvd((Object) this.minSourceSz, (Object) minInvestResp.minSourceSz);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinBaseSz() {
        return this.minBaseSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinInvestment() {
        return this.minInvestment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinQuoteSz() {
        return this.minQuoteSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinSourceSz() {
        return this.minSourceSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSingleAmt() {
        return this.singleAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.minInvestment.hashCode() * 31) + this.minBaseSz.hashCode()) * 31) + this.minQuoteSz.hashCode()) * 31) + this.singleAmt.hashCode()) * 31) + this.minSourceSz.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMinBaseSz(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.minBaseSz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMinInvestment(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.minInvestment = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMinQuoteSz(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.minQuoteSz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMinSourceSz(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.minSourceSz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSingleAmt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.singleAmt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MinInvestResp(minInvestment=" + this.minInvestment + ", minBaseSz=" + this.minBaseSz + ", minQuoteSz=" + this.minQuoteSz + ", singleAmt=" + this.singleAmt + ", minSourceSz=" + this.minSourceSz + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.MinInvestResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MinInvestResp> serializer() {
            return MinInvestResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MinInvestResp(int i, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        this.minInvestment = (i & 1) == 0 ? "0" : str;
        if ((i & 2) == 0) {
            this.minBaseSz = "";
        } else {
            this.minBaseSz = str2;
        }
        if ((i & 4) == 0) {
            this.minQuoteSz = "";
        } else {
            this.minQuoteSz = str3;
        }
        if ((i & 8) == 0) {
            this.singleAmt = "";
        } else {
            this.singleAmt = str4;
        }
        if ((i & 16) == 0) {
            this.minSourceSz = "";
        } else {
            this.minSourceSz = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(MinInvestResp minInvestResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) minInvestResp.minInvestment, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, minInvestResp.minInvestment);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) minInvestResp.minBaseSz, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, minInvestResp.minBaseSz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) minInvestResp.minQuoteSz, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, minInvestResp.minQuoteSz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) minInvestResp.singleAmt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, minInvestResp.singleAmt);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && Intrinsics.EZpvd((Object) minInvestResp.minSourceSz, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 4, minInvestResp.minSourceSz);
    }

    public MinInvestResp(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.minInvestment = str;
        this.minBaseSz = str2;
        this.minQuoteSz = str3;
        this.singleAmt = str4;
        this.minSourceSz = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("0") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r9v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r9v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r8v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:2712) call: com.okinc.unify_trade.biz.MinInvestResp.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ MinInvestResp(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "0" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) == 0 ? str5 : "");
    }
}
