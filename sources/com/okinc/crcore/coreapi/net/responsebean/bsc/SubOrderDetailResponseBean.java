package com.okinc.crcore.coreapi.net.responsebean.bsc;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.AudioStats;
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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class SubOrderDetailResponseBean implements Parcelable {
    private double baseAmount;
    private String baseCurrency;
    private String baseCurrencyNightUrl;
    private String baseCurrencyUrl;
    private boolean clickable;
    private long createDate;
    private String displayName;
    private String displayTitle;
    private List<LocalizedNetworkInfoResponseBean> localizedNetworkInfo;
    private String orderNo;
    private String paymentMethod;
    private String paymentMethodNightUrl;
    private String paymentMethodUrl;
    private double quoteAmount;
    private String quoteCurrency;
    private int status;
    private final String tradeType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SubOrderDetailResponseBean> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(LocalizedNetworkInfoResponseBean$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<SubOrderDetailResponseBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SubOrderDetailResponseBean createFromParcel(Parcel parcel) {
            String str;
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            double d = parcel.readDouble();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            double d2 = parcel.readDouble();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            long j = parcel.readLong();
            if (parcel.readInt() == 0) {
                arrayList = null;
                str = string7;
            } else {
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                str = string7;
                int i3 = 0;
                while (i3 != i2) {
                    arrayList2.add(LocalizedNetworkInfoResponseBean.CREATOR.createFromParcel(parcel));
                    i3++;
                    i2 = i2;
                }
                arrayList = arrayList2;
            }
            return new SubOrderDetailResponseBean(i, d, string, string2, string3, d2, string4, string5, string6, z, str, string8, string9, string10, string11, j, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SubOrderDetailResponseBean[] newArray(int i) {
            return new SubOrderDetailResponseBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SubOrderDetailResponseBean() {
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
    public final List<LocalizedNetworkInfoResponseBean> component17() {
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
    public final SubOrderDetailResponseBean copy(int i, double d, @NotNull String str, @NotNull String str2, @NotNull String str3, double d2, @NotNull String str4, @NotNull String str5, @NotNull String str6, boolean z, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, long j, List<LocalizedNetworkInfoResponseBean> list) {
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
        return new SubOrderDetailResponseBean(i, d, str, str2, str3, d2, str4, str5, str6, z, str7, str8, str9, str10, str11, j, list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubOrderDetailResponseBean)) {
            return false;
        }
        SubOrderDetailResponseBean subOrderDetailResponseBean = (SubOrderDetailResponseBean) obj;
        return this.status == subOrderDetailResponseBean.status && Double.compare(this.baseAmount, subOrderDetailResponseBean.baseAmount) == 0 && Intrinsics.EZpvd((Object) this.baseCurrency, (Object) subOrderDetailResponseBean.baseCurrency) && Intrinsics.EZpvd((Object) this.baseCurrencyUrl, (Object) subOrderDetailResponseBean.baseCurrencyUrl) && Intrinsics.EZpvd((Object) this.baseCurrencyNightUrl, (Object) subOrderDetailResponseBean.baseCurrencyNightUrl) && Double.compare(this.quoteAmount, subOrderDetailResponseBean.quoteAmount) == 0 && Intrinsics.EZpvd((Object) this.tradeType, (Object) subOrderDetailResponseBean.tradeType) && Intrinsics.EZpvd((Object) this.paymentMethod, (Object) subOrderDetailResponseBean.paymentMethod) && Intrinsics.EZpvd((Object) this.displayTitle, (Object) subOrderDetailResponseBean.displayTitle) && this.clickable == subOrderDetailResponseBean.clickable && Intrinsics.EZpvd((Object) this.displayName, (Object) subOrderDetailResponseBean.displayName) && Intrinsics.EZpvd((Object) this.paymentMethodUrl, (Object) subOrderDetailResponseBean.paymentMethodUrl) && Intrinsics.EZpvd((Object) this.paymentMethodNightUrl, (Object) subOrderDetailResponseBean.paymentMethodNightUrl) && Intrinsics.EZpvd((Object) this.quoteCurrency, (Object) subOrderDetailResponseBean.quoteCurrency) && Intrinsics.EZpvd((Object) this.orderNo, (Object) subOrderDetailResponseBean.orderNo) && this.createDate == subOrderDetailResponseBean.createDate && Intrinsics.EZpvd(this.localizedNetworkInfo, subOrderDetailResponseBean.localizedNetworkInfo);
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
    public final List<LocalizedNetworkInfoResponseBean> getLocalizedNetworkInfo() {
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
        List<LocalizedNetworkInfoResponseBean> list = this.localizedNetworkInfo;
        return (((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + (list == null ? 0 : list.hashCode());
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
    public final void setBaseCurrencyNightUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.baseCurrencyNightUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBaseCurrencyUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.baseCurrencyUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setClickable(boolean z) {
        this.clickable = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCreateDate(long j) {
        this.createDate = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDisplayName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.displayName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDisplayTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.displayTitle = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLocalizedNetworkInfo(List<LocalizedNetworkInfoResponseBean> list) {
        this.localizedNetworkInfo = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrderNo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.orderNo = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPaymentMethod(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.paymentMethod = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPaymentMethodNightUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.paymentMethodNightUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPaymentMethodUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.paymentMethodUrl = str;
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
    public final void setStatus(int i) {
        this.status = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SubOrderDetailResponseBean(status=" + this.status + ", baseAmount=" + this.baseAmount + ", baseCurrency=" + this.baseCurrency + ", baseCurrencyUrl=" + this.baseCurrencyUrl + ", baseCurrencyNightUrl=" + this.baseCurrencyNightUrl + ", quoteAmount=" + this.quoteAmount + ", tradeType=" + this.tradeType + ", paymentMethod=" + this.paymentMethod + ", displayTitle=" + this.displayTitle + ", clickable=" + this.clickable + ", displayName=" + this.displayName + ", paymentMethodUrl=" + this.paymentMethodUrl + ", paymentMethodNightUrl=" + this.paymentMethodNightUrl + ", quoteCurrency=" + this.quoteCurrency + ", orderNo=" + this.orderNo + ", createDate=" + this.createDate + ", localizedNetworkInfo=" + this.localizedNetworkInfo + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.status);
        parcel.writeDouble(this.baseAmount);
        parcel.writeString(this.baseCurrency);
        parcel.writeString(this.baseCurrencyUrl);
        parcel.writeString(this.baseCurrencyNightUrl);
        parcel.writeDouble(this.quoteAmount);
        parcel.writeString(this.tradeType);
        parcel.writeString(this.paymentMethod);
        parcel.writeString(this.displayTitle);
        parcel.writeInt(this.clickable ? 1 : 0);
        parcel.writeString(this.displayName);
        parcel.writeString(this.paymentMethodUrl);
        parcel.writeString(this.paymentMethodNightUrl);
        parcel.writeString(this.quoteCurrency);
        parcel.writeString(this.orderNo);
        parcel.writeLong(this.createDate);
        List<LocalizedNetworkInfoResponseBean> list = this.localizedNetworkInfo;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<LocalizedNetworkInfoResponseBean> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.bsc.SubOrderDetailResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SubOrderDetailResponseBean> serializer() {
            return SubOrderDetailResponseBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SubOrderDetailResponseBean(int i, int i2, double d, String str, String str2, String str3, double d2, String str4, String str5, String str6, boolean z, String str7, String str8, String str9, String str10, String str11, long j, List list, SerializationConstructorMarker serializationConstructorMarker) {
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

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(SubOrderDetailResponseBean subOrderDetailResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || subOrderDetailResponseBean.status != -1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, subOrderDetailResponseBean.status);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || Double.compare(subOrderDetailResponseBean.baseAmount, AudioStats.AUDIO_AMPLITUDE_NONE) != 0) {
            compositeEncoder.encodeDoubleElement(serialDescriptor, 1, subOrderDetailResponseBean.baseAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) subOrderDetailResponseBean.baseCurrency, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, subOrderDetailResponseBean.baseCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) subOrderDetailResponseBean.baseCurrencyUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, subOrderDetailResponseBean.baseCurrencyUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) subOrderDetailResponseBean.baseCurrencyNightUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, subOrderDetailResponseBean.baseCurrencyNightUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || Double.compare(subOrderDetailResponseBean.quoteAmount, AudioStats.AUDIO_AMPLITUDE_NONE) != 0) {
            compositeEncoder.encodeDoubleElement(serialDescriptor, 5, subOrderDetailResponseBean.quoteAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) subOrderDetailResponseBean.tradeType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, subOrderDetailResponseBean.tradeType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) subOrderDetailResponseBean.paymentMethod, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, subOrderDetailResponseBean.paymentMethod);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) subOrderDetailResponseBean.displayTitle, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, subOrderDetailResponseBean.displayTitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || subOrderDetailResponseBean.clickable) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 9, subOrderDetailResponseBean.clickable);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) subOrderDetailResponseBean.displayName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, subOrderDetailResponseBean.displayName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) subOrderDetailResponseBean.paymentMethodUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, subOrderDetailResponseBean.paymentMethodUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) subOrderDetailResponseBean.paymentMethodNightUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, subOrderDetailResponseBean.paymentMethodNightUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) subOrderDetailResponseBean.quoteCurrency, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, subOrderDetailResponseBean.quoteCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) subOrderDetailResponseBean.orderNo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, subOrderDetailResponseBean.orderNo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || subOrderDetailResponseBean.createDate != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 15, subOrderDetailResponseBean.createDate);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) && subOrderDetailResponseBean.localizedNetworkInfo == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, kSerializerArr[16], subOrderDetailResponseBean.localizedNetworkInfo);
    }

    public SubOrderDetailResponseBean(int i, double d, @NotNull String str, @NotNull String str2, @NotNull String str3, double d2, @NotNull String str4, @NotNull String str5, @NotNull String str6, boolean z, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, long j, List<LocalizedNetworkInfoResponseBean> list) {
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
 A[MD:(int, double, java.lang.String, java.lang.String, java.lang.String, double, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, java.util.List<com.okinc.crcore.coreapi.net.responsebean.bsc.LocalizedNetworkInfoResponseBean>):void (m)] (LINE:94) call: com.okinc.crcore.coreapi.net.responsebean.bsc.SubOrderDetailResponseBean.<init>(int, double, java.lang.String, java.lang.String, java.lang.String, double, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, java.util.List):void type: THIS */
    public /* synthetic */ SubOrderDetailResponseBean(int i, double d, String str, String str2, String str3, double d2, String str4, String str5, String str6, boolean z, String str7, String str8, String str9, String str10, String str11, long j, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? -1 : i, (i2 & 2) != 0 ? 0.0d : d, (i2 & 4) != 0 ? "" : str, (i2 & 8) != 0 ? "" : str2, (i2 & 16) != 0 ? "" : str3, (i2 & 32) == 0 ? d2 : AudioStats.AUDIO_AMPLITUDE_NONE, (i2 & 64) != 0 ? "" : str4, (i2 & 128) != 0 ? "" : str5, (i2 & 256) != 0 ? "" : str6, (i2 & 512) != 0 ? false : z, (i2 & 1024) != 0 ? "" : str7, (i2 & 2048) != 0 ? "" : str8, (i2 & 4096) != 0 ? "" : str9, (i2 & 8192) != 0 ? "" : str10, (i2 & 16384) != 0 ? "" : str11, (i2 & 32768) != 0 ? 0L : j, (i2 & 65536) != 0 ? null : list);
    }
}
