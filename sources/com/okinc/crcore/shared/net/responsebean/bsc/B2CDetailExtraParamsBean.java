package com.okinc.crcore.shared.net.responsebean.bsc;

import com.okinc.crcore.coreapi.net.responsebean.bsc.B2CDetailExtraParamsResponseBean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class B2CDetailExtraParamsBean {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String appVersion;
    private final String feePercent;
    private final String qr;
    private final String transferTo;
    private final String usdFee;
    private final String usdQuoteAmount;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public B2CDetailExtraParamsBean() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ B2CDetailExtraParamsBean copy$default(B2CDetailExtraParamsBean b2CDetailExtraParamsBean, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = b2CDetailExtraParamsBean.appVersion;
        }
        if ((i & 2) != 0) {
            str2 = b2CDetailExtraParamsBean.feePercent;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = b2CDetailExtraParamsBean.usdQuoteAmount;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = b2CDetailExtraParamsBean.usdFee;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = b2CDetailExtraParamsBean.transferTo;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = b2CDetailExtraParamsBean.qr;
        }
        return b2CDetailExtraParamsBean.copy(str, str7, str8, str9, str10, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.appVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.feePercent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.usdQuoteAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.usdFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.transferTo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.qr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final B2CDetailExtraParamsBean copy(String str, String str2, String str3, String str4, String str5, String str6) {
        return new B2CDetailExtraParamsBean(str, str2, str3, str4, str5, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B2CDetailExtraParamsBean)) {
            return false;
        }
        B2CDetailExtraParamsBean b2CDetailExtraParamsBean = (B2CDetailExtraParamsBean) obj;
        return Intrinsics.EZpvd((Object) this.appVersion, (Object) b2CDetailExtraParamsBean.appVersion) && Intrinsics.EZpvd((Object) this.feePercent, (Object) b2CDetailExtraParamsBean.feePercent) && Intrinsics.EZpvd((Object) this.usdQuoteAmount, (Object) b2CDetailExtraParamsBean.usdQuoteAmount) && Intrinsics.EZpvd((Object) this.usdFee, (Object) b2CDetailExtraParamsBean.usdFee) && Intrinsics.EZpvd((Object) this.transferTo, (Object) b2CDetailExtraParamsBean.transferTo) && Intrinsics.EZpvd((Object) this.qr, (Object) b2CDetailExtraParamsBean.qr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAppVersion() {
        return this.appVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFeePercent() {
        return this.feePercent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQr() {
        return this.qr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTransferTo() {
        return this.transferTo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUsdFee() {
        return this.usdFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUsdQuoteAmount() {
        return this.usdQuoteAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.appVersion;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.feePercent;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.usdQuoteAmount;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.usdFee;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.transferTo;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.qr;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str6 != null ? str6.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "B2CDetailExtraParamsBean(appVersion=" + this.appVersion + ", feePercent=" + this.feePercent + ", usdQuoteAmount=" + this.usdQuoteAmount + ", usdFee=" + this.usdFee + ", transferTo=" + this.transferTo + ", qr=" + this.qr + ")";
    }

    public /* synthetic */ B2CDetailExtraParamsBean(int i, String str, String str2, String str3, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.appVersion = null;
        } else {
            this.appVersion = str;
        }
        if ((i & 2) == 0) {
            this.feePercent = null;
        } else {
            this.feePercent = str2;
        }
        if ((i & 4) == 0) {
            this.usdQuoteAmount = null;
        } else {
            this.usdQuoteAmount = str3;
        }
        if ((i & 8) == 0) {
            this.usdFee = null;
        } else {
            this.usdFee = str4;
        }
        if ((i & 16) == 0) {
            this.transferTo = null;
        } else {
            this.transferTo = str5;
        }
        if ((i & 32) == 0) {
            this.qr = null;
        } else {
            this.qr = str6;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(B2CDetailExtraParamsBean b2CDetailExtraParamsBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || b2CDetailExtraParamsBean.appVersion != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, b2CDetailExtraParamsBean.appVersion);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || b2CDetailExtraParamsBean.feePercent != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, b2CDetailExtraParamsBean.feePercent);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || b2CDetailExtraParamsBean.usdQuoteAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, b2CDetailExtraParamsBean.usdQuoteAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || b2CDetailExtraParamsBean.usdFee != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, b2CDetailExtraParamsBean.usdFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || b2CDetailExtraParamsBean.transferTo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, b2CDetailExtraParamsBean.transferTo);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && b2CDetailExtraParamsBean.qr == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, b2CDetailExtraParamsBean.qr);
    }

    public B2CDetailExtraParamsBean(String str, String str2, String str3, String str4, String str5, String str6) {
        this.appVersion = str;
        this.feePercent = str2;
        this.usdQuoteAmount = str3;
        this.usdFee = str4;
        this.transferTo = str5;
        this.qr = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:363) call: com.okinc.crcore.shared.net.responsebean.bsc.B2CDetailExtraParamsBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ B2CDetailExtraParamsBean(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.shared.net.responsebean.bsc.B2CDetailExtraParamsBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<B2CDetailExtraParamsBean> serializer() {
            return B2CDetailExtraParamsBean$$serializer.INSTANCE;
        }

        public final B2CDetailExtraParamsBean KWHzl(@NotNull B2CDetailExtraParamsResponseBean b2CDetailExtraParamsResponseBean) {
            Intrinsics.checkNotNullParameter(b2CDetailExtraParamsResponseBean, "");
            return new B2CDetailExtraParamsBean(b2CDetailExtraParamsResponseBean.getAppVersion(), b2CDetailExtraParamsResponseBean.getFeePercent(), b2CDetailExtraParamsResponseBean.getUsdQuoteAmount(), b2CDetailExtraParamsResponseBean.getUsdFee(), b2CDetailExtraParamsResponseBean.getTransferTo(), b2CDetailExtraParamsResponseBean.getQr());
        }
    }
}
