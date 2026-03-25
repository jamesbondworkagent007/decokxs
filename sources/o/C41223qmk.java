package o;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.okinc.market.discover.features.markets.sub.rank.spot.domain.GetMarketDiscoverSpotTurnoverPosUseCase$onExecute$1;
import com.okinc.market.quotation.data.model.PeriodTickersPo;
import com.okinc.market.quotation.ui.model.ChargeGroupVo;
import com.okinc.market.time.filter.PeriodEnum;
import com.okinc.unify_find.data.TurnOverRank;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qmk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41223qmk extends AbstractC49400uno<C41225qmm, java.util.List<? extends TurnOverRank>> {
    private static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public final C41662quz AEQbTJ;
    public final C41446qqv EZpvd;
    public final CoroutineDispatcher KWHzl;

    /* JADX INFO: renamed from: o.qmk$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] OLrzqt;

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
            OLrzqt = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.KWHzl;
    }

    @yCM
    public C41223qmk(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C41662quz c41662quz, @NotNull C41446qqv c41446qqv) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c41662quz, "");
        Intrinsics.checkNotNullParameter(c41446qqv, "");
        this.KWHzl = coroutineDispatcher;
        this.AEQbTJ = c41662quz;
        this.EZpvd = c41446qqv;
    }

    /* JADX INFO: renamed from: o.qmk$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qmk.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull C41225qmm c41225qmm, @NotNull Continuation<? super java.util.List<TurnOverRank>> continuation) throws java.lang.Throwable {
        GetMarketDiscoverSpotTurnoverPosUseCase$onExecute$1 getMarketDiscoverSpotTurnoverPosUseCase$onExecute$1;
        C41223qmk c41223qmk;
        PeriodEnum periodEnum;
        java.lang.String str;
        if (continuation instanceof GetMarketDiscoverSpotTurnoverPosUseCase$onExecute$1) {
            getMarketDiscoverSpotTurnoverPosUseCase$onExecute$1 = (GetMarketDiscoverSpotTurnoverPosUseCase$onExecute$1) continuation;
            int i = getMarketDiscoverSpotTurnoverPosUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getMarketDiscoverSpotTurnoverPosUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                getMarketDiscoverSpotTurnoverPosUseCase$onExecute$1 = new GetMarketDiscoverSpotTurnoverPosUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object objGEmmrt = getMarketDiscoverSpotTurnoverPosUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getMarketDiscoverSpotTurnoverPosUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objGEmmrt);
            ChargeGroupVo chargeGroupVoEZpvd = c41225qmm.EZpvd();
            PeriodEnum periodEnumCopydefault = c41225qmm.copydefault();
            java.lang.String key = chargeGroupVoEZpvd.OLrzqt().getKey();
            C41298qoF c41298qoF = C41298qoF.AEQbTJ;
            c41298qoF.EZpvd("GetMarketDiscoverSpotTurnoverPosUseCase", "onExecute: rankType=" + key + ", period=" + periodEnumCopydefault);
            java.lang.String strAEQbTJ = C41786qxQ.AEQbTJ("24h", "utc0", "utc8");
            java.util.Map mapOLrzqt = C56423yEv.OLrzqt();
            mapOLrzqt.put("type", key);
            mapOLrzqt.put("zone", strAEQbTJ);
            if (periodEnumCopydefault != PeriodEnum.RANKING_PERIOD_1D) {
                mapOLrzqt.put(TypedValues.CycleType.S_WAVE_PERIOD, periodEnumCopydefault.getInputPara());
            }
            java.util.Map<java.lang.String, java.lang.String> mapAYXKKw = C56423yEv.AYXKKw(mapOLrzqt);
            c41298qoF.EZpvd("GetMarketDiscoverSpotTurnoverPosUseCase", "Request params: " + mapAYXKKw);
            C41662quz c41662quz = this.AEQbTJ;
            getMarketDiscoverSpotTurnoverPosUseCase$onExecute$1.L$0 = this;
            getMarketDiscoverSpotTurnoverPosUseCase$onExecute$1.L$1 = periodEnumCopydefault;
            getMarketDiscoverSpotTurnoverPosUseCase$onExecute$1.L$2 = strAEQbTJ;
            getMarketDiscoverSpotTurnoverPosUseCase$onExecute$1.label = 1;
            objGEmmrt = c41662quz.gEmmrt(mapAYXKKw, getMarketDiscoverSpotTurnoverPosUseCase$onExecute$1);
            if (objGEmmrt == objCopydefault) {
                return objCopydefault;
            }
            c41223qmk = this;
            periodEnum = periodEnumCopydefault;
            str = strAEQbTJ;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (java.lang.String) getMarketDiscoverSpotTurnoverPosUseCase$onExecute$1.L$2;
            periodEnum = (PeriodEnum) getMarketDiscoverSpotTurnoverPosUseCase$onExecute$1.L$1;
            c41223qmk = (C41223qmk) getMarketDiscoverSpotTurnoverPosUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(objGEmmrt);
        }
        java.util.List<TurnOverRank> list = (java.util.List) objGEmmrt;
        if (list == null || list.isEmpty()) {
            C41298qoF.w$default(C41298qoF.AEQbTJ, "GetMarketDiscoverSpotTurnoverPosUseCase", "HTTP response is empty or null", null, 4, null);
            return null;
        }
        C41298qoF.AEQbTJ.EZpvd("GetMarketDiscoverSpotTurnoverPosUseCase", "HTTP response received: " + list.size() + " items");
        if (C27563jxZ.OLrzqt.AhwBna()) {
            c41223qmk.EZpvd(list, periodEnum, str);
        }
        return list;
    }

    private final void EZpvd(java.util.List<TurnOverRank> list, PeriodEnum periodEnum, java.lang.String str) {
        java.lang.Object objM7377constructorimpl;
        C41298qoF.AEQbTJ.EZpvd("GetMarketDiscoverSpotTurnoverPosUseCase", "Start caching period tickers: " + list.size() + " items, period=" + periodEnum + ", zone=" + str);
        int i = 0;
        int i2 = 0;
        for (TurnOverRank turnOverRank : list) {
            try {
                Result.Application application = Result.Companion;
                PeriodTickersPo periodTickersPoKWHzl = KWHzl(this.EZpvd.AEQbTJ(turnOverRank.getInstId()), turnOverRank, periodEnum, str);
                if (periodTickersPoKWHzl != null) {
                    this.EZpvd.OLrzqt(turnOverRank.getInstId(), periodTickersPoKWHzl);
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
                C41298qoF.AEQbTJ.AEQbTJ("GetMarketDiscoverSpotTurnoverPosUseCase", "Failed to cache period ticker: " + turnOverRank.getInstId(), thM7380exceptionOrNullimpl);
            }
        }
        C41298qoF.AEQbTJ.EZpvd("GetMarketDiscoverSpotTurnoverPosUseCase", "Period tickers cached: success=" + i + ", failure=" + i2);
    }

    public final PeriodTickersPo KWHzl(PeriodTickersPo periodTickersPo, TurnOverRank turnOverRank, PeriodEnum periodEnum, java.lang.String str) {
        if (turnOverRank.getInstId().length() == 0 || turnOverRank.getInstType().length() == 0) {
            return null;
        }
        PeriodTickersPo periodTickersPo2 = periodTickersPo == null ? new PeriodTickersPo(turnOverRank.getInstId(), turnOverRank.getInstType(), turnOverRank.getLastPrice(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0L, 1048568, null) : periodTickersPo;
        int i = TaskDescription.OLrzqt[periodEnum.ordinal()];
        if (i == 1) {
            return periodTickersPo2.copy((652283 & 1) != 0 ? periodTickersPo2.instId : null, (652283 & 2) != 0 ? periodTickersPo2.instType : null, (652283 & 4) != 0 ? periodTickersPo2.price : turnOverRank.getLastPrice(), (652283 & 8) != 0 ? periodTickersPo2.changePercent5m : turnOverRank.getChangePerV2(), (652283 & 16) != 0 ? periodTickersPo2.changePercent1h : null, (652283 & 32) != 0 ? periodTickersPo2.changePercent24h : null, (652283 & 64) != 0 ? periodTickersPo2.changePercent1DUtc0 : null, (652283 & 128) != 0 ? periodTickersPo2.changePercent1DUtc8 : null, (652283 & 256) != 0 ? periodTickersPo2.changePercent1wUtc0 : null, (652283 & 512) != 0 ? periodTickersPo2.changePercent1wUtc8 : null, (652283 & 1024) != 0 ? periodTickersPo2.changePercent1MUtc0 : null, (652283 & 2048) != 0 ? periodTickersPo2.changePercent1MUtc8 : null, (652283 & 4096) != 0 ? periodTickersPo2.turnOver5m : turnOverRank.getTurnOver(), (652283 & 8192) != 0 ? periodTickersPo2.turnOver1h : null, (652283 & 16384) != 0 ? periodTickersPo2.turnOver24h : null, (652283 & 32768) != 0 ? periodTickersPo2.turnOver1wUtc0 : null, (652283 & 65536) != 0 ? periodTickersPo2.turnOver1wUtc8 : null, (652283 & 131072) != 0 ? periodTickersPo2.turnOver1MUtc0 : null, (652283 & 262144) != 0 ? periodTickersPo2.turnOver1MUtc8 : null, (652283 & 524288) != 0 ? periodTickersPo2.timestamp : 0L);
        }
        if (i == 2) {
            return periodTickersPo2.copy((652283 & 1) != 0 ? periodTickersPo2.instId : null, (652283 & 2) != 0 ? periodTickersPo2.instType : null, (652283 & 4) != 0 ? periodTickersPo2.price : turnOverRank.getLastPrice(), (652283 & 8) != 0 ? periodTickersPo2.changePercent5m : null, (652283 & 16) != 0 ? periodTickersPo2.changePercent1h : turnOverRank.getChangePerV2(), (652283 & 32) != 0 ? periodTickersPo2.changePercent24h : null, (652283 & 64) != 0 ? periodTickersPo2.changePercent1DUtc0 : null, (652283 & 128) != 0 ? periodTickersPo2.changePercent1DUtc8 : null, (652283 & 256) != 0 ? periodTickersPo2.changePercent1wUtc0 : null, (652283 & 512) != 0 ? periodTickersPo2.changePercent1wUtc8 : null, (652283 & 1024) != 0 ? periodTickersPo2.changePercent1MUtc0 : null, (652283 & 2048) != 0 ? periodTickersPo2.changePercent1MUtc8 : null, (652283 & 4096) != 0 ? periodTickersPo2.turnOver5m : null, (652283 & 8192) != 0 ? periodTickersPo2.turnOver1h : turnOverRank.getTurnOver(), (652283 & 16384) != 0 ? periodTickersPo2.turnOver24h : null, (652283 & 32768) != 0 ? periodTickersPo2.turnOver1wUtc0 : null, (652283 & 65536) != 0 ? periodTickersPo2.turnOver1wUtc8 : null, (652283 & 131072) != 0 ? periodTickersPo2.turnOver1MUtc0 : null, (652283 & 262144) != 0 ? periodTickersPo2.turnOver1MUtc8 : null, (652283 & 524288) != 0 ? periodTickersPo2.timestamp : 0L);
        }
        if (i == 3) {
            return periodTickersPo2.copy((652283 & 1) != 0 ? periodTickersPo2.instId : null, (652283 & 2) != 0 ? periodTickersPo2.instType : null, (652283 & 4) != 0 ? periodTickersPo2.price : turnOverRank.getLastPrice(), (652283 & 8) != 0 ? periodTickersPo2.changePercent5m : null, (652283 & 16) != 0 ? periodTickersPo2.changePercent1h : null, (652283 & 32) != 0 ? periodTickersPo2.changePercent24h : Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "24h") ? turnOverRank.getChangePerV2() : periodTickersPo2.getChangePercent24h(), (652283 & 64) != 0 ? periodTickersPo2.changePercent1DUtc0 : Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "utc0") ? turnOverRank.getChangePerV2() : periodTickersPo2.getChangePercent1DUtc0(), (652283 & 128) != 0 ? periodTickersPo2.changePercent1DUtc8 : Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "utc8") ? turnOverRank.getChangePerV2() : periodTickersPo2.getChangePercent1DUtc8(), (652283 & 256) != 0 ? periodTickersPo2.changePercent1wUtc0 : null, (652283 & 512) != 0 ? periodTickersPo2.changePercent1wUtc8 : null, (652283 & 1024) != 0 ? periodTickersPo2.changePercent1MUtc0 : null, (652283 & 2048) != 0 ? periodTickersPo2.changePercent1MUtc8 : null, (652283 & 4096) != 0 ? periodTickersPo2.turnOver5m : null, (652283 & 8192) != 0 ? periodTickersPo2.turnOver1h : null, (652283 & 16384) != 0 ? periodTickersPo2.turnOver24h : turnOverRank.getTurnOver(), (652283 & 32768) != 0 ? periodTickersPo2.turnOver1wUtc0 : null, (652283 & 65536) != 0 ? periodTickersPo2.turnOver1wUtc8 : null, (652283 & 131072) != 0 ? periodTickersPo2.turnOver1MUtc0 : null, (652283 & 262144) != 0 ? periodTickersPo2.turnOver1MUtc8 : null, (652283 & 524288) != 0 ? periodTickersPo2.timestamp : 0L);
        }
        if (i == 4) {
            return periodTickersPo2.copy((652283 & 1) != 0 ? periodTickersPo2.instId : null, (652283 & 2) != 0 ? periodTickersPo2.instType : null, (652283 & 4) != 0 ? periodTickersPo2.price : turnOverRank.getLastPrice(), (652283 & 8) != 0 ? periodTickersPo2.changePercent5m : null, (652283 & 16) != 0 ? periodTickersPo2.changePercent1h : null, (652283 & 32) != 0 ? periodTickersPo2.changePercent24h : null, (652283 & 64) != 0 ? periodTickersPo2.changePercent1DUtc0 : null, (652283 & 128) != 0 ? periodTickersPo2.changePercent1DUtc8 : null, (652283 & 256) != 0 ? periodTickersPo2.changePercent1wUtc0 : !Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "utc8") ? turnOverRank.getChangePerV2() : periodTickersPo2.getChangePercent1wUtc0(), (652283 & 512) != 0 ? periodTickersPo2.changePercent1wUtc8 : Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "utc8") ? turnOverRank.getChangePerV2() : periodTickersPo2.getChangePercent1wUtc8(), (652283 & 1024) != 0 ? periodTickersPo2.changePercent1MUtc0 : null, (652283 & 2048) != 0 ? periodTickersPo2.changePercent1MUtc8 : null, (652283 & 4096) != 0 ? periodTickersPo2.turnOver5m : null, (652283 & 8192) != 0 ? periodTickersPo2.turnOver1h : null, (652283 & 16384) != 0 ? periodTickersPo2.turnOver24h : null, (652283 & 32768) != 0 ? periodTickersPo2.turnOver1wUtc0 : !Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "utc8") ? turnOverRank.getTurnOver() : periodTickersPo2.getTurnOver1wUtc0(), (652283 & 65536) != 0 ? periodTickersPo2.turnOver1wUtc8 : Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "utc8") ? turnOverRank.getTurnOver() : periodTickersPo2.getTurnOver1wUtc8(), (652283 & 131072) != 0 ? periodTickersPo2.turnOver1MUtc0 : null, (652283 & 262144) != 0 ? periodTickersPo2.turnOver1MUtc8 : null, (652283 & 524288) != 0 ? periodTickersPo2.timestamp : 0L);
        }
        if (i != 5) {
            return periodTickersPo2;
        }
        return periodTickersPo2.copy((652283 & 1) != 0 ? periodTickersPo2.instId : null, (652283 & 2) != 0 ? periodTickersPo2.instType : null, (652283 & 4) != 0 ? periodTickersPo2.price : turnOverRank.getLastPrice(), (652283 & 8) != 0 ? periodTickersPo2.changePercent5m : null, (652283 & 16) != 0 ? periodTickersPo2.changePercent1h : null, (652283 & 32) != 0 ? periodTickersPo2.changePercent24h : null, (652283 & 64) != 0 ? periodTickersPo2.changePercent1DUtc0 : null, (652283 & 128) != 0 ? periodTickersPo2.changePercent1DUtc8 : null, (652283 & 256) != 0 ? periodTickersPo2.changePercent1wUtc0 : null, (652283 & 512) != 0 ? periodTickersPo2.changePercent1wUtc8 : null, (652283 & 1024) != 0 ? periodTickersPo2.changePercent1MUtc0 : !Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "utc8") ? turnOverRank.getChangePerV2() : periodTickersPo2.getChangePercent1MUtc0(), (652283 & 2048) != 0 ? periodTickersPo2.changePercent1MUtc8 : Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "utc8") ? turnOverRank.getChangePerV2() : periodTickersPo2.getChangePercent1MUtc8(), (652283 & 4096) != 0 ? periodTickersPo2.turnOver5m : null, (652283 & 8192) != 0 ? periodTickersPo2.turnOver1h : null, (652283 & 16384) != 0 ? periodTickersPo2.turnOver24h : null, (652283 & 32768) != 0 ? periodTickersPo2.turnOver1wUtc0 : null, (652283 & 65536) != 0 ? periodTickersPo2.turnOver1wUtc8 : null, (652283 & 131072) != 0 ? periodTickersPo2.turnOver1MUtc0 : !Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "utc8") ? turnOverRank.getTurnOver() : periodTickersPo2.getTurnOver1MUtc0(), (652283 & 262144) != 0 ? periodTickersPo2.turnOver1MUtc8 : Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "utc8") ? turnOverRank.getTurnOver() : periodTickersPo2.getTurnOver1MUtc8(), (652283 & 524288) != 0 ? periodTickersPo2.timestamp : 0L);
    }
}
