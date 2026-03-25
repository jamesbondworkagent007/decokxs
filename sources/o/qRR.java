package o;

import com.okinc.market.quotation.ui.model.ChargeGroupVo;
import com.okinc.market.search.features.navigation.spot.hot.domain.GetNavSpotHotRankingUseCase;
import com.okinc.market.search.features.navigation.spot.hot.domain.GetNavSpotHotVosUseCase$onExecute$1;
import com.okinc.unify_find.data.HotRankResponse;
import java.util.LinkedHashMap;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qRR extends AbstractC49400uno<kotlin.Pair<? extends java.util.List<? extends InterfaceC41641que>, ? extends ChargeGroupVo>, java.util.List<? extends InterfaceC41641que>> {
    public final GetNavSpotHotRankingUseCase OLrzqt;
    public final CoroutineDispatcher copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.copydefault;
    }

    @Override // o.InterfaceC49403unr
    public /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return EZpvd((kotlin.Pair<? extends java.util.List<? extends InterfaceC41641que>, ChargeGroupVo>) obj, (Continuation<? super java.util.List<? extends InterfaceC41641que>>) continuation);
    }

    @yCM
    public qRR(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull GetNavSpotHotRankingUseCase getNavSpotHotRankingUseCase) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(getNavSpotHotRankingUseCase, "");
        this.copydefault = coroutineDispatcher;
        this.OLrzqt = getNavSpotHotRankingUseCase;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull kotlin.Pair<? extends java.util.List<? extends InterfaceC41641que>, ChargeGroupVo> pair, @NotNull Continuation<? super java.util.List<? extends InterfaceC41641que>> continuation) throws java.lang.Throwable {
        GetNavSpotHotVosUseCase$onExecute$1 getNavSpotHotVosUseCase$onExecute$1;
        java.util.List<? extends InterfaceC41641que> list;
        if (continuation instanceof GetNavSpotHotVosUseCase$onExecute$1) {
            getNavSpotHotVosUseCase$onExecute$1 = (GetNavSpotHotVosUseCase$onExecute$1) continuation;
            int i = getNavSpotHotVosUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getNavSpotHotVosUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                getNavSpotHotVosUseCase$onExecute$1 = new GetNavSpotHotVosUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object obj = getNavSpotHotVosUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getNavSpotHotVosUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            java.util.List<? extends InterfaceC41641que> listComponent1 = pair.component1();
            ChargeGroupVo chargeGroupVoComponent2 = pair.component2();
            GetNavSpotHotRankingUseCase getNavSpotHotRankingUseCase = this.OLrzqt;
            getNavSpotHotVosUseCase$onExecute$1.L$0 = listComponent1;
            getNavSpotHotVosUseCase$onExecute$1.label = 1;
            java.lang.Object objEZpvd = getNavSpotHotRankingUseCase.EZpvd(chargeGroupVoComponent2, getNavSpotHotVosUseCase$onExecute$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            obj = objEZpvd;
            list = listComponent1;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (java.util.List) getNavSpotHotVosUseCase$onExecute$1.L$0;
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
