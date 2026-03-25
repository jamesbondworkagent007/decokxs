package o;

import com.okinc.business.market.features.favorites.editing.data.po.MarketFavoritesGroupPo;
import com.okinc.business.market.features.favorites.editing.data.po.MarketFavoritesGroupVisibilityPayload;
import com.okinc.business.market.features.favorites.editing.domain.group.UpdateMarketFavoritesGroupVisibilityUseCase$onExecute$1;
import java.util.LinkedHashMap;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jSx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C26126jSx extends AbstractC49400uno<kotlin.Pair<? extends java.lang.String, ? extends java.lang.Boolean>, kotlin.Pair<? extends kotlin.Pair<? extends java.lang.String, ? extends java.lang.Boolean>, ? extends kotlin.Pair<? extends java.util.List<? extends C26170jUn>, ? extends java.util.List<? extends C26170jUn>>>> {
    public final CoroutineDispatcher EZpvd;
    public final C26117jSo KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.EZpvd;
    }

    @Override // o.InterfaceC49403unr
    public /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return EZpvd((kotlin.Pair<java.lang.String, java.lang.Boolean>) obj, (Continuation<? super kotlin.Pair<kotlin.Pair<java.lang.String, java.lang.Boolean>, ? extends kotlin.Pair<? extends java.util.List<C26170jUn>, ? extends java.util.List<C26170jUn>>>>) continuation);
    }

    @yCM
    public C26126jSx(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C26117jSo c26117jSo) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c26117jSo, "");
        this.EZpvd = coroutineDispatcher;
        this.KWHzl = c26117jSo;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull kotlin.Pair<java.lang.String, java.lang.Boolean> pair, @NotNull Continuation<? super kotlin.Pair<kotlin.Pair<java.lang.String, java.lang.Boolean>, ? extends kotlin.Pair<? extends java.util.List<C26170jUn>, ? extends java.util.List<C26170jUn>>>> continuation) throws java.lang.Throwable {
        UpdateMarketFavoritesGroupVisibilityUseCase$onExecute$1 updateMarketFavoritesGroupVisibilityUseCase$onExecute$1;
        LinkedHashMap linkedHashMap;
        java.util.List listAhwBna;
        java.util.List list;
        java.util.List list2;
        if (continuation instanceof UpdateMarketFavoritesGroupVisibilityUseCase$onExecute$1) {
            updateMarketFavoritesGroupVisibilityUseCase$onExecute$1 = (UpdateMarketFavoritesGroupVisibilityUseCase$onExecute$1) continuation;
            int i = updateMarketFavoritesGroupVisibilityUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                updateMarketFavoritesGroupVisibilityUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                updateMarketFavoritesGroupVisibilityUseCase$onExecute$1 = new UpdateMarketFavoritesGroupVisibilityUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = updateMarketFavoritesGroupVisibilityUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = updateMarketFavoritesGroupVisibilityUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            MarketFavoritesGroupVisibilityPayload marketFavoritesGroupVisibilityPayload = new MarketFavoritesGroupVisibilityPayload(pair.component1(), pair.component2().booleanValue());
            C26117jSo c26117jSo = this.KWHzl;
            updateMarketFavoritesGroupVisibilityUseCase$onExecute$1.L$0 = pair;
            updateMarketFavoritesGroupVisibilityUseCase$onExecute$1.label = 1;
            objAEQbTJ = c26117jSo.AEQbTJ(marketFavoritesGroupVisibilityPayload, updateMarketFavoritesGroupVisibilityUseCase$onExecute$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pair = (kotlin.Pair) updateMarketFavoritesGroupVisibilityUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(objAEQbTJ);
        }
        java.util.List list3 = (java.util.List) objAEQbTJ;
        java.util.List listAhwBna2 = null;
        if (list3 != null) {
            linkedHashMap = new LinkedHashMap();
            for (java.lang.Object obj : list3) {
                java.lang.Boolean boolKWHzl = C56443yFo.KWHzl(((MarketFavoritesGroupPo) obj).isHidden());
                java.lang.Object arrayList = linkedHashMap.get(boolKWHzl);
                if (arrayList == null) {
                    arrayList = new java.util.ArrayList();
                    linkedHashMap.put(boolKWHzl, arrayList);
                }
                ((java.util.List) arrayList).add(obj);
            }
        } else {
            linkedHashMap = null;
        }
        if (linkedHashMap == null || (list2 = (java.util.List) linkedHashMap.get(C56443yFo.KWHzl(false))) == null) {
            listAhwBna = null;
        } else {
            listAhwBna = new java.util.ArrayList(C56403yEb.AYXKKw(list2, 10));
            java.util.Iterator it = list2.iterator();
            while (it.hasNext()) {
                listAhwBna.add(new C26170jUn((MarketFavoritesGroupPo) it.next()));
            }
        }
        if (listAhwBna == null) {
            listAhwBna = yDY.AhwBna();
        }
        if (linkedHashMap != null && (list = (java.util.List) linkedHashMap.get(C56443yFo.KWHzl(true))) != null) {
            listAhwBna2 = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            java.util.Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                listAhwBna2.add(new C26170jUn((MarketFavoritesGroupPo) it2.next()));
            }
        }
        if (listAhwBna2 == null) {
            listAhwBna2 = yDY.AhwBna();
        }
        return C56390yDp.OLrzqt(pair, C56390yDp.OLrzqt(listAhwBna, listAhwBna2));
    }
}
