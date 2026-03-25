package o;

import com.okinc.market.ticker.repo.CupTickersRepository;
import com.okinc.market.ticker.repo.PairTickersRepository;
import com.okinc.market.ticker.usecase.SubscribeWsTickersUseCase$onExecute$$inlined$executeAsyncTasks$1;
import com.okinc.market.ticker.usecase.SubscribeWsTickersUseCase$onExecute$1;
import com.okinc.market.ticker.usecase.SubscribeWsTickersUseCase$subscribeCupTickers$1;
import com.okinc.market.ticker.usecase.SubscribeWsTickersUseCase$subscribePairTickers$1;
import com.okinc.market.ticker.usecase.SubscribeWsTickersUseCase$subscribePairTickers$tasks$1$1;
import com.okinc.market.ticker.usecase.SubscribeWsTickersUseCase$subscribePairTickers$tasks$1$2;
import com.okinc.market.ticker.usecase.SubscribeWsTickersUseCase$subscribePairTickers$tasks$1$3;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qVl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40427qVl extends AbstractC49400uno<C40426qVk, Flow<? extends java.util.Map<java.lang.String, ? extends TickersData>>> {
    public final PairTickersRepository KWHzl;
    public final CupTickersRepository OLrzqt;
    public final CoroutineDispatcher copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.copydefault;
    }

    @Override // o.InterfaceC49403unr
    public /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return copydefault((C40426qVk) obj, (Continuation<? super Flow<? extends java.util.Map<java.lang.String, TickersData>>>) continuation);
    }

    @yCM
    public C40427qVl(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull PairTickersRepository pairTickersRepository, @NotNull CupTickersRepository cupTickersRepository) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(pairTickersRepository, "");
        Intrinsics.checkNotNullParameter(cupTickersRepository, "");
        this.copydefault = coroutineDispatcher;
        this.KWHzl = pairTickersRepository;
        this.OLrzqt = cupTickersRepository;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r13v8, resolved type: kotlinx.coroutines.flow.Flow[] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull C40426qVk c40426qVk, @NotNull Continuation<? super Flow<? extends java.util.Map<java.lang.String, TickersData>>> continuation) throws java.lang.Throwable {
        SubscribeWsTickersUseCase$onExecute$1 subscribeWsTickersUseCase$onExecute$1;
        if (continuation instanceof SubscribeWsTickersUseCase$onExecute$1) {
            subscribeWsTickersUseCase$onExecute$1 = (SubscribeWsTickersUseCase$onExecute$1) continuation;
            int i = subscribeWsTickersUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                subscribeWsTickersUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                subscribeWsTickersUseCase$onExecute$1 = new SubscribeWsTickersUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = subscribeWsTickersUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = subscribeWsTickersUseCase$onExecute$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objOLrzqt);
                kotlin.Pair pair = (kotlin.Pair) objOLrzqt;
                return FlowKt.merge(pair.getFirst(), pair.getSecond());
            }
            if (i2 == 2) {
                C56391yDq.AEQbTJ(objOLrzqt);
            }
            if (i2 == 3) {
                C56391yDq.AEQbTJ(objOLrzqt);
            }
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(objOLrzqt);
        java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> mapAEQbTJ = c40426qVk.AEQbTJ();
        java.util.List<java.lang.String> listCopydefault = c40426qVk.copydefault();
        if (mapAEQbTJ == null && listCopydefault == null) {
            return FlowKt.emptyFlow();
        }
        if (mapAEQbTJ == null || mapAEQbTJ.isEmpty() || listCopydefault == null || listCopydefault.isEmpty()) {
            if (mapAEQbTJ != null && !mapAEQbTJ.isEmpty()) {
                subscribeWsTickersUseCase$onExecute$1.label = 2;
                objOLrzqt = copydefault(mapAEQbTJ, subscribeWsTickersUseCase$onExecute$1);
                return objOLrzqt == objCopydefault ? objCopydefault : objOLrzqt;
            }
            if (listCopydefault != null && !listCopydefault.isEmpty()) {
                subscribeWsTickersUseCase$onExecute$1.label = 3;
                objOLrzqt = OLrzqt(listCopydefault, subscribeWsTickersUseCase$onExecute$1);
                return objOLrzqt == objCopydefault ? objCopydefault : objOLrzqt;
            }
            return FlowKt.emptyFlow();
        }
        SubscribeWsTickersUseCase$onExecute$$inlined$executeAsyncTasks$1 subscribeWsTickersUseCase$onExecute$$inlined$executeAsyncTasks$1 = new SubscribeWsTickersUseCase$onExecute$$inlined$executeAsyncTasks$1(null, this, mapAEQbTJ, this, listCopydefault);
        subscribeWsTickersUseCase$onExecute$1.label = 1;
        objOLrzqt = CoroutineScopeKt.coroutineScope(subscribeWsTickersUseCase$onExecute$$inlined$executeAsyncTasks$1, subscribeWsTickersUseCase$onExecute$1);
        if (objOLrzqt == objCopydefault) {
            return objCopydefault;
        }
        kotlin.Pair pair2 = (kotlin.Pair) objOLrzqt;
        return FlowKt.merge(pair2.getFirst(), pair2.getSecond());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> map, Continuation<? super Flow<? extends java.util.Map<java.lang.String, TickersData>>> continuation) throws java.lang.Throwable {
        SubscribeWsTickersUseCase$subscribePairTickers$1 subscribeWsTickersUseCase$subscribePairTickers$1;
        ContinuationImpl subscribeWsTickersUseCase$subscribePairTickers$tasks$1$3;
        if (continuation instanceof SubscribeWsTickersUseCase$subscribePairTickers$1) {
            subscribeWsTickersUseCase$subscribePairTickers$1 = (SubscribeWsTickersUseCase$subscribePairTickers$1) continuation;
            int i = subscribeWsTickersUseCase$subscribePairTickers$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                subscribeWsTickersUseCase$subscribePairTickers$1.label = i - Integer.MIN_VALUE;
            } else {
                subscribeWsTickersUseCase$subscribePairTickers$1 = new SubscribeWsTickersUseCase$subscribePairTickers$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = subscribeWsTickersUseCase$subscribePairTickers$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = subscribeWsTickersUseCase$subscribePairTickers$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objAEQbTJ);
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objAEQbTJ);
            Flow[] flowArr = (Flow[]) ((java.util.Collection) objAEQbTJ).toArray(new Flow[0]);
            return FlowKt.merge((Flow[]) java.util.Arrays.copyOf(flowArr, flowArr.length));
        }
        C56391yDq.AEQbTJ(objAEQbTJ);
        qTL.copydefault.AEQbTJ("SubscribeWsTickersUseCase", "subscribePairTickers: " + map.size());
        if ((map.isEmpty() ^ true ? map : null) == null) {
            return FlowKt.flowOf(C56424yEw.KWHzl());
        }
        java.util.List<java.lang.String> listQOLQEE = C56403yEb.QOLQEE(map.values());
        if (listQOLQEE.size() < 50) {
            PairTickersRepository pairTickersRepository = this.KWHzl;
            subscribeWsTickersUseCase$subscribePairTickers$1.label = 1;
            objAEQbTJ = pairTickersRepository.copydefault(listQOLQEE, subscribeWsTickersUseCase$subscribePairTickers$1);
            return objAEQbTJ == objCopydefault ? objCopydefault : objAEQbTJ;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(map.size());
        for (Map.Entry<java.lang.String, ? extends java.util.List<java.lang.String>> entry : map.entrySet()) {
            java.lang.String key = entry.getKey();
            java.util.List<java.lang.String> value = entry.getValue();
            if (value.isEmpty()) {
                subscribeWsTickersUseCase$subscribePairTickers$tasks$1$3 = new SubscribeWsTickersUseCase$subscribePairTickers$tasks$1$1(this, key, null);
            } else if (value.size() < 50) {
                subscribeWsTickersUseCase$subscribePairTickers$tasks$1$3 = new SubscribeWsTickersUseCase$subscribePairTickers$tasks$1$2(this, value, null);
            } else {
                subscribeWsTickersUseCase$subscribePairTickers$tasks$1$3 = new SubscribeWsTickersUseCase$subscribePairTickers$tasks$1$3(this, key, null);
            }
            arrayList.add(subscribeWsTickersUseCase$subscribePairTickers$tasks$1$3);
        }
        subscribeWsTickersUseCase$subscribePairTickers$1.label = 2;
        objAEQbTJ = C41347qpB.AEQbTJ(arrayList, subscribeWsTickersUseCase$subscribePairTickers$1);
        if (objAEQbTJ == objCopydefault) {
            return objCopydefault;
        }
        Flow[] flowArr2 = (Flow[]) ((java.util.Collection) objAEQbTJ).toArray(new Flow[0]);
        return FlowKt.merge((Flow[]) java.util.Arrays.copyOf(flowArr2, flowArr2.length));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(java.util.List<java.lang.String> list, Continuation<? super Flow<? extends java.util.Map<java.lang.String, TickersData>>> continuation) throws java.lang.Throwable {
        SubscribeWsTickersUseCase$subscribeCupTickers$1 subscribeWsTickersUseCase$subscribeCupTickers$1;
        if (continuation instanceof SubscribeWsTickersUseCase$subscribeCupTickers$1) {
            subscribeWsTickersUseCase$subscribeCupTickers$1 = (SubscribeWsTickersUseCase$subscribeCupTickers$1) continuation;
            int i = subscribeWsTickersUseCase$subscribeCupTickers$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                subscribeWsTickersUseCase$subscribeCupTickers$1.label = i - Integer.MIN_VALUE;
            } else {
                subscribeWsTickersUseCase$subscribeCupTickers$1 = new SubscribeWsTickersUseCase$subscribeCupTickers$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = subscribeWsTickersUseCase$subscribeCupTickers$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = subscribeWsTickersUseCase$subscribeCupTickers$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            qTL.copydefault.AEQbTJ("SubscribeWsTickersUseCase", "subscribeCupTickers: " + list.size());
            if ((list.isEmpty() ^ true ? list : null) == null) {
                return FlowKt.flowOf(C56424yEw.KWHzl());
            }
            CupTickersRepository cupTickersRepository = this.OLrzqt;
            subscribeWsTickersUseCase$subscribeCupTickers$1.label = 1;
            objAEQbTJ = cupTickersRepository.AEQbTJ(list, subscribeWsTickersUseCase$subscribeCupTickers$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objAEQbTJ);
        }
        return (Flow) objAEQbTJ;
    }
}
