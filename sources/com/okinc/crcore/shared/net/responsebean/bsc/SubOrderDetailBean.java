package com.okinc.crcore.shared.net.responsebean.bsc;

import androidx.camera.video.AudioStats;
import com.okinc.crcore.coreapi.net.responsebean.bsc.LocalizedNetworkInfoResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.bsc.SubOrderDetailResponseBean;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C56403yEb;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class SubOrderDetailBean {
    private final double baseAmount;
    private final String baseCurrency;
    private final String baseCurrencyNightUrl;
    private final String baseCurrencyUrl;
    private final boolean clickable;
    private final long createDate;
    private final String displayName;
    private final String displayTitle;
    private final List<LocalizedNetworkInfoBean> localizedNetworkInfo;
    private final String orderNo;
    private final String paymentMethod;
    private final String paymentMethodNightUrl;
    private final String paymentMethodUrl;
    private final double quoteAmount;
    private final String quoteCurrency;
    private final int status;
    private final String tradeType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(LocalizedNetworkInfoBean$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SubOrderDetailBean() {
        this(0, AudioStats.AUDIO_AMPLITUDE_NONE, (String) null, (String) null, (String) null, AudioStats.AUDIO_AMPLITUDE_NONE, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, 0L, (List) null, 131071, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component10() {
        return this.clickable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.displayName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.paymentMethodUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.paymentMethodNightUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.quoteCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.orderNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component16() {
        return this.createDate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<LocalizedNetworkInfoBean> component17() {
        return this.localizedNetworkInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double component2() {
        return this.baseAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.baseCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.baseCurrencyUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.baseCurrencyNightUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double component6() {
        return this.quoteAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.tradeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.paymentMethod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.displayTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SubOrderDetailBean copy(int i, double d, @NotNull String str, @NotNull String str2, @NotNull String str3, double d2, @NotNull String str4, @NotNull String str5, @NotNull String str6, boolean z, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, long j, List<LocalizedNetworkInfoBean> list) {
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
        return new SubOrderDetailBean(i, d, str, str2, str3, d2, str4, str5, str6, z, str7, str8, str9, str10, str11, j, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubOrderDetailBean)) {
            return false;
        }
        SubOrderDetailBean subOrderDetailBean = (SubOrderDetailBean) obj;
        return this.status == subOrderDetailBean.status && Double.compare(this.baseAmount, subOrderDetailBean.baseAmount) == 0 && Intrinsics.EZpvd((Object) this.baseCurrency, (Object) subOrderDetailBean.baseCurrency) && Intrinsics.EZpvd((Object) this.baseCurrencyUrl, (Object) subOrderDetailBean.baseCurrencyUrl) && Intrinsics.EZpvd((Object) this.baseCurrencyNightUrl, (Object) subOrderDetailBean.baseCurrencyNightUrl) && Double.compare(this.quoteAmount, subOrderDetailBean.quoteAmount) == 0 && Intrinsics.EZpvd((Object) this.tradeType, (Object) subOrderDetailBean.tradeType) && Intrinsics.EZpvd((Object) this.paymentMethod, (Object) subOrderDetailBean.paymentMethod) && Intrinsics.EZpvd((Object) this.displayTitle, (Object) subOrderDetailBean.displayTitle) && this.clickable == subOrderDetailBean.clickable && Intrinsics.EZpvd((Object) this.displayName, (Object) subOrderDetailBean.displayName) && Intrinsics.EZpvd((Object) this.paymentMethodUrl, (Object) subOrderDetailBean.paymentMethodUrl) && Intrinsics.EZpvd((Object) this.paymentMethodNightUrl, (Object) subOrderDetailBean.paymentMethodNightUrl) && Intrinsics.EZpvd((Object) this.quoteCurrency, (Object) subOrderDetailBean.quoteCurrency) && Intrinsics.EZpvd((Object) this.orderNo, (Object) subOrderDetailBean.orderNo) && this.createDate == subOrderDetailBean.createDate && Intrinsics.EZpvd(this.localizedNetworkInfo, subOrderDetailBean.localizedNetworkInfo);
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
    public final String getBaseCurrencyNightUrl() {
        return this.baseCurrencyNightUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseCurrencyUrl() {
        return this.baseCurrencyUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getClickable() {
        return this.clickable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getCreateDate() {
        return this.createDate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayTitle() {
        return this.displayTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<LocalizedNetworkInfoBean> getLocalizedNetworkInfo() {
        return this.localizedNetworkInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderNo() {
        return this.orderNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPaymentMethod() {
        return this.paymentMethod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPaymentMethodNightUrl() {
        return this.paymentMethodNightUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPaymentMethodUrl() {
        return this.paymentMethodUrl;
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
    public final int getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradeType() {
        return this.tradeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.status);
        int iHashCode2 = Double.hashCode(this.baseAmount);
        int iHashCode3 = this.baseCurrency.hashCode();
        int iHashCode4 = this.baseCurrencyUrl.hashCode();
        int iHashCode5 = this.baseCurrencyNightUrl.hashCode();
        int iHashCode6 = Double.hashCode(this.quoteAmount);
        int iHashCode7 = this.tradeType.hashCode();
        int iHashCode8 = this.paymentMethod.hashCode();
        int iHashCode9 = this.displayTitle.hashCode();
        int iHashCode10 = Boolean.hashCode(this.clickable);
        int iHashCode11 = this.displayName.hashCode();
        int iHashCode12 = this.paymentMethodUrl.hashCode();
        int iHashCode13 = this.paymentMethodNightUrl.hashCode();
        int iHashCode14 = this.quoteCurrency.hashCode();
        int iHashCode15 = this.orderNo.hashCode();
        int iHashCode16 = Long.hashCode(this.createDate);
        List<LocalizedNetworkInfoBean> list = this.localizedNetworkInfo;
        return (((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + (list == null ? 0 : list.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SubOrderDetailBean(status=" + this.status + ", baseAmount=" + this.baseAmount + ", baseCurrency=" + this.baseCurrency + ", baseCurrencyUrl=" + this.baseCurrencyUrl + ", baseCurrencyNightUrl=" + this.baseCurrencyNightUrl + ", quoteAmount=" + this.quoteAmount + ", tradeType=" + this.tradeType + ", paymentMethod=" + this.paymentMethod + ", displayTitle=" + this.displayTitle + ", clickable=" + this.clickable + ", displayName=" + this.displayName + ", paymentMethodUrl=" + this.paymentMethodUrl + ", paymentMethodNightUrl=" + this.paymentMethodNightUrl + ", quoteCurrency=" + this.quoteCurrency + ", orderNo=" + this.orderNo + ", createDate=" + this.createDate + ", localizedNetworkInfo=" + this.localizedNetworkInfo + ")";
    }

    public /* synthetic */ SubOrderDetailBean(int i, int i2, double d, String str, String str2, String str3, double d2, String str4, String str5, String str6, boolean z, String str7, String str8, String str9, String str10, String str11, long j, List list, SerializationConstructorMarker serializationConstructorMarker) {
        this.status = (i & 1) == 0 ? -1 : i2;
        if ((i & 2) == 0) {
            this.baseAmount = AudioStats.AUDIO_AMPLITUDE_NONE;
        } else {
            this.baseAmount = d;
        }
        if ((i & 4) == 0) {
            this.baseCurrency = "";
        } else {
            this.baseCurrency = str;
        }
        if ((i & 8) == 0) {
            this.baseCurrencyUrl = "";
        } else {
            this.baseCurrencyUrl = str2;
        }
        if ((i & 16) == 0) {
            this.baseCurrencyNightUrl = "";
        } else {
            this.baseCurrencyNightUrl = str3;
        }
        if ((i & 32) == 0) {
            this.quoteAmount = AudioStats.AUDIO_AMPLITUDE_NONE;
        } else {
            this.quoteAmount = d2;
        }
        if ((i & 64) == 0) {
            this.tradeType = "";
        } else {
            this.tradeType = str4;
        }
        if ((i & 128) == 0) {
            this.paymentMethod = "";
        } else {
            this.paymentMethod = str5;
        }
        if ((i & 256) == 0) {
            this.displayTitle = "";
        } else {
            this.displayTitle = str6;
        }
        this.clickable = (i & 512) == 0 ? false : z;
        if ((i & 1024) == 0) {
            this.displayName = "";
        } else {
            this.displayName = str7;
        }
        if ((i & 2048) == 0) {
            this.paymentMethodUrl = "";
        } else {
            this.paymentMethodUrl = str8;
        }
        if ((i & 4096) == 0) {
            this.paymentMethodNightUrl = "";
        } else {
            this.paymentMethodNightUrl = str9;
        }
        if ((i & 8192) == 0) {
            this.quoteCurrency = "";
        } else {
            this.quoteCurrency = str10;
        }
        if ((i & 16384) == 0) {
            this.orderNo = "";
        } else {
            this.orderNo = str11;
        }
        this.createDate = (32768 & i) == 0 ? 0L : j;
        this.localizedNetworkInfo = (i & 65536) == 0 ? null : list;
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(SubOrderDetailBean subOrderDetailBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || subOrderDetailBean.status != -1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, subOrderDetailBean.status);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || Double.compare(subOrderDetailBean.baseAmount, AudioStats.AUDIO_AMPLITUDE_NONE) != 0) {
            compositeEncoder.encodeDoubleElement(serialDescriptor, 1, subOrderDetailBean.baseAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) subOrderDetailBean.baseCurrency, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, subOrderDetailBean.baseCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) subOrderDetailBean.baseCurrencyUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, subOrderDetailBean.baseCurrencyUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) subOrderDetailBean.baseCurrencyNightUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, subOrderDetailBean.baseCurrencyNightUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || Double.compare(subOrderDetailBean.quoteAmount, AudioStats.AUDIO_AMPLITUDE_NONE) != 0) {
            compositeEncoder.encodeDoubleElement(serialDescriptor, 5, subOrderDetailBean.quoteAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) subOrderDetailBean.tradeType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, subOrderDetailBean.tradeType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) subOrderDetailBean.paymentMethod, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, subOrderDetailBean.paymentMethod);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) subOrderDetailBean.displayTitle, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, subOrderDetailBean.displayTitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || subOrderDetailBean.clickable) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 9, subOrderDetailBean.clickable);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) subOrderDetailBean.displayName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, subOrderDetailBean.displayName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) subOrderDetailBean.paymentMethodUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, subOrderDetailBean.paymentMethodUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) subOrderDetailBean.paymentMethodNightUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, subOrderDetailBean.paymentMethodNightUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) subOrderDetailBean.quoteCurrency, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, subOrderDetailBean.quoteCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) subOrderDetailBean.orderNo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, subOrderDetailBean.orderNo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || subOrderDetailBean.createDate != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 15, subOrderDetailBean.createDate);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) && subOrderDetailBean.localizedNetworkInfo == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, kSerializerArr[16], subOrderDetailBean.localizedNetworkInfo);
    }

    public SubOrderDetailBean(int i, double d, @NotNull String str, @NotNull String str2, @NotNull String str3, double d2, @NotNull String str4, @NotNull String str5, @NotNull String str6, boolean z, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, long j, List<LocalizedNetworkInfoBean> list) {
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
        this.status = i;
        this.baseAmount = d;
        this.baseCurrency = str;
        this.baseCurrencyUrl = str2;
        this.baseCurrencyNightUrl = str3;
        this.quoteAmount = d2;
        this.tradeType = str4;
        this.paymentMethod = str5;
        this.displayTitle = str6;
        this.clickable = z;
        this.displayName = str7;
        this.paymentMethodUrl = str8;
        this.paymentMethodNightUrl = str9;
        this.quoteCurrency = str10;
        this.orderNo = str11;
        this.createDate = j;
        this.localizedNetworkInfo = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00c0: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0002: ARITH (r41v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r21v0 int))
  (wrap:double:?: TERNARY null = ((wrap:int:0x000a: ARITH (r41v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0.0d double) : (r22v0 double))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r41v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r41v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r41v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:double:?: TERNARY null = ((wrap:int:0x002e: ARITH (r41v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r27v0 double) : (wrap:double:0x000c: SGET  A[WRAPPED] androidx.camera.video.AudioStats.AUDIO_AMPLITUDE_NONE double))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0035: ARITH (r41v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003d: ARITH (r41v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0045: ARITH (r41v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x004d: ARITH (r41v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? false : (r32v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0055: ARITH (r41v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005d: ARITH (r41v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:java.lang.String:0x0070: TERNARY null = ((wrap:int:0x0067: ARITH (r41v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (wrap:java.lang.String:0x007b: TERNARY null = ((wrap:int:0x0072: ARITH (r41v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007d: ARITH (r41v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r37v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0089: ARITH (r41v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r38v0 long))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0094: ARITH (r41v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r40v0 java.util.List))
 A[MD:(int, double, java.lang.String, java.lang.String, java.lang.String, double, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, java.util.List<com.okinc.crcore.shared.net.responsebean.bsc.LocalizedNetworkInfoBean>):void (m)] (LINE:247) call: com.okinc.crcore.shared.net.responsebean.bsc.SubOrderDetailBean.<init>(int, double, java.lang.String, java.lang.String, java.lang.String, double, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, java.util.List):void type: THIS */
    public /* synthetic */ SubOrderDetailBean(int i, double d, String str, String str2, String str3, double d2, String str4, String str5, String str6, boolean z, String str7, String str8, String str9, String str10, String str11, long j, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? -1 : i, (i2 & 2) != 0 ? 0.0d : d, (i2 & 4) != 0 ? "" : str, (i2 & 8) != 0 ? "" : str2, (i2 & 16) != 0 ? "" : str3, (i2 & 32) == 0 ? d2 : AudioStats.AUDIO_AMPLITUDE_NONE, (i2 & 64) != 0 ? "" : str4, (i2 & 128) != 0 ? "" : str5, (i2 & 256) != 0 ? "" : str6, (i2 & 512) != 0 ? false : z, (i2 & 1024) != 0 ? "" : str7, (i2 & 2048) != 0 ? "" : str8, (i2 & 4096) != 0 ? "" : str9, (i2 & 8192) != 0 ? "" : str10, (i2 & 16384) != 0 ? "" : str11, (i2 & 32768) != 0 ? 0L : j, (i2 & 65536) != 0 ? null : list);
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.shared.net.responsebean.bsc.SubOrderDetailBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SubOrderDetailBean> serializer() {
            return SubOrderDetailBean$$serializer.INSTANCE;
        }

        public final SubOrderDetailBean KWHzl(@NotNull SubOrderDetailResponseBean subOrderDetailResponseBean) {
            String str;
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(subOrderDetailResponseBean, "");
            int status = subOrderDetailResponseBean.getStatus();
            double baseAmount = subOrderDetailResponseBean.getBaseAmount();
            String baseCurrency = subOrderDetailResponseBean.getBaseCurrency();
            String baseCurrencyUrl = subOrderDetailResponseBean.getBaseCurrencyUrl();
            String baseCurrencyNightUrl = subOrderDetailResponseBean.getBaseCurrencyNightUrl();
            double quoteAmount = subOrderDetailResponseBean.getQuoteAmount();
            String tradeType = subOrderDetailResponseBean.getTradeType();
            String paymentMethod = subOrderDetailResponseBean.getPaymentMethod();
            String displayTitle = subOrderDetailResponseBean.getDisplayTitle();
            boolean clickable = subOrderDetailResponseBean.getClickable();
            String displayName = subOrderDetailResponseBean.getDisplayName();
            String paymentMethodUrl = subOrderDetailResponseBean.getPaymentMethodUrl();
            String paymentMethodNightUrl = subOrderDetailResponseBean.getPaymentMethodNightUrl();
            String quoteCurrency = subOrderDetailResponseBean.getQuoteCurrency();
            String orderNo = subOrderDetailResponseBean.getOrderNo();
            long createDate = subOrderDetailResponseBean.getCreateDate();
            List<LocalizedNetworkInfoResponseBean> localizedNetworkInfo = subOrderDetailResponseBean.getLocalizedNetworkInfo();
            if (localizedNetworkInfo != null) {
                str = paymentMethodUrl;
                ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(localizedNetworkInfo, 10));
                for (Iterator it = localizedNetworkInfo.iterator(); it.hasNext(); it = it) {
                    arrayList2.add(LocalizedNetworkInfoBean.Companion.copydefault((LocalizedNetworkInfoResponseBean) it.next()));
                }
                arrayList = arrayList2;
            } else {
                str = paymentMethodUrl;
                arrayList = null;
            }
            return new SubOrderDetailBean(status, baseAmount, baseCurrency, baseCurrencyUrl, baseCurrencyNightUrl, quoteAmount, tradeType, paymentMethod, displayTitle, clickable, displayName, str, paymentMethodNightUrl, quoteCurrency, orderNo, createDate, arrayList);
        }
    }
}
