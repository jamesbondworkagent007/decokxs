package com.okinc.fiat.api.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PairSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C33129mqd;
import o.C33492mxV;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class FiatCryptoCoinBean implements IFiatCryptoCoin, Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private String availableBalance;
    private Boolean channelAvailable;
    private List<String> countryNames;
    private String currency;
    private String currencyId;
    private String currencyName;
    private String earnRate;
    private final boolean hidden;
    private String icon;
    private String nightIcon;
    private Pair<Double, String> priceLimit;
    private int priceScale;
    private List<Integer> quickAmountList;
    private int scale;
    private String symbol;
    private String tickerPrice;
    private String tradeRange;
    private String usdRate;
    private String valuation;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<FiatCryptoCoinBean> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<FiatCryptoCoinBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FiatCryptoCoinBean createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i = parcel.readInt();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            int i2 = parcel.readInt();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            int i3 = 0;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            Pair pair = (Pair) parcel.readSerializable();
            boolean z = parcel.readInt() != 0;
            int i4 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i4);
            while (i3 != i4) {
                arrayList.add(Integer.valueOf(parcel.readInt()));
                i3++;
                i4 = i4;
            }
            return new FiatCryptoCoinBean(string, string2, string3, i, string4, string5, string6, i2, string7, string8, string9, boolValueOf, arrayListCreateStringArrayList, string10, string11, pair, z, arrayList, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FiatCryptoCoinBean[] newArray(int i) {
            return new FiatCryptoCoinBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FiatCryptoCoinBean() {
        this((String) null, (String) null, (String) null, 0, (String) null, (String) null, (String) null, 0, (String) null, (String) null, (String) null, (Boolean) null, (List) null, (String) null, (String) null, (Pair) null, false, (List) null, (String) null, 524287, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.valuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.currencyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component12() {
        return this.channelAvailable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component13() {
        return this.countryNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.usdRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.tickerPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Pair<Double, String> component16() {
        return this.priceLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component17() {
        return this.hidden;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> component18() {
        return this.quickAmountList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.earnRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.availableBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.currency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.scale;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.tradeRange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component8() {
        return this.priceScale;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.nightIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FiatCryptoCoinBean copy(@NotNull String str, @NotNull String str2, String str3, int i, String str4, String str5, String str6, int i2, String str7, String str8, String str9, Boolean bool, @NotNull List<String> list, String str10, String str11, Pair<Double, String> pair, boolean z, @NotNull List<Integer> list2, String str12) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new FiatCryptoCoinBean(str, str2, str3, i, str4, str5, str6, i2, str7, str8, str9, bool, list, str10, str11, pair, z, list2, str12);
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
        if (!(obj instanceof FiatCryptoCoinBean)) {
            return false;
        }
        FiatCryptoCoinBean fiatCryptoCoinBean = (FiatCryptoCoinBean) obj;
        return Intrinsics.EZpvd((Object) this.valuation, (Object) fiatCryptoCoinBean.valuation) && Intrinsics.EZpvd((Object) this.availableBalance, (Object) fiatCryptoCoinBean.availableBalance) && Intrinsics.EZpvd((Object) this.currency, (Object) fiatCryptoCoinBean.currency) && this.scale == fiatCryptoCoinBean.scale && Intrinsics.EZpvd((Object) this.symbol, (Object) fiatCryptoCoinBean.symbol) && Intrinsics.EZpvd((Object) this.icon, (Object) fiatCryptoCoinBean.icon) && Intrinsics.EZpvd((Object) this.tradeRange, (Object) fiatCryptoCoinBean.tradeRange) && this.priceScale == fiatCryptoCoinBean.priceScale && Intrinsics.EZpvd((Object) this.nightIcon, (Object) fiatCryptoCoinBean.nightIcon) && Intrinsics.EZpvd((Object) this.currencyId, (Object) fiatCryptoCoinBean.currencyId) && Intrinsics.EZpvd((Object) this.currencyName, (Object) fiatCryptoCoinBean.currencyName) && Intrinsics.EZpvd(this.channelAvailable, fiatCryptoCoinBean.channelAvailable) && Intrinsics.EZpvd(this.countryNames, fiatCryptoCoinBean.countryNames) && Intrinsics.EZpvd((Object) this.usdRate, (Object) fiatCryptoCoinBean.usdRate) && Intrinsics.EZpvd((Object) this.tickerPrice, (Object) fiatCryptoCoinBean.tickerPrice) && Intrinsics.EZpvd(this.priceLimit, fiatCryptoCoinBean.priceLimit) && this.hidden == fiatCryptoCoinBean.hidden && Intrinsics.EZpvd(this.quickAmountList, fiatCryptoCoinBean.quickAmountList) && Intrinsics.EZpvd((Object) this.earnRate, (Object) fiatCryptoCoinBean.earnRate);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvailableBalance() {
        return this.availableBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getChannelAvailable() {
        return this.channelAvailable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getCountryNames() {
        return this.countryNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.fiat.api.bean.IFiatCryptoCoin
    public Boolean getCurrencyChannelAvailable() {
        return this.channelAvailable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.fiat.api.bean.IFiatCryptoCoin
    public int getCurrencyDecimal() {
        return this.scale;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrencyId() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrencyName() {
        return this.currencyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.fiat.api.bean.IFiatCryptoCoin
    public String getCurrencySimple() {
        return this.currency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.fiat.api.bean.IFiatCryptoCoin
    public String getDigitalCurrencyId() {
        String str = this.currencyId;
        return str == null ? "" : str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEarnRate() {
        return this.earnRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getHidden() {
        return this.hidden;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNightIcon() {
        return this.nightIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.fiat.api.bean.IFiatCryptoCoin
    public int getPriceDecimal() {
        return this.priceScale;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Pair<Double, String> getPriceLimit() {
        return this.priceLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPriceScale() {
        return this.priceScale;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> getQuickAmountList() {
        return this.quickAmountList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getScale() {
        return this.scale;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSymbol() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTickerPrice() {
        return this.tickerPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradeRange() {
        return this.tradeRange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUsdRate() {
        return this.usdRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValuation() {
        return this.valuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.valuation.hashCode();
        int iHashCode2 = this.availableBalance.hashCode();
        String str = this.currency;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        int iHashCode4 = Integer.hashCode(this.scale);
        String str2 = this.symbol;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.icon;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.tradeRange;
        int iHashCode7 = str4 == null ? 0 : str4.hashCode();
        int iHashCode8 = Integer.hashCode(this.priceScale);
        String str5 = this.nightIcon;
        int iHashCode9 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.currencyId;
        int iHashCode10 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.currencyName;
        int iHashCode11 = str7 == null ? 0 : str7.hashCode();
        Boolean bool = this.channelAvailable;
        int iHashCode12 = bool == null ? 0 : bool.hashCode();
        int iHashCode13 = this.countryNames.hashCode();
        String str8 = this.usdRate;
        int iHashCode14 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.tickerPrice;
        int iHashCode15 = str9 == null ? 0 : str9.hashCode();
        Pair<Double, String> pair = this.priceLimit;
        int iHashCode16 = pair == null ? 0 : pair.hashCode();
        int iHashCode17 = Boolean.hashCode(this.hidden);
        int iHashCode18 = this.quickAmountList.hashCode();
        String str10 = this.earnRate;
        return (((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + (str10 == null ? 0 : str10.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAvailableBalance(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.availableBalance = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChannelAvailable(Boolean bool) {
        this.channelAvailable = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCountryNames(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.countryNames = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrency(String str) {
        this.currency = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrencyId(String str) {
        this.currencyId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrencyName(String str) {
        this.currencyName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEarnRate(String str) {
        this.earnRate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIcon(String str) {
        this.icon = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNightIcon(String str) {
        this.nightIcon = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPriceLimit(Pair<Double, String> pair) {
        this.priceLimit = pair;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPriceScale(int i) {
        this.priceScale = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuickAmountList(@NotNull List<Integer> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.quickAmountList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setScale(int i) {
        this.scale = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSymbol(String str) {
        this.symbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTickerPrice(String str) {
        this.tickerPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTradeRange(String str) {
        this.tradeRange = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUsdRate(String str) {
        this.usdRate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setValuation(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.valuation = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FiatCryptoCoinBean(valuation=" + this.valuation + ", availableBalance=" + this.availableBalance + ", currency=" + this.currency + ", scale=" + this.scale + ", symbol=" + this.symbol + ", icon=" + this.icon + ", tradeRange=" + this.tradeRange + ", priceScale=" + this.priceScale + ", nightIcon=" + this.nightIcon + ", currencyId=" + this.currencyId + ", currencyName=" + this.currencyName + ", channelAvailable=" + this.channelAvailable + ", countryNames=" + this.countryNames + ", usdRate=" + this.usdRate + ", tickerPrice=" + this.tickerPrice + ", priceLimit=" + this.priceLimit + ", hidden=" + this.hidden + ", quickAmountList=" + this.quickAmountList + ", earnRate=" + this.earnRate + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.Parcel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v15, types: [int] */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v26 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        ?? BooleanValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.valuation);
        parcel.writeString(this.availableBalance);
        parcel.writeString(this.currency);
        parcel.writeInt(this.scale);
        parcel.writeString(this.symbol);
        parcel.writeString(this.icon);
        parcel.writeString(this.tradeRange);
        parcel.writeInt(this.priceScale);
        parcel.writeString(this.nightIcon);
        parcel.writeString(this.currencyId);
        parcel.writeString(this.currencyName);
        Boolean bool = this.channelAvailable;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        parcel.writeInt(BooleanValue);
        parcel.writeStringList(this.countryNames);
        parcel.writeString(this.usdRate);
        parcel.writeString(this.tickerPrice);
        parcel.writeSerializable(this.priceLimit);
        parcel.writeInt(this.hidden ? 1 : 0);
        List<Integer> list = this.quickAmountList;
        parcel.writeInt(list.size());
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeInt(it.next().intValue());
        }
        parcel.writeString(this.earnRate);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.fiat.api.bean.FiatCryptoCoinBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FiatCryptoCoinBean> serializer() {
            return FiatCryptoCoinBean$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(stringSerializer), null, null, new PairSerializer(DoubleSerializer.INSTANCE, stringSerializer), null, new ArrayListSerializer(IntSerializer.INSTANCE), null};
    }

    public /* synthetic */ FiatCryptoCoinBean(int i, String str, String str2, String str3, int i2, String str4, String str5, String str6, int i3, String str7, String str8, String str9, Boolean bool, List list, String str10, String str11, Pair pair, boolean z, List list2, String str12, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.valuation = "";
        } else {
            this.valuation = str;
        }
        if ((i & 2) == 0) {
            this.availableBalance = "";
        } else {
            this.availableBalance = str2;
        }
        if ((i & 4) == 0) {
            this.currency = "";
        } else {
            this.currency = str3;
        }
        if ((i & 8) == 0) {
            this.scale = 0;
        } else {
            this.scale = i2;
        }
        if ((i & 16) == 0) {
            this.symbol = "";
        } else {
            this.symbol = str4;
        }
        if ((i & 32) == 0) {
            this.icon = "";
        } else {
            this.icon = str5;
        }
        if ((i & 64) == 0) {
            this.tradeRange = "";
        } else {
            this.tradeRange = str6;
        }
        if ((i & 128) == 0) {
            this.priceScale = 0;
        } else {
            this.priceScale = i3;
        }
        if ((i & 256) == 0) {
            this.nightIcon = "";
        } else {
            this.nightIcon = str7;
        }
        if ((i & 512) == 0) {
            this.currencyId = "";
        } else {
            this.currencyId = str8;
        }
        if ((i & 1024) == 0) {
            this.currencyName = "";
        } else {
            this.currencyName = str9;
        }
        this.channelAvailable = (i & 2048) == 0 ? Boolean.TRUE : bool;
        this.countryNames = (i & 4096) == 0 ? new ArrayList() : list;
        this.usdRate = (i & 8192) == 0 ? "1" : str10;
        if ((i & 16384) == 0) {
            this.tickerPrice = "";
        } else {
            this.tickerPrice = str11;
        }
        if ((32768 & i) == 0) {
            this.priceLimit = null;
        } else {
            this.priceLimit = pair;
        }
        if ((65536 & i) == 0) {
            this.hidden = false;
        } else {
            this.hidden = z;
        }
        this.quickAmountList = (131072 & i) == 0 ? new ArrayList() : list2;
        if ((i & 262144) == 0) {
            this.earnRate = null;
        } else {
            this.earnRate = str12;
        }
    }

    public static final /* synthetic */ void write$Self$OKPayments_ok_payment_api(FiatCryptoCoinBean fiatCryptoCoinBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) fiatCryptoCoinBean.valuation, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, fiatCryptoCoinBean.valuation);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) fiatCryptoCoinBean.availableBalance, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, fiatCryptoCoinBean.availableBalance);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) fiatCryptoCoinBean.currency, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, fiatCryptoCoinBean.currency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || fiatCryptoCoinBean.scale != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 3, fiatCryptoCoinBean.scale);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) fiatCryptoCoinBean.symbol, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, fiatCryptoCoinBean.symbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) fiatCryptoCoinBean.icon, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, fiatCryptoCoinBean.icon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) fiatCryptoCoinBean.tradeRange, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, fiatCryptoCoinBean.tradeRange);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || fiatCryptoCoinBean.priceScale != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 7, fiatCryptoCoinBean.priceScale);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) fiatCryptoCoinBean.nightIcon, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, fiatCryptoCoinBean.nightIcon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) fiatCryptoCoinBean.currencyId, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, fiatCryptoCoinBean.currencyId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) fiatCryptoCoinBean.currencyName, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, fiatCryptoCoinBean.currencyName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd(fiatCryptoCoinBean.channelAvailable, Boolean.TRUE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, BooleanSerializer.INSTANCE, fiatCryptoCoinBean.channelAvailable);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd(fiatCryptoCoinBean.countryNames, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 12, kSerializerArr[12], fiatCryptoCoinBean.countryNames);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) fiatCryptoCoinBean.usdRate, (Object) "1")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, fiatCryptoCoinBean.usdRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) fiatCryptoCoinBean.tickerPrice, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, fiatCryptoCoinBean.tickerPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || fiatCryptoCoinBean.priceLimit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, kSerializerArr[15], fiatCryptoCoinBean.priceLimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || fiatCryptoCoinBean.hidden) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 16, fiatCryptoCoinBean.hidden);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd(fiatCryptoCoinBean.quickAmountList, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 17, kSerializerArr[17], fiatCryptoCoinBean.quickAmountList);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) && fiatCryptoCoinBean.earnRate == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, StringSerializer.INSTANCE, fiatCryptoCoinBean.earnRate);
    }

    public FiatCryptoCoinBean(@NotNull String str, @NotNull String str2, String str3, int i, String str4, String str5, String str6, int i2, String str7, String str8, String str9, Boolean bool, @NotNull List<String> list, String str10, String str11, Pair<Double, String> pair, boolean z, @NotNull List<Integer> list2, String str12) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.valuation = str;
        this.availableBalance = str2;
        this.currency = str3;
        this.scale = i;
        this.symbol = str4;
        this.icon = str5;
        this.tradeRange = str6;
        this.priceScale = i2;
        this.nightIcon = str7;
        this.currencyId = str8;
        this.currencyName = str9;
        this.channelAvailable = bool;
        this.countryNames = list;
        this.usdRate = str10;
        this.tickerPrice = str11;
        this.priceLimit = pair;
        this.hidden = z;
        this.quickAmountList = list2;
        this.earnRate = str12;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00dd: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r41v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r41v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r41v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x001c: ARITH (r41v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r25v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r41v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r41v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r41v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x003c: ARITH (r41v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r29v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r41v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r41v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r41v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x005c: ARITH (r41v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0060: SGET  A[WRAPPED] java.lang.Boolean.TRUE java.lang.Boolean) : (r33v0 java.lang.Boolean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0065: ARITH (r41v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x006b: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:32) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r34v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0071: ARITH (r41v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("1") : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007c: ARITH (r41v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
  (wrap:kotlin.Pair:?: TERNARY null = ((wrap:int:0x0088: ARITH (r41v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null kotlin.Pair) : (r37v0 kotlin.Pair))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0095: ARITH (r41v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? false : (r38v0 boolean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x00a0: ARITH (r41v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00a6: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:37) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r39v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ae: ARITH (r41v0 int) & (262144 int) A[WRAPPED]) == (0 int)) ? (r40v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.util.List<java.lang.String>, java.lang.String, java.lang.String, kotlin.Pair<java.lang.Double, java.lang.String>, boolean, java.util.List<java.lang.Integer>, java.lang.String):void (m)] (LINE:19) call: com.okinc.fiat.api.bean.FiatCryptoCoinBean.<init>(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.util.List, java.lang.String, java.lang.String, kotlin.Pair, boolean, java.util.List, java.lang.String):void type: THIS */
    public /* synthetic */ FiatCryptoCoinBean(String str, String str2, String str3, int i, String str4, String str5, String str6, int i2, String str7, String str8, String str9, Boolean bool, List list, String str10, String str11, Pair pair, boolean z, List list2, String str12, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? "" : str3, (i3 & 8) != 0 ? 0 : i, (i3 & 16) != 0 ? "" : str4, (i3 & 32) != 0 ? "" : str5, (i3 & 64) != 0 ? "" : str6, (i3 & 128) != 0 ? 0 : i2, (i3 & 256) != 0 ? "" : str7, (i3 & 512) != 0 ? "" : str8, (i3 & 1024) != 0 ? "" : str9, (i3 & 2048) != 0 ? Boolean.TRUE : bool, (i3 & 4096) != 0 ? new ArrayList() : list, (i3 & 8192) != 0 ? "1" : str10, (i3 & 16384) != 0 ? "" : str11, (i3 & 32768) != 0 ? null : pair, (i3 & 65536) != 0 ? false : z, (i3 & 131072) != 0 ? new ArrayList() : list2, (i3 & 262144) == 0 ? str12 : null);
    }

    @Override // com.okinc.fiat.api.bean.IFiatCryptoCoin
    public String getCurrencyIcon() {
        return C33492mxV.OLrzqt() ? this.nightIcon : this.icon;
    }

    @Override // com.okinc.fiat.api.bean.IFiatCryptoCoin
    public FiatCryptoRange getRange() {
        if (!C33129mqd.OLrzqt((CharSequence) this.tradeRange)) {
            return null;
        }
        String str = this.tradeRange;
        Intrinsics.copydefault((Object) str);
        return parseStrToRange(str);
    }

    private final FiatCryptoRange parseStrToRange(String str) {
        try {
            String str2 = (String) StringsKt__StringsKt.split$default((CharSequence) str, new String[]{","}, false, 0, 6, (Object) null).get(0);
            String str3 = (String) StringsKt__StringsKt.split$default((CharSequence) str, new String[]{","}, false, 0, 6, (Object) null).get(1);
            boolean zContains$default = StringsKt__StringsKt.contains$default((CharSequence) str2, (CharSequence) "[", false, 2, (Object) null);
            boolean zContains$default2 = StringsKt__StringsKt.contains$default((CharSequence) str3, (CharSequence) "]", false, 2, (Object) null);
            String strSubstring = str2.substring(1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            String strSubstring2 = str3.substring(0, str3.length() - 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
            return new FiatCryptoRange(strSubstring, strSubstring2, zContains$default, zContains$default2);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
