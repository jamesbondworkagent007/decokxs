package com.okinc.productmatrix.biz.entrances;

import kotlin.jvm.internal.Intrinsics;
import o.C6813aWU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class HomeEntranceConfig {
    public static final int $stable = 8;
    private CommonEntranceConfig buyCrypto = new CommonEntranceConfig(0);
    private CommonEntranceConfig spot = new CommonEntranceConfig(0);
    private CommonEntranceConfig margin = new CommonEntranceConfig(0);
    private CommonEntranceConfig futures = new CommonEntranceConfig(0);
    private CommonEntranceConfig perpetual = new CommonEntranceConfig(0);
    private CommonEntranceConfig options = new CommonEntranceConfig(0);
    private CommonEntranceConfig loan = new CommonEntranceConfig(0);
    private CommonEntranceConfig saving = new CommonEntranceConfig(0);
    private JumpStartEntranceConfig jumpStart = new JumpStartEntranceConfig(0, new Url(C6813aWU.AEQbTJ("/jumpstart"), C6813aWU.AEQbTJ("/jumpstart")));
    private EarnEntranceConfig earn = new EarnEntranceConfig(0, new Url(C6813aWU.AEQbTJ("/earn"), C6813aWU.AEQbTJ("/earn")));
    private WalletEntranceConfig wallet = new WalletEntranceConfig(0, null, 2, null);
    private CommonEntranceConfig pool = new CommonEntranceConfig(0);
    private CommonEntranceConfig referral = new CommonEntranceConfig(0);
    private CommonEntranceConfig sendCrypto = new CommonEntranceConfig(0);
    private CommonEntranceConfig rewards = new CommonEntranceConfig(0);
    private HappyFridayEntranceConfig happyFriday = new HappyFridayEntranceConfig(0, new Url(C6813aWU.AEQbTJ("/happyfriday"), C6813aWU.AEQbTJ("/happyfriday")));
    private CommonEntranceConfig simulatedTrading = new CommonEntranceConfig(0);
    private CommonEntranceConfig academy = new CommonEntranceConfig(0);
    private CommonEntranceConfig crossChain = new CommonEntranceConfig(0);
    private StatusEntranceConfig status = new StatusEntranceConfig(0, new Url(C6813aWU.AEQbTJ("/status"), C6813aWU.AEQbTJ("/status")));
    private CommonEntranceConfig deposit = new CommonEntranceConfig(0);
    private CommonEntranceConfig withdraw = new CommonEntranceConfig(1);
    private CommonEntranceConfig transfer = new CommonEntranceConfig(1);
    private CommonEntranceConfig switchAccount = new CommonEntranceConfig(1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CommonEntranceConfig getAcademy() {
        return this.academy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CommonEntranceConfig getBuyCrypto() {
        return this.buyCrypto;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CommonEntranceConfig getCrossChain() {
        return this.crossChain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CommonEntranceConfig getDeposit() {
        return this.deposit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EarnEntranceConfig getEarn() {
        return this.earn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CommonEntranceConfig getFutures() {
        return this.futures;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HappyFridayEntranceConfig getHappyFriday() {
        return this.happyFriday;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JumpStartEntranceConfig getJumpStart() {
        return this.jumpStart;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CommonEntranceConfig getLoan() {
        return this.loan;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CommonEntranceConfig getMargin() {
        return this.margin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CommonEntranceConfig getOptions() {
        return this.options;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CommonEntranceConfig getPerpetual() {
        return this.perpetual;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CommonEntranceConfig getPool() {
        return this.pool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CommonEntranceConfig getReferral() {
        return this.referral;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CommonEntranceConfig getRewards() {
        return this.rewards;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CommonEntranceConfig getSaving() {
        return this.saving;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CommonEntranceConfig getSendCrypto() {
        return this.sendCrypto;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CommonEntranceConfig getSimulatedTrading() {
        return this.simulatedTrading;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CommonEntranceConfig getSpot() {
        return this.spot;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StatusEntranceConfig getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CommonEntranceConfig getSwitchAccount() {
        return this.switchAccount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CommonEntranceConfig getTransfer() {
        return this.transfer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletEntranceConfig getWallet() {
        return this.wallet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CommonEntranceConfig getWithdraw() {
        return this.withdraw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAcademy(@NotNull CommonEntranceConfig commonEntranceConfig) {
        Intrinsics.checkNotNullParameter(commonEntranceConfig, "");
        this.academy = commonEntranceConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBuyCrypto(@NotNull CommonEntranceConfig commonEntranceConfig) {
        Intrinsics.checkNotNullParameter(commonEntranceConfig, "");
        this.buyCrypto = commonEntranceConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCrossChain(@NotNull CommonEntranceConfig commonEntranceConfig) {
        Intrinsics.checkNotNullParameter(commonEntranceConfig, "");
        this.crossChain = commonEntranceConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDeposit(@NotNull CommonEntranceConfig commonEntranceConfig) {
        Intrinsics.checkNotNullParameter(commonEntranceConfig, "");
        this.deposit = commonEntranceConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEarn(@NotNull EarnEntranceConfig earnEntranceConfig) {
        Intrinsics.checkNotNullParameter(earnEntranceConfig, "");
        this.earn = earnEntranceConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFutures(@NotNull CommonEntranceConfig commonEntranceConfig) {
        Intrinsics.checkNotNullParameter(commonEntranceConfig, "");
        this.futures = commonEntranceConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHappyFriday(@NotNull HappyFridayEntranceConfig happyFridayEntranceConfig) {
        Intrinsics.checkNotNullParameter(happyFridayEntranceConfig, "");
        this.happyFriday = happyFridayEntranceConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setJumpStart(@NotNull JumpStartEntranceConfig jumpStartEntranceConfig) {
        Intrinsics.checkNotNullParameter(jumpStartEntranceConfig, "");
        this.jumpStart = jumpStartEntranceConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLoan(@NotNull CommonEntranceConfig commonEntranceConfig) {
        Intrinsics.checkNotNullParameter(commonEntranceConfig, "");
        this.loan = commonEntranceConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMargin(@NotNull CommonEntranceConfig commonEntranceConfig) {
        Intrinsics.checkNotNullParameter(commonEntranceConfig, "");
        this.margin = commonEntranceConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOptions(@NotNull CommonEntranceConfig commonEntranceConfig) {
        Intrinsics.checkNotNullParameter(commonEntranceConfig, "");
        this.options = commonEntranceConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPerpetual(@NotNull CommonEntranceConfig commonEntranceConfig) {
        Intrinsics.checkNotNullParameter(commonEntranceConfig, "");
        this.perpetual = commonEntranceConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPool(@NotNull CommonEntranceConfig commonEntranceConfig) {
        Intrinsics.checkNotNullParameter(commonEntranceConfig, "");
        this.pool = commonEntranceConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setReferral(@NotNull CommonEntranceConfig commonEntranceConfig) {
        Intrinsics.checkNotNullParameter(commonEntranceConfig, "");
        this.referral = commonEntranceConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRewards(@NotNull CommonEntranceConfig commonEntranceConfig) {
        Intrinsics.checkNotNullParameter(commonEntranceConfig, "");
        this.rewards = commonEntranceConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSaving(@NotNull CommonEntranceConfig commonEntranceConfig) {
        Intrinsics.checkNotNullParameter(commonEntranceConfig, "");
        this.saving = commonEntranceConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSendCrypto(@NotNull CommonEntranceConfig commonEntranceConfig) {
        Intrinsics.checkNotNullParameter(commonEntranceConfig, "");
        this.sendCrypto = commonEntranceConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSimulatedTrading(@NotNull CommonEntranceConfig commonEntranceConfig) {
        Intrinsics.checkNotNullParameter(commonEntranceConfig, "");
        this.simulatedTrading = commonEntranceConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSpot(@NotNull CommonEntranceConfig commonEntranceConfig) {
        Intrinsics.checkNotNullParameter(commonEntranceConfig, "");
        this.spot = commonEntranceConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStatus(@NotNull StatusEntranceConfig statusEntranceConfig) {
        Intrinsics.checkNotNullParameter(statusEntranceConfig, "");
        this.status = statusEntranceConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSwitchAccount(@NotNull CommonEntranceConfig commonEntranceConfig) {
        Intrinsics.checkNotNullParameter(commonEntranceConfig, "");
        this.switchAccount = commonEntranceConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTransfer(@NotNull CommonEntranceConfig commonEntranceConfig) {
        Intrinsics.checkNotNullParameter(commonEntranceConfig, "");
        this.transfer = commonEntranceConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWallet(@NotNull WalletEntranceConfig walletEntranceConfig) {
        Intrinsics.checkNotNullParameter(walletEntranceConfig, "");
        this.wallet = walletEntranceConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWithdraw(@NotNull CommonEntranceConfig commonEntranceConfig) {
        Intrinsics.checkNotNullParameter(commonEntranceConfig, "");
        this.withdraw = commonEntranceConfig;
    }
}
