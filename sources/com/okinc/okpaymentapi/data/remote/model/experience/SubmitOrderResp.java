package com.okinc.okpaymentapi.data.remote.model.experience;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.AudioStats;
import com.okinc.okpaymentapi.data.remote.model.management.EarnOption;
import com.okinc.okpaymentapi.data.remote.model.management.EarnOption$$serializer;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.HashMapSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class SubmitOrderResp implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private String baseAmount;
    private String baseCurrency;
    private String channelFee;
    private String channelFeeCurrency;
    private EarnOption earnOption;
    private boolean formRequest;
    private String orderFrequency;
    private String orderNo;
    private String orderType;
    private HashMap<String, String> param;
    private String paymentMethodType;
    private String planId;
    private double price;
    private double quoteAmount;
    private String quoteCurrency;
    private String realAmount;
    private String requestAmount;
    private String status;
    private String tradeType;
    private String url;
    private boolean userRecurringBuyEnabled;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SubmitOrderResp> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<SubmitOrderResp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SubmitOrderResp createFromParcel(Parcel parcel) {
            double d;
            HashMap map;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            double d2 = parcel.readDouble();
            double d3 = parcel.readDouble();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            String string14 = parcel.readString();
            String string15 = parcel.readString();
            EarnOption earnOptionCreateFromParcel = parcel.readInt() == 0 ? null : EarnOption.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                d = d3;
                map = null;
            } else {
                int i = parcel.readInt();
                HashMap map2 = new HashMap(i);
                int i2 = 0;
                while (i2 != i) {
                    map2.put(parcel.readString(), parcel.readString());
                    i2++;
                    i = i;
                    d3 = d3;
                }
                d = d3;
                map = map2;
            }
            return new SubmitOrderResp(string, string2, string3, string4, z, string5, string6, string7, string8, d2, d, string9, string10, string11, string12, string13, string14, string15, earnOptionCreateFromParcel, map, parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SubmitOrderResp[] newArray(int i) {
            return new SubmitOrderResp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SubmitOrderResp() {
        this((String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, AudioStats.AUDIO_AMPLITUDE_NONE, AudioStats.AUDIO_AMPLITUDE_NONE, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (EarnOption) null, (HashMap) null, false, 2097151, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.orderNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double component10() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double component11() {
        return this.quoteAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.realAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.requestAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.quoteCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.planId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.orderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.orderFrequency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EarnOption component19() {
        return this.earnOption;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HashMap<String, String> component20() {
        return this.param;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component21() {
        return this.userRecurringBuyEnabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.paymentMethodType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.tradeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component5() {
        return this.formRequest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.baseCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.baseAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.channelFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.channelFeeCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SubmitOrderResp copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, double d, double d2, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, EarnOption earnOption, HashMap<String, String> map, boolean z2) {
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
        return new SubmitOrderResp(str, str2, str3, str4, z, str5, str6, str7, str8, d, d2, str9, str10, str11, str12, str13, str14, str15, earnOption, map, z2);
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
        if (!(obj instanceof SubmitOrderResp)) {
            return false;
        }
        SubmitOrderResp submitOrderResp = (SubmitOrderResp) obj;
        return Intrinsics.EZpvd((Object) this.orderNo, (Object) submitOrderResp.orderNo) && Intrinsics.EZpvd((Object) this.url, (Object) submitOrderResp.url) && Intrinsics.EZpvd((Object) this.paymentMethodType, (Object) submitOrderResp.paymentMethodType) && Intrinsics.EZpvd((Object) this.tradeType, (Object) submitOrderResp.tradeType) && this.formRequest == submitOrderResp.formRequest && Intrinsics.EZpvd((Object) this.baseCurrency, (Object) submitOrderResp.baseCurrency) && Intrinsics.EZpvd((Object) this.baseAmount, (Object) submitOrderResp.baseAmount) && Intrinsics.EZpvd((Object) this.channelFee, (Object) submitOrderResp.channelFee) && Intrinsics.EZpvd((Object) this.channelFeeCurrency, (Object) submitOrderResp.channelFeeCurrency) && Double.compare(this.price, submitOrderResp.price) == 0 && Double.compare(this.quoteAmount, submitOrderResp.quoteAmount) == 0 && Intrinsics.EZpvd((Object) this.realAmount, (Object) submitOrderResp.realAmount) && Intrinsics.EZpvd((Object) this.requestAmount, (Object) submitOrderResp.requestAmount) && Intrinsics.EZpvd((Object) this.quoteCurrency, (Object) submitOrderResp.quoteCurrency) && Intrinsics.EZpvd((Object) this.planId, (Object) submitOrderResp.planId) && Intrinsics.EZpvd((Object) this.status, (Object) submitOrderResp.status) && Intrinsics.EZpvd((Object) this.orderType, (Object) submitOrderResp.orderType) && Intrinsics.EZpvd((Object) this.orderFrequency, (Object) submitOrderResp.orderFrequency) && Intrinsics.EZpvd(this.earnOption, submitOrderResp.earnOption) && Intrinsics.EZpvd(this.param, submitOrderResp.param) && this.userRecurringBuyEnabled == submitOrderResp.userRecurringBuyEnabled;
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
    public final String getChannelFee() {
        return this.channelFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChannelFeeCurrency() {
        return this.channelFeeCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EarnOption getEarnOption() {
        return this.earnOption;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getFormRequest() {
        return this.formRequest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderFrequency() {
        return this.orderFrequency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderNo() {
        return this.orderNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderType() {
        return this.orderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HashMap<String, String> getParam() {
        return this.param;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPaymentMethodType() {
        return this.paymentMethodType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPlanId() {
        return this.planId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double getPrice() {
        return this.price;
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
    public final String getRealAmount() {
        return this.realAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRequestAmount() {
        return this.requestAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradeType() {
        return this.tradeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUrl() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getUserRecurringBuyEnabled() {
        return this.userRecurringBuyEnabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.orderNo.hashCode();
        int iHashCode2 = this.url.hashCode();
        int iHashCode3 = this.paymentMethodType.hashCode();
        int iHashCode4 = this.tradeType.hashCode();
        int iHashCode5 = Boolean.hashCode(this.formRequest);
        int iHashCode6 = this.baseCurrency.hashCode();
        int iHashCode7 = this.baseAmount.hashCode();
        int iHashCode8 = this.channelFee.hashCode();
        int iHashCode9 = this.channelFeeCurrency.hashCode();
        int iHashCode10 = Double.hashCode(this.price);
        int iHashCode11 = Double.hashCode(this.quoteAmount);
        int iHashCode12 = this.realAmount.hashCode();
        int iHashCode13 = this.requestAmount.hashCode();
        int iHashCode14 = this.quoteCurrency.hashCode();
        int iHashCode15 = this.planId.hashCode();
        int iHashCode16 = this.status.hashCode();
        int iHashCode17 = this.orderType.hashCode();
        int iHashCode18 = this.orderFrequency.hashCode();
        EarnOption earnOption = this.earnOption;
        int iHashCode19 = earnOption == null ? 0 : earnOption.hashCode();
        HashMap<String, String> map = this.param;
        return (((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + (map != null ? map.hashCode() : 0)) * 31) + Boolean.hashCode(this.userRecurringBuyEnabled);
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
    public final void setChannelFee(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.channelFee = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChannelFeeCurrency(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.channelFeeCurrency = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEarnOption(EarnOption earnOption) {
        this.earnOption = earnOption;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFormRequest(boolean z) {
        this.formRequest = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrderFrequency(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.orderFrequency = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrderNo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.orderNo = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrderType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.orderType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setParam(HashMap<String, String> map) {
        this.param = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPaymentMethodType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.paymentMethodType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPlanId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.planId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPrice(double d) {
        this.price = d;
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
    public final void setRealAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.realAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRequestAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.requestAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStatus(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.status = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTradeType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tradeType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.url = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUserRecurringBuyEnabled(boolean z) {
        this.userRecurringBuyEnabled = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SubmitOrderResp(orderNo=" + this.orderNo + ", url=" + this.url + ", paymentMethodType=" + this.paymentMethodType + ", tradeType=" + this.tradeType + ", formRequest=" + this.formRequest + ", baseCurrency=" + this.baseCurrency + ", baseAmount=" + this.baseAmount + ", channelFee=" + this.channelFee + ", channelFeeCurrency=" + this.channelFeeCurrency + ", price=" + this.price + ", quoteAmount=" + this.quoteAmount + ", realAmount=" + this.realAmount + ", requestAmount=" + this.requestAmount + ", quoteCurrency=" + this.quoteCurrency + ", planId=" + this.planId + ", status=" + this.status + ", orderType=" + this.orderType + ", orderFrequency=" + this.orderFrequency + ", earnOption=" + this.earnOption + ", param=" + this.param + ", userRecurringBuyEnabled=" + this.userRecurringBuyEnabled + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.orderNo);
        parcel.writeString(this.url);
        parcel.writeString(this.paymentMethodType);
        parcel.writeString(this.tradeType);
        parcel.writeInt(this.formRequest ? 1 : 0);
        parcel.writeString(this.baseCurrency);
        parcel.writeString(this.baseAmount);
        parcel.writeString(this.channelFee);
        parcel.writeString(this.channelFeeCurrency);
        parcel.writeDouble(this.price);
        parcel.writeDouble(this.quoteAmount);
        parcel.writeString(this.realAmount);
        parcel.writeString(this.requestAmount);
        parcel.writeString(this.quoteCurrency);
        parcel.writeString(this.planId);
        parcel.writeString(this.status);
        parcel.writeString(this.orderType);
        parcel.writeString(this.orderFrequency);
        EarnOption earnOption = this.earnOption;
        if (earnOption == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            earnOption.writeToParcel(parcel, i);
        }
        HashMap<String, String> map = this.param;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeString(entry.getValue());
            }
        }
        parcel.writeInt(this.userRecurringBuyEnabled ? 1 : 0);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okpaymentapi.data.remote.model.experience.SubmitOrderResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SubmitOrderResp> serializer() {
            return SubmitOrderResp$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new HashMapSerializer(stringSerializer, stringSerializer), null};
    }

    public /* synthetic */ SubmitOrderResp(int i, String str, String str2, String str3, String str4, boolean z, String str5, String str6, String str7, String str8, double d, double d2, String str9, String str10, String str11, String str12, String str13, String str14, String str15, EarnOption earnOption, HashMap map, boolean z2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.orderNo = "";
        } else {
            this.orderNo = str;
        }
        if ((i & 2) == 0) {
            this.url = "";
        } else {
            this.url = str2;
        }
        if ((i & 4) == 0) {
            this.paymentMethodType = "";
        } else {
            this.paymentMethodType = str3;
        }
        if ((i & 8) == 0) {
            this.tradeType = "";
        } else {
            this.tradeType = str4;
        }
        if ((i & 16) == 0) {
            this.formRequest = false;
        } else {
            this.formRequest = z;
        }
        if ((i & 32) == 0) {
            this.baseCurrency = "";
        } else {
            this.baseCurrency = str5;
        }
        if ((i & 64) == 0) {
            this.baseAmount = "";
        } else {
            this.baseAmount = str6;
        }
        if ((i & 128) == 0) {
            this.channelFee = "";
        } else {
            this.channelFee = str7;
        }
        if ((i & 256) == 0) {
            this.channelFeeCurrency = "";
        } else {
            this.channelFeeCurrency = str8;
        }
        int i2 = i & 512;
        double d3 = AudioStats.AUDIO_AMPLITUDE_NONE;
        if (i2 == 0) {
            this.price = AudioStats.AUDIO_AMPLITUDE_NONE;
        } else {
            this.price = d;
        }
        this.quoteAmount = (i & 1024) != 0 ? d2 : d3;
        if ((i & 2048) == 0) {
            this.realAmount = "";
        } else {
            this.realAmount = str9;
        }
        if ((i & 4096) == 0) {
            this.requestAmount = "";
        } else {
            this.requestAmount = str10;
        }
        if ((i & 8192) == 0) {
            this.quoteCurrency = "";
        } else {
            this.quoteCurrency = str11;
        }
        if ((i & 16384) == 0) {
            this.planId = "";
        } else {
            this.planId = str12;
        }
        if ((32768 & i) == 0) {
            this.status = "";
        } else {
            this.status = str13;
        }
        if ((65536 & i) == 0) {
            this.orderType = "";
        } else {
            this.orderType = str14;
        }
        if ((131072 & i) == 0) {
            this.orderFrequency = "";
        } else {
            this.orderFrequency = str15;
        }
        this.earnOption = (262144 & i) == 0 ? null : earnOption;
        this.param = (524288 & i) == 0 ? new HashMap() : map;
        if ((i & 1048576) == 0) {
            this.userRecurringBuyEnabled = false;
        } else {
            this.userRecurringBuyEnabled = z2;
        }
    }

    public static final /* synthetic */ void write$Self$OKPayments_ok_payment_api(SubmitOrderResp submitOrderResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) submitOrderResp.orderNo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, submitOrderResp.orderNo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) submitOrderResp.url, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, submitOrderResp.url);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) submitOrderResp.paymentMethodType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, submitOrderResp.paymentMethodType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) submitOrderResp.tradeType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, submitOrderResp.tradeType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || submitOrderResp.formRequest) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 4, submitOrderResp.formRequest);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) submitOrderResp.baseCurrency, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, submitOrderResp.baseCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) submitOrderResp.baseAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, submitOrderResp.baseAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) submitOrderResp.channelFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, submitOrderResp.channelFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) submitOrderResp.channelFeeCurrency, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, submitOrderResp.channelFeeCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || Double.compare(submitOrderResp.price, AudioStats.AUDIO_AMPLITUDE_NONE) != 0) {
            compositeEncoder.encodeDoubleElement(serialDescriptor, 9, submitOrderResp.price);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || Double.compare(submitOrderResp.quoteAmount, AudioStats.AUDIO_AMPLITUDE_NONE) != 0) {
            compositeEncoder.encodeDoubleElement(serialDescriptor, 10, submitOrderResp.quoteAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) submitOrderResp.realAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, submitOrderResp.realAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) submitOrderResp.requestAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, submitOrderResp.requestAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) submitOrderResp.quoteCurrency, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, submitOrderResp.quoteCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) submitOrderResp.planId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, submitOrderResp.planId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) submitOrderResp.status, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, submitOrderResp.status);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) submitOrderResp.orderType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, submitOrderResp.orderType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) submitOrderResp.orderFrequency, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 17, submitOrderResp.orderFrequency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || submitOrderResp.earnOption != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, EarnOption$$serializer.INSTANCE, submitOrderResp.earnOption);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd(submitOrderResp.param, new HashMap())) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, kSerializerArr[19], submitOrderResp.param);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || submitOrderResp.userRecurringBuyEnabled) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 20, submitOrderResp.userRecurringBuyEnabled);
        }
    }

    public SubmitOrderResp(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, double d, double d2, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, EarnOption earnOption, HashMap<String, String> map, boolean z2) {
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
        this.orderNo = str;
        this.url = str2;
        this.paymentMethodType = str3;
        this.tradeType = str4;
        this.formRequest = z;
        this.baseCurrency = str5;
        this.baseAmount = str6;
        this.channelFee = str7;
        this.channelFeeCurrency = str8;
        this.price = d;
        this.quoteAmount = d2;
        this.realAmount = str9;
        this.requestAmount = str10;
        this.quoteCurrency = str11;
        this.planId = str12;
        this.status = str13;
        this.orderType = str14;
        this.orderFrequency = str15;
        this.earnOption = earnOption;
        this.param = map;
        this.userRecurringBuyEnabled = z2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00f4: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r48v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r48v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r48v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r48v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0024: ARITH (r48v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r29v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r48v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r48v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r48v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r48v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:double:?: TERNARY null = ((wrap:int:0x004c: ARITH (r48v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (0.0d double) : (r34v0 double))
  (wrap:double:?: TERNARY null = ((wrap:int:0x0056: ARITH (r48v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r36v0 double) : (wrap:double:0x004e: SGET  A[WRAPPED] androidx.camera.video.AudioStats.AUDIO_AMPLITUDE_NONE double))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005d: ARITH (r48v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0065: ARITH (r48v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r39v0 java.lang.String))
  (wrap:java.lang.String:0x0078: TERNARY null = ((wrap:int:0x006f: ARITH (r48v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007a: ARITH (r48v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0086: ARITH (r48v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0091: ARITH (r48v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r43v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x009c: ARITH (r48v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r44v0 java.lang.String))
  (wrap:com.okinc.okpaymentapi.data.remote.model.management.EarnOption:?: TERNARY null = ((wrap:int:0x00a7: ARITH (r48v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okpaymentapi.data.remote.model.management.EarnOption) : (r45v0 com.okinc.okpaymentapi.data.remote.model.management.EarnOption))
  (wrap:java.util.HashMap:?: TERNARY null = ((wrap:int:0x00b2: ARITH (r48v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00b8: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:140) call: java.util.HashMap.<init>():void type: CONSTRUCTOR) : (r46v0 java.util.HashMap))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00c0: ARITH (r48v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? false : (r47v0 boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, double, double, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.okpaymentapi.data.remote.model.management.EarnOption, java.util.HashMap<java.lang.String, java.lang.String>, boolean):void (m)] (LINE:120) call: com.okinc.okpaymentapi.data.remote.model.experience.SubmitOrderResp.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, double, double, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.okpaymentapi.data.remote.model.management.EarnOption, java.util.HashMap, boolean):void type: THIS */
    public /* synthetic */ SubmitOrderResp(String str, String str2, String str3, String str4, boolean z, String str5, String str6, String str7, String str8, double d, double d2, String str9, String str10, String str11, String str12, String str13, String str14, String str15, EarnOption earnOption, HashMap map, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? false : z, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? "" : str7, (i & 256) != 0 ? "" : str8, (i & 512) != 0 ? 0.0d : d, (i & 1024) == 0 ? d2 : AudioStats.AUDIO_AMPLITUDE_NONE, (i & 2048) != 0 ? "" : str9, (i & 4096) != 0 ? "" : str10, (i & 8192) != 0 ? "" : str11, (i & 16384) != 0 ? "" : str12, (i & 32768) != 0 ? "" : str13, (i & 65536) != 0 ? "" : str14, (i & 131072) != 0 ? "" : str15, (i & 262144) != 0 ? null : earnOption, (i & 524288) != 0 ? new HashMap() : map, (i & 1048576) != 0 ? false : z2);
    }
}
