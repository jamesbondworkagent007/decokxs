package com.okinc.assets.backend.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.assets.backend.api.model.BalancePortfolio;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class FundingAssetsBalanceBean implements AssetsBalanceBaseBean, AreaLimitAsset, Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<FundingAssetsBalanceBean> CREATOR = new Creator();
    private Boolean areaLimit;
    private AssetType assetType;
    private String autoLendDeepLink;
    private String balance;
    private String btcValuation;
    private boolean canBeSmallBalanceFiltered;
    private Boolean canBuy;
    private Boolean canRecharge;
    private Boolean canTransfer;
    private Boolean canWithdraw;
    private String chainLogoUrl;
    private String cnyValuation;
    private String currency;
    private Long currencyId;
    private String currencySymbol;
    private Boolean fiatCategory;
    private boolean fiatFlag;
    private String fullName;
    private Boolean hideOverviewPnl;
    private String hold;
    private String icon;
    private String interest;
    private InvalidAssetListResp invalidAsset;
    private Boolean isEntitySupported;
    private String liabilityAmountValution;
    private String liabilityInterestValution;
    private String liabilityTotalValuation;
    private Boolean online;
    private String percentage;
    private BalancePortfolio.RedeemInfo redeemInfo;
    private String total;
    private String usdValuation;
    private String usdtValuation;
    private String valuation;

    public static final class Creator implements Parcelable.Creator<FundingAssetsBalanceBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FundingAssetsBalanceBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.readInt();
            return new FundingAssetsBalanceBean();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FundingAssetsBalanceBean[] newArray(int i) {
            return new FundingAssetsBalanceBean[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.assets.backend.api.model.AreaLimitAsset
    public Boolean getAreaLimit() {
        return this.areaLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AssetType getAssetType() {
        return this.assetType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.assets.backend.api.model.AssetsBalanceBaseBean
    public String getAutoLendDeepLink() {
        return this.autoLendDeepLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBalance() {
        return this.balance;
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
    public final Boolean getCanBuy() {
        return this.canBuy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getCanRecharge() {
        return this.canRecharge;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getCanTransfer() {
        return this.canTransfer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getCanWithdraw() {
        return this.canWithdraw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.assets.backend.api.model.AssetsBalanceBaseBean
    public String getChainLogoUrl() {
        return this.chainLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCnyValuation() {
        return this.cnyValuation;
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
    public final String getCurrencySymbol() {
        return this.currencySymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.assets.backend.api.model.AssetsBalanceBaseBean
    public Boolean getFiatCategory() {
        return this.fiatCategory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getFiatFlag() {
        return this.fiatFlag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFullName() {
        return this.fullName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.assets.backend.api.model.AssetsBalanceBaseBean
    public Boolean getHideOverviewPnl() {
        return this.hideOverviewPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHold() {
        return this.hold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInterest() {
        return this.interest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvalidAssetListResp getInvalidAsset() {
        return this.invalidAsset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLiabilityAmountValution() {
        return this.liabilityAmountValution;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLiabilityInterestValution() {
        return this.liabilityInterestValution;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLiabilityTotalValuation() {
        return this.liabilityTotalValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getOnline() {
        return this.online;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPercentage() {
        return this.percentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BalancePortfolio.RedeemInfo getRedeemInfo() {
        return this.redeemInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.assets.backend.api.model.AssetsBalanceBaseBean
    public String getSearchFilter() {
        return this.currency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.assets.backend.api.model.AssetsBalanceBaseBean
    public String getSmallBalanceFilter() {
        return this.usdValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotal() {
        return this.total;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUsdValuation() {
        return this.usdValuation;
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
    public final Boolean isEntitySupported() {
        return this.isEntitySupported;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.assets.backend.api.model.AreaLimitAsset
    public void setAreaLimit(Boolean bool) {
        this.areaLimit = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAssetType(AssetType assetType) {
        this.assetType = assetType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.assets.backend.api.model.AssetsBalanceBaseBean
    public void setAutoLendDeepLink(String str) {
        this.autoLendDeepLink = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBalance(String str) {
        this.balance = str;
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
    public final void setCanBuy(Boolean bool) {
        this.canBuy = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCanRecharge(Boolean bool) {
        this.canRecharge = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCanTransfer(Boolean bool) {
        this.canTransfer = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCanWithdraw(Boolean bool) {
        this.canWithdraw = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.assets.backend.api.model.AssetsBalanceBaseBean
    public void setChainLogoUrl(String str) {
        this.chainLogoUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCnyValuation(String str) {
        this.cnyValuation = str;
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
    public final void setCurrencySymbol(String str) {
        this.currencySymbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEntitySupported(Boolean bool) {
        this.isEntitySupported = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.assets.backend.api.model.AssetsBalanceBaseBean
    public void setFiatCategory(Boolean bool) {
        this.fiatCategory = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFiatFlag(boolean z) {
        this.fiatFlag = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFullName(String str) {
        this.fullName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.assets.backend.api.model.AssetsBalanceBaseBean
    public void setHideOverviewPnl(Boolean bool) {
        this.hideOverviewPnl = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHold(String str) {
        this.hold = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIcon(String str) {
        this.icon = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInterest(String str) {
        this.interest = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInvalidAsset(InvalidAssetListResp invalidAssetListResp) {
        this.invalidAsset = invalidAssetListResp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLiabilityAmountValution(String str) {
        this.liabilityAmountValution = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLiabilityInterestValution(String str) {
        this.liabilityInterestValution = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLiabilityTotalValuation(String str) {
        this.liabilityTotalValuation = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnline(Boolean bool) {
        this.online = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPercentage(String str) {
        this.percentage = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRedeemInfo(BalancePortfolio.RedeemInfo redeemInfo) {
        this.redeemInfo = redeemInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTotal(String str) {
        this.total = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUsdValuation(String str) {
        this.usdValuation = str;
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

    public FundingAssetsBalanceBean() {
        Boolean bool = Boolean.FALSE;
        this.fiatCategory = bool;
        this.hideOverviewPnl = bool;
        this.autoLendDeepLink = "";
        this.canBeSmallBalanceFiltered = true;
    }
}
