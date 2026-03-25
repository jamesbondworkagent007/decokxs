package com.okinc.crcore.shared.net.responsebean.bsc;

import androidx.camera.video.AudioStats;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.crcore.coreapi.net.responsebean.bsc.CurrencyTokenResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.bsc.DexInfoResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.bsc.EarnOptionResponseBean;
import com.okinc.crcore.shared.net.responsebean.bsc.DexInfoBean;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C33129mqd;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Serializable
public final class CurrencyTokenBean {
    private static final KSerializer<Object>[] $childSerializers;
    private final String availableBalance;
    private final boolean channelAvailable;
    private final List<String> countryNames;
    private final String cryptoToLocalCurrencyPrice;
    private final String currency;
    private final String currencyId;
    private final String currencyName;
    private final DexInfoBean dexInfoBean;
    private final String displayName;
    private final EarnOptionBean earnOption;
    private final String earnRate;
    private final boolean fiatFlag;
    private final boolean hidden;
    private final String icon;
    private final String nightIcon;
    private String percentage;
    private final double percentageValue;
    private String price;
    private final int priceScale;
    private final List<Integer> quickAmountList;
    private final int scale;
    private final String symbol;
    private final String tradeRange;
    private final List<String> tradeSupportedCurrencies;
    private final boolean transferable;
    private final double usdRate;
    private final String valuation;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CurrencyTokenBean() {
        this((String) null, false, (List) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, 0, (List) null, 0, (String) null, (String) null, AudioStats.AUDIO_AMPLITUDE_NONE, (String) null, (String) null, (String) null, (EarnOptionBean) null, (List) null, (String) null, (String) null, AudioStats.AUDIO_AMPLITUDE_NONE, false, false, (DexInfoBean) null, 134217727, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r17v0, resolved type: com.okinc.crcore.shared.net.responsebean.bsc.CurrencyTokenBean */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CurrencyTokenBean copy$default(CurrencyTokenBean currencyTokenBean, String str, boolean z, List list, String str2, String str3, String str4, String str5, boolean z2, String str6, String str7, int i, List list2, int i2, String str8, String str9, double d, String str10, String str11, String str12, EarnOptionBean earnOptionBean, List list3, String str13, String str14, double d2, boolean z3, boolean z4, DexInfoBean dexInfoBean, int i3, Object obj) {
        String str15 = (i3 & 1) != 0 ? currencyTokenBean.availableBalance : str;
        boolean z5 = (i3 & 2) != 0 ? currencyTokenBean.channelAvailable : z;
        List list4 = (i3 & 4) != 0 ? currencyTokenBean.countryNames : list;
        String str16 = (i3 & 8) != 0 ? currencyTokenBean.currency : str2;
        String str17 = (i3 & 16) != 0 ? currencyTokenBean.currencyId : str3;
        String str18 = (i3 & 32) != 0 ? currencyTokenBean.currencyName : str4;
        String str19 = (i3 & 64) != 0 ? currencyTokenBean.displayName : str5;
        boolean z6 = (i3 & 128) != 0 ? currencyTokenBean.hidden : z2;
        String str20 = (i3 & 256) != 0 ? currencyTokenBean.icon : str6;
        String str21 = (i3 & 512) != 0 ? currencyTokenBean.nightIcon : str7;
        int i4 = (i3 & 1024) != 0 ? currencyTokenBean.priceScale : i;
        List list5 = (i3 & 2048) != 0 ? currencyTokenBean.quickAmountList : list2;
        int i5 = (i3 & 4096) != 0 ? currencyTokenBean.scale : i2;
        return currencyTokenBean.copy(str15, z5, list4, str16, str17, str18, str19, z6, str20, str21, i4, list5, i5, (i3 & 8192) != 0 ? currencyTokenBean.symbol : str8, (i3 & 16384) != 0 ? currencyTokenBean.tradeRange : str9, (i3 & 32768) != 0 ? currencyTokenBean.usdRate : d, (i3 & 65536) != 0 ? currencyTokenBean.valuation : str10, (131072 & i3) != 0 ? currencyTokenBean.cryptoToLocalCurrencyPrice : str11, (i3 & 262144) != 0 ? currencyTokenBean.earnRate : str12, (i3 & 524288) != 0 ? currencyTokenBean.earnOption : earnOptionBean, (i3 & 1048576) != 0 ? currencyTokenBean.tradeSupportedCurrencies : list3, (i3 & 2097152) != 0 ? currencyTokenBean.price : str13, (i3 & 4194304) != 0 ? currencyTokenBean.percentage : str14, (i3 & 8388608) != 0 ? currencyTokenBean.percentageValue : d2, (i3 & 16777216) != 0 ? currencyTokenBean.fiatFlag : z3, (33554432 & i3) != 0 ? currencyTokenBean.transferable : z4, (i3 & 67108864) != 0 ? currencyTokenBean.dexInfoBean : dexInfoBean);
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
    public final EarnOptionBean component20() {
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
    public final String component23() {
        return this.percentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double component24() {
        return this.percentageValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component25() {
        return this.fiatFlag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component26() {
        return this.transferable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexInfoBean component27() {
        return this.dexInfoBean;
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
    public final CurrencyTokenBean copy(@NotNull String str, boolean z, @NotNull List<String> list, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, boolean z2, @NotNull String str6, @NotNull String str7, int i, @NotNull List<Integer> list2, int i2, @NotNull String str8, @NotNull String str9, double d, @NotNull String str10, @NotNull String str11, @NotNull String str12, EarnOptionBean earnOptionBean, @NotNull List<String> list3, @NotNull String str13, @NotNull String str14, double d2, boolean z3, boolean z4, @NotNull DexInfoBean dexInfoBean) {
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
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(dexInfoBean, "");
        return new CurrencyTokenBean(str, z, list, str2, str3, str4, str5, z2, str6, str7, i, list2, i2, str8, str9, d, str10, str11, str12, earnOptionBean, list3, str13, str14, d2, z3, z4, dexInfoBean);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CurrencyTokenBean)) {
            return false;
        }
        CurrencyTokenBean currencyTokenBean = (CurrencyTokenBean) obj;
        return Intrinsics.EZpvd((Object) this.availableBalance, (Object) currencyTokenBean.availableBalance) && this.channelAvailable == currencyTokenBean.channelAvailable && Intrinsics.EZpvd(this.countryNames, currencyTokenBean.countryNames) && Intrinsics.EZpvd((Object) this.currency, (Object) currencyTokenBean.currency) && Intrinsics.EZpvd((Object) this.currencyId, (Object) currencyTokenBean.currencyId) && Intrinsics.EZpvd((Object) this.currencyName, (Object) currencyTokenBean.currencyName) && Intrinsics.EZpvd((Object) this.displayName, (Object) currencyTokenBean.displayName) && this.hidden == currencyTokenBean.hidden && Intrinsics.EZpvd((Object) this.icon, (Object) currencyTokenBean.icon) && Intrinsics.EZpvd((Object) this.nightIcon, (Object) currencyTokenBean.nightIcon) && this.priceScale == currencyTokenBean.priceScale && Intrinsics.EZpvd(this.quickAmountList, currencyTokenBean.quickAmountList) && this.scale == currencyTokenBean.scale && Intrinsics.EZpvd((Object) this.symbol, (Object) currencyTokenBean.symbol) && Intrinsics.EZpvd((Object) this.tradeRange, (Object) currencyTokenBean.tradeRange) && Double.compare(this.usdRate, currencyTokenBean.usdRate) == 0 && Intrinsics.EZpvd((Object) this.valuation, (Object) currencyTokenBean.valuation) && Intrinsics.EZpvd((Object) this.cryptoToLocalCurrencyPrice, (Object) currencyTokenBean.cryptoToLocalCurrencyPrice) && Intrinsics.EZpvd((Object) this.earnRate, (Object) currencyTokenBean.earnRate) && Intrinsics.EZpvd(this.earnOption, currencyTokenBean.earnOption) && Intrinsics.EZpvd(this.tradeSupportedCurrencies, currencyTokenBean.tradeSupportedCurrencies) && Intrinsics.EZpvd((Object) this.price, (Object) currencyTokenBean.price) && Intrinsics.EZpvd((Object) this.percentage, (Object) currencyTokenBean.percentage) && Double.compare(this.percentageValue, currencyTokenBean.percentageValue) == 0 && this.fiatFlag == currencyTokenBean.fiatFlag && this.transferable == currencyTokenBean.transferable && Intrinsics.EZpvd(this.dexInfoBean, currencyTokenBean.dexInfoBean);
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
    public final DexInfoBean getDexInfoBean() {
        return this.dexInfoBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EarnOptionBean getEarnOption() {
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
    public final String getPercentage() {
        return this.percentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double getPercentageValue() {
        return this.percentageValue;
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
        int iHashCode19 = this.earnRate.hashCode();
        EarnOptionBean earnOptionBean = this.earnOption;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + (earnOptionBean == null ? 0 : earnOptionBean.hashCode())) * 31) + this.tradeSupportedCurrencies.hashCode()) * 31) + this.price.hashCode()) * 31) + this.percentage.hashCode()) * 31) + Double.hashCode(this.percentageValue)) * 31) + Boolean.hashCode(this.fiatFlag)) * 31) + Boolean.hashCode(this.transferable)) * 31) + this.dexInfoBean.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPercentage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.percentage = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.price = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CurrencyTokenBean(availableBalance=" + this.availableBalance + ", channelAvailable=" + this.channelAvailable + ", countryNames=" + this.countryNames + ", currency=" + this.currency + ", currencyId=" + this.currencyId + ", currencyName=" + this.currencyName + ", displayName=" + this.displayName + ", hidden=" + this.hidden + ", icon=" + this.icon + ", nightIcon=" + this.nightIcon + ", priceScale=" + this.priceScale + ", quickAmountList=" + this.quickAmountList + ", scale=" + this.scale + ", symbol=" + this.symbol + ", tradeRange=" + this.tradeRange + ", usdRate=" + this.usdRate + ", valuation=" + this.valuation + ", cryptoToLocalCurrencyPrice=" + this.cryptoToLocalCurrencyPrice + ", earnRate=" + this.earnRate + ", earnOption=" + this.earnOption + ", tradeSupportedCurrencies=" + this.tradeSupportedCurrencies + ", price=" + this.price + ", percentage=" + this.percentage + ", percentageValue=" + this.percentageValue + ", fiatFlag=" + this.fiatFlag + ", transferable=" + this.transferable + ", dexInfoBean=" + this.dexInfoBean + ")";
    }

    public /* synthetic */ CurrencyTokenBean(int i, String str, boolean z, List list, String str2, String str3, String str4, String str5, boolean z2, String str6, String str7, int i2, List list2, int i3, String str8, String str9, double d, String str10, String str11, String str12, EarnOptionBean earnOptionBean, List list3, String str13, String str14, double d2, boolean z3, boolean z4, DexInfoBean dexInfoBean, SerializationConstructorMarker serializationConstructorMarker) {
        DexInfoBean dexInfoBean2;
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
        if ((32768 & i) == 0) {
            this.usdRate = AudioStats.AUDIO_AMPLITUDE_NONE;
        } else {
            this.usdRate = d;
        }
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
            this.earnRate = "";
        } else {
            this.earnRate = str12;
        }
        this.earnOption = (524288 & i) == 0 ? null : earnOptionBean;
        this.tradeSupportedCurrencies = (1048576 & i) == 0 ? yDY.AhwBna() : list3;
        if ((2097152 & i) == 0) {
            this.price = "";
        } else {
            this.price = str13;
        }
        if ((4194304 & i) == 0) {
            this.percentage = "";
        } else {
            this.percentage = str14;
        }
        if ((8388608 & i) == 0) {
            this.percentageValue = AudioStats.AUDIO_AMPLITUDE_NONE;
        } else {
            this.percentageValue = d2;
        }
        if ((16777216 & i) == 0) {
            this.fiatFlag = false;
        } else {
            this.fiatFlag = z3;
        }
        if ((33554432 & i) == 0) {
            this.transferable = false;
        } else {
            this.transferable = z4;
        }
        if ((i & 67108864) == 0) {
            String str15 = null;
            int i4 = 0;
            String str16 = null;
            dexInfoBean2 = new DexInfoBean(str15, str15, str15, str15, str15, str15, str15, str15, str15, i4, i4, str16, str16, false, 16383, (DefaultConstructorMarker) null);
        } else {
            dexInfoBean2 = dexInfoBean;
        }
        this.dexInfoBean = dexInfoBean2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [15=5] */
    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(CurrencyTokenBean currencyTokenBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) currencyTokenBean.availableBalance, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, currencyTokenBean.availableBalance);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || currencyTokenBean.channelAvailable) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 1, currencyTokenBean.channelAvailable);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(currencyTokenBean.countryNames, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], currencyTokenBean.countryNames);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) currencyTokenBean.currency, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, currencyTokenBean.currency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) currencyTokenBean.currencyId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, currencyTokenBean.currencyId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) currencyTokenBean.currencyName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, currencyTokenBean.currencyName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) currencyTokenBean.displayName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, currencyTokenBean.displayName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || currencyTokenBean.hidden) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 7, currencyTokenBean.hidden);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) currencyTokenBean.icon, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, currencyTokenBean.icon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) currencyTokenBean.nightIcon, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, currencyTokenBean.nightIcon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || currencyTokenBean.priceScale != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 10, currencyTokenBean.priceScale);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd(currencyTokenBean.quickAmountList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 11, kSerializerArr[11], currencyTokenBean.quickAmountList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || currencyTokenBean.scale != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 12, currencyTokenBean.scale);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) currencyTokenBean.symbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, currencyTokenBean.symbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) currencyTokenBean.tradeRange, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, currencyTokenBean.tradeRange);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || Double.compare(currencyTokenBean.usdRate, AudioStats.AUDIO_AMPLITUDE_NONE) != 0) {
            compositeEncoder.encodeDoubleElement(serialDescriptor, 15, currencyTokenBean.usdRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) currencyTokenBean.valuation, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, currencyTokenBean.valuation);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) currencyTokenBean.cryptoToLocalCurrencyPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 17, currencyTokenBean.cryptoToLocalCurrencyPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd((Object) currencyTokenBean.earnRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 18, currencyTokenBean.earnRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || currencyTokenBean.earnOption != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, EarnOptionBean$$serializer.INSTANCE, currencyTokenBean.earnOption);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd(currencyTokenBean.tradeSupportedCurrencies, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 20, kSerializerArr[20], currencyTokenBean.tradeSupportedCurrencies);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !Intrinsics.EZpvd((Object) currencyTokenBean.price, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 21, currencyTokenBean.price);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || !Intrinsics.EZpvd((Object) currencyTokenBean.percentage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 22, currencyTokenBean.percentage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || Double.compare(currencyTokenBean.percentageValue, AudioStats.AUDIO_AMPLITUDE_NONE) != 0) {
            compositeEncoder.encodeDoubleElement(serialDescriptor, 23, currencyTokenBean.percentageValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || currencyTokenBean.fiatFlag) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 24, currencyTokenBean.fiatFlag);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || currencyTokenBean.transferable) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 25, currencyTokenBean.transferable);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) && Intrinsics.EZpvd(currencyTokenBean.dexInfoBean, new DexInfoBean((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, (String) null, (String) null, false, 16383, (DefaultConstructorMarker) null))) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 26, DexInfoBean$$serializer.INSTANCE, currencyTokenBean.dexInfoBean);
    }

    public CurrencyTokenBean(@NotNull String str, boolean z, @NotNull List<String> list, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, boolean z2, @NotNull String str6, @NotNull String str7, int i, @NotNull List<Integer> list2, int i2, @NotNull String str8, @NotNull String str9, double d, @NotNull String str10, @NotNull String str11, @NotNull String str12, EarnOptionBean earnOptionBean, @NotNull List<String> list3, @NotNull String str13, @NotNull String str14, double d2, boolean z3, boolean z4, @NotNull DexInfoBean dexInfoBean) {
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
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(dexInfoBean, "");
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
        this.earnOption = earnOptionBean;
        this.tradeSupportedCurrencies = list3;
        this.price = str13;
        this.percentage = str14;
        this.percentageValue = d2;
        this.fiatFlag = z3;
        this.transferable = z4;
        this.dexInfoBean = dexInfoBean;
    }

    public /* synthetic */ CurrencyTokenBean(String str, boolean z, List list, String str2, String str3, String str4, String str5, boolean z2, String str6, String str7, int i, List list2, int i2, String str8, String str9, double d, String str10, String str11, String str12, EarnOptionBean earnOptionBean, List list3, String str13, String str14, double d2, boolean z3, boolean z4, DexInfoBean dexInfoBean, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        DexInfoBean dexInfoBean2;
        String str15 = (i3 & 1) != 0 ? "" : str;
        boolean z5 = (i3 & 2) != 0 ? false : z;
        List listAhwBna = (i3 & 4) != 0 ? yDY.AhwBna() : list;
        String str16 = (i3 & 8) != 0 ? "" : str2;
        String str17 = (i3 & 16) != 0 ? "" : str3;
        String str18 = (i3 & 32) != 0 ? "" : str4;
        String str19 = (i3 & 64) != 0 ? "" : str5;
        boolean z6 = (i3 & 128) != 0 ? false : z2;
        String str20 = (i3 & 256) != 0 ? "" : str6;
        String str21 = (i3 & 512) != 0 ? "" : str7;
        int i4 = (i3 & 1024) != 0 ? 0 : i;
        List listAhwBna2 = (i3 & 2048) != 0 ? yDY.AhwBna() : list2;
        int i5 = (i3 & 4096) != 0 ? 0 : i2;
        String str22 = (i3 & 8192) != 0 ? "" : str8;
        String str23 = (i3 & 16384) != 0 ? "" : str9;
        int i6 = i3 & 32768;
        double d3 = AudioStats.AUDIO_AMPLITUDE_NONE;
        double d4 = i6 != 0 ? 0.0d : d;
        String str24 = (i3 & 65536) != 0 ? "" : str10;
        String str25 = (i3 & 131072) != 0 ? "" : str11;
        String str26 = (i3 & 262144) != 0 ? "" : str12;
        EarnOptionBean earnOptionBean2 = (i3 & 524288) != 0 ? null : earnOptionBean;
        List listAhwBna3 = (i3 & 1048576) != 0 ? yDY.AhwBna() : list3;
        String str27 = (i3 & 2097152) != 0 ? "" : str13;
        String str28 = (i3 & 4194304) != 0 ? "" : str14;
        d3 = (i3 & 8388608) == 0 ? d2 : d3;
        boolean z7 = (i3 & 16777216) != 0 ? false : z3;
        boolean z8 = (i3 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? false : z4;
        if ((i3 & 67108864) != 0) {
            String str29 = null;
            int i7 = 0;
            String str30 = null;
            dexInfoBean2 = new DexInfoBean(str29, str29, str29, str29, str29, str29, str29, str29, str29, i7, i7, str30, str30, false, 16383, (DefaultConstructorMarker) null);
        } else {
            dexInfoBean2 = dexInfoBean;
        }
        this(str15, z5, listAhwBna, str16, str17, str18, str19, z6, str20, str21, i4, listAhwBna2, i5, str22, str23, d4, str24, str25, str26, earnOptionBean2, listAhwBna3, str27, str28, d3, z7, z8, dexInfoBean2);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.shared.net.responsebean.bsc.CurrencyTokenBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CurrencyTokenBean> serializer() {
            return CurrencyTokenBean$$serializer.INSTANCE;
        }

        public final CurrencyTokenBean OLrzqt(@NotNull CurrencyTokenResponseBean currencyTokenResponseBean) {
            String symbol;
            Intrinsics.checkNotNullParameter(currencyTokenResponseBean, "");
            String availableBalance = currencyTokenResponseBean.getAvailableBalance();
            boolean channelAvailable = currencyTokenResponseBean.getChannelAvailable();
            List<String> countryNames = currencyTokenResponseBean.getCountryNames();
            String currency = currencyTokenResponseBean.getCurrency();
            String currencyId = currencyTokenResponseBean.getCurrencyId();
            if (C33129mqd.OLrzqt((CharSequence) currencyTokenResponseBean.getCurrencyName())) {
                symbol = currencyTokenResponseBean.getCurrencyName();
            } else {
                symbol = currencyTokenResponseBean.getSymbol();
            }
            String str = symbol;
            String displayName = currencyTokenResponseBean.getDisplayName();
            boolean hidden = currencyTokenResponseBean.getHidden();
            String icon = currencyTokenResponseBean.getIcon();
            String nightIcon = currencyTokenResponseBean.getNightIcon();
            int priceScale = currencyTokenResponseBean.getPriceScale();
            List<Integer> quickAmountList = currencyTokenResponseBean.getQuickAmountList();
            int scale = currencyTokenResponseBean.getScale();
            String symbol2 = currencyTokenResponseBean.getSymbol();
            String tradeRange = currencyTokenResponseBean.getTradeRange();
            double usdRate = currencyTokenResponseBean.getUsdRate();
            String valuation = currencyTokenResponseBean.getValuation();
            String cryptoToLocalCurrencyPrice = currencyTokenResponseBean.getCryptoToLocalCurrencyPrice();
            String earnRate = currencyTokenResponseBean.getEarnRate();
            EarnOptionResponseBean earnOption = currencyTokenResponseBean.getEarnOption();
            EarnOptionBean earnOptionBeanKWHzl = earnOption != null ? EarnOptionBean.Companion.KWHzl(earnOption) : null;
            List<String> tradeSupportedCurrencies = currencyTokenResponseBean.getTradeSupportedCurrencies();
            String price = currencyTokenResponseBean.getPrice();
            String percentage = currencyTokenResponseBean.getPercentage();
            double percentageValue = currencyTokenResponseBean.getPercentageValue();
            boolean fiatFlag = currencyTokenResponseBean.getFiatFlag();
            boolean transferable = currencyTokenResponseBean.getTransferable();
            DexInfoBean.Companion companion = DexInfoBean.Companion;
            DexInfoResponseBean dexInfo = currencyTokenResponseBean.getDexInfo();
            if (dexInfo == null) {
                dexInfo = new DexInfoResponseBean((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, (String) null, (String) null, false, 8191, (DefaultConstructorMarker) null);
            }
            return new CurrencyTokenBean(availableBalance, channelAvailable, countryNames, currency, currencyId, str, displayName, hidden, icon, nightIcon, priceScale, quickAmountList, scale, symbol2, tradeRange, usdRate, valuation, cryptoToLocalCurrencyPrice, earnRate, earnOptionBeanKWHzl, tradeSupportedCurrencies, price, percentage, percentageValue, fiatFlag, transferable, companion.OLrzqt(dexInfo));
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, new ArrayListSerializer(stringSerializer), null, null, null, null, null, null, null, null, new ArrayListSerializer(IntSerializer.INSTANCE), null, null, null, null, null, null, null, null, new ArrayListSerializer(stringSerializer), null, null, null, null, null, null};
    }
}
