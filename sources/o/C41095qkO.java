package o;

import com.okinc.market.discover.features.markets.sub.rank.futures.domain.GetMarketDiscoverFuturesDownVosUseCase$onExecute$$inlined$executeAsyncTasks$1;
import com.okinc.market.discover.features.markets.sub.rank.futures.domain.GetMarketDiscoverFuturesDownVosUseCase$onExecute$1;
import com.okinc.market.discover.features.markets.sub.rank.futures.domain.GetMarketDiscoverFuturesDownVosUseCase$onExecute$2;
import com.okinc.market.discover.features.markets.sub.rank.futures.domain.GetMarketDiscoverFuturesDownVosUseCase$onExecute$3;
import com.okinc.market.discover.features.markets.sub.rank.futures.domain.GetMarketDiscoverFuturesDownVosUseCase$onExecute$4;
import com.okinc.market.ranking.core.model.po.FuturesRankItemPo;
import kotlin.Triple;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qkO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41095qkO extends AbstractC49400uno<C41097qkQ, C41467qrP> {
    public final CoroutineDispatcher AEQbTJ;
    public final C41166qlg EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.AEQbTJ;
    }

    @Override // o.InterfaceC49403unr
    public /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return OLrzqt((C41097qkQ) obj, (Continuation<? super C41467qrP>) continuation);
    }

    @yCM
    public C41095qkO(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C41166qlg c41166qlg) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c41166qlg, "");
        this.AEQbTJ = coroutineDispatcher;
        this.EZpvd = c41166qlg;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull C41097qkQ c41097qkQ, @NotNull Continuation<? super C41467qrP> continuation) throws java.lang.Throwable {
        GetMarketDiscoverFuturesDownVosUseCase$onExecute$1 getMarketDiscoverFuturesDownVosUseCase$onExecute$1;
        C41095qkO c41095qkO;
        C41467qrP c41467qrP;
        if (continuation instanceof GetMarketDiscoverFuturesDownVosUseCase$onExecute$1) {
            getMarketDiscoverFuturesDownVosUseCase$onExecute$1 = (GetMarketDiscoverFuturesDownVosUseCase$onExecute$1) continuation;
            int i = getMarketDiscoverFuturesDownVosUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getMarketDiscoverFuturesDownVosUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                getMarketDiscoverFuturesDownVosUseCase$onExecute$1 = new GetMarketDiscoverFuturesDownVosUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object objCoroutineScope = getMarketDiscoverFuturesDownVosUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getMarketDiscoverFuturesDownVosUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCoroutineScope);
            C41467qrP c41467qrPOLrzqt = c41097qkQ.OLrzqt();
            C41160qla c41160qla = new C41160qla(c41097qkQ.EZpvd(), c41097qkQ.copydefault(), c41097qkQ.KWHzl(), false);
            C41166qlg c41166qlg = this.EZpvd;
            getMarketDiscoverFuturesDownVosUseCase$onExecute$1.L$0 = this;
            getMarketDiscoverFuturesDownVosUseCase$onExecute$1.L$1 = c41467qrPOLrzqt;
            getMarketDiscoverFuturesDownVosUseCase$onExecute$1.label = 1;
            java.lang.Object objEZpvd = c41166qlg.EZpvd(c41160qla, getMarketDiscoverFuturesDownVosUseCase$onExecute$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            c41095qkO = this;
            objCoroutineScope = objEZpvd;
            c41467qrP = c41467qrPOLrzqt;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c41467qrP = (C41467qrP) getMarketDiscoverFuturesDownVosUseCase$onExecute$1.L$0;
                C56391yDq.AEQbTJ(objCoroutineScope);
                Triple triple = (Triple) objCoroutineScope;
                return C41467qrP.copy$default(c41467qrP, (java.util.List) triple.component2(), (java.util.List) triple.component1(), (java.util.List) triple.component3(), null, null, 0L, 56, null);
            }
            c41467qrP = (C41467qrP) getMarketDiscoverFuturesDownVosUseCase$onExecute$1.L$1;
            c41095qkO = (C41095qkO) getMarketDiscoverFuturesDownVosUseCase$onExecute$1.L$0;
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
        GetMarketDiscoverFuturesDownVosUseCase$onExecute$$inlined$executeAsyncTasks$1 getMarketDiscoverFuturesDownVosUseCase$onExecute$$inlined$executeAsyncTasks$1 = new GetMarketDiscoverFuturesDownVosUseCase$onExecute$$inlined$executeAsyncTasks$1(new GetMarketDiscoverFuturesDownVosUseCase$onExecute$2(c41095qkO, c41467qrP, setOqFWZa, null), new GetMarketDiscoverFuturesDownVosUseCase$onExecute$3(c41095qkO, c41467qrP, setOqFWZa, null), new GetMarketDiscoverFuturesDownVosUseCase$onExecute$4(c41095qkO, c41467qrP, setOqFWZa, null), null);
        getMarketDiscoverFuturesDownVosUseCase$onExecute$1.L$0 = c41467qrP;
        getMarketDiscoverFuturesDownVosUseCase$onExecute$1.L$1 = null;
        getMarketDiscoverFuturesDownVosUseCase$onExecute$1.label = 2;
        objCoroutineScope = CoroutineScopeKt.coroutineScope(getMarketDiscoverFuturesDownVosUseCase$onExecute$$inlined$executeAsyncTasks$1, getMarketDiscoverFuturesDownVosUseCase$onExecute$1);
        if (objCoroutineScope == objCopydefault) {
            return objCopydefault;
        }
        Triple triple2 = (Triple) objCoroutineScope;
        return C41467qrP.copy$default(c41467qrP, (java.util.List) triple2.component2(), (java.util.List) triple2.component1(), (java.util.List) triple2.component3(), null, null, 0L, 56, null);
    }

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
