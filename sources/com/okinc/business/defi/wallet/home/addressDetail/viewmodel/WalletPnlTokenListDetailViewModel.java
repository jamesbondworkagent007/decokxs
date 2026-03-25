package com.okinc.business.defi.wallet.home.addressDetail.viewmodel;

import androidx.lifecycle.ViewModelKt;
import com.okinc.business.defi.biz.net.bean.SupportPnlChainResponse;
import com.okinc.business.defi.biz.net.bean.WalletPnlTokenBean;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import o.AbstractC33073mpa;
import o.C15835eXa;
import o.eWR;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletPnlTokenListDetailViewModel extends AbstractC33073mpa {
    public final MutableSharedFlow<Boolean> AEQbTJ;
    public final SharedFlow<Boolean> AYXKKw;
    public final MutableSharedFlow<List<SupportPnlChainResponse>> AhwBna;
    public final SharedFlow<List<eWR>> AkhnZx;
    public final SharedFlow<List<eWR>> DbNXlk;
    public final MutableSharedFlow<List<eWR>> EZpvd;
    public final MutableSharedFlow<Boolean> KWHzl;
    public final MutableSharedFlow<List<eWR>> OLrzqt;
    public final MutableSharedFlow<Integer> copydefault;
    public final C15835eXa djBIcL;
    public final SharedFlow<Integer> fetchVPNInfo;
    public final String gEmmrt;
    public final SharedFlow<List<SupportPnlChainResponse>> isConnected;
    public final SharedFlow<Boolean> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<List<eWR>> AEQbTJ() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<List<SupportPnlChainResponse>> AhwBna() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Boolean> EZpvd() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<List<eWR>> OLrzqt() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Boolean> copydefault() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Integer> valueOf() {
        return this.fetchVPNInfo;
    }

    @yCM
    public WalletPnlTokenListDetailViewModel(@NotNull C15835eXa c15835eXa) {
        Intrinsics.checkNotNullParameter(c15835eXa, "");
        this.djBIcL = c15835eXa;
        MutableSharedFlow<List<eWR>> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.OLrzqt = mutableSharedFlowMutableSharedFlow$default;
        this.AkhnZx = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableSharedFlow<List<eWR>> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.EZpvd = mutableSharedFlowMutableSharedFlow$default2;
        this.DbNXlk = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
        MutableSharedFlow<Integer> mutableSharedFlowMutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.copydefault = mutableSharedFlowMutableSharedFlow$default3;
        this.fetchVPNInfo = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default3);
        MutableSharedFlow<Boolean> mutableSharedFlowMutableSharedFlow$default4 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.KWHzl = mutableSharedFlowMutableSharedFlow$default4;
        this.valueOf = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default4);
        MutableSharedFlow<List<SupportPnlChainResponse>> mutableSharedFlowMutableSharedFlow$default5 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.AhwBna = mutableSharedFlowMutableSharedFlow$default5;
        this.isConnected = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default5);
        this.gEmmrt = "--";
        MutableSharedFlow<Boolean> mutableSharedFlowMutableSharedFlow$default6 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.AEQbTJ = mutableSharedFlowMutableSharedFlow$default6;
        this.AYXKKw = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default6);
    }

    public final void KWHzl() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new WalletPnlTokenListDetailViewModel$getWalletPnlSupportChainList$1(this, null), 2, null);
    }

    public final void OLrzqt(@NotNull String str, Long l, int i, boolean z, int i2, int i3, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new WalletPnlTokenListDetailViewModel$getWalletAddressPnlTokenList$1(this, str, l, i, z, i2, i3, z2, null), 2, null);
    }

    public final eWR EZpvd(WalletPnlTokenBean walletPnlTokenBean) {
        String tokenLogoUrl = walletPnlTokenBean.getTokenLogoUrl();
        if (tokenLogoUrl == null) {
            tokenLogoUrl = this.gEmmrt;
        }
        String str = tokenLogoUrl;
        String chainLogo = walletPnlTokenBean.getChainLogo();
        if (chainLogo == null) {
            chainLogo = this.gEmmrt;
        }
        String str2 = chainLogo;
        String chainId = walletPnlTokenBean.getChainId();
        if (chainId == null) {
            chainId = this.gEmmrt;
        }
        String str3 = chainId;
        String tokenContractAddress = walletPnlTokenBean.getTokenContractAddress();
        if (tokenContractAddress == null) {
            tokenContractAddress = this.gEmmrt;
        }
        String str4 = tokenContractAddress;
        String tokenSymbol = walletPnlTokenBean.getTokenSymbol();
        if (tokenSymbol == null) {
            tokenSymbol = this.gEmmrt;
        }
        String str5 = tokenSymbol;
        Integer riskLevel = walletPnlTokenBean.getRiskLevel();
        boolean z = riskLevel != null && riskLevel.intValue() == 4;
        String totalPnl = walletPnlTokenBean.getTotalPnl();
        if (totalPnl == null) {
            totalPnl = this.gEmmrt;
        }
        String str6 = totalPnl;
        String totalPnlPercentage = walletPnlTokenBean.getTotalPnlPercentage();
        if (totalPnlPercentage == null) {
            totalPnlPercentage = this.gEmmrt;
        }
        String str7 = totalPnlPercentage;
        String buyVolume = walletPnlTokenBean.getBuyVolume();
        if (buyVolume == null) {
            buyVolume = this.gEmmrt;
        }
        String str8 = buyVolume;
        String buyAvgPrice = walletPnlTokenBean.getBuyAvgPrice();
        if (buyAvgPrice == null) {
            buyAvgPrice = this.gEmmrt;
        }
        String str9 = buyAvgPrice;
        String sellVolume = walletPnlTokenBean.getSellVolume();
        if (sellVolume == null) {
            sellVolume = this.gEmmrt;
        }
        String str10 = sellVolume;
        String sellAvgPrice = walletPnlTokenBean.getSellAvgPrice();
        if (sellAvgPrice == null) {
            sellAvgPrice = this.gEmmrt;
        }
        String str11 = sellAvgPrice;
        String balanceUsd = walletPnlTokenBean.getBalanceUsd();
        if (balanceUsd == null) {
            balanceUsd = this.gEmmrt;
        }
        String str12 = balanceUsd;
        String balance = walletPnlTokenBean.getBalance();
        if (balance == null) {
            balance = this.gEmmrt;
        }
        String str13 = balance;
        String totalTxBuy = walletPnlTokenBean.getTotalTxBuy();
        if (totalTxBuy == null) {
            totalTxBuy = this.gEmmrt;
        }
        String str14 = totalTxBuy;
        String totalTxSell = walletPnlTokenBean.getTotalTxSell();
        if (totalTxSell == null) {
            totalTxSell = this.gEmmrt;
        }
        String str15 = totalTxSell;
        String latestTime = walletPnlTokenBean.getLatestTime();
        if (latestTime == null) {
            latestTime = "0";
        }
        String str16 = latestTime;
        Long rowId = walletPnlTokenBean.getRowId();
        return new eWR(rowId != null ? rowId.longValue() : 0L, str3, str2, str4, str, str5, z, str16, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, null, walletPnlTokenBean.getNativeTokenPrice(), 262144, null);
    }

    public final void EZpvd(@NotNull String str, Long l, int i, boolean z, int i2, int i3, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new WalletPnlTokenListDetailViewModel$getWalletAccountPnlTokenList$1(this, str, l, i, z, i2, i3, z2, null), 2, null);
    }

    public final void copydefault(boolean z) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new WalletPnlTokenListDetailViewModel$updateFilterRiskyTokenStatus$1(this, z, null), 2, null);
    }
}
