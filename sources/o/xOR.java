package o;

import com.okinc.biz.TacticsType;
import com.okinc.unify_trade.biz.AlgoShareConfigInfo;
import com.okinc.unify_trade.biz.BotUserConfigInfo;
import com.okinc.unify_trade.biz.OrderCategory;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xOR {
    public AlgoShareConfigInfo AEQbTJ;
    public BotUserConfigInfo valueOf;
    public boolean KWHzl = true;
    public java.util.List<OrderCategory> EZpvd = yDY.AhwBna();
    public java.util.List<TacticsType> gEmmrt = new java.util.ArrayList();
    public java.util.List<java.lang.String> AYXKKw = yDY.AhwBna();
    public C56111xwe<java.lang.Boolean> OLrzqt = new C56111xwe<>();
    public C56111xwe<java.lang.Boolean> copydefault = new C56111xwe<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.AYXKKw = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AlgoShareConfigInfo EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(AlgoShareConfigInfo algoShareConfigInfo) {
        this.AEQbTJ = algoShareConfigInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotUserConfigInfo KWHzl() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<java.lang.Boolean> OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(BotUserConfigInfo botUserConfigInfo) {
        this.valueOf = botUserConfigInfo;
    }

    public final boolean gEmmrt() {
        return this.AYXKKw.contains("disableContractGridCoinM");
    }

    public final boolean AYXKKw() {
        return this.AYXKKw.contains("disableContractGridSlippageControl");
    }

    public final void values() {
        this.copydefault.setValue(java.lang.Boolean.FALSE);
    }

    public final void KWHzl(java.util.List<OrderCategory> list) {
        TacticsType tacticsTypeAEQbTJ;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(this.gEmmrt);
        this.gEmmrt.clear();
        java.util.List<java.lang.String> listKWHzl = TacticsType.Companion.KWHzl();
        if (list == null || list.isEmpty()) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator<T> it = listKWHzl.iterator();
            while (it.hasNext()) {
                TacticsType tacticsTypeAEQbTJ2 = TacticsType.Companion.AEQbTJ((java.lang.String) it.next());
                if (tacticsTypeAEQbTJ2 != null) {
                    arrayList2.add(tacticsTypeAEQbTJ2);
                }
            }
            this.gEmmrt = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) arrayList2);
        } else {
            for (OrderCategory orderCategory : list) {
                if (Intrinsics.EZpvd((java.lang.Object) orderCategory.getMpEnabled(), (java.lang.Object) "1") && listKWHzl.contains(orderCategory.getStrategyType()) && (tacticsTypeAEQbTJ = TacticsType.Companion.AEQbTJ(orderCategory.getStrategyType())) != null) {
                    this.gEmmrt.add(tacticsTypeAEQbTJ);
                }
            }
        }
        this.copydefault.setValue(java.lang.Boolean.valueOf(EZpvd(arrayList, this.gEmmrt)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: o.xOR */
    /* JADX WARN: Multi-variable type inference failed */
    public final void OLrzqt(java.util.List<OrderCategory> list) {
        java.util.List listAhwBna;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(this.EZpvd);
        java.util.List<java.lang.String> listEZpvd = TacticsType.Companion.EZpvd();
        if (list == null) {
            listAhwBna = yDY.AhwBna();
        } else {
            listAhwBna = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                if (listEZpvd.contains(((OrderCategory) obj).getStrategyType())) {
                    listAhwBna.add(obj);
                }
            }
        }
        this.EZpvd = listAhwBna;
        this.OLrzqt.setValue(java.lang.Boolean.valueOf(copydefault(arrayList, listAhwBna)));
    }

    public final boolean valueOf() {
        return this.EZpvd.isEmpty();
    }

    public final java.util.List<OrderCategory> AEQbTJ() {
        java.util.List<OrderCategory> list = this.EZpvd;
        if (!list.isEmpty()) {
            return list;
        }
        java.util.List<java.lang.String> listEZpvd = TacticsType.Companion.EZpvd();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listEZpvd, 10));
        for (java.lang.String str : listEZpvd) {
            arrayList.add(new OrderCategory(CollectionsKt___CollectionsKt.joinToString$default(C55946xtY.OLrzqt.KWHzl(str), ",", null, null, 0, null, null, 62, null), null, str, null, null, 26, null));
        }
        return CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList);
    }

    public final java.util.List<TacticsType> djBIcL() {
        if (this.gEmmrt.isEmpty()) {
            java.util.List<TacticsType> list = this.gEmmrt;
            java.util.List<java.lang.String> listKWHzl = TacticsType.Companion.KWHzl();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<T> it = listKWHzl.iterator();
            while (it.hasNext()) {
                TacticsType tacticsTypeAEQbTJ = TacticsType.Companion.AEQbTJ((java.lang.String) it.next());
                if (tacticsTypeAEQbTJ != null) {
                    arrayList.add(tacticsTypeAEQbTJ);
                }
            }
            list.addAll(CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) arrayList));
        }
        return this.gEmmrt;
    }

    public final java.util.List<java.lang.String> copydefault() {
        if (!(!this.EZpvd.isEmpty())) {
            return TacticsType.Companion.EZpvd();
        }
        java.util.List<OrderCategory> list = this.EZpvd;
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((OrderCategory) it.next()).getStrategyType());
        }
        return arrayList;
    }

    public final boolean copydefault(java.util.List<OrderCategory> list, java.util.List<OrderCategory> list2) {
        if (list2.size() != list.size()) {
            return true;
        }
        int i = 0;
        for (java.lang.Object obj : list2) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            if (!Intrinsics.EZpvd((java.lang.Object) ((OrderCategory) obj).getStrategyType(), (java.lang.Object) list.get(i).getStrategyType())) {
                return true;
            }
            i++;
        }
        return false;
    }

    public final boolean EZpvd(java.util.List<? extends TacticsType> list, java.util.List<? extends TacticsType> list2) {
        if (list2.size() != list.size()) {
            return true;
        }
        int i = 0;
        for (java.lang.Object obj : list2) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            if (!Intrinsics.EZpvd((java.lang.Object) ((TacticsType) obj).getConstant(), (java.lang.Object) list.get(i).getConstant())) {
                return true;
            }
            i++;
        }
        return false;
    }

    public final boolean AhwBna() {
        xOW newProxyInstance;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        return (interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null || !newProxyInstance.fARcdN()) ? false : true;
    }
}
