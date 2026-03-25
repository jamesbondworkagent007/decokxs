package o;

import com.okinc.unify_trade.biz.StrategyOrderBillDetailsResponse;
import com.okinc.unify_trade.bot.data.GridPendingItemData;
import com.okinc.unify_trade.bot.data.GridPendingOrderData;
import java.util.LinkedHashMap;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xsT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C55888xsT implements InterfaceC54501xKt<C55804xqp<java.util.List<? extends StrategyOrderBillDetailsResponse>>, GridPendingOrderData> {
    public java.lang.String AEQbTJ = "";
    public java.lang.String copydefault = "";
    public java.lang.String OLrzqt = "";
    public final java.util.ArrayList<GridPendingItemData> EZpvd = new java.util.ArrayList<>();
    public final java.util.ArrayList<GridPendingItemData> KWHzl = new java.util.ArrayList<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // o.InterfaceC54501xKt
    public /* synthetic */ GridPendingOrderData KWHzl(C55804xqp<java.util.List<? extends StrategyOrderBillDetailsResponse>> c55804xqp) {
        return OLrzqt((C55804xqp<java.util.List<StrategyOrderBillDetailsResponse>>) c55804xqp);
    }

    public GridPendingOrderData OLrzqt(@NotNull C55804xqp<java.util.List<StrategyOrderBillDetailsResponse>> c55804xqp) {
        Intrinsics.checkNotNullParameter(c55804xqp, "");
        java.util.List<StrategyOrderBillDetailsResponse> listCopydefault = c55804xqp.copydefault();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (java.lang.Object obj : listCopydefault) {
            java.lang.String side = ((StrategyOrderBillDetailsResponse) obj).getSide();
            java.lang.Object arrayList = linkedHashMap.get(side);
            if (arrayList == null) {
                arrayList = new java.util.ArrayList();
                linkedHashMap.put(side, arrayList);
            }
            ((java.util.List) arrayList).add(obj);
        }
        java.lang.Iterable arrayList2 = (java.util.List) linkedHashMap.get("buy");
        if (arrayList2 == null) {
            arrayList2 = new java.util.ArrayList();
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList(CollectionsKt___CollectionsKt.EZpvd(arrayList2, new TaskDescription()));
        java.lang.Iterable arrayList4 = (java.util.List) linkedHashMap.get("sell");
        if (arrayList4 == null) {
            arrayList4 = new java.util.ArrayList();
        }
        C55806xqr c55806xqr = new C55806xqr(arrayList3, new java.util.ArrayList(CollectionsKt___CollectionsKt.EZpvd(arrayList4, new Activity())));
        this.EZpvd.clear();
        this.KWHzl.clear();
        for (StrategyOrderBillDetailsResponse strategyOrderBillDetailsResponse : c55806xqr.KWHzl()) {
            java.util.ArrayList<GridPendingItemData> arrayList5 = this.EZpvd;
            arrayList5.add(new GridPendingItemData(arrayList5.size() + 1, C56033xvF.copydefault(strategyOrderBillDetailsResponse.getPx(), this.OLrzqt, this.copydefault), strategyOrderBillDetailsResponse.getBuySellPercentData(this.AEQbTJ).getSecond(), strategyOrderBillDetailsResponse.getOrderTag(), strategyOrderBillDetailsResponse.getSz(), (java.lang.String) null, 32, (DefaultConstructorMarker) null));
        }
        for (StrategyOrderBillDetailsResponse strategyOrderBillDetailsResponse2 : c55806xqr.EZpvd()) {
            java.util.ArrayList<GridPendingItemData> arrayList6 = this.KWHzl;
            arrayList6.add(new GridPendingItemData(arrayList6.size() + 1, C56033xvF.copydefault(strategyOrderBillDetailsResponse2.getPx(), this.OLrzqt, this.copydefault), strategyOrderBillDetailsResponse2.getBuySellPercentData(this.AEQbTJ).getSecond(), strategyOrderBillDetailsResponse2.getOrderTag(), strategyOrderBillDetailsResponse2.getSz(), (java.lang.String) null, 32, (DefaultConstructorMarker) null));
        }
        return new GridPendingOrderData((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, this.EZpvd, this.KWHzl, 63, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: renamed from: o.xsT$Activity */
    public static final class Activity<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Double.valueOf(C33129mqd.AEQbTJ(((StrategyOrderBillDetailsResponse) t).getPx())), java.lang.Double.valueOf(C33129mqd.AEQbTJ(((StrategyOrderBillDetailsResponse) t2).getPx())));
        }
    }

    /* JADX INFO: renamed from: o.xsT$TaskDescription */
    public static final class TaskDescription<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Double.valueOf(C33129mqd.AEQbTJ(((StrategyOrderBillDetailsResponse) t2).getPx())), java.lang.Double.valueOf(C33129mqd.AEQbTJ(((StrategyOrderBillDetailsResponse) t).getPx())));
        }
    }
}
