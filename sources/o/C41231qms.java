package o;

import com.okinc.market.discover.features.markets.sub.rank.spot.domain.GetMarketDiscoverSpotUpVosUseCase$onExecute$1;
import com.okinc.unify_find.data.UpDownRank;
import java.util.LinkedHashMap;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qms, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41231qms extends AbstractC49400uno<C41230qmr, java.util.List<? extends InterfaceC41641que>> {
    public final C41232qmt EZpvd;
    public final CoroutineDispatcher KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.KWHzl;
    }

    @Override // o.InterfaceC49403unr
    public /* bridge */ /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return KWHzl((C41230qmr) obj, (Continuation<? super java.util.List<? extends InterfaceC41641que>>) continuation);
    }

    @yCM
    public C41231qms(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C41232qmt c41232qmt) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c41232qmt, "");
        this.KWHzl = coroutineDispatcher;
        this.EZpvd = c41232qmt;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull C41230qmr c41230qmr, @NotNull Continuation<? super java.util.List<? extends InterfaceC41641que>> continuation) throws java.lang.Throwable {
        GetMarketDiscoverSpotUpVosUseCase$onExecute$1 getMarketDiscoverSpotUpVosUseCase$onExecute$1;
        java.util.List<InterfaceC41641que> list;
        if (continuation instanceof GetMarketDiscoverSpotUpVosUseCase$onExecute$1) {
            getMarketDiscoverSpotUpVosUseCase$onExecute$1 = (GetMarketDiscoverSpotUpVosUseCase$onExecute$1) continuation;
            int i = getMarketDiscoverSpotUpVosUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getMarketDiscoverSpotUpVosUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                getMarketDiscoverSpotUpVosUseCase$onExecute$1 = new GetMarketDiscoverSpotUpVosUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object obj = getMarketDiscoverSpotUpVosUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getMarketDiscoverSpotUpVosUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            java.util.List<InterfaceC41641que> listEZpvd = c41230qmr.EZpvd();
            C41228qmp c41228qmp = new C41228qmp(c41230qmr.OLrzqt(), c41230qmr.AEQbTJ());
            C41232qmt c41232qmt = this.EZpvd;
            getMarketDiscoverSpotUpVosUseCase$onExecute$1.L$0 = listEZpvd;
            getMarketDiscoverSpotUpVosUseCase$onExecute$1.label = 1;
            java.lang.Object objEZpvd = c41232qmt.EZpvd(c41228qmp, getMarketDiscoverSpotUpVosUseCase$onExecute$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            obj = objEZpvd;
            list = listEZpvd;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (java.util.List) getMarketDiscoverSpotUpVosUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        java.util.List list2 = (java.util.List) obj;
        if (list2 == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(list, 10)), 16));
        for (java.lang.Object obj2 : list) {
            linkedHashMap.put(((InterfaceC41641que) obj2).values().getInstId(), obj2);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list2.iterator();
        while (it.hasNext()) {
            InterfaceC41641que interfaceC41641que = (InterfaceC41641que) linkedHashMap.get(((UpDownRank) it.next()).getInstId());
            if (interfaceC41641que != null) {
                arrayList.add(interfaceC41641que);
            }
        }
        return arrayList;
    }
}
