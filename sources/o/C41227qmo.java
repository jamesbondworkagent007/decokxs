package o;

import com.okinc.market.discover.features.markets.sub.rank.spot.domain.GetMarketDiscoverSpotMarketCapVosUseCase$onExecute$1;
import com.okinc.market.quotation.ui.model.ChargeGroupVo;
import com.okinc.unify_find.data.MarketCapRank;
import java.util.LinkedHashMap;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qmo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41227qmo extends AbstractC49400uno<kotlin.Pair<? extends java.util.List<? extends InterfaceC41641que>, ? extends ChargeGroupVo>, java.util.List<? extends InterfaceC41641que>> {
    public final C41226qmn AEQbTJ;
    public final CoroutineDispatcher EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.EZpvd;
    }

    @yCM
    public C41227qmo(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C41226qmn c41226qmn) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c41226qmn, "");
        this.EZpvd = coroutineDispatcher;
        this.AEQbTJ = c41226qmn;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull kotlin.Pair<? extends java.util.List<? extends InterfaceC41641que>, ChargeGroupVo> pair, @NotNull Continuation<? super java.util.List<? extends InterfaceC41641que>> continuation) throws java.lang.Throwable {
        GetMarketDiscoverSpotMarketCapVosUseCase$onExecute$1 getMarketDiscoverSpotMarketCapVosUseCase$onExecute$1;
        java.util.List<? extends InterfaceC41641que> list;
        if (continuation instanceof GetMarketDiscoverSpotMarketCapVosUseCase$onExecute$1) {
            getMarketDiscoverSpotMarketCapVosUseCase$onExecute$1 = (GetMarketDiscoverSpotMarketCapVosUseCase$onExecute$1) continuation;
            int i = getMarketDiscoverSpotMarketCapVosUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getMarketDiscoverSpotMarketCapVosUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                getMarketDiscoverSpotMarketCapVosUseCase$onExecute$1 = new GetMarketDiscoverSpotMarketCapVosUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object obj = getMarketDiscoverSpotMarketCapVosUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getMarketDiscoverSpotMarketCapVosUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            java.util.List<? extends InterfaceC41641que> listComponent1 = pair.component1();
            ChargeGroupVo chargeGroupVoComponent2 = pair.component2();
            C41226qmn c41226qmn = this.AEQbTJ;
            getMarketDiscoverSpotMarketCapVosUseCase$onExecute$1.L$0 = listComponent1;
            getMarketDiscoverSpotMarketCapVosUseCase$onExecute$1.label = 1;
            java.lang.Object objEZpvd = c41226qmn.EZpvd(chargeGroupVoComponent2, getMarketDiscoverSpotMarketCapVosUseCase$onExecute$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            obj = objEZpvd;
            list = listComponent1;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (java.util.List) getMarketDiscoverSpotMarketCapVosUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        java.util.List<MarketCapRank> list2 = (java.util.List) obj;
        if (list2 == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(list, 10)), 16));
        for (java.lang.Object obj2 : list) {
            linkedHashMap.put(((InterfaceC41641que) obj2).values().getInstId(), obj2);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (MarketCapRank marketCapRank : list2) {
            java.lang.Object obj3 = linkedHashMap.get(marketCapRank.getInstId());
            C41334qop c41334qop = obj3 instanceof C41334qop ? (C41334qop) obj3 : null;
            InterfaceC41641que interfaceC41641queKWHzl = c41334qop != null ? c41334qop.KWHzl(marketCapRank.getMarketCap()) : null;
            if (interfaceC41641queKWHzl != null) {
                arrayList.add(interfaceC41641queKWHzl);
            }
        }
        return arrayList;
    }
}
