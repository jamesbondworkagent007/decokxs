package o;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.okinc.market.discover.features.markets.sub.rank.futures.domain.GetMarketDiscoverFuturesUpDownPosUseCase$onExecute$1;
import com.okinc.market.quotation.data.model.PeriodTickersPo;
import com.okinc.market.quotation.ui.model.FuturesUnitVo;
import com.okinc.market.ranking.core.model.po.FuturesRankItemPo;
import com.okinc.market.time.filter.PeriodEnum;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qlg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41166qlg extends AbstractC49400uno<C41160qla, java.util.List<? extends FuturesRankItemPo>> {
    private static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public final C41446qqv AEQbTJ;
    public final CoroutineDispatcher EZpvd;
    public final C41662quz OLrzqt;

    /* JADX INFO: renamed from: o.qlg$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[PeriodEnum.values().length];
            try {
                iArr[PeriodEnum.RANKING_PERIOD_5M.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[PeriodEnum.RANKING_PERIOD_1H.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[PeriodEnum.RANKING_PERIOD_1D.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[PeriodEnum.RANKING_PERIOD_1W.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[PeriodEnum.RANKING_PERIOD_1M.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.EZpvd;
    }

    @yCM
    public C41166qlg(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C41662quz c41662quz, @NotNull C41446qqv c41446qqv) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c41662quz, "");
        Intrinsics.checkNotNullParameter(c41446qqv, "");
        this.EZpvd = coroutineDispatcher;
        this.OLrzqt = c41662quz;
        this.AEQbTJ = c41446qqv;
    }

    /* JADX INFO: renamed from: o.qlg$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qlg.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull C41160qla c41160qla, @NotNull Continuation<? super java.util.List<FuturesRankItemPo>> continuation) throws java.lang.Throwable {
        GetMarketDiscoverFuturesUpDownPosUseCase$onExecute$1 getMarketDiscoverFuturesUpDownPosUseCase$onExecute$1;
        PeriodEnum periodEnumOLrzqt;
        C41166qlg c41166qlg;
        java.lang.String str;
        if (continuation instanceof GetMarketDiscoverFuturesUpDownPosUseCase$onExecute$1) {
            getMarketDiscoverFuturesUpDownPosUseCase$onExecute$1 = (GetMarketDiscoverFuturesUpDownPosUseCase$onExecute$1) continuation;
            int i = getMarketDiscoverFuturesUpDownPosUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getMarketDiscoverFuturesUpDownPosUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                getMarketDiscoverFuturesUpDownPosUseCase$onExecute$1 = new GetMarketDiscoverFuturesUpDownPosUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = getMarketDiscoverFuturesUpDownPosUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getMarketDiscoverFuturesUpDownPosUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            c41160qla.copydefault();
            FuturesUnitVo futuresUnitVoAEQbTJ = c41160qla.AEQbTJ();
            periodEnumOLrzqt = c41160qla.OLrzqt();
            boolean zKWHzl = c41160qla.KWHzl();
            java.lang.String strEZpvd = futuresUnitVoAEQbTJ.EZpvd();
            if (strEZpvd == null) {
                strEZpvd = "";
            }
            C41298qoF c41298qoF = C41298qoF.AEQbTJ;
            c41298qoF.EZpvd("GetMarketDiscoverFuturesUpDownPosUseCase", "onExecute: ccyType=" + strEZpvd + ", period=" + periodEnumOLrzqt + ", isUpRank=" + zKWHzl);
            java.lang.String strAEQbTJ = C41786qxQ.AEQbTJ("24h", "utc0", "utc8");
            java.util.Map mapOLrzqt = C56423yEv.OLrzqt();
            mapOLrzqt.put("rank", zKWHzl ? "0" : "1");
            mapOLrzqt.put("type", strEZpvd);
            mapOLrzqt.put("zone", strAEQbTJ);
            if (periodEnumOLrzqt != PeriodEnum.RANKING_PERIOD_1D) {
                mapOLrzqt.put(TypedValues.CycleType.S_WAVE_PERIOD, periodEnumOLrzqt.getInputPara());
            }
            java.util.Map<java.lang.String, java.lang.String> mapAYXKKw = C56423yEv.AYXKKw(mapOLrzqt);
            c41298qoF.EZpvd("GetMarketDiscoverFuturesUpDownPosUseCase", "Request params: " + mapAYXKKw);
            C41662quz c41662quz = this.OLrzqt;
            getMarketDiscoverFuturesUpDownPosUseCase$onExecute$1.L$0 = this;
            getMarketDiscoverFuturesUpDownPosUseCase$onExecute$1.L$1 = periodEnumOLrzqt;
            getMarketDiscoverFuturesUpDownPosUseCase$onExecute$1.L$2 = strAEQbTJ;
            getMarketDiscoverFuturesUpDownPosUseCase$onExecute$1.label = 1;
            objKWHzl = c41662quz.KWHzl(mapAYXKKw, getMarketDiscoverFuturesUpDownPosUseCase$onExecute$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            c41166qlg = this;
            str = strAEQbTJ;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (java.lang.String) getMarketDiscoverFuturesUpDownPosUseCase$onExecute$1.L$2;
            periodEnumOLrzqt = (PeriodEnum) getMarketDiscoverFuturesUpDownPosUseCase$onExecute$1.L$1;
            c41166qlg = (C41166qlg) getMarketDiscoverFuturesUpDownPosUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(objKWHzl);
        }
        java.util.List list = (java.util.List) objKWHzl;
        if (list == null || list.isEmpty()) {
            C41298qoF.w$default(C41298qoF.AEQbTJ, "GetMarketDiscoverFuturesUpDownPosUseCase", "HTTP response is empty or null", null, 4, null);
            return null;
        }
        java.lang.String strKWHzl = C55488xkr.KWHzl.KWHzl(str);
        java.util.Map map = (java.util.Map) CollectionsKt___CollectionsKt.AkhnZx(list, 0);
        java.util.List<FuturesRankItemPo> list2 = map != null ? (java.util.List) map.get(strKWHzl) : null;
        if (list2 == null || list2.isEmpty()) {
            C41298qoF.w$default(C41298qoF.AEQbTJ, "GetMarketDiscoverFuturesUpDownPosUseCase", "No data found for timezone: " + strKWHzl, null, 4, null);
            return null;
        }
        C41298qoF.AEQbTJ.EZpvd("GetMarketDiscoverFuturesUpDownPosUseCase", "HTTP response received: " + list2.size() + " items");
        if (C27563jxZ.OLrzqt.AhwBna()) {
            c41166qlg.KWHzl(list2, periodEnumOLrzqt, str);
        }
        return list2;
    }

    private final void KWHzl(java.util.List<FuturesRankItemPo> list, PeriodEnum periodEnum, java.lang.String str) {
        java.lang.Object objM7377constructorimpl;
        C41298qoF.AEQbTJ.EZpvd("GetMarketDiscoverFuturesUpDownPosUseCase", "Start caching period tickers: " + list.size() + " items, period=" + periodEnum + ", zone=" + str);
        int i = 0;
        int i2 = 0;
        for (FuturesRankItemPo futuresRankItemPo : list) {
            try {
                Result.Application application = Result.Companion;
                PeriodTickersPo periodTickersPoEZpvd = EZpvd(this.AEQbTJ.AEQbTJ(futuresRankItemPo.getInstId()), futuresRankItemPo, periodEnum, str);
                if (periodTickersPoEZpvd != null) {
                    this.AEQbTJ.OLrzqt(futuresRankItemPo.getInstId(), periodTickersPoEZpvd);
                    i++;
                }
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
                i2++;
                C41298qoF.AEQbTJ.AEQbTJ("GetMarketDiscoverFuturesUpDownPosUseCase", "Failed to cache period ticker: " + futuresRankItemPo.getInstId(), thM7380exceptionOrNullimpl);
            }
        }
        C41298qoF.AEQbTJ.EZpvd("GetMarketDiscoverFuturesUpDownPosUseCase", "Period tickers cached: success=" + i + ", failure=" + i2);
    }

    private final PeriodTickersPo EZpvd(PeriodTickersPo periodTickersPo, FuturesRankItemPo futuresRankItemPo, PeriodEnum periodEnum, java.lang.String str) {
        if (futuresRankItemPo.getInstId().length() == 0 || futuresRankItemPo.getInstType().length() == 0) {
            return null;
        }
        PeriodTickersPo periodTickersPo2 = periodTickersPo == null ? new PeriodTickersPo(futuresRankItemPo.getInstId(), futuresRankItemPo.getInstType(), futuresRankItemPo.getLastPrice(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0L, 1048568, null) : periodTickersPo;
        int i = StateListAnimator.KWHzl[periodEnum.ordinal()];
        if (i == 1) {
            return periodTickersPo2.copy((652283 & 1) != 0 ? periodTickersPo2.instId : null, (652283 & 2) != 0 ? periodTickersPo2.instType : null, (652283 & 4) != 0 ? periodTickersPo2.price : futuresRankItemPo.getLastPrice(), (652283 & 8) != 0 ? periodTickersPo2.changePercent5m : futuresRankItemPo.getChangePer(), (652283 & 16) != 0 ? periodTickersPo2.changePercent1h : null, (652283 & 32) != 0 ? periodTickersPo2.changePercent24h : null, (652283 & 64) != 0 ? periodTickersPo2.changePercent1DUtc0 : null, (652283 & 128) != 0 ? periodTickersPo2.changePercent1DUtc8 : null, (652283 & 256) != 0 ? periodTickersPo2.changePercent1wUtc0 : null, (652283 & 512) != 0 ? periodTickersPo2.changePercent1wUtc8 : null, (652283 & 1024) != 0 ? periodTickersPo2.changePercent1MUtc0 : null, (652283 & 2048) != 0 ? periodTickersPo2.changePercent1MUtc8 : null, (652283 & 4096) != 0 ? periodTickersPo2.turnOver5m : futuresRankItemPo.getTurnOver(), (652283 & 8192) != 0 ? periodTickersPo2.turnOver1h : null, (652283 & 16384) != 0 ? periodTickersPo2.turnOver24h : null, (652283 & 32768) != 0 ? periodTickersPo2.turnOver1wUtc0 : null, (652283 & 65536) != 0 ? periodTickersPo2.turnOver1wUtc8 : null, (652283 & 131072) != 0 ? periodTickersPo2.turnOver1MUtc0 : null, (652283 & 262144) != 0 ? periodTickersPo2.turnOver1MUtc8 : null, (652283 & 524288) != 0 ? periodTickersPo2.timestamp : 0L);
        }
        if (i == 2) {
            return periodTickersPo2.copy((652283 & 1) != 0 ? periodTickersPo2.instId : null, (652283 & 2) != 0 ? periodTickersPo2.instType : null, (652283 & 4) != 0 ? periodTickersPo2.price : futuresRankItemPo.getLastPrice(), (652283 & 8) != 0 ? periodTickersPo2.changePercent5m : null, (652283 & 16) != 0 ? periodTickersPo2.changePercent1h : futuresRankItemPo.getChangePer(), (652283 & 32) != 0 ? periodTickersPo2.changePercent24h : null, (652283 & 64) != 0 ? periodTickersPo2.changePercent1DUtc0 : null, (652283 & 128) != 0 ? periodTickersPo2.changePercent1DUtc8 : null, (652283 & 256) != 0 ? periodTickersPo2.changePercent1wUtc0 : null, (652283 & 512) != 0 ? periodTickersPo2.changePercent1wUtc8 : null, (652283 & 1024) != 0 ? periodTickersPo2.changePercent1MUtc0 : null, (652283 & 2048) != 0 ? periodTickersPo2.changePercent1MUtc8 : null, (652283 & 4096) != 0 ? periodTickersPo2.turnOver5m : null, (652283 & 8192) != 0 ? periodTickersPo2.turnOver1h : futuresRankItemPo.getTurnOver(), (652283 & 16384) != 0 ? periodTickersPo2.turnOver24h : null, (652283 & 32768) != 0 ? periodTickersPo2.turnOver1wUtc0 : null, (652283 & 65536) != 0 ? periodTickersPo2.turnOver1wUtc8 : null, (652283 & 131072) != 0 ? periodTickersPo2.turnOver1MUtc0 : null, (652283 & 262144) != 0 ? periodTickersPo2.turnOver1MUtc8 : null, (652283 & 524288) != 0 ? periodTickersPo2.timestamp : 0L);
        }
        if (i == 3) {
            return periodTickersPo2.copy((652283 & 1) != 0 ? periodTickersPo2.instId : null, (652283 & 2) != 0 ? periodTickersPo2.instType : null, (652283 & 4) != 0 ? periodTickersPo2.price : futuresRankItemPo.getLastPrice(), (652283 & 8) != 0 ? periodTickersPo2.changePercent5m : null, (652283 & 16) != 0 ? periodTickersPo2.changePercent1h : null, (652283 & 32) != 0 ? periodTickersPo2.changePercent24h : Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "24h") ? futuresRankItemPo.getChangePer() : periodTickersPo2.getChangePercent24h(), (652283 & 64) != 0 ? periodTickersPo2.changePercent1DUtc0 : Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "utc0") ? futuresRankItemPo.getChangePer() : periodTickersPo2.getChangePercent1DUtc0(), (652283 & 128) != 0 ? periodTickersPo2.changePercent1DUtc8 : Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "utc8") ? futuresRankItemPo.getChangePer() : periodTickersPo2.getChangePercent1DUtc8(), (652283 & 256) != 0 ? periodTickersPo2.changePercent1wUtc0 : null, (652283 & 512) != 0 ? periodTickersPo2.changePercent1wUtc8 : null, (652283 & 1024) != 0 ? periodTickersPo2.changePercent1MUtc0 : null, (652283 & 2048) != 0 ? periodTickersPo2.changePercent1MUtc8 : null, (652283 & 4096) != 0 ? periodTickersPo2.turnOver5m : null, (652283 & 8192) != 0 ? periodTickersPo2.turnOver1h : null, (652283 & 16384) != 0 ? periodTickersPo2.turnOver24h : futuresRankItemPo.getTurnOver(), (652283 & 32768) != 0 ? periodTickersPo2.turnOver1wUtc0 : null, (652283 & 65536) != 0 ? periodTickersPo2.turnOver1wUtc8 : null, (652283 & 131072) != 0 ? periodTickersPo2.turnOver1MUtc0 : null, (652283 & 262144) != 0 ? periodTickersPo2.turnOver1MUtc8 : null, (652283 & 524288) != 0 ? periodTickersPo2.timestamp : 0L);
        }
        if (i == 4) {
            return periodTickersPo2.copy((652283 & 1) != 0 ? periodTickersPo2.instId : null, (652283 & 2) != 0 ? periodTickersPo2.instType : null, (652283 & 4) != 0 ? periodTickersPo2.price : futuresRankItemPo.getLastPrice(), (652283 & 8) != 0 ? periodTickersPo2.changePercent5m : null, (652283 & 16) != 0 ? periodTickersPo2.changePercent1h : null, (652283 & 32) != 0 ? periodTickersPo2.changePercent24h : null, (652283 & 64) != 0 ? periodTickersPo2.changePercent1DUtc0 : null, (652283 & 128) != 0 ? periodTickersPo2.changePercent1DUtc8 : null, (652283 & 256) != 0 ? periodTickersPo2.changePercent1wUtc0 : !Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "utc8") ? futuresRankItemPo.getChangePer() : periodTickersPo2.getChangePercent1wUtc0(), (652283 & 512) != 0 ? periodTickersPo2.changePercent1wUtc8 : Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "utc8") ? futuresRankItemPo.getChangePer() : periodTickersPo2.getChangePercent1wUtc8(), (652283 & 1024) != 0 ? periodTickersPo2.changePercent1MUtc0 : null, (652283 & 2048) != 0 ? periodTickersPo2.changePercent1MUtc8 : null, (652283 & 4096) != 0 ? periodTickersPo2.turnOver5m : null, (652283 & 8192) != 0 ? periodTickersPo2.turnOver1h : null, (652283 & 16384) != 0 ? periodTickersPo2.turnOver24h : null, (652283 & 32768) != 0 ? periodTickersPo2.turnOver1wUtc0 : !Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "utc8") ? futuresRankItemPo.getTurnOver() : periodTickersPo2.getTurnOver1wUtc0(), (652283 & 65536) != 0 ? periodTickersPo2.turnOver1wUtc8 : Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "utc8") ? futuresRankItemPo.getTurnOver() : periodTickersPo2.getTurnOver1wUtc8(), (652283 & 131072) != 0 ? periodTickersPo2.turnOver1MUtc0 : null, (652283 & 262144) != 0 ? periodTickersPo2.turnOver1MUtc8 : null, (652283 & 524288) != 0 ? periodTickersPo2.timestamp : 0L);
        }
        if (i != 5) {
            return periodTickersPo2;
        }
        return periodTickersPo2.copy((652283 & 1) != 0 ? periodTickersPo2.instId : null, (652283 & 2) != 0 ? periodTickersPo2.instType : null, (652283 & 4) != 0 ? periodTickersPo2.price : futuresRankItemPo.getLastPrice(), (652283 & 8) != 0 ? periodTickersPo2.changePercent5m : null, (652283 & 16) != 0 ? periodTickersPo2.changePercent1h : null, (652283 & 32) != 0 ? periodTickersPo2.changePercent24h : null, (652283 & 64) != 0 ? periodTickersPo2.changePercent1DUtc0 : null, (652283 & 128) != 0 ? periodTickersPo2.changePercent1DUtc8 : null, (652283 & 256) != 0 ? periodTickersPo2.changePercent1wUtc0 : null, (652283 & 512) != 0 ? periodTickersPo2.changePercent1wUtc8 : null, (652283 & 1024) != 0 ? periodTickersPo2.changePercent1MUtc0 : !Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "utc8") ? futuresRankItemPo.getChangePer() : periodTickersPo2.getChangePercent1MUtc0(), (652283 & 2048) != 0 ? periodTickersPo2.changePercent1MUtc8 : Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "utc8") ? futuresRankItemPo.getChangePer() : periodTickersPo2.getChangePercent1MUtc8(), (652283 & 4096) != 0 ? periodTickersPo2.turnOver5m : null, (652283 & 8192) != 0 ? periodTickersPo2.turnOver1h : null, (652283 & 16384) != 0 ? periodTickersPo2.turnOver24h : null, (652283 & 32768) != 0 ? periodTickersPo2.turnOver1wUtc0 : null, (652283 & 65536) != 0 ? periodTickersPo2.turnOver1wUtc8 : null, (652283 & 131072) != 0 ? periodTickersPo2.turnOver1MUtc0 : !Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "utc8") ? futuresRankItemPo.getTurnOver() : periodTickersPo2.getTurnOver1MUtc0(), (652283 & 262144) != 0 ? periodTickersPo2.turnOver1MUtc8 : Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "utc8") ? futuresRankItemPo.getTurnOver() : periodTickersPo2.getTurnOver1MUtc8(), (652283 & 524288) != 0 ? periodTickersPo2.timestamp : 0L);
    }
}
