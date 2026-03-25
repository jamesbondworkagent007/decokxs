package com.okinc.dexkline.market.features.token_detail;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.dexkline.dexlogic.main.swap.ws.bean.MarketTradeRealTimeBean;
import com.okinc.dexkline.dexlogic.main.swap.ws.bean.MarketTxWsInfoItemBean;
import com.okinc.dexkline.dexui.main.market.detail.fragment.chart.pooltransactions.transactionhistory.FilterTimeDuration;
import com.okinc.dexkline.market.features.overview.domain.TransactionInfo;
import com.okinc.dexkline.market.features.token_detail.RealtimeDataViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C32158mRq;
import o.C32164mRw;
import o.C34576neg;
import o.mUR;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class RealtimeDataViewModel extends ViewModel {
    public final MutableStateFlow<TokenDetail> AEQbTJ;
    public final Flow<TransactionInfo> AYXKKw;
    public final StateFlow<TokenDetail> AhwBna;
    public final C34576neg EZpvd;
    public final MutableStateFlow<TransactionInfo> KWHzl;
    public FilterTimeDuration OLrzqt;
    public FilterTimeDuration copydefault;
    public C32158mRq djBIcL;

    public final void AEQbTJ() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Flow<TransactionInfo> EZpvd() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull FilterTimeDuration filterTimeDuration) {
        Intrinsics.checkNotNullParameter(filterTimeDuration, "");
        this.copydefault = filterTimeDuration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<TokenDetail> OLrzqt() {
        return this.AhwBna;
    }

    @yCM
    public RealtimeDataViewModel(@NotNull C34576neg c34576neg) {
        Intrinsics.checkNotNullParameter(c34576neg, "");
        this.EZpvd = c34576neg;
        FilterTimeDuration filterTimeDuration = FilterTimeDuration.TWENTY_FOUR_HOURS_SELECTION;
        this.OLrzqt = filterTimeDuration;
        MutableStateFlow<TransactionInfo> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.KWHzl = MutableStateFlow;
        this.AYXKKw = MutableStateFlow;
        MutableStateFlow<TokenDetail> MutableStateFlow2 = StateFlowKt.MutableStateFlow(new TokenDetail(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 15, null));
        this.AEQbTJ = MutableStateFlow2;
        this.AhwBna = FlowKt.asStateFlow(MutableStateFlow2);
        this.copydefault = filterTimeDuration;
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        copydefault();
        AEQbTJ();
        super.onCleared();
    }

    public final void KWHzl(@NotNull TokenDetail tokenDetail, @NotNull String str, @NotNull String str2, @NotNull String str3, boolean z) {
        Intrinsics.checkNotNullParameter(tokenDetail, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.AEQbTJ.setValue(tokenDetail);
        copydefault();
        C32158mRq c32158mRq = new C32158mRq(str, str3, str2);
        this.djBIcL = c32158mRq;
        c32158mRq.copydefault(new Function1() { // from class: o.ndP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return RealtimeDataViewModel.EZpvd(this.KWHzl, (MarketTxWsInfoItemBean) obj);
            }
        });
        c32158mRq.KWHzl(new Function1() { // from class: o.ndM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return RealtimeDataViewModel.EZpvd(this.OLrzqt, (MarketTradeRealTimeBean) obj);
            }
        });
        c32158mRq.AEQbTJ(z);
        c32158mRq.copydefault();
    }

    public static final Unit EZpvd(RealtimeDataViewModel realtimeDataViewModel, MarketTxWsInfoItemBean marketTxWsInfoItemBean) {
        Intrinsics.checkNotNullParameter(marketTxWsInfoItemBean, "");
        realtimeDataViewModel.copydefault(marketTxWsInfoItemBean);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(RealtimeDataViewModel realtimeDataViewModel, MarketTradeRealTimeBean marketTradeRealTimeBean) {
        Intrinsics.checkNotNullParameter(marketTradeRealTimeBean, "");
        realtimeDataViewModel.EZpvd(marketTradeRealTimeBean);
        return Unit.INSTANCE;
    }

    public final void copydefault(@NotNull MarketTxWsInfoItemBean marketTxWsInfoItemBean) {
        Intrinsics.checkNotNullParameter(marketTxWsInfoItemBean, "");
        mUR.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new RealtimeDataViewModel$updateTokenDetail$1(this, marketTxWsInfoItemBean, null), 3, null);
    }

    public final void EZpvd(@NotNull MarketTradeRealTimeBean marketTradeRealTimeBean) {
        Intrinsics.checkNotNullParameter(marketTradeRealTimeBean, "");
        this.KWHzl.setValue(C32164mRw.OLrzqt(marketTradeRealTimeBean, this.copydefault));
    }

    public final void copydefault() {
        C32158mRq c32158mRq = this.djBIcL;
        if (c32158mRq != null) {
            c32158mRq.EZpvd();
        }
        C32158mRq c32158mRq2 = this.djBIcL;
        if (c32158mRq2 != null) {
            c32158mRq2.AEQbTJ();
        }
        this.djBIcL = null;
    }
}
