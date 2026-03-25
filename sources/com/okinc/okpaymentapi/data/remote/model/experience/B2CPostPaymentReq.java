package com.okinc.okpaymentapi.data.remote.model.experience;

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

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class B2CPostPaymentReq {
    private String bankLogo;
    private String bankName;
    private String bankNumber;
    private String baseAmount;
    private String baseCurrency;
    private int cardId;
    private String clientType;
    private String codeType;
    private DepositConvertParamReq depositConvertParam;
    private String depositName;
    private String failUrl;
    private int frequency;
    private String msgCode;
    private Boolean needConvert;
    private String paymentMethod;
    private String quoteAmount;
    private String quoteCurrency;
    private String quoteToken;
    private String signifyTicket;
    private String source;
    private String successUrl;
    private String tradeType;
    private String usdAmount;
    private String userBankId;
    private String version;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public B2CPostPaymentReq() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (DepositConvertParamReq) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 33554431, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBankLogo() {
        return this.bankLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBankName() {
        return this.bankName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBankNumber() {
        return this.bankNumber;
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
    public final int getCardId() {
        return this.cardId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getClientType() {
        return this.clientType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCodeType() {
        return this.codeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DepositConvertParamReq getDepositConvertParam() {
        return this.depositConvertParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDepositName() {
        return this.depositName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFailUrl() {
        return this.failUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getFrequency() {
        return this.frequency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMsgCode() {
        return this.msgCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getNeedConvert() {
        return this.needConvert;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPaymentMethod() {
        return this.paymentMethod;
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
    public final String getSignifyTicket() {
        return this.signifyTicket;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSource() {
        return this.source;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSuccessUrl() {
        return this.successUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradeType() {
        return this.tradeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUsdAmount() {
        return this.usdAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserBankId() {
        return this.userBankId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVersion() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBankLogo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.bankLogo = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBankName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.bankName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBankNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.bankNumber = str;
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
    public final void setCardId(int i) {
        this.cardId = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setClientType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.clientType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCodeType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.codeType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDepositConvertParam(DepositConvertParamReq depositConvertParamReq) {
        this.depositConvertParam = depositConvertParamReq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDepositName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.depositName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFailUrl(String str) {
        this.failUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFrequency(int i) {
        this.frequency = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMsgCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.msgCode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNeedConvert(Boolean bool) {
        this.needConvert = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPaymentMethod(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.paymentMethod = str;
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
    public final void setSignifyTicket(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.signifyTicket = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSource(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.source = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSuccessUrl(String str) {
        this.successUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTradeType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tradeType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUsdAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.usdAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUserBankId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.userBankId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVersion(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.version = str;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okpaymentapi.data.remote.model.experience.B2CPostPaymentReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<B2CPostPaymentReq> serializer() {
            return B2CPostPaymentReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ B2CPostPaymentReq(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i2, String str13, String str14, String str15, String str16, Boolean bool, DepositConvertParamReq depositConvertParamReq, int i3, String str17, String str18, String str19, String str20, String str21, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.baseCurrency = "";
        } else {
            this.baseCurrency = str;
        }
        if ((i & 2) == 0) {
            this.quoteCurrency = "";
        } else {
            this.quoteCurrency = str2;
        }
        if ((i & 4) == 0) {
            this.baseAmount = "0";
        } else {
            this.baseAmount = str3;
        }
        if ((i & 8) == 0) {
            this.quoteAmount = "0";
        } else {
            this.quoteAmount = str4;
        }
        if ((i & 16) == 0) {
            this.depositName = "";
        } else {
            this.depositName = str5;
        }
        if ((i & 32) == 0) {
            this.quoteToken = "";
        } else {
            this.quoteToken = str6;
        }
        if ((i & 64) == 0) {
            this.version = "";
        } else {
            this.version = str7;
        }
        if ((i & 128) == 0) {
            this.successUrl = "https://www.okx.com/buy-crypto";
        } else {
            this.successUrl = str8;
        }
        if ((i & 256) == 0) {
            this.failUrl = "https://www.okx.com/buy-crypto";
        } else {
            this.failUrl = str9;
        }
        if ((i & 512) == 0) {
            this.usdAmount = "0";
        } else {
            this.usdAmount = str10;
        }
        if ((i & 1024) == 0) {
            this.paymentMethod = "";
        } else {
            this.paymentMethod = str11;
        }
        if ((i & 2048) == 0) {
            this.source = "";
        } else {
            this.source = str12;
        }
        if ((i & 4096) == 0) {
            this.cardId = 0;
        } else {
            this.cardId = i2;
        }
        if ((i & 8192) == 0) {
            this.tradeType = "";
        } else {
            this.tradeType = str13;
        }
        if ((i & 16384) == 0) {
            this.codeType = "";
        } else {
            this.codeType = str14;
        }
        if ((32768 & i) == 0) {
            this.msgCode = "";
        } else {
            this.msgCode = str15;
        }
        if ((65536 & i) == 0) {
            this.signifyTicket = "";
        } else {
            this.signifyTicket = str16;
        }
        this.needConvert = (131072 & i) == 0 ? Boolean.FALSE : bool;
        this.depositConvertParam = (262144 & i) == 0 ? null : depositConvertParamReq;
        if ((524288 & i) == 0) {
            this.frequency = 0;
        } else {
            this.frequency = i3;
        }
        this.clientType = (1048576 & i) == 0 ? "pro" : str17;
        if ((2097152 & i) == 0) {
            this.bankName = "";
        } else {
            this.bankName = str18;
        }
        if ((4194304 & i) == 0) {
            this.bankLogo = "";
        } else {
            this.bankLogo = str19;
        }
        if ((8388608 & i) == 0) {
            this.bankNumber = "";
        } else {
            this.bankNumber = str20;
        }
        if ((i & 16777216) == 0) {
            this.userBankId = "";
        } else {
            this.userBankId = str21;
        }
    }

    public static final /* synthetic */ void write$Self$OKPayments_ok_payment_api(B2CPostPaymentReq b2CPostPaymentReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) b2CPostPaymentReq.baseCurrency, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, b2CPostPaymentReq.baseCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) b2CPostPaymentReq.quoteCurrency, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, b2CPostPaymentReq.quoteCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) b2CPostPaymentReq.baseAmount, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, b2CPostPaymentReq.baseAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) b2CPostPaymentReq.quoteAmount, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, b2CPostPaymentReq.quoteAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) b2CPostPaymentReq.depositName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, b2CPostPaymentReq.depositName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) b2CPostPaymentReq.quoteToken, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, b2CPostPaymentReq.quoteToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) b2CPostPaymentReq.version, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, b2CPostPaymentReq.version);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) b2CPostPaymentReq.successUrl, (Object) "https://www.okx.com/buy-crypto")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, b2CPostPaymentReq.successUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) b2CPostPaymentReq.failUrl, (Object) "https://www.okx.com/buy-crypto")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, b2CPostPaymentReq.failUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) b2CPostPaymentReq.usdAmount, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, b2CPostPaymentReq.usdAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) b2CPostPaymentReq.paymentMethod, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, b2CPostPaymentReq.paymentMethod);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) b2CPostPaymentReq.source, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, b2CPostPaymentReq.source);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || b2CPostPaymentReq.cardId != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 12, b2CPostPaymentReq.cardId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) b2CPostPaymentReq.tradeType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, b2CPostPaymentReq.tradeType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) b2CPostPaymentReq.codeType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, b2CPostPaymentReq.codeType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) b2CPostPaymentReq.msgCode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, b2CPostPaymentReq.msgCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) b2CPostPaymentReq.signifyTicket, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, b2CPostPaymentReq.signifyTicket);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd(b2CPostPaymentReq.needConvert, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, BooleanSerializer.INSTANCE, b2CPostPaymentReq.needConvert);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || b2CPostPaymentReq.depositConvertParam != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, DepositConvertParamReq$$serializer.INSTANCE, b2CPostPaymentReq.depositConvertParam);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || b2CPostPaymentReq.frequency != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 19, b2CPostPaymentReq.frequency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd((Object) b2CPostPaymentReq.clientType, (Object) "pro")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 20, b2CPostPaymentReq.clientType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !Intrinsics.EZpvd((Object) b2CPostPaymentReq.bankName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 21, b2CPostPaymentReq.bankName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || !Intrinsics.EZpvd((Object) b2CPostPaymentReq.bankLogo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 22, b2CPostPaymentReq.bankLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || !Intrinsics.EZpvd((Object) b2CPostPaymentReq.bankNumber, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 23, b2CPostPaymentReq.bankNumber);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) && Intrinsics.EZpvd((Object) b2CPostPaymentReq.userBankId, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 24, b2CPostPaymentReq.userBankId);
    }

    public B2CPostPaymentReq(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, String str8, String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, int i, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, Boolean bool, DepositConvertParamReq depositConvertParamReq, int i2, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str20, "");
        Intrinsics.checkNotNullParameter(str21, "");
        this.baseCurrency = str;
        this.quoteCurrency = str2;
        this.baseAmount = str3;
        this.quoteAmount = str4;
        this.depositName = str5;
        this.quoteToken = str6;
        this.version = str7;
        this.successUrl = str8;
        this.failUrl = str9;
        this.usdAmount = str10;
        this.paymentMethod = str11;
        this.source = str12;
        this.cardId = i;
        this.tradeType = str13;
        this.codeType = str14;
        this.msgCode = str15;
        this.signifyTicket = str16;
        this.needConvert = bool;
        this.depositConvertParam = depositConvertParamReq;
        this.frequency = i2;
        this.clientType = str17;
        this.bankName = str18;
        this.bankLogo = str19;
        this.bankNumber = str20;
        this.userBankId = str21;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0124: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r52v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r52v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r52v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("0") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r52v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("0") : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r52v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r52v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0036: ARITH (r52v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003e: ARITH (r52v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("https://www.okx.com/buy-crypto") : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0048: ARITH (r52v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r35v0 java.lang.String) : ("https://www.okx.com/buy-crypto"))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004f: ARITH (r52v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r36v0 java.lang.String) : ("0"))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0056: ARITH (r52v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005e: ARITH (r52v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r38v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0066: ARITH (r52v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r39v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006e: ARITH (r52v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0078: ARITH (r52v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0084: ARITH (r52v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008f: ARITH (r52v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r43v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x009a: ARITH (r52v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x009e: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r44v0 java.lang.Boolean))
  (wrap:com.okinc.okpaymentapi.data.remote.model.experience.DepositConvertParamReq:?: TERNARY null = ((wrap:int:0x00a5: ARITH (r52v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okpaymentapi.data.remote.model.experience.DepositConvertParamReq) : (r45v0 com.okinc.okpaymentapi.data.remote.model.experience.DepositConvertParamReq))
  (wrap:int:?: TERNARY null = ((wrap:int:0x00b0: ARITH (r52v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r46v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00bb: ARITH (r52v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? ("pro") : (r47v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00c6: ARITH (r52v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? ("") : (r48v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00d1: ARITH (r52v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? ("") : (r49v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00dc: ARITH (r52v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? ("") : (r50v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00e7: ARITH (r52v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? ("") : (r51v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, com.okinc.okpaymentapi.data.remote.model.experience.DepositConvertParamReq, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:10) call: com.okinc.okpaymentapi.data.remote.model.experience.B2CPostPaymentReq.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, com.okinc.okpaymentapi.data.remote.model.experience.DepositConvertParamReq, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ B2CPostPaymentReq(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i, String str13, String str14, String str15, String str16, Boolean bool, DepositConvertParamReq depositConvertParamReq, int i2, String str17, String str18, String str19, String str20, String str21, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? "0" : str3, (i3 & 8) != 0 ? "0" : str4, (i3 & 16) != 0 ? "" : str5, (i3 & 32) != 0 ? "" : str6, (i3 & 64) != 0 ? "" : str7, (i3 & 128) != 0 ? "https://www.okx.com/buy-crypto" : str8, (i3 & 256) == 0 ? str9 : "https://www.okx.com/buy-crypto", (i3 & 512) == 0 ? str10 : "0", (i3 & 1024) != 0 ? "" : str11, (i3 & 2048) != 0 ? "" : str12, (i3 & 4096) != 0 ? 0 : i, (i3 & 8192) != 0 ? "" : str13, (i3 & 16384) != 0 ? "" : str14, (i3 & 32768) != 0 ? "" : str15, (i3 & 65536) != 0 ? "" : str16, (i3 & 131072) != 0 ? Boolean.FALSE : bool, (i3 & 262144) != 0 ? null : depositConvertParamReq, (i3 & 524288) != 0 ? 0 : i2, (i3 & 1048576) != 0 ? "pro" : str17, (i3 & 2097152) != 0 ? "" : str18, (i3 & 4194304) != 0 ? "" : str19, (i3 & 8388608) != 0 ? "" : str20, (i3 & 16777216) != 0 ? "" : str21);
    }
}
