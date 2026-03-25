package o;

import com.okinc.unify_trade.biz.StrategyOrderBillDetailsResponse;
import com.okinc.unify_trade.bot.data.GridPendingItemData;
import com.okinc.unify_trade.bot.data.GridPendingOrderData;
import java.math.RoundingMode;
import java.util.LinkedHashMap;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xti, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C55956xti implements InterfaceC54501xKt<C55804xqp<java.util.List<? extends StrategyOrderBillDetailsResponse>>, GridPendingOrderData> {
    public java.lang.String OLrzqt = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // o.InterfaceC54501xKt
    public /* bridge */ /* synthetic */ GridPendingOrderData KWHzl(C55804xqp<java.util.List<? extends StrategyOrderBillDetailsResponse>> c55804xqp) {
        return KWHzl2((C55804xqp<java.util.List<StrategyOrderBillDetailsResponse>>) c55804xqp);
    }

    /* JADX INFO: renamed from: KWHzl, reason: avoid collision after fix types in other method */
    public GridPendingOrderData KWHzl2(@NotNull C55804xqp<java.util.List<StrategyOrderBillDetailsResponse>> c55804xqp) {
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
        java.util.List listEZpvd = CollectionsKt___CollectionsKt.EZpvd(arrayList2, new Application());
        java.lang.Iterable arrayList3 = (java.util.List) linkedHashMap.get("sell");
        if (arrayList3 == null) {
            arrayList3 = new java.util.ArrayList();
        }
        C55806xqr c55806xqr = new C55806xqr(listEZpvd, CollectionsKt___CollectionsKt.EZpvd(arrayList3, new StateListAnimator()));
        java.util.List listOLrzqt = C56402yEa.OLrzqt();
        for (StrategyOrderBillDetailsResponse strategyOrderBillDetailsResponse : c55806xqr.KWHzl()) {
            if (!Intrinsics.EZpvd((java.lang.Object) strategyOrderBillDetailsResponse.getOrderTag(), (java.lang.Object) "inactive") || !C33129mqd.AEQbTJ(strategyOrderBillDetailsResponse.getPx(), this.OLrzqt)) {
                listOLrzqt.add(new GridPendingItemData(listOLrzqt.size() + 1, C56033xvF.getBotPrice$default(strategyOrderBillDetailsResponse.getInstType(), strategyOrderBillDetailsResponse.getInstId(), strategyOrderBillDetailsResponse.getPx(), false, false, null, null, 120, null), strategyOrderBillDetailsResponse.getBuySellPercentData(this.OLrzqt).getSecond(), strategyOrderBillDetailsResponse.getOrderTag(), (java.lang.String) null, strategyOrderBillDetailsResponse.getPx(), 16, (DefaultConstructorMarker) null));
            }
        }
        java.util.List listFARcdN = C56402yEa.fARcdN(listOLrzqt);
        java.util.List listOLrzqt2 = C56402yEa.OLrzqt();
        for (StrategyOrderBillDetailsResponse strategyOrderBillDetailsResponse2 : c55806xqr.EZpvd()) {
            if (!Intrinsics.EZpvd((java.lang.Object) strategyOrderBillDetailsResponse2.getOrderTag(), (java.lang.Object) "inactive") || !C33129mqd.gEmmrt(strategyOrderBillDetailsResponse2.getPx(), this.OLrzqt)) {
                listOLrzqt2.add(new GridPendingItemData(listOLrzqt2.size() + 1, C56033xvF.getBotPrice$default(strategyOrderBillDetailsResponse2.getInstType(), strategyOrderBillDetailsResponse2.getInstId(), strategyOrderBillDetailsResponse2.getPx(), false, false, null, null, 120, null), strategyOrderBillDetailsResponse2.getBuySellPercentData(this.OLrzqt).getSecond(), strategyOrderBillDetailsResponse2.getOrderTag(), (java.lang.String) null, strategyOrderBillDetailsResponse2.getPx(), 16, (DefaultConstructorMarker) null));
            }
        }
        return new GridPendingOrderData((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, listFARcdN, C56402yEa.fARcdN(listOLrzqt2), 63, (DefaultConstructorMarker) null);
    }

    public final GridPendingOrderData EZpvd(@NotNull GridPendingOrderData gridPendingOrderData) {
        Intrinsics.checkNotNullParameter(gridPendingOrderData, "");
        GridPendingOrderData gridPendingOrderDataCopy = gridPendingOrderData.copy((255 & 1) != 0 ? gridPendingOrderData.instId : null, (255 & 2) != 0 ? gridPendingOrderData.instType : null, (255 & 4) != 0 ? gridPendingOrderData.priceUnit : null, (255 & 8) != 0 ? gridPendingOrderData.gridProfit : null, (255 & 16) != 0 ? gridPendingOrderData.currentPrice : null, (255 & 32) != 0 ? gridPendingOrderData.tradeCount : null, (255 & 64) != 0 ? gridPendingOrderData.buyList : null, (255 & 128) != 0 ? gridPendingOrderData.sellList : null);
        java.util.List<GridPendingItemData> buyList = gridPendingOrderDataCopy.getBuyList();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(buyList, 10));
        for (GridPendingItemData gridPendingItemData : buyList) {
            arrayList.add(GridPendingItemData.copy$default(gridPendingItemData, 0, null, OLrzqt(gridPendingItemData).getSecond(), null, null, null, 59, null));
        }
        java.util.List<GridPendingItemData> sellList = gridPendingOrderDataCopy.getSellList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(sellList, 10));
        for (GridPendingItemData gridPendingItemData2 : sellList) {
            arrayList2.add(GridPendingItemData.copy$default(gridPendingItemData2, 0, null, OLrzqt(gridPendingItemData2).getSecond(), null, null, null, 59, null));
        }
        return gridPendingOrderDataCopy.copy((255 & 1) != 0 ? gridPendingOrderDataCopy.instId : null, (255 & 2) != 0 ? gridPendingOrderDataCopy.instType : null, (255 & 4) != 0 ? gridPendingOrderDataCopy.priceUnit : null, (255 & 8) != 0 ? gridPendingOrderDataCopy.gridProfit : null, (255 & 16) != 0 ? gridPendingOrderDataCopy.currentPrice : null, (255 & 32) != 0 ? gridPendingOrderDataCopy.tradeCount : null, (255 & 64) != 0 ? gridPendingOrderDataCopy.buyList : arrayList, (255 & 128) != 0 ? gridPendingOrderDataCopy.sellList : arrayList2);
    }

    public final kotlin.Pair<java.lang.String, java.lang.String> OLrzqt(GridPendingItemData gridPendingItemData) {
        java.lang.String px = gridPendingItemData.getPx();
        if ((px != null && px.length() == 0) || this.OLrzqt.length() == 0) {
            return C56390yDp.OLrzqt("", "");
        }
        java.lang.String strDivS$default = C33129mqd.divS$default(C33129mqd.subS$default(gridPendingItemData.getPx(), this.OLrzqt, null, null, null, 14, null), this.OLrzqt, null, null, null, 14, null);
        return C56390yDp.OLrzqt(strDivS$default, xMR.formatPercentWithSymbol$default(xMR.copydefault, strDivS$default, 2, 0, RoundingMode.DOWN, 4, null));
    }

    /* JADX INFO: renamed from: o.xti$StateListAnimator */
    public static final class StateListAnimator<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Double.valueOf(C33129mqd.AEQbTJ(((StrategyOrderBillDetailsResponse) t).getPx())), java.lang.Double.valueOf(C33129mqd.AEQbTJ(((StrategyOrderBillDetailsResponse) t2).getPx())));
        }
    }

    /* JADX INFO: renamed from: o.xti$Application */
    public static final class Application<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Double.valueOf(C33129mqd.AEQbTJ(((StrategyOrderBillDetailsResponse) t2).getPx())), java.lang.Double.valueOf(C33129mqd.AEQbTJ(((StrategyOrderBillDetailsResponse) t).getPx())));
        }
    }
}
