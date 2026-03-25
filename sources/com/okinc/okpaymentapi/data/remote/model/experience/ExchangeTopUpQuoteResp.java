package com.okinc.okpaymentapi.data.remote.model.experience;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class ExchangeTopUpQuoteResp implements Parcelable {
    private int activityQuoteTime;
    private String baseAmount;
    private String baseColorfulIconUrl;
    private final String baseCurrencyIconUrl;
    private final String baseCurrencyNightIconUrl;
    private String baseCurrencySymbol;
    private LocalizedAddFrom localizedAddFrom;
    private ArrayList<LocalizedFeeInfo> localizedFeeInfo;
    private ArrayList<LocalizedNetworkInfo> localizedNetworkInfo;
    private String price;
    private String quoteAmount;
    private String quoteCurrencySymbol;
    private String quoteToken;
    private String totalFiatFee;
    private String totalPaidAmount;
    private String totalPaidCurrency;
    private String tradeType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<ExchangeTopUpQuoteResp> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(LocalizedFeeInfo$$serializer.INSTANCE), new ArrayListSerializer(LocalizedNetworkInfo$$serializer.INSTANCE), null};

    public static final class Creator implements Parcelable.Creator<ExchangeTopUpQuoteResp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ExchangeTopUpQuoteResp createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            int i = parcel.readInt();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            LocalizedAddFrom localizedAddFromCreateFromParcel = parcel.readInt() == 0 ? null : LocalizedAddFrom.CREATOR.createFromParcel(parcel);
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            int i3 = 0;
            while (i3 != i2) {
                arrayList.add(LocalizedFeeInfo.CREATOR.createFromParcel(parcel));
                i3++;
                i2 = i2;
            }
            int i4 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i4);
            int i5 = 0;
            while (i5 != i4) {
                arrayList2.add(LocalizedNetworkInfo.CREATOR.createFromParcel(parcel));
                i5++;
                i4 = i4;
            }
            return new ExchangeTopUpQuoteResp(string, string2, string3, string4, string5, string6, string7, string8, string9, i, string10, string11, string12, localizedAddFromCreateFromParcel, arrayList, arrayList2, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ExchangeTopUpQuoteResp[] newArray(int i) {
            return new ExchangeTopUpQuoteResp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ExchangeTopUpQuoteResp() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, (String) null, (String) null, (String) null, (LocalizedAddFrom) null, (ArrayList) null, (ArrayList) null, (String) null, 131071, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.quoteToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component10() {
        return this.activityQuoteTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.baseColorfulIconUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.baseCurrencyIconUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.baseCurrencyNightIconUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LocalizedAddFrom component14() {
        return this.localizedAddFrom;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<LocalizedFeeInfo> component15() {
        return this.localizedFeeInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<LocalizedNetworkInfo> component16() {
        return this.localizedNetworkInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.totalFiatFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.baseAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.quoteAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.totalPaidAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.baseCurrencySymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.quoteCurrencySymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.totalPaidCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.tradeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ExchangeTopUpQuoteResp copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, int i, @NotNull String str10, @NotNull String str11, @NotNull String str12, LocalizedAddFrom localizedAddFrom, @NotNull ArrayList<LocalizedFeeInfo> arrayList, @NotNull ArrayList<LocalizedNetworkInfo> arrayList2, String str13) {
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
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(arrayList2, "");
        return new ExchangeTopUpQuoteResp(str, str2, str3, str4, str5, str6, str7, str8, str9, i, str10, str11, str12, localizedAddFrom, arrayList, arrayList2, str13);
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
        if (!(obj instanceof ExchangeTopUpQuoteResp)) {
            return false;
        }
        ExchangeTopUpQuoteResp exchangeTopUpQuoteResp = (ExchangeTopUpQuoteResp) obj;
        return Intrinsics.EZpvd((Object) this.quoteToken, (Object) exchangeTopUpQuoteResp.quoteToken) && Intrinsics.EZpvd((Object) this.price, (Object) exchangeTopUpQuoteResp.price) && Intrinsics.EZpvd((Object) this.baseAmount, (Object) exchangeTopUpQuoteResp.baseAmount) && Intrinsics.EZpvd((Object) this.quoteAmount, (Object) exchangeTopUpQuoteResp.quoteAmount) && Intrinsics.EZpvd((Object) this.totalPaidAmount, (Object) exchangeTopUpQuoteResp.totalPaidAmount) && Intrinsics.EZpvd((Object) this.baseCurrencySymbol, (Object) exchangeTopUpQuoteResp.baseCurrencySymbol) && Intrinsics.EZpvd((Object) this.quoteCurrencySymbol, (Object) exchangeTopUpQuoteResp.quoteCurrencySymbol) && Intrinsics.EZpvd((Object) this.totalPaidCurrency, (Object) exchangeTopUpQuoteResp.totalPaidCurrency) && Intrinsics.EZpvd((Object) this.tradeType, (Object) exchangeTopUpQuoteResp.tradeType) && this.activityQuoteTime == exchangeTopUpQuoteResp.activityQuoteTime && Intrinsics.EZpvd((Object) this.baseColorfulIconUrl, (Object) exchangeTopUpQuoteResp.baseColorfulIconUrl) && Intrinsics.EZpvd((Object) this.baseCurrencyIconUrl, (Object) exchangeTopUpQuoteResp.baseCurrencyIconUrl) && Intrinsics.EZpvd((Object) this.baseCurrencyNightIconUrl, (Object) exchangeTopUpQuoteResp.baseCurrencyNightIconUrl) && Intrinsics.EZpvd(this.localizedAddFrom, exchangeTopUpQuoteResp.localizedAddFrom) && Intrinsics.EZpvd(this.localizedFeeInfo, exchangeTopUpQuoteResp.localizedFeeInfo) && Intrinsics.EZpvd(this.localizedNetworkInfo, exchangeTopUpQuoteResp.localizedNetworkInfo) && Intrinsics.EZpvd((Object) this.totalFiatFee, (Object) exchangeTopUpQuoteResp.totalFiatFee);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getActivityQuoteTime() {
        return this.activityQuoteTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseAmount() {
        return this.baseAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseColorfulIconUrl() {
        return this.baseColorfulIconUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseCurrencyIconUrl() {
        return this.baseCurrencyIconUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseCurrencyNightIconUrl() {
        return this.baseCurrencyNightIconUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseCurrencySymbol() {
        return this.baseCurrencySymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LocalizedAddFrom getLocalizedAddFrom() {
        return this.localizedAddFrom;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<LocalizedFeeInfo> getLocalizedFeeInfo() {
        return this.localizedFeeInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<LocalizedNetworkInfo> getLocalizedNetworkInfo() {
        return this.localizedNetworkInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrice() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteAmount() {
        return this.quoteAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteCurrencySymbol() {
        return this.quoteCurrencySymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteToken() {
        return this.quoteToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalFiatFee() {
        return this.totalFiatFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalPaidAmount() {
        return this.totalPaidAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalPaidCurrency() {
        return this.totalPaidCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradeType() {
        return this.tradeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.quoteToken.hashCode();
        int iHashCode2 = this.price.hashCode();
        int iHashCode3 = this.baseAmount.hashCode();
        int iHashCode4 = this.quoteAmount.hashCode();
        int iHashCode5 = this.totalPaidAmount.hashCode();
        int iHashCode6 = this.baseCurrencySymbol.hashCode();
        int iHashCode7 = this.quoteCurrencySymbol.hashCode();
        int iHashCode8 = this.totalPaidCurrency.hashCode();
        int iHashCode9 = this.tradeType.hashCode();
        int iHashCode10 = Integer.hashCode(this.activityQuoteTime);
        int iHashCode11 = this.baseColorfulIconUrl.hashCode();
        int iHashCode12 = this.baseCurrencyIconUrl.hashCode();
        int iHashCode13 = this.baseCurrencyNightIconUrl.hashCode();
        LocalizedAddFrom localizedAddFrom = this.localizedAddFrom;
        int iHashCode14 = localizedAddFrom == null ? 0 : localizedAddFrom.hashCode();
        int iHashCode15 = this.localizedFeeInfo.hashCode();
        int iHashCode16 = this.localizedNetworkInfo.hashCode();
        String str = this.totalFiatFee;
        return (((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setActivityQuoteTime(int i) {
        this.activityQuoteTime = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBaseAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.baseAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBaseColorfulIconUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.baseColorfulIconUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBaseCurrencySymbol(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.baseCurrencySymbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLocalizedAddFrom(LocalizedAddFrom localizedAddFrom) {
        this.localizedAddFrom = localizedAddFrom;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLocalizedFeeInfo(@NotNull ArrayList<LocalizedFeeInfo> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.localizedFeeInfo = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLocalizedNetworkInfo(@NotNull ArrayList<LocalizedNetworkInfo> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.localizedNetworkInfo = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.price = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuoteAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.quoteAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuoteCurrencySymbol(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.quoteCurrencySymbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuoteToken(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.quoteToken = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTotalFiatFee(String str) {
        this.totalFiatFee = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTotalPaidAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.totalPaidAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTotalPaidCurrency(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.totalPaidCurrency = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTradeType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tradeType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ExchangeTopUpQuoteResp(quoteToken=" + this.quoteToken + ", price=" + this.price + ", baseAmount=" + this.baseAmount + ", quoteAmount=" + this.quoteAmount + ", totalPaidAmount=" + this.totalPaidAmount + ", baseCurrencySymbol=" + this.baseCurrencySymbol + ", quoteCurrencySymbol=" + this.quoteCurrencySymbol + ", totalPaidCurrency=" + this.totalPaidCurrency + ", tradeType=" + this.tradeType + ", activityQuoteTime=" + this.activityQuoteTime + ", baseColorfulIconUrl=" + this.baseColorfulIconUrl + ", baseCurrencyIconUrl=" + this.baseCurrencyIconUrl + ", baseCurrencyNightIconUrl=" + this.baseCurrencyNightIconUrl + ", localizedAddFrom=" + this.localizedAddFrom + ", localizedFeeInfo=" + this.localizedFeeInfo + ", localizedNetworkInfo=" + this.localizedNetworkInfo + ", totalFiatFee=" + this.totalFiatFee + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.quoteToken);
        parcel.writeString(this.price);
        parcel.writeString(this.baseAmount);
        parcel.writeString(this.quoteAmount);
        parcel.writeString(this.totalPaidAmount);
        parcel.writeString(this.baseCurrencySymbol);
        parcel.writeString(this.quoteCurrencySymbol);
        parcel.writeString(this.totalPaidCurrency);
        parcel.writeString(this.tradeType);
        parcel.writeInt(this.activityQuoteTime);
        parcel.writeString(this.baseColorfulIconUrl);
        parcel.writeString(this.baseCurrencyIconUrl);
        parcel.writeString(this.baseCurrencyNightIconUrl);
        LocalizedAddFrom localizedAddFrom = this.localizedAddFrom;
        if (localizedAddFrom == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            localizedAddFrom.writeToParcel(parcel, i);
        }
        ArrayList<LocalizedFeeInfo> arrayList = this.localizedFeeInfo;
        parcel.writeInt(arrayList.size());
        Iterator<LocalizedFeeInfo> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        ArrayList<LocalizedNetworkInfo> arrayList2 = this.localizedNetworkInfo;
        parcel.writeInt(arrayList2.size());
        Iterator<LocalizedNetworkInfo> it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.totalFiatFee);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okpaymentapi.data.remote.model.experience.ExchangeTopUpQuoteResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ExchangeTopUpQuoteResp> serializer() {
            return ExchangeTopUpQuoteResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ExchangeTopUpQuoteResp(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i2, String str10, String str11, String str12, LocalizedAddFrom localizedAddFrom, ArrayList arrayList, ArrayList arrayList2, String str13, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.quoteToken = "";
        } else {
            this.quoteToken = str;
        }
        if ((i & 2) == 0) {
            this.price = "";
        } else {
            this.price = str2;
        }
        if ((i & 4) == 0) {
            this.baseAmount = "";
        } else {
            this.baseAmount = str3;
        }
        if ((i & 8) == 0) {
            this.quoteAmount = "";
        } else {
            this.quoteAmount = str4;
        }
        if ((i & 16) == 0) {
            this.totalPaidAmount = "";
        } else {
            this.totalPaidAmount = str5;
        }
        if ((i & 32) == 0) {
            this.baseCurrencySymbol = "";
        } else {
            this.baseCurrencySymbol = str6;
        }
        if ((i & 64) == 0) {
            this.quoteCurrencySymbol = "";
        } else {
            this.quoteCurrencySymbol = str7;
        }
        if ((i & 128) == 0) {
            this.totalPaidCurrency = "";
        } else {
            this.totalPaidCurrency = str8;
        }
        if ((i & 256) == 0) {
            this.tradeType = "";
        } else {
            this.tradeType = str9;
        }
        this.activityQuoteTime = (i & 512) == 0 ? 0 : i2;
        if ((i & 1024) == 0) {
            this.baseColorfulIconUrl = "";
        } else {
            this.baseColorfulIconUrl = str10;
        }
        if ((i & 2048) == 0) {
            this.baseCurrencyIconUrl = "";
        } else {
            this.baseCurrencyIconUrl = str11;
        }
        if ((i & 4096) == 0) {
            this.baseCurrencyNightIconUrl = "";
        } else {
            this.baseCurrencyNightIconUrl = str12;
        }
        if ((i & 8192) == 0) {
            this.localizedAddFrom = null;
        } else {
            this.localizedAddFrom = localizedAddFrom;
        }
        this.localizedFeeInfo = (i & 16384) == 0 ? new ArrayList() : arrayList;
        this.localizedNetworkInfo = (32768 & i) == 0 ? new ArrayList() : arrayList2;
        if ((i & 65536) == 0) {
            this.totalFiatFee = null;
        } else {
            this.totalFiatFee = str13;
        }
    }

    public static final /* synthetic */ void write$Self$OKPayments_ok_payment_api(ExchangeTopUpQuoteResp exchangeTopUpQuoteResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) exchangeTopUpQuoteResp.quoteToken, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, exchangeTopUpQuoteResp.quoteToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) exchangeTopUpQuoteResp.price, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, exchangeTopUpQuoteResp.price);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) exchangeTopUpQuoteResp.baseAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, exchangeTopUpQuoteResp.baseAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) exchangeTopUpQuoteResp.quoteAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, exchangeTopUpQuoteResp.quoteAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) exchangeTopUpQuoteResp.totalPaidAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, exchangeTopUpQuoteResp.totalPaidAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) exchangeTopUpQuoteResp.baseCurrencySymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, exchangeTopUpQuoteResp.baseCurrencySymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) exchangeTopUpQuoteResp.quoteCurrencySymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, exchangeTopUpQuoteResp.quoteCurrencySymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) exchangeTopUpQuoteResp.totalPaidCurrency, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, exchangeTopUpQuoteResp.totalPaidCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) exchangeTopUpQuoteResp.tradeType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, exchangeTopUpQuoteResp.tradeType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || exchangeTopUpQuoteResp.activityQuoteTime != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 9, exchangeTopUpQuoteResp.activityQuoteTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) exchangeTopUpQuoteResp.baseColorfulIconUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, exchangeTopUpQuoteResp.baseColorfulIconUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) exchangeTopUpQuoteResp.baseCurrencyIconUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, exchangeTopUpQuoteResp.baseCurrencyIconUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) exchangeTopUpQuoteResp.baseCurrencyNightIconUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, exchangeTopUpQuoteResp.baseCurrencyNightIconUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || exchangeTopUpQuoteResp.localizedAddFrom != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, LocalizedAddFrom$$serializer.INSTANCE, exchangeTopUpQuoteResp.localizedAddFrom);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd(exchangeTopUpQuoteResp.localizedFeeInfo, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 14, kSerializerArr[14], exchangeTopUpQuoteResp.localizedFeeInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd(exchangeTopUpQuoteResp.localizedNetworkInfo, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 15, kSerializerArr[15], exchangeTopUpQuoteResp.localizedNetworkInfo);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) && exchangeTopUpQuoteResp.totalFiatFee == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.INSTANCE, exchangeTopUpQuoteResp.totalFiatFee);
    }

    public ExchangeTopUpQuoteResp(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, int i, @NotNull String str10, @NotNull String str11, @NotNull String str12, LocalizedAddFrom localizedAddFrom, @NotNull ArrayList<LocalizedFeeInfo> arrayList, @NotNull ArrayList<LocalizedNetworkInfo> arrayList2, String str13) {
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
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(arrayList2, "");
        this.quoteToken = str;
        this.price = str2;
        this.baseAmount = str3;
        this.quoteAmount = str4;
        this.totalPaidAmount = str5;
        this.baseCurrencySymbol = str6;
        this.quoteCurrencySymbol = str7;
        this.totalPaidCurrency = str8;
        this.tradeType = str9;
        this.activityQuoteTime = i;
        this.baseColorfulIconUrl = str10;
        this.baseCurrencyIconUrl = str11;
        this.baseCurrencyNightIconUrl = str12;
        this.localizedAddFrom = localizedAddFrom;
        this.localizedFeeInfo = arrayList;
        this.localizedNetworkInfo = arrayList2;
        this.totalFiatFee = str13;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00bc: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r36v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r36v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r36v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r36v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r36v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r36v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r36v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r36v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r36v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x004c: ARITH (r36v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r28v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r36v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r36v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r36v0 int) & (4096 int) A[WRAPPED]) == (0 int)) ? (r31v0 java.lang.String) : (""))
  (wrap:com.okinc.okpaymentapi.data.remote.model.experience.LocalizedAddFrom:?: TERNARY null = ((wrap:int:0x006b: ARITH (r36v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okpaymentapi.data.remote.model.experience.LocalizedAddFrom) : (r32v0 com.okinc.okpaymentapi.data.remote.model.experience.LocalizedAddFrom))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0073: ARITH (r36v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0079: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:97) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r33v0 java.util.ArrayList))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0082: ARITH (r36v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0088: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:98) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r34v0 java.util.ArrayList))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0090: ARITH (r36v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r35v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, com.okinc.okpaymentapi.data.remote.model.experience.LocalizedAddFrom, java.util.ArrayList<com.okinc.okpaymentapi.data.remote.model.experience.LocalizedFeeInfo>, java.util.ArrayList<com.okinc.okpaymentapi.data.remote.model.experience.LocalizedNetworkInfo>, java.lang.String):void (m)] (LINE:82) call: com.okinc.okpaymentapi.data.remote.model.experience.ExchangeTopUpQuoteResp.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, com.okinc.okpaymentapi.data.remote.model.experience.LocalizedAddFrom, java.util.ArrayList, java.util.ArrayList, java.lang.String):void type: THIS */
    public /* synthetic */ ExchangeTopUpQuoteResp(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, String str10, String str11, String str12, LocalizedAddFrom localizedAddFrom, ArrayList arrayList, ArrayList arrayList2, String str13, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? "" : str5, (i2 & 32) != 0 ? "" : str6, (i2 & 64) != 0 ? "" : str7, (i2 & 128) != 0 ? "" : str8, (i2 & 256) != 0 ? "" : str9, (i2 & 512) != 0 ? 0 : i, (i2 & 1024) != 0 ? "" : str10, (i2 & 2048) != 0 ? "" : str11, (i2 & 4096) == 0 ? str12 : "", (i2 & 8192) != 0 ? null : localizedAddFrom, (i2 & 16384) != 0 ? new ArrayList() : arrayList, (i2 & 32768) != 0 ? new ArrayList() : arrayList2, (i2 & 65536) != 0 ? null : str13);
    }
}
