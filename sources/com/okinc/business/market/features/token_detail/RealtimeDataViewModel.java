package com.okinc.business.market.features.token_detail;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.dexlogic.main.market.bean.CoinDetailPoolList;
import com.okinc.business.dexlogic.main.swap.ws.bean.MarketTradeRealTimeBean;
import com.okinc.business.dexlogic.main.swap.ws.bean.MarketTxWsInfoItemBean;
import com.okinc.business.dexui.main.market.detail.fragment.chart.pooltransactions.liquiditypools.itemviewbinding.liqpool.LiquidityPoolPairUIItem;
import com.okinc.business.dexui.main.market.detail.fragment.chart.pooltransactions.liquiditypools.itemviewbinding.liqpool.PoolTokenInfoUIItem;
import com.okinc.business.dexui.main.market.detail.fragment.chart.pooltransactions.transactionhistory.FilterTimeDuration;
import com.okinc.business.featureflag.FeatureFlag;
import com.okinc.business.market.data.model.WsLiquidityPoolItem;
import com.okinc.business.market.features.overview.domain.TransactionInfo;
import com.okinc.business.market.features.token_detail.RealtimeDataViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.json.Json;
import o.ABJ;
import o.C2165ABg;
import o.C22376heG;
import o.C22416heu;
import o.C23174htJ;
import o.C23258huo;
import o.C23305hvi;
import o.C25389ivm;
import o.C27616jyZ;
import o.C29772kzu;
import o.C56392yDr;
import o.C56402yEa;
import o.C56403yEb;
import o.C6777aVl;
import o.C7002aZy;
import o.InterfaceC25414iwK;
import o.InterfaceC56387yDm;
import o.pUU;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class RealtimeDataViewModel extends ViewModel {
    public String AYXKKw;
    public FilterTimeDuration AhwBna;
    public final C29772kzu AkhnZx;
    public final C7002aZy DbNXlk;
    public FilterTimeDuration EZpvd;
    public final MutableStateFlow<List<LiquidityPoolPairUIItem>> KWHzl;
    public final MutableStateFlow<TokenDetail> OLrzqt;
    public final MutableStateFlow<TransactionInfo> copydefault;
    public final Json djBIcL;
    public final StateFlow<TokenDetail> ejfBZ;
    public Job fIwbmz;
    public C23258huo fetchVPNInfo;
    public final InterfaceC25414iwK gEmmrt;
    public final InterfaceC56387yDm isConnected;
    public final StateFlow<List<LiquidityPoolPairUIItem>> valueOf;
    public final Flow<TransactionInfo> values;
    public static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Flow<TransactionInfo> AEQbTJ() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<TokenDetail> EZpvd() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<List<LiquidityPoolPairUIItem>> copydefault() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull FilterTimeDuration filterTimeDuration) {
        Intrinsics.checkNotNullParameter(filterTimeDuration, "");
        this.EZpvd = filterTimeDuration;
    }

    @yCM
    public RealtimeDataViewModel(@NotNull C29772kzu c29772kzu, @NotNull Json json, @NotNull InterfaceC25414iwK interfaceC25414iwK, @NotNull C7002aZy c7002aZy) {
        Intrinsics.checkNotNullParameter(c29772kzu, "");
        Intrinsics.checkNotNullParameter(json, "");
        Intrinsics.checkNotNullParameter(interfaceC25414iwK, "");
        Intrinsics.checkNotNullParameter(c7002aZy, "");
        this.AkhnZx = c29772kzu;
        this.djBIcL = json;
        this.gEmmrt = interfaceC25414iwK;
        this.DbNXlk = c7002aZy;
        FilterTimeDuration filterTimeDuration = FilterTimeDuration.TWENTY_FOUR_HOURS_SELECTION;
        this.AhwBna = filterTimeDuration;
        MutableStateFlow<TransactionInfo> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.copydefault = MutableStateFlow;
        this.values = MutableStateFlow;
        MutableStateFlow<TokenDetail> MutableStateFlow2 = StateFlowKt.MutableStateFlow(new TokenDetail(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 31, null));
        this.OLrzqt = MutableStateFlow2;
        this.ejfBZ = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<List<LiquidityPoolPairUIItem>> MutableStateFlow3 = StateFlowKt.MutableStateFlow(yDY.AhwBna());
        this.KWHzl = MutableStateFlow3;
        this.valueOf = FlowKt.asStateFlow(MutableStateFlow3);
        this.isConnected = C56392yDr.copydefault(new Function0() { // from class: o.kyW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return RealtimeDataViewModel.AEQbTJ(this.AEQbTJ);
            }
        });
        this.EZpvd = filterTimeDuration;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.token_detail.RealtimeDataViewModel.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public final C27616jyZ OLrzqt() {
        return (C27616jyZ) this.isConnected.getValue();
    }

    public static final C27616jyZ AEQbTJ(final RealtimeDataViewModel realtimeDataViewModel) {
        return new C27616jyZ(new Function1() { // from class: o.kyY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return RealtimeDataViewModel.copydefault(this.copydefault, (java.lang.String) obj);
            }
        });
    }

    public static final Unit copydefault(RealtimeDataViewModel realtimeDataViewModel, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        realtimeDataViewModel.KWHzl(str);
        return Unit.INSTANCE;
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        AYXKKw();
        KWHzl();
        super.onCleared();
    }

    public final void copydefault(@NotNull TokenDetail tokenDetail, @NotNull String str, @NotNull String str2, @NotNull String str3, boolean z) {
        Intrinsics.checkNotNullParameter(tokenDetail, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        if (C22416heu.ejfBZ()) {
            return;
        }
        this.OLrzqt.setValue(tokenDetail);
        AYXKKw();
        C23258huo c23258huo = new C23258huo(str, str3, str2);
        this.fetchVPNInfo = c23258huo;
        c23258huo.EZpvd(new Function1() { // from class: o.kza
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return RealtimeDataViewModel.copydefault(this.AEQbTJ, (MarketTxWsInfoItemBean) obj);
            }
        });
        c23258huo.OLrzqt(new Function1() { // from class: o.kze
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return RealtimeDataViewModel.KWHzl(this.OLrzqt, (MarketTradeRealTimeBean) obj);
            }
        });
        c23258huo.KWHzl(z);
        c23258huo.copydefault();
    }

    public static final Unit copydefault(RealtimeDataViewModel realtimeDataViewModel, MarketTxWsInfoItemBean marketTxWsInfoItemBean) {
        Intrinsics.checkNotNullParameter(marketTxWsInfoItemBean, "");
        realtimeDataViewModel.EZpvd(marketTxWsInfoItemBean);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(RealtimeDataViewModel realtimeDataViewModel, MarketTradeRealTimeBean marketTradeRealTimeBean) {
        Intrinsics.checkNotNullParameter(marketTradeRealTimeBean, "");
        realtimeDataViewModel.OLrzqt(marketTradeRealTimeBean);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (C22416heu.ejfBZ()) {
            return;
        }
        boolean zKWHzl = this.gEmmrt.KWHzl();
        pUU.KWHzl("RealtimeDataViewModel", "observeLiquidityPool: isRustEnabled=" + zKWHzl + ", chainId=" + str + ", tokenAddress=" + str2);
        if (zKWHzl) {
            OLrzqt(str, str2);
        } else {
            KWHzl(str, str2);
        }
    }

    public final void OLrzqt(String str, String str2) {
        Job job;
        String str3 = str + ":" + str2;
        if (Intrinsics.EZpvd((Object) this.AYXKKw, (Object) str3) && (job = this.fIwbmz) != null && job.isActive()) {
            pUU.KWHzl("RealtimeDataViewModel", "observeLiquidityPoolRust: Already subscribed to " + str3 + ", skipping");
            return;
        }
        Job job2 = this.fIwbmz;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
        }
        this.AYXKKw = str3;
        pUU.KWHzl("RealtimeDataViewModel", "observeLiquidityPoolRust: Starting Rust pool info flow for " + str3);
        this.fIwbmz = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new RealtimeDataViewModel$observeLiquidityPoolRust$1(this, str, str2, null), 3, null);
    }

    public final Flow<List<LiquidityPoolPairUIItem>> EZpvd(String str, String str2) {
        return FlowKt.callbackFlow(new RealtimeDataViewModel$createPoolInfoFlow$1(str, str2, this, null));
    }

    public final void KWHzl(String str, String str2) {
        OLrzqt().KWHzl("default_trade", "dex-market-v3-topPool", C56402yEa.EZpvd(new C23174htJ("dex-market-v3-topPool", str, str2, null, 8, null)));
    }

    public final void copydefault(String str) {
        Exception exc = new Exception("Pool Info Rust error: " + str);
        pUU.AEQbTJ("RealtimeDataViewModel", "Rust Pool Info failed", exc);
        C6777aVl.Companion.EZpvd(exc);
        this.DbNXlk.EZpvd(FeatureFlag.DEX_MARKET_DATA_RUST, str);
    }

    public final void EZpvd(@NotNull MarketTxWsInfoItemBean marketTxWsInfoItemBean) {
        Intrinsics.checkNotNullParameter(marketTxWsInfoItemBean, "");
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new RealtimeDataViewModel$updateTokenDetail$1(this, marketTxWsInfoItemBean, null), 3, null);
    }

    public final void OLrzqt(@NotNull MarketTradeRealTimeBean marketTradeRealTimeBean) {
        Intrinsics.checkNotNullParameter(marketTradeRealTimeBean, "");
        this.copydefault.setValue(C23305hvi.copydefault(marketTradeRealTimeBean, this.EZpvd));
    }

    public final void AYXKKw() {
        C23258huo c23258huo = this.fetchVPNInfo;
        if (c23258huo != null) {
            c23258huo.OLrzqt();
        }
        C23258huo c23258huo2 = this.fetchVPNInfo;
        if (c23258huo2 != null) {
            c23258huo2.KWHzl();
        }
        this.fetchVPNInfo = null;
    }

    public final void KWHzl() {
        Job job = this.fIwbmz;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.fIwbmz = null;
        this.AYXKKw = null;
        OLrzqt().AEQbTJ("default_trade", "dex-market-v3-topPool");
    }

    public final LiquidityPoolPairUIItem EZpvd(C2165ABg c2165ABg) {
        String strEZpvd = c2165ABg.EZpvd();
        String strAEQbTJ = c2165ABg.AEQbTJ();
        String strOLrzqt = c2165ABg.OLrzqt();
        String strCopydefault = c2165ABg.copydefault();
        String strAhwBna = c2165ABg.AhwBna();
        List<ABJ> listGEmmrt = c2165ABg.gEmmrt();
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listGEmmrt, 10));
        for (ABJ abj : listGEmmrt) {
            arrayList.add(new PoolTokenInfoUIItem(abj.OLrzqt(), abj.KWHzl(), abj.copydefault(), abj.AEQbTJ(), abj.EZpvd()));
        }
        return new LiquidityPoolPairUIItem(strEZpvd, strAEQbTJ, strOLrzqt, strCopydefault, strAhwBna, (List) arrayList, false, 64, (DefaultConstructorMarker) null);
    }

    public final void KWHzl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Json json = this.djBIcL;
        json.getSerializersModule();
        WsLiquidityPoolItem wsLiquidityPoolItem = (WsLiquidityPoolItem) CollectionsKt___CollectionsKt.firstOrNull((List) json.decodeFromString(new ArrayListSerializer(WsLiquidityPoolItem.Companion.serializer()), str));
        List<CoinDetailPoolList> listCopydefault = wsLiquidityPoolItem != null ? wsLiquidityPoolItem.copydefault() : null;
        if (listCopydefault == null) {
            listCopydefault = yDY.AhwBna();
        }
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listCopydefault, 10));
        Iterator<T> it = listCopydefault.iterator();
        while (it.hasNext()) {
            arrayList.add(C22376heG.KWHzl((CoinDetailPoolList) it.next()));
        }
        this.KWHzl.tryEmit(arrayList);
    }
}
