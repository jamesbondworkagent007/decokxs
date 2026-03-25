package o;

import com.okinc.market.discover.features.markets.sub.rank.futures.domain.GetMarketDiscoverFuturesHotPosUseCase$onExecute$1;
import com.okinc.market.quotation.data.model.PeriodTickersPo;
import com.okinc.market.quotation.ui.model.FuturesTypeEnum;
import com.okinc.market.quotation.ui.model.FuturesUnitVo;
import com.okinc.market.ranking.core.model.po.FuturesRankItemPo;
import com.okinc.market.time.filter.PeriodEnum;
import java.lang.ref.SoftReference;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qkW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41103qkW extends AbstractC49400uno<C41098qkR, java.util.List<? extends FuturesRankItemPo>> {
    public final ConcurrentHashMap<kotlin.Pair<FuturesTypeEnum, FuturesUnitVo>, SoftReference<java.util.List<FuturesRankItemPo>>> EZpvd;
    public final CoroutineDispatcher KWHzl;
    public final C41446qqv OLrzqt;
    public final C41662quz copydefault;
    private static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;

    /* JADX INFO: renamed from: o.qkW$ActionBar */
    public final /* synthetic */ class ActionBar {
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

    @Override // o.InterfaceC49403unr
    public /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return EZpvd((C41098qkR) obj, (Continuation<? super java.util.List<FuturesRankItemPo>>) continuation);
    }

    @yCM
    public C41103qkW(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C41662quz c41662quz, @NotNull C41446qqv c41446qqv) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c41662quz, "");
        Intrinsics.checkNotNullParameter(c41446qqv, "");
        this.KWHzl = coroutineDispatcher;
        this.copydefault = c41662quz;
        this.OLrzqt = c41446qqv;
        this.EZpvd = new ConcurrentHashMap<>();
    }

    /* JADX INFO: renamed from: o.qkW$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qkW.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull C41098qkR c41098qkR, @NotNull Continuation<? super java.util.List<FuturesRankItemPo>> continuation) throws java.lang.Throwable {
        GetMarketDiscoverFuturesHotPosUseCase$onExecute$1 getMarketDiscoverFuturesHotPosUseCase$onExecute$1;
        java.util.List<FuturesRankItemPo> listAhwBna;
        java.util.List<FuturesRankItemPo> list;
        java.lang.String str;
        kotlin.Pair<FuturesTypeEnum, FuturesUnitVo> pair;
        java.lang.String str2;
        PeriodEnum periodEnum;
        C41103qkW c41103qkW;
        java.lang.String str3;
        if (continuation instanceof GetMarketDiscoverFuturesHotPosUseCase$onExecute$1) {
            getMarketDiscoverFuturesHotPosUseCase$onExecute$1 = (GetMarketDiscoverFuturesHotPosUseCase$onExecute$1) continuation;
            int i = getMarketDiscoverFuturesHotPosUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getMarketDiscoverFuturesHotPosUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                getMarketDiscoverFuturesHotPosUseCase$onExecute$1 = new GetMarketDiscoverFuturesHotPosUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object obj = getMarketDiscoverFuturesHotPosUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getMarketDiscoverFuturesHotPosUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            FuturesTypeEnum futuresTypeEnumAEQbTJ = c41098qkR.AEQbTJ();
            FuturesUnitVo futuresUnitVoOLrzqt = c41098qkR.OLrzqt();
            PeriodEnum periodEnumEZpvd = c41098qkR.EZpvd();
            C41298qoF.AEQbTJ.EZpvd("GetMarketDiscoverFuturesHotPosUseCase", "onExecute: futuresType=" + futuresTypeEnumAEQbTJ + ", ccyType=" + futuresUnitVoOLrzqt.EZpvd() + ", period=" + periodEnumEZpvd);
            kotlin.Pair<FuturesTypeEnum, FuturesUnitVo> pairOLrzqt = C56390yDp.OLrzqt(futuresTypeEnumAEQbTJ, futuresUnitVoOLrzqt);
            SoftReference<java.util.List<FuturesRankItemPo>> softReference = this.EZpvd.get(pairOLrzqt);
            if (softReference == null || (listAhwBna = softReference.get()) == null) {
                listAhwBna = yDY.AhwBna();
            }
            java.util.List<FuturesRankItemPo> list2 = listAhwBna;
            java.lang.String strAEQbTJ = C41786qxQ.AEQbTJ("24h", "utc0", "utc8");
            C41781qxL c41781qxL = C41781qxL.OLrzqt;
            java.lang.String strEZpvd = futuresUnitVoOLrzqt.EZpvd();
            if (strEZpvd == null) {
                strEZpvd = "";
            }
            java.lang.String str4 = strEZpvd;
            list = list2;
            str = "GetMarketDiscoverFuturesHotPosUseCase";
            java.util.Map<java.lang.String, java.lang.String> mapBuildRankParams$default = C41781qxL.buildRankParams$default(c41781qxL, "hot", str4, strAEQbTJ, periodEnumEZpvd, 0, 0, 48, null);
            C41662quz c41662quz = this.copydefault;
            getMarketDiscoverFuturesHotPosUseCase$onExecute$1.L$0 = this;
            getMarketDiscoverFuturesHotPosUseCase$onExecute$1.L$1 = periodEnumEZpvd;
            getMarketDiscoverFuturesHotPosUseCase$onExecute$1.L$2 = pairOLrzqt;
            getMarketDiscoverFuturesHotPosUseCase$onExecute$1.L$3 = list;
            getMarketDiscoverFuturesHotPosUseCase$onExecute$1.L$4 = strAEQbTJ;
            getMarketDiscoverFuturesHotPosUseCase$onExecute$1.label = 1;
            java.lang.Object objCopydefault2 = c41662quz.copydefault(mapBuildRankParams$default, getMarketDiscoverFuturesHotPosUseCase$onExecute$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            pair = pairOLrzqt;
            obj = objCopydefault2;
            str2 = strAEQbTJ;
            periodEnum = periodEnumEZpvd;
            c41103qkW = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = (java.lang.String) getMarketDiscoverFuturesHotPosUseCase$onExecute$1.L$4;
            list = (java.util.List) getMarketDiscoverFuturesHotPosUseCase$onExecute$1.L$3;
            pair = (kotlin.Pair) getMarketDiscoverFuturesHotPosUseCase$onExecute$1.L$2;
            periodEnum = (PeriodEnum) getMarketDiscoverFuturesHotPosUseCase$onExecute$1.L$1;
            c41103qkW = (C41103qkW) getMarketDiscoverFuturesHotPosUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(obj);
            str = "GetMarketDiscoverFuturesHotPosUseCase";
        }
        java.util.List<FuturesRankItemPo> list3 = (java.util.List) obj;
        if (C33129mqd.KWHzl((java.util.Collection) list3)) {
            C41298qoF c41298qoF = C41298qoF.AEQbTJ;
            str3 = str;
            c41298qoF.EZpvd(str3, "HTTP response received: " + (list3 != null ? C56443yFo.AEQbTJ(list3.size()) : null) + " items");
            c41103qkW.EZpvd.put(pair, new SoftReference<>(list3));
            if (C27563jxZ.OLrzqt.AhwBna()) {
                c41103qkW.AEQbTJ(list3 == null ? yDY.AhwBna() : list3, periodEnum, str2);
            }
        } else {
            str3 = str;
            C41298qoF.w$default(C41298qoF.AEQbTJ, "GetMarketDiscoverFuturesHotPosUseCase", "HTTP response is empty or null", null, 4, null);
        }
        if (list3 == null || !list3.isEmpty()) {
            return list3;
        }
        C41298qoF.AEQbTJ.EZpvd(str3, "Return cached data: " + list.size() + " items");
        return list;
    }

    public final void AEQbTJ(java.util.List<FuturesRankItemPo> list, PeriodEnum periodEnum, java.lang.String str) {
        java.lang.Object objM7377constructorimpl;
        C41298qoF.AEQbTJ.EZpvd("GetMarketDiscoverFuturesHotPosUseCase", "Start caching period tickers: " + list.size() + " items, period=" + periodEnum + ", zone=" + str);
        int i = 0;
        int i2 = 0;
        for (FuturesRankItemPo futuresRankItemPo : list) {
            try {
                Result.Application application = Result.Companion;
                PeriodTickersPo periodTickersPoOLrzqt = OLrzqt(this.OLrzqt.AEQbTJ(futuresRankItemPo.getInstId()), futuresRankItemPo, periodEnum, str);
                if (periodTickersPoOLrzqt != null) {
                    this.OLrzqt.OLrzqt(futuresRankItemPo.getInstId(), periodTickersPoOLrzqt);
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
                C41298qoF.AEQbTJ.AEQbTJ("GetMarketDiscoverFuturesHotPosUseCase", "Failed to cache period ticker: " + futuresRankItemPo.getInstId(), thM7380exceptionOrNullimpl);
            }
        }
        C41298qoF.AEQbTJ.EZpvd("GetMarketDiscoverFuturesHotPosUseCase", "Period tickers cached: success=" + i + ", failure=" + i2);
    }

    public final PeriodTickersPo OLrzqt(PeriodTickersPo periodTickersPo, FuturesRankItemPo futuresRankItemPo, PeriodEnum periodEnum, java.lang.String str) {
        if (futuresRankItemPo.getInstId().length() == 0 || futuresRankItemPo.getInstType().length() == 0) {
            return null;
        }
        PeriodTickersPo periodTickersPo2 = periodTickersPo == null ? new PeriodTickersPo(futuresRankItemPo.getInstId(), futuresRankItemPo.getInstType(), futuresRankItemPo.getLastPrice(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0L, 1048568, null) : periodTickersPo;
        int i = ActionBar.OLrzqt[periodEnum.ordinal()];
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
            throw new NoWhenBranchMatchedException();
        }
        return periodTickersPo2.copy((652283 & 1) != 0 ? periodTickersPo2.instId : null, (652283 & 2) != 0 ? periodTickersPo2.instType : null, (652283 & 4) != 0 ? periodTickersPo2.price : futuresRankItemPo.getLastPrice(), (652283 & 8) != 0 ? periodTickersPo2.changePercent5m : null, (652283 & 16) != 0 ? periodTickersPo2.changePercent1h : null, (652283 & 32) != 0 ? periodTickersPo2.changePercent24h : null, (652283 & 64) != 0 ? periodTickersPo2.changePercent1DUtc0 : null, (652283 & 128) != 0 ? periodTickersPo2.changePercent1DUtc8 : null, (652283 & 256) != 0 ? periodTickersPo2.changePercent1wUtc0 : null, (652283 & 512) != 0 ? periodTickersPo2.changePercent1wUtc8 : null, (652283 & 1024) != 0 ? periodTickersPo2.changePercent1MUtc0 : !Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "utc8") ? futuresRankItemPo.getChangePer() : periodTickersPo2.getChangePercent1MUtc0(), (652283 & 2048) != 0 ? periodTickersPo2.changePercent1MUtc8 : Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "utc8") ? futuresRankItemPo.getChangePer() : periodTickersPo2.getChangePercent1MUtc8(), (652283 & 4096) != 0 ? periodTickersPo2.turnOver5m : null, (652283 & 8192) != 0 ? periodTickersPo2.turnOver1h : null, (652283 & 16384) != 0 ? periodTickersPo2.turnOver24h : null, (652283 & 32768) != 0 ? periodTickersPo2.turnOver1wUtc0 : null, (652283 & 65536) != 0 ? periodTickersPo2.turnOver1wUtc8 : null, (652283 & 131072) != 0 ? periodTickersPo2.turnOver1MUtc0 : !Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "utc8") ? futuresRankItemPo.getTurnOver() : periodTickersPo2.getTurnOver1MUtc0(), (652283 & 262144) != 0 ? periodTickersPo2.turnOver1MUtc8 : Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "utc8") ? futuresRankItemPo.getTurnOver() : periodTickersPo2.getTurnOver1MUtc8(), (652283 & 524288) != 0 ? periodTickersPo2.timestamp : 0L);
    }
}
