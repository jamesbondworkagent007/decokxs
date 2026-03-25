package o;

import com.okinc.market.discover.features.markets.sub.rank.spot.domain.GetMarketDiscoverSpotHotVosUseCase$onExecute$1;
import com.okinc.unify_find.data.HotRankResponse;
import java.util.LinkedHashMap;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qmf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41218qmf extends AbstractC49400uno<C41219qmg, java.util.List<? extends InterfaceC41641que>> {
    public final CoroutineDispatcher AEQbTJ;
    public final C41220qmh EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.AEQbTJ;
    }

    @yCM
    public C41218qmf(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C41220qmh c41220qmh) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c41220qmh, "");
        this.AEQbTJ = coroutineDispatcher;
        this.EZpvd = c41220qmh;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull C41219qmg c41219qmg, @NotNull Continuation<? super java.util.List<? extends InterfaceC41641que>> continuation) throws java.lang.Throwable {
        GetMarketDiscoverSpotHotVosUseCase$onExecute$1 getMarketDiscoverSpotHotVosUseCase$onExecute$1;
        java.util.List<InterfaceC41641que> list;
        if (continuation instanceof GetMarketDiscoverSpotHotVosUseCase$onExecute$1) {
            getMarketDiscoverSpotHotVosUseCase$onExecute$1 = (GetMarketDiscoverSpotHotVosUseCase$onExecute$1) continuation;
            int i = getMarketDiscoverSpotHotVosUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getMarketDiscoverSpotHotVosUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                getMarketDiscoverSpotHotVosUseCase$onExecute$1 = new GetMarketDiscoverSpotHotVosUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object obj = getMarketDiscoverSpotHotVosUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getMarketDiscoverSpotHotVosUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            java.util.List<InterfaceC41641que> listKWHzl = c41219qmg.KWHzl();
            C41222qmj c41222qmj = new C41222qmj(c41219qmg.EZpvd(), c41219qmg.copydefault());
            C41220qmh c41220qmh = this.EZpvd;
            getMarketDiscoverSpotHotVosUseCase$onExecute$1.L$0 = listKWHzl;
            getMarketDiscoverSpotHotVosUseCase$onExecute$1.label = 1;
            java.lang.Object objEZpvd = c41220qmh.EZpvd(c41222qmj, getMarketDiscoverSpotHotVosUseCase$onExecute$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            obj = objEZpvd;
            list = listKWHzl;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (java.util.List) getMarketDiscoverSpotHotVosUseCase$onExecute$1.L$0;
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
            InterfaceC41641que interfaceC41641que = (InterfaceC41641que) linkedHashMap.get(((HotRankResponse) it.next()).getInstId());
            if (interfaceC41641que != null) {
                arrayList.add(interfaceC41641que);
            }
        }
        return arrayList;
    }
}
