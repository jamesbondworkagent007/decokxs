package o;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.okinc.market.discover.features.markets.sub.rank.futures.domain.GetMarketDiscoverFuturesTurnoverPosUseCase$onExecute$1;
import com.okinc.market.quotation.data.model.PeriodTickersPo;
import com.okinc.market.quotation.ui.model.FuturesUnitVo;
import com.okinc.market.ranking.core.model.po.FuturesRankItemPo;
import com.okinc.market.time.filter.PeriodEnum;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qkX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41104qkX extends AbstractC49400uno<C41105qkY, java.util.List<? extends FuturesRankItemPo>> {
    public final CoroutineDispatcher KWHzl;
    public final C41446qqv OLrzqt;
    public final C41662quz copydefault;
    private static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;

    /* JADX INFO: renamed from: o.qkX$Application */
    public final /* synthetic */ class Application {
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
        return this.KWHzl;
    }

    @yCM
    public C41104qkX(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C41662quz c41662quz, @NotNull C41446qqv c41446qqv) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c41662quz, "");
        Intrinsics.checkNotNullParameter(c41446qqv, "");
        this.KWHzl = coroutineDispatcher;
        this.copydefault = c41662quz;
        this.OLrzqt = c41446qqv;
    }

    /* JADX INFO: renamed from: o.qkX$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qkX.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull C41105qkY c41105qkY, @NotNull Continuation<? super java.util.List<FuturesRankItemPo>> continuation) throws java.lang.Throwable {
        GetMarketDiscoverFuturesTurnoverPosUseCase$onExecute$1 getMarketDiscoverFuturesTurnoverPosUseCase$onExecute$1;
        C41104qkX c41104qkX;
        PeriodEnum periodEnum;
        java.lang.String str;
        if (continuation instanceof GetMarketDiscoverFuturesTurnoverPosUseCase$onExecute$1) {
            getMarketDiscoverFuturesTurnoverPosUseCase$onExecute$1 = (GetMarketDiscoverFuturesTurnoverPosUseCase$onExecute$1) continuation;
            int i = getMarketDiscoverFuturesTurnoverPosUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getMarketDiscoverFuturesTurnoverPosUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                getMarketDiscoverFuturesTurnoverPosUseCase$onExecute$1 = new GetMarketDiscoverFuturesTurnoverPosUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = getMarketDiscoverFuturesTurnoverPosUseCase$onExecute$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = getMarketDiscoverFuturesTurnoverPosUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            c41105qkY.copydefault();
            FuturesUnitVo futuresUnitVoKWHzl = c41105qkY.KWHzl();
            PeriodEnum periodEnumEZpvd = c41105qkY.EZpvd();
            java.lang.String strEZpvd = futuresUnitVoKWHzl.EZpvd();
            if (strEZpvd == null) {
                strEZpvd = "";
            }
            C41298qoF c41298qoF = C41298qoF.AEQbTJ;
            c41298qoF.EZpvd("GetMarketDiscoverFuturesTurnoverPosUseCase", "onExecute: ccyType=" + strEZpvd + ", period=" + periodEnumEZpvd);
            java.lang.String strAEQbTJ = C41786qxQ.AEQbTJ("24h", "utc0", "utc8");
            java.util.Map mapOLrzqt = C56423yEv.OLrzqt();
            mapOLrzqt.put("rankType", "volume");
            mapOLrzqt.put("type", strEZpvd);
            mapOLrzqt.put("zone", strAEQbTJ);
            if (periodEnumEZpvd != PeriodEnum.RANKING_PERIOD_1D) {
                mapOLrzqt.put(TypedValues.CycleType.S_WAVE_PERIOD, periodEnumEZpvd.getInputPara());
            }
            java.util.Map<java.lang.String, java.lang.String> mapAYXKKw = C56423yEv.AYXKKw(mapOLrzqt);
            c41298qoF.EZpvd("GetMarketDiscoverFuturesTurnoverPosUseCase", "Request params: " + mapAYXKKw);
            C41662quz c41662quz = this.copydefault;
            getMarketDiscoverFuturesTurnoverPosUseCase$onExecute$1.L$0 = this;
            getMarketDiscoverFuturesTurnoverPosUseCase$onExecute$1.L$1 = periodEnumEZpvd;
            getMarketDiscoverFuturesTurnoverPosUseCase$onExecute$1.L$2 = strAEQbTJ;
            getMarketDiscoverFuturesTurnoverPosUseCase$onExecute$1.label = 1;
            objCopydefault = c41662quz.copydefault(mapAYXKKw, getMarketDiscoverFuturesTurnoverPosUseCase$onExecute$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            c41104qkX = this;
            periodEnum = periodEnumEZpvd;
            str = strAEQbTJ;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (java.lang.String) getMarketDiscoverFuturesTurnoverPosUseCase$onExecute$1.L$2;
            periodEnum = (PeriodEnum) getMarketDiscoverFuturesTurnoverPosUseCase$onExecute$1.L$1;
            c41104qkX = (C41104qkX) getMarketDiscoverFuturesTurnoverPosUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
        }
        java.util.List<FuturesRankItemPo> list = (java.util.List) objCopydefault;
        if (list == null || list.isEmpty()) {
            C41298qoF.w$default(C41298qoF.AEQbTJ, "GetMarketDiscoverFuturesTurnoverPosUseCase", "HTTP response is empty or null", null, 4, null);
            return null;
        }
        C41298qoF.AEQbTJ.EZpvd("GetMarketDiscoverFuturesTurnoverPosUseCase", "HTTP response received: " + list.size() + " items");
        if (C27563jxZ.OLrzqt.AhwBna()) {
            c41104qkX.copydefault(list, periodEnum, str);
        }
        return list;
    }

    private final void copydefault(java.util.List<FuturesRankItemPo> list, PeriodEnum periodEnum, java.lang.String str) {
        java.lang.Object objM7377constructorimpl;
        C41298qoF.AEQbTJ.EZpvd("GetMarketDiscoverFuturesTurnoverPosUseCase", "Start caching period tickers: " + list.size() + " items, period=" + periodEnum + ", zone=" + str);
        int i = 0;
        int i2 = 0;
        for (FuturesRankItemPo futuresRankItemPo : list) {
            try {
                Result.Application application = Result.Companion;
                PeriodTickersPo periodTickersPoKWHzl = KWHzl(this.OLrzqt.AEQbTJ(futuresRankItemPo.getInstId()), futuresRankItemPo, periodEnum, str);
                if (periodTickersPoKWHzl != null) {
                    this.OLrzqt.OLrzqt(futuresRankItemPo.getInstId(), periodTickersPoKWHzl);
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
                C41298qoF.AEQbTJ.AEQbTJ("GetMarketDiscoverFuturesTurnoverPosUseCase", "Failed to cache period ticker: " + futuresRankItemPo.getInstId(), thM7380exceptionOrNullimpl);
            }
        }
        C41298qoF.AEQbTJ.EZpvd("GetMarketDiscoverFuturesTurnoverPosUseCase", "Period tickers cached: success=" + i + ", failure=" + i2);
    }

    private final PeriodTickersPo KWHzl(PeriodTickersPo periodTickersPo, FuturesRankItemPo futuresRankItemPo, PeriodEnum periodEnum, java.lang.String str) {
        if (futuresRankItemPo.getInstId().length() == 0 || futuresRankItemPo.getInstType().length() == 0) {
            return null;
        }
        PeriodTickersPo periodTickersPo2 = periodTickersPo == null ? new PeriodTickersPo(futuresRankItemPo.getInstId(), futuresRankItemPo.getInstType(), futuresRankItemPo.getLastPrice(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0L, 1048568, null) : periodTickersPo;
        int i = Application.KWHzl[periodEnum.ordinal()];
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
