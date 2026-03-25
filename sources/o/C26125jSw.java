package o;

import com.okinc.business.market.features.favorites.editing.data.po.MarketFavoritesGroupPo;
import com.okinc.business.market.features.favorites.editing.domain.group.GetMarketFavoritesAllGroupsUseCase$onExecute$1;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jSw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C26125jSw extends AbstractC49400uno<Unit, kotlin.Pair<? extends java.util.List<? extends C26170jUn>, ? extends java.util.List<? extends C26170jUn>>> {
    public final C41607qtx KWHzl;
    public final C26117jSo OLrzqt;
    public final CoroutineDispatcher copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.copydefault;
    }

    @Override // o.InterfaceC49403unr
    public /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return EZpvd((Unit) obj, (Continuation<? super kotlin.Pair<? extends java.util.List<C26170jUn>, ? extends java.util.List<C26170jUn>>>) continuation);
    }

    @yCM
    public C26125jSw(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C26117jSo c26117jSo, @NotNull C41607qtx c41607qtx) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c26117jSo, "");
        Intrinsics.checkNotNullParameter(c41607qtx, "");
        this.copydefault = coroutineDispatcher;
        this.OLrzqt = c26117jSo;
        this.KWHzl = c41607qtx;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull Unit unit, @NotNull Continuation<? super kotlin.Pair<? extends java.util.List<C26170jUn>, ? extends java.util.List<C26170jUn>>> continuation) throws java.lang.Throwable {
        GetMarketFavoritesAllGroupsUseCase$onExecute$1 getMarketFavoritesAllGroupsUseCase$onExecute$1;
        C26125jSw c26125jSw;
        LinkedHashMap linkedHashMap;
        java.util.List listAhwBna;
        java.util.List list;
        java.util.List list2;
        if (continuation instanceof GetMarketFavoritesAllGroupsUseCase$onExecute$1) {
            getMarketFavoritesAllGroupsUseCase$onExecute$1 = (GetMarketFavoritesAllGroupsUseCase$onExecute$1) continuation;
            int i = getMarketFavoritesAllGroupsUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getMarketFavoritesAllGroupsUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                getMarketFavoritesAllGroupsUseCase$onExecute$1 = new GetMarketFavoritesAllGroupsUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = getMarketFavoritesAllGroupsUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getMarketFavoritesAllGroupsUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            C26117jSo c26117jSo = this.OLrzqt;
            getMarketFavoritesAllGroupsUseCase$onExecute$1.L$0 = this;
            getMarketFavoritesAllGroupsUseCase$onExecute$1.label = 1;
            objKWHzl = c26117jSo.KWHzl(getMarketFavoritesAllGroupsUseCase$onExecute$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            c26125jSw = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c26125jSw = (C26125jSw) getMarketFavoritesAllGroupsUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(objKWHzl);
        }
        java.util.List list3 = (java.util.List) objKWHzl;
        java.util.List listAhwBna2 = null;
        if (list3 == null) {
            list3 = null;
        } else if (!((java.lang.Boolean) c26125jSw.KWHzl.KWHzl((java.lang.Object) Unit.INSTANCE)).booleanValue()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : list3) {
                MarketFavoritesGroupPo marketFavoritesGroupPo = (MarketFavoritesGroupPo) obj;
                if (!marketFavoritesGroupPo.isDexGroup() || !marketFavoritesGroupPo.isPreset()) {
                    arrayList.add(obj);
                }
            }
            list3 = arrayList;
        }
        if (list3 != null) {
            linkedHashMap = new LinkedHashMap();
            for (java.lang.Object obj2 : list3) {
                java.lang.Boolean boolKWHzl = C56443yFo.KWHzl(((MarketFavoritesGroupPo) obj2).isHidden());
                java.lang.Object arrayList2 = linkedHashMap.get(boolKWHzl);
                if (arrayList2 == null) {
                    arrayList2 = new java.util.ArrayList();
                    linkedHashMap.put(boolKWHzl, arrayList2);
                }
                ((java.util.List) arrayList2).add(obj2);
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
        return C56390yDp.OLrzqt(listAhwBna, listAhwBna2);
    }
}
