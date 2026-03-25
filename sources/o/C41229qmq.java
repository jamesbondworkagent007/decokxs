package o;

import com.okinc.market.discover.features.markets.sub.rank.spot.domain.GetMarketDiscoverSpotTurnoverVosUseCase$onExecute$1;
import com.okinc.unify_find.data.TurnOverRank;
import java.util.LinkedHashMap;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qmq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41229qmq extends AbstractC49400uno<C41224qml, java.util.List<? extends InterfaceC41641que>> {
    public final CoroutineDispatcher EZpvd;
    public final C41223qmk copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.EZpvd;
    }

    @yCM
    public C41229qmq(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C41223qmk c41223qmk) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c41223qmk, "");
        this.EZpvd = coroutineDispatcher;
        this.copydefault = c41223qmk;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull C41224qml c41224qml, @NotNull Continuation<? super java.util.List<? extends InterfaceC41641que>> continuation) throws java.lang.Throwable {
        GetMarketDiscoverSpotTurnoverVosUseCase$onExecute$1 getMarketDiscoverSpotTurnoverVosUseCase$onExecute$1;
        java.util.List<InterfaceC41641que> list;
        if (continuation instanceof GetMarketDiscoverSpotTurnoverVosUseCase$onExecute$1) {
            getMarketDiscoverSpotTurnoverVosUseCase$onExecute$1 = (GetMarketDiscoverSpotTurnoverVosUseCase$onExecute$1) continuation;
            int i = getMarketDiscoverSpotTurnoverVosUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getMarketDiscoverSpotTurnoverVosUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                getMarketDiscoverSpotTurnoverVosUseCase$onExecute$1 = new GetMarketDiscoverSpotTurnoverVosUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object obj = getMarketDiscoverSpotTurnoverVosUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getMarketDiscoverSpotTurnoverVosUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            java.util.List<InterfaceC41641que> listCopydefault = c41224qml.copydefault();
            C41225qmm c41225qmm = new C41225qmm(c41224qml.KWHzl(), c41224qml.EZpvd());
            C41223qmk c41223qmk = this.copydefault;
            getMarketDiscoverSpotTurnoverVosUseCase$onExecute$1.L$0 = listCopydefault;
            getMarketDiscoverSpotTurnoverVosUseCase$onExecute$1.label = 1;
            java.lang.Object objEZpvd = c41223qmk.EZpvd(c41225qmm, getMarketDiscoverSpotTurnoverVosUseCase$onExecute$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            obj = objEZpvd;
            list = listCopydefault;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (java.util.List) getMarketDiscoverSpotTurnoverVosUseCase$onExecute$1.L$0;
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
            InterfaceC41641que interfaceC41641que = (InterfaceC41641que) linkedHashMap.get(((TurnOverRank) it.next()).getInstId());
            if (interfaceC41641que != null) {
                arrayList.add(interfaceC41641que);
            }
        }
        return arrayList;
    }
}
