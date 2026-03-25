package com.okinc.assets.backend.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.assets.backend.api.model.BalancePortfolio;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class UnifiedAssetsBalanceBean implements AssetsBalanceBaseBean, AreaLimitAsset, Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<UnifiedAssetsBalanceBean> CREATOR = new Creator();
    private String accAvgPx;
    private Integer accountGrade;
    private Boolean areaLimit;
    private String autoLendAmt;
    private String autoLendAmtValuation;
    private String autoLendApr;
    private String autoLendDeepLink;
    private Boolean autoLendEnabled;
    private String autoLendMtAmt;
    private String autoLendMtAmtValuation;
    private String autoLendStatus;
    private String autoStakingApr;
    private String autoStakingStatus;
    private Double availBal;
    private String availEq;
    private Double availableValuation;
    private String bonus;
    private String borrowFroz;
    private String btcAvailableValuation;
    private String btcFrozenValuation;
    private String btcLiabilityValuation;
    private String btcValuation;
    private boolean canBeSmallBalanceFiltered = true;
    private Boolean canReset;
    private Boolean canTrade;
    private Boolean canTransfer;
    private Boolean canVipBorrow;
    private String cashBal;
    private String cashBalValuation;
    private String chainLogoUrl;
    private String cnyAvailableValuation;
    private String cnyFrozenValuation;
    private String cnyLiabilityValuation;
    private String cnyValuation;
    private String coinCrossEq;
    private String coinCrossEqValuation;
    private String coinRealBorrowAmt;
    private String coinRealBorrowAmtValuation;
    private boolean collateral;
    private boolean collateralEnabled;
    private String collateralRequired;
    private String collateralRestrict;
    private String crossLiab;
    private String currency;
    private Long currencyId;
    private String disableRelationCcy;
    private String enableRelationCcy;
    private String eq;
    private String eqUsd;
    private Boolean fiatCategory;
    private Boolean fiatFlag;
    private String frozenBal;
    private Double frozenValuation;
    private String fullName;
    private Boolean havePrice;
    private Boolean hideOverviewPnl;
    private String icon;
    private InvalidAssetListResp invalidAsset;
    private String isoEq;
    private String isoLiab;
    private String isoUpl;
    private Double liab;
    private Double liabilityValuation;
    private String max;
    private String mgnRatio;
    private String openAvgPx;
    private Double percentage;
    private String pnlLastPriceValuation;
    private final BalancePortfolio.RedeemInfo redeemInfo;
    private String rewardBal;
    private boolean showAssetsDetails;
    private boolean showOneKeyPay;
    private boolean showReset;
    private String smtSyncEq;
    private String spotBal;
    private String spotCopyTradingEq;
    private String spotUpl;
    private String spotUplRatio;
    private String stgyEq;
    private Boolean supportAutoLend;
    private Boolean supportAutoStaking;
    private String totalPnl;
    private String totalPnlRatio;
    private String tradeCurrencyPair;
    private String twap;
    private String upl;
    private String usdAvailableValuation;
    private String usdFrozenValuation;
    private String usdLiabilityValuation;
    private String usdValuation;
    private String usdtAvailableValuation;
    private String usdtFrozenValuation;
    private String usdtLiabilityValuation;
    private String usdtValuation;
    private String valuation;

    public static final class Creator implements Parcelable.Creator<UnifiedAssetsBalanceBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UnifiedAssetsBalanceBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.readInt();
            return new UnifiedAssetsBalanceBean();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UnifiedAssetsBalanceBean[] newArray(int i) {
            return new UnifiedAssetsBalanceBean[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccAvgPx() {
        return this.accAvgPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getAccountGrade() {
        return this.accountGrade;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.assets.backend.api.model.AreaLimitAsset
    public Boolean getAreaLimit() {
        return this.areaLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAutoLendAmt() {
        return this.autoLendAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAutoLendAmtValuation() {
        return this.autoLendAmtValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAutoLendApr() {
        return this.autoLendApr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.assets.backend.api.model.AssetsBalanceBaseBean
    public String getAutoLendDeepLink() {
        return this.autoLendDeepLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getAutoLendEnabled() {
        return this.autoLendEnabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAutoLendMtAmt() {
        return this.autoLendMtAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAutoLendMtAmtValuation() {
        return this.autoLendMtAmtValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAutoLendStatus() {
        return this.autoLendStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAutoStakingApr() {
        return this.autoStakingApr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAutoStakingStatus() {
        return this.autoStakingStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Double getAvailBal() {
        return this.availBal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvailEq() {
        return this.availEq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Double getAvailableValuation() {
        return this.availableValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBonus() {
        return this.bonus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBorrowFroz() {
        return this.borrowFroz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBtcAvailableValuation() {
        return this.btcAvailableValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBtcFrozenValuation() {
        return this.btcFrozenValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBtcLiabilityValuation() {
        return this.btcLiabilityValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBtcValuation() {
        return this.btcValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getCanBeSmallBalanceFiltered() {
        return this.canBeSmallBalanceFiltered;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getCanReset() {
        return this.canReset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getCanTrade() {
        return this.canTrade;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getCanTransfer() {
        return this.canTransfer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getCanVipBorrow() {
        return this.canVipBorrow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCashBal() {
        return this.cashBal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCashBalValuation() {
        return this.cashBalValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.assets.backend.api.model.AssetsBalanceBaseBean
    public String getChainLogoUrl() {
        return this.chainLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCnyAvailableValuation() {
        return this.cnyAvailableValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCnyFrozenValuation() {
        return this.cnyFrozenValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCnyLiabilityValuation() {
        return this.cnyLiabilityValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCnyValuation() {
        return this.cnyValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinCrossEq() {
        return this.coinCrossEq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinCrossEqValuation() {
        return this.coinCrossEqValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinRealBorrowAmt() {
        return this.coinRealBorrowAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinRealBorrowAmtValuation() {
        return this.coinRealBorrowAmtValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getCollateral() {
        return this.collateral;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getCollateralEnabled() {
        return this.collateralEnabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCollateralRequired() {
        return this.collateralRequired;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCollateralRestrict() {
        return this.collateralRestrict;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCrossLiab() {
        return this.crossLiab;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getCurrencyId() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisableRelationCcy() {
        return this.disableRelationCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEnableRelationCcy() {
        return this.enableRelationCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEq() {
        return this.eq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEqUsd() {
        return this.eqUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.assets.backend.api.model.AssetsBalanceBaseBean
    public Boolean getFiatCategory() {
        return this.fiatCategory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getFiatFlag() {
        return this.fiatFlag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFrozenBal() {
        return this.frozenBal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Double getFrozenValuation() {
        return this.frozenValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFullName() {
        return this.fullName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getHavePrice() {
        return this.havePrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.assets.backend.api.model.AssetsBalanceBaseBean
    public Boolean getHideOverviewPnl() {
        return this.hideOverviewPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvalidAssetListResp getInvalidAsset() {
        return this.invalidAsset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIsoEq() {
        return this.isoEq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIsoLiab() {
        return this.isoLiab;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIsoUpl() {
        return this.isoUpl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Double getLiab() {
        return this.liab;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Double getLiabilityValuation() {
        return this.liabilityValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMax() {
        return this.max;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMgnRatio() {
        return this.mgnRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOpenAvgPx() {
        return this.openAvgPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Double getPercentage() {
        return this.percentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPnlLastPriceValuation() {
        return this.pnlLastPriceValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BalancePortfolio.RedeemInfo getRedeemInfo() {
        return this.redeemInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRewardBal() {
        return this.rewardBal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.assets.backend.api.model.AssetsBalanceBaseBean
    public String getSearchFilter() {
        return this.currency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getShowAssetsDetails() {
        return this.showAssetsDetails;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getShowOneKeyPay() {
        return this.showOneKeyPay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getShowReset() {
        return this.showReset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.assets.backend.api.model.AssetsBalanceBaseBean
    public String getSmallBalanceFilter() {
        return this.usdValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSmtSyncEq() {
        return this.smtSyncEq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSpotBal() {
        return this.spotBal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSpotCopyTradingEq() {
        return this.spotCopyTradingEq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSpotUpl() {
        return this.spotUpl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSpotUplRatio() {
        return this.spotUplRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStgyEq() {
        return this.stgyEq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getSupportAutoLend() {
        return this.supportAutoLend;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getSupportAutoStaking() {
        return this.supportAutoStaking;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalPnl() {
        return this.totalPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalPnlRatio() {
        return this.totalPnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradeCurrencyPair() {
        return this.tradeCurrencyPair;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTwap() {
        return this.twap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUpl() {
        return this.upl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUsdAvailableValuation() {
        return this.usdAvailableValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUsdFrozenValuation() {
        return this.usdFrozenValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUsdLiabilityValuation() {
        return this.usdLiabilityValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUsdValuation() {
        return this.usdValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUsdtAvailableValuation() {
        return this.usdtAvailableValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUsdtFrozenValuation() {
        return this.usdtFrozenValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUsdtLiabilityValuation() {
        return this.usdtLiabilityValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUsdtValuation() {
        return this.usdtValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValuation() {
        return this.valuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAccAvgPx(String str) {
        this.accAvgPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAccountGrade(Integer num) {
        this.accountGrade = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.assets.backend.api.model.AreaLimitAsset
    public void setAreaLimit(Boolean bool) {
        this.areaLimit = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAutoLendAmt(String str) {
        this.autoLendAmt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAutoLendAmtValuation(String str) {
        this.autoLendAmtValuation = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAutoLendApr(String str) {
        this.autoLendApr = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.assets.backend.api.model.AssetsBalanceBaseBean
    public void setAutoLendDeepLink(String str) {
        this.autoLendDeepLink = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAutoLendEnabled(Boolean bool) {
        this.autoLendEnabled = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAutoLendMtAmt(String str) {
        this.autoLendMtAmt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAutoLendMtAmtValuation(String str) {
        this.autoLendMtAmtValuation = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAutoLendStatus(String str) {
        this.autoLendStatus = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAutoStakingApr(String str) {
        this.autoStakingApr = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAutoStakingStatus(String str) {
        this.autoStakingStatus = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAvailBal(Double d) {
        this.availBal = d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAvailEq(String str) {
        this.availEq = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAvailableValuation(Double d) {
        this.availableValuation = d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBonus(String str) {
        this.bonus = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBorrowFroz(String str) {
        this.borrowFroz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBtcAvailableValuation(String str) {
        this.btcAvailableValuation = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBtcFrozenValuation(String str) {
        this.btcFrozenValuation = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBtcLiabilityValuation(String str) {
        this.btcLiabilityValuation = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBtcValuation(String str) {
        this.btcValuation = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCanBeSmallBalanceFiltered(boolean z) {
        this.canBeSmallBalanceFiltered = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCanReset(Boolean bool) {
        this.canReset = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCanTrade(Boolean bool) {
        this.canTrade = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCanTransfer(Boolean bool) {
        this.canTransfer = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCanVipBorrow(Boolean bool) {
        this.canVipBorrow = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCashBal(String str) {
        this.cashBal = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCashBalValuation(String str) {
        this.cashBalValuation = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.assets.backend.api.model.AssetsBalanceBaseBean
    public void setChainLogoUrl(String str) {
        this.chainLogoUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCnyAvailableValuation(String str) {
        this.cnyAvailableValuation = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCnyFrozenValuation(String str) {
        this.cnyFrozenValuation = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCnyLiabilityValuation(String str) {
        this.cnyLiabilityValuation = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCnyValuation(String str) {
        this.cnyValuation = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinCrossEq(String str) {
        this.coinCrossEq = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinCrossEqValuation(String str) {
        this.coinCrossEqValuation = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinRealBorrowAmt(String str) {
        this.coinRealBorrowAmt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinRealBorrowAmtValuation(String str) {
        this.coinRealBorrowAmtValuation = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCollateral(boolean z) {
        this.collateral = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCollateralEnabled(boolean z) {
        this.collateralEnabled = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCollateralRequired(String str) {
        this.collateralRequired = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCollateralRestrict(String str) {
        this.collateralRestrict = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCrossLiab(String str) {
        this.crossLiab = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrency(String str) {
        this.currency = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrencyId(Long l) {
        this.currencyId = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDisableRelationCcy(String str) {
        this.disableRelationCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEnableRelationCcy(String str) {
        this.enableRelationCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEq(String str) {
        this.eq = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEqUsd(String str) {
        this.eqUsd = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.assets.backend.api.model.AssetsBalanceBaseBean
    public void setFiatCategory(Boolean bool) {
        this.fiatCategory = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFiatFlag(Boolean bool) {
        this.fiatFlag = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFrozenBal(String str) {
        this.frozenBal = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFrozenValuation(Double d) {
        this.frozenValuation = d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFullName(String str) {
        this.fullName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHavePrice(Boolean bool) {
        this.havePrice = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.assets.backend.api.model.AssetsBalanceBaseBean
    public void setHideOverviewPnl(Boolean bool) {
        this.hideOverviewPnl = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIcon(String str) {
        this.icon = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInvalidAsset(InvalidAssetListResp invalidAssetListResp) {
        this.invalidAsset = invalidAssetListResp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIsoEq(String str) {
        this.isoEq = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIsoLiab(String str) {
        this.isoLiab = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIsoUpl(String str) {
        this.isoUpl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLiab(Double d) {
        this.liab = d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLiabilityValuation(Double d) {
        this.liabilityValuation = d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMax(String str) {
        this.max = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMgnRatio(String str) {
        this.mgnRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOpenAvgPx(String str) {
        this.openAvgPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPercentage(Double d) {
        this.percentage = d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPnlLastPriceValuation(String str) {
        this.pnlLastPriceValuation = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRewardBal(String str) {
        this.rewardBal = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowAssetsDetails(boolean z) {
        this.showAssetsDetails = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowOneKeyPay(boolean z) {
        this.showOneKeyPay = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowReset(boolean z) {
        this.showReset = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSmtSyncEq(String str) {
        this.smtSyncEq = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSpotBal(String str) {
        this.spotBal = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSpotCopyTradingEq(String str) {
        this.spotCopyTradingEq = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSpotUpl(String str) {
        this.spotUpl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSpotUplRatio(String str) {
        this.spotUplRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStgyEq(String str) {
        this.stgyEq = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSupportAutoLend(Boolean bool) {
        this.supportAutoLend = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSupportAutoStaking(Boolean bool) {
        this.supportAutoStaking = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTotalPnl(String str) {
        this.totalPnl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTotalPnlRatio(String str) {
        this.totalPnlRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTradeCurrencyPair(String str) {
        this.tradeCurrencyPair = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTwap(String str) {
        this.twap = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUpl(String str) {
        this.upl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUsdAvailableValuation(String str) {
        this.usdAvailableValuation = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUsdFrozenValuation(String str) {
        this.usdFrozenValuation = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUsdLiabilityValuation(String str) {
        this.usdLiabilityValuation = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUsdValuation(String str) {
        this.usdValuation = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUsdtAvailableValuation(String str) {
        this.usdtAvailableValuation = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUsdtFrozenValuation(String str) {
        this.usdtFrozenValuation = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUsdtLiabilityValuation(String str) {
        this.usdtLiabilityValuation = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUsdtValuation(String str) {
        this.usdtValuation = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setValuation(String str) {
        this.valuation = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(1);
    }
}
