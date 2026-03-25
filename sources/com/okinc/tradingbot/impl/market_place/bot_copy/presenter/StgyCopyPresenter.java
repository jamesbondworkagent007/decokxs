package com.okinc.tradingbot.impl.market_place.bot_copy.presenter;

import android.app.Application;
import android.os.Parcelable;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.TradeLiveData;
import androidx.lifecycle.ViewModelKt;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.rxutils.RxBus;
import com.okinc.tradelite.bean.TradeProductId;
import com.okinc.tradingbot.impl.market_place.bot_copy.bean.CopyBotReqParam;
import com.okinc.tradingbot.impl.market_place.bot_copy.itembinder.BotCopyTraderInfoData;
import com.okinc.tradingbot.impl.market_place.bot_copy.itembinder.BotWinLossRateData;
import com.okinc.tradingbot.impl.market_place.bot_copy.itembinder.ProfitInfoItemData;
import com.okinc.tradingbot.impl.market_place.bot_copy.presenter.StgyCopyPresenter;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.BotLeadOverviewModel;
import com.okinc.unify_trade.biz.ExtraActualMarginResp;
import com.okinc.unify_trade.biz.LossInsurance;
import com.okinc.unify_trade.biz.MpStgyDetail;
import com.okinc.unify_trade.biz.MpStgyInfo;
import com.okinc.unify_trade.biz.MpStgyParam;
import com.okinc.unify_trade.biz.ProfitTimeRangeItem;
import com.okinc.unify_trade.biz.StgyFavouriteResult;
import com.okinc.unify_trade.biz.StrategyProfitResponse;
import com.okinc.unify_trade.biz.StrategyResponse;
import com.okinc.unify_trade.biz.TrailingConfig;
import com.okinc.unify_trade.biz.bot.TpSlTriggerParamReqResp;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import com.okinc.unify_trade.bot.data.BotGuideData;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import o.AbstractC51317vkj;
import o.C33129mqd;
import o.C43251rlk;
import o.C51254vjZ;
import o.C51277vjw;
import o.C51320vkm;
import o.C51321vkn;
import o.C51324vkq;
import o.C51326vks;
import o.C51330vkw;
import o.C53685wqE;
import o.C53698wqR;
import o.C53807wsU;
import o.C54282xCq;
import o.C54315xDw;
import o.C54507xKz;
import o.C55887xsS;
import o.C56033xvF;
import o.C56059xvf;
import o.C56068xvo;
import o.C56111xwe;
import o.C56199xyM;
import o.C56269xzd;
import o.C56272xzg;
import o.C56276xzk;
import o.C56402yEa;
import o.InterfaceC49317umK;
import o.InterfaceC49505upn;
import o.InterfaceC58217yxC;
import o.xCN;
import o.xKK;
import o.xMR;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class StgyCopyPresenter extends AbsPresenter {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public final xCN AEQbTJ;
    public final C56111xwe<List<StgyFavouriteResult>> AYXKKw;
    public final C56269xzd AhwBna;
    public final TradeLiveData<List<MpStgyInfo>> AkhnZx;
    public final TradeLiveData<Boolean> AuCTel;
    public final C56272xzg DbNXlk;
    public C51277vjw EZpvd;
    public final C54282xCq OLrzqt;
    public final MutableSharedFlow<Activity> copydefault;
    public final TradeLiveData<BotLeadOverviewModel> djBIcL;
    public final SharedFlow<Activity> ejfBZ;
    public final C54315xDw fIwbmz;
    public InterfaceC58217yxC fetchVPNInfo;
    public AbstractC51317vkj gEmmrt;
    public final C56276xzk isConnected;
    public final C56199xyM valueOf;
    public final C56111xwe<List<StgyFavouriteResult>> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<BotLeadOverviewModel> AubY() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56272xzg AwvSrB() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<List<MpStgyInfo>> AxsJAY() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Activity> QUSxYX() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<Boolean> RcXXUw() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54315xDw aKErDB() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C51277vjw fJNWhG() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56276xzk gHZMYf() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<List<StgyFavouriteResult>> sSMYrx() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56269xzd zLjUOn() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<List<StgyFavouriteResult>> zsXlph() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56199xyM zuBGHE() {
        return this.valueOf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StgyCopyPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.AkhnZx = new TradeLiveData<>();
        this.isConnected = new C56276xzk();
        this.AhwBna = new C56269xzd();
        this.djBIcL = new TradeLiveData<>();
        this.OLrzqt = new C54282xCq();
        this.values = new C56111xwe<>();
        this.DbNXlk = new C56272xzg();
        this.AYXKKw = new C56111xwe<>();
        this.valueOf = new C56199xyM();
        this.AEQbTJ = new xCN();
        this.fIwbmz = new C54315xDw();
        this.AuCTel = new TradeLiveData<>();
        MutableSharedFlow<Activity> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 1, null, 5, null);
        this.copydefault = mutableSharedFlowMutableSharedFlow$default;
        this.ejfBZ = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.market_place.bot_copy.presenter.StgyCopyPresenter.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [117=6] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AYXKKw(@NotNull String str) {
        AbstractC51317vkj c51330vkw;
        Intrinsics.checkNotNullParameter(str, "");
        switch (str.hashCode()) {
            case -1831183611:
                c51330vkw = !str.equals("spot_dca") ? new C51330vkw(this.AkhnZx) : new C51326vks(this.AkhnZx);
                break;
            case -1402017003:
                if (str.equals("contract_dca")) {
                    c51330vkw = new C51254vjZ(this.AkhnZx);
                    break;
                }
                break;
            case -1216369070:
                if (str.equals("smart_portfolio")) {
                    c51330vkw = new C51324vkq(this.AkhnZx);
                    break;
                }
                break;
            case -512749997:
                if (str.equals("contract_grid")) {
                    c51330vkw = new C51321vkn(this.AkhnZx);
                    break;
                }
                break;
            case 3181382:
                if (str.equals("grid")) {
                    c51330vkw = new C51330vkw(this.AkhnZx);
                    break;
                }
                break;
            case 1165749981:
                if (str.equals("recurring")) {
                    c51330vkw = new C51320vkm(this.AkhnZx);
                    break;
                }
                break;
        }
        this.gEmmrt = c51330vkw;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void djBIcL(@NotNull String str) {
        C51277vjw c51277vjw;
        Intrinsics.checkNotNullParameter(str, "");
        switch (str.hashCode()) {
            case -1831183611:
                if (!str.equals("spot_dca")) {
                    c51277vjw = null;
                } else {
                    c51277vjw = new C51277vjw(Boolean.TRUE, finit() ? 6 : 7);
                }
                break;
            case -1402017003:
                if (!str.equals("contract_dca")) {
                }
                break;
            case -512749997:
                if (!str.equals("contract_grid")) {
                }
                break;
            case 3181382:
                if (!str.equals("grid")) {
                }
                break;
        }
        this.EZpvd = c51277vjw;
    }

    public final void AEQbTJ(@NotNull final ComponentActivity componentActivity) {
        Intrinsics.checkNotNullParameter(componentActivity, "");
        C54282xCq c54282xCq = this.OLrzqt;
        c54282xCq.AEQbTJ(iwGUEr());
        c54282xCq.KWHzl(new Function1() { // from class: o.vkv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return StgyCopyPresenter.AEQbTJ(this.OLrzqt, componentActivity, (ResponseData) obj);
            }
        });
        xKK.Activity.execute$default(c54282xCq, 0L, 1, null);
    }

    public static final Unit AEQbTJ(StgyCopyPresenter stgyCopyPresenter, ComponentActivity componentActivity, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        MpStgyParam mpStgyParamDNCPSb = stgyCopyPresenter.dNCPSb();
        if (mpStgyParamDNCPSb == null) {
            mpStgyParamDNCPSb = new MpStgyParam((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (TpSlTriggerParamReqResp) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ArrayList) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ArrayList) null, (List) null, (Boolean) null, (String) null, (TrailingConfig) null, (TrailingConfig) null, (Boolean) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (String) null, (String) null, -1, -1, 3, (DefaultConstructorMarker) null);
        }
        C53807wsU c53807wsU = new C53807wsU(mpStgyParamDNCPSb, stgyCopyPresenter.djSkpj());
        List<TickersData> listAhwBna = (List) responseData.getData();
        if (listAhwBna == null) {
            listAhwBna = yDY.AhwBna();
        }
        C53698wqR.TaskDescription.share$default(C53698wqR.Companion, c53807wsU.AEQbTJ(listAhwBna), componentActivity, ((InterfaceC49317umK) C43251rlk.copydefault(InterfaceC49317umK.class)).AEQbTJ(stgyCopyPresenter.fFgQHt()), stgyCopyPresenter.RJOkX(), false, null, 32, null);
        return Unit.INSTANCE;
    }

    public final AbstractC51317vkj djBIcL() {
        AbstractC51317vkj abstractC51317vkj = this.gEmmrt;
        if (abstractC51317vkj != null) {
            return abstractC51317vkj;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final C55887xsS KWHzl(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        AbstractC51317vkj abstractC51317vkj = this.gEmmrt;
        if (abstractC51317vkj == null) {
            Intrinsics.gEmmrt("");
            abstractC51317vkj = null;
        }
        return abstractC51317vkj.copydefault(str, str2);
    }

    public final Parcelable valueOf() {
        AbstractC51317vkj abstractC51317vkj = this.gEmmrt;
        if (abstractC51317vkj == null) {
            Intrinsics.gEmmrt("");
            abstractC51317vkj = null;
        }
        return abstractC51317vkj.fetchVPNInfo();
    }

    public final C56111xwe<List<StrategyResponse>> DTwDnp() {
        AbstractC51317vkj abstractC51317vkj = this.gEmmrt;
        if (abstractC51317vkj == null) {
            Intrinsics.gEmmrt("");
            abstractC51317vkj = null;
        }
        return abstractC51317vkj.fvQaOB();
    }

    public final C56111xwe<String> ORxRYg() {
        AbstractC51317vkj abstractC51317vkj = this.gEmmrt;
        if (abstractC51317vkj == null) {
            Intrinsics.gEmmrt("");
            abstractC51317vkj = null;
        }
        return abstractC51317vkj.giSNqX();
    }

    public final C56111xwe<String> QKVWgx() {
        AbstractC51317vkj abstractC51317vkj = this.gEmmrt;
        if (abstractC51317vkj == null) {
            Intrinsics.gEmmrt("");
            abstractC51317vkj = null;
        }
        return abstractC51317vkj.gGvvIC();
    }

    public final C56111xwe<String> copydefault() {
        AbstractC51317vkj abstractC51317vkj = this.gEmmrt;
        AbstractC51317vkj abstractC51317vkj2 = null;
        if (abstractC51317vkj == null) {
            Intrinsics.gEmmrt("");
            abstractC51317vkj = null;
        }
        BizInstrument bizInstrumentAhwBna = abstractC51317vkj.fFgQHt().AhwBna();
        if (bizInstrumentAhwBna == null || !Intrinsics.EZpvd(bizInstrumentAhwBna.isNegativeContract(), Boolean.TRUE)) {
            AbstractC51317vkj abstractC51317vkj3 = this.gEmmrt;
            if (abstractC51317vkj3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC51317vkj2 = abstractC51317vkj3;
            }
            return abstractC51317vkj2.flVtFt();
        }
        AbstractC51317vkj abstractC51317vkj4 = this.gEmmrt;
        if (abstractC51317vkj4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC51317vkj2 = abstractC51317vkj4;
        }
        return abstractC51317vkj2.finit();
    }

    public final C56111xwe<ExtraActualMarginResp> fIwbmz() {
        AbstractC51317vkj abstractC51317vkj = this.gEmmrt;
        if (abstractC51317vkj == null) {
            Intrinsics.gEmmrt("");
            abstractC51317vkj = null;
        }
        return abstractC51317vkj.dvKsVJ();
    }

    public final xKK QfsBiF() {
        AbstractC51317vkj abstractC51317vkj = this.gEmmrt;
        if (abstractC51317vkj == null) {
            Intrinsics.gEmmrt("");
            abstractC51317vkj = null;
        }
        return abstractC51317vkj.AuCTelauCTel();
    }

    public static /* synthetic */ void order$default(StgyCopyPresenter stgyCopyPresenter, CopyBotReqParam copyBotReqParam, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        stgyCopyPresenter.KWHzl(copyBotReqParam, z);
    }

    public final void KWHzl(@NotNull CopyBotReqParam copyBotReqParam, boolean z) {
        Intrinsics.checkNotNullParameter(copyBotReqParam, "");
        AbstractC51317vkj abstractC51317vkj = this.gEmmrt;
        if (abstractC51317vkj == null) {
            Intrinsics.gEmmrt("");
            abstractC51317vkj = null;
        }
        abstractC51317vkj.KWHzl(copyBotReqParam, z);
    }

    public final void giSNqX() {
        AbstractC51317vkj abstractC51317vkj = this.gEmmrt;
        if (abstractC51317vkj == null) {
            Intrinsics.gEmmrt("");
            abstractC51317vkj = null;
        }
        abstractC51317vkj.aKErDB();
    }

    public final void gasjUx() {
        AbstractC51317vkj abstractC51317vkj = this.gEmmrt;
        if (abstractC51317vkj == null) {
            Intrinsics.gEmmrt("");
            abstractC51317vkj = null;
        }
        abstractC51317vkj.dxcTrN();
    }

    public final void flVtFt() {
        AbstractC51317vkj abstractC51317vkj = this.gEmmrt;
        if (abstractC51317vkj == null) {
            Intrinsics.gEmmrt("");
            abstractC51317vkj = null;
        }
        abstractC51317vkj.RcXXUw();
    }

    public final int gEmmrt() {
        AbstractC51317vkj abstractC51317vkj = this.gEmmrt;
        if (abstractC51317vkj == null) {
            Intrinsics.gEmmrt("");
            abstractC51317vkj = null;
        }
        return abstractC51317vkj.isConnected();
    }

    public final String AkhnZx() {
        AbstractC51317vkj abstractC51317vkj = this.gEmmrt;
        if (abstractC51317vkj == null) {
            Intrinsics.gEmmrt("");
            abstractC51317vkj = null;
        }
        return abstractC51317vkj.values();
    }

    public final String AhwBna() {
        AbstractC51317vkj abstractC51317vkj = this.gEmmrt;
        if (abstractC51317vkj == null) {
            Intrinsics.gEmmrt("");
            abstractC51317vkj = null;
        }
        return abstractC51317vkj.AkhnZx();
    }

    public final String OLrzqt() {
        AbstractC51317vkj abstractC51317vkj = this.gEmmrt;
        if (abstractC51317vkj == null) {
            Intrinsics.gEmmrt("");
            abstractC51317vkj = null;
        }
        return abstractC51317vkj.AYXKKw();
    }

    public final ArrayList<Object> OcIXYQ() {
        AbstractC51317vkj abstractC51317vkj = this.gEmmrt;
        if (abstractC51317vkj == null) {
            Intrinsics.gEmmrt("");
            abstractC51317vkj = null;
        }
        return abstractC51317vkj.wlaJM();
    }

    public final ArrayList<Object> values() {
        AbstractC51317vkj abstractC51317vkj = this.gEmmrt;
        if (abstractC51317vkj == null) {
            Intrinsics.gEmmrt("");
            abstractC51317vkj = null;
        }
        return abstractC51317vkj.fARcdN();
    }

    public final String QbewEr() {
        AbstractC51317vkj abstractC51317vkj = this.gEmmrt;
        if (abstractC51317vkj == null) {
            Intrinsics.gEmmrt("");
            abstractC51317vkj = null;
        }
        return abstractC51317vkj.zsXlph();
    }

    public final void fvQaOB() {
        AbstractC51317vkj abstractC51317vkj = this.gEmmrt;
        if (abstractC51317vkj == null) {
            Intrinsics.gEmmrt("");
            abstractC51317vkj = null;
        }
        abstractC51317vkj.AxsJAYaxsJAY();
    }

    public final BotLeadOverviewModel AYXKKw() {
        BotLeadOverviewModel value = this.djBIcL.getValue();
        return value == null ? new BotLeadOverviewModel((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 1023, (DefaultConstructorMarker) null) : value;
    }

    public final BotCopyTraderInfoData AuCTelauCTel() {
        MpStgyDetail mpStgyDetail;
        float fDivD$default;
        String profitSharingRatio;
        String lossCount;
        MpStgyInfo mpStgyInfo;
        if (!finit()) {
            return null;
        }
        List<MpStgyInfo> value = this.AkhnZx.getValue();
        if (value == null || (mpStgyInfo = (MpStgyInfo) CollectionsKt___CollectionsKt.firstOrNull(value)) == null || (mpStgyDetail = mpStgyInfo.getStgyDetail()) == null) {
            mpStgyDetail = new MpStgyDetail((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ArrayList) null, false, (ArrayList) null, (ArrayList) null, (String) null, (String) null, (String) null, (String) null, 16383, (DefaultConstructorMarker) null);
        }
        BotLeadOverviewModel botLeadOverviewModelAYXKKw = AYXKKw();
        String profitCount = botLeadOverviewModelAYXKKw.getProfitCount();
        if (profitCount == null || profitCount.length() == 0 || (lossCount = botLeadOverviewModelAYXKKw.getLossCount()) == null || lossCount.length() == 0) {
            fDivD$default = -1.0f;
        } else {
            fDivD$default = (C33129mqd.AhwBna(botLeadOverviewModelAYXKKw.getProfitCount()) == 0 && C33129mqd.AhwBna(botLeadOverviewModelAYXKKw.getLossCount()) == 0) ? 0.5f : (float) C33129mqd.divD$default(botLeadOverviewModelAYXKKw.getProfitCount(), Integer.valueOf(C33129mqd.AhwBna(botLeadOverviewModelAYXKKw.getProfitCount()) + C33129mqd.AhwBna(botLeadOverviewModelAYXKKw.getLossCount())), null, null, null, 14, null);
        }
        float f = fDivD$default;
        xMR xmr = xMR.copydefault;
        String historicalWinRate = botLeadOverviewModelAYXKKw.getHistoricalWinRate();
        String percent$default = xMR.formatPercent$default(xmr, historicalWinRate == null ? "" : historicalWinRate, 0, RoundingMode.DOWN, 2, null);
        String historicalProfitLossRatio = botLeadOverviewModelAYXKKw.getHistoricalProfitLossRatio();
        if (historicalProfitLossRatio == null) {
            historicalProfitLossRatio = "";
        }
        String strAhwBna = xmr.AhwBna(historicalProfitLossRatio, 1);
        String profitCount2 = botLeadOverviewModelAYXKKw.getProfitCount();
        if (profitCount2 == null) {
            profitCount2 = "";
        }
        String strCopydefault = xmr.copydefault(profitCount2);
        String lossCount2 = botLeadOverviewModelAYXKKw.getLossCount();
        if (lossCount2 == null) {
            lossCount2 = "";
        }
        BotWinLossRateData botWinLossRateData = new BotWinLossRateData(percent$default, strAhwBna, strCopydefault, xmr.copydefault(lossCount2), f);
        String avatar = botLeadOverviewModelAYXKKw.getAvatar();
        String str = avatar == null ? "" : avatar;
        String username = botLeadOverviewModelAYXKKw.getUsername();
        String str2 = username == null ? "" : username;
        String followerCount = botLeadOverviewModelAYXKKw.getFollowerCount();
        if (followerCount == null) {
            followerCount = "";
        }
        String strCopydefault2 = xmr.copydefault(followerCount);
        MpStgyParam mpStgyParamDNCPSb = dNCPSb();
        String percent$default2 = xMR.formatPercent$default(xmr, (mpStgyParamDNCPSb == null || (profitSharingRatio = mpStgyParamDNCPSb.getProfitSharingRatio()) == null) ? "" : profitSharingRatio, 0, null, 4, null);
        String traderUniqueName = mpStgyDetail.getTraderUniqueName();
        MpStgyParam mpStgyParamDNCPSb2 = dNCPSb();
        String algoOrdType = mpStgyParamDNCPSb2 != null ? mpStgyParamDNCPSb2.getAlgoOrdType() : null;
        MpStgyParam mpStgyParamDNCPSb3 = dNCPSb();
        return new BotCopyTraderInfoData(str, str2, botWinLossRateData, strCopydefault2, percent$default2, traderUniqueName, algoOrdType, mpStgyParamDNCPSb3 != null ? mpStgyParamDNCPSb3.getTrackingMode() : null);
    }

    public final ArrayList<Object> EZpvd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC51317vkj abstractC51317vkj = this.gEmmrt;
        if (abstractC51317vkj == null) {
            Intrinsics.gEmmrt("");
            abstractC51317vkj = null;
        }
        return abstractC51317vkj.EZpvd(str);
    }

    public final BotGuideData KWHzl() {
        AbstractC51317vkj abstractC51317vkj = this.gEmmrt;
        if (abstractC51317vkj == null) {
            Intrinsics.gEmmrt("");
            abstractC51317vkj = null;
        }
        return abstractC51317vkj.djBIcL();
    }

    public final String DbNXlk() {
        MpStgyInfo mpStgyInfo;
        List<MpStgyInfo> value = this.AkhnZx.getValue();
        if (value == null || (mpStgyInfo = (MpStgyInfo) CollectionsKt___CollectionsKt.firstOrNull(value)) == null) {
            mpStgyInfo = new MpStgyInfo((MpStgyParam) null, (MpStgyDetail) null, (LossInsurance) null, 7, (DefaultConstructorMarker) null);
        }
        return mpStgyInfo.getStgyDetail().getUsername();
    }

    public final String fFgQHt() {
        MpStgyInfo mpStgyInfo;
        List<MpStgyInfo> value = this.AkhnZx.getValue();
        if (value == null || (mpStgyInfo = (MpStgyInfo) CollectionsKt___CollectionsKt.firstOrNull(value)) == null) {
            mpStgyInfo = new MpStgyInfo((MpStgyParam) null, (MpStgyDetail) null, (LossInsurance) null, 7, (DefaultConstructorMarker) null);
        }
        return mpStgyInfo.getStgyDetail().getTraderUniqueName();
    }

    public final String ejfBZ() {
        MpStgyInfo mpStgyInfo;
        List<MpStgyInfo> value = this.AkhnZx.getValue();
        if (value == null || (mpStgyInfo = (MpStgyInfo) CollectionsKt___CollectionsKt.firstOrNull(value)) == null) {
            mpStgyInfo = new MpStgyInfo((MpStgyParam) null, (MpStgyDetail) null, (LossInsurance) null, 7, (DefaultConstructorMarker) null);
        }
        return xMR.copydefault.OLrzqt(mpStgyInfo.getStgyDetail().getFollowerCount(), 0);
    }

    public final String AuCTel() {
        MpStgyInfo mpStgyInfo;
        List<MpStgyInfo> value = this.AkhnZx.getValue();
        if (value == null || (mpStgyInfo = (MpStgyInfo) CollectionsKt___CollectionsKt.firstOrNull(value)) == null) {
            mpStgyInfo = new MpStgyInfo((MpStgyParam) null, (MpStgyDetail) null, (LossInsurance) null, 7, (DefaultConstructorMarker) null);
        }
        return xMR.formatDownToFixed$default(xMR.copydefault, mpStgyInfo.getStgyDetail().getFollowerAssets(), 0, 2, null);
    }

    public final String fARcdN() {
        MpStgyInfo mpStgyInfo;
        MpStgyDetail stgyDetail;
        List<MpStgyInfo> value = this.AkhnZx.getValue();
        String followerAssetsCcy = (value == null || (mpStgyInfo = (MpStgyInfo) CollectionsKt___CollectionsKt.firstOrNull(value)) == null || (stgyDetail = mpStgyInfo.getStgyDetail()) == null) ? null : stgyDetail.getFollowerAssetsCcy();
        if (followerAssetsCcy == null) {
            followerAssetsCcy = "";
        }
        BizInstrument bizInstrumentIsConnected = C56059xvf.EZpvd.isConnected();
        return StringsKt__StringsKt.fARcdN((CharSequence) followerAssetsCcy) ? getNewProxyInstance() : (Intrinsics.EZpvd((Object) followerAssetsCcy, (Object) "USD") && bizInstrumentIsConnected != null && Intrinsics.EZpvd(bizInstrumentIsConnected.isNegativeContract(), Boolean.TRUE)) ? C56033xvF.EZpvd(bizInstrumentIsConnected) : followerAssetsCcy;
    }

    public final Pair<String, Integer> UeEOUB() {
        MpStgyInfo mpStgyInfo;
        List<MpStgyInfo> value = this.AkhnZx.getValue();
        if (value == null || (mpStgyInfo = (MpStgyInfo) CollectionsKt___CollectionsKt.firstOrNull(value)) == null) {
            mpStgyInfo = new MpStgyInfo((MpStgyParam) null, (MpStgyDetail) null, (LossInsurance) null, 7, (DefaultConstructorMarker) null);
        }
        return new Pair<>(C56033xvF.fmtBotPnlPercent$default(mpStgyInfo.getStgyDetail().getPnlRatio(), true, 0, 4, null), Integer.valueOf(C56033xvF.OLrzqt((Object) mpStgyInfo.getStgyDetail().getPnlRatio())));
    }

    public final String QOLQEE() {
        MpStgyInfo mpStgyInfo;
        List<MpStgyInfo> value = this.AkhnZx.getValue();
        if (value == null || (mpStgyInfo = (MpStgyInfo) CollectionsKt___CollectionsKt.firstOrNull(value)) == null) {
            mpStgyInfo = new MpStgyInfo((MpStgyParam) null, (MpStgyDetail) null, (LossInsurance) null, 7, (DefaultConstructorMarker) null);
        }
        xMR xmr = xMR.copydefault;
        return xMR.formatPercent$default(xmr, xmr.OLrzqt(mpStgyInfo.getStgyDetail().getMaxDrawdown()), 0, RoundingMode.DOWN, 2, null);
    }

    public final boolean hDKMBd() {
        MpStgyInfo mpStgyInfo;
        List<MpStgyInfo> value = this.AkhnZx.getValue();
        if (value == null || (mpStgyInfo = (MpStgyInfo) CollectionsKt___CollectionsKt.firstOrNull(value)) == null) {
            mpStgyInfo = new MpStgyInfo((MpStgyParam) null, (MpStgyDetail) null, (LossInsurance) null, 7, (DefaultConstructorMarker) null);
        }
        return mpStgyInfo.getStgyDetail().isUserFavourite();
    }

    public final ArrayList<StrategyProfitResponse> RJOkX() {
        MpStgyInfo mpStgyInfo;
        List<MpStgyInfo> value = this.AkhnZx.getValue();
        if (value == null || (mpStgyInfo = (MpStgyInfo) CollectionsKt___CollectionsKt.firstOrNull(value)) == null) {
            mpStgyInfo = new MpStgyInfo((MpStgyParam) null, (MpStgyDetail) null, (LossInsurance) null, 7, (DefaultConstructorMarker) null);
        }
        ArrayList<StrategyProfitResponse> profitHistory = mpStgyInfo.getStgyDetail().getProfitHistory();
        return profitHistory == null ? new ArrayList<>() : profitHistory;
    }

    public final String iwGUEr() {
        MpStgyInfo mpStgyInfo;
        MpStgyParam stgyParam;
        String instId;
        List<MpStgyInfo> value = this.AkhnZx.getValue();
        return (value == null || (mpStgyInfo = (MpStgyInfo) CollectionsKt___CollectionsKt.firstOrNull(value)) == null || (stgyParam = mpStgyInfo.getStgyParam()) == null || (instId = stgyParam.getInstId()) == null) ? "" : instId;
    }

    public final String getFieldNames() {
        MpStgyInfo mpStgyInfo;
        MpStgyParam stgyParam;
        String instType;
        List<MpStgyInfo> value = this.AkhnZx.getValue();
        return (value == null || (mpStgyInfo = (MpStgyInfo) CollectionsKt___CollectionsKt.firstOrNull(value)) == null || (stgyParam = mpStgyInfo.getStgyParam()) == null || (instType = stgyParam.getInstType()) == null) ? "" : instType;
    }

    public final MpStgyParam dNCPSb() {
        MpStgyInfo mpStgyInfo;
        List<MpStgyInfo> value = this.AkhnZx.getValue();
        if (value == null || (mpStgyInfo = (MpStgyInfo) CollectionsKt___CollectionsKt.firstOrNull(value)) == null) {
            return null;
        }
        return mpStgyInfo.getStgyParam();
    }

    public final MpStgyDetail djSkpj() {
        MpStgyInfo mpStgyInfo;
        MpStgyDetail stgyDetail;
        List<MpStgyInfo> value = this.AkhnZx.getValue();
        return (value == null || (mpStgyInfo = (MpStgyInfo) CollectionsKt___CollectionsKt.firstOrNull(value)) == null || (stgyDetail = mpStgyInfo.getStgyDetail()) == null) ? new MpStgyDetail((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ArrayList) null, false, (ArrayList) null, (ArrayList) null, (String) null, (String) null, (String) null, (String) null, 16383, (DefaultConstructorMarker) null) : stgyDetail;
    }

    public final boolean finit() {
        MpStgyParam mpStgyParamDNCPSb = dNCPSb();
        return Intrinsics.EZpvd((Object) (mpStgyParamDNCPSb != null ? mpStgyParamDNCPSb.getCopyType() : null), (Object) "3");
    }

    public final String copydefault(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC51317vkj abstractC51317vkj = this.gEmmrt;
        if (abstractC51317vkj == null) {
            Intrinsics.gEmmrt("");
            abstractC51317vkj = null;
        }
        return abstractC51317vkj.OLrzqt(str);
    }

    public final String AEQbTJ(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        AbstractC51317vkj abstractC51317vkj = this.gEmmrt;
        if (abstractC51317vkj == null) {
            Intrinsics.gEmmrt("");
            abstractC51317vkj = null;
        }
        return abstractC51317vkj.AEQbTJ(str, str2);
    }

    public final String AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC51317vkj abstractC51317vkj = this.gEmmrt;
        if (abstractC51317vkj == null) {
            Intrinsics.gEmmrt("");
            abstractC51317vkj = null;
        }
        return abstractC51317vkj.AYXKKw(str);
    }

    public final String getNewProxyInstance() {
        AbstractC51317vkj abstractC51317vkj = this.gEmmrt;
        if (abstractC51317vkj == null) {
            Intrinsics.gEmmrt("");
            abstractC51317vkj = null;
        }
        return abstractC51317vkj.getFieldNames();
    }

    public final int uzCIH() {
        AbstractC51317vkj abstractC51317vkj = this.gEmmrt;
        if (abstractC51317vkj == null) {
            Intrinsics.gEmmrt("");
            abstractC51317vkj = null;
        }
        return abstractC51317vkj.ejfBZ();
    }

    public final String dvKsVJ() {
        AbstractC51317vkj abstractC51317vkj = this.gEmmrt;
        if (abstractC51317vkj == null) {
            Intrinsics.gEmmrt("");
            abstractC51317vkj = null;
        }
        return abstractC51317vkj.QfsBiF();
    }

    public final List<String> fetchVPNInfo() {
        AbstractC51317vkj abstractC51317vkj = this.gEmmrt;
        if (abstractC51317vkj == null) {
            Intrinsics.gEmmrt("");
            abstractC51317vkj = null;
        }
        return abstractC51317vkj.DbNXlk();
    }

    public final ArrayList<ProfitInfoItemData> QVAiDq() {
        MpStgyDetail mpStgyDetail;
        MpStgyInfo mpStgyInfo;
        ArrayList<ProfitInfoItemData> arrayList = new ArrayList<>();
        List<MpStgyInfo> value = this.AkhnZx.getValue();
        if (value == null || (mpStgyInfo = (MpStgyInfo) CollectionsKt___CollectionsKt.firstOrNull(value)) == null || (mpStgyDetail = mpStgyInfo.getStgyDetail()) == null) {
            mpStgyDetail = new MpStgyDetail((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ArrayList) null, false, (ArrayList) null, (ArrayList) null, (String) null, (String) null, (String) null, (String) null, 16383, (DefaultConstructorMarker) null);
        }
        ArrayList<ProfitTimeRangeItem> profitTimeRange = mpStgyDetail.getProfitTimeRange();
        if (profitTimeRange != null) {
            for (ProfitTimeRangeItem profitTimeRangeItem : profitTimeRange) {
                ProfitInfoItemData profitInfoItemData = new ProfitInfoItemData(profitTimeRangeItem.getType(), C56068xvo.copydefault.copydefault(profitTimeRangeItem.getPnlRatio(), true), C56033xvF.OLrzqt((Object) profitTimeRangeItem.getPnlRatio()));
                if (C33129mqd.OLrzqt((CharSequence) profitTimeRangeItem.getPnlRatio())) {
                    arrayList.add(profitInfoItemData);
                }
            }
        }
        return arrayList;
    }

    public final Pair<Boolean, String> AEQbTJ(@NotNull CopyBotReqParam copyBotReqParam) {
        Intrinsics.checkNotNullParameter(copyBotReqParam, "");
        AbstractC51317vkj abstractC51317vkj = this.gEmmrt;
        if (abstractC51317vkj == null) {
            Intrinsics.gEmmrt("");
            abstractC51317vkj = null;
        }
        return abstractC51317vkj.AEQbTJ(copyBotReqParam);
    }

    public final void AhwBna(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C56276xzk c56276xzk = this.isConnected;
        c56276xzk.copydefault(str);
        c56276xzk.AEQbTJ(this.AkhnZx);
        xKK.Activity.execute$default(c56276xzk, 0L, 1, null);
    }

    public final void fZBcTu() {
        MpStgyDetail mpStgyDetail;
        MpStgyInfo mpStgyInfo;
        List<MpStgyInfo> value = this.AkhnZx.getValue();
        if (value == null || (mpStgyInfo = (MpStgyInfo) CollectionsKt___CollectionsKt.firstOrNull(value)) == null || (mpStgyDetail = mpStgyInfo.getStgyDetail()) == null) {
            mpStgyDetail = new MpStgyDetail((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ArrayList) null, false, (ArrayList) null, (ArrayList) null, (String) null, (String) null, (String) null, (String) null, 16383, (DefaultConstructorMarker) null);
        }
        if (mpStgyDetail.getTraderUniqueName().length() == 0) {
            this.djBIcL.setValue(new BotLeadOverviewModel((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 1023, (DefaultConstructorMarker) null));
            return;
        }
        C56269xzd c56269xzd = this.AhwBna;
        c56269xzd.EZpvd(mpStgyDetail.getTraderUniqueName());
        c56269xzd.OLrzqt(this.djBIcL, new C54507xKz());
        xKK.Activity.execute$default(c56269xzd, 0L, 1, null);
    }

    public final void gEmmrt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (Intrinsics.EZpvd((Object) str, (Object) "recurring") || Intrinsics.EZpvd((Object) str, (Object) "smart_portfolio")) {
            this.AuCTel.setValue(Boolean.TRUE);
            return;
        }
        C54315xDw c54315xDw = this.fIwbmz;
        c54315xDw.copydefault(OLrzqt(str));
        c54315xDw.AEQbTJ(this.AuCTel);
        xKK.Activity.execute$default(c54315xDw, 0L, 1, null);
    }

    public final List<String> OLrzqt(String str) {
        return Intrinsics.EZpvd((Object) str, (Object) "contract_grid") ? yDY.gEmmrt("SWAP", "FUTURES") : Intrinsics.EZpvd((Object) str, (Object) "contract_dca") ? C56402yEa.EZpvd("SWAP") : C56402yEa.EZpvd("SPOT");
    }

    public final void valueOf(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (Intrinsics.EZpvd((Object) str, (Object) "recurring") || Intrinsics.EZpvd((Object) str, (Object) "smart_portfolio")) {
            return;
        }
        xCN xcn = this.AEQbTJ;
        xcn.OLrzqt(getFieldNames(), iwGUEr());
        xKK.Activity.execute$default(xcn, 0L, 1, null);
    }

    public final void fetchVPNInfo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C56272xzg c56272xzg = this.DbNXlk;
        c56272xzg.KWHzl(str);
        c56272xzg.AEQbTJ(this.values);
        xKK.Activity.execute$default(c56272xzg, 0L, 1, null);
    }

    public final void KWHzl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C56199xyM c56199xyM = this.valueOf;
        c56199xyM.OLrzqt(str);
        c56199xyM.AEQbTJ("0");
        c56199xyM.AEQbTJ(this.AYXKKw);
        xKK.Activity.execute$default(c56199xyM, 0L, 1, null);
    }

    public final void EZpvd() {
        RxBus.KWHzl("refresh_fav_bot");
    }

    public final String isConnected() {
        String direction;
        MpStgyParam mpStgyParamDNCPSb = dNCPSb();
        if (mpStgyParamDNCPSb == null || (direction = mpStgyParamDNCPSb.getDirection()) == null) {
            direction = "";
        }
        return C56033xvF.AhwBna(direction);
    }

    public final int KWHzl(boolean z) {
        String direction;
        MpStgyParam mpStgyParamDNCPSb = dNCPSb();
        if (mpStgyParamDNCPSb == null || (direction = mpStgyParamDNCPSb.getDirection()) == null) {
            direction = "";
        }
        return C56033xvF.copydefault(direction, z);
    }

    public final String wlaJM() {
        String lever;
        MpStgyParam mpStgyParamDNCPSb = dNCPSb();
        return (mpStgyParamDNCPSb == null || (lever = mpStgyParamDNCPSb.getLever()) == null) ? "" : lever;
    }

    public final int AEQbTJ(boolean z) {
        String direction;
        MpStgyParam mpStgyParamDNCPSb = dNCPSb();
        if (mpStgyParamDNCPSb == null || (direction = mpStgyParamDNCPSb.getDirection()) == null) {
            direction = "";
        }
        return C56033xvF.AEQbTJ(direction, z);
    }

    public final void AEQbTJ(@NotNull String str, @NotNull android.app.Activity activity, @NotNull Activity activity2) {
        TradeProductId tradeProductId;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(activity2, "");
        if (Intrinsics.EZpvd((Object) str, (Object) "spot_dca")) {
            tradeProductId = TradeProductId.SPOT_DCA;
        } else {
            tradeProductId = Intrinsics.EZpvd((Object) str, (Object) "grid") ? TradeProductId.SPOT_GRID : null;
        }
        TradeProductId tradeProductId2 = tradeProductId;
        if (tradeProductId2 != null) {
            if (BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new StgyCopyPresenter$startRiskEvaluationFlow$1$1((InterfaceC49505upn) C43251rlk.copydefault(InterfaceC49505upn.class), activity, tradeProductId2, this, activity2, null), 3, null) != null) {
                return;
            }
        }
        this.copydefault.tryEmit(activity2);
    }

    public interface Activity {

        /* JADX INFO: loaded from: classes19.dex */
        public static final class ActionBar implements Activity {
            public static final ActionBar KWHzl = new ActionBar();

            private ActionBar() {
            }
        }

        public static final class TaskDescription implements Activity {
            public static final TaskDescription copydefault = new TaskDescription();

            private TaskDescription() {
            }
        }

        /* JADX INFO: loaded from: classes19.dex */
        public static final class StateListAnimator implements Activity {
            public static final StateListAnimator EZpvd = new StateListAnimator();

            private StateListAnimator() {
            }
        }
    }

    public final void dxcTrN() {
        AbstractC51317vkj abstractC51317vkj = this.gEmmrt;
        if (abstractC51317vkj == null) {
            Intrinsics.gEmmrt("");
            abstractC51317vkj = null;
        }
        abstractC51317vkj.djSkpj();
        InterfaceC58217yxC interfaceC58217yxC = this.fetchVPNInfo;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        ArrayList arrayListCopydefault = yDY.copydefault(this.isConnected, this.DbNXlk, this.valueOf, this.AEQbTJ, this.AhwBna, this.OLrzqt, this.fIwbmz);
        AbstractC51317vkj abstractC51317vkj = this.gEmmrt;
        if (abstractC51317vkj == null) {
            Intrinsics.gEmmrt("");
            abstractC51317vkj = null;
        }
        arrayListCopydefault.addAll(abstractC51317vkj.QbewEr());
        return arrayListCopydefault;
    }

    public final void AEQbTJ() {
        C53685wqE.copydefault.AEQbTJ().EZpvd();
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        dxcTrN();
    }
}
