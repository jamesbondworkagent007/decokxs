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
public final class SubmitTopUpOrderResp {
    private double baseAmount;
    private String baseCurrency;
    private final boolean isPollingNeeded;
    private String orderNo;
    private String status;
    private String subTitle;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SubmitTopUpOrderResp() {
        this((String) null, (String) null, AudioStats.AUDIO_AMPLITUDE_NONE, (String) null, (String) null, false, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SubmitTopUpOrderResp copy$default(SubmitTopUpOrderResp submitTopUpOrderResp, String str, String str2, double d, String str3, String str4, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = submitTopUpOrderResp.status;
        }
        if ((i & 2) != 0) {
            str2 = submitTopUpOrderResp.subTitle;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            d = submitTopUpOrderResp.baseAmount;
        }
        double d2 = d;
        if ((i & 8) != 0) {
            str3 = submitTopUpOrderResp.baseCurrency;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            str4 = submitTopUpOrderResp.orderNo;
        }
        String str7 = str4;
        if ((i & 32) != 0) {
            z = submitTopUpOrderResp.isPollingNeeded;
        }
        return submitTopUpOrderResp.copy(str, str5, d2, str6, str7, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.subTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double component3() {
        return this.baseAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.baseCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.orderNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component6() {
        return this.isPollingNeeded;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SubmitTopUpOrderResp copy(@NotNull String str, @NotNull String str2, double d, @NotNull String str3, @NotNull String str4, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new SubmitTopUpOrderResp(str, str2, d, str3, str4, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubmitTopUpOrderResp)) {
            return false;
        }
        SubmitTopUpOrderResp submitTopUpOrderResp = (SubmitTopUpOrderResp) obj;
        return Intrinsics.EZpvd((Object) this.status, (Object) submitTopUpOrderResp.status) && Intrinsics.EZpvd((Object) this.subTitle, (Object) submitTopUpOrderResp.subTitle) && Double.compare(this.baseAmount, submitTopUpOrderResp.baseAmount) == 0 && Intrinsics.EZpvd((Object) this.baseCurrency, (Object) submitTopUpOrderResp.baseCurrency) && Intrinsics.EZpvd((Object) this.orderNo, (Object) submitTopUpOrderResp.orderNo) && this.isPollingNeeded == submitTopUpOrderResp.isPollingNeeded;
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
    public final String getOrderNo() {
        return this.orderNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSubTitle() {
        return this.subTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.status.hashCode() * 31) + this.subTitle.hashCode()) * 31) + Double.hashCode(this.baseAmount)) * 31) + this.baseCurrency.hashCode()) * 31) + this.orderNo.hashCode()) * 31) + Boolean.hashCode(this.isPollingNeeded);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isPollingNeeded() {
        return this.isPollingNeeded;
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
    public final void setOrderNo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.orderNo = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStatus(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.status = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSubTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.subTitle = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SubmitTopUpOrderResp(status=" + this.status + ", subTitle=" + this.subTitle + ", baseAmount=" + this.baseAmount + ", baseCurrency=" + this.baseCurrency + ", orderNo=" + this.orderNo + ", isPollingNeeded=" + this.isPollingNeeded + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okpaymentapi.data.remote.model.experience.SubmitTopUpOrderResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SubmitTopUpOrderResp> serializer() {
            return SubmitTopUpOrderResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SubmitTopUpOrderResp(int i, String str, String str2, double d, String str3, String str4, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.status = "";
        } else {
            this.status = str;
        }
        if ((i & 2) == 0) {
            this.subTitle = "";
        } else {
            this.subTitle = str2;
        }
        if ((i & 4) == 0) {
            this.baseAmount = AudioStats.AUDIO_AMPLITUDE_NONE;
        } else {
            this.baseAmount = d;
        }
        if ((i & 8) == 0) {
            this.baseCurrency = "";
        } else {
            this.baseCurrency = str3;
        }
        if ((i & 16) == 0) {
            this.orderNo = "";
        } else {
            this.orderNo = str4;
        }
        if ((i & 32) == 0) {
            this.isPollingNeeded = false;
        } else {
            this.isPollingNeeded = z;
        }
    }

    public static final /* synthetic */ void write$Self$OKPayments_ok_payment_api(SubmitTopUpOrderResp submitTopUpOrderResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) submitTopUpOrderResp.status, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, submitTopUpOrderResp.status);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) submitTopUpOrderResp.subTitle, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, submitTopUpOrderResp.subTitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || Double.compare(submitTopUpOrderResp.baseAmount, AudioStats.AUDIO_AMPLITUDE_NONE) != 0) {
            compositeEncoder.encodeDoubleElement(serialDescriptor, 2, submitTopUpOrderResp.baseAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) submitTopUpOrderResp.baseCurrency, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, submitTopUpOrderResp.baseCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) submitTopUpOrderResp.orderNo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, submitTopUpOrderResp.orderNo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || submitTopUpOrderResp.isPollingNeeded) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 5, submitTopUpOrderResp.isPollingNeeded);
        }
    }

    public SubmitTopUpOrderResp(@NotNull String str, @NotNull String str2, double d, @NotNull String str3, @NotNull String str4, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.status = str;
        this.subTitle = str2;
        this.baseAmount = d;
        this.baseCurrency = str3;
        this.orderNo = str4;
        this.isPollingNeeded = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0030: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:double:0x0016: TERNARY null = ((wrap:int:0x0010: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:double:0x0014: SGET  A[WRAPPED] androidx.camera.video.AudioStats.AUDIO_AMPLITUDE_NONE double) : (r8v0 double))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r13v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r11v0 java.lang.String) : (""))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0024: ARITH (r13v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r12v0 boolean))
 A[MD:(java.lang.String, java.lang.String, double, java.lang.String, java.lang.String, boolean):void (m)] (LINE:146) call: com.okinc.okpaymentapi.data.remote.model.experience.SubmitTopUpOrderResp.<init>(java.lang.String, java.lang.String, double, java.lang.String, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ SubmitTopUpOrderResp(String str, String str2, double d, String str3, String str4, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? AudioStats.AUDIO_AMPLITUDE_NONE : d, (i & 8) != 0 ? "" : str3, (i & 16) == 0 ? str4 : "", (i & 32) != 0 ? false : z);
    }
}
