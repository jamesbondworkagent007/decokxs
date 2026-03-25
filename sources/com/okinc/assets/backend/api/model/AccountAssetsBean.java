package com.okinc.assets.backend.api.model;

import com.google.gson.JsonElement;
import com.okinc.assets.backend.api.model.AssetsBalanceBaseBean;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class AccountAssetsBean<T extends AssetsBalanceBaseBean> {
    public static final int $stable = 8;
    private Integer accountGrade;
    private String acctAvaMargin;
    private String acctAvaMarginValuation;
    private String acctBalRatio;
    private String acctCashBalValuation;
    private String acctCrossFrozen;
    private String acctCrossUplValuation;
    private String acctLever;
    private String adjEq;
    private String adjEqValuation;
    private String autoEarnCcy;
    private JsonElement balance;
    private List<? extends T> balanceData;
    private String borrowFroz;
    private boolean cedefiAccountCreated;
    private boolean cedefiAccountExist;
    private Boolean collateralSettingEnabled;
    private boolean enableSpotBorrow;
    private List<? extends T> fundingNonEligibleAssets;
    private String imr;
    private String legalTenderTotalValuation;
    private String mgnRatio;
    private String mmr;
    private String notionalUsd;
    private String notionalUsdForBorrow;
    private String notionalUsdForFutures;
    private String notionalUsdForOption;
    private String notionalUsdForSwap;
    private String notionalValuation;
    private Boolean showAutoEarnGuide;
    private Boolean supportFiatCurrency;
    private String totalValuation;
    private boolean tradingPageOptimizationEnabled;
    private String usdTotalValuation;
    private String stgyType = "";
    private String delta = "";
    private String deltaLever = "";
    private String deltaNeutralStatus = "";
    private String totalEq = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getAccountGrade() {
        return this.accountGrade;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAcctAvaMargin() {
        return this.acctAvaMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAcctAvaMarginValuation() {
        return this.acctAvaMarginValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAcctBalRatio() {
        return this.acctBalRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAcctCashBalValuation() {
        return this.acctCashBalValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAcctCrossFrozen() {
        return this.acctCrossFrozen;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAcctCrossUplValuation() {
        return this.acctCrossUplValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAcctLever() {
        return this.acctLever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAdjEq() {
        return this.adjEq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAdjEqValuation() {
        return this.adjEqValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAutoEarnCcy() {
        return this.autoEarnCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonElement getBalance() {
        return this.balance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<T> getBalanceData() {
        return this.balanceData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBorrowFroz() {
        return this.borrowFroz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getCedefiAccountCreated() {
        return this.cedefiAccountCreated;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getCedefiAccountExist() {
        return this.cedefiAccountExist;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getCollateralSettingEnabled() {
        return this.collateralSettingEnabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDelta() {
        return this.delta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDeltaLever() {
        return this.deltaLever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDeltaNeutralStatus() {
        return this.deltaNeutralStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getEnableSpotBorrow() {
        return this.enableSpotBorrow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<T> getFundingNonEligibleAssets() {
        return this.fundingNonEligibleAssets;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getImr() {
        return this.imr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLegalTenderTotalValuation() {
        return this.legalTenderTotalValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMgnRatio() {
        return this.mgnRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMmr() {
        return this.mmr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNotionalUsd() {
        return this.notionalUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNotionalUsdForBorrow() {
        return this.notionalUsdForBorrow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNotionalUsdForFutures() {
        return this.notionalUsdForFutures;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNotionalUsdForOption() {
        return this.notionalUsdForOption;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNotionalUsdForSwap() {
        return this.notionalUsdForSwap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNotionalValuation() {
        return this.notionalValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getShowAutoEarnGuide() {
        return this.showAutoEarnGuide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStgyType() {
        return this.stgyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getSupportFiatCurrency() {
        return this.supportFiatCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalEq() {
        return this.totalEq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalValuation() {
        return this.totalValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getTradingPageOptimizationEnabled() {
        return this.tradingPageOptimizationEnabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUsdTotalValuation() {
        return this.usdTotalValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAccountGrade(Integer num) {
        this.accountGrade = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAcctAvaMargin(String str) {
        this.acctAvaMargin = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAcctAvaMarginValuation(String str) {
        this.acctAvaMarginValuation = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAcctBalRatio(String str) {
        this.acctBalRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAcctCashBalValuation(String str) {
        this.acctCashBalValuation = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAcctCrossFrozen(String str) {
        this.acctCrossFrozen = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAcctCrossUplValuation(String str) {
        this.acctCrossUplValuation = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAcctLever(String str) {
        this.acctLever = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAdjEq(String str) {
        this.adjEq = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAdjEqValuation(String str) {
        this.adjEqValuation = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAutoEarnCcy(String str) {
        this.autoEarnCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBalance(JsonElement jsonElement) {
        this.balance = jsonElement;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBalanceData(List<? extends T> list) {
        this.balanceData = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBorrowFroz(String str) {
        this.borrowFroz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCedefiAccountCreated(boolean z) {
        this.cedefiAccountCreated = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCedefiAccountExist(boolean z) {
        this.cedefiAccountExist = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCollateralSettingEnabled(Boolean bool) {
        this.collateralSettingEnabled = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDelta(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.delta = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDeltaLever(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.deltaLever = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDeltaNeutralStatus(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.deltaNeutralStatus = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEnableSpotBorrow(boolean z) {
        this.enableSpotBorrow = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFundingNonEligibleAssets(List<? extends T> list) {
        this.fundingNonEligibleAssets = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setImr(String str) {
        this.imr = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLegalTenderTotalValuation(String str) {
        this.legalTenderTotalValuation = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMgnRatio(String str) {
        this.mgnRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMmr(String str) {
        this.mmr = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNotionalUsd(String str) {
        this.notionalUsd = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNotionalUsdForBorrow(String str) {
        this.notionalUsdForBorrow = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNotionalUsdForFutures(String str) {
        this.notionalUsdForFutures = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNotionalUsdForOption(String str) {
        this.notionalUsdForOption = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNotionalUsdForSwap(String str) {
        this.notionalUsdForSwap = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNotionalValuation(String str) {
        this.notionalValuation = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowAutoEarnGuide(Boolean bool) {
        this.showAutoEarnGuide = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStgyType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.stgyType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSupportFiatCurrency(Boolean bool) {
        this.supportFiatCurrency = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTotalEq(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.totalEq = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTotalValuation(String str) {
        this.totalValuation = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTradingPageOptimizationEnabled(boolean z) {
        this.tradingPageOptimizationEnabled = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUsdTotalValuation(String str) {
        this.usdTotalValuation = str;
    }
}
