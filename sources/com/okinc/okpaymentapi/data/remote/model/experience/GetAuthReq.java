package com.okinc.okpaymentapi.data.remote.model.experience;

import androidx.camera.video.AudioStats;
import com.okinc.okpaymentapi.data.remote.model.management.TradeType;
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
public final class GetAuthReq {
    private double baseAmount;
    private String baseCurrency;
    private String businessType;
    private double quoteAmount;
    private String quoteCurrency;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public GetAuthReq() {
        this(AudioStats.AUDIO_AMPLITUDE_NONE, AudioStats.AUDIO_AMPLITUDE_NONE, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double component1() {
        return this.baseAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double component2() {
        return this.quoteAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.baseCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.quoteCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.businessType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GetAuthReq copy(double d, double d2, @NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new GetAuthReq(d, d2, str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetAuthReq)) {
            return false;
        }
        GetAuthReq getAuthReq = (GetAuthReq) obj;
        return Double.compare(this.baseAmount, getAuthReq.baseAmount) == 0 && Double.compare(this.quoteAmount, getAuthReq.quoteAmount) == 0 && Intrinsics.EZpvd((Object) this.baseCurrency, (Object) getAuthReq.baseCurrency) && Intrinsics.EZpvd((Object) this.quoteCurrency, (Object) getAuthReq.quoteCurrency) && Intrinsics.EZpvd((Object) this.businessType, (Object) getAuthReq.businessType);
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
    public final double getQuoteAmount() {
        return this.quoteAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteCurrency() {
        return this.quoteCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((Double.hashCode(this.baseAmount) * 31) + Double.hashCode(this.quoteAmount)) * 31) + this.baseCurrency.hashCode()) * 31) + this.quoteCurrency.hashCode()) * 31) + this.businessType.hashCode();
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
    public final void setQuoteAmount(double d) {
        this.quoteAmount = d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuoteCurrency(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.quoteCurrency = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GetAuthReq(baseAmount=" + this.baseAmount + ", quoteAmount=" + this.quoteAmount + ", baseCurrency=" + this.baseCurrency + ", quoteCurrency=" + this.quoteCurrency + ", businessType=" + this.businessType + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okpaymentapi.data.remote.model.experience.GetAuthReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GetAuthReq> serializer() {
            return GetAuthReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GetAuthReq(int i, double d, double d2, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.baseAmount = AudioStats.AUDIO_AMPLITUDE_NONE;
        } else {
            this.baseAmount = d;
        }
        if ((i & 2) == 0) {
            this.quoteAmount = AudioStats.AUDIO_AMPLITUDE_NONE;
        } else {
            this.quoteAmount = d2;
        }
        if ((i & 4) == 0) {
            this.baseCurrency = "";
        } else {
            this.baseCurrency = str;
        }
        if ((i & 8) == 0) {
            this.quoteCurrency = "";
        } else {
            this.quoteCurrency = str2;
        }
        if ((i & 16) == 0) {
            this.businessType = TradeType.TOPUP.getType();
        } else {
            this.businessType = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKPayments_ok_payment_api(GetAuthReq getAuthReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || Double.compare(getAuthReq.baseAmount, AudioStats.AUDIO_AMPLITUDE_NONE) != 0) {
            compositeEncoder.encodeDoubleElement(serialDescriptor, 0, getAuthReq.baseAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || Double.compare(getAuthReq.quoteAmount, AudioStats.AUDIO_AMPLITUDE_NONE) != 0) {
            compositeEncoder.encodeDoubleElement(serialDescriptor, 1, getAuthReq.quoteAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) getAuthReq.baseCurrency, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, getAuthReq.baseCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) getAuthReq.quoteCurrency, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, getAuthReq.quoteCurrency);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && Intrinsics.EZpvd((Object) getAuthReq.businessType, (Object) TradeType.TOPUP.getType())) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 4, getAuthReq.businessType);
    }

    public GetAuthReq(double d, double d2, @NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.baseAmount = d;
        this.quoteAmount = d2;
        this.baseCurrency = str;
        this.quoteCurrency = str2;
        this.businessType = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002f: CONSTRUCTOR 
  (wrap:double:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0.0d double) : (r6v0 double))
  (wrap:double:?: TERNARY null = ((wrap:int:0x0009: ARITH (r13v0 int) & (2 int) A[WRAPPED]) == (0 int)) ? (r8v0 double) : (wrap:double:0x0002: SGET  A[WRAPPED] androidx.camera.video.AudioStats.AUDIO_AMPLITUDE_NONE double))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.String:0x0025: INVOKE 
  (wrap:com.okinc.okpaymentapi.data.remote.model.management.TradeType:0x0023: SGET  A[WRAPPED] (LINE:14) com.okinc.okpaymentapi.data.remote.model.management.TradeType.TOPUP com.okinc.okpaymentapi.data.remote.model.management.TradeType)
 VIRTUAL call: com.okinc.okpaymentapi.data.remote.model.management.TradeType.getType():java.lang.String A[MD:():java.lang.String (m), WRAPPED] (LINE:14)) : (r12v0 java.lang.String))
 A[MD:(double, double, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:9) call: com.okinc.okpaymentapi.data.remote.model.experience.GetAuthReq.<init>(double, double, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ GetAuthReq(double d, double d2, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0d : d, (i & 2) == 0 ? d2 : AudioStats.AUDIO_AMPLITUDE_NONE, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? TradeType.TOPUP.getType() : str3);
    }
}
