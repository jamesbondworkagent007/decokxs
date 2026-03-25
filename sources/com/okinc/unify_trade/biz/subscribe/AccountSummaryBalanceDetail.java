package com.okinc.unify_trade.biz.subscribe;

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
public final class AccountSummaryBalanceDetail {
    private String borrowFroz;
    private String ccy;
    private String colRes;
    private String eq;
    private String frozenBal;
    private String imr;
    private String mgnRatio;
    private String mmr;
    private String ordFroz;
    private String upl;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AccountSummaryBalanceDetail() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 1023, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.colRes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.eq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.upl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.frozenBal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.borrowFroz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.mmr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.imr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.ordFroz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.mgnRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AccountSummaryBalanceDetail copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        return new AccountSummaryBalanceDetail(str, str2, str3, str4, str5, str6, str7, str8, str9, str10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountSummaryBalanceDetail)) {
            return false;
        }
        AccountSummaryBalanceDetail accountSummaryBalanceDetail = (AccountSummaryBalanceDetail) obj;
        return Intrinsics.EZpvd((Object) this.colRes, (Object) accountSummaryBalanceDetail.colRes) && Intrinsics.EZpvd((Object) this.upl, (Object) accountSummaryBalanceDetail.upl) && Intrinsics.EZpvd((Object) this.ccy, (Object) accountSummaryBalanceDetail.ccy) && Intrinsics.EZpvd((Object) this.frozenBal, (Object) accountSummaryBalanceDetail.frozenBal) && Intrinsics.EZpvd((Object) this.borrowFroz, (Object) accountSummaryBalanceDetail.borrowFroz) && Intrinsics.EZpvd((Object) this.mmr, (Object) accountSummaryBalanceDetail.mmr) && Intrinsics.EZpvd((Object) this.imr, (Object) accountSummaryBalanceDetail.imr) && Intrinsics.EZpvd((Object) this.ordFroz, (Object) accountSummaryBalanceDetail.ordFroz) && Intrinsics.EZpvd((Object) this.mgnRatio, (Object) accountSummaryBalanceDetail.mgnRatio) && Intrinsics.EZpvd((Object) this.eq, (Object) accountSummaryBalanceDetail.eq);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBorrowFroz() {
        return this.borrowFroz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCcy() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getColRes() {
        return this.colRes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEq() {
        return this.eq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFrozenBal() {
        return this.frozenBal;
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
    public final String getOrdFroz() {
        return this.ordFroz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUpl() {
        return this.upl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((this.colRes.hashCode() * 31) + this.upl.hashCode()) * 31) + this.ccy.hashCode()) * 31) + this.frozenBal.hashCode()) * 31) + this.borrowFroz.hashCode()) * 31) + this.mmr.hashCode()) * 31) + this.imr.hashCode()) * 31) + this.ordFroz.hashCode()) * 31) + this.mgnRatio.hashCode()) * 31) + this.eq.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBorrowFroz(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.borrowFroz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCcy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ccy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setColRes(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.colRes = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEq(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.eq = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFrozenBal(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.frozenBal = str;
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
        return "AccountSummaryBalanceDetail(colRes=" + this.colRes + ", upl=" + this.upl + ", ccy=" + this.ccy + ", frozenBal=" + this.frozenBal + ", borrowFroz=" + this.borrowFroz + ", mmr=" + this.mmr + ", imr=" + this.imr + ", ordFroz=" + this.ordFroz + ", mgnRatio=" + this.mgnRatio + ", eq=" + this.eq + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.subscribe.AccountSummaryBalanceDetail.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AccountSummaryBalanceDetail> serializer() {
            return AccountSummaryBalanceDetail$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AccountSummaryBalanceDetail(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.colRes = "";
        } else {
            this.colRes = str;
        }
        if ((i & 2) == 0) {
            this.upl = "";
        } else {
            this.upl = str2;
        }
        if ((i & 4) == 0) {
            this.ccy = "";
        } else {
            this.ccy = str3;
        }
        if ((i & 8) == 0) {
            this.frozenBal = "";
        } else {
            this.frozenBal = str4;
        }
        if ((i & 16) == 0) {
            this.borrowFroz = "";
        } else {
            this.borrowFroz = str5;
        }
        if ((i & 32) == 0) {
            this.mmr = "";
        } else {
            this.mmr = str6;
        }
        if ((i & 64) == 0) {
            this.imr = "";
        } else {
            this.imr = str7;
        }
        if ((i & 128) == 0) {
            this.ordFroz = "";
        } else {
            this.ordFroz = str8;
        }
        if ((i & 256) == 0) {
            this.mgnRatio = "";
        } else {
            this.mgnRatio = str9;
        }
        if ((i & 512) == 0) {
            this.eq = "";
        } else {
            this.eq = str10;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(AccountSummaryBalanceDetail accountSummaryBalanceDetail, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) accountSummaryBalanceDetail.colRes, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, accountSummaryBalanceDetail.colRes);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) accountSummaryBalanceDetail.upl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, accountSummaryBalanceDetail.upl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) accountSummaryBalanceDetail.ccy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, accountSummaryBalanceDetail.ccy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) accountSummaryBalanceDetail.frozenBal, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, accountSummaryBalanceDetail.frozenBal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) accountSummaryBalanceDetail.borrowFroz, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, accountSummaryBalanceDetail.borrowFroz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) accountSummaryBalanceDetail.mmr, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, accountSummaryBalanceDetail.mmr);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) accountSummaryBalanceDetail.imr, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, accountSummaryBalanceDetail.imr);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) accountSummaryBalanceDetail.ordFroz, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, accountSummaryBalanceDetail.ordFroz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) accountSummaryBalanceDetail.mgnRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, accountSummaryBalanceDetail.mgnRatio);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) && Intrinsics.EZpvd((Object) accountSummaryBalanceDetail.eq, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 9, accountSummaryBalanceDetail.eq);
    }

    public AccountSummaryBalanceDetail(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        this.colRes = str;
        this.upl = str2;
        this.ccy = str3;
        this.frozenBal = str4;
        this.borrowFroz = str5;
        this.mmr = str6;
        this.imr = str7;
        this.ordFroz = str8;
        this.mgnRatio = str9;
        this.eq = str10;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0061: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r22v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r22v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r22v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r22v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0028: ARITH (r22v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0030: ARITH (r22v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0038: ARITH (r22v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0040: ARITH (r22v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0048: ARITH (r22v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r21v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:24) call: com.okinc.unify_trade.biz.subscribe.AccountSummaryBalanceDetail.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ AccountSummaryBalanceDetail(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) == 0 ? str10 : "");
    }
}
