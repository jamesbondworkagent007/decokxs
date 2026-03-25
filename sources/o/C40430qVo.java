package o;

import com.okinc.market.ticker.repo.CupTickersRepository;
import com.okinc.market.ticker.repo.PairTickersRepository;
import com.okinc.market.ticker.usecase.GetHttpTickersUseCase$onExecute$$inlined$executeAsyncTasks$1;
import com.okinc.market.ticker.usecase.GetHttpTickersUseCase$onExecute$1;
import com.okinc.market.ticker.usecase.GetHttpTickersUseCase$requestPairTickers$1;
import com.okinc.market.ticker.usecase.GetHttpTickersUseCase$requestPairTickers$tasks$1$1;
import com.okinc.market.ticker.usecase.GetHttpTickersUseCase$requestPairTickers$tasks$1$2;
import com.okinc.market.ticker.usecase.GetHttpTickersUseCase$requestPairTickers$tasks$1$3;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qVo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40430qVo extends AbstractC49400uno<C40429qVn, java.util.Map<java.lang.String, ? extends TickersData>> {
    private static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public final CupTickersRepository KWHzl;
    public final CoroutineDispatcher OLrzqt;
    public final PairTickersRepository copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.OLrzqt;
    }

    @Override // o.InterfaceC49403unr
    public /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return copydefault((C40429qVn) obj, (Continuation<? super java.util.Map<java.lang.String, TickersData>>) continuation);
    }

    @yCM
    public C40430qVo(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull PairTickersRepository pairTickersRepository, @NotNull CupTickersRepository cupTickersRepository) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(pairTickersRepository, "");
        Intrinsics.checkNotNullParameter(cupTickersRepository, "");
        this.OLrzqt = coroutineDispatcher;
        this.copydefault = pairTickersRepository;
        this.KWHzl = cupTickersRepository;
    }

    /* JADX INFO: renamed from: o.qVo$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qVo.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull C40429qVn c40429qVn, @NotNull Continuation<? super java.util.Map<java.lang.String, TickersData>> continuation) throws java.lang.Throwable {
        GetHttpTickersUseCase$onExecute$1 getHttpTickersUseCase$onExecute$1;
        java.util.Map mapKWHzl;
        if (continuation instanceof GetHttpTickersUseCase$onExecute$1) {
            getHttpTickersUseCase$onExecute$1 = (GetHttpTickersUseCase$onExecute$1) continuation;
            int i = getHttpTickersUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getHttpTickersUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                getHttpTickersUseCase$onExecute$1 = new GetHttpTickersUseCase$onExecute$1(this, continuation);
            }
        }
        GetHttpTickersUseCase$onExecute$1 getHttpTickersUseCase$onExecute$12 = getHttpTickersUseCase$onExecute$1;
        java.lang.Object objCopydefault = getHttpTickersUseCase$onExecute$12.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = getHttpTickersUseCase$onExecute$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> mapKWHzl2 = c40429qVn.KWHzl();
            java.util.List<java.lang.String> listCopydefault = c40429qVn.copydefault();
            qTL qtl = qTL.copydefault;
            java.util.Set<java.lang.String> setKeySet = mapKWHzl2 != null ? mapKWHzl2.keySet() : null;
            java.lang.Integer numAEQbTJ = listCopydefault != null ? C56443yFo.AEQbTJ(listCopydefault.size()) : null;
            qtl.AEQbTJ("GetHttpTickersUseCase", "Starting HTTP tickers request - instTypes: " + setKeySet + ", ccyCount: " + numAEQbTJ + ", requestAllCcy: " + c40429qVn.OLrzqt());
            if (mapKWHzl2 == null && listCopydefault == null) {
                qTL.w$default(qtl, "GetHttpTickersUseCase", "Both instIdMap and ccyList are null, returning empty result", null, 4, null);
                return C56424yEw.KWHzl();
            }
            if (mapKWHzl2 != null && !mapKWHzl2.isEmpty() && listCopydefault != null && !listCopydefault.isEmpty()) {
                qtl.AEQbTJ("GetHttpTickersUseCase", "Executing parallel requests for both pair and cup tickers");
                GetHttpTickersUseCase$onExecute$$inlined$executeAsyncTasks$1 getHttpTickersUseCase$onExecute$$inlined$executeAsyncTasks$1 = new GetHttpTickersUseCase$onExecute$$inlined$executeAsyncTasks$1(null, this, mapKWHzl2, this, listCopydefault);
                getHttpTickersUseCase$onExecute$12.label = 1;
                objCopydefault = CoroutineScopeKt.coroutineScope(getHttpTickersUseCase$onExecute$$inlined$executeAsyncTasks$1, getHttpTickersUseCase$onExecute$12);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
                kotlin.Pair pair = (kotlin.Pair) objCopydefault;
                mapKWHzl = C56424yEw.OLrzqt((java.util.Map) pair.getFirst(), (java.util.Map) pair.getSecond());
            } else if (mapKWHzl2 != null && !mapKWHzl2.isEmpty()) {
                qtl.AEQbTJ("GetHttpTickersUseCase", "Requesting pair tickers only");
                getHttpTickersUseCase$onExecute$12.label = 2;
                objCopydefault = OLrzqt(mapKWHzl2, getHttpTickersUseCase$onExecute$12);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
                mapKWHzl = (java.util.Map) objCopydefault;
            } else if (listCopydefault != null && !listCopydefault.isEmpty()) {
                qtl.AEQbTJ("GetHttpTickersUseCase", "Requesting cup tickers only");
                getHttpTickersUseCase$onExecute$12.label = 3;
                objCopydefault = copydefault(listCopydefault, getHttpTickersUseCase$onExecute$12);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
                mapKWHzl = (java.util.Map) objCopydefault;
            } else if ((listCopydefault == null || listCopydefault.isEmpty()) && c40429qVn.OLrzqt()) {
                qtl.AEQbTJ("GetHttpTickersUseCase", "Requesting all cup tickers");
                java.util.List<java.lang.String> listAhwBna = yDY.AhwBna();
                getHttpTickersUseCase$onExecute$12.label = 4;
                objCopydefault = copydefault(listAhwBna, getHttpTickersUseCase$onExecute$12);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
                mapKWHzl = (java.util.Map) objCopydefault;
            } else {
                qTL.w$default(qtl, "GetHttpTickersUseCase", "Illegal payload in release mode, returning empty result: " + c40429qVn, null, 4, null);
                mapKWHzl = C56424yEw.KWHzl();
            }
        } else if (i2 == 1) {
            C56391yDq.AEQbTJ(objCopydefault);
            kotlin.Pair pair2 = (kotlin.Pair) objCopydefault;
            mapKWHzl = C56424yEw.OLrzqt((java.util.Map) pair2.getFirst(), (java.util.Map) pair2.getSecond());
        } else if (i2 == 2) {
            C56391yDq.AEQbTJ(objCopydefault);
            mapKWHzl = (java.util.Map) objCopydefault;
        } else if (i2 == 3) {
            C56391yDq.AEQbTJ(objCopydefault);
            mapKWHzl = (java.util.Map) objCopydefault;
        } else {
            if (i2 != 4) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objCopydefault);
            mapKWHzl = (java.util.Map) objCopydefault;
        }
        qTL.copydefault.AEQbTJ("GetHttpTickersUseCase", "HTTP tickers request completed - result size: " + mapKWHzl.size());
        return mapKWHzl;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.market.ticker.repo.PairTickersRepository.getHttpBatchPairTickers$OKMarket_market_common_impl$default(com.okinc.market.ticker.repo.PairTickersRepository, boolean, java.util.List, kotlin.coroutines.Continuation, int, java.lang.Object):java.lang.Object */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> map, Continuation<? super java.util.Map<java.lang.String, TickersData>> continuation) throws java.lang.Throwable {
        GetHttpTickersUseCase$requestPairTickers$1 getHttpTickersUseCase$requestPairTickers$1;
        ContinuationImpl getHttpTickersUseCase$requestPairTickers$tasks$1$3;
        if (continuation instanceof GetHttpTickersUseCase$requestPairTickers$1) {
            getHttpTickersUseCase$requestPairTickers$1 = (GetHttpTickersUseCase$requestPairTickers$1) continuation;
            int i = getHttpTickersUseCase$requestPairTickers$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getHttpTickersUseCase$requestPairTickers$1.label = i - Integer.MIN_VALUE;
            } else {
                getHttpTickersUseCase$requestPairTickers$1 = new GetHttpTickersUseCase$requestPairTickers$1(this, continuation);
            }
        }
        GetHttpTickersUseCase$requestPairTickers$1 getHttpTickersUseCase$requestPairTickers$12 = getHttpTickersUseCase$requestPairTickers$1;
        java.lang.Object objAEQbTJ = getHttpTickersUseCase$requestPairTickers$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getHttpTickersUseCase$requestPairTickers$12.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objAEQbTJ);
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objAEQbTJ);
            return C41389qpr.AEQbTJ((java.util.List) objAEQbTJ);
        }
        C56391yDq.AEQbTJ(objAEQbTJ);
        if (map.isEmpty()) {
            qTL.w$default(qTL.copydefault, "GetHttpTickersUseCase", "InstIdMap is empty, returning empty result", null, 4, null);
            return C56424yEw.KWHzl();
        }
        java.util.List listQOLQEE = C56403yEb.QOLQEE(map.values());
        qTL qtl = qTL.copydefault;
        qtl.AEQbTJ("GetHttpTickersUseCase", "Requesting pair tickers - total instIds: " + listQOLQEE.size() + ", instTypes: " + map.keySet());
        if (listQOLQEE.size() < 50) {
            qtl.AEQbTJ("GetHttpTickersUseCase", "Using batch request for " + listQOLQEE.size() + " instIds");
            PairTickersRepository pairTickersRepository = this.copydefault;
            getHttpTickersUseCase$requestPairTickers$12.label = 1;
            objAEQbTJ = PairTickersRepository.getHttpBatchPairTickers$OKMarket_market_common_impl$default(pairTickersRepository, false, listQOLQEE, getHttpTickersUseCase$requestPairTickers$12, 1, null);
            return objAEQbTJ == objCopydefault ? objCopydefault : objAEQbTJ;
        }
        qtl.AEQbTJ("GetHttpTickersUseCase", "InstId count exceeds batch limit, splitting into multiple requests");
        java.util.ArrayList arrayList = new java.util.ArrayList(map.size());
        for (Map.Entry<java.lang.String, ? extends java.util.List<java.lang.String>> entry : map.entrySet()) {
            java.lang.String key = entry.getKey();
            java.util.List<java.lang.String> value = entry.getValue();
            if (value.isEmpty()) {
                qTL.copydefault.AEQbTJ("GetHttpTickersUseCase", "Requesting all pair tickers for instType: " + key);
                getHttpTickersUseCase$requestPairTickers$tasks$1$3 = new GetHttpTickersUseCase$requestPairTickers$tasks$1$1(this, key, null);
            } else if (value.size() < 50) {
                qTL.copydefault.AEQbTJ("GetHttpTickersUseCase", "Batch request for instType: " + key + ", count: " + value.size());
                getHttpTickersUseCase$requestPairTickers$tasks$1$3 = new GetHttpTickersUseCase$requestPairTickers$tasks$1$2(this, value, null);
            } else {
                qTL.copydefault.AEQbTJ("GetHttpTickersUseCase", "Count exceeds limit for instType: " + key + ", requesting all");
                getHttpTickersUseCase$requestPairTickers$tasks$1$3 = new GetHttpTickersUseCase$requestPairTickers$tasks$1$3(this, key, null);
            }
            arrayList.add(getHttpTickersUseCase$requestPairTickers$tasks$1$3);
        }
        getHttpTickersUseCase$requestPairTickers$12.label = 2;
        objAEQbTJ = C41347qpB.AEQbTJ(arrayList, getHttpTickersUseCase$requestPairTickers$12);
        if (objAEQbTJ == objCopydefault) {
            return objCopydefault;
        }
        return C41389qpr.AEQbTJ((java.util.List) objAEQbTJ);
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.market.ticker.repo.CupTickersRepository.getHttpBatchCupTickers$OKMarket_market_common_impl$default(com.okinc.market.ticker.repo.CupTickersRepository, boolean, java.util.List, kotlin.coroutines.Continuation, int, java.lang.Object):java.lang.Object */
    public final java.lang.Object copydefault(java.util.List<java.lang.String> list, Continuation<? super java.util.Map<java.lang.String, TickersData>> continuation) {
        qTL qtl = qTL.copydefault;
        qtl.AEQbTJ("GetHttpTickersUseCase", "Requesting cup tickers - ccyCount: " + list.size());
        if (list.size() > 50 || list.isEmpty()) {
            qtl.AEQbTJ("GetHttpTickersUseCase", "Using request all cup tickers (count: " + list.size() + ")");
            return CupTickersRepository.getHttpAllCupTickers$OKMarket_market_common_impl$default(this.KWHzl, false, continuation, 1, null);
        }
        qtl.AEQbTJ("GetHttpTickersUseCase", "Using batch request for " + list.size() + " currencies");
        return CupTickersRepository.getHttpBatchCupTickers$OKMarket_market_common_impl$default(this.KWHzl, false, list, continuation, 1, null);
    }
}
