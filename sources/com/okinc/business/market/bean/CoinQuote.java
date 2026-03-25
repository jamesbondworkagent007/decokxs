package com.okinc.business.market.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.unify_trade.biz.CountDownInfo;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class CoinQuote implements Parcelable, Serializable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<CoinQuote> CREATOR = new Creator();
    private String alias;
    private String baseCurrency;
    private double changePercent;
    private String changePercentDisplay;
    private CountDownInfo countDownInfo;
    private String displayId;
    private String displayQuoteSymbol;
    private String icon;
    private String instId;
    private String instType;
    private boolean isHot;
    private boolean isNewLabel;
    private boolean isPreMarket;
    private boolean isRebase;
    private boolean isWatch;
    private String leverageRatio;
    private String price;
    private double priceNumber;
    private String quoteCcyUSDPrice;
    private String quoteCurrency;
    private boolean showSubPrice;
    private String subPrice;
    private String turnover;
    private double turnoverNumber;
    private double volumeNumber;
    private String voulum;

    public static final class Creator implements Parcelable.Creator<CoinQuote> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CoinQuote createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CoinQuote(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readString(), null, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString(), 524288, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CoinQuote[] newArray(int i) {
            return new CoinQuote[i];
        }
    }

    public static /* synthetic */ void getCountDownInfo$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.quoteCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.voulum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component11() {
        return this.isWatch;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.quoteCcyUSDPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double component16() {
        return this.turnoverNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double component17() {
        return this.volumeNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double component18() {
        return this.priceNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.alias;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.baseCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CountDownInfo component20() {
        return this.countDownInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component21() {
        return this.isPreMarket;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component22() {
        return this.isRebase;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component23() {
        return this.isHot;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component24() {
        return this.isNewLabel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.displayId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.displayQuoteSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double component4() {
        return this.changePercent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.changePercentDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.subPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component7() {
        return this.showSubPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.leverageRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.turnover;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CoinQuote copy(@NotNull String str, @NotNull String str2, @NotNull String str3, double d, @NotNull String str4, @NotNull String str5, boolean z, String str6, String str7, String str8, boolean z2, @NotNull String str9, @NotNull String str10, String str11, @NotNull String str12, double d2, double d3, double d4, String str13, CountDownInfo countDownInfo, boolean z3, boolean z4, boolean z5, boolean z6, String str14, String str15) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str12, "");
        return new CoinQuote(str, str2, str3, d, str4, str5, z, str6, str7, str8, z2, str9, str10, str11, str12, d2, d3, d4, str13, countDownInfo, z3, z4, z5, z6, str14, str15);
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
        if (!(obj instanceof CoinQuote)) {
            return false;
        }
        CoinQuote coinQuote = (CoinQuote) obj;
        return Intrinsics.EZpvd((Object) this.quoteCurrency, (Object) coinQuote.quoteCurrency) && Intrinsics.EZpvd((Object) this.baseCurrency, (Object) coinQuote.baseCurrency) && Intrinsics.EZpvd((Object) this.price, (Object) coinQuote.price) && Double.compare(this.changePercent, coinQuote.changePercent) == 0 && Intrinsics.EZpvd((Object) this.changePercentDisplay, (Object) coinQuote.changePercentDisplay) && Intrinsics.EZpvd((Object) this.subPrice, (Object) coinQuote.subPrice) && this.showSubPrice == coinQuote.showSubPrice && Intrinsics.EZpvd((Object) this.leverageRatio, (Object) coinQuote.leverageRatio) && Intrinsics.EZpvd((Object) this.turnover, (Object) coinQuote.turnover) && Intrinsics.EZpvd((Object) this.voulum, (Object) coinQuote.voulum) && this.isWatch == coinQuote.isWatch && Intrinsics.EZpvd((Object) this.instType, (Object) coinQuote.instType) && Intrinsics.EZpvd((Object) this.instId, (Object) coinQuote.instId) && Intrinsics.EZpvd((Object) this.icon, (Object) coinQuote.icon) && Intrinsics.EZpvd((Object) this.quoteCcyUSDPrice, (Object) coinQuote.quoteCcyUSDPrice) && Double.compare(this.turnoverNumber, coinQuote.turnoverNumber) == 0 && Double.compare(this.volumeNumber, coinQuote.volumeNumber) == 0 && Double.compare(this.priceNumber, coinQuote.priceNumber) == 0 && Intrinsics.EZpvd((Object) this.alias, (Object) coinQuote.alias) && Intrinsics.EZpvd(this.countDownInfo, coinQuote.countDownInfo) && this.isPreMarket == coinQuote.isPreMarket && this.isRebase == coinQuote.isRebase && this.isHot == coinQuote.isHot && this.isNewLabel == coinQuote.isNewLabel && Intrinsics.EZpvd((Object) this.displayId, (Object) coinQuote.displayId) && Intrinsics.EZpvd((Object) this.displayQuoteSymbol, (Object) coinQuote.displayQuoteSymbol);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlias() {
        return this.alias;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseCurrency() {
        return this.baseCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double getChangePercent() {
        return this.changePercent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChangePercentDisplay() {
        return this.changePercentDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CountDownInfo getCountDownInfo() {
        return this.countDownInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayId() {
        return this.displayId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayQuoteSymbol() {
        return this.displayQuoteSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstType() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLeverageRatio() {
        return this.leverageRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrice() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double getPriceNumber() {
        return this.priceNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteCcyUSDPrice() {
        return this.quoteCcyUSDPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteCurrency() {
        return this.quoteCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getShowSubPrice() {
        return this.showSubPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSubPrice() {
        return this.subPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTurnover() {
        return this.turnover;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double getTurnoverNumber() {
        return this.turnoverNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double getVolumeNumber() {
        return this.volumeNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVoulum() {
        return this.voulum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.quoteCurrency.hashCode();
        int iHashCode2 = this.baseCurrency.hashCode();
        int iHashCode3 = this.price.hashCode();
        int iHashCode4 = Double.hashCode(this.changePercent);
        int iHashCode5 = this.changePercentDisplay.hashCode();
        int iHashCode6 = this.subPrice.hashCode();
        int iHashCode7 = Boolean.hashCode(this.showSubPrice);
        String str = this.leverageRatio;
        int iHashCode8 = str == null ? 0 : str.hashCode();
        String str2 = this.turnover;
        int iHashCode9 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.voulum;
        int iHashCode10 = str3 == null ? 0 : str3.hashCode();
        int iHashCode11 = Boolean.hashCode(this.isWatch);
        int iHashCode12 = this.instType.hashCode();
        int iHashCode13 = this.instId.hashCode();
        String str4 = this.icon;
        int iHashCode14 = str4 == null ? 0 : str4.hashCode();
        int iHashCode15 = this.quoteCcyUSDPrice.hashCode();
        int i = iHashCode14;
        int iHashCode16 = Double.hashCode(this.turnoverNumber);
        int iHashCode17 = Double.hashCode(this.volumeNumber);
        int iHashCode18 = Double.hashCode(this.priceNumber);
        String str5 = this.alias;
        int iHashCode19 = str5 == null ? 0 : str5.hashCode();
        CountDownInfo countDownInfo = this.countDownInfo;
        int iHashCode20 = countDownInfo == null ? 0 : countDownInfo.hashCode();
        int iHashCode21 = Boolean.hashCode(this.isPreMarket);
        int iHashCode22 = Boolean.hashCode(this.isRebase);
        int iHashCode23 = Boolean.hashCode(this.isHot);
        int iHashCode24 = Boolean.hashCode(this.isNewLabel);
        String str6 = this.displayId;
        int iHashCode25 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.displayQuoteSymbol;
        return (((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + i) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + (str7 == null ? 0 : str7.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isHot() {
        return this.isHot;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isNewLabel() {
        return this.isNewLabel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isPreMarket() {
        return this.isPreMarket;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isRebase() {
        return this.isRebase;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isWatch() {
        return this.isWatch;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAlias(String str) {
        this.alias = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBaseCurrency(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.baseCurrency = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChangePercent(double d) {
        this.changePercent = d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChangePercentDisplay(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.changePercentDisplay = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCountDownInfo(CountDownInfo countDownInfo) {
        this.countDownInfo = countDownInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDisplayId(String str) {
        this.displayId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDisplayQuoteSymbol(String str) {
        this.displayQuoteSymbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHot(boolean z) {
        this.isHot = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIcon(String str) {
        this.icon = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.instId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.instType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLeverageRatio(String str) {
        this.leverageRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNewLabel(boolean z) {
        this.isNewLabel = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPreMarket(boolean z) {
        this.isPreMarket = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.price = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPriceNumber(double d) {
        this.priceNumber = d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuoteCcyUSDPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.quoteCcyUSDPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuoteCurrency(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.quoteCurrency = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRebase(boolean z) {
        this.isRebase = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowSubPrice(boolean z) {
        this.showSubPrice = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSubPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.subPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTurnover(String str) {
        this.turnover = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTurnoverNumber(double d) {
        this.turnoverNumber = d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVolumeNumber(double d) {
        this.volumeNumber = d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVoulum(String str) {
        this.voulum = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWatch(boolean z) {
        this.isWatch = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CoinQuote(quoteCurrency=" + this.quoteCurrency + ", baseCurrency=" + this.baseCurrency + ", price=" + this.price + ", changePercent=" + this.changePercent + ", changePercentDisplay=" + this.changePercentDisplay + ", subPrice=" + this.subPrice + ", showSubPrice=" + this.showSubPrice + ", leverageRatio=" + this.leverageRatio + ", turnover=" + this.turnover + ", voulum=" + this.voulum + ", isWatch=" + this.isWatch + ", instType=" + this.instType + ", instId=" + this.instId + ", icon=" + this.icon + ", quoteCcyUSDPrice=" + this.quoteCcyUSDPrice + ", turnoverNumber=" + this.turnoverNumber + ", volumeNumber=" + this.volumeNumber + ", priceNumber=" + this.priceNumber + ", alias=" + this.alias + ", countDownInfo=" + this.countDownInfo + ", isPreMarket=" + this.isPreMarket + ", isRebase=" + this.isRebase + ", isHot=" + this.isHot + ", isNewLabel=" + this.isNewLabel + ", displayId=" + this.displayId + ", displayQuoteSymbol=" + this.displayQuoteSymbol + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.quoteCurrency);
        parcel.writeString(this.baseCurrency);
        parcel.writeString(this.price);
        parcel.writeDouble(this.changePercent);
        parcel.writeString(this.changePercentDisplay);
        parcel.writeString(this.subPrice);
        parcel.writeInt(this.showSubPrice ? 1 : 0);
        parcel.writeString(this.leverageRatio);
        parcel.writeString(this.turnover);
        parcel.writeString(this.voulum);
        parcel.writeInt(this.isWatch ? 1 : 0);
        parcel.writeString(this.instType);
        parcel.writeString(this.instId);
        parcel.writeString(this.icon);
        parcel.writeString(this.quoteCcyUSDPrice);
        parcel.writeDouble(this.turnoverNumber);
        parcel.writeDouble(this.volumeNumber);
        parcel.writeDouble(this.priceNumber);
        parcel.writeString(this.alias);
        parcel.writeInt(this.isPreMarket ? 1 : 0);
        parcel.writeInt(this.isRebase ? 1 : 0);
        parcel.writeInt(this.isHot ? 1 : 0);
        parcel.writeInt(this.isNewLabel ? 1 : 0);
        parcel.writeString(this.displayId);
        parcel.writeString(this.displayQuoteSymbol);
    }

    public CoinQuote(@NotNull String str, @NotNull String str2, @NotNull String str3, double d, @NotNull String str4, @NotNull String str5, boolean z, String str6, String str7, String str8, boolean z2, @NotNull String str9, @NotNull String str10, String str11, @NotNull String str12, double d2, double d3, double d4, String str13, CountDownInfo countDownInfo, boolean z3, boolean z4, boolean z5, boolean z6, String str14, String str15) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str12, "");
        this.quoteCurrency = str;
        this.baseCurrency = str2;
        this.price = str3;
        this.changePercent = d;
        this.changePercentDisplay = str4;
        this.subPrice = str5;
        this.showSubPrice = z;
        this.leverageRatio = str6;
        this.turnover = str7;
        this.voulum = str8;
        this.isWatch = z2;
        this.instType = str9;
        this.instId = str10;
        this.icon = str11;
        this.quoteCcyUSDPrice = str12;
        this.turnoverNumber = d2;
        this.volumeNumber = d3;
        this.priceNumber = d4;
        this.alias = str13;
        this.countDownInfo = countDownInfo;
        this.isPreMarket = z3;
        this.isRebase = z4;
        this.isHot = z5;
        this.isNewLabel = z6;
        this.displayId = str14;
        this.displayQuoteSymbol = str15;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00c4: CONSTRUCTOR 
  (r36v0 java.lang.String)
  (r37v0 java.lang.String)
  (r38v0 java.lang.String)
  (wrap:double:?: TERNARY null = ((wrap:int:0x0002: ARITH (r66v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0.0d double) : (r39v0 double))
  (r41v0 java.lang.String)
  (r42v0 java.lang.String)
  (r43v0 boolean)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r66v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r44v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r66v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r45v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r66v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r46v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0025: ARITH (r66v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? false : (r47v0 boolean))
  (r48v0 java.lang.String)
  (r49v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002f: ARITH (r66v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r50v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003a: ARITH (r66v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r51v0 java.lang.String))
  (wrap:double:?: TERNARY null = ((wrap:int:0x0046: ARITH (32768 int) & (r66v0 int) A[WRAPPED]) != (0 int)) ? (0.0d double) : (r52v0 double))
  (wrap:double:?: TERNARY null = ((wrap:int:0x0050: ARITH (65536 int) & (r66v0 int) A[WRAPPED]) != (0 int)) ? (0.0d double) : (r54v0 double))
  (wrap:double:?: TERNARY null = ((wrap:int:0x005a: ARITH (131072 int) & (r66v0 int) A[WRAPPED]) != (0 int)) ? (0.0d double) : (r56v0 double))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (262144 int) & (r66v0 int) A[WRAPPED]) != (0 int)) ? ("") : (r58v0 java.lang.String))
  (wrap:com.okinc.unify_trade.biz.CountDownInfo:?: TERNARY null = ((wrap:int:0x006e: ARITH (524288 int) & (r66v0 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.CountDownInfo) : (r59v0 com.okinc.unify_trade.biz.CountDownInfo))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0078: ARITH (1048576 int) & (r66v0 int) A[WRAPPED]) != (0 int)) ? false : (r60v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0082: ARITH (2097152 int) & (r66v0 int) A[WRAPPED]) != (0 int)) ? false : (r61v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x008c: ARITH (4194304 int) & (r66v0 int) A[WRAPPED]) != (0 int)) ? false : (r62v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0096: ARITH (8388608 int) & (r66v0 int) A[WRAPPED]) != (0 int)) ? false : (r63v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a0: ARITH (16777216 int) & (r66v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r64v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00aa: ARITH (r66v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r65v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, double, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, double, double, double, java.lang.String, com.okinc.unify_trade.biz.CountDownInfo, boolean, boolean, boolean, boolean, java.lang.String, java.lang.String):void (m)] (LINE:13) call: com.okinc.business.market.bean.CoinQuote.<init>(java.lang.String, java.lang.String, java.lang.String, double, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, double, double, double, java.lang.String, com.okinc.unify_trade.biz.CountDownInfo, boolean, boolean, boolean, boolean, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ CoinQuote(String str, String str2, String str3, double d, String str4, String str5, boolean z, String str6, String str7, String str8, boolean z2, String str9, String str10, String str11, String str12, double d2, double d3, double d4, String str13, CountDownInfo countDownInfo, boolean z3, boolean z4, boolean z5, boolean z6, String str14, String str15, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? 0.0d : d, str4, str5, z, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? null : str8, (i & 1024) != 0 ? false : z2, str9, str10, (i & 8192) != 0 ? "" : str11, (i & 16384) != 0 ? "" : str12, (32768 & i) != 0 ? 0.0d : d2, (65536 & i) != 0 ? 0.0d : d3, (131072 & i) != 0 ? 0.0d : d4, (262144 & i) != 0 ? "" : str13, (524288 & i) != 0 ? null : countDownInfo, (1048576 & i) != 0 ? false : z3, (2097152 & i) != 0 ? false : z4, (4194304 & i) != 0 ? false : z5, (8388608 & i) != 0 ? false : z6, (16777216 & i) != 0 ? null : str14, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : str15);
    }
}
