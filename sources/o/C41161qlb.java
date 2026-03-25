package o;

import com.okinc.market.discover.features.markets.sub.rank.futures.domain.GetMarketDiscoverFuturesTurnoverVosUseCase$onExecute$$inlined$executeAsyncTasks$1;
import com.okinc.market.discover.features.markets.sub.rank.futures.domain.GetMarketDiscoverFuturesTurnoverVosUseCase$onExecute$1;
import com.okinc.market.discover.features.markets.sub.rank.futures.domain.GetMarketDiscoverFuturesTurnoverVosUseCase$onExecute$2;
import com.okinc.market.discover.features.markets.sub.rank.futures.domain.GetMarketDiscoverFuturesTurnoverVosUseCase$onExecute$3;
import com.okinc.market.discover.features.markets.sub.rank.futures.domain.GetMarketDiscoverFuturesTurnoverVosUseCase$onExecute$4;
import com.okinc.market.ranking.core.model.po.FuturesRankItemPo;
import kotlin.Triple;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qlb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41161qlb extends AbstractC49400uno<C41106qkZ, C41467qrP> {
    public final C41104qkX AEQbTJ;
    public final CoroutineDispatcher copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.copydefault;
    }

    @yCM
    public C41161qlb(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C41104qkX c41104qkX) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c41104qkX, "");
        this.copydefault = coroutineDispatcher;
        this.AEQbTJ = c41104qkX;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull C41106qkZ c41106qkZ, @NotNull Continuation<? super C41467qrP> continuation) throws java.lang.Throwable {
        GetMarketDiscoverFuturesTurnoverVosUseCase$onExecute$1 getMarketDiscoverFuturesTurnoverVosUseCase$onExecute$1;
        C41161qlb c41161qlb;
        C41467qrP c41467qrP;
        if (continuation instanceof GetMarketDiscoverFuturesTurnoverVosUseCase$onExecute$1) {
            getMarketDiscoverFuturesTurnoverVosUseCase$onExecute$1 = (GetMarketDiscoverFuturesTurnoverVosUseCase$onExecute$1) continuation;
            int i = getMarketDiscoverFuturesTurnoverVosUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getMarketDiscoverFuturesTurnoverVosUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                getMarketDiscoverFuturesTurnoverVosUseCase$onExecute$1 = new GetMarketDiscoverFuturesTurnoverVosUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object objCoroutineScope = getMarketDiscoverFuturesTurnoverVosUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getMarketDiscoverFuturesTurnoverVosUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCoroutineScope);
            C41467qrP c41467qrPOLrzqt = c41106qkZ.OLrzqt();
            C41105qkY c41105qkY = new C41105qkY(c41106qkZ.KWHzl(), c41106qkZ.AEQbTJ(), c41106qkZ.copydefault());
            C41104qkX c41104qkX = this.AEQbTJ;
            getMarketDiscoverFuturesTurnoverVosUseCase$onExecute$1.L$0 = this;
            getMarketDiscoverFuturesTurnoverVosUseCase$onExecute$1.L$1 = c41467qrPOLrzqt;
            getMarketDiscoverFuturesTurnoverVosUseCase$onExecute$1.label = 1;
            java.lang.Object objEZpvd = c41104qkX.EZpvd(c41105qkY, getMarketDiscoverFuturesTurnoverVosUseCase$onExecute$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            c41161qlb = this;
            objCoroutineScope = objEZpvd;
            c41467qrP = c41467qrPOLrzqt;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c41467qrP = (C41467qrP) getMarketDiscoverFuturesTurnoverVosUseCase$onExecute$1.L$0;
                C56391yDq.AEQbTJ(objCoroutineScope);
                Triple triple = (Triple) objCoroutineScope;
                return C41467qrP.copy$default(c41467qrP, (java.util.List) triple.component2(), (java.util.List) triple.component1(), (java.util.List) triple.component3(), null, null, 0L, 56, null);
            }
            c41467qrP = (C41467qrP) getMarketDiscoverFuturesTurnoverVosUseCase$onExecute$1.L$1;
            c41161qlb = (C41161qlb) getMarketDiscoverFuturesTurnoverVosUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(objCoroutineScope);
        }
        java.util.List list = (java.util.List) objCoroutineScope;
        if (list == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((FuturesRankItemPo) it.next()).getInstId());
        }
        java.util.Set setOqFWZa = CollectionsKt___CollectionsKt.OqFWZa(arrayList);
        GetMarketDiscoverFuturesTurnoverVosUseCase$onExecute$$inlined$executeAsyncTasks$1 getMarketDiscoverFuturesTurnoverVosUseCase$onExecute$$inlined$executeAsyncTasks$1 = new GetMarketDiscoverFuturesTurnoverVosUseCase$onExecute$$inlined$executeAsyncTasks$1(new GetMarketDiscoverFuturesTurnoverVosUseCase$onExecute$2(c41161qlb, c41467qrP, setOqFWZa, null), new GetMarketDiscoverFuturesTurnoverVosUseCase$onExecute$3(c41161qlb, c41467qrP, setOqFWZa, null), new GetMarketDiscoverFuturesTurnoverVosUseCase$onExecute$4(c41161qlb, c41467qrP, setOqFWZa, null), null);
        getMarketDiscoverFuturesTurnoverVosUseCase$onExecute$1.L$0 = c41467qrP;
        getMarketDiscoverFuturesTurnoverVosUseCase$onExecute$1.L$1 = null;
        getMarketDiscoverFuturesTurnoverVosUseCase$onExecute$1.label = 2;
        objCoroutineScope = CoroutineScopeKt.coroutineScope(getMarketDiscoverFuturesTurnoverVosUseCase$onExecute$$inlined$executeAsyncTasks$1, getMarketDiscoverFuturesTurnoverVosUseCase$onExecute$1);
        if (objCoroutineScope == objCopydefault) {
            return objCopydefault;
        }
        Triple triple2 = (Triple) objCoroutineScope;
        return C41467qrP.copy$default(c41467qrP, (java.util.List) triple2.component2(), (java.util.List) triple2.component1(), (java.util.List) triple2.component3(), null, null, 0L, 56, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.util.List<InterfaceC41638qub> copydefault(java.util.List<? extends InterfaceC41638qub> list, java.util.Set<java.lang.String> set) {
        if (list == null || list.isEmpty()) {
            return yDY.AhwBna();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (set.contains(((InterfaceC41638qub) obj).values().getInstId())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
