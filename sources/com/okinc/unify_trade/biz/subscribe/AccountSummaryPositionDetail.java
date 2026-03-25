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
public final class AccountSummaryPositionDetail {
    private String baseBal;
    private String ccy;
    private String instId;
    private String instType;
    private String liab;
    private String margin;
    private String mgnMode;
    private String mgnRatio;
    private String mmr;
    private String pos;
    private String posCcy;
    private String posSide;
    private String quoteBal;
    private String upl;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AccountSummaryPositionDetail() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 16383, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.quoteBal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.mmr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.baseBal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.posSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.pos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.liab;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.mgnMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.posCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.upl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.mgnRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.margin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AccountSummaryPositionDetail copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14) {
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
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        return new AccountSummaryPositionDetail(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountSummaryPositionDetail)) {
            return false;
        }
        AccountSummaryPositionDetail accountSummaryPositionDetail = (AccountSummaryPositionDetail) obj;
        return Intrinsics.EZpvd((Object) this.quoteBal, (Object) accountSummaryPositionDetail.quoteBal) && Intrinsics.EZpvd((Object) this.pos, (Object) accountSummaryPositionDetail.pos) && Intrinsics.EZpvd((Object) this.liab, (Object) accountSummaryPositionDetail.liab) && Intrinsics.EZpvd((Object) this.ccy, (Object) accountSummaryPositionDetail.ccy) && Intrinsics.EZpvd((Object) this.mgnMode, (Object) accountSummaryPositionDetail.mgnMode) && Intrinsics.EZpvd((Object) this.posCcy, (Object) accountSummaryPositionDetail.posCcy) && Intrinsics.EZpvd((Object) this.upl, (Object) accountSummaryPositionDetail.upl) && Intrinsics.EZpvd((Object) this.mgnRatio, (Object) accountSummaryPositionDetail.mgnRatio) && Intrinsics.EZpvd((Object) this.margin, (Object) accountSummaryPositionDetail.margin) && Intrinsics.EZpvd((Object) this.instType, (Object) accountSummaryPositionDetail.instType) && Intrinsics.EZpvd((Object) this.instId, (Object) accountSummaryPositionDetail.instId) && Intrinsics.EZpvd((Object) this.mmr, (Object) accountSummaryPositionDetail.mmr) && Intrinsics.EZpvd((Object) this.baseBal, (Object) accountSummaryPositionDetail.baseBal) && Intrinsics.EZpvd((Object) this.posSide, (Object) accountSummaryPositionDetail.posSide);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseBal() {
        return this.baseBal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCcy() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstType() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLiab() {
        return this.liab;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMargin() {
        return this.margin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMgnMode() {
        return this.mgnMode;
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
    public final String getPos() {
        return this.pos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPosCcy() {
        return this.posCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPosSide() {
        return this.posSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteBal() {
        return this.quoteBal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUpl() {
        return this.upl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((this.quoteBal.hashCode() * 31) + this.pos.hashCode()) * 31) + this.liab.hashCode()) * 31) + this.ccy.hashCode()) * 31) + this.mgnMode.hashCode()) * 31) + this.posCcy.hashCode()) * 31) + this.upl.hashCode()) * 31) + this.mgnRatio.hashCode()) * 31) + this.margin.hashCode()) * 31) + this.instType.hashCode()) * 31) + this.instId.hashCode()) * 31) + this.mmr.hashCode()) * 31) + this.baseBal.hashCode()) * 31) + this.posSide.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBaseBal(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.baseBal = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCcy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ccy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.instId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.instType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLiab(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.liab = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMargin(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.margin = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMgnMode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.mgnMode = str;
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
    public final void setPos(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.pos = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPosCcy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.posCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPosSide(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.posSide = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuoteBal(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.quoteBal = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUpl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.upl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AccountSummaryPositionDetail(quoteBal=" + this.quoteBal + ", pos=" + this.pos + ", liab=" + this.liab + ", ccy=" + this.ccy + ", mgnMode=" + this.mgnMode + ", posCcy=" + this.posCcy + ", upl=" + this.upl + ", mgnRatio=" + this.mgnRatio + ", margin=" + this.margin + ", instType=" + this.instType + ", instId=" + this.instId + ", mmr=" + this.mmr + ", baseBal=" + this.baseBal + ", posSide=" + this.posSide + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.subscribe.AccountSummaryPositionDetail.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AccountSummaryPositionDetail> serializer() {
            return AccountSummaryPositionDetail$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AccountSummaryPositionDetail(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.quoteBal = "";
        } else {
            this.quoteBal = str;
        }
        if ((i & 2) == 0) {
            this.pos = "";
        } else {
            this.pos = str2;
        }
        if ((i & 4) == 0) {
            this.liab = "";
        } else {
            this.liab = str3;
        }
        if ((i & 8) == 0) {
            this.ccy = "";
        } else {
            this.ccy = str4;
        }
        if ((i & 16) == 0) {
            this.mgnMode = "";
        } else {
            this.mgnMode = str5;
        }
        if ((i & 32) == 0) {
            this.posCcy = "";
        } else {
            this.posCcy = str6;
        }
        if ((i & 64) == 0) {
            this.upl = "";
        } else {
            this.upl = str7;
        }
        if ((i & 128) == 0) {
            this.mgnRatio = "";
        } else {
            this.mgnRatio = str8;
        }
        if ((i & 256) == 0) {
            this.margin = "";
        } else {
            this.margin = str9;
        }
        if ((i & 512) == 0) {
            this.instType = "";
        } else {
            this.instType = str10;
        }
        if ((i & 1024) == 0) {
            this.instId = "";
        } else {
            this.instId = str11;
        }
        if ((i & 2048) == 0) {
            this.mmr = "";
        } else {
            this.mmr = str12;
        }
        if ((i & 4096) == 0) {
            this.baseBal = "";
        } else {
            this.baseBal = str13;
        }
        if ((i & 8192) == 0) {
            this.posSide = "";
        } else {
            this.posSide = str14;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(AccountSummaryPositionDetail accountSummaryPositionDetail, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) accountSummaryPositionDetail.quoteBal, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, accountSummaryPositionDetail.quoteBal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) accountSummaryPositionDetail.pos, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, accountSummaryPositionDetail.pos);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) accountSummaryPositionDetail.liab, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, accountSummaryPositionDetail.liab);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) accountSummaryPositionDetail.ccy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, accountSummaryPositionDetail.ccy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) accountSummaryPositionDetail.mgnMode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, accountSummaryPositionDetail.mgnMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) accountSummaryPositionDetail.posCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, accountSummaryPositionDetail.posCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) accountSummaryPositionDetail.upl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, accountSummaryPositionDetail.upl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) accountSummaryPositionDetail.mgnRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, accountSummaryPositionDetail.mgnRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) accountSummaryPositionDetail.margin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, accountSummaryPositionDetail.margin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) accountSummaryPositionDetail.instType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, accountSummaryPositionDetail.instType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) accountSummaryPositionDetail.instId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, accountSummaryPositionDetail.instId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) accountSummaryPositionDetail.mmr, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, accountSummaryPositionDetail.mmr);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) accountSummaryPositionDetail.baseBal, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, accountSummaryPositionDetail.baseBal);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) && Intrinsics.EZpvd((Object) accountSummaryPositionDetail.posSide, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 13, accountSummaryPositionDetail.posSide);
    }

    public AccountSummaryPositionDetail(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14) {
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
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        this.quoteBal = str;
        this.pos = str2;
        this.liab = str3;
        this.ccy = str4;
        this.mgnMode = str5;
        this.posCcy = str6;
        this.upl = str7;
        this.mgnRatio = str8;
        this.margin = str9;
        this.instType = str10;
        this.instId = str11;
        this.mmr = str12;
        this.baseBal = str13;
        this.posSide = str14;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0091: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r30v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r30v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r30v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r30v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r30v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r30v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r30v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r30v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r30v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r30v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r30v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r30v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r30v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006c: ARITH (r30v0 int) & (8192 int) A[WRAPPED]) == (0 int)) ? (r29v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:53) call: com.okinc.unify_trade.biz.subscribe.AccountSummaryPositionDetail.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ AccountSummaryPositionDetail(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) != 0 ? "" : str13, (i & 8192) == 0 ? str14 : "");
    }
}
