package com.okinc.okpaymentapi.data.remote.model.experience;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class OrderStatusResp {
    private String baseAmount;
    private String baseCurrency;
    private String businessErrorCode;
    private String dvAction;
    private String errorCode;
    private String errorCodeBusinessType;
    private String errorMessage;
    private String errorSource;
    private String errorTitle;
    private String errorType;
    private String orderId;
    private String quoteAmount;
    private String quoteCurrency;
    private String requestAmount;
    private String requestCurrency;
    private int status;
    private int userId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OrderStatusResp() {
        this((String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 131071, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.dvAction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.baseAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.baseCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.quoteAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.quoteCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.requestAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.requestCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component17() {
        return this.userId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.errorCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.errorCodeBusinessType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.businessErrorCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.errorType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.errorSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.errorMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.errorTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OrderStatusResp copy(@NotNull String str, int i, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, int i2) {
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
        Intrinsics.checkNotNullParameter(str15, "");
        return new OrderStatusResp(str, i, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderStatusResp)) {
            return false;
        }
        OrderStatusResp orderStatusResp = (OrderStatusResp) obj;
        return Intrinsics.EZpvd((Object) this.orderId, (Object) orderStatusResp.orderId) && this.status == orderStatusResp.status && Intrinsics.EZpvd((Object) this.errorCode, (Object) orderStatusResp.errorCode) && Intrinsics.EZpvd((Object) this.errorCodeBusinessType, (Object) orderStatusResp.errorCodeBusinessType) && Intrinsics.EZpvd((Object) this.businessErrorCode, (Object) orderStatusResp.businessErrorCode) && Intrinsics.EZpvd((Object) this.errorType, (Object) orderStatusResp.errorType) && Intrinsics.EZpvd((Object) this.errorSource, (Object) orderStatusResp.errorSource) && Intrinsics.EZpvd((Object) this.errorMessage, (Object) orderStatusResp.errorMessage) && Intrinsics.EZpvd((Object) this.errorTitle, (Object) orderStatusResp.errorTitle) && Intrinsics.EZpvd((Object) this.dvAction, (Object) orderStatusResp.dvAction) && Intrinsics.EZpvd((Object) this.baseAmount, (Object) orderStatusResp.baseAmount) && Intrinsics.EZpvd((Object) this.baseCurrency, (Object) orderStatusResp.baseCurrency) && Intrinsics.EZpvd((Object) this.quoteAmount, (Object) orderStatusResp.quoteAmount) && Intrinsics.EZpvd((Object) this.quoteCurrency, (Object) orderStatusResp.quoteCurrency) && Intrinsics.EZpvd((Object) this.requestAmount, (Object) orderStatusResp.requestAmount) && Intrinsics.EZpvd((Object) this.requestCurrency, (Object) orderStatusResp.requestCurrency) && this.userId == orderStatusResp.userId;
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
    public final String getBusinessErrorCode() {
        return this.businessErrorCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDvAction() {
        return this.dvAction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getErrorCode() {
        return this.errorCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getErrorCodeBusinessType() {
        return this.errorCodeBusinessType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getErrorSource() {
        return this.errorSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getErrorTitle() {
        return this.errorTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getErrorType() {
        return this.errorType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderId() {
        return this.orderId;
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
    public final String getRequestAmount() {
        return this.requestAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRequestCurrency() {
        return this.requestCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getUserId() {
        return this.userId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((((((this.orderId.hashCode() * 31) + Integer.hashCode(this.status)) * 31) + this.errorCode.hashCode()) * 31) + this.errorCodeBusinessType.hashCode()) * 31) + this.businessErrorCode.hashCode()) * 31) + this.errorType.hashCode()) * 31) + this.errorSource.hashCode()) * 31) + this.errorMessage.hashCode()) * 31) + this.errorTitle.hashCode()) * 31) + this.dvAction.hashCode()) * 31) + this.baseAmount.hashCode()) * 31) + this.baseCurrency.hashCode()) * 31) + this.quoteAmount.hashCode()) * 31) + this.quoteCurrency.hashCode()) * 31) + this.requestAmount.hashCode()) * 31) + this.requestCurrency.hashCode()) * 31) + Integer.hashCode(this.userId);
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
    public final void setBusinessErrorCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.businessErrorCode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDvAction(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.dvAction = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setErrorCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.errorCode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setErrorCodeBusinessType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.errorCodeBusinessType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setErrorMessage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.errorMessage = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setErrorSource(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.errorSource = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setErrorTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.errorTitle = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setErrorType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.errorType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrderId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.orderId = str;
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
    public final void setRequestAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.requestAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRequestCurrency(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.requestCurrency = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStatus(int i) {
        this.status = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUserId(int i) {
        this.userId = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OrderStatusResp(orderId=" + this.orderId + ", status=" + this.status + ", errorCode=" + this.errorCode + ", errorCodeBusinessType=" + this.errorCodeBusinessType + ", businessErrorCode=" + this.businessErrorCode + ", errorType=" + this.errorType + ", errorSource=" + this.errorSource + ", errorMessage=" + this.errorMessage + ", errorTitle=" + this.errorTitle + ", dvAction=" + this.dvAction + ", baseAmount=" + this.baseAmount + ", baseCurrency=" + this.baseCurrency + ", quoteAmount=" + this.quoteAmount + ", quoteCurrency=" + this.quoteCurrency + ", requestAmount=" + this.requestAmount + ", requestCurrency=" + this.requestCurrency + ", userId=" + this.userId + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okpaymentapi.data.remote.model.experience.OrderStatusResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OrderStatusResp> serializer() {
            return OrderStatusResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OrderStatusResp(int i, String str, int i2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, int i3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.orderId = "";
        } else {
            this.orderId = str;
        }
        this.status = (i & 2) == 0 ? -1 : i2;
        if ((i & 4) == 0) {
            this.errorCode = "";
        } else {
            this.errorCode = str2;
        }
        if ((i & 8) == 0) {
            this.errorCodeBusinessType = "";
        } else {
            this.errorCodeBusinessType = str3;
        }
        if ((i & 16) == 0) {
            this.businessErrorCode = "";
        } else {
            this.businessErrorCode = str4;
        }
        if ((i & 32) == 0) {
            this.errorType = "";
        } else {
            this.errorType = str5;
        }
        if ((i & 64) == 0) {
            this.errorSource = "";
        } else {
            this.errorSource = str6;
        }
        if ((i & 128) == 0) {
            this.errorMessage = "";
        } else {
            this.errorMessage = str7;
        }
        if ((i & 256) == 0) {
            this.errorTitle = "";
        } else {
            this.errorTitle = str8;
        }
        if ((i & 512) == 0) {
            this.dvAction = "";
        } else {
            this.dvAction = str9;
        }
        if ((i & 1024) == 0) {
            this.baseAmount = "";
        } else {
            this.baseAmount = str10;
        }
        if ((i & 2048) == 0) {
            this.baseCurrency = "";
        } else {
            this.baseCurrency = str11;
        }
        if ((i & 4096) == 0) {
            this.quoteAmount = "";
        } else {
            this.quoteAmount = str12;
        }
        if ((i & 8192) == 0) {
            this.quoteCurrency = "";
        } else {
            this.quoteCurrency = str13;
        }
        if ((i & 16384) == 0) {
            this.requestAmount = "";
        } else {
            this.requestAmount = str14;
        }
        if ((32768 & i) == 0) {
            this.requestCurrency = "";
        } else {
            this.requestCurrency = str15;
        }
        this.userId = (i & 65536) == 0 ? 0 : i3;
    }

    public static final /* synthetic */ void write$Self$OKPayments_ok_payment_api(OrderStatusResp orderStatusResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) orderStatusResp.orderId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, orderStatusResp.orderId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || orderStatusResp.status != -1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 1, orderStatusResp.status);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) orderStatusResp.errorCode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, orderStatusResp.errorCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) orderStatusResp.errorCodeBusinessType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, orderStatusResp.errorCodeBusinessType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) orderStatusResp.businessErrorCode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, orderStatusResp.businessErrorCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) orderStatusResp.errorType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, orderStatusResp.errorType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) orderStatusResp.errorSource, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, orderStatusResp.errorSource);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) orderStatusResp.errorMessage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, orderStatusResp.errorMessage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) orderStatusResp.errorTitle, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, orderStatusResp.errorTitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) orderStatusResp.dvAction, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, orderStatusResp.dvAction);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) orderStatusResp.baseAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, orderStatusResp.baseAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) orderStatusResp.baseCurrency, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, orderStatusResp.baseCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) orderStatusResp.quoteAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, orderStatusResp.quoteAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) orderStatusResp.quoteCurrency, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, orderStatusResp.quoteCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) orderStatusResp.requestAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, orderStatusResp.requestAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) orderStatusResp.requestCurrency, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, orderStatusResp.requestCurrency);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) && orderStatusResp.userId == 0) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 16, orderStatusResp.userId);
    }

    public OrderStatusResp(@NotNull String str, int i, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, int i2) {
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
        Intrinsics.checkNotNullParameter(str15, "");
        this.orderId = str;
        this.status = i;
        this.errorCode = str2;
        this.errorCodeBusinessType = str3;
        this.businessErrorCode = str4;
        this.errorType = str5;
        this.errorSource = str6;
        this.errorMessage = str7;
        this.errorTitle = str8;
        this.dvAction = str9;
        this.baseAmount = str10;
        this.baseCurrency = str11;
        this.quoteAmount = str12;
        this.quoteCurrency = str13;
        this.requestAmount = str14;
        this.requestCurrency = str15;
        this.userId = i2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00b9: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r36v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000c: ARITH (r36v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r20v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r36v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r36v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r36v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r36v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r36v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r36v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r36v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r36v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r36v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r36v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r36v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006c: ARITH (r36v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0076: ARITH (r36v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0082: ARITH (r36v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x008d: ARITH (r36v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r35v0 int))
 A[MD:(java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):void (m)] (LINE:187) call: com.okinc.okpaymentapi.data.remote.model.experience.OrderStatusResp.<init>(java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):void type: THIS */
    public /* synthetic */ OrderStatusResp(String str, int i, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? -1 : i, (i3 & 4) != 0 ? "" : str2, (i3 & 8) != 0 ? "" : str3, (i3 & 16) != 0 ? "" : str4, (i3 & 32) != 0 ? "" : str5, (i3 & 64) != 0 ? "" : str6, (i3 & 128) != 0 ? "" : str7, (i3 & 256) != 0 ? "" : str8, (i3 & 512) != 0 ? "" : str9, (i3 & 1024) != 0 ? "" : str10, (i3 & 2048) != 0 ? "" : str11, (i3 & 4096) != 0 ? "" : str12, (i3 & 8192) != 0 ? "" : str13, (i3 & 16384) != 0 ? "" : str14, (i3 & 32768) != 0 ? "" : str15, (i3 & 65536) != 0 ? 0 : i2);
    }
}
