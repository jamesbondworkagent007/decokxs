package com.okinc.unify_trade.bot.presenter;

import android.content.Context;
import android.view.View;
import androidx.camera.video.AudioStats;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.TradeLiveData;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.tradeapi.bean.CurrencyModel;
import com.okinc.tradeapi.framework.constant.TradeKey;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.BotModifyReq;
import com.okinc.unify_trade.biz.BotModifyResp;
import com.okinc.unify_trade.biz.EditStrategyNameReq;
import com.okinc.unify_trade.biz.FetchMultiInstsResult;
import com.okinc.unify_trade.biz.GridInstantTriggerReq;
import com.okinc.unify_trade.biz.GridTriggerResp;
import com.okinc.unify_trade.biz.RecurringEditCycleTimeReq;
import com.okinc.unify_trade.biz.RecurringEditPriceRangeReq;
import com.okinc.unify_trade.biz.RecurringModifyInvestmentReq;
import com.okinc.unify_trade.biz.SpotGridAddInvestmentInfo;
import com.okinc.unify_trade.biz.StrategyResponse;
import com.okinc.unify_trade.biz.StrategyStopReq;
import com.okinc.unify_trade.biz.ToggleReinvestmentReq;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import com.okinc.unify_trade.bot.data.ProfitDetailData;
import com.okinc.unify_trade.bot.data.SignalCoinPairBean;
import com.okinc.unify_trade.bot.data.SignalCoinPairItemData;
import com.okinc.unify_trade.bot.data.SignalMultiCoinPairSelectItemData;
import com.okinc.unify_trade.bot.data.TacticsData;
import com.okinc.unify_trade.bot.grid.bean.ResumeSpotGridData;
import com.okinc.unify_trade.bot.presenter.BotOperatorButtonViewModel;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.AbstractC54531xLw;
import o.C33069mpW;
import o.C33129mqd;
import o.C43251rlk;
import o.C54215xAd;
import o.C54507xKz;
import o.C54589xNz;
import o.C55326xho;
import o.C55688xof;
import o.C55953xtf;
import o.C55983xuI;
import o.C56111xwe;
import o.C56193xyG;
import o.C56219xyg;
import o.C56221xyi;
import o.C56228xyp;
import o.C56233xyu;
import o.C56250xzK;
import o.C56255xzP;
import o.C56257xzR;
import o.C56260xzU;
import o.C56263xzX;
import o.C56390yDp;
import o.C56402yEa;
import o.C56403yEb;
import o.C56424yEw;
import o.InterfaceC49425uoM;
import o.InterfaceC49497upf;
import o.InterfaceC54501xKt;
import o.InterfaceC54581xNr;
import o.InterfaceC56388yDn;
import o.InterfaceC56514yIe;
import o.ViewOnClickListenerC54939xaY;
import o.xAE;
import o.xAI;
import o.xAJ;
import o.xAM;
import o.xAN;
import o.xKK;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class BotOperatorButtonViewModel extends AbsPresenter {
    public final C56257xzR AEQbTJ;
    public final C56111xwe<ProfitDetailData> AYXKKw;
    public final C56193xyG AhwBna;
    public final C56263xzX AkhnZx;
    public final C56228xyp AuCTel;
    public final xAM AuCTelauCTel;
    public final xAJ AubY;
    public final C56111xwe<SpotGridAddInvestmentInfo> AwvSrB;
    public final C56111xwe<List<Object>> AxsJAY;
    public final C56111xwe<StrategyResponse> DbNXlk;
    public final TradeLiveData<Pair<List<FetchMultiInstsResult>, TacticsData>> EZpvd;
    public final C56250xzK KWHzl;
    public final TradeLiveData<List<Object>> OLrzqt;
    public final C54215xAd QOLQEE;
    public final TradeLiveData<ArrayList<SignalCoinPairItemData>> copydefault;
    public final MediatorLiveData<SignalCoinPairBean> djBIcL;
    public TacticsData ejfBZ;
    public final C56111xwe<ResumeSpotGridData> fARcdN;
    public C56111xwe<String> fIwbmz;
    public final C56233xyu fJNWhG;
    public final C56111xwe<ResumeSpotGridData> fetchVPNInfo;
    public final C56219xyg gEmmrt;
    public final C56111xwe<TacticsData> gHZMYf;
    public final C56111xwe<BotModifyResp> getFieldNames;
    public final xAE getNewProxyInstance;
    public final C56111xwe<List<Object>> hDKMBd;
    public final C56221xyi isConnected;
    public final C56111xwe<BotModifyResp> iwGUEr;
    public final xAN sSMYrx;
    public final C56260xzU uzCIH;
    public final InterfaceC54581xNr valueOf;
    public C56111xwe<String> values;
    public final C56111xwe<List<Object>> wlaJM;
    public final C56111xwe<List<Object>> zLjUOn;
    public final xAI zsXlph;
    public final C56255xzP zuBGHE;

    public static final /* synthetic */ class ActionBar implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.copydefault = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.copydefault.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56257xzR AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(C56111xwe<String> c56111xwe) {
        this.fIwbmz = c56111xwe;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<ProfitDetailData> AYXKKw() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56263xzX AhwBna() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<StrategyResponse> AkhnZx() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final xAE AuCTel() {
        return this.getNewProxyInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final xAI AuCTelauCTel() {
        return this.zsXlph;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<List<Object>> AubY() {
        return this.zLjUOn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56255xzP AwvSrB() {
        return this.zuBGHE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<String> DbNXlk() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MediatorLiveData<SignalCoinPairBean> EZpvd() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(TacticsData tacticsData) {
        this.ejfBZ = tacticsData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56250xzK OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(C56111xwe<String> c56111xwe) {
        this.values = c56111xwe;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<List<Object>> copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<String> djBIcL() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<BotModifyResp> ejfBZ() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56233xyu fARcdN() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<ResumeSpotGridData> fIwbmz() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TacticsData fJNWhG() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56221xyi fetchVPNInfo() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56219xyg gEmmrt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<TacticsData> gHZMYf() {
        return this.gHZMYf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56260xzU getFieldNames() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<List<Object>> getNewProxyInstance() {
        return this.wlaJM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final xAJ hDKMBd() {
        return this.AubY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<ResumeSpotGridData> isConnected() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<BotModifyResp> iwGUEr() {
        return this.getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54215xAd sSMYrx() {
        return this.QOLQEE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<List<Object>> uzCIH() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56193xyG valueOf() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56228xyp values() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<List<Object>> wlaJM() {
        return this.AxsJAY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final xAM zLjUOn() {
        return this.AuCTelauCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final xAN zsXlph() {
        return this.sSMYrx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<SpotGridAddInvestmentInfo> zuBGHE() {
        return this.AwvSrB;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotOperatorButtonViewModel(@NotNull android.app.Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.valueOf = C54589xNz.EZpvd.OLrzqt();
        this.QOLQEE = new C54215xAd();
        this.gHZMYf = new C56111xwe<>();
        this.KWHzl = new C56250xzK();
        this.OLrzqt = new TradeLiveData<>();
        this.AkhnZx = new C56263xzX();
        this.gEmmrt = new C56219xyg();
        this.AYXKKw = new C56111xwe<>();
        this.uzCIH = new C56260xzU();
        this.getFieldNames = new C56111xwe<>();
        this.zuBGHE = new C56255xzP();
        this.AwvSrB = new C56111xwe<>();
        this.AhwBna = new C56193xyG();
        TradeLiveData<ArrayList<SignalCoinPairItemData>> tradeLiveData = new TradeLiveData<>();
        this.copydefault = tradeLiveData;
        this.AEQbTJ = new C56257xzR();
        TradeLiveData<Pair<List<FetchMultiInstsResult>, TacticsData>> tradeLiveData2 = new TradeLiveData<>();
        this.EZpvd = tradeLiveData2;
        final MediatorLiveData<SignalCoinPairBean> mediatorLiveData = new MediatorLiveData<>();
        mediatorLiveData.addSource(tradeLiveData, new ActionBar(new Function1() { // from class: o.xuh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BotOperatorButtonViewModel.OLrzqt(mediatorLiveData, this, (java.util.ArrayList) obj);
            }
        }));
        mediatorLiveData.addSource(tradeLiveData2, new ActionBar(new Function1() { // from class: o.xug
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BotOperatorButtonViewModel.AEQbTJ(mediatorLiveData, this, (kotlin.Pair) obj);
            }
        }));
        this.djBIcL = mediatorLiveData;
        this.getNewProxyInstance = new xAE();
        this.iwGUEr = new C56111xwe<>();
        this.isConnected = new C56221xyi();
        this.DbNXlk = new C56111xwe<>();
        this.fJNWhG = new C56233xyu();
        this.fARcdN = new C56111xwe<>();
        this.AuCTel = new C56228xyp();
        this.fetchVPNInfo = new C56111xwe<>();
        this.AuCTelauCTel = new xAM();
        this.wlaJM = new C56111xwe<>();
        this.zsXlph = new xAI();
        this.zLjUOn = new C56111xwe<>();
        this.AubY = new xAJ();
        this.hDKMBd = new C56111xwe<>();
        this.sSMYrx = new xAN();
        this.AxsJAY = new C56111xwe<>();
    }

    public static final Unit OLrzqt(MediatorLiveData mediatorLiveData, BotOperatorButtonViewModel botOperatorButtonViewModel, ArrayList arrayList) {
        mediatorLiveData.setValue(botOperatorButtonViewModel.KWHzl());
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(MediatorLiveData mediatorLiveData, BotOperatorButtonViewModel botOperatorButtonViewModel, Pair pair) {
        mediatorLiveData.setValue(botOperatorButtonViewModel.KWHzl());
        return Unit.INSTANCE;
    }

    public final void EZpvd(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C56250xzK c56250xzK = this.KWHzl;
        c56250xzK.AEQbTJ(this.OLrzqt);
        c56250xzK.AEQbTJ(EditStrategyNameReq.Companion.EZpvd(str, str2));
        xKK.Activity.execute$default(c56250xzK, 0L, 1, null);
    }

    public final void KWHzl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C56221xyi c56221xyi = this.isConnected;
        c56221xyi.EZpvd(str);
        c56221xyi.OLrzqt(this.DbNXlk, new C54507xKz());
        xKK.Activity.execute$default(c56221xyi, 0L, 1, null);
    }

    public final void copydefault(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C56233xyu c56233xyu = this.fJNWhG;
        c56233xyu.copydefault(str, str2);
        c56233xyu.OLrzqt(this.fARcdN, new C54507xKz());
        xKK.Activity.execute$default(c56233xyu, 0L, 1, null);
    }

    public final void AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C56228xyp c56228xyp = this.AuCTel;
        c56228xyp.AEQbTJ(str);
        c56228xyp.OLrzqt(this.fetchVPNInfo, new C54507xKz());
        xKK.Activity.execute$default(c56228xyp, 0L, 1, null);
    }

    public final void copydefault(@NotNull RecurringEditCycleTimeReq recurringEditCycleTimeReq) {
        Intrinsics.checkNotNullParameter(recurringEditCycleTimeReq, "");
        xAM xam = this.AuCTelauCTel;
        xam.KWHzl(recurringEditCycleTimeReq);
        xam.AEQbTJ(this.wlaJM);
        xKK.Activity.execute$default(xam, 0L, 1, null);
    }

    public final void AEQbTJ(@NotNull RecurringEditPriceRangeReq recurringEditPriceRangeReq) {
        Intrinsics.checkNotNullParameter(recurringEditPriceRangeReq, "");
        xAI xai = this.zsXlph;
        xai.AEQbTJ(recurringEditPriceRangeReq);
        xai.AEQbTJ(this.zLjUOn);
        xKK.Activity.execute$default(xai, 0L, 1, null);
    }

    public final void KWHzl(@NotNull RecurringModifyInvestmentReq recurringModifyInvestmentReq) {
        Intrinsics.checkNotNullParameter(recurringModifyInvestmentReq, "");
        xAJ xaj = this.AubY;
        xaj.copydefault(recurringModifyInvestmentReq);
        xaj.AEQbTJ(this.hDKMBd);
        xKK.Activity.execute$default(xaj, 0L, 1, null);
    }

    public final void AEQbTJ(@NotNull RecurringModifyInvestmentReq recurringModifyInvestmentReq) {
        Intrinsics.checkNotNullParameter(recurringModifyInvestmentReq, "");
        xAN xan = this.sSMYrx;
        xan.OLrzqt(recurringModifyInvestmentReq);
        xan.AEQbTJ(this.AxsJAY);
        xKK.Activity.execute$default(xan, 0L, 1, null);
    }

    public final void copydefault(@NotNull ToggleReinvestmentReq toggleReinvestmentReq) {
        Intrinsics.checkNotNullParameter(toggleReinvestmentReq, "");
        xAE xae = this.getNewProxyInstance;
        xae.OLrzqt(toggleReinvestmentReq);
        xKK.Activity.execute$default(xae, 0L, 1, null);
    }

    public static /* synthetic */ void stopTactics$default(BotOperatorButtonViewModel botOperatorButtonViewModel, StrategyStopReq strategyStopReq, TacticsData tacticsData, int i, Object obj) {
        if ((i & 2) != 0) {
            tacticsData = null;
        }
        botOperatorButtonViewModel.copydefault(strategyStopReq, tacticsData);
    }

    public final void copydefault(@NotNull StrategyStopReq strategyStopReq, final TacticsData tacticsData) {
        Intrinsics.checkNotNullParameter(strategyStopReq, "");
        C54215xAd c54215xAd = this.QOLQEE;
        c54215xAd.copydefault(C56402yEa.EZpvd(strategyStopReq));
        c54215xAd.KWHzl(new Function1() { // from class: o.xuo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BotOperatorButtonViewModel.EZpvd(this.KWHzl, tacticsData, (ResponseData) obj);
            }
        });
        xKK.Activity.execute$default(c54215xAd, 0L, 1, null);
    }

    public static final Unit EZpvd(BotOperatorButtonViewModel botOperatorButtonViewModel, TacticsData tacticsData, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        botOperatorButtonViewModel.gHZMYf.postValue(tacticsData);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void instantTrigger$default(BotOperatorButtonViewModel botOperatorButtonViewModel, Context context, TacticsData tacticsData, Function0 function0, String str, int i, Object obj) {
        if ((i & 8) != 0) {
            str = null;
        }
        botOperatorButtonViewModel.AEQbTJ(context, tacticsData, function0, str);
    }

    public final void AEQbTJ(@NotNull final Context context, @NotNull final TacticsData tacticsData, final Function0<Unit> function0, String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(tacticsData, "");
        C56263xzX c56263xzX = this.AkhnZx;
        c56263xzX.KWHzl(new GridInstantTriggerReq(tacticsData.getAlgoId(), str));
        c56263xzX.KWHzl(new Function1() { // from class: o.xuk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BotOperatorButtonViewModel.AEQbTJ(context, function0, this, tacticsData, (ResponseData) obj);
            }
        });
        xKK.Activity.execute$default(c56263xzX, 0L, 1, null);
    }

    public static final Unit AEQbTJ(final Context context, final Function0 function0, final BotOperatorButtonViewModel botOperatorButtonViewModel, final TacticsData tacticsData, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        List list = (List) responseData.getData();
        GridTriggerResp gridTriggerResp = list != null ? (GridTriggerResp) CollectionsKt___CollectionsKt.firstOrNull(list) : null;
        final String topUpAmt = gridTriggerResp != null ? gridTriggerResp.getTopUpAmt() : null;
        final String ccy = gridTriggerResp != null ? gridTriggerResp.getCcy() : null;
        if (responseData.getCode() == 55153 && topUpAmt != null && !StringsKt__StringsKt.fARcdN((CharSequence) topUpAmt) && ccy != null && !StringsKt__StringsKt.fARcdN((CharSequence) ccy)) {
            final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
            viewOnClickListenerC54939xaY.setTitle(C55688xof.Application.dHAKvv);
            viewOnClickListenerC54939xaY.EZpvd(C33069mpW.copydefault(C55688xof.Application.RatingCompat1, C56424yEw.gEmmrt(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, topUpAmt), C56390yDp.OLrzqt("ccy", ccy))));
            viewOnClickListenerC54939xaY.EZpvd(C55688xof.Application.fetchVPNInfo, new View.OnClickListener() { // from class: o.xup
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    BotOperatorButtonViewModel.OLrzqt(topUpAmt, botOperatorButtonViewModel, context, ccy, tacticsData, function0, viewOnClickListenerC54939xaY, view);
                }
            });
            viewOnClickListenerC54939xaY.OLrzqt(C55688xof.Application.doDispatch, new View.OnClickListener() { // from class: o.xul
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    BotOperatorButtonViewModel.AEQbTJ(viewOnClickListenerC54939xaY, view);
                }
            });
            viewOnClickListenerC54939xaY.show();
        } else if (function0 != null) {
        }
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(String str, BotOperatorButtonViewModel botOperatorButtonViewModel, Context context, String str2, TacticsData tacticsData, Function0 function0, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, View view) {
        C56111xwe<String> c56111xwe = botOperatorButtonViewModel.fIwbmz;
        if (C33129mqd.AEQbTJ(str, c56111xwe != null ? c56111xwe.getValue() : null)) {
            botOperatorButtonViewModel.copydefault(context, str2);
        } else {
            botOperatorButtonViewModel.AEQbTJ(context, tacticsData, function0, str);
        }
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void AEQbTJ(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final void copydefault(final Context context, final String str) {
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.setTitle(C55688xof.Application.dHAKvv);
        viewOnClickListenerC54939xaY.copydefault(C55688xof.Application.setHandler);
        viewOnClickListenerC54939xaY.EZpvd(C55688xof.Application.getDrawerArrowDrawable, new View.OnClickListener() { // from class: o.xuj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                BotOperatorButtonViewModel.copydefault(context, this, str, viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.OLrzqt(C55688xof.Application.doDispatch, new View.OnClickListener() { // from class: o.xun
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                BotOperatorButtonViewModel.OLrzqt(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void copydefault(Context context, BotOperatorButtonViewModel botOperatorButtonViewModel, String str, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, View view) {
        TradeCoinInfo tradeCoinInfoAhwBna;
        String id = null;
        if (context instanceof FragmentActivity) {
            InterfaceC49497upf interfaceC49497upf = (InterfaceC49497upf) ((InterfaceC49425uoM) C43251rlk.copydefault(InterfaceC49425uoM.class)).KWHzl(TradeKey.TRADE_UI);
            FragmentActivity fragmentActivity = (FragmentActivity) context;
            InterfaceC54581xNr interfaceC54581xNr = botOperatorButtonViewModel.valueOf;
            if (interfaceC54581xNr != null && (tradeCoinInfoAhwBna = interfaceC54581xNr.AhwBna(str)) != null) {
                id = tradeCoinInfoAhwBna.getId();
            }
            interfaceC49497upf.OLrzqt(fragmentActivity, new CurrencyModel(C33129mqd.AhwBna(id), str), true);
        } else {
            C55326xho.toastWithFailedIcon$default(C55688xof.Application.ejfBZ, 0, 1, (Object) null);
        }
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void OLrzqt(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final void OLrzqt(@NotNull BotModifyReq botModifyReq) {
        Intrinsics.checkNotNullParameter(botModifyReq, "");
        C56260xzU c56260xzU = this.uzCIH;
        c56260xzU.OLrzqt(this.getFieldNames, new C54507xKz());
        c56260xzU.KWHzl(botModifyReq);
        xKK.Activity.execute$default(c56260xzU, 0L, 1, null);
    }

    public static final class Application implements InterfaceC54501xKt<List<? extends SpotGridAddInvestmentInfo>, SpotGridAddInvestmentInfo> {
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.InterfaceC54501xKt
        public /* bridge */ /* synthetic */ SpotGridAddInvestmentInfo KWHzl(List<? extends SpotGridAddInvestmentInfo> list) {
            return KWHzl2((List<SpotGridAddInvestmentInfo>) list);
        }

        /* JADX INFO: renamed from: KWHzl, reason: avoid collision after fix types in other method */
        public SpotGridAddInvestmentInfo KWHzl2(List<SpotGridAddInvestmentInfo> list) {
            Intrinsics.checkNotNullParameter(list, "");
            return (SpotGridAddInvestmentInfo) CollectionsKt___CollectionsKt.firstOrNull(list);
        }
    }

    public final void copydefault(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C56255xzP c56255xzP = this.zuBGHE;
        c56255xzP.EZpvd(str);
        c56255xzP.OLrzqt(this.AwvSrB, new Application());
        xKK.Activity.execute$default(c56255xzP, 0L, 1, null);
    }

    public static /* synthetic */ void requestExtractProfit$default(BotOperatorButtonViewModel botOperatorButtonViewModel, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            str3 = "";
        }
        botOperatorButtonViewModel.OLrzqt(str, str2, str3, str4);
    }

    public final void OLrzqt(@NotNull String str, @NotNull String str2, @NotNull String str3, String str4) {
        String str5;
        BizInstrument suggestedInstrument$default;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        String str6 = "";
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
        if (interfaceC54581xNrOLrzqt2 == null || (suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt2, str3, str2, null, null, 12, null)) == null || (interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt()) == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(suggestedInstrument$default.getInstType())) == null) {
            str5 = "";
        } else {
            String strValueOf = String.valueOf(abstractC54531xLwOLrzqt.OLrzqt(suggestedInstrument$default));
            String strValueOf2 = String.valueOf(abstractC54531xLwOLrzqt.djBIcL(suggestedInstrument$default));
            str5 = strValueOf;
            str6 = strValueOf2;
        }
        C55953xtf c55953xtf = new C55953xtf();
        c55953xtf.OLrzqt(str);
        c55953xtf.EZpvd(str2);
        c55953xtf.KWHzl(str3);
        if (str4 == null) {
            str4 = str6;
        }
        c55953xtf.copydefault(str4);
        c55953xtf.AEQbTJ(str5);
        C56219xyg c56219xyg = this.gEmmrt;
        c56219xyg.OLrzqt(this.AYXKKw, c55953xtf);
        c56219xyg.OLrzqt(str);
        xKK.Activity.execute$default(c56219xyg, 0L, 1, null);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.xzR.setParams$default(o.xzR, java.lang.String, java.lang.String, int, java.lang.Object):void */
    public final void copydefault(@NotNull TacticsData tacticsData) {
        Intrinsics.checkNotNullParameter(tacticsData, "");
        ArrayList<SignalCoinPairItemData> value = this.copydefault.getValue();
        if (value == null || value.isEmpty()) {
            C56193xyG c56193xyG = this.AhwBna;
            c56193xyG.copydefault("SWAP");
            c56193xyG.OLrzqt(this.copydefault, new C55983xuI());
            xKK.Activity.execute$default(c56193xyG, 0L, 1, null);
        }
        C56257xzR c56257xzR = this.AEQbTJ;
        C56257xzR.setParams$default(c56257xzR, tacticsData.getAlgoId(), null, 2, null);
        c56257xzR.djBIcL();
        c56257xzR.OLrzqt(this.EZpvd, new TaskDescription(tacticsData));
        xKK.Activity.execute$default(c56257xzR, 0L, 1, null);
    }

    public static final class TaskDescription implements InterfaceC54501xKt<List<? extends FetchMultiInstsResult>, Pair<? extends List<? extends FetchMultiInstsResult>, ? extends TacticsData>> {
        public final /* synthetic */ TacticsData EZpvd;

        public TaskDescription(TacticsData tacticsData) {
            this.EZpvd = tacticsData;
        }

        /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.InterfaceC54501xKt
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public Pair<List<FetchMultiInstsResult>, TacticsData> KWHzl(List<FetchMultiInstsResult> list) {
            Intrinsics.checkNotNullParameter(list, "");
            return C56390yDp.OLrzqt(list, this.EZpvd);
        }
    }

    public final SignalCoinPairBean KWHzl() {
        ArrayList<SignalCoinPairItemData> value = this.copydefault.getValue();
        if (value == null || value.isEmpty() || this.EZpvd.getValue() == null) {
            return null;
        }
        Pair<List<FetchMultiInstsResult>, TacticsData> value2 = this.EZpvd.getValue();
        Intrinsics.copydefault(value2);
        List<FetchMultiInstsResult> first = value2.getFirst();
        Pair<List<FetchMultiInstsResult>, TacticsData> value3 = this.EZpvd.getValue();
        Intrinsics.copydefault(value3);
        TacticsData second = value3.getSecond();
        ArrayList<SignalCoinPairItemData> value4 = this.copydefault.getValue();
        Intrinsics.copydefault(value4);
        return new SignalCoinPairBean(OLrzqt(value4, first, second), new ArrayList(first), second);
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.gEmmrt(this.QOLQEE, this.KWHzl, this.AkhnZx, this.gEmmrt, this.uzCIH, this.AhwBna, this.AEQbTJ, this.getNewProxyInstance, this.zuBGHE, this.isConnected, this.fJNWhG, this.AuCTel, this.AuCTelauCTel, this.zsXlph, this.AubY, this.sSMYrx);
    }

    public final ArrayList<SignalMultiCoinPairSelectItemData> OLrzqt(List<? extends SignalCoinPairItemData> list, List<FetchMultiInstsResult> list2, TacticsData tacticsData) {
        boolean z;
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
        for (SignalCoinPairItemData signalCoinPairItemData : list) {
            String title = signalCoinPairItemData.getTitle();
            String titleUrl = signalCoinPairItemData.getTitleUrl();
            String instId = signalCoinPairItemData.getInstId();
            String instType = signalCoinPairItemData.getInstType();
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                z = false;
            } else {
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    if (Intrinsics.EZpvd((Object) ((FetchMultiInstsResult) it.next()).getInstId(), (Object) signalCoinPairItemData.getInstId())) {
                        z = true;
                        break;
                    }
                }
                z = false;
            }
            arrayList.add(new SignalMultiCoinPairSelectItemData(title, titleUrl, instId, instType, signalCoinPairItemData.getMaxLever(), z, C33129mqd.copydefault(signalCoinPairItemData.getMaxLever(), tacticsData.getOriginalLevel()), null, AudioStats.AUDIO_AMPLITUDE_NONE, null, AudioStats.AUDIO_AMPLITUDE_NONE, 1920, null));
        }
        return new ArrayList<>(arrayList);
    }
}
