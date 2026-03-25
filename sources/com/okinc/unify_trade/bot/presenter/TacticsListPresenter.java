package com.okinc.unify_trade.bot.presenter;

import android.app.Application;
import android.os.SystemClock;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.TradeLiveData;
import androidx.recyclerview.widget.DiffUtil;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.tradeapi.framework.constant.TradeKey;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.BotOrderFilter;
import com.okinc.unify_trade.biz.BotOrderListReqGroup;
import com.okinc.unify_trade.biz.BotSectorUnderlyingListBean;
import com.okinc.unify_trade.biz.EditStrategyNameReq;
import com.okinc.unify_trade.biz.OrderPositionData;
import com.okinc.unify_trade.biz.PinBotReq;
import com.okinc.unify_trade.biz.PinBotResp;
import com.okinc.unify_trade.biz.RecurringListItem;
import com.okinc.unify_trade.biz.SmartPortfolioListItem;
import com.okinc.unify_trade.biz.StgySourceInfo;
import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import com.okinc.unify_trade.biz.StrategyHistoryListReq;
import com.okinc.unify_trade.biz.StrategyProfitResponse;
import com.okinc.unify_trade.biz.UnderlyingListBean;
import com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import com.okinc.unify_trade.bot.data.BotGuiderViewData;
import com.okinc.unify_trade.bot.data.BotToMPRecommend;
import com.okinc.unify_trade.bot.data.BotToMPRecommendCard;
import com.okinc.unify_trade.bot.data.CommonEmptyData;
import com.okinc.unify_trade.bot.data.EmptyData;
import com.okinc.unify_trade.bot.data.OngoingBotsOnshoreEmptyData;
import com.okinc.unify_trade.bot.data.TacticsData;
import com.okinc.unify_trade.bot.list.CardStyle;
import com.okinc.unify_trade.bot.list.FilterState;
import com.okinc.unify_trade.bot.list.SortOption;
import com.okinc.unify_trade.bot.mapper.SignalBotShareDataMapper;
import com.okinc.unify_trade.bot.presenter.TacticsListPresenter;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import com.okinc.unify_trade.trade.biz.BizInfoConfig;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC54531xLw;
import o.C32866mlf;
import o.C33070mpX;
import o.C33129mqd;
import o.C43251rlk;
import o.C54212xAa;
import o.C54282xCq;
import o.C54301xDi;
import o.C54315xDw;
import o.C54589xNz;
import o.C55688xof;
import o.C55804xqp;
import o.C55846xre;
import o.C55889xsU;
import o.C55930xtI;
import o.C55946xtY;
import o.C56033xvF;
import o.C56071xvr;
import o.C56073xvt;
import o.C56220xyh;
import o.C56250xzK;
import o.C56254xzO;
import o.C56273xzh;
import o.C56282xzq;
import o.C56390yDp;
import o.C56392yDr;
import o.C56402yEa;
import o.C56403yEb;
import o.InterfaceC49425uoM;
import o.InterfaceC49429uoQ;
import o.InterfaceC54581xNr;
import o.InterfaceC56387yDm;
import o.pUU;
import o.xCJ;
import o.xCK;
import o.xCP;
import o.xKK;
import o.xLY;
import o.xMR;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class TacticsListPresenter extends AbsPresenter {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public final TradeLiveData<List<TickersData>> AEQbTJ;
    public final InterfaceC56387yDm AYXKKw;
    public final TradeLiveData<C55804xqp<List<BizTradeStrategyInfo>>> AhwBna;
    public BotOrderFilter AkhnZx;
    public String AuCTel;
    public boolean AuCTelauCTel;
    public boolean AubY;
    public boolean AwvSrB;
    public int AxsJAY;
    public final TradeLiveData<List<PinBotResp>> DTwDnp;
    public final MutableLiveData<ArrayList<BotToMPRecommend>> DbNXlk;
    public final C56250xzK EZpvd;
    public final C54282xCq KWHzl;
    public final TradeLiveData<List<Object>> OLrzqt;
    public final CopyOnWriteArrayList<BizTradeStrategyInfo> ORxRYg;
    public final TradeLiveData<TacticsData> OcIXYQ;
    public final InterfaceC49429uoQ QKVWgx;
    public TradeLiveData<Pair<List<Object>, DiffUtil.DiffResult>> QOLQEE;
    public final TradeLiveData<C55804xqp<List<BizTradeStrategyInfo>>> QUSxYX;
    public final C56273xzh QVAiDq;
    public final TradeLiveData<C55804xqp<StrategyDetailsResponse>> QbewEr;
    public final HashMap<String, xCP> QfsBiF;
    public StgySourceInfo RJOkX;
    public final C54301xDi UeEOUB;
    public final C54315xDw aKErDB;
    public TacticsData dNCPSb;
    public final xCJ djBIcL;
    public String ejfBZ;
    public final C56282xzq fARcdN;
    public String fIwbmz;
    public final MutableLiveData<BotToMPRecommendCard> fJNWhG;
    public final C56254xzO fetchVPNInfo;
    public final TradeLiveData<Boolean> gEmmrt;
    public boolean gHZMYf;
    public boolean getFieldNames;
    public boolean getNewProxyInstance;
    public boolean hDKMBd;
    public final ConcurrentHashMap<String, Boolean> isConnected;
    public boolean iwGUEr;
    public final TradeLiveData<ArrayList<Object>> sSMYrx;
    public boolean uzCIH;
    public final TradeLiveData<OrderPositionData> valueOf;
    public final xCK values;
    public boolean wlaJM;
    public boolean zLjUOn;
    public boolean zsXlph;
    public boolean zuBGHE;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fIwbmz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(boolean z) {
        this.uzCIH = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<List<Object>> AYXKKw() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AYXKKw(boolean z) {
        this.AwvSrB = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<List<TickersData>> AhwBna() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AhwBna(boolean z) {
        this.AubY = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final xCK AkhnZx() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AuCTel() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StgySourceInfo AwvSrB() {
        return this.RJOkX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<C55804xqp<List<BizTradeStrategyInfo>>> AxsJAY() {
        return this.QUSxYX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TacticsData DTwDnp() {
        return this.dNCPSb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotOrderFilter DbNXlk() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(boolean z) {
        this.zuBGHE = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(boolean z) {
        this.getNewProxyInstance = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(int i) {
        this.AxsJAY = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull BotOrderFilter botOrderFilter) {
        Intrinsics.checkNotNullParameter(botOrderFilter, "");
        this.AkhnZx = botOrderFilter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(boolean z) {
        this.hDKMBd = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean ORxRYg() {
        return this.getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54315xDw OcIXYQ() {
        return this.aKErDB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean QOLQEE() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean QUSxYX() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean QbewEr() {
        return this.wlaJM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean QfsBiF() {
        return this.gHZMYf ? this.uzCIH : (this.getNewProxyInstance || this.AwvSrB || this.zuBGHE) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean RJOkX() {
        return this.getNewProxyInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean RcXXUw() {
        return this.zsXlph;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean aKErDB() {
        return this.zLjUOn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ejfBZ = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(boolean z) {
        this.iwGUEr = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<Boolean> djBIcL() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void djBIcL(boolean z) {
        this.zsXlph = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean djSkpj() {
        return this.AubY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fARcdN() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int fIwbmz() {
        if (this.getNewProxyInstance || this.AwvSrB) {
            return 40;
        }
        return this.AxsJAY;
    }

    public final float fJNWhG() {
        return 32.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<BotToMPRecommendCard> fetchVPNInfo() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56250xzK gEmmrt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void gEmmrt(boolean z) {
        this.wlaJM = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<TacticsData> gHZMYf() {
        return this.OcIXYQ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getFieldNames() {
        return this.zuBGHE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float getNewProxyInstance() {
        return (this.getNewProxyInstance || this.AwvSrB) ? 24.0f : 48.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean hDKMBd() {
        return this.gHZMYf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<C55804xqp<List<BizTradeStrategyInfo>>> isConnected() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void isConnected(boolean z) {
        this.zLjUOn = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean iwGUEr() {
        return this.AwvSrB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC49429uoQ sSMYrx() {
        return this.QKVWgx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<OrderPositionData> valueOf() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void valueOf(boolean z) {
        this.gHZMYf = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56254xzO values() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void values(boolean z) {
        this.AuCTelauCTel = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<Pair<List<Object>, DiffUtil.DiffResult>> wlaJM() {
        return this.QOLQEE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<ArrayList<Object>> zLjUOn() {
        return this.sSMYrx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<List<PinBotResp>> zsXlph() {
        return this.DTwDnp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<C55804xqp<StrategyDetailsResponse>> zuBGHE() {
        return this.QbewEr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TacticsListPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.ORxRYg = new CopyOnWriteArrayList<>();
        this.djBIcL = new xCJ(true);
        this.valueOf = new TradeLiveData<>();
        this.fARcdN = new C56282xzq();
        this.fJNWhG = new MutableLiveData<>();
        this.DbNXlk = new MutableLiveData<>();
        this.values = new xCK();
        this.AhwBna = new TradeLiveData<>();
        this.QOLQEE = new TradeLiveData<>();
        this.QfsBiF = new HashMap<>();
        this.isConnected = new ConcurrentHashMap<>();
        this.QUSxYX = new TradeLiveData<>();
        this.aKErDB = new C54315xDw();
        this.gEmmrt = new TradeLiveData<>();
        this.KWHzl = new C54282xCq();
        this.AEQbTJ = new TradeLiveData<>();
        this.EZpvd = new C56250xzK();
        this.OLrzqt = new TradeLiveData<>();
        this.fetchVPNInfo = new C56254xzO();
        this.DTwDnp = new TradeLiveData<>();
        this.QVAiDq = new C56273xzh();
        this.OcIXYQ = new TradeLiveData<>();
        this.AuCTel = "";
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.xuE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return TacticsListPresenter.KWHzl();
            }
        });
        this.sSMYrx = new TradeLiveData<>();
        this.QKVWgx = (InterfaceC49429uoQ) ((InterfaceC49425uoM) C43251rlk.copydefault(InterfaceC49425uoM.class)).KWHzl(TradeKey.TRADE_SWITCH);
        this.AkhnZx = new BotOrderFilter(null, null, null, null, null, null, null, 127, null);
        this.iwGUEr = true;
        this.ejfBZ = "bot_un_know_source";
        this.fIwbmz = "";
        this.UeEOUB = new C54301xDi(false, 1, null);
        this.QbewEr = new TradeLiveData<>();
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.bot.presenter.TacticsListPresenter.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public static final xLY KWHzl() {
        return new xLY(BizInfoConfig.DefaultBizConfig.copydefault);
    }

    private final xLY fZBcTu() {
        return (xLY) this.AYXKKw.getValue();
    }

    public static /* synthetic */ void queryBotList$default(TacticsListPresenter tacticsListPresenter, boolean z, FilterState filterState, SortOption sortOption, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            filterState = null;
        }
        if ((i & 4) != 0) {
            sortOption = null;
        }
        tacticsListPresenter.EZpvd(z, filterState, sortOption);
    }

    public final void EZpvd(boolean z, FilterState filterState, SortOption sortOption) {
        AEQbTJ(z, filterState, sortOption);
    }

    public final void EZpvd(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C56250xzK c56250xzK = this.EZpvd;
        c56250xzK.AEQbTJ(this.OLrzqt);
        c56250xzK.AEQbTJ(EditStrategyNameReq.Companion.EZpvd(str, str2));
        xKK.Activity.execute$default(c56250xzK, 0L, 1, null);
    }

    public final void OLrzqt(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        C56254xzO c56254xzO = this.fetchVPNInfo;
        c56254xzO.AEQbTJ(this.DTwDnp);
        c56254xzO.EZpvd(PinBotReq.Companion.copydefault(str, z));
        xKK.Activity.execute$default(c56254xzO, 0L, 1, null);
    }

    public final void UeEOUB() {
        xCJ xcj = this.djBIcL;
        xcj.AEQbTJ(this.valueOf);
        xKK.Activity.execute$default(xcj, 0L, 1, null);
    }

    public final void dxcTrN() {
        if (C56071xvr.gEmmrt.getFieldNames()) {
            return;
        }
        if (this.zuBGHE && Intrinsics.EZpvd((Object) this.AkhnZx.getBotType(), (Object) "all_bot")) {
            AEQbTJ();
        } else if (this.AubY && Intrinsics.EZpvd((Object) this.AkhnZx.getBotType(), (Object) "all_bot")) {
            AEQbTJ();
        }
    }

    public final void AEQbTJ() {
        C56282xzq c56282xzq = this.fARcdN;
        c56282xzq.KWHzl(new Function1() { // from class: o.xuD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return TacticsListPresenter.AEQbTJ(this.copydefault, (ResponseData) obj);
            }
        });
        xKK.Activity.execute$default(c56282xzq, 0L, 1, null);
    }

    public static final Unit AEQbTJ(TacticsListPresenter tacticsListPresenter, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        String.valueOf(responseData.getData());
        ArrayList<BotToMPRecommend> arrayList = (ArrayList) responseData.getData();
        if (arrayList != null) {
            tacticsListPresenter.DbNXlk.postValue(arrayList);
        }
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(boolean z, FilterState filterState, SortOption sortOption) {
        xCK xck = this.values;
        xck.copydefault(AEQbTJ(filterState, sortOption));
        xck.KWHzl(z, new Function0() { // from class: o.xuA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return TacticsListPresenter.EZpvd(this.KWHzl);
            }
        });
        xck.AEQbTJ(this.AhwBna);
        xKK.Activity.execute$default(xck, 0L, 1, null);
    }

    public static final CopyOnWriteArrayList EZpvd(TacticsListPresenter tacticsListPresenter) {
        return tacticsListPresenter.ORxRYg;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_trade.bot.presenter.TacticsListPresenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void requestStgySourceInfo$default(TacticsListPresenter tacticsListPresenter, String str, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        tacticsListPresenter.OLrzqt(str, (Function1<? super List<StgySourceInfo>, Unit>) function1);
    }

    public final void OLrzqt(@NotNull String str, final Function1<? super List<StgySourceInfo>, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        C54212xAa c54212xAa = new C54212xAa();
        c54212xAa.OLrzqt(str);
        c54212xAa.KWHzl(new Function1() { // from class: o.xuB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return TacticsListPresenter.AEQbTJ(this.EZpvd, function1, (ResponseData) obj);
            }
        });
        xKK.Activity.execute$default(c54212xAa, 0L, 1, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_trade.bot.presenter.TacticsListPresenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void requestChartProfitData$default(TacticsListPresenter tacticsListPresenter, String str, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        tacticsListPresenter.AEQbTJ(str, (Function1<? super List<StrategyProfitResponse>, Unit>) function1);
    }

    public final void AEQbTJ(@NotNull final String str, final Function1<? super List<StrategyProfitResponse>, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        if (this.isConnected.contains(str)) {
            return;
        }
        this.isConnected.put(str, Boolean.TRUE);
        C56220xyh c56220xyh = new C56220xyh();
        c56220xyh.OLrzqt(str);
        c56220xyh.KWHzl(new Function1() { // from class: o.xuz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return TacticsListPresenter.KWHzl(function1, this, str, (ResponseData) obj);
            }
        });
        xKK.Activity.execute$default(c56220xyh, 0L, 1, null);
    }

    public final void OLrzqt(int i, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        xCP xcp = this.QfsBiF.get(str);
        if (xcp != null && !xcp.isConnected()) {
            pUU.KWHzl("TacticsListPresenter", "request bot(" + i + ") " + str + " cancel, use case exists!");
            return;
        }
        pUU.KWHzl("TacticsListPresenter", "request bot(" + i + ") " + str + " now!");
        xCP xcp2 = new xCP();
        this.QfsBiF.put(str, xcp2);
        xcp2.AEQbTJ(this.QUSxYX);
        xcp2.AEQbTJ(str);
        xcp2.copydefault(str2);
        xKK.Activity.execute$default(xcp2, 0L, 1, null);
    }

    public final void KWHzl(int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        xCP xcp = this.QfsBiF.get(str);
        if (xcp != null) {
            pUU.KWHzl("TacticsListPresenter", "dispose single bot(" + i + ") " + str + " cause it's gone!");
            xcp.AYXKKw();
            this.QfsBiF.remove(str);
        }
    }

    public final void copydefault() {
        this.values.AYXKKw();
        Collection<xCP> collectionValues = this.QfsBiF.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "");
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            ((xCP) it.next()).AYXKKw();
        }
        this.QfsBiF.clear();
        this.isConnected.clear();
    }

    public final BotOrderListReqGroup AEQbTJ(FilterState filterState, SortOption sortOption) {
        String strJoinToString$default;
        List<UnderlyingListBean> underlyingList;
        this.AuCTel = this.AkhnZx.toString();
        StrategyHistoryListReq strategyHistoryListReq = new StrategyHistoryListReq();
        if (filterState != null) {
            if (C33129mqd.KWHzl((Collection) filterState.getSelectedCurrencyIds())) {
                strategyHistoryListReq.setBaseCoins(CollectionsKt___CollectionsKt.joinToString$default(filterState.getSelectedCurrencyIds(), ",", null, null, 0, null, null, 62, null));
            }
            if (this.uzCIH) {
                strategyHistoryListReq.setRequireProfits(filterState.getCardStyle() == CardStyle.DETAILED);
            } else {
                strategyHistoryListReq.setRequireProfits(false);
            }
        }
        strategyHistoryListReq.setOrdType(this.AkhnZx.getBotType());
        strategyHistoryListReq.setInstType(this.AkhnZx.getInstType());
        String botType = this.AkhnZx.getBotType();
        String instId = null;
        if (Intrinsics.EZpvd((Object) botType, (Object) "lvf_buy")) {
            strategyHistoryListReq.setTradeSide("Buy");
        } else if (Intrinsics.EZpvd((Object) botType, (Object) "lvf_sell")) {
            strategyHistoryListReq.setTradeSide("Sell");
        } else {
            strategyHistoryListReq.setTradeSide(null);
        }
        strategyHistoryListReq.setStart(this.uzCIH ? this.AkhnZx.getStartTime() : null);
        strategyHistoryListReq.setEnd(this.uzCIH ? this.AkhnZx.getEndTime() : null);
        if (this.uzCIH) {
            strategyHistoryListReq.setSortType("filledTime");
            strategyHistoryListReq.setLimit("20");
            strategyHistoryListReq.setState("canceled,effective,order_failed");
        } else {
            strategyHistoryListReq.setLimit("40");
            strategyHistoryListReq.setSms(Intrinsics.EZpvd((Object) this.AkhnZx.getBotType(), (Object) "all_bot"));
        }
        if (this.gHZMYf) {
            strategyHistoryListReq.setSystemSource("nmp");
            BotSectorUnderlyingListBean underlyingListBean = this.AkhnZx.getUnderlyingListBean();
            if (underlyingListBean == null || (underlyingList = underlyingListBean.getUnderlyingList()) == null) {
                strJoinToString$default = null;
            } else {
                ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(underlyingList, 10));
                Iterator<T> it = underlyingList.iterator();
                while (it.hasNext()) {
                    arrayList.add(((UnderlyingListBean) it.next()).getNmpUnderlyingId());
                }
                strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, null, 62, null);
            }
            strategyHistoryListReq.setNmpUnderlyingIds(strJoinToString$default);
            strategyHistoryListReq.setSms(true);
        }
        if (!C55946xtY.OLrzqt.gEmmrt(this.AkhnZx.getBotType())) {
            if (this.zLjUOn) {
                strategyHistoryListReq.setCurrentPair(true);
                BizInstrument bizInstrumentEZpvd = fZBcTu().EZpvd();
                if (bizInstrumentEZpvd != null) {
                    instId = bizInstrumentEZpvd.getInstId();
                }
            } else {
                instId = this.AkhnZx.getInstId();
            }
            strategyHistoryListReq.setInstId(instId);
        }
        if (!this.uzCIH && sortOption != null) {
            strategyHistoryListReq.setSortType(sortOption.getType().getApiValue());
            strategyHistoryListReq.setSortOrder(sortOption.getOrder().getApiValue());
        }
        boolean z = this.uzCIH;
        return new BotOrderListReqGroup(z, !z, strategyHistoryListReq, strategyHistoryListReq, this.AkhnZx.getBotType());
    }

    public final void QKVWgx() {
        C54315xDw c54315xDw = this.aKErDB;
        c54315xDw.AEQbTJ(this.gEmmrt);
        c54315xDw.copydefault(uzCIH());
        xKK.Activity.execute$default(c54315xDw, 0L, 1, null);
    }

    public final List<String> uzCIH() {
        Collection collectionAhwBna;
        ArrayList<AbstractC54531xLw> arrayListAuCTel;
        List<String> listKWHzl = C55946xtY.OLrzqt.KWHzl(this.AkhnZx.getBotType());
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null || (arrayListAuCTel = interfaceC54581xNrOLrzqt.AuCTel()) == null) {
            collectionAhwBna = yDY.AhwBna();
        } else {
            collectionAhwBna = new ArrayList();
            for (Object obj : arrayListAuCTel) {
                if (!AbstractC54531xLw.isInitFun$default((AbstractC54531xLw) obj, false, 1, null)) {
                    collectionAhwBna.add(obj);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : collectionAhwBna) {
            if (listKWHzl.contains(((AbstractC54531xLw) obj2).AYXKKw())) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((AbstractC54531xLw) it.next()).AYXKKw());
        }
        return arrayList2;
    }

    public final ArrayList<Object> EZpvd(C55804xqp<List<BizTradeStrategyInfo>> c55804xqp) {
        C55930xtI c55930xtI = new C55930xtI(false, 1, null);
        c55930xtI.KWHzl((C55946xtY.OLrzqt.gEmmrt(this.AkhnZx.getBotType()) && this.getNewProxyInstance) ? false : this.zLjUOn, this.gHZMYf);
        if (!Intrinsics.EZpvd((Object) this.AkhnZx.getBotType(), (Object) "all_bot")) {
            c55930xtI.AYXKKw(this.AkhnZx.getSortType());
            c55930xtI.copydefault(this.uzCIH);
        }
        return c55930xtI.OLrzqt(c55804xqp);
    }

    public final void OLrzqt(@NotNull C55804xqp<List<BizTradeStrategyInfo>> c55804xqp, @NotNull List<? extends Object> list, boolean z) {
        List<CommonEmptyData> listEjfBZ;
        Intrinsics.checkNotNullParameter(c55804xqp, "");
        Intrinsics.checkNotNullParameter(list, "");
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        ArrayList<Object> arrayListEZpvd = EZpvd(c55804xqp);
        this.sSMYrx.postValue(arrayListEZpvd);
        if (EZpvd(arrayListEZpvd)) {
            String botType = this.AkhnZx.getBotType();
            float newProxyInstance = getNewProxyInstance();
            float fFJNWhG = fJNWhG();
            boolean z2 = this.getNewProxyInstance;
            arrayListEZpvd.add(new BotGuiderViewData(botType, newProxyInstance, fFJNWhG, (z2 || this.AwvSrB || this.zuBGHE) ? false : true, z2, this.AwvSrB && !this.uzCIH));
            OLrzqt();
        }
        if (arrayListEZpvd.isEmpty()) {
            this.getFieldNames = false;
            if (this.zuBGHE && Intrinsics.EZpvd((Object) this.AkhnZx.getBotType(), (Object) "all_bot")) {
                ArrayList<BotToMPRecommend> value = this.DbNXlk.getValue();
                if (value != null) {
                    this.fJNWhG.postValue(new BotToMPRecommendCard(value));
                } else {
                    arrayListEZpvd.addAll(AuCTelauCTel());
                    this.QOLQEE.postValue(C56390yDp.OLrzqt(arrayListEZpvd, DiffUtil.calculateDiff(new C56073xvt(arrayListEZpvd, list), true)));
                }
            } else if (this.AubY && Intrinsics.EZpvd((Object) this.AkhnZx.getBotType(), (Object) "all_bot")) {
                ArrayList<BotToMPRecommend> value2 = this.DbNXlk.getValue();
                if (value2 != null) {
                    this.fJNWhG.postValue(new BotToMPRecommendCard(value2));
                } else {
                    arrayListEZpvd.addAll(AuCTelauCTel());
                    this.QOLQEE.postValue(C56390yDp.OLrzqt(arrayListEZpvd, DiffUtil.calculateDiff(new C56073xvt(arrayListEZpvd, list), true)));
                }
            } else {
                if (this.gHZMYf) {
                    listEjfBZ = AubY();
                } else {
                    listEjfBZ = ejfBZ();
                }
                arrayListEZpvd.addAll(listEjfBZ);
                this.QOLQEE.postValue(C56390yDp.OLrzqt(arrayListEZpvd, DiffUtil.calculateDiff(new C56073xvt(arrayListEZpvd, list), true)));
            }
        } else {
            this.getFieldNames = true;
            this.QOLQEE.postValue(C56390yDp.OLrzqt(arrayListEZpvd, DiffUtil.calculateDiff(new C56073xvt(arrayListEZpvd, list), true)));
        }
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        pUU.KWHzl("TacticsListPresenter", "cost: " + (jElapsedRealtime2 - jElapsedRealtime) + ", size: " + c55804xqp.copydefault().size());
    }

    public final List<CommonEmptyData> ejfBZ() {
        return CommonEmptyData.ActionBar.buildEmptyData$default(CommonEmptyData.Companion, "", fIwbmz(), null, C33070mpX.AYXKKw(C55688xof.Application.Experimental), false, false, 36, null);
    }

    public final List<CommonEmptyData> AubY() {
        String strAYXKKw;
        CommonEmptyData.ActionBar actionBar = CommonEmptyData.Companion;
        if (this.uzCIH) {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.MediaBrowserCompatMediaBrowserImplBase5);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.MediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection1);
        }
        return CommonEmptyData.ActionBar.buildEmptyData$default(actionBar, strAYXKKw, 60, null, "", this.uzCIH, false, 36, null);
    }

    public static final List<CommonEmptyData> copydefault(TacticsListPresenter tacticsListPresenter) {
        return CommonEmptyData.ActionBar.buildEmptyData$default(CommonEmptyData.Companion, C33070mpX.AYXKKw(C55688xof.Application.ActivityResultRegistry2), 60, null, C33070mpX.AYXKKw(C55688xof.Application.Experimental), tacticsListPresenter.uzCIH, false, 36, null);
    }

    public static final List<OngoingBotsOnshoreEmptyData> AEQbTJ(TacticsListPresenter tacticsListPresenter) {
        String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.OLrzqt);
        return C56402yEa.EZpvd(new OngoingBotsOnshoreEmptyData(C33070mpX.AYXKKw(C55688xof.Application.AYXKKw), strAYXKKw, C33070mpX.AYXKKw(C55688xof.Application.djBIcL), 7, 60, tacticsListPresenter.uzCIH, false, 0, 0, 448, null));
    }

    public final List<EmptyData> AuCTelauCTel() {
        if (C56071xvr.gEmmrt.getFieldNames()) {
            return AEQbTJ(this);
        }
        return copydefault(this);
    }

    public final void copydefault(@NotNull TacticsData tacticsData) {
        Intrinsics.checkNotNullParameter(tacticsData, "");
        C54282xCq c54282xCq = this.KWHzl;
        c54282xCq.AEQbTJ(this.AEQbTJ);
        c54282xCq.AEQbTJ(tacticsData.getInstId());
        xKK.Activity.execute$default(c54282xCq, 0L, 1, null);
        this.dNCPSb = tacticsData;
    }

    public final void KWHzl(@NotNull TacticsData tacticsData) {
        Intrinsics.checkNotNullParameter(tacticsData, "");
        C56273xzh c56273xzh = this.QVAiDq;
        c56273xzh.EZpvd(tacticsData.getSignalChanId());
        c56273xzh.OLrzqt(this.OcIXYQ, new SignalBotShareDataMapper(tacticsData, SignalBotShareDataMapper.SignalSharePath.BOT_LIST));
        xKK.Activity.execute$default(c56273xzh, 0L, 1, null);
    }

    public final ArrayList<C55846xre> EZpvd(TacticsData tacticsData) {
        ArrayList<RecurringListItem> recItemList;
        ArrayList<C55846xre> arrayList = new ArrayList<>();
        if (tacticsData != null && (recItemList = tacticsData.getRecItemList()) != null) {
            for (RecurringListItem recurringListItem : recItemList) {
                arrayList.add(new C55846xre(recurringListItem.getCcy(), C56033xvF.getBotPrice$default(tacticsData.getInstType(), recurringListItem.getCcy() + "-" + tacticsData.getInvestCcy(), recurringListItem.getAvgPx(), false, false, RoundingMode.HALF_UP, null, 88, null)));
            }
        }
        return arrayList;
    }

    public final ArrayList<C55846xre> AEQbTJ(@NotNull TacticsData tacticsData) {
        Intrinsics.checkNotNullParameter(tacticsData, "");
        ArrayList<C55846xre> arrayList = new ArrayList<>();
        ArrayList<SmartPortfolioListItem> hoardItemList = tacticsData.getHoardItemList();
        if (hoardItemList != null) {
            for (SmartPortfolioListItem smartPortfolioListItem : hoardItemList) {
                if (!Intrinsics.EZpvd((Object) smartPortfolioListItem.getCcy(), (Object) tacticsData.getInvestCcy())) {
                    String strMulS$default = C33129mqd.mulS$default(smartPortfolioListItem.getCurNum(), smartPortfolioListItem.getPx(), null, null, null, 14, null);
                    arrayList.add(new C55846xre(smartPortfolioListItem.getCcy(), xMR.formatPercent$default(xMR.copydefault, C33129mqd.divS$default(strMulS$default, tacticsData.getMktCap(), null, null, null, 14, null), 0, Intrinsics.EZpvd((Object) smartPortfolioListItem.getCcy(), (Object) "USDT") ? RoundingMode.UP : RoundingMode.DOWN, 2, null)));
                }
            }
        }
        return arrayList;
    }

    public final ArrayList<C55846xre> OLrzqt(@NotNull TacticsData tacticsData) {
        Intrinsics.checkNotNullParameter(tacticsData, "");
        ArrayList<C55846xre> arrayList = new ArrayList<>();
        ArrayList<SmartPortfolioListItem> hoardItemList = tacticsData.getHoardItemList();
        if (hoardItemList != null) {
            for (SmartPortfolioListItem smartPortfolioListItem : hoardItemList) {
                if (!Intrinsics.EZpvd((Object) smartPortfolioListItem.getCcy(), (Object) tacticsData.getInvestCcy())) {
                    String ccy = smartPortfolioListItem.getCcy();
                    String investCcy = tacticsData.getInvestCcy();
                    arrayList.add(new C55846xre(ccy, C56033xvF.fmtBotValueBySymbol$default(investCcy == null ? "" : investCcy, C33129mqd.mulS$default(smartPortfolioListItem.getCurNum(), smartPortfolioListItem.getPx(), null, null, null, 14, null), RoundingMode.DOWN, false, null, false, null, null, null, null, null, 2040, null)));
                }
            }
        }
        return arrayList;
    }

    public final void copydefault(@NotNull TacticsData tacticsData, int i) {
        List<Object> first;
        Intrinsics.checkNotNullParameter(tacticsData, "");
        if (tacticsData.getAlgoId().length() == 0) {
            return;
        }
        C55889xsU.copydefault.EZpvd(tacticsData.getAlgoId(), i);
        Pair<List<Object>, DiffUtil.DiffResult> value = this.QOLQEE.getValue();
        if (value == null || (first = value.getFirst()) == null) {
            return;
        }
        C55804xqp<List<BizTradeStrategyInfo>> value2 = this.AhwBna.getValue();
        if (value2 == null) {
            pUU.valueOf("TacticsListPresenter", "updateProfitDisplaySwitchToggle: botDetailListLiveData is null");
            return;
        }
        ArrayList<Object> arrayListEZpvd = EZpvd(value2);
        this.QOLQEE.postValue(C56390yDp.OLrzqt(arrayListEZpvd, DiffUtil.calculateDiff(new C56073xvt(arrayListEZpvd, first), true)));
        pUU.KWHzl("TacticsListPresenter", "updateProfitDisplaySwitchToggle: Successfully re-mapped data with updated preference for algoId " + tacticsData.getAlgoId() + ", selectedIndex: " + i);
    }

    public final boolean EZpvd(List<? extends Object> list) {
        return list.isEmpty() && (this.getNewProxyInstance || ((this.AwvSrB && !this.uzCIH) || (this.zuBGHE && !Intrinsics.EZpvd((Object) this.AkhnZx.getBotType(), (Object) "all_bot"))));
    }

    public final boolean dNCPSb() {
        return !this.uzCIH && Intrinsics.EZpvd((Object) this.AkhnZx.getBotType(), (Object) "all_bot");
    }

    public final boolean QVAiDq() {
        return !Intrinsics.EZpvd((Object) this.AuCTel, (Object) this.AkhnZx.toString());
    }

    public final void OLrzqt() {
        C32866mlf.onEvent$default("app_strategy_up_0_show", (TrackChannel[]) null, new Function1() { // from class: o.xuC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return TacticsListPresenter.copydefault(this.copydefault, (EventParamsList) obj);
            }
        }, 1, (Object) null);
    }

    public static final Unit copydefault(TacticsListPresenter tacticsListPresenter, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("action_type", "Show", true);
        eventParamsList.put("entrust_type", tacticsListPresenter.AkhnZx.getBotType(), true);
        return Unit.INSTANCE;
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        ArrayList arrayListCopydefault = yDY.copydefault(this.djBIcL, this.values, this.aKErDB, this.KWHzl, this.EZpvd, this.fetchVPNInfo, this.QVAiDq, this.UeEOUB, this.fARcdN);
        Collection<xCP> collectionValues = this.QfsBiF.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "");
        arrayListCopydefault.addAll(CollectionsKt___CollectionsKt.AxsJAYsNCnLh(collectionValues));
        return arrayListCopydefault;
    }

    public final void OLrzqt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C54301xDi c54301xDi = this.UeEOUB;
        c54301xDi.AEQbTJ(this.QbewEr);
        c54301xDi.AEQbTJ(str);
        xKK.Activity.execute$default(c54301xDi, 0L, 1, null);
    }

    public static final Unit AEQbTJ(TacticsListPresenter tacticsListPresenter, Function1 function1, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            List list = (List) responseData.getData();
            tacticsListPresenter.RJOkX = list != null ? (StgySourceInfo) CollectionsKt___CollectionsKt.firstOrNull(list) : null;
            if (function1 != null) {
                List listAhwBna = (List) responseData.getData();
                if (listAhwBna == null) {
                    listAhwBna = yDY.AhwBna();
                }
                function1.invoke(listAhwBna);
            }
        } else if (function1 != null) {
            function1.invoke(null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(Function1 function1, TacticsListPresenter tacticsListPresenter, String str, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() != 0 || responseData.getData() == null) {
            if (function1 != null) {
                function1.invoke(null);
            }
            tacticsListPresenter.isConnected.remove(str);
        } else if (function1 != null) {
            List listAhwBna = (List) responseData.getData();
            if (listAhwBna == null) {
                listAhwBna = yDY.AhwBna();
            }
            function1.invoke(listAhwBna);
        }
        return Unit.INSTANCE;
    }
}
