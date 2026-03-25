package com.okinc.crcore.coreapi.net.requestbean;

import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class SubmitOrderForOtcAgentRequestBean {
    private String baseAmount;
    private String baseCurrency;
    private String bizSource;
    private String depositName;
    private String depositPlatformCode;
    private String paymentChannel;
    private String paymentMethod;
    private String paymentMethodType;
    private String quoteAmount;
    private String quoteCurrency;
    private String quoteToken;
    private String requestId;
    private String side;
    private String tradeType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SubmitOrderForOtcAgentRequestBean() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 16383, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.depositPlatformCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.depositName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.paymentMethod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.paymentMethodType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.bizSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.tradeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.quoteCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.quoteAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.baseCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.baseAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.quoteToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.requestId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.paymentChannel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SubmitOrderForOtcAgentRequestBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14) {
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
        return new SubmitOrderForOtcAgentRequestBean(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubmitOrderForOtcAgentRequestBean)) {
            return false;
        }
        SubmitOrderForOtcAgentRequestBean submitOrderForOtcAgentRequestBean = (SubmitOrderForOtcAgentRequestBean) obj;
        return Intrinsics.EZpvd((Object) this.side, (Object) submitOrderForOtcAgentRequestBean.side) && Intrinsics.EZpvd((Object) this.tradeType, (Object) submitOrderForOtcAgentRequestBean.tradeType) && Intrinsics.EZpvd((Object) this.quoteCurrency, (Object) submitOrderForOtcAgentRequestBean.quoteCurrency) && Intrinsics.EZpvd((Object) this.quoteAmount, (Object) submitOrderForOtcAgentRequestBean.quoteAmount) && Intrinsics.EZpvd((Object) this.baseCurrency, (Object) submitOrderForOtcAgentRequestBean.baseCurrency) && Intrinsics.EZpvd((Object) this.baseAmount, (Object) submitOrderForOtcAgentRequestBean.baseAmount) && Intrinsics.EZpvd((Object) this.quoteToken, (Object) submitOrderForOtcAgentRequestBean.quoteToken) && Intrinsics.EZpvd((Object) this.requestId, (Object) submitOrderForOtcAgentRequestBean.requestId) && Intrinsics.EZpvd((Object) this.paymentChannel, (Object) submitOrderForOtcAgentRequestBean.paymentChannel) && Intrinsics.EZpvd((Object) this.depositPlatformCode, (Object) submitOrderForOtcAgentRequestBean.depositPlatformCode) && Intrinsics.EZpvd((Object) this.depositName, (Object) submitOrderForOtcAgentRequestBean.depositName) && Intrinsics.EZpvd((Object) this.paymentMethod, (Object) submitOrderForOtcAgentRequestBean.paymentMethod) && Intrinsics.EZpvd((Object) this.paymentMethodType, (Object) submitOrderForOtcAgentRequestBean.paymentMethodType) && Intrinsics.EZpvd((Object) this.bizSource, (Object) submitOrderForOtcAgentRequestBean.bizSource);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseAmount() {
        return this.baseAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseCurrency() {
        return this.baseCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBizSource() {
        return this.bizSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDepositName() {
        return this.depositName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDepositPlatformCode() {
        return this.depositPlatformCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPaymentChannel() {
        return this.paymentChannel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPaymentMethod() {
        return this.paymentMethod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPaymentMethodType() {
        return this.paymentMethodType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteAmount() {
        return this.quoteAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteCurrency() {
        return this.quoteCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteToken() {
        return this.quoteToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRequestId() {
        return this.requestId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSide() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradeType() {
        return this.tradeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((this.side.hashCode() * 31) + this.tradeType.hashCode()) * 31) + this.quoteCurrency.hashCode()) * 31) + this.quoteAmount.hashCode()) * 31) + this.baseCurrency.hashCode()) * 31) + this.baseAmount.hashCode()) * 31) + this.quoteToken.hashCode()) * 31) + this.requestId.hashCode()) * 31) + this.paymentChannel.hashCode()) * 31) + this.depositPlatformCode.hashCode()) * 31) + this.depositName.hashCode()) * 31) + this.paymentMethod.hashCode()) * 31) + this.paymentMethodType.hashCode()) * 31) + this.bizSource.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBaseAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.baseAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBaseCurrency(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.baseCurrency = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBizSource(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.bizSource = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDepositName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.depositName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDepositPlatformCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.depositPlatformCode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPaymentChannel(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.paymentChannel = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPaymentMethod(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.paymentMethod = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPaymentMethodType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.paymentMethodType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuoteAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.quoteAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuoteCurrency(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.quoteCurrency = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuoteToken(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.quoteToken = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRequestId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.requestId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSide(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.side = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTradeType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tradeType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SubmitOrderForOtcAgentRequestBean(side=" + this.side + ", tradeType=" + this.tradeType + ", quoteCurrency=" + this.quoteCurrency + ", quoteAmount=" + this.quoteAmount + ", baseCurrency=" + this.baseCurrency + ", baseAmount=" + this.baseAmount + ", quoteToken=" + this.quoteToken + ", requestId=" + this.requestId + ", paymentChannel=" + this.paymentChannel + ", depositPlatformCode=" + this.depositPlatformCode + ", depositName=" + this.depositName + ", paymentMethod=" + this.paymentMethod + ", paymentMethodType=" + this.paymentMethodType + ", bizSource=" + this.bizSource + ")";
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.requestbean.SubmitOrderForOtcAgentRequestBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SubmitOrderForOtcAgentRequestBean> serializer() {
            return SubmitOrderForOtcAgentRequestBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SubmitOrderForOtcAgentRequestBean(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.side = "";
        } else {
            this.side = str;
        }
        if ((i & 2) == 0) {
            this.tradeType = "";
        } else {
            this.tradeType = str2;
        }
        if ((i & 4) == 0) {
            this.quoteCurrency = "";
        } else {
            this.quoteCurrency = str3;
        }
        if ((i & 8) == 0) {
            this.quoteAmount = "";
        } else {
            this.quoteAmount = str4;
        }
        if ((i & 16) == 0) {
            this.baseCurrency = "";
        } else {
            this.baseCurrency = str5;
        }
        if ((i & 32) == 0) {
            this.baseAmount = "";
        } else {
            this.baseAmount = str6;
        }
        if ((i & 64) == 0) {
            this.quoteToken = "";
        } else {
            this.quoteToken = str7;
        }
        this.requestId = (i & 128) == 0 ? UUID.randomUUID().toString() : str8;
        if ((i & 256) == 0) {
            this.paymentChannel = "";
        } else {
            this.paymentChannel = str9;
        }
        if ((i & 512) == 0) {
            this.depositPlatformCode = "";
        } else {
            this.depositPlatformCode = str10;
        }
        if ((i & 1024) == 0) {
            this.depositName = "";
        } else {
            this.depositName = str11;
        }
        if ((i & 2048) == 0) {
            this.paymentMethod = "";
        } else {
            this.paymentMethod = str12;
        }
        if ((i & 4096) == 0) {
            this.paymentMethodType = "";
        } else {
            this.paymentMethodType = str13;
        }
        this.bizSource = (i & 8192) == 0 ? "ai_agent" : str14;
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(SubmitOrderForOtcAgentRequestBean submitOrderForOtcAgentRequestBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) submitOrderForOtcAgentRequestBean.side, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, submitOrderForOtcAgentRequestBean.side);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) submitOrderForOtcAgentRequestBean.tradeType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, submitOrderForOtcAgentRequestBean.tradeType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) submitOrderForOtcAgentRequestBean.quoteCurrency, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, submitOrderForOtcAgentRequestBean.quoteCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) submitOrderForOtcAgentRequestBean.quoteAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, submitOrderForOtcAgentRequestBean.quoteAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) submitOrderForOtcAgentRequestBean.baseCurrency, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, submitOrderForOtcAgentRequestBean.baseCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) submitOrderForOtcAgentRequestBean.baseAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, submitOrderForOtcAgentRequestBean.baseAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) submitOrderForOtcAgentRequestBean.quoteToken, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, submitOrderForOtcAgentRequestBean.quoteToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) submitOrderForOtcAgentRequestBean.requestId, (Object) UUID.randomUUID().toString())) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, submitOrderForOtcAgentRequestBean.requestId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) submitOrderForOtcAgentRequestBean.paymentChannel, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, submitOrderForOtcAgentRequestBean.paymentChannel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) submitOrderForOtcAgentRequestBean.depositPlatformCode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, submitOrderForOtcAgentRequestBean.depositPlatformCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) submitOrderForOtcAgentRequestBean.depositName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, submitOrderForOtcAgentRequestBean.depositName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) submitOrderForOtcAgentRequestBean.paymentMethod, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, submitOrderForOtcAgentRequestBean.paymentMethod);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) submitOrderForOtcAgentRequestBean.paymentMethodType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, submitOrderForOtcAgentRequestBean.paymentMethodType);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) && Intrinsics.EZpvd((Object) submitOrderForOtcAgentRequestBean.bizSource, (Object) "ai_agent")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 13, submitOrderForOtcAgentRequestBean.bizSource);
    }

    public SubmitOrderForOtcAgentRequestBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14) {
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
        this.side = str;
        this.tradeType = str2;
        this.quoteCurrency = str3;
        this.quoteAmount = str4;
        this.baseCurrency = str5;
        this.baseAmount = str6;
        this.quoteToken = str7;
        this.requestId = str8;
        this.paymentChannel = str9;
        this.depositPlatformCode = str10;
        this.depositName = str11;
        this.paymentMethod = str12;
        this.paymentMethodType = str13;
        this.bizSource = str14;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0099: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r30v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r30v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r30v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r30v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r30v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r30v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r30v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r30v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0044: INVOKE 
  (wrap:java.util.UUID:0x0040: INVOKE  STATIC call: java.util.UUID.randomUUID():java.util.UUID A[MD:():java.util.UUID (c), WRAPPED] (LINE:24))
 VIRTUAL call: java.util.UUID.toString():java.lang.String A[MD:():java.lang.String (c), WRAPPED] (LINE:24)) : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004b: ARITH (r30v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0053: ARITH (r30v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005b: ARITH (r30v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0063: ARITH (r30v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006b: ARITH (r30v0 int) & (4096 int) A[WRAPPED]) == (0 int)) ? (r28v0 java.lang.String) : (""))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0072: ARITH (r30v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("ai_agent") : (r29v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:9) call: com.okinc.crcore.coreapi.net.requestbean.SubmitOrderForOtcAgentRequestBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SubmitOrderForOtcAgentRequestBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? UUID.randomUUID().toString() : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) == 0 ? str13 : "", (i & 8192) != 0 ? "ai_agent" : str14);
    }
}
