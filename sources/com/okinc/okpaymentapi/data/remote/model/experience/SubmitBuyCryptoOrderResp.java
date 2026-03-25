package com.okinc.okpaymentapi.data.remote.model.experience;

import androidx.camera.video.AudioStats;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class SubmitBuyCryptoOrderResp {
    private BuyCryptoMetaData metaData;
    private double totalPaidAmount;
    private String totalPaidCurrency;
    private UserInfoQR userInfo;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SubmitBuyCryptoOrderResp copy$default(SubmitBuyCryptoOrderResp submitBuyCryptoOrderResp, double d, String str, BuyCryptoMetaData buyCryptoMetaData, UserInfoQR userInfoQR, int i, Object obj) {
        if ((i & 1) != 0) {
            d = submitBuyCryptoOrderResp.totalPaidAmount;
        }
        double d2 = d;
        if ((i & 2) != 0) {
            str = submitBuyCryptoOrderResp.totalPaidCurrency;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            buyCryptoMetaData = submitBuyCryptoOrderResp.metaData;
        }
        BuyCryptoMetaData buyCryptoMetaData2 = buyCryptoMetaData;
        if ((i & 8) != 0) {
            userInfoQR = submitBuyCryptoOrderResp.userInfo;
        }
        return submitBuyCryptoOrderResp.copy(d2, str2, buyCryptoMetaData2, userInfoQR);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double component1() {
        return this.totalPaidAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.totalPaidCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BuyCryptoMetaData component3() {
        return this.metaData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UserInfoQR component4() {
        return this.userInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SubmitBuyCryptoOrderResp copy(double d, @NotNull String str, BuyCryptoMetaData buyCryptoMetaData, @NotNull UserInfoQR userInfoQR) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(userInfoQR, "");
        return new SubmitBuyCryptoOrderResp(d, str, buyCryptoMetaData, userInfoQR);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubmitBuyCryptoOrderResp)) {
            return false;
        }
        SubmitBuyCryptoOrderResp submitBuyCryptoOrderResp = (SubmitBuyCryptoOrderResp) obj;
        return Double.compare(this.totalPaidAmount, submitBuyCryptoOrderResp.totalPaidAmount) == 0 && Intrinsics.EZpvd((Object) this.totalPaidCurrency, (Object) submitBuyCryptoOrderResp.totalPaidCurrency) && Intrinsics.EZpvd(this.metaData, submitBuyCryptoOrderResp.metaData) && Intrinsics.EZpvd(this.userInfo, submitBuyCryptoOrderResp.userInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BuyCryptoMetaData getMetaData() {
        return this.metaData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double getTotalPaidAmount() {
        return this.totalPaidAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalPaidCurrency() {
        return this.totalPaidCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UserInfoQR getUserInfo() {
        return this.userInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Double.hashCode(this.totalPaidAmount);
        int iHashCode2 = this.totalPaidCurrency.hashCode();
        BuyCryptoMetaData buyCryptoMetaData = this.metaData;
        return (((((iHashCode * 31) + iHashCode2) * 31) + (buyCryptoMetaData == null ? 0 : buyCryptoMetaData.hashCode())) * 31) + this.userInfo.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMetaData(BuyCryptoMetaData buyCryptoMetaData) {
        this.metaData = buyCryptoMetaData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTotalPaidAmount(double d) {
        this.totalPaidAmount = d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTotalPaidCurrency(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.totalPaidCurrency = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUserInfo(@NotNull UserInfoQR userInfoQR) {
        Intrinsics.checkNotNullParameter(userInfoQR, "");
        this.userInfo = userInfoQR;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SubmitBuyCryptoOrderResp(totalPaidAmount=" + this.totalPaidAmount + ", totalPaidCurrency=" + this.totalPaidCurrency + ", metaData=" + this.metaData + ", userInfo=" + this.userInfo + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okpaymentapi.data.remote.model.experience.SubmitBuyCryptoOrderResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SubmitBuyCryptoOrderResp> serializer() {
            return SubmitBuyCryptoOrderResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SubmitBuyCryptoOrderResp(int i, double d, String str, BuyCryptoMetaData buyCryptoMetaData, UserInfoQR userInfoQR, SerializationConstructorMarker serializationConstructorMarker) {
        if (8 != (i & 8)) {
            PluginExceptionsKt.throwMissingFieldException(i, 8, SubmitBuyCryptoOrderResp$$serializer.INSTANCE.getDescriptor());
        }
        this.totalPaidAmount = (i & 1) == 0 ? AudioStats.AUDIO_AMPLITUDE_NONE : d;
        if ((i & 2) == 0) {
            this.totalPaidCurrency = "";
        } else {
            this.totalPaidCurrency = str;
        }
        if ((i & 4) == 0) {
            this.metaData = null;
        } else {
            this.metaData = buyCryptoMetaData;
        }
        this.userInfo = userInfoQR;
    }

    public static final /* synthetic */ void write$Self$OKPayments_ok_payment_api(SubmitBuyCryptoOrderResp submitBuyCryptoOrderResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || Double.compare(submitBuyCryptoOrderResp.totalPaidAmount, AudioStats.AUDIO_AMPLITUDE_NONE) != 0) {
            compositeEncoder.encodeDoubleElement(serialDescriptor, 0, submitBuyCryptoOrderResp.totalPaidAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) submitBuyCryptoOrderResp.totalPaidCurrency, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, submitBuyCryptoOrderResp.totalPaidCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || submitBuyCryptoOrderResp.metaData != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, BuyCryptoMetaData$$serializer.INSTANCE, submitBuyCryptoOrderResp.metaData);
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, UserInfoQR$$serializer.INSTANCE, submitBuyCryptoOrderResp.userInfo);
    }

    public SubmitBuyCryptoOrderResp(double d, @NotNull String str, BuyCryptoMetaData buyCryptoMetaData, @NotNull UserInfoQR userInfoQR) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(userInfoQR, "");
        this.totalPaidAmount = d;
        this.totalPaidCurrency = str;
        this.metaData = buyCryptoMetaData;
        this.userInfo = userInfoQR;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:double:0x0006: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:double:0x0004: SGET  A[WRAPPED] androidx.camera.video.AudioStats.AUDIO_AMPLITUDE_NONE double) : (r7v0 double))
  (wrap:java.lang.String:0x000d: TERNARY null = ((wrap:int:0x0007: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:com.okinc.okpaymentapi.data.remote.model.experience.BuyCryptoMetaData:?: TERNARY null = ((wrap:int:0x000e: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okpaymentapi.data.remote.model.experience.BuyCryptoMetaData) : (r10v0 com.okinc.okpaymentapi.data.remote.model.experience.BuyCryptoMetaData))
  (r11v0 com.okinc.okpaymentapi.data.remote.model.experience.UserInfoQR)
 A[MD:(double, java.lang.String, com.okinc.okpaymentapi.data.remote.model.experience.BuyCryptoMetaData, com.okinc.okpaymentapi.data.remote.model.experience.UserInfoQR):void (m)] (LINE:158) call: com.okinc.okpaymentapi.data.remote.model.experience.SubmitBuyCryptoOrderResp.<init>(double, java.lang.String, com.okinc.okpaymentapi.data.remote.model.experience.BuyCryptoMetaData, com.okinc.okpaymentapi.data.remote.model.experience.UserInfoQR):void type: THIS */
    public /* synthetic */ SubmitBuyCryptoOrderResp(double d, String str, BuyCryptoMetaData buyCryptoMetaData, UserInfoQR userInfoQR, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? AudioStats.AUDIO_AMPLITUDE_NONE : d, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : buyCryptoMetaData, userInfoQR);
    }
}
