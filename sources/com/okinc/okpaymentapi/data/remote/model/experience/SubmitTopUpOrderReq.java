package com.okinc.okpaymentapi.data.remote.model.experience;

import androidx.camera.video.AudioStats;
import java.util.UUID;
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
public final class SubmitTopUpOrderReq {
    private AuthenticationParams authenticationParams;
    private String authenticationType;
    private double baseAmount;
    private String baseCurrency;
    private String businessType;
    private String channelId;
    private double quoteAmount;
    private String quoteCurrency;
    private String quoteToken;
    private String requestId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SubmitTopUpOrderReq() {
        this((String) null, (String) null, (String) null, AudioStats.AUDIO_AMPLITUDE_NONE, AudioStats.AUDIO_AMPLITUDE_NONE, (String) null, (String) null, (String) null, (String) null, (AuthenticationParams) null, 1023, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.quoteToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AuthenticationParams component10() {
        return this.authenticationParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.quoteCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.baseCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double component4() {
        return this.quoteAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double component5() {
        return this.baseAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.businessType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.channelId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.requestId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.authenticationType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SubmitTopUpOrderReq copy(@NotNull String str, @NotNull String str2, @NotNull String str3, double d, double d2, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull AuthenticationParams authenticationParams) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(authenticationParams, "");
        return new SubmitTopUpOrderReq(str, str2, str3, d, d2, str4, str5, str6, str7, authenticationParams);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubmitTopUpOrderReq)) {
            return false;
        }
        SubmitTopUpOrderReq submitTopUpOrderReq = (SubmitTopUpOrderReq) obj;
        return Intrinsics.EZpvd((Object) this.quoteToken, (Object) submitTopUpOrderReq.quoteToken) && Intrinsics.EZpvd((Object) this.quoteCurrency, (Object) submitTopUpOrderReq.quoteCurrency) && Intrinsics.EZpvd((Object) this.baseCurrency, (Object) submitTopUpOrderReq.baseCurrency) && Double.compare(this.quoteAmount, submitTopUpOrderReq.quoteAmount) == 0 && Double.compare(this.baseAmount, submitTopUpOrderReq.baseAmount) == 0 && Intrinsics.EZpvd((Object) this.businessType, (Object) submitTopUpOrderReq.businessType) && Intrinsics.EZpvd((Object) this.channelId, (Object) submitTopUpOrderReq.channelId) && Intrinsics.EZpvd((Object) this.requestId, (Object) submitTopUpOrderReq.requestId) && Intrinsics.EZpvd((Object) this.authenticationType, (Object) submitTopUpOrderReq.authenticationType) && Intrinsics.EZpvd(this.authenticationParams, submitTopUpOrderReq.authenticationParams);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AuthenticationParams getAuthenticationParams() {
        return this.authenticationParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAuthenticationType() {
        return this.authenticationType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double getBaseAmount() {
        return this.baseAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseCurrency() {
        return this.baseCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBusinessType() {
        return this.businessType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChannelId() {
        return this.channelId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double getQuoteAmount() {
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
    public int hashCode() {
        return (((((((((((((((((this.quoteToken.hashCode() * 31) + this.quoteCurrency.hashCode()) * 31) + this.baseCurrency.hashCode()) * 31) + Double.hashCode(this.quoteAmount)) * 31) + Double.hashCode(this.baseAmount)) * 31) + this.businessType.hashCode()) * 31) + this.channelId.hashCode()) * 31) + this.requestId.hashCode()) * 31) + this.authenticationType.hashCode()) * 31) + this.authenticationParams.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAuthenticationParams(@NotNull AuthenticationParams authenticationParams) {
        Intrinsics.checkNotNullParameter(authenticationParams, "");
        this.authenticationParams = authenticationParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAuthenticationType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.authenticationType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBaseAmount(double d) {
        this.baseAmount = d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBaseCurrency(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.baseCurrency = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBusinessType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.businessType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChannelId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.channelId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuoteAmount(double d) {
        this.quoteAmount = d;
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
    public String toString() {
        return "SubmitTopUpOrderReq(quoteToken=" + this.quoteToken + ", quoteCurrency=" + this.quoteCurrency + ", baseCurrency=" + this.baseCurrency + ", quoteAmount=" + this.quoteAmount + ", baseAmount=" + this.baseAmount + ", businessType=" + this.businessType + ", channelId=" + this.channelId + ", requestId=" + this.requestId + ", authenticationType=" + this.authenticationType + ", authenticationParams=" + this.authenticationParams + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okpaymentapi.data.remote.model.experience.SubmitTopUpOrderReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SubmitTopUpOrderReq> serializer() {
            return SubmitTopUpOrderReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SubmitTopUpOrderReq(int i, String str, String str2, String str3, double d, double d2, String str4, String str5, String str6, String str7, AuthenticationParams authenticationParams, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.quoteToken = "";
        } else {
            this.quoteToken = str;
        }
        if ((i & 2) == 0) {
            this.quoteCurrency = "";
        } else {
            this.quoteCurrency = str2;
        }
        if ((i & 4) == 0) {
            this.baseCurrency = "";
        } else {
            this.baseCurrency = str3;
        }
        if ((i & 8) == 0) {
            this.quoteAmount = AudioStats.AUDIO_AMPLITUDE_NONE;
        } else {
            this.quoteAmount = d;
        }
        if ((i & 16) == 0) {
            this.baseAmount = AudioStats.AUDIO_AMPLITUDE_NONE;
        } else {
            this.baseAmount = d2;
        }
        if ((i & 32) == 0) {
            this.businessType = "";
        } else {
            this.businessType = str4;
        }
        if ((i & 64) == 0) {
            this.channelId = "";
        } else {
            this.channelId = str5;
        }
        if ((i & 128) == 0) {
            this.requestId = UUID.randomUUID().toString();
        } else {
            this.requestId = str6;
        }
        if ((i & 256) == 0) {
            this.authenticationType = "";
        } else {
            this.authenticationType = str7;
        }
        if ((i & 512) == 0) {
            this.authenticationParams = new AuthenticationParams((String) null, 1, (DefaultConstructorMarker) null);
        } else {
            this.authenticationParams = authenticationParams;
        }
    }

    public static final /* synthetic */ void write$Self$OKPayments_ok_payment_api(SubmitTopUpOrderReq submitTopUpOrderReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) submitTopUpOrderReq.quoteToken, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, submitTopUpOrderReq.quoteToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) submitTopUpOrderReq.quoteCurrency, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, submitTopUpOrderReq.quoteCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) submitTopUpOrderReq.baseCurrency, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, submitTopUpOrderReq.baseCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || Double.compare(submitTopUpOrderReq.quoteAmount, AudioStats.AUDIO_AMPLITUDE_NONE) != 0) {
            compositeEncoder.encodeDoubleElement(serialDescriptor, 3, submitTopUpOrderReq.quoteAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || Double.compare(submitTopUpOrderReq.baseAmount, AudioStats.AUDIO_AMPLITUDE_NONE) != 0) {
            compositeEncoder.encodeDoubleElement(serialDescriptor, 4, submitTopUpOrderReq.baseAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) submitTopUpOrderReq.businessType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, submitTopUpOrderReq.businessType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) submitTopUpOrderReq.channelId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, submitTopUpOrderReq.channelId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) submitTopUpOrderReq.requestId, (Object) UUID.randomUUID().toString())) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, submitTopUpOrderReq.requestId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) submitTopUpOrderReq.authenticationType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, submitTopUpOrderReq.authenticationType);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) && Intrinsics.EZpvd(submitTopUpOrderReq.authenticationParams, new AuthenticationParams((String) null, 1, (DefaultConstructorMarker) null))) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 9, AuthenticationParams$$serializer.INSTANCE, submitTopUpOrderReq.authenticationParams);
    }

    public SubmitTopUpOrderReq(@NotNull String str, @NotNull String str2, @NotNull String str3, double d, double d2, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull AuthenticationParams authenticationParams) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(authenticationParams, "");
        this.quoteToken = str;
        this.quoteCurrency = str2;
        this.baseCurrency = str3;
        this.quoteAmount = d;
        this.baseAmount = d2;
        this.businessType = str4;
        this.channelId = str5;
        this.requestId = str6;
        this.authenticationType = str7;
        this.authenticationParams = authenticationParams;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0075: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r27v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r27v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r27v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:double:?: TERNARY null = ((wrap:int:0x001b: ARITH (r27v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0.0d double) : (r18v0 double))
  (wrap:double:?: TERNARY null = ((wrap:int:0x0025: ARITH (r27v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r20v0 double) : (wrap:double:0x001d: SGET  A[WRAPPED] androidx.camera.video.AudioStats.AUDIO_AMPLITUDE_NONE double))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r27v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r27v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r27v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0044: INVOKE 
  (wrap:java.util.UUID:0x0040: INVOKE  STATIC call: java.util.UUID.randomUUID():java.util.UUID A[MD:():java.util.UUID (c), WRAPPED] (LINE:83))
 VIRTUAL call: java.util.UUID.toString():java.lang.String A[MD:():java.lang.String (c), WRAPPED] (LINE:83)) : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004b: ARITH (r27v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r25v0 java.lang.String) : (""))
  (wrap:com.okinc.okpaymentapi.data.remote.model.experience.AuthenticationParams:?: TERNARY null = ((wrap:int:0x0052: ARITH (r27v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x005a: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (1 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:85) call: com.okinc.okpaymentapi.data.remote.model.experience.AuthenticationParams.<init>(java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r26v0 com.okinc.okpaymentapi.data.remote.model.experience.AuthenticationParams))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, double, double, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.okpaymentapi.data.remote.model.experience.AuthenticationParams):void (m)] (LINE:75) call: com.okinc.okpaymentapi.data.remote.model.experience.SubmitTopUpOrderReq.<init>(java.lang.String, java.lang.String, java.lang.String, double, double, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.okpaymentapi.data.remote.model.experience.AuthenticationParams):void type: THIS */
    public /* synthetic */ SubmitTopUpOrderReq(String str, String str2, String str3, double d, double d2, String str4, String str5, String str6, String str7, AuthenticationParams authenticationParams, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? 0.0d : d, (i & 16) == 0 ? d2 : AudioStats.AUDIO_AMPLITUDE_NONE, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? "" : str5, (i & 128) != 0 ? UUID.randomUUID().toString() : str6, (i & 256) == 0 ? str7 : "", (i & 512) != 0 ? new AuthenticationParams((String) null, 1, (DefaultConstructorMarker) null) : authenticationParams);
    }
}
