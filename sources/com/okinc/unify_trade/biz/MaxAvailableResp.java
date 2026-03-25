package com.okinc.unify_trade.biz;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class MaxAvailableResp {
    private String assetAvail;
    private String assetSz;
    private String available;
    private String baseMax;
    private String buyCost;
    private String buySize;
    private String changeDebt;
    private String changeDebtCcy;
    private String liqPxBuySize;
    private String liqPxSellSize;
    private String loanAvailable;
    private String loanMaxSize;
    private String longAvail;
    private String longAvailablePos;
    private String maxSize;
    private String pendingCloseOrdLiabVal;
    private String px;
    private String quoteMax;
    private String repayAmount;
    private String sellCost;
    private String sellSize;
    private String shortAvail;
    private String shortAvailablePos;
    private String simpleEarnAvail;
    private String simpleEarnSz;
    private String spotIsoBal;
    private String threshold;
    private String totalDebt;
    private String totalDebtCcy;
    private String tradeQuoteCcy;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MaxAvailableResp() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, LockFreeTaskQueueCore.MAX_CAPACITY_MASK, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.available;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.changeDebt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.changeDebtCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.loanAvailable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.loanMaxSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.totalDebt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.totalDebtCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.pendingCloseOrdLiabVal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.liqPxBuySize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.liqPxSellSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.repayAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.longAvail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.longAvailablePos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.shortAvailablePos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.spotIsoBal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.buyCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.sellCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.assetAvail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.assetSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component27() {
        return this.simpleEarnAvail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component28() {
        return this.simpleEarnSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component29() {
        return this.threshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.shortAvail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component30() {
        return this.tradeQuoteCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.maxSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.buySize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.sellSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.px;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.baseMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.quoteMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MaxAvailableResp copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, @NotNull String str25, @NotNull String str26, @NotNull String str27, @NotNull String str28, @NotNull String str29, @NotNull String str30) {
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
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str20, "");
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(str22, "");
        Intrinsics.checkNotNullParameter(str23, "");
        Intrinsics.checkNotNullParameter(str24, "");
        Intrinsics.checkNotNullParameter(str25, "");
        Intrinsics.checkNotNullParameter(str26, "");
        Intrinsics.checkNotNullParameter(str27, "");
        Intrinsics.checkNotNullParameter(str28, "");
        Intrinsics.checkNotNullParameter(str29, "");
        Intrinsics.checkNotNullParameter(str30, "");
        return new MaxAvailableResp(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MaxAvailableResp)) {
            return false;
        }
        MaxAvailableResp maxAvailableResp = (MaxAvailableResp) obj;
        return Intrinsics.EZpvd((Object) this.available, (Object) maxAvailableResp.available) && Intrinsics.EZpvd((Object) this.longAvail, (Object) maxAvailableResp.longAvail) && Intrinsics.EZpvd((Object) this.shortAvail, (Object) maxAvailableResp.shortAvail) && Intrinsics.EZpvd((Object) this.maxSize, (Object) maxAvailableResp.maxSize) && Intrinsics.EZpvd((Object) this.buySize, (Object) maxAvailableResp.buySize) && Intrinsics.EZpvd((Object) this.sellSize, (Object) maxAvailableResp.sellSize) && Intrinsics.EZpvd((Object) this.px, (Object) maxAvailableResp.px) && Intrinsics.EZpvd((Object) this.baseMax, (Object) maxAvailableResp.baseMax) && Intrinsics.EZpvd((Object) this.quoteMax, (Object) maxAvailableResp.quoteMax) && Intrinsics.EZpvd((Object) this.changeDebt, (Object) maxAvailableResp.changeDebt) && Intrinsics.EZpvd((Object) this.changeDebtCcy, (Object) maxAvailableResp.changeDebtCcy) && Intrinsics.EZpvd((Object) this.loanAvailable, (Object) maxAvailableResp.loanAvailable) && Intrinsics.EZpvd((Object) this.loanMaxSize, (Object) maxAvailableResp.loanMaxSize) && Intrinsics.EZpvd((Object) this.totalDebt, (Object) maxAvailableResp.totalDebt) && Intrinsics.EZpvd((Object) this.totalDebtCcy, (Object) maxAvailableResp.totalDebtCcy) && Intrinsics.EZpvd((Object) this.pendingCloseOrdLiabVal, (Object) maxAvailableResp.pendingCloseOrdLiabVal) && Intrinsics.EZpvd((Object) this.liqPxBuySize, (Object) maxAvailableResp.liqPxBuySize) && Intrinsics.EZpvd((Object) this.liqPxSellSize, (Object) maxAvailableResp.liqPxSellSize) && Intrinsics.EZpvd((Object) this.repayAmount, (Object) maxAvailableResp.repayAmount) && Intrinsics.EZpvd((Object) this.longAvailablePos, (Object) maxAvailableResp.longAvailablePos) && Intrinsics.EZpvd((Object) this.shortAvailablePos, (Object) maxAvailableResp.shortAvailablePos) && Intrinsics.EZpvd((Object) this.spotIsoBal, (Object) maxAvailableResp.spotIsoBal) && Intrinsics.EZpvd((Object) this.buyCost, (Object) maxAvailableResp.buyCost) && Intrinsics.EZpvd((Object) this.sellCost, (Object) maxAvailableResp.sellCost) && Intrinsics.EZpvd((Object) this.assetAvail, (Object) maxAvailableResp.assetAvail) && Intrinsics.EZpvd((Object) this.assetSz, (Object) maxAvailableResp.assetSz) && Intrinsics.EZpvd((Object) this.simpleEarnAvail, (Object) maxAvailableResp.simpleEarnAvail) && Intrinsics.EZpvd((Object) this.simpleEarnSz, (Object) maxAvailableResp.simpleEarnSz) && Intrinsics.EZpvd((Object) this.threshold, (Object) maxAvailableResp.threshold) && Intrinsics.EZpvd((Object) this.tradeQuoteCcy, (Object) maxAvailableResp.tradeQuoteCcy);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAssetAvail() {
        return this.assetAvail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAssetSz() {
        return this.assetSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvailable() {
        return this.available;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseMax() {
        return this.baseMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBuyCost() {
        return this.buyCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBuySize() {
        return this.buySize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChangeDebt() {
        return this.changeDebt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChangeDebtCcy() {
        return this.changeDebtCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLiqPxBuySize() {
        return this.liqPxBuySize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLiqPxSellSize() {
        return this.liqPxSellSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLoanAvailable() {
        return this.loanAvailable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLoanMaxSize() {
        return this.loanMaxSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLongAvail() {
        return this.longAvail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLongAvailablePos() {
        return this.longAvailablePos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxSize() {
        return this.maxSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPendingCloseOrdLiabVal() {
        return this.pendingCloseOrdLiabVal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPx() {
        return this.px;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteMax() {
        return this.quoteMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRepayAmount() {
        return this.repayAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSellCost() {
        return this.sellCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSellSize() {
        return this.sellSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getShortAvail() {
        return this.shortAvail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getShortAvailablePos() {
        return this.shortAvailablePos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSimpleEarnAvail() {
        return this.simpleEarnAvail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSimpleEarnSz() {
        return this.simpleEarnSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSpotIsoBal() {
        return this.spotIsoBal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getThreshold() {
        return this.threshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalDebt() {
        return this.totalDebt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalDebtCcy() {
        return this.totalDebtCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradeQuoteCcy() {
        return this.tradeQuoteCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.available.hashCode() * 31) + this.longAvail.hashCode()) * 31) + this.shortAvail.hashCode()) * 31) + this.maxSize.hashCode()) * 31) + this.buySize.hashCode()) * 31) + this.sellSize.hashCode()) * 31) + this.px.hashCode()) * 31) + this.baseMax.hashCode()) * 31) + this.quoteMax.hashCode()) * 31) + this.changeDebt.hashCode()) * 31) + this.changeDebtCcy.hashCode()) * 31) + this.loanAvailable.hashCode()) * 31) + this.loanMaxSize.hashCode()) * 31) + this.totalDebt.hashCode()) * 31) + this.totalDebtCcy.hashCode()) * 31) + this.pendingCloseOrdLiabVal.hashCode()) * 31) + this.liqPxBuySize.hashCode()) * 31) + this.liqPxSellSize.hashCode()) * 31) + this.repayAmount.hashCode()) * 31) + this.longAvailablePos.hashCode()) * 31) + this.shortAvailablePos.hashCode()) * 31) + this.spotIsoBal.hashCode()) * 31) + this.buyCost.hashCode()) * 31) + this.sellCost.hashCode()) * 31) + this.assetAvail.hashCode()) * 31) + this.assetSz.hashCode()) * 31) + this.simpleEarnAvail.hashCode()) * 31) + this.simpleEarnSz.hashCode()) * 31) + this.threshold.hashCode()) * 31) + this.tradeQuoteCcy.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAssetAvail(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.assetAvail = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAssetSz(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.assetSz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAvailable(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.available = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBaseMax(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.baseMax = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBuyCost(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.buyCost = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBuySize(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.buySize = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChangeDebt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.changeDebt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChangeDebtCcy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.changeDebtCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLiqPxBuySize(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.liqPxBuySize = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLiqPxSellSize(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.liqPxSellSize = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLoanAvailable(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.loanAvailable = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLoanMaxSize(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.loanMaxSize = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLongAvail(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.longAvail = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLongAvailablePos(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.longAvailablePos = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxSize(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.maxSize = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPendingCloseOrdLiabVal(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.pendingCloseOrdLiabVal = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.px = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuoteMax(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.quoteMax = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRepayAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.repayAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSellCost(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.sellCost = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSellSize(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.sellSize = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShortAvail(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.shortAvail = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShortAvailablePos(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.shortAvailablePos = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSimpleEarnAvail(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.simpleEarnAvail = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSimpleEarnSz(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.simpleEarnSz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSpotIsoBal(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.spotIsoBal = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setThreshold(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.threshold = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTotalDebt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.totalDebt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTotalDebtCcy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.totalDebtCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTradeQuoteCcy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tradeQuoteCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MaxAvailableResp(available=" + this.available + ", longAvail=" + this.longAvail + ", shortAvail=" + this.shortAvail + ", maxSize=" + this.maxSize + ", buySize=" + this.buySize + ", sellSize=" + this.sellSize + ", px=" + this.px + ", baseMax=" + this.baseMax + ", quoteMax=" + this.quoteMax + ", changeDebt=" + this.changeDebt + ", changeDebtCcy=" + this.changeDebtCcy + ", loanAvailable=" + this.loanAvailable + ", loanMaxSize=" + this.loanMaxSize + ", totalDebt=" + this.totalDebt + ", totalDebtCcy=" + this.totalDebtCcy + ", pendingCloseOrdLiabVal=" + this.pendingCloseOrdLiabVal + ", liqPxBuySize=" + this.liqPxBuySize + ", liqPxSellSize=" + this.liqPxSellSize + ", repayAmount=" + this.repayAmount + ", longAvailablePos=" + this.longAvailablePos + ", shortAvailablePos=" + this.shortAvailablePos + ", spotIsoBal=" + this.spotIsoBal + ", buyCost=" + this.buyCost + ", sellCost=" + this.sellCost + ", assetAvail=" + this.assetAvail + ", assetSz=" + this.assetSz + ", simpleEarnAvail=" + this.simpleEarnAvail + ", simpleEarnSz=" + this.simpleEarnSz + ", threshold=" + this.threshold + ", tradeQuoteCcy=" + this.tradeQuoteCcy + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.MaxAvailableResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MaxAvailableResp> serializer() {
            return MaxAvailableResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MaxAvailableResp(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.available = "0";
        } else {
            this.available = str;
        }
        if ((i & 2) == 0) {
            this.longAvail = "";
        } else {
            this.longAvail = str2;
        }
        if ((i & 4) == 0) {
            this.shortAvail = "";
        } else {
            this.shortAvail = str3;
        }
        if ((i & 8) == 0) {
            this.maxSize = "0";
        } else {
            this.maxSize = str4;
        }
        if ((i & 16) == 0) {
            this.buySize = "0";
        } else {
            this.buySize = str5;
        }
        if ((i & 32) == 0) {
            this.sellSize = "0";
        } else {
            this.sellSize = str6;
        }
        if ((i & 64) == 0) {
            this.px = "0";
        } else {
            this.px = str7;
        }
        if ((i & 128) == 0) {
            this.baseMax = "";
        } else {
            this.baseMax = str8;
        }
        if ((i & 256) == 0) {
            this.quoteMax = "";
        } else {
            this.quoteMax = str9;
        }
        if ((i & 512) == 0) {
            this.changeDebt = "";
        } else {
            this.changeDebt = str10;
        }
        if ((i & 1024) == 0) {
            this.changeDebtCcy = "";
        } else {
            this.changeDebtCcy = str11;
        }
        if ((i & 2048) == 0) {
            this.loanAvailable = "";
        } else {
            this.loanAvailable = str12;
        }
        if ((i & 4096) == 0) {
            this.loanMaxSize = "";
        } else {
            this.loanMaxSize = str13;
        }
        if ((i & 8192) == 0) {
            this.totalDebt = "";
        } else {
            this.totalDebt = str14;
        }
        if ((i & 16384) == 0) {
            this.totalDebtCcy = "";
        } else {
            this.totalDebtCcy = str15;
        }
        if ((32768 & i) == 0) {
            this.pendingCloseOrdLiabVal = "";
        } else {
            this.pendingCloseOrdLiabVal = str16;
        }
        if ((65536 & i) == 0) {
            this.liqPxBuySize = "";
        } else {
            this.liqPxBuySize = str17;
        }
        if ((131072 & i) == 0) {
            this.liqPxSellSize = "";
        } else {
            this.liqPxSellSize = str18;
        }
        if ((262144 & i) == 0) {
            this.repayAmount = "";
        } else {
            this.repayAmount = str19;
        }
        if ((524288 & i) == 0) {
            this.longAvailablePos = "";
        } else {
            this.longAvailablePos = str20;
        }
        if ((1048576 & i) == 0) {
            this.shortAvailablePos = "";
        } else {
            this.shortAvailablePos = str21;
        }
        if ((2097152 & i) == 0) {
            this.spotIsoBal = "";
        } else {
            this.spotIsoBal = str22;
        }
        if ((4194304 & i) == 0) {
            this.buyCost = "";
        } else {
            this.buyCost = str23;
        }
        if ((8388608 & i) == 0) {
            this.sellCost = "";
        } else {
            this.sellCost = str24;
        }
        if ((16777216 & i) == 0) {
            this.assetAvail = "";
        } else {
            this.assetAvail = str25;
        }
        if ((33554432 & i) == 0) {
            this.assetSz = "";
        } else {
            this.assetSz = str26;
        }
        if ((67108864 & i) == 0) {
            this.simpleEarnAvail = "";
        } else {
            this.simpleEarnAvail = str27;
        }
        if ((134217728 & i) == 0) {
            this.simpleEarnSz = "";
        } else {
            this.simpleEarnSz = str28;
        }
        if ((268435456 & i) == 0) {
            this.threshold = "";
        } else {
            this.threshold = str29;
        }
        if ((i & 536870912) == 0) {
            this.tradeQuoteCcy = "";
        } else {
            this.tradeQuoteCcy = str30;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(MaxAvailableResp maxAvailableResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) maxAvailableResp.available, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, maxAvailableResp.available);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) maxAvailableResp.longAvail, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, maxAvailableResp.longAvail);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) maxAvailableResp.shortAvail, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, maxAvailableResp.shortAvail);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) maxAvailableResp.maxSize, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, maxAvailableResp.maxSize);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) maxAvailableResp.buySize, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, maxAvailableResp.buySize);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) maxAvailableResp.sellSize, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, maxAvailableResp.sellSize);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) maxAvailableResp.px, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, maxAvailableResp.px);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) maxAvailableResp.baseMax, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, maxAvailableResp.baseMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) maxAvailableResp.quoteMax, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, maxAvailableResp.quoteMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) maxAvailableResp.changeDebt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, maxAvailableResp.changeDebt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) maxAvailableResp.changeDebtCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, maxAvailableResp.changeDebtCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) maxAvailableResp.loanAvailable, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, maxAvailableResp.loanAvailable);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) maxAvailableResp.loanMaxSize, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, maxAvailableResp.loanMaxSize);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) maxAvailableResp.totalDebt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, maxAvailableResp.totalDebt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) maxAvailableResp.totalDebtCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, maxAvailableResp.totalDebtCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) maxAvailableResp.pendingCloseOrdLiabVal, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, maxAvailableResp.pendingCloseOrdLiabVal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) maxAvailableResp.liqPxBuySize, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, maxAvailableResp.liqPxBuySize);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) maxAvailableResp.liqPxSellSize, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 17, maxAvailableResp.liqPxSellSize);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd((Object) maxAvailableResp.repayAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 18, maxAvailableResp.repayAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd((Object) maxAvailableResp.longAvailablePos, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 19, maxAvailableResp.longAvailablePos);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd((Object) maxAvailableResp.shortAvailablePos, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 20, maxAvailableResp.shortAvailablePos);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !Intrinsics.EZpvd((Object) maxAvailableResp.spotIsoBal, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 21, maxAvailableResp.spotIsoBal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || !Intrinsics.EZpvd((Object) maxAvailableResp.buyCost, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 22, maxAvailableResp.buyCost);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || !Intrinsics.EZpvd((Object) maxAvailableResp.sellCost, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 23, maxAvailableResp.sellCost);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || !Intrinsics.EZpvd((Object) maxAvailableResp.assetAvail, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 24, maxAvailableResp.assetAvail);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || !Intrinsics.EZpvd((Object) maxAvailableResp.assetSz, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 25, maxAvailableResp.assetSz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || !Intrinsics.EZpvd((Object) maxAvailableResp.simpleEarnAvail, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 26, maxAvailableResp.simpleEarnAvail);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || !Intrinsics.EZpvd((Object) maxAvailableResp.simpleEarnSz, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 27, maxAvailableResp.simpleEarnSz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || !Intrinsics.EZpvd((Object) maxAvailableResp.threshold, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 28, maxAvailableResp.threshold);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) && Intrinsics.EZpvd((Object) maxAvailableResp.tradeQuoteCcy, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 29, maxAvailableResp.tradeQuoteCcy);
    }

    public MaxAvailableResp(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, @NotNull String str25, @NotNull String str26, @NotNull String str27, @NotNull String str28, @NotNull String str29, @NotNull String str30) {
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
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str20, "");
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(str22, "");
        Intrinsics.checkNotNullParameter(str23, "");
        Intrinsics.checkNotNullParameter(str24, "");
        Intrinsics.checkNotNullParameter(str25, "");
        Intrinsics.checkNotNullParameter(str26, "");
        Intrinsics.checkNotNullParameter(str27, "");
        Intrinsics.checkNotNullParameter(str28, "");
        Intrinsics.checkNotNullParameter(str29, "");
        Intrinsics.checkNotNullParameter(str30, "");
        this.available = str;
        this.longAvail = str2;
        this.shortAvail = str3;
        this.maxSize = str4;
        this.buySize = str5;
        this.sellSize = str6;
        this.px = str7;
        this.baseMax = str8;
        this.quoteMax = str9;
        this.changeDebt = str10;
        this.changeDebtCcy = str11;
        this.loanAvailable = str12;
        this.loanMaxSize = str13;
        this.totalDebt = str14;
        this.totalDebtCcy = str15;
        this.pendingCloseOrdLiabVal = str16;
        this.liqPxBuySize = str17;
        this.liqPxSellSize = str18;
        this.repayAmount = str19;
        this.longAvailablePos = str20;
        this.shortAvailablePos = str21;
        this.spotIsoBal = str22;
        this.buyCost = str23;
        this.sellCost = str24;
        this.assetAvail = str25;
        this.assetSz = str26;
        this.simpleEarnAvail = str27;
        this.simpleEarnSz = str28;
        this.threshold = str29;
        this.tradeQuoteCcy = str30;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0164: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r62v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("0") : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r62v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r62v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r62v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("0") : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r62v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("0") : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r62v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("0") : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0036: ARITH (r62v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r38v0 java.lang.String) : ("0"))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003d: ARITH (r62v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0045: ARITH (r62v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004d: ARITH (r62v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0055: ARITH (r62v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005d: ARITH (r62v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r43v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0065: ARITH (r62v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r44v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006d: ARITH (r62v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r45v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0077: ARITH (r62v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r46v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0083: ARITH (r62v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r47v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008e: ARITH (r62v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r48v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0099: ARITH (r62v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r49v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a4: ARITH (r62v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? ("") : (r50v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00af: ARITH (r62v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? ("") : (r51v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ba: ARITH (r62v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? ("") : (r52v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00c5: ARITH (r62v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? ("") : (r53v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00d0: ARITH (r62v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? ("") : (r54v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00db: ARITH (r62v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? ("") : (r55v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00e6: ARITH (r62v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? ("") : (r56v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00f1: ARITH (r62v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? ("") : (r57v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00fc: ARITH (r62v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? ("") : (r58v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0107: ARITH (r62v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? ("") : (r59v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0112: ARITH (r62v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? ("") : (r60v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x011d: ARITH (r62v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? ("") : (r61v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:869) call: com.okinc.unify_trade.biz.MaxAvailableResp.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ MaxAvailableResp(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "0" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "0" : str4, (i & 16) != 0 ? "0" : str5, (i & 32) != 0 ? "0" : str6, (i & 64) == 0 ? str7 : "0", (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) != 0 ? "" : str13, (i & 8192) != 0 ? "" : str14, (i & 16384) != 0 ? "" : str15, (i & 32768) != 0 ? "" : str16, (i & 65536) != 0 ? "" : str17, (i & 131072) != 0 ? "" : str18, (i & 262144) != 0 ? "" : str19, (i & 524288) != 0 ? "" : str20, (i & 1048576) != 0 ? "" : str21, (i & 2097152) != 0 ? "" : str22, (i & 4194304) != 0 ? "" : str23, (i & 8388608) != 0 ? "" : str24, (i & 16777216) != 0 ? "" : str25, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str26, (i & 67108864) != 0 ? "" : str27, (i & 134217728) != 0 ? "" : str28, (i & 268435456) != 0 ? "" : str29, (i & 536870912) != 0 ? "" : str30);
    }
}
