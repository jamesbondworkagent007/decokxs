package com.okinc.okpaymentapi.data.remote.model.experience;

import androidx.camera.video.AudioStats;
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
public final class GetFiatAuthReq {
    private double quoteAmount;
    private String quoteCurrency;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public GetFiatAuthReq() {
        this(AudioStats.AUDIO_AMPLITUDE_NONE, (String) null, 3, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ GetFiatAuthReq copy$default(GetFiatAuthReq getFiatAuthReq, double d, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            d = getFiatAuthReq.quoteAmount;
        }
        if ((i & 2) != 0) {
            str = getFiatAuthReq.quoteCurrency;
        }
        return getFiatAuthReq.copy(d, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double component1() {
        return this.quoteAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.quoteCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GetFiatAuthReq copy(double d, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new GetFiatAuthReq(d, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetFiatAuthReq)) {
            return false;
        }
        GetFiatAuthReq getFiatAuthReq = (GetFiatAuthReq) obj;
        return Double.compare(this.quoteAmount, getFiatAuthReq.quoteAmount) == 0 && Intrinsics.EZpvd((Object) this.quoteCurrency, (Object) getFiatAuthReq.quoteCurrency);
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
        return (Double.hashCode(this.quoteAmount) * 31) + this.quoteCurrency.hashCode();
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
        return "GetFiatAuthReq(quoteAmount=" + this.quoteAmount + ", quoteCurrency=" + this.quoteCurrency + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okpaymentapi.data.remote.model.experience.GetFiatAuthReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GetFiatAuthReq> serializer() {
            return GetFiatAuthReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GetFiatAuthReq(int i, double d, String str, SerializationConstructorMarker serializationConstructorMarker) {
        this.quoteAmount = (i & 1) == 0 ? AudioStats.AUDIO_AMPLITUDE_NONE : d;
        if ((i & 2) == 0) {
            this.quoteCurrency = "";
        } else {
            this.quoteCurrency = str;
        }
    }

    public static final /* synthetic */ void write$Self$OKPayments_ok_payment_api(GetFiatAuthReq getFiatAuthReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || Double.compare(getFiatAuthReq.quoteAmount, AudioStats.AUDIO_AMPLITUDE_NONE) != 0) {
            compositeEncoder.encodeDoubleElement(serialDescriptor, 0, getFiatAuthReq.quoteAmount);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd((Object) getFiatAuthReq.quoteCurrency, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 1, getFiatAuthReq.quoteCurrency);
    }

    public GetFiatAuthReq(double d, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.quoteAmount = d;
        this.quoteCurrency = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:double:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:double:0x0004: SGET  A[WRAPPED] androidx.camera.video.AudioStats.AUDIO_AMPLITUDE_NONE double) : (r1v0 double))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
 A[MD:(double, java.lang.String):void (m)] (LINE:32) call: com.okinc.okpaymentapi.data.remote.model.experience.GetFiatAuthReq.<init>(double, java.lang.String):void type: THIS */
    public /* synthetic */ GetFiatAuthReq(double d, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? AudioStats.AUDIO_AMPLITUDE_NONE : d, (i & 2) != 0 ? "" : str);
    }
}
