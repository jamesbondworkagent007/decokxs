package o;

import com.okinc.market.discover.features.markets.sub.rank.spot.domain.GetMarketDiscoverSpotDownVosUseCase$onExecute$1;
import com.okinc.unify_find.data.UpDownRank;
import java.util.LinkedHashMap;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qmi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41221qmi extends AbstractC49400uno<C41214qmb, java.util.List<? extends InterfaceC41641que>> {
    public final C41215qmc AEQbTJ;
    public final CoroutineDispatcher copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.copydefault;
    }

    @yCM
    public C41221qmi(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C41215qmc c41215qmc) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c41215qmc, "");
        this.copydefault = coroutineDispatcher;
        this.AEQbTJ = c41215qmc;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull C41214qmb c41214qmb, @NotNull Continuation<? super java.util.List<? extends InterfaceC41641que>> continuation) throws java.lang.Throwable {
        GetMarketDiscoverSpotDownVosUseCase$onExecute$1 getMarketDiscoverSpotDownVosUseCase$onExecute$1;
        java.util.List<InterfaceC41641que> list;
        if (continuation instanceof GetMarketDiscoverSpotDownVosUseCase$onExecute$1) {
            getMarketDiscoverSpotDownVosUseCase$onExecute$1 = (GetMarketDiscoverSpotDownVosUseCase$onExecute$1) continuation;
            int i = getMarketDiscoverSpotDownVosUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getMarketDiscoverSpotDownVosUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                getMarketDiscoverSpotDownVosUseCase$onExecute$1 = new GetMarketDiscoverSpotDownVosUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object obj = getMarketDiscoverSpotDownVosUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getMarketDiscoverSpotDownVosUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            java.util.List<InterfaceC41641que> listAEQbTJ = c41214qmb.AEQbTJ();
            C41213qma c41213qma = new C41213qma(c41214qmb.OLrzqt(), c41214qmb.EZpvd());
            C41215qmc c41215qmc = this.AEQbTJ;
            getMarketDiscoverSpotDownVosUseCase$onExecute$1.L$0 = listAEQbTJ;
            getMarketDiscoverSpotDownVosUseCase$onExecute$1.label = 1;
            java.lang.Object objEZpvd = c41215qmc.EZpvd(c41213qma, getMarketDiscoverSpotDownVosUseCase$onExecute$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            obj = objEZpvd;
            list = listAEQbTJ;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (java.util.List) getMarketDiscoverSpotDownVosUseCase$onExecute$1.L$0;
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
