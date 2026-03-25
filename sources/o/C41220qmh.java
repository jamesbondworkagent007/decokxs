package o;

import com.okinc.market.discover.features.markets.sub.rank.spot.domain.GetMarketDiscoverSpotHotPosUseCase$onExecute$1;
import com.okinc.market.quotation.data.model.PeriodTickersPo;
import com.okinc.market.quotation.ui.model.ChargeGroupVo;
import com.okinc.market.time.filter.PeriodEnum;
import com.okinc.unify_find.data.HotRankResponse;
import java.lang.ref.SoftReference;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qmh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41220qmh extends AbstractC49400uno<C41222qmj, java.util.List<? extends HotRankResponse>> {
    private static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public final C41662quz AEQbTJ;
    public final ConcurrentHashMap<java.lang.String, SoftReference<java.util.List<HotRankResponse>>> KWHzl;
    public final C41446qqv OLrzqt;
    public final CoroutineDispatcher copydefault;

    /* JADX INFO: renamed from: o.qmh$Activity */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] AEQbTJ;

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
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.copydefault;
    }

    @yCM
    public C41220qmh(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C41662quz c41662quz, @NotNull C41446qqv c41446qqv) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c41662quz, "");
        Intrinsics.checkNotNullParameter(c41446qqv, "");
        this.copydefault = coroutineDispatcher;
        this.AEQbTJ = c41662quz;
        this.OLrzqt = c41446qqv;
        this.KWHzl = new ConcurrentHashMap<>();
    }

    /* JADX INFO: renamed from: o.qmh$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qmh.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull C41222qmj c41222qmj, @NotNull Continuation<? super java.util.List<HotRankResponse>> continuation) throws java.lang.Throwable {
        GetMarketDiscoverSpotHotPosUseCase$onExecute$1 getMarketDiscoverSpotHotPosUseCase$onExecute$1;
        java.util.List<HotRankResponse> listAhwBna;
        java.lang.String str;
        java.lang.String str2;
        PeriodEnum periodEnum;
        java.lang.String str3;
        java.util.List<HotRankResponse> list;
        C41220qmh c41220qmh;
        java.lang.String str4;
        if (continuation instanceof GetMarketDiscoverSpotHotPosUseCase$onExecute$1) {
            getMarketDiscoverSpotHotPosUseCase$onExecute$1 = (GetMarketDiscoverSpotHotPosUseCase$onExecute$1) continuation;
            int i = getMarketDiscoverSpotHotPosUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getMarketDiscoverSpotHotPosUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                getMarketDiscoverSpotHotPosUseCase$onExecute$1 = new GetMarketDiscoverSpotHotPosUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object obj = getMarketDiscoverSpotHotPosUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getMarketDiscoverSpotHotPosUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            ChargeGroupVo chargeGroupVoOLrzqt = c41222qmj.OLrzqt();
            PeriodEnum periodEnumAEQbTJ = c41222qmj.AEQbTJ();
            java.lang.String key = chargeGroupVoOLrzqt.OLrzqt().getKey();
            C41298qoF.AEQbTJ.EZpvd("GetMarketDiscoverSpotHotPosUseCase", "onExecute: rankType=" + key + ", period=" + periodEnumAEQbTJ);
            SoftReference<java.util.List<HotRankResponse>> softReference = this.KWHzl.get(key);
            if (softReference == null || (listAhwBna = softReference.get()) == null) {
                listAhwBna = yDY.AhwBna();
            }
            java.util.List<HotRankResponse> list2 = listAhwBna;
            java.lang.String strAEQbTJ = C41786qxQ.AEQbTJ("24h", "utc0", "utc8");
            str = "GetMarketDiscoverSpotHotPosUseCase";
            java.util.Map<java.lang.String, java.lang.String> mapBuildRankParams$default = C41781qxL.buildRankParams$default(C41781qxL.OLrzqt, null, key, strAEQbTJ, periodEnumAEQbTJ, 0, 0, 49, null);
            C41662quz c41662quz = this.AEQbTJ;
            getMarketDiscoverSpotHotPosUseCase$onExecute$1.L$0 = this;
            getMarketDiscoverSpotHotPosUseCase$onExecute$1.L$1 = periodEnumAEQbTJ;
            getMarketDiscoverSpotHotPosUseCase$onExecute$1.L$2 = key;
            getMarketDiscoverSpotHotPosUseCase$onExecute$1.L$3 = list2;
            getMarketDiscoverSpotHotPosUseCase$onExecute$1.L$4 = strAEQbTJ;
            getMarketDiscoverSpotHotPosUseCase$onExecute$1.label = 1;
            java.lang.Object objAEQbTJ = c41662quz.AEQbTJ(mapBuildRankParams$default, getMarketDiscoverSpotHotPosUseCase$onExecute$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            str2 = key;
            obj = objAEQbTJ;
            periodEnum = periodEnumAEQbTJ;
            str3 = strAEQbTJ;
            list = list2;
            c41220qmh = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str3 = (java.lang.String) getMarketDiscoverSpotHotPosUseCase$onExecute$1.L$4;
            list = (java.util.List) getMarketDiscoverSpotHotPosUseCase$onExecute$1.L$3;
            str2 = (java.lang.String) getMarketDiscoverSpotHotPosUseCase$onExecute$1.L$2;
            periodEnum = (PeriodEnum) getMarketDiscoverSpotHotPosUseCase$onExecute$1.L$1;
            c41220qmh = (C41220qmh) getMarketDiscoverSpotHotPosUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(obj);
            str = "GetMarketDiscoverSpotHotPosUseCase";
        }
        java.util.List<HotRankResponse> list3 = (java.util.List) obj;
        if (C33129mqd.KWHzl((java.util.Collection) list3)) {
            C41298qoF c41298qoF = C41298qoF.AEQbTJ;
            str4 = str;
            c41298qoF.EZpvd(str4, "HTTP response received: " + (list3 != null ? C56443yFo.AEQbTJ(list3.size()) : null) + " items");
            c41220qmh.KWHzl.put(str2, new SoftReference<>(list3));
            if (C27563jxZ.OLrzqt.AhwBna()) {
                c41220qmh.copydefault(list3 == null ? yDY.AhwBna() : list3, periodEnum, str3);
            }
        } else {
            str4 = str;
            C41298qoF.w$default(C41298qoF.AEQbTJ, "GetMarketDiscoverSpotHotPosUseCase", "HTTP response is empty or null", null, 4, null);
        }
        if (list3 == null || !list3.isEmpty()) {
            return list3;
        }
        C41298qoF.AEQbTJ.EZpvd(str4, "Return cached data: " + list.size() + " items");
        return list;
    }

    private final void copydefault(java.util.List<HotRankResponse> list, PeriodEnum periodEnum, java.lang.String str) {
        java.lang.Object objM7377constructorimpl;
        C41298qoF.AEQbTJ.EZpvd("GetMarketDiscoverSpotHotPosUseCase", "Start caching period tickers: " + list.size() + " items, period=" + periodEnum + ", zone=" + str);
        int i = 0;
        int i2 = 0;
        for (HotRankResponse hotRankResponse : list) {
            try {
                Result.Application application = Result.Companion;
                PeriodTickersPo periodTickersPoEZpvd = EZpvd(this.OLrzqt.AEQbTJ(hotRankResponse.getInstId()), hotRankResponse, periodEnum, str);
                if (periodTickersPoEZpvd != null) {
                    this.OLrzqt.OLrzqt(hotRankResponse.getInstId(), periodTickersPoEZpvd);
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
                C41298qoF.AEQbTJ.AEQbTJ("GetMarketDiscoverSpotHotPosUseCase", "Failed to cache period ticker: " + hotRankResponse.getInstId(), thM7380exceptionOrNullimpl);
            }
        }
        C41298qoF.AEQbTJ.EZpvd("GetMarketDiscoverSpotHotPosUseCase", "Period tickers cached: success=" + i + ", failure=" + i2);
    }

    public final PeriodTickersPo EZpvd(PeriodTickersPo periodTickersPo, HotRankResponse hotRankResponse, PeriodEnum periodEnum, java.lang.String str) {
        if (hotRankResponse.getInstId().length() == 0 || hotRankResponse.getInstType().length() == 0) {
            return null;
        }
        PeriodTickersPo periodTickersPo2 = periodTickersPo == null ? new PeriodTickersPo(hotRankResponse.getInstId(), hotRankResponse.getInstType(), hotRankResponse.getLastPrice(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0L, 1048568, null) : periodTickersPo;
        int i = Activity.AEQbTJ[periodEnum.ordinal()];
        if (i == 1) {
            return periodTickersPo2.copy((652283 & 1) != 0 ? periodTickersPo2.instId : null, (652283 & 2) != 0 ? periodTickersPo2.instType : null, (652283 & 4) != 0 ? periodTickersPo2.price : hotRankResponse.getLastPrice(), (652283 & 8) != 0 ? periodTickersPo2.changePercent5m : hotRankResponse.getChangePerV2(), (652283 & 16) != 0 ? periodTickersPo2.changePercent1h : null, (652283 & 32) != 0 ? periodTickersPo2.changePercent24h : null, (652283 & 64) != 0 ? periodTickersPo2.changePercent1DUtc0 : null, (652283 & 128) != 0 ? periodTickersPo2.changePercent1DUtc8 : null, (652283 & 256) != 0 ? periodTickersPo2.changePercent1wUtc0 : null, (652283 & 512) != 0 ? periodTickersPo2.changePercent1wUtc8 : null, (652283 & 1024) != 0 ? periodTickersPo2.changePercent1MUtc0 : null, (652283 & 2048) != 0 ? periodTickersPo2.changePercent1MUtc8 : null, (652283 & 4096) != 0 ? periodTickersPo2.turnOver5m : hotRankResponse.getTurnOverV2(), (652283 & 8192) != 0 ? periodTickersPo2.turnOver1h : null, (652283 & 16384) != 0 ? periodTickersPo2.turnOver24h : null, (652283 & 32768) != 0 ? periodTickersPo2.turnOver1wUtc0 : null, (652283 & 65536) != 0 ? periodTickersPo2.turnOver1wUtc8 : null, (652283 & 131072) != 0 ? periodTickersPo2.turnOver1MUtc0 : null, (652283 & 262144) != 0 ? periodTickersPo2.turnOver1MUtc8 : null, (652283 & 524288) != 0 ? periodTickersPo2.timestamp : 0L);
        }
        if (i == 2) {
            return periodTickersPo2.copy((652283 & 1) != 0 ? periodTickersPo2.instId : null, (652283 & 2) != 0 ? periodTickersPo2.instType : null, (652283 & 4) != 0 ? periodTickersPo2.price : hotRankResponse.getLastPrice(), (652283 & 8) != 0 ? periodTickersPo2.changePercent5m : null, (652283 & 16) != 0 ? periodTickersPo2.changePercent1h : hotRankResponse.getChangePerV2(), (652283 & 32) != 0 ? periodTickersPo2.changePercent24h : null, (652283 & 64) != 0 ? periodTickersPo2.changePercent1DUtc0 : null, (652283 & 128) != 0 ? periodTickersPo2.changePercent1DUtc8 : null, (652283 & 256) != 0 ? periodTickersPo2.changePercent1wUtc0 : null, (652283 & 512) != 0 ? periodTickersPo2.changePercent1wUtc8 : null, (652283 & 1024) != 0 ? periodTickersPo2.changePercent1MUtc0 : null, (652283 & 2048) != 0 ? periodTickersPo2.changePercent1MUtc8 : null, (652283 & 4096) != 0 ? periodTickersPo2.turnOver5m : null, (652283 & 8192) != 0 ? periodTickersPo2.turnOver1h : hotRankResponse.getTurnOverV2(), (652283 & 16384) != 0 ? periodTickersPo2.turnOver24h : null, (652283 & 32768) != 0 ? periodTickersPo2.turnOver1wUtc0 : null, (652283 & 65536) != 0 ? periodTickersPo2.turnOver1wUtc8 : null, (652283 & 131072) != 0 ? periodTickersPo2.turnOver1MUtc0 : null, (652283 & 262144) != 0 ? periodTickersPo2.turnOver1MUtc8 : null, (652283 & 524288) != 0 ? periodTickersPo2.timestamp : 0L);
        }
        if (i == 3) {
            return periodTickersPo2.copy((652283 & 1) != 0 ? periodTickersPo2.instId : null, (652283 & 2) != 0 ? periodTickersPo2.instType : null, (652283 & 4) != 0 ? periodTickersPo2.price : hotRankResponse.getLastPrice(), (652283 & 8) != 0 ? periodTickersPo2.changePercent5m : null, (652283 & 16) != 0 ? periodTickersPo2.changePercent1h : null, (652283 & 32) != 0 ? periodTickersPo2.changePercent24h : Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "24h") ? hotRankResponse.getChangePerV2() : periodTickersPo2.getChangePercent24h(), (652283 & 64) != 0 ? periodTickersPo2.changePercent1DUtc0 : Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "utc0") ? hotRankResponse.getChangePerV2() : periodTickersPo2.getChangePercent1DUtc0(), (652283 & 128) != 0 ? periodTickersPo2.changePercent1DUtc8 : Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "utc8") ? hotRankResponse.getChangePerV2() : periodTickersPo2.getChangePercent1DUtc8(), (652283 & 256) != 0 ? periodTickersPo2.changePercent1wUtc0 : null, (652283 & 512) != 0 ? periodTickersPo2.changePercent1wUtc8 : null, (652283 & 1024) != 0 ? periodTickersPo2.changePercent1MUtc0 : null, (652283 & 2048) != 0 ? periodTickersPo2.changePercent1MUtc8 : null, (652283 & 4096) != 0 ? periodTickersPo2.turnOver5m : null, (652283 & 8192) != 0 ? periodTickersPo2.turnOver1h : null, (652283 & 16384) != 0 ? periodTickersPo2.turnOver24h : hotRankResponse.getTurnOverV2(), (652283 & 32768) != 0 ? periodTickersPo2.turnOver1wUtc0 : null, (652283 & 65536) != 0 ? periodTickersPo2.turnOver1wUtc8 : null, (652283 & 131072) != 0 ? periodTickersPo2.turnOver1MUtc0 : null, (652283 & 262144) != 0 ? periodTickersPo2.turnOver1MUtc8 : null, (652283 & 524288) != 0 ? periodTickersPo2.timestamp : 0L);
        }
        if (i == 4) {
            return periodTickersPo2.copy((652283 & 1) != 0 ? periodTickersPo2.instId : null, (652283 & 2) != 0 ? periodTickersPo2.instType : null, (652283 & 4) != 0 ? periodTickersPo2.price : hotRankResponse.getLastPrice(), (652283 & 8) != 0 ? periodTickersPo2.changePercent5m : null, (652283 & 16) != 0 ? periodTickersPo2.changePercent1h : null, (652283 & 32) != 0 ? periodTickersPo2.changePercent24h : null, (652283 & 64) != 0 ? periodTickersPo2.changePercent1DUtc0 : null, (652283 & 128) != 0 ? periodTickersPo2.changePercent1DUtc8 : null, (652283 & 256) != 0 ? periodTickersPo2.changePercent1wUtc0 : !Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "utc8") ? hotRankResponse.getChangePerV2() : periodTickersPo2.getChangePercent1wUtc0(), (652283 & 512) != 0 ? periodTickersPo2.changePercent1wUtc8 : Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "utc8") ? hotRankResponse.getChangePerV2() : periodTickersPo2.getChangePercent1wUtc8(), (652283 & 1024) != 0 ? periodTickersPo2.changePercent1MUtc0 : null, (652283 & 2048) != 0 ? periodTickersPo2.changePercent1MUtc8 : null, (652283 & 4096) != 0 ? periodTickersPo2.turnOver5m : null, (652283 & 8192) != 0 ? periodTickersPo2.turnOver1h : null, (652283 & 16384) != 0 ? periodTickersPo2.turnOver24h : null, (652283 & 32768) != 0 ? periodTickersPo2.turnOver1wUtc0 : !Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "utc8") ? hotRankResponse.getTurnOverV2() : periodTickersPo2.getTurnOver1wUtc0(), (652283 & 65536) != 0 ? periodTickersPo2.turnOver1wUtc8 : Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "utc8") ? hotRankResponse.getTurnOverV2() : periodTickersPo2.getTurnOver1wUtc8(), (652283 & 131072) != 0 ? periodTickersPo2.turnOver1MUtc0 : null, (652283 & 262144) != 0 ? periodTickersPo2.turnOver1MUtc8 : null, (652283 & 524288) != 0 ? periodTickersPo2.timestamp : 0L);
        }
        if (i != 5) {
            return periodTickersPo2;
        }
        return periodTickersPo2.copy((652283 & 1) != 0 ? periodTickersPo2.instId : null, (652283 & 2) != 0 ? periodTickersPo2.instType : null, (652283 & 4) != 0 ? periodTickersPo2.price : hotRankResponse.getLastPrice(), (652283 & 8) != 0 ? periodTickersPo2.changePercent5m : null, (652283 & 16) != 0 ? periodTickersPo2.changePercent1h : null, (652283 & 32) != 0 ? periodTickersPo2.changePercent24h : null, (652283 & 64) != 0 ? periodTickersPo2.changePercent1DUtc0 : null, (652283 & 128) != 0 ? periodTickersPo2.changePercent1DUtc8 : null, (652283 & 256) != 0 ? periodTickersPo2.changePercent1wUtc0 : null, (652283 & 512) != 0 ? periodTickersPo2.changePercent1wUtc8 : null, (652283 & 1024) != 0 ? periodTickersPo2.changePercent1MUtc0 : !Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "utc8") ? hotRankResponse.getChangePerV2() : periodTickersPo2.getChangePercent1MUtc0(), (652283 & 2048) != 0 ? periodTickersPo2.changePercent1MUtc8 : Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "utc8") ? hotRankResponse.getChangePerV2() : periodTickersPo2.getChangePercent1MUtc8(), (652283 & 4096) != 0 ? periodTickersPo2.turnOver5m : null, (652283 & 8192) != 0 ? periodTickersPo2.turnOver1h : null, (652283 & 16384) != 0 ? periodTickersPo2.turnOver24h : null, (652283 & 32768) != 0 ? periodTickersPo2.turnOver1wUtc0 : null, (652283 & 65536) != 0 ? periodTickersPo2.turnOver1wUtc8 : null, (652283 & 131072) != 0 ? periodTickersPo2.turnOver1MUtc0 : !Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "utc8") ? hotRankResponse.getTurnOverV2() : periodTickersPo2.getTurnOver1MUtc0(), (652283 & 262144) != 0 ? periodTickersPo2.turnOver1MUtc8 : Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "utc8") ? hotRankResponse.getTurnOverV2() : periodTickersPo2.getTurnOver1MUtc8(), (652283 & 524288) != 0 ? periodTickersPo2.timestamp : 0L);
    }
}
