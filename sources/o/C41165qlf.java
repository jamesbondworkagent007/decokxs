package o;

import com.okinc.market.discover.features.markets.sub.rank.futures.domain.GetMarketDiscoverFuturesUpVosUseCase$onExecute$$inlined$executeAsyncTasks$1;
import com.okinc.market.discover.features.markets.sub.rank.futures.domain.GetMarketDiscoverFuturesUpVosUseCase$onExecute$1;
import com.okinc.market.discover.features.markets.sub.rank.futures.domain.GetMarketDiscoverFuturesUpVosUseCase$onExecute$2;
import com.okinc.market.discover.features.markets.sub.rank.futures.domain.GetMarketDiscoverFuturesUpVosUseCase$onExecute$3;
import com.okinc.market.discover.features.markets.sub.rank.futures.domain.GetMarketDiscoverFuturesUpVosUseCase$onExecute$4;
import com.okinc.market.ranking.core.model.po.FuturesRankItemPo;
import kotlin.Triple;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qlf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41165qlf extends AbstractC49400uno<C41162qlc, C41467qrP> {
    public final CoroutineDispatcher EZpvd;
    public final C41166qlg copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.EZpvd;
    }

    @yCM
    public C41165qlf(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C41166qlg c41166qlg) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c41166qlg, "");
        this.EZpvd = coroutineDispatcher;
        this.copydefault = c41166qlg;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull C41162qlc c41162qlc, @NotNull Continuation<? super C41467qrP> continuation) throws java.lang.Throwable {
        GetMarketDiscoverFuturesUpVosUseCase$onExecute$1 getMarketDiscoverFuturesUpVosUseCase$onExecute$1;
        C41165qlf c41165qlf;
        C41467qrP c41467qrP;
        if (continuation instanceof GetMarketDiscoverFuturesUpVosUseCase$onExecute$1) {
            getMarketDiscoverFuturesUpVosUseCase$onExecute$1 = (GetMarketDiscoverFuturesUpVosUseCase$onExecute$1) continuation;
            int i = getMarketDiscoverFuturesUpVosUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getMarketDiscoverFuturesUpVosUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                getMarketDiscoverFuturesUpVosUseCase$onExecute$1 = new GetMarketDiscoverFuturesUpVosUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object objCoroutineScope = getMarketDiscoverFuturesUpVosUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getMarketDiscoverFuturesUpVosUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCoroutineScope);
            C41467qrP c41467qrPKWHzl = c41162qlc.KWHzl();
            C41160qla c41160qla = new C41160qla(c41162qlc.AEQbTJ(), c41162qlc.EZpvd(), c41162qlc.copydefault(), true);
            C41166qlg c41166qlg = this.copydefault;
            getMarketDiscoverFuturesUpVosUseCase$onExecute$1.L$0 = this;
            getMarketDiscoverFuturesUpVosUseCase$onExecute$1.L$1 = c41467qrPKWHzl;
            getMarketDiscoverFuturesUpVosUseCase$onExecute$1.label = 1;
            java.lang.Object objEZpvd = c41166qlg.EZpvd(c41160qla, getMarketDiscoverFuturesUpVosUseCase$onExecute$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            c41165qlf = this;
            objCoroutineScope = objEZpvd;
            c41467qrP = c41467qrPKWHzl;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c41467qrP = (C41467qrP) getMarketDiscoverFuturesUpVosUseCase$onExecute$1.L$0;
                C56391yDq.AEQbTJ(objCoroutineScope);
                Triple triple = (Triple) objCoroutineScope;
                return C41467qrP.copy$default(c41467qrP, (java.util.List) triple.component2(), (java.util.List) triple.component1(), (java.util.List) triple.component3(), null, null, 0L, 56, null);
            }
            c41467qrP = (C41467qrP) getMarketDiscoverFuturesUpVosUseCase$onExecute$1.L$1;
            c41165qlf = (C41165qlf) getMarketDiscoverFuturesUpVosUseCase$onExecute$1.L$0;
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
        GetMarketDiscoverFuturesUpVosUseCase$onExecute$$inlined$executeAsyncTasks$1 getMarketDiscoverFuturesUpVosUseCase$onExecute$$inlined$executeAsyncTasks$1 = new GetMarketDiscoverFuturesUpVosUseCase$onExecute$$inlined$executeAsyncTasks$1(new GetMarketDiscoverFuturesUpVosUseCase$onExecute$2(c41165qlf, c41467qrP, setOqFWZa, null), new GetMarketDiscoverFuturesUpVosUseCase$onExecute$3(c41165qlf, c41467qrP, setOqFWZa, null), new GetMarketDiscoverFuturesUpVosUseCase$onExecute$4(c41165qlf, c41467qrP, setOqFWZa, null), null);
        getMarketDiscoverFuturesUpVosUseCase$onExecute$1.L$0 = c41467qrP;
        getMarketDiscoverFuturesUpVosUseCase$onExecute$1.L$1 = null;
        getMarketDiscoverFuturesUpVosUseCase$onExecute$1.label = 2;
        objCoroutineScope = CoroutineScopeKt.coroutineScope(getMarketDiscoverFuturesUpVosUseCase$onExecute$$inlined$executeAsyncTasks$1, getMarketDiscoverFuturesUpVosUseCase$onExecute$1);
        if (objCoroutineScope == objCopydefault) {
            return objCopydefault;
        }
        Triple triple2 = (Triple) objCoroutineScope;
        return C41467qrP.copy$default(c41467qrP, (java.util.List) triple2.component2(), (java.util.List) triple2.component1(), (java.util.List) triple2.component3(), null, null, 0L, 56, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.util.List<InterfaceC41638qub> OLrzqt(java.util.List<? extends InterfaceC41638qub> list, java.util.Set<java.lang.String> set) {
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
