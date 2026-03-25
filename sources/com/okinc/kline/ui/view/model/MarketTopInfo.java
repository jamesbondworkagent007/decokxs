package com.okinc.kline.ui.view.model;

import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class MarketTopInfo {
    public static final int $stable = 8;
    private String expireTime;
    private boolean isNewCoin;
    private String maskPrice;
    private String originPrice;
    private String priceType;
    private String strikePrice;
    private String t24Amount;
    private String t24HighPrice;
    private String t24LowPrice;
    private Pair<String, String> t24Turnover;
    private Pair<String, String> t24Volume;
    private String tDelta;
    private String tGamma;
    private String tIncrease;
    private String tLeverageMultiple;
    private String tLocalPrice;
    private String tMarkedVolatility;
    private String tMarketPosition;
    private String tPrice;
    private String tPriceDifference;
    private String tPriceNoTh;
    private String tSpotIndex;
    private String tTheta;
    private String tVega;
    private String type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MarketTopInfo() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 33554431, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.tPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Pair<String, String> component10() {
        return this.t24Volume;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Pair<String, String> component11() {
        return this.t24Turnover;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.priceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.tMarketPosition;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.tSpotIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.tDelta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.tVega;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.tGamma;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.tTheta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.tPriceNoTh;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.tMarkedVolatility;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.tLeverageMultiple;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.expireTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.strikePrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.originPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component25() {
        return this.isNewCoin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.tIncrease;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.tPriceDifference;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.tLocalPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.maskPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.t24HighPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.t24LowPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.t24Amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MarketTopInfo copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull Pair<String, String> pair, @NotNull Pair<String, String> pair2, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(pair2, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str20, "");
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(str22, "");
        return new MarketTopInfo(str, str2, str3, str4, str5, str6, str7, str8, str9, pair, pair2, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketTopInfo)) {
            return false;
        }
        MarketTopInfo marketTopInfo = (MarketTopInfo) obj;
        return Intrinsics.EZpvd((Object) this.tPrice, (Object) marketTopInfo.tPrice) && Intrinsics.EZpvd((Object) this.tPriceNoTh, (Object) marketTopInfo.tPriceNoTh) && Intrinsics.EZpvd((Object) this.tIncrease, (Object) marketTopInfo.tIncrease) && Intrinsics.EZpvd((Object) this.tPriceDifference, (Object) marketTopInfo.tPriceDifference) && Intrinsics.EZpvd((Object) this.tLocalPrice, (Object) marketTopInfo.tLocalPrice) && Intrinsics.EZpvd((Object) this.maskPrice, (Object) marketTopInfo.maskPrice) && Intrinsics.EZpvd((Object) this.t24HighPrice, (Object) marketTopInfo.t24HighPrice) && Intrinsics.EZpvd((Object) this.t24LowPrice, (Object) marketTopInfo.t24LowPrice) && Intrinsics.EZpvd((Object) this.t24Amount, (Object) marketTopInfo.t24Amount) && Intrinsics.EZpvd(this.t24Volume, marketTopInfo.t24Volume) && Intrinsics.EZpvd(this.t24Turnover, marketTopInfo.t24Turnover) && Intrinsics.EZpvd((Object) this.type, (Object) marketTopInfo.type) && Intrinsics.EZpvd((Object) this.priceType, (Object) marketTopInfo.priceType) && Intrinsics.EZpvd((Object) this.tMarketPosition, (Object) marketTopInfo.tMarketPosition) && Intrinsics.EZpvd((Object) this.tSpotIndex, (Object) marketTopInfo.tSpotIndex) && Intrinsics.EZpvd((Object) this.tDelta, (Object) marketTopInfo.tDelta) && Intrinsics.EZpvd((Object) this.tVega, (Object) marketTopInfo.tVega) && Intrinsics.EZpvd((Object) this.tGamma, (Object) marketTopInfo.tGamma) && Intrinsics.EZpvd((Object) this.tTheta, (Object) marketTopInfo.tTheta) && Intrinsics.EZpvd((Object) this.tMarkedVolatility, (Object) marketTopInfo.tMarkedVolatility) && Intrinsics.EZpvd((Object) this.tLeverageMultiple, (Object) marketTopInfo.tLeverageMultiple) && Intrinsics.EZpvd((Object) this.expireTime, (Object) marketTopInfo.expireTime) && Intrinsics.EZpvd((Object) this.strikePrice, (Object) marketTopInfo.strikePrice) && Intrinsics.EZpvd((Object) this.originPrice, (Object) marketTopInfo.originPrice) && this.isNewCoin == marketTopInfo.isNewCoin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExpireTime() {
        return this.expireTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaskPrice() {
        return this.maskPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOriginPrice() {
        return this.originPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPriceType() {
        return this.priceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStrikePrice() {
        return this.strikePrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getT24Amount() {
        return this.t24Amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getT24HighPrice() {
        return this.t24HighPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getT24LowPrice() {
        return this.t24LowPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Pair<String, String> getT24Turnover() {
        return this.t24Turnover;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Pair<String, String> getT24Volume() {
        return this.t24Volume;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTDelta() {
        return this.tDelta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTGamma() {
        return this.tGamma;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTIncrease() {
        return this.tIncrease;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTLeverageMultiple() {
        return this.tLeverageMultiple;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTLocalPrice() {
        return this.tLocalPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTMarkedVolatility() {
        return this.tMarkedVolatility;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTMarketPosition() {
        return this.tMarketPosition;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTPrice() {
        return this.tPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTPriceDifference() {
        return this.tPriceDifference;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTPriceNoTh() {
        return this.tPriceNoTh;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTSpotIndex() {
        return this.tSpotIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTTheta() {
        return this.tTheta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTVega() {
        return this.tVega;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((this.tPrice.hashCode() * 31) + this.tPriceNoTh.hashCode()) * 31) + this.tIncrease.hashCode()) * 31) + this.tPriceDifference.hashCode()) * 31) + this.tLocalPrice.hashCode()) * 31) + this.maskPrice.hashCode()) * 31) + this.t24HighPrice.hashCode()) * 31) + this.t24LowPrice.hashCode()) * 31) + this.t24Amount.hashCode()) * 31) + this.t24Volume.hashCode()) * 31) + this.t24Turnover.hashCode()) * 31) + this.type.hashCode()) * 31) + this.priceType.hashCode()) * 31) + this.tMarketPosition.hashCode()) * 31) + this.tSpotIndex.hashCode()) * 31) + this.tDelta.hashCode()) * 31) + this.tVega.hashCode()) * 31) + this.tGamma.hashCode()) * 31) + this.tTheta.hashCode()) * 31) + this.tMarkedVolatility.hashCode()) * 31) + this.tLeverageMultiple.hashCode()) * 31) + this.expireTime.hashCode()) * 31) + this.strikePrice.hashCode()) * 31) + this.originPrice.hashCode()) * 31) + Boolean.hashCode(this.isNewCoin);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isNewCoin() {
        return this.isNewCoin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExpireTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.expireTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaskPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.maskPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNewCoin(boolean z) {
        this.isNewCoin = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOriginPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.originPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPriceType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.priceType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStrikePrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.strikePrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setT24Amount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.t24Amount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setT24HighPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.t24HighPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setT24LowPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.t24LowPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setT24Turnover(@NotNull Pair<String, String> pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        this.t24Turnover = pair;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setT24Volume(@NotNull Pair<String, String> pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        this.t24Volume = pair;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTDelta(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tDelta = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTGamma(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tGamma = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTIncrease(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tIncrease = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTLeverageMultiple(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tLeverageMultiple = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTLocalPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tLocalPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTMarkedVolatility(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tMarkedVolatility = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTMarketPosition(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tMarketPosition = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTPriceDifference(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tPriceDifference = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTPriceNoTh(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tPriceNoTh = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTSpotIndex(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tSpotIndex = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTTheta(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tTheta = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTVega(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tVega = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.type = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MarketTopInfo(tPrice=" + this.tPrice + ", tPriceNoTh=" + this.tPriceNoTh + ", tIncrease=" + this.tIncrease + ", tPriceDifference=" + this.tPriceDifference + ", tLocalPrice=" + this.tLocalPrice + ", maskPrice=" + this.maskPrice + ", t24HighPrice=" + this.t24HighPrice + ", t24LowPrice=" + this.t24LowPrice + ", t24Amount=" + this.t24Amount + ", t24Volume=" + this.t24Volume + ", t24Turnover=" + this.t24Turnover + ", type=" + this.type + ", priceType=" + this.priceType + ", tMarketPosition=" + this.tMarketPosition + ", tSpotIndex=" + this.tSpotIndex + ", tDelta=" + this.tDelta + ", tVega=" + this.tVega + ", tGamma=" + this.tGamma + ", tTheta=" + this.tTheta + ", tMarkedVolatility=" + this.tMarkedVolatility + ", tLeverageMultiple=" + this.tLeverageMultiple + ", expireTime=" + this.expireTime + ", strikePrice=" + this.strikePrice + ", originPrice=" + this.originPrice + ", isNewCoin=" + this.isNewCoin + ")";
    }

    public MarketTopInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull Pair<String, String> pair, @NotNull Pair<String, String> pair2, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(pair2, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str20, "");
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(str22, "");
        this.tPrice = str;
        this.tPriceNoTh = str2;
        this.tIncrease = str3;
        this.tPriceDifference = str4;
        this.tLocalPrice = str5;
        this.maskPrice = str6;
        this.t24HighPrice = str7;
        this.t24LowPrice = str8;
        this.t24Amount = str9;
        this.t24Volume = pair;
        this.t24Turnover = pair2;
        this.type = str10;
        this.priceType = str11;
        this.tMarketPosition = str12;
        this.tSpotIndex = str13;
        this.tDelta = str14;
        this.tVega = str15;
        this.tGamma = str16;
        this.tTheta = str17;
        this.tMarkedVolatility = str18;
        this.tLeverageMultiple = str19;
        this.expireTime = str20;
        this.strikePrice = str21;
        this.originPrice = str22;
        this.isNewCoin = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x012d: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r52v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("--") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r52v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r52v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("--") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r52v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("--") : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r52v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("--") : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r52v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("--") : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0036: ARITH (r52v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("--") : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003e: ARITH (r52v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("--") : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0046: ARITH (r52v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("--") : (r35v0 java.lang.String))
  (wrap:kotlin.Pair:?: TERNARY null = ((wrap:int:0x004e: ARITH (r52v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0054: CONSTRUCTOR ("--"), ("") A[MD:(A, B):void (m), WRAPPED] (LINE:49) call: kotlin.Pair.<init>(java.lang.Object, java.lang.Object):void type: CONSTRUCTOR) : (r36v0 kotlin.Pair))
  (wrap:kotlin.Pair:?: TERNARY null = ((wrap:int:0x005a: ARITH (r52v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0060: CONSTRUCTOR ("--"), ("") A[MD:(A, B):void (m), WRAPPED] (LINE:50) call: kotlin.Pair.<init>(java.lang.Object, java.lang.Object):void type: CONSTRUCTOR) : (r37v0 kotlin.Pair))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0066: ARITH (r52v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("SPOT") : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006f: ARITH (r52v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("TYPE_KLINE") : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0078: ARITH (r52v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("--") : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0082: ARITH (r52v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("--") : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008e: ARITH (r52v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("--") : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0099: ARITH (r52v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("--") : (r43v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a4: ARITH (r52v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("--") : (r44v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00af: ARITH (r52v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? ("--") : (r45v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ba: ARITH (r52v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? ("--") : (r46v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00c5: ARITH (r52v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? ("--") : (r47v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00d0: ARITH (r52v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00d4: SGET  A[WRAPPED] com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData.DEFAULT_INTERVAL java.lang.String) : (r48v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00db: ARITH (r52v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? ("--") : (r49v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00e6: ARITH (r52v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? ("--") : (r50v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00f1: ARITH (r52v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? false : (r51v0 boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlin.Pair<java.lang.String, java.lang.String>, kotlin.Pair<java.lang.String, java.lang.String>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void (m)] (LINE:40) call: com.okinc.kline.ui.view.model.MarketTopInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlin.Pair, kotlin.Pair, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ MarketTopInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Pair pair, Pair pair2, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "--" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "--" : str3, (i & 8) != 0 ? "--" : str4, (i & 16) != 0 ? "--" : str5, (i & 32) != 0 ? "--" : str6, (i & 64) != 0 ? "--" : str7, (i & 128) != 0 ? "--" : str8, (i & 256) != 0 ? "--" : str9, (i & 512) != 0 ? new Pair("--", "") : pair, (i & 1024) != 0 ? new Pair("--", "") : pair2, (i & 2048) != 0 ? "SPOT" : str10, (i & 4096) != 0 ? "TYPE_KLINE" : str11, (i & 8192) != 0 ? "--" : str12, (i & 16384) != 0 ? "--" : str13, (i & 32768) != 0 ? "--" : str14, (i & 65536) != 0 ? "--" : str15, (i & 131072) != 0 ? "--" : str16, (i & 262144) != 0 ? "--" : str17, (i & 524288) != 0 ? "--" : str18, (i & 1048576) != 0 ? "--" : str19, (i & 2097152) != 0 ? MultiTransferSignData.DEFAULT_INTERVAL : str20, (i & 4194304) != 0 ? "--" : str21, (i & 8388608) != 0 ? "--" : str22, (i & 16777216) != 0 ? false : z);
    }
}
