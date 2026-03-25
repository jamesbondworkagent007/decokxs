package com.okinc.fiat.api.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class OtcCoinList {
    public static final String SUPPORT_BUY_SELL = "3";
    private int baseCurrencyId;
    private double baseDeposit;
    private int baseScale;
    private boolean canPlaceFlashTrade;
    private double platformCommissionRate;
    private double quoteMaxAmountPerOrder;
    private double quoteMinAmountPerOrder;
    private int quotePriceScale;
    private int quoteScale;
    public static final Activity Companion = new Activity(null);
    public static final int $stable = 8;
    private String baseCurrency = "";
    private String baseIconUrl = "";
    private String baseColorfulIconUrl = "";
    private String baseName = "";
    private String baseCurrencyName = "";
    private String baseSymbol = "";
    private String priceDeviationRateLimit = "0";
    private String quoteCurrency = "";
    private String quoteSymbol = "";
    private String quoteName = "";
    private boolean canPlaceTrade = true;
    private String countryIcon = "";
    private String b2cSupportType = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getB2cSupportType() {
        return this.b2cSupportType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseColorfulIconUrl() {
        return this.baseColorfulIconUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseCurrency() {
        return this.baseCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getBaseCurrencyId() {
        return this.baseCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseCurrencyName() {
        return this.baseCurrencyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double getBaseDeposit() {
        return this.baseDeposit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseIconUrl() {
        return this.baseIconUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseName() {
        return this.baseName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getBaseScale() {
        return this.baseScale;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseSymbol() {
        return this.baseSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getCanPlaceFlashTrade() {
        return this.canPlaceFlashTrade;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getCanPlaceTrade() {
        return this.canPlaceTrade;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCountryIcon() {
        return this.countryIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMyBaseCurrency() {
        return this.baseCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getMyBaseCurrencyId() {
        return this.baseCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getMyBaseScale() {
        return this.baseScale;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMyQuoteCurrency() {
        return this.quoteCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getMyQuoteMoneyScale() {
        return this.quoteScale;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getMyQuotePriceScale() {
        return this.quoteScale;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double getPlatformCommissionRate() {
        return this.platformCommissionRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPriceDeviationRateLimit() {
        return this.priceDeviationRateLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteCurrency() {
        return this.quoteCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double getQuoteMaxAmountPerOrder() {
        return this.quoteMaxAmountPerOrder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double getQuoteMinAmountPerOrder() {
        return this.quoteMinAmountPerOrder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteName() {
        return this.quoteName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getQuotePriceScale() {
        return this.quotePriceScale;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getQuoteScale() {
        return this.quoteScale;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteSymbol() {
        return this.quoteSymbol;
    }

    public final boolean isC2CBean() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setB2cSupportType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.b2cSupportType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBaseColorfulIconUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.baseColorfulIconUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBaseCurrency(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.baseCurrency = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBaseCurrencyId(int i) {
        this.baseCurrencyId = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBaseCurrencyName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.baseCurrencyName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBaseDeposit(double d) {
        this.baseDeposit = d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBaseIconUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.baseIconUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBaseName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.baseName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBaseScale(int i) {
        this.baseScale = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBaseSymbol(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.baseSymbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCanPlaceFlashTrade(boolean z) {
        this.canPlaceFlashTrade = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCanPlaceTrade(boolean z) {
        this.canPlaceTrade = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCountryIcon(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.countryIcon = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPlatformCommissionRate(double d) {
        this.platformCommissionRate = d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPriceDeviationRateLimit(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.priceDeviationRateLimit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuoteCurrency(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.quoteCurrency = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuoteMaxAmountPerOrder(double d) {
        this.quoteMaxAmountPerOrder = d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuoteMinAmountPerOrder(double d) {
        this.quoteMinAmountPerOrder = d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuoteName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.quoteName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuotePriceScale(int i) {
        this.quotePriceScale = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuoteScale(int i) {
        this.quoteScale = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuoteSymbol(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.quoteSymbol = str;
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.fiat.api.bean.OtcCoinList.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public String toString() {
        return "OtcCoinList(baseCurrency='" + this.baseCurrency + "', baseCurrencyId=" + this.baseCurrencyId + ", baseDeposit=" + this.baseDeposit + ", baseIconUrl='" + this.baseIconUrl + "', baseColorfulIconUrl='" + this.baseColorfulIconUrl + "', baseName='" + this.baseName + "', baseCurrencyName='" + this.baseCurrencyName + "', baseScale=" + this.baseScale + ", baseSymbol='" + this.baseSymbol + "', platformCommissionRate=" + this.platformCommissionRate + ", priceDeviationRateLimit='" + this.priceDeviationRateLimit + "', quoteCurrency='" + this.quoteCurrency + "', quoteScale=" + this.quoteScale + ", quotePriceScale=" + this.quotePriceScale + ", quoteSymbol='" + this.quoteSymbol + "', quoteName='" + this.quoteName + "', canPlaceTrade=" + this.canPlaceTrade + ", canPlaceFlashTrade=" + this.canPlaceFlashTrade + ", countryIcon='" + this.countryIcon + "', b2cSupportType='" + this.b2cSupportType + "', quoteMaxAmountPerOrder=" + this.quoteMaxAmountPerOrder + ", quoteMinAmountPerOrder=" + this.quoteMinAmountPerOrder + ")";
    }
}
