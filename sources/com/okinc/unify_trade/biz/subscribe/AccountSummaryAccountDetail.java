package com.okinc.unify_trade.biz.subscribe;

import androidx.core.app.FrameMetricsAggregator;
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
public final class AccountSummaryAccountDetail {
    private String adjEq;
    private String availEq;
    private String borrowFroz;
    private String imr;
    private String mgnRatio;
    private String mmr;
    private String notionalUsd;
    private String ordFroz;
    private String upl;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AccountSummaryAccountDetail() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.upl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.availEq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.adjEq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.borrowFroz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.mmr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.imr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.notionalUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.mgnRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.ordFroz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AccountSummaryAccountDetail copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        return new AccountSummaryAccountDetail(str, str2, str3, str4, str5, str6, str7, str8, str9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountSummaryAccountDetail)) {
            return false;
        }
        AccountSummaryAccountDetail accountSummaryAccountDetail = (AccountSummaryAccountDetail) obj;
        return Intrinsics.EZpvd((Object) this.upl, (Object) accountSummaryAccountDetail.upl) && Intrinsics.EZpvd((Object) this.availEq, (Object) accountSummaryAccountDetail.availEq) && Intrinsics.EZpvd((Object) this.adjEq, (Object) accountSummaryAccountDetail.adjEq) && Intrinsics.EZpvd((Object) this.borrowFroz, (Object) accountSummaryAccountDetail.borrowFroz) && Intrinsics.EZpvd((Object) this.mmr, (Object) accountSummaryAccountDetail.mmr) && Intrinsics.EZpvd((Object) this.imr, (Object) accountSummaryAccountDetail.imr) && Intrinsics.EZpvd((Object) this.notionalUsd, (Object) accountSummaryAccountDetail.notionalUsd) && Intrinsics.EZpvd((Object) this.mgnRatio, (Object) accountSummaryAccountDetail.mgnRatio) && Intrinsics.EZpvd((Object) this.ordFroz, (Object) accountSummaryAccountDetail.ordFroz);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAdjEq() {
        return this.adjEq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvailEq() {
        return this.availEq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBorrowFroz() {
        return this.borrowFroz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getImr() {
        return this.imr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMgnRatio() {
        return this.mgnRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMmr() {
        return this.mmr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNotionalUsd() {
        return this.notionalUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrdFroz() {
        return this.ordFroz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUpl() {
        return this.upl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((this.upl.hashCode() * 31) + this.availEq.hashCode()) * 31) + this.adjEq.hashCode()) * 31) + this.borrowFroz.hashCode()) * 31) + this.mmr.hashCode()) * 31) + this.imr.hashCode()) * 31) + this.notionalUsd.hashCode()) * 31) + this.mgnRatio.hashCode()) * 31) + this.ordFroz.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAdjEq(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.adjEq = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAvailEq(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.availEq = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBorrowFroz(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.borrowFroz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setImr(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.imr = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMgnRatio(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.mgnRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMmr(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.mmr = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNotionalUsd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.notionalUsd = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrdFroz(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ordFroz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUpl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.upl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AccountSummaryAccountDetail(upl=" + this.upl + ", availEq=" + this.availEq + ", adjEq=" + this.adjEq + ", borrowFroz=" + this.borrowFroz + ", mmr=" + this.mmr + ", imr=" + this.imr + ", notionalUsd=" + this.notionalUsd + ", mgnRatio=" + this.mgnRatio + ", ordFroz=" + this.ordFroz + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.subscribe.AccountSummaryAccountDetail.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AccountSummaryAccountDetail> serializer() {
            return AccountSummaryAccountDetail$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AccountSummaryAccountDetail(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.upl = "";
        } else {
            this.upl = str;
        }
        if ((i & 2) == 0) {
            this.availEq = "";
        } else {
            this.availEq = str2;
        }
        if ((i & 4) == 0) {
            this.adjEq = "";
        } else {
            this.adjEq = str3;
        }
        if ((i & 8) == 0) {
            this.borrowFroz = "";
        } else {
            this.borrowFroz = str4;
        }
        if ((i & 16) == 0) {
            this.mmr = "";
        } else {
            this.mmr = str5;
        }
        if ((i & 32) == 0) {
            this.imr = "";
        } else {
            this.imr = str6;
        }
        if ((i & 64) == 0) {
            this.notionalUsd = "";
        } else {
            this.notionalUsd = str7;
        }
        if ((i & 128) == 0) {
            this.mgnRatio = "";
        } else {
            this.mgnRatio = str8;
        }
        if ((i & 256) == 0) {
            this.ordFroz = "";
        } else {
            this.ordFroz = str9;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(AccountSummaryAccountDetail accountSummaryAccountDetail, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) accountSummaryAccountDetail.upl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, accountSummaryAccountDetail.upl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) accountSummaryAccountDetail.availEq, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, accountSummaryAccountDetail.availEq);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) accountSummaryAccountDetail.adjEq, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, accountSummaryAccountDetail.adjEq);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) accountSummaryAccountDetail.borrowFroz, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, accountSummaryAccountDetail.borrowFroz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) accountSummaryAccountDetail.mmr, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, accountSummaryAccountDetail.mmr);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) accountSummaryAccountDetail.imr, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, accountSummaryAccountDetail.imr);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) accountSummaryAccountDetail.notionalUsd, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, accountSummaryAccountDetail.notionalUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) accountSummaryAccountDetail.mgnRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, accountSummaryAccountDetail.mgnRatio);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) && Intrinsics.EZpvd((Object) accountSummaryAccountDetail.ordFroz, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 8, accountSummaryAccountDetail.ordFroz);
    }

    public AccountSummaryAccountDetail(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        this.upl = str;
        this.availEq = str2;
        this.adjEq = str3;
        this.borrowFroz = str4;
        this.mmr = str5;
        this.imr = str6;
        this.notionalUsd = str7;
        this.mgnRatio = str8;
        this.ordFroz = str9;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0055: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r20v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0027: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002f: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0037: ARITH (r20v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003f: ARITH (r20v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r19v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:39) call: com.okinc.unify_trade.biz.subscribe.AccountSummaryAccountDetail.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ AccountSummaryAccountDetail(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) == 0 ? str9 : "");
    }
}
