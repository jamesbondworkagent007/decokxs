package com.okinc.okpaymentapi.data.remote.model.experience;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.AudioStats;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.okpaymentapi.data.remote.model.management.EarnOption;
import com.okinc.okpaymentapi.data.remote.model.management.EarnOption$$serializer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PairSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C46871tfO;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class CurrencyToken implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private final String availableBalance;
    private final boolean channelAvailable;
    private final List<String> countryNames;
    private final String cryptoToLocalCurrencyPrice;
    private final String currency;
    private final String currencyId;
    private final String currencyName;
    private final DexInfo dexInfo;
    private final String displayName;
    private final EarnOption earnOption;
    private final String earnRate;
    private boolean fiatFlag;
    private final boolean hidden;
    private final String icon;
    private final String nightIcon;
    private Pair<Double, String> percentage;
    private String price;
    private final int priceScale;
    private final List<Integer> quickAmountList;
    private final int scale;
    private final String symbol;
    private String tradeRange;
    private final List<String> tradeSupportedCurrencies;
    private boolean transferable;
    private final double usdRate;
    private final String valuation;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<CurrencyToken> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<CurrencyToken> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CurrencyToken createFromParcel(Parcel parcel) {
            int i;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            boolean z = parcel.readInt() != 0;
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            boolean z2 = parcel.readInt() != 0;
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            int i2 = parcel.readInt();
            int i3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i3);
            int i4 = 0;
            while (true) {
                i = parcel.readInt();
                if (i4 == i3) {
                    break;
                }
                arrayList.add(Integer.valueOf(i));
                i4++;
            }
            return new CurrencyToken(string, z, arrayListCreateStringArrayList, string2, string3, string4, string5, z2, string6, string7, i2, arrayList, i, parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : EarnOption.CREATOR.createFromParcel(parcel), parcel.createStringArrayList(), parcel.readString(), (Pair) parcel.readSerializable(), parcel.readInt() != 0, parcel.readInt() != 0, DexInfo.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CurrencyToken[] newArray(int i) {
            return new CurrencyToken[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CurrencyToken() {
        this((String) null, false, (List) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, 0, (List) null, 0, (String) null, (String) null, AudioStats.AUDIO_AMPLITUDE_NONE, (String) null, (String) null, (String) null, (EarnOption) null, (List) null, (String) null, (Pair) null, false, false, (DexInfo) null, 67108863, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.availableBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.nightIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component11() {
        return this.priceScale;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> component12() {
        return this.quickAmountList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component13() {
        return this.scale;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.tradeRange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double component16() {
        return this.usdRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.valuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.cryptoToLocalCurrencyPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.earnRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.channelAvailable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EarnOption component20() {
        return this.earnOption;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component21() {
        return this.tradeSupportedCurrencies;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Pair<Double, String> component23() {
        return this.percentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component24() {
        return this.fiatFlag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component25() {
        return this.transferable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexInfo component26() {
        return this.dexInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component3() {
        return this.countryNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.currency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.currencyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.displayName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component8() {
        return this.hidden;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CurrencyToken copy(@NotNull String str, boolean z, @NotNull List<String> list, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, boolean z2, @NotNull String str6, @NotNull String str7, int i, @NotNull List<Integer> list2, int i2, @NotNull String str8, @NotNull String str9, double d, @NotNull String str10, @NotNull String str11, String str12, EarnOption earnOption, @NotNull List<String> list3, @NotNull String str13, @NotNull Pair<Double, String> pair, boolean z3, boolean z4, @NotNull DexInfo dexInfo) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(dexInfo, "");
        return new CurrencyToken(str, z, list, str2, str3, str4, str5, z2, str6, str7, i, list2, i2, str8, str9, d, str10, str11, str12, earnOption, list3, str13, pair, z3, z4, dexInfo);
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
        if (!(obj instanceof CurrencyToken)) {
            return false;
        }
        CurrencyToken currencyToken = (CurrencyToken) obj;
        return Intrinsics.EZpvd((Object) this.availableBalance, (Object) currencyToken.availableBalance) && this.channelAvailable == currencyToken.channelAvailable && Intrinsics.EZpvd(this.countryNames, currencyToken.countryNames) && Intrinsics.EZpvd((Object) this.currency, (Object) currencyToken.currency) && Intrinsics.EZpvd((Object) this.currencyId, (Object) currencyToken.currencyId) && Intrinsics.EZpvd((Object) this.currencyName, (Object) currencyToken.currencyName) && Intrinsics.EZpvd((Object) this.displayName, (Object) currencyToken.displayName) && this.hidden == currencyToken.hidden && Intrinsics.EZpvd((Object) this.icon, (Object) currencyToken.icon) && Intrinsics.EZpvd((Object) this.nightIcon, (Object) currencyToken.nightIcon) && this.priceScale == currencyToken.priceScale && Intrinsics.EZpvd(this.quickAmountList, currencyToken.quickAmountList) && this.scale == currencyToken.scale && Intrinsics.EZpvd((Object) this.symbol, (Object) currencyToken.symbol) && Intrinsics.EZpvd((Object) this.tradeRange, (Object) currencyToken.tradeRange) && Double.compare(this.usdRate, currencyToken.usdRate) == 0 && Intrinsics.EZpvd((Object) this.valuation, (Object) currencyToken.valuation) && Intrinsics.EZpvd((Object) this.cryptoToLocalCurrencyPrice, (Object) currencyToken.cryptoToLocalCurrencyPrice) && Intrinsics.EZpvd((Object) this.earnRate, (Object) currencyToken.earnRate) && Intrinsics.EZpvd(this.earnOption, currencyToken.earnOption) && Intrinsics.EZpvd(this.tradeSupportedCurrencies, currencyToken.tradeSupportedCurrencies) && Intrinsics.EZpvd((Object) this.price, (Object) currencyToken.price) && Intrinsics.EZpvd(this.percentage, currencyToken.percentage) && this.fiatFlag == currencyToken.fiatFlag && this.transferable == currencyToken.transferable && Intrinsics.EZpvd(this.dexInfo, currencyToken.dexInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvailableBalance() {
        return this.availableBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getChannelAvailable() {
        return this.channelAvailable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getCountryNames() {
        return this.countryNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCryptoToLocalCurrencyPrice() {
        return this.cryptoToLocalCurrencyPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrency() {
        return this.currency;
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
    public final DexInfo getDexInfo() {
        return this.dexInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EarnOption getEarnOption() {
        return this.earnOption;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEarnRate() {
        return this.earnRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getFiatFlag() {
        return this.fiatFlag;
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
    public final Pair<Double, String> getPercentage() {
        return this.percentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrice() {
        return this.price;
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
    public final String getTradeRange() {
        return this.tradeRange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getTradeSupportedCurrencies() {
        return this.tradeSupportedCurrencies;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getTransferable() {
        return this.transferable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double getUsdRate() {
        return this.usdRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValuation() {
        return this.valuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.availableBalance.hashCode();
        int iHashCode2 = Boolean.hashCode(this.channelAvailable);
        int iHashCode3 = this.countryNames.hashCode();
        int iHashCode4 = this.currency.hashCode();
        int iHashCode5 = this.currencyId.hashCode();
        int iHashCode6 = this.currencyName.hashCode();
        int iHashCode7 = this.displayName.hashCode();
        int iHashCode8 = Boolean.hashCode(this.hidden);
        int iHashCode9 = this.icon.hashCode();
        int iHashCode10 = this.nightIcon.hashCode();
        int iHashCode11 = Integer.hashCode(this.priceScale);
        int iHashCode12 = this.quickAmountList.hashCode();
        int iHashCode13 = Integer.hashCode(this.scale);
        int iHashCode14 = this.symbol.hashCode();
        int iHashCode15 = this.tradeRange.hashCode();
        int iHashCode16 = Double.hashCode(this.usdRate);
        int iHashCode17 = this.valuation.hashCode();
        int iHashCode18 = this.cryptoToLocalCurrencyPrice.hashCode();
        String str = this.earnRate;
        int iHashCode19 = str == null ? 0 : str.hashCode();
        EarnOption earnOption = this.earnOption;
        return (((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + (earnOption != null ? earnOption.hashCode() : 0)) * 31) + this.tradeSupportedCurrencies.hashCode()) * 31) + this.price.hashCode()) * 31) + this.percentage.hashCode()) * 31) + Boolean.hashCode(this.fiatFlag)) * 31) + Boolean.hashCode(this.transferable)) * 31) + this.dexInfo.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFiatFlag(boolean z) {
        this.fiatFlag = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPercentage(@NotNull Pair<Double, String> pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        this.percentage = pair;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.price = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTradeRange(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tradeRange = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTransferable(boolean z) {
        this.transferable = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CurrencyToken(availableBalance=" + this.availableBalance + ", channelAvailable=" + this.channelAvailable + ", countryNames=" + this.countryNames + ", currency=" + this.currency + ", currencyId=" + this.currencyId + ", currencyName=" + this.currencyName + ", displayName=" + this.displayName + ", hidden=" + this.hidden + ", icon=" + this.icon + ", nightIcon=" + this.nightIcon + ", priceScale=" + this.priceScale + ", quickAmountList=" + this.quickAmountList + ", scale=" + this.scale + ", symbol=" + this.symbol + ", tradeRange=" + this.tradeRange + ", usdRate=" + this.usdRate + ", valuation=" + this.valuation + ", cryptoToLocalCurrencyPrice=" + this.cryptoToLocalCurrencyPrice + ", earnRate=" + this.earnRate + ", earnOption=" + this.earnOption + ", tradeSupportedCurrencies=" + this.tradeSupportedCurrencies + ", price=" + this.price + ", percentage=" + this.percentage + ", fiatFlag=" + this.fiatFlag + ", transferable=" + this.transferable + ", dexInfo=" + this.dexInfo + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.availableBalance);
        parcel.writeInt(this.channelAvailable ? 1 : 0);
        parcel.writeStringList(this.countryNames);
        parcel.writeString(this.currency);
        parcel.writeString(this.currencyId);
        parcel.writeString(this.currencyName);
        parcel.writeString(this.displayName);
        parcel.writeInt(this.hidden ? 1 : 0);
        parcel.writeString(this.icon);
        parcel.writeString(this.nightIcon);
        parcel.writeInt(this.priceScale);
        List<Integer> list = this.quickAmountList;
        parcel.writeInt(list.size());
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeInt(it.next().intValue());
        }
        parcel.writeInt(this.scale);
        parcel.writeString(this.symbol);
        parcel.writeString(this.tradeRange);
        parcel.writeDouble(this.usdRate);
        parcel.writeString(this.valuation);
        parcel.writeString(this.cryptoToLocalCurrencyPrice);
        parcel.writeString(this.earnRate);
        EarnOption earnOption = this.earnOption;
        if (earnOption == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            earnOption.writeToParcel(parcel, i);
        }
        parcel.writeStringList(this.tradeSupportedCurrencies);
        parcel.writeString(this.price);
        parcel.writeSerializable(this.percentage);
        parcel.writeInt(this.fiatFlag ? 1 : 0);
        parcel.writeInt(this.transferable ? 1 : 0);
        this.dexInfo.writeToParcel(parcel, i);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okpaymentapi.data.remote.model.experience.CurrencyToken.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CurrencyToken> serializer() {
            return CurrencyToken$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, new ArrayListSerializer(stringSerializer), null, null, null, null, null, null, null, null, new ArrayListSerializer(IntSerializer.INSTANCE), null, null, null, null, null, null, null, null, new ArrayListSerializer(stringSerializer), null, new PairSerializer(DoubleSerializer.INSTANCE, stringSerializer), null, null, null};
    }

    public /* synthetic */ CurrencyToken(int i, String str, boolean z, List list, String str2, String str3, String str4, String str5, boolean z2, String str6, String str7, int i2, List list2, int i3, String str8, String str9, double d, String str10, String str11, String str12, EarnOption earnOption, List list3, String str13, Pair pair, boolean z3, boolean z4, DexInfo dexInfo, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.availableBalance = "";
        } else {
            this.availableBalance = str;
        }
        if ((i & 2) == 0) {
            this.channelAvailable = false;
        } else {
            this.channelAvailable = z;
        }
        this.countryNames = (i & 4) == 0 ? yDY.AhwBna() : list;
        if ((i & 8) == 0) {
            this.currency = "";
        } else {
            this.currency = str2;
        }
        if ((i & 16) == 0) {
            this.currencyId = "";
        } else {
            this.currencyId = str3;
        }
        if ((i & 32) == 0) {
            this.currencyName = "";
        } else {
            this.currencyName = str4;
        }
        if ((i & 64) == 0) {
            this.displayName = "";
        } else {
            this.displayName = str5;
        }
        if ((i & 128) == 0) {
            this.hidden = false;
        } else {
            this.hidden = z2;
        }
        if ((i & 256) == 0) {
            this.icon = "";
        } else {
            this.icon = str6;
        }
        if ((i & 512) == 0) {
            this.nightIcon = "";
        } else {
            this.nightIcon = str7;
        }
        if ((i & 1024) == 0) {
            this.priceScale = 0;
        } else {
            this.priceScale = i2;
        }
        this.quickAmountList = (i & 2048) == 0 ? yDY.AhwBna() : list2;
        if ((i & 4096) == 0) {
            this.scale = 0;
        } else {
            this.scale = i3;
        }
        if ((i & 8192) == 0) {
            this.symbol = "";
        } else {
            this.symbol = str8;
        }
        if ((i & 16384) == 0) {
            this.tradeRange = "";
        } else {
            this.tradeRange = str9;
        }
        this.usdRate = (32768 & i) == 0 ? AudioStats.AUDIO_AMPLITUDE_NONE : d;
        if ((65536 & i) == 0) {
            this.valuation = "";
        } else {
            this.valuation = str10;
        }
        if ((131072 & i) == 0) {
            this.cryptoToLocalCurrencyPrice = "";
        } else {
            this.cryptoToLocalCurrencyPrice = str11;
        }
        if ((262144 & i) == 0) {
            this.earnRate = null;
        } else {
            this.earnRate = str12;
        }
        if ((524288 & i) == 0) {
            this.earnOption = null;
        } else {
            this.earnOption = earnOption;
        }
        this.tradeSupportedCurrencies = (1048576 & i) == 0 ? yDY.AhwBna() : list3;
        this.price = (2097152 & i) == 0 ? "--" : str13;
        this.percentage = (4194304 & i) == 0 ? C46871tfO.EZpvd() : pair;
        if ((8388608 & i) == 0) {
            this.fiatFlag = false;
        } else {
            this.fiatFlag = z3;
        }
        if ((16777216 & i) == 0) {
            this.transferable = false;
        } else {
            this.transferable = z4;
        }
        this.dexInfo = (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) == 0 ? new DexInfo((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, (String) null, (String) null, false, false, (String) null, 65535, (DefaultConstructorMarker) null) : dexInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [49=6] */
    public static final /* synthetic */ void write$Self$OKPayments_ok_payment_api(CurrencyToken currencyToken, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) currencyToken.availableBalance, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, currencyToken.availableBalance);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || currencyToken.channelAvailable) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 1, currencyToken.channelAvailable);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(currencyToken.countryNames, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], currencyToken.countryNames);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) currencyToken.currency, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, currencyToken.currency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) currencyToken.currencyId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, currencyToken.currencyId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) currencyToken.currencyName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, currencyToken.currencyName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) currencyToken.displayName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, currencyToken.displayName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || currencyToken.hidden) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 7, currencyToken.hidden);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) currencyToken.icon, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, currencyToken.icon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) currencyToken.nightIcon, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, currencyToken.nightIcon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || currencyToken.priceScale != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 10, currencyToken.priceScale);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd(currencyToken.quickAmountList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 11, kSerializerArr[11], currencyToken.quickAmountList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || currencyToken.scale != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 12, currencyToken.scale);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) currencyToken.symbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, currencyToken.symbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) currencyToken.tradeRange, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, currencyToken.tradeRange);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || Double.compare(currencyToken.usdRate, AudioStats.AUDIO_AMPLITUDE_NONE) != 0) {
            compositeEncoder.encodeDoubleElement(serialDescriptor, 15, currencyToken.usdRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) currencyToken.valuation, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, currencyToken.valuation);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) currencyToken.cryptoToLocalCurrencyPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 17, currencyToken.cryptoToLocalCurrencyPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || currencyToken.earnRate != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, StringSerializer.INSTANCE, currencyToken.earnRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || currencyToken.earnOption != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, EarnOption$$serializer.INSTANCE, currencyToken.earnOption);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd(currencyToken.tradeSupportedCurrencies, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 20, kSerializerArr[20], currencyToken.tradeSupportedCurrencies);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !Intrinsics.EZpvd((Object) currencyToken.price, (Object) "--")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 21, currencyToken.price);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || !Intrinsics.EZpvd(currencyToken.percentage, C46871tfO.EZpvd())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 22, kSerializerArr[22], currencyToken.percentage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || currencyToken.fiatFlag) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 23, currencyToken.fiatFlag);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || currencyToken.transferable) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 24, currencyToken.transferable);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) && Intrinsics.EZpvd(currencyToken.dexInfo, new DexInfo((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, (String) null, (String) null, false, false, (String) null, 65535, (DefaultConstructorMarker) null))) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 25, DexInfo$$serializer.INSTANCE, currencyToken.dexInfo);
    }

    public CurrencyToken(@NotNull String str, boolean z, @NotNull List<String> list, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, boolean z2, @NotNull String str6, @NotNull String str7, int i, @NotNull List<Integer> list2, int i2, @NotNull String str8, @NotNull String str9, double d, @NotNull String str10, @NotNull String str11, String str12, EarnOption earnOption, @NotNull List<String> list3, @NotNull String str13, @NotNull Pair<Double, String> pair, boolean z3, boolean z4, @NotNull DexInfo dexInfo) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(dexInfo, "");
        this.availableBalance = str;
        this.channelAvailable = z;
        this.countryNames = list;
        this.currency = str2;
        this.currencyId = str3;
        this.currencyName = str4;
        this.displayName = str5;
        this.hidden = z2;
        this.icon = str6;
        this.nightIcon = str7;
        this.priceScale = i;
        this.quickAmountList = list2;
        this.scale = i2;
        this.symbol = str8;
        this.tradeRange = str9;
        this.usdRate = d;
        this.valuation = str10;
        this.cryptoToLocalCurrencyPrice = str11;
        this.earnRate = str12;
        this.earnOption = earnOption;
        this.tradeSupportedCurrencies = list3;
        this.price = str13;
        this.percentage = pair;
        this.fiatFlag = z3;
        this.transferable = z4;
        this.dexInfo = dexInfo;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0171: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r56v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000c: ARITH (r56v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r30v0 boolean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0014: ARITH (r56v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0018: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:55)) : (r31v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r56v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0027: ARITH (r56v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002f: ARITH (r56v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0037: ARITH (r56v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x003f: ARITH (r56v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? false : (r36v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0047: ARITH (r56v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004f: ARITH (r56v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r38v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0057: ARITH (r56v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r39v0 int))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x005f: ARITH (r56v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0063: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:64)) : (r40v0 java.util.List))
  (wrap:int:?: TERNARY null = ((wrap:int:0x006a: ARITH (r56v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r41v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0072: ARITH (r56v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007c: ARITH (r56v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r43v0 java.lang.String))
  (wrap:double:?: TERNARY null = ((wrap:int:0x0088: ARITH (r56v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x008c: SGET  A[WRAPPED] androidx.camera.video.AudioStats.AUDIO_AMPLITUDE_NONE double) : (r44v0 double))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0093: ARITH (r56v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r46v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x009e: ARITH (r56v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r47v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a9: ARITH (r56v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r48v0 java.lang.String))
  (wrap:com.okinc.okpaymentapi.data.remote.model.management.EarnOption:?: TERNARY null = ((wrap:int:0x00b6: ARITH (r56v0 int) & (524288 int) A[WRAPPED]) == (0 int)) ? (r49v0 com.okinc.okpaymentapi.data.remote.model.management.EarnOption) : (null com.okinc.okpaymentapi.data.remote.model.management.EarnOption))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x00bf: ARITH (r56v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00c3: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:73)) : (r50v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00cc: ARITH (r56v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? ("--") : (r51v0 java.lang.String))
  (wrap:kotlin.Pair:?: TERNARY null = ((wrap:int:0x00d7: ARITH (r56v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00db: INVOKE  STATIC call: o.tfO.EZpvd():kotlin.Pair A[MD:():kotlin.Pair<java.lang.Double, java.lang.String> (m), WRAPPED] (LINE:76)) : (r52v0 kotlin.Pair))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00e4: ARITH (r56v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? false : (r53v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00ef: ARITH (r56v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? false : (r54v0 boolean))
  (wrap:com.okinc.okpaymentapi.data.remote.model.experience.DexInfo:?: TERNARY null = ((wrap:int:0x00fa: ARITH (r56v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0135: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (0 int)
  (0 int)
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  false
  false
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (65535 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:83) call: com.okinc.okpaymentapi.data.remote.model.experience.DexInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r55v0 com.okinc.okpaymentapi.data.remote.model.experience.DexInfo))
 A[MD:(java.lang.String, boolean, java.util.List<java.lang.String>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, int, java.util.List<java.lang.Integer>, int, java.lang.String, java.lang.String, double, java.lang.String, java.lang.String, java.lang.String, com.okinc.okpaymentapi.data.remote.model.management.EarnOption, java.util.List<java.lang.String>, java.lang.String, kotlin.Pair<java.lang.Double, java.lang.String>, boolean, boolean, com.okinc.okpaymentapi.data.remote.model.experience.DexInfo):void (m)] (LINE:52) call: com.okinc.okpaymentapi.data.remote.model.experience.CurrencyToken.<init>(java.lang.String, boolean, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, int, java.util.List, int, java.lang.String, java.lang.String, double, java.lang.String, java.lang.String, java.lang.String, com.okinc.okpaymentapi.data.remote.model.management.EarnOption, java.util.List, java.lang.String, kotlin.Pair, boolean, boolean, com.okinc.okpaymentapi.data.remote.model.experience.DexInfo):void type: THIS */
    public /* synthetic */ CurrencyToken(String str, boolean z, List list, String str2, String str3, String str4, String str5, boolean z2, String str6, String str7, int i, List list2, int i2, String str8, String str9, double d, String str10, String str11, String str12, EarnOption earnOption, List list3, String str13, Pair pair, boolean z3, boolean z4, DexInfo dexInfo, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? false : z, (i3 & 4) != 0 ? yDY.AhwBna() : list, (i3 & 8) != 0 ? "" : str2, (i3 & 16) != 0 ? "" : str3, (i3 & 32) != 0 ? "" : str4, (i3 & 64) != 0 ? "" : str5, (i3 & 128) != 0 ? false : z2, (i3 & 256) != 0 ? "" : str6, (i3 & 512) != 0 ? "" : str7, (i3 & 1024) != 0 ? 0 : i, (i3 & 2048) != 0 ? yDY.AhwBna() : list2, (i3 & 4096) != 0 ? 0 : i2, (i3 & 8192) != 0 ? "" : str8, (i3 & 16384) != 0 ? "" : str9, (i3 & 32768) != 0 ? AudioStats.AUDIO_AMPLITUDE_NONE : d, (i3 & 65536) != 0 ? "" : str10, (i3 & 131072) != 0 ? "" : str11, (i3 & 262144) != 0 ? null : str12, (i3 & 524288) == 0 ? earnOption : null, (i3 & 1048576) != 0 ? yDY.AhwBna() : list3, (i3 & 2097152) != 0 ? "--" : str13, (i3 & 4194304) != 0 ? C46871tfO.EZpvd() : pair, (i3 & 8388608) != 0 ? false : z3, (i3 & 16777216) != 0 ? false : z4, (i3 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? new DexInfo((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, (String) null, (String) null, false, false, (String) null, 65535, (DefaultConstructorMarker) null) : dexInfo);
    }
}
