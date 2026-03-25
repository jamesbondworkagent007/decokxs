package o;

import com.okinc.business.market.data.model.alert.AlertDataUiItem;
import com.okinc.business.market.data.model.alert.AlertGroupUiItem;
import com.okinc.business.market.data.model.alert.AlertUiItem;
import java.util.NoSuchElementException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jHh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C25813jHh {
    public static final java.util.List<AlertUiItem> EZpvd(@NotNull java.util.List<? extends AlertUiItem> list, @NotNull AlertUiItem alertUiItem) {
        int i;
        int i2;
        AlertGroupUiItem alertGroupUiItemKWHzl;
        int i3;
        java.util.ArrayList arrayList;
        AlertDataUiItem alertDataUiItemAEQbTJ;
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(alertUiItem, "");
        boolean z = !alertUiItem.fetchVPNInfo();
        java.util.ArrayList<AlertGroupUiItem> arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (obj instanceof AlertGroupUiItem) {
                arrayList2.add(obj);
            }
        }
        int i4 = 10;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList2, 10));
        for (AlertGroupUiItem alertGroupUiItem : arrayList2) {
            if ((alertUiItem instanceof AlertGroupUiItem) && alertGroupUiItem.AEQbTJ((AlertGroupUiItem) alertUiItem)) {
                java.util.List<AlertDataUiItem> listEZpvd = alertGroupUiItem.EZpvd();
                java.util.ArrayList arrayList4 = new java.util.ArrayList(C56403yEb.AYXKKw(listEZpvd, i4));
                for (AlertDataUiItem alertDataUiItem : listEZpvd) {
                    java.util.ArrayList arrayList5 = arrayList4;
                    arrayList5.add(alertDataUiItem.AEQbTJ((1023 & 1) != 0 ? alertDataUiItem.AEQbTJ : null, (1023 & 2) != 0 ? alertDataUiItem.copydefault : null, (1023 & 4) != 0 ? alertDataUiItem.gEmmrt : null, (1023 & 8) != 0 ? alertDataUiItem.AkhnZx : null, (1023 & 16) != 0 ? alertDataUiItem.OLrzqt : null, (1023 & 32) != 0 ? alertDataUiItem.valueOf : null, (1023 & 64) != 0 ? alertDataUiItem.AhwBna : null, (1023 & 128) != 0 ? alertDataUiItem.djBIcL : null, (1023 & 256) != 0 ? alertDataUiItem.EZpvd : false, (1023 & 512) != 0 ? alertDataUiItem.KWHzl : false, (1023 & 1024) != 0 ? alertDataUiItem.AYXKKw : z));
                    arrayList4 = arrayList5;
                    alertGroupUiItem = alertGroupUiItem;
                }
                AlertGroupUiItem alertGroupUiItem2 = alertGroupUiItem;
                alertGroupUiItemKWHzl = alertGroupUiItem2.KWHzl((8191 & 1) != 0 ? alertGroupUiItem2.KWHzl : null, (8191 & 2) != 0 ? alertGroupUiItem2.copydefault : null, (8191 & 4) != 0 ? alertGroupUiItem2.djBIcL : null, (8191 & 8) != 0 ? alertGroupUiItem2.fetchVPNInfo : null, (8191 & 16) != 0 ? alertGroupUiItem2.AkhnZx : null, (8191 & 32) != 0 ? alertGroupUiItem2.values : null, (8191 & 64) != 0 ? alertGroupUiItem2.OLrzqt : null, (8191 & 128) != 0 ? alertGroupUiItem2.AEQbTJ : arrayList4, (8191 & 256) != 0 ? alertGroupUiItem2.AYXKKw : false, (8191 & 512) != 0 ? alertGroupUiItem2.gEmmrt : false, (8191 & 1024) != 0 ? alertGroupUiItem2.valueOf : false, (8191 & 2048) != 0 ? alertGroupUiItem2.EZpvd : false, (8191 & 4096) != 0 ? alertGroupUiItem2.AhwBna : z);
                i2 = 10;
            } else {
                java.util.List<AlertDataUiItem> listEZpvd2 = alertGroupUiItem.EZpvd();
                if ((listEZpvd2 instanceof java.util.Collection) && listEZpvd2.isEmpty()) {
                    i2 = 10;
                    alertGroupUiItemKWHzl = alertGroupUiItem.KWHzl((8191 & 1) != 0 ? alertGroupUiItem.KWHzl : null, (8191 & 2) != 0 ? alertGroupUiItem.copydefault : null, (8191 & 4) != 0 ? alertGroupUiItem.djBIcL : null, (8191 & 8) != 0 ? alertGroupUiItem.fetchVPNInfo : null, (8191 & 16) != 0 ? alertGroupUiItem.AkhnZx : null, (8191 & 32) != 0 ? alertGroupUiItem.values : null, (8191 & 64) != 0 ? alertGroupUiItem.OLrzqt : null, (8191 & 128) != 0 ? alertGroupUiItem.AEQbTJ : null, (8191 & 256) != 0 ? alertGroupUiItem.AYXKKw : false, (8191 & 512) != 0 ? alertGroupUiItem.gEmmrt : false, (8191 & 1024) != 0 ? alertGroupUiItem.valueOf : false, (8191 & 2048) != 0 ? alertGroupUiItem.EZpvd : false, (8191 & 4096) != 0 ? alertGroupUiItem.AhwBna : false);
                } else {
                    java.util.Iterator<T> it = listEZpvd2.iterator();
                    while (it.hasNext()) {
                        if (Intrinsics.EZpvd((java.lang.Object) ((AlertDataUiItem) it.next()).OLrzqt(), (java.lang.Object) alertUiItem.OLrzqt())) {
                            int size = alertGroupUiItem.EZpvd().size();
                            java.util.List<AlertDataUiItem> listEZpvd3 = alertGroupUiItem.EZpvd();
                            if ((listEZpvd3 instanceof java.util.Collection) && listEZpvd3.isEmpty()) {
                                i = 0;
                            } else {
                                i = 0;
                                for (AlertDataUiItem alertDataUiItem2 : listEZpvd3) {
                                    if ((!Intrinsics.EZpvd((java.lang.Object) alertDataUiItem2.OLrzqt(), (java.lang.Object) alertUiItem.OLrzqt()) && alertDataUiItem2.fetchVPNInfo()) || (Intrinsics.EZpvd((java.lang.Object) alertDataUiItem2.OLrzqt(), (java.lang.Object) alertUiItem.OLrzqt()) && z)) {
                                        i++;
                                        if (i < 0) {
                                            yDY.djBIcL();
                                        }
                                    }
                                }
                            }
                            boolean z2 = size == i;
                            java.util.List<AlertDataUiItem> listEZpvd4 = alertGroupUiItem.EZpvd();
                            int i5 = 10;
                            java.util.ArrayList arrayList6 = new java.util.ArrayList(C56403yEb.AYXKKw(listEZpvd4, 10));
                            for (AlertDataUiItem alertDataUiItem3 : listEZpvd4) {
                                if (alertDataUiItem3.EZpvd(alertUiItem)) {
                                    i3 = i5;
                                    arrayList = arrayList6;
                                    alertDataUiItemAEQbTJ = alertDataUiItem3.AEQbTJ((1023 & 1) != 0 ? alertDataUiItem3.AEQbTJ : null, (1023 & 2) != 0 ? alertDataUiItem3.copydefault : null, (1023 & 4) != 0 ? alertDataUiItem3.gEmmrt : null, (1023 & 8) != 0 ? alertDataUiItem3.AkhnZx : null, (1023 & 16) != 0 ? alertDataUiItem3.OLrzqt : null, (1023 & 32) != 0 ? alertDataUiItem3.valueOf : null, (1023 & 64) != 0 ? alertDataUiItem3.AhwBna : null, (1023 & 128) != 0 ? alertDataUiItem3.djBIcL : null, (1023 & 256) != 0 ? alertDataUiItem3.EZpvd : false, (1023 & 512) != 0 ? alertDataUiItem3.KWHzl : false, (1023 & 1024) != 0 ? alertDataUiItem3.AYXKKw : z);
                                } else {
                                    i3 = i5;
                                    arrayList = arrayList6;
                                    alertDataUiItemAEQbTJ = alertDataUiItem3.AEQbTJ((1023 & 1) != 0 ? alertDataUiItem3.AEQbTJ : null, (1023 & 2) != 0 ? alertDataUiItem3.copydefault : null, (1023 & 4) != 0 ? alertDataUiItem3.gEmmrt : null, (1023 & 8) != 0 ? alertDataUiItem3.AkhnZx : null, (1023 & 16) != 0 ? alertDataUiItem3.OLrzqt : null, (1023 & 32) != 0 ? alertDataUiItem3.valueOf : null, (1023 & 64) != 0 ? alertDataUiItem3.AhwBna : null, (1023 & 128) != 0 ? alertDataUiItem3.djBIcL : null, (1023 & 256) != 0 ? alertDataUiItem3.EZpvd : false, (1023 & 512) != 0 ? alertDataUiItem3.KWHzl : false, (1023 & 1024) != 0 ? alertDataUiItem3.AYXKKw : false);
                                }
                                java.util.ArrayList arrayList7 = arrayList;
                                arrayList7.add(alertDataUiItemAEQbTJ);
                                arrayList6 = arrayList7;
                                i5 = i3;
                            }
                            i2 = i5;
                            alertGroupUiItemKWHzl = alertGroupUiItem.KWHzl((8191 & 1) != 0 ? alertGroupUiItem.KWHzl : null, (8191 & 2) != 0 ? alertGroupUiItem.copydefault : null, (8191 & 4) != 0 ? alertGroupUiItem.djBIcL : null, (8191 & 8) != 0 ? alertGroupUiItem.fetchVPNInfo : null, (8191 & 16) != 0 ? alertGroupUiItem.AkhnZx : null, (8191 & 32) != 0 ? alertGroupUiItem.values : null, (8191 & 64) != 0 ? alertGroupUiItem.OLrzqt : null, (8191 & 128) != 0 ? alertGroupUiItem.AEQbTJ : arrayList6, (8191 & 256) != 0 ? alertGroupUiItem.AYXKKw : false, (8191 & 512) != 0 ? alertGroupUiItem.gEmmrt : false, (8191 & 1024) != 0 ? alertGroupUiItem.valueOf : false, (8191 & 2048) != 0 ? alertGroupUiItem.EZpvd : false, (8191 & 4096) != 0 ? alertGroupUiItem.AhwBna : z2);
                        }
                    }
                    i2 = 10;
                    alertGroupUiItemKWHzl = alertGroupUiItem.KWHzl((8191 & 1) != 0 ? alertGroupUiItem.KWHzl : null, (8191 & 2) != 0 ? alertGroupUiItem.copydefault : null, (8191 & 4) != 0 ? alertGroupUiItem.djBIcL : null, (8191 & 8) != 0 ? alertGroupUiItem.fetchVPNInfo : null, (8191 & 16) != 0 ? alertGroupUiItem.AkhnZx : null, (8191 & 32) != 0 ? alertGroupUiItem.values : null, (8191 & 64) != 0 ? alertGroupUiItem.OLrzqt : null, (8191 & 128) != 0 ? alertGroupUiItem.AEQbTJ : null, (8191 & 256) != 0 ? alertGroupUiItem.AYXKKw : false, (8191 & 512) != 0 ? alertGroupUiItem.gEmmrt : false, (8191 & 1024) != 0 ? alertGroupUiItem.valueOf : false, (8191 & 2048) != 0 ? alertGroupUiItem.EZpvd : false, (8191 & 4096) != 0 ? alertGroupUiItem.AhwBna : false);
                }
            }
            arrayList3.add(alertGroupUiItemKWHzl);
            i4 = i2;
        }
        return EZpvd(arrayList3);
    }

    public static final java.util.List<AlertUiItem> EZpvd(@NotNull java.util.List<AlertGroupUiItem> list) {
        java.util.List listEZpvd;
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (AlertGroupUiItem alertGroupUiItem : list) {
            if (alertGroupUiItem.AhwBna()) {
                listEZpvd = CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) C56402yEa.EZpvd(alertGroupUiItem.KWHzl((8191 & 1) != 0 ? alertGroupUiItem.KWHzl : null, (8191 & 2) != 0 ? alertGroupUiItem.copydefault : null, (8191 & 4) != 0 ? alertGroupUiItem.djBIcL : null, (8191 & 8) != 0 ? alertGroupUiItem.fetchVPNInfo : null, (8191 & 16) != 0 ? alertGroupUiItem.AkhnZx : null, (8191 & 32) != 0 ? alertGroupUiItem.values : null, (8191 & 64) != 0 ? alertGroupUiItem.OLrzqt : null, (8191 & 128) != 0 ? alertGroupUiItem.AEQbTJ : null, (8191 & 256) != 0 ? alertGroupUiItem.AYXKKw : false, (8191 & 512) != 0 ? alertGroupUiItem.gEmmrt : false, (8191 & 1024) != 0 ? alertGroupUiItem.valueOf : false, (8191 & 2048) != 0 ? alertGroupUiItem.EZpvd : false, (8191 & 4096) != 0 ? alertGroupUiItem.AhwBna : false)), (java.lang.Iterable) alertGroupUiItem.EZpvd());
            } else {
                listEZpvd = C56402yEa.EZpvd(alertGroupUiItem.KWHzl((8191 & 1) != 0 ? alertGroupUiItem.KWHzl : null, (8191 & 2) != 0 ? alertGroupUiItem.copydefault : null, (8191 & 4) != 0 ? alertGroupUiItem.djBIcL : null, (8191 & 8) != 0 ? alertGroupUiItem.fetchVPNInfo : null, (8191 & 16) != 0 ? alertGroupUiItem.AkhnZx : null, (8191 & 32) != 0 ? alertGroupUiItem.values : null, (8191 & 64) != 0 ? alertGroupUiItem.OLrzqt : null, (8191 & 128) != 0 ? alertGroupUiItem.AEQbTJ : null, (8191 & 256) != 0 ? alertGroupUiItem.AYXKKw : false, (8191 & 512) != 0 ? alertGroupUiItem.gEmmrt : false, (8191 & 1024) != 0 ? alertGroupUiItem.valueOf : false, (8191 & 2048) != 0 ? alertGroupUiItem.EZpvd : false, (8191 & 4096) != 0 ? alertGroupUiItem.AhwBna : false));
            }
            C56406yEe.KWHzl(arrayList, listEZpvd);
        }
        return arrayList;
    }

    public static final java.util.List<AlertUiItem> copydefault(@NotNull java.util.List<? extends AlertUiItem> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList<AlertGroupUiItem> arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (obj instanceof AlertGroupUiItem) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        for (AlertGroupUiItem alertGroupUiItem : arrayList) {
            java.util.List<AlertDataUiItem> listEZpvd = alertGroupUiItem.EZpvd();
            java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(listEZpvd, 10));
            for (AlertDataUiItem alertDataUiItem : listEZpvd) {
                arrayList3.add(alertDataUiItem.AEQbTJ((1023 & 1) != 0 ? alertDataUiItem.AEQbTJ : null, (1023 & 2) != 0 ? alertDataUiItem.copydefault : null, (1023 & 4) != 0 ? alertDataUiItem.gEmmrt : null, (1023 & 8) != 0 ? alertDataUiItem.AkhnZx : null, (1023 & 16) != 0 ? alertDataUiItem.OLrzqt : null, (1023 & 32) != 0 ? alertDataUiItem.valueOf : null, (1023 & 64) != 0 ? alertDataUiItem.AhwBna : null, (1023 & 128) != 0 ? alertDataUiItem.djBIcL : null, (1023 & 256) != 0 ? alertDataUiItem.EZpvd : false, (1023 & 512) != 0 ? alertDataUiItem.KWHzl : true, (1023 & 1024) != 0 ? alertDataUiItem.AYXKKw : false));
            }
            arrayList2.add(alertGroupUiItem.KWHzl((8191 & 1) != 0 ? alertGroupUiItem.KWHzl : null, (8191 & 2) != 0 ? alertGroupUiItem.copydefault : null, (8191 & 4) != 0 ? alertGroupUiItem.djBIcL : null, (8191 & 8) != 0 ? alertGroupUiItem.fetchVPNInfo : null, (8191 & 16) != 0 ? alertGroupUiItem.AkhnZx : null, (8191 & 32) != 0 ? alertGroupUiItem.values : null, (8191 & 64) != 0 ? alertGroupUiItem.OLrzqt : null, (8191 & 128) != 0 ? alertGroupUiItem.AEQbTJ : arrayList3, (8191 & 256) != 0 ? alertGroupUiItem.AYXKKw : false, (8191 & 512) != 0 ? alertGroupUiItem.gEmmrt : false, (8191 & 1024) != 0 ? alertGroupUiItem.valueOf : false, (8191 & 2048) != 0 ? alertGroupUiItem.EZpvd : true, (8191 & 4096) != 0 ? alertGroupUiItem.AhwBna : false));
        }
        return EZpvd(arrayList2);
    }

    public static final java.util.List<AlertUiItem> OLrzqt(@NotNull java.util.List<? extends AlertUiItem> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList<AlertGroupUiItem> arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (obj instanceof AlertGroupUiItem) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        for (AlertGroupUiItem alertGroupUiItem : arrayList) {
            java.util.List<AlertDataUiItem> listEZpvd = alertGroupUiItem.EZpvd();
            java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(listEZpvd, 10));
            for (AlertDataUiItem alertDataUiItem : listEZpvd) {
                arrayList3.add(alertDataUiItem.AEQbTJ((1023 & 1) != 0 ? alertDataUiItem.AEQbTJ : null, (1023 & 2) != 0 ? alertDataUiItem.copydefault : null, (1023 & 4) != 0 ? alertDataUiItem.gEmmrt : null, (1023 & 8) != 0 ? alertDataUiItem.AkhnZx : null, (1023 & 16) != 0 ? alertDataUiItem.OLrzqt : null, (1023 & 32) != 0 ? alertDataUiItem.valueOf : null, (1023 & 64) != 0 ? alertDataUiItem.AhwBna : null, (1023 & 128) != 0 ? alertDataUiItem.djBIcL : null, (1023 & 256) != 0 ? alertDataUiItem.EZpvd : false, (1023 & 512) != 0 ? alertDataUiItem.KWHzl : false, (1023 & 1024) != 0 ? alertDataUiItem.AYXKKw : false));
            }
            arrayList2.add(alertGroupUiItem.KWHzl((8191 & 1) != 0 ? alertGroupUiItem.KWHzl : null, (8191 & 2) != 0 ? alertGroupUiItem.copydefault : null, (8191 & 4) != 0 ? alertGroupUiItem.djBIcL : null, (8191 & 8) != 0 ? alertGroupUiItem.fetchVPNInfo : null, (8191 & 16) != 0 ? alertGroupUiItem.AkhnZx : null, (8191 & 32) != 0 ? alertGroupUiItem.values : null, (8191 & 64) != 0 ? alertGroupUiItem.OLrzqt : null, (8191 & 128) != 0 ? alertGroupUiItem.AEQbTJ : arrayList3, (8191 & 256) != 0 ? alertGroupUiItem.AYXKKw : false, (8191 & 512) != 0 ? alertGroupUiItem.gEmmrt : false, (8191 & 1024) != 0 ? alertGroupUiItem.valueOf : false, (8191 & 2048) != 0 ? alertGroupUiItem.EZpvd : false, (8191 & 4096) != 0 ? alertGroupUiItem.AhwBna : false));
        }
        return EZpvd(arrayList2);
    }

    public static final java.util.List<AlertUiItem> EZpvd(@NotNull java.util.List<? extends AlertUiItem> list, @NotNull AlertGroupUiItem alertGroupUiItem) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(alertGroupUiItem, "");
        java.util.ArrayList<AlertGroupUiItem> arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (obj instanceof AlertGroupUiItem) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        for (AlertGroupUiItem alertGroupUiItem2 : arrayList) {
            arrayList2.add(alertGroupUiItem2.KWHzl((8191 & 1) != 0 ? alertGroupUiItem2.KWHzl : null, (8191 & 2) != 0 ? alertGroupUiItem2.copydefault : null, (8191 & 4) != 0 ? alertGroupUiItem2.djBIcL : null, (8191 & 8) != 0 ? alertGroupUiItem2.fetchVPNInfo : null, (8191 & 16) != 0 ? alertGroupUiItem2.AkhnZx : null, (8191 & 32) != 0 ? alertGroupUiItem2.values : null, (8191 & 64) != 0 ? alertGroupUiItem2.OLrzqt : null, (8191 & 128) != 0 ? alertGroupUiItem2.AEQbTJ : null, (8191 & 256) != 0 ? alertGroupUiItem2.AYXKKw : false, (8191 & 512) != 0 ? alertGroupUiItem2.gEmmrt : alertGroupUiItem2.AEQbTJ(alertGroupUiItem), (8191 & 1024) != 0 ? alertGroupUiItem2.valueOf : false, (8191 & 2048) != 0 ? alertGroupUiItem2.EZpvd : false, (8191 & 4096) != 0 ? alertGroupUiItem2.AhwBna : false));
        }
        return EZpvd(arrayList2);
    }

    public static final java.util.List<AlertUiItem> KWHzl(@NotNull java.util.List<? extends AlertUiItem> list, @NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (obj instanceof AlertGroupUiItem) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj2 : arrayList) {
            AlertGroupUiItem alertGroupUiItem = (AlertGroupUiItem) obj2;
            if (Intrinsics.EZpvd((java.lang.Object) alertGroupUiItem.djBIcL(), (java.lang.Object) str) && Intrinsics.EZpvd((java.lang.Object) alertGroupUiItem.KWHzl(), (java.lang.Object) str2)) {
                arrayList2.add(obj2);
            } else {
                arrayList3.add(obj2);
            }
        }
        kotlin.Pair pair = new kotlin.Pair(arrayList2, arrayList3);
        java.util.List<AlertGroupUiItem> list2 = (java.util.List) pair.component1();
        java.util.List<AlertGroupUiItem> list3 = (java.util.List) pair.component2();
        java.util.ArrayList arrayList4 = new java.util.ArrayList(C56403yEb.AYXKKw(list2, 10));
        for (AlertGroupUiItem alertGroupUiItem2 : list2) {
            arrayList4.add(alertGroupUiItem2.KWHzl((8191 & 1) != 0 ? alertGroupUiItem2.KWHzl : null, (8191 & 2) != 0 ? alertGroupUiItem2.copydefault : null, (8191 & 4) != 0 ? alertGroupUiItem2.djBIcL : null, (8191 & 8) != 0 ? alertGroupUiItem2.fetchVPNInfo : null, (8191 & 16) != 0 ? alertGroupUiItem2.AkhnZx : null, (8191 & 32) != 0 ? alertGroupUiItem2.values : null, (8191 & 64) != 0 ? alertGroupUiItem2.OLrzqt : null, (8191 & 128) != 0 ? alertGroupUiItem2.AEQbTJ : null, (8191 & 256) != 0 ? alertGroupUiItem2.AYXKKw : false, (8191 & 512) != 0 ? alertGroupUiItem2.gEmmrt : true, (8191 & 1024) != 0 ? alertGroupUiItem2.valueOf : z, (8191 & 2048) != 0 ? alertGroupUiItem2.EZpvd : false, (8191 & 4096) != 0 ? alertGroupUiItem2.AhwBna : false));
        }
        java.util.ArrayList arrayList5 = new java.util.ArrayList(C56403yEb.AYXKKw(list3, 10));
        for (AlertGroupUiItem alertGroupUiItem3 : list3) {
            arrayList5.add(alertGroupUiItem3.KWHzl((8191 & 1) != 0 ? alertGroupUiItem3.KWHzl : null, (8191 & 2) != 0 ? alertGroupUiItem3.copydefault : null, (8191 & 4) != 0 ? alertGroupUiItem3.djBIcL : null, (8191 & 8) != 0 ? alertGroupUiItem3.fetchVPNInfo : null, (8191 & 16) != 0 ? alertGroupUiItem3.AkhnZx : null, (8191 & 32) != 0 ? alertGroupUiItem3.values : null, (8191 & 64) != 0 ? alertGroupUiItem3.OLrzqt : null, (8191 & 128) != 0 ? alertGroupUiItem3.AEQbTJ : null, (8191 & 256) != 0 ? alertGroupUiItem3.AYXKKw : false, (8191 & 512) != 0 ? alertGroupUiItem3.gEmmrt : false, (8191 & 1024) != 0 ? alertGroupUiItem3.valueOf : false, (8191 & 2048) != 0 ? alertGroupUiItem3.EZpvd : false, (8191 & 4096) != 0 ? alertGroupUiItem3.AhwBna : false));
        }
        return EZpvd(CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) arrayList4, (java.lang.Iterable) arrayList5));
    }

    public static final java.util.List<AlertUiItem> copydefault(java.util.List<? extends AlertUiItem> list, AlertGroupUiItem alertGroupUiItem, java.lang.String str, java.lang.String str2) {
        java.lang.Object next;
        AlertGroupUiItem alertGroupUiItemKWHzl;
        java.util.ArrayList<AlertGroupUiItem> arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (obj instanceof AlertGroupUiItem) {
                arrayList.add(obj);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((AlertGroupUiItem) next).copydefault()) {
                break;
            }
        }
        AlertGroupUiItem alertGroupUiItem2 = (AlertGroupUiItem) next;
        for (AlertGroupUiItem alertGroupUiItem3 : arrayList) {
            if (alertGroupUiItem3.AEQbTJ(alertGroupUiItem)) {
                if (alertGroupUiItem2 != null) {
                    if (!alertGroupUiItem2.AEQbTJ(alertGroupUiItem)) {
                        java.util.List listGEmmrt = yDY.gEmmrt(alertGroupUiItem2.KWHzl((8191 & 1) != 0 ? alertGroupUiItem2.KWHzl : null, (8191 & 2) != 0 ? alertGroupUiItem2.copydefault : null, (8191 & 4) != 0 ? alertGroupUiItem2.djBIcL : null, (8191 & 8) != 0 ? alertGroupUiItem2.fetchVPNInfo : null, (8191 & 16) != 0 ? alertGroupUiItem2.AkhnZx : null, (8191 & 32) != 0 ? alertGroupUiItem2.values : null, (8191 & 64) != 0 ? alertGroupUiItem2.OLrzqt : null, (8191 & 128) != 0 ? alertGroupUiItem2.AEQbTJ : null, (8191 & 256) != 0 ? alertGroupUiItem2.AYXKKw : false, (8191 & 512) != 0 ? alertGroupUiItem2.gEmmrt : false, (8191 & 1024) != 0 ? alertGroupUiItem2.valueOf : false, (8191 & 2048) != 0 ? alertGroupUiItem2.EZpvd : false, (8191 & 4096) != 0 ? alertGroupUiItem2.AhwBna : false), alertGroupUiItem3.KWHzl((8191 & 1) != 0 ? alertGroupUiItem3.KWHzl : null, (8191 & 2) != 0 ? alertGroupUiItem3.copydefault : null, (8191 & 4) != 0 ? alertGroupUiItem3.djBIcL : null, (8191 & 8) != 0 ? alertGroupUiItem3.fetchVPNInfo : null, (8191 & 16) != 0 ? alertGroupUiItem3.AkhnZx : null, (8191 & 32) != 0 ? alertGroupUiItem3.values : null, (8191 & 64) != 0 ? alertGroupUiItem3.OLrzqt : null, (8191 & 128) != 0 ? alertGroupUiItem3.AEQbTJ : null, (8191 & 256) != 0 ? alertGroupUiItem3.AYXKKw : false, (8191 & 512) != 0 ? alertGroupUiItem3.gEmmrt : true, (8191 & 1024) != 0 ? alertGroupUiItem3.valueOf : false, (8191 & 2048) != 0 ? alertGroupUiItem3.EZpvd : false, (8191 & 4096) != 0 ? alertGroupUiItem3.AhwBna : false));
                        java.util.ArrayList<AlertGroupUiItem> arrayList2 = new java.util.ArrayList();
                        for (java.lang.Object obj2 : arrayList) {
                            AlertGroupUiItem alertGroupUiItem4 = (AlertGroupUiItem) obj2;
                            if (!alertGroupUiItem4.AEQbTJ(alertGroupUiItem2) && !alertGroupUiItem4.AEQbTJ(alertGroupUiItem3)) {
                                arrayList2.add(obj2);
                            }
                        }
                        java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList2, 10));
                        for (AlertGroupUiItem alertGroupUiItem5 : arrayList2) {
                            arrayList3.add(alertGroupUiItem5.KWHzl((8191 & 1) != 0 ? alertGroupUiItem5.KWHzl : null, (8191 & 2) != 0 ? alertGroupUiItem5.copydefault : null, (8191 & 4) != 0 ? alertGroupUiItem5.djBIcL : null, (8191 & 8) != 0 ? alertGroupUiItem5.fetchVPNInfo : null, (8191 & 16) != 0 ? alertGroupUiItem5.AkhnZx : null, (8191 & 32) != 0 ? alertGroupUiItem5.values : null, (8191 & 64) != 0 ? alertGroupUiItem5.OLrzqt : null, (8191 & 128) != 0 ? alertGroupUiItem5.AEQbTJ : null, (8191 & 256) != 0 ? alertGroupUiItem5.AYXKKw : false, (8191 & 512) != 0 ? alertGroupUiItem5.gEmmrt : false, (8191 & 1024) != 0 ? alertGroupUiItem5.valueOf : false, (8191 & 2048) != 0 ? alertGroupUiItem5.EZpvd : false, (8191 & 4096) != 0 ? alertGroupUiItem5.AhwBna : false));
                        }
                        return EZpvd(CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) listGEmmrt, (java.lang.Iterable) arrayList3));
                    }
                    java.util.ArrayList arrayList4 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
                    for (AlertGroupUiItem alertGroupUiItem6 : arrayList) {
                        if (alertGroupUiItem6.AEQbTJ(alertGroupUiItem)) {
                            alertGroupUiItemKWHzl = alertGroupUiItem6.KWHzl((8191 & 1) != 0 ? alertGroupUiItem6.KWHzl : null, (8191 & 2) != 0 ? alertGroupUiItem6.copydefault : null, (8191 & 4) != 0 ? alertGroupUiItem6.djBIcL : null, (8191 & 8) != 0 ? alertGroupUiItem6.fetchVPNInfo : null, (8191 & 16) != 0 ? alertGroupUiItem6.AkhnZx : null, (8191 & 32) != 0 ? alertGroupUiItem6.values : null, (8191 & 64) != 0 ? alertGroupUiItem6.OLrzqt : null, (8191 & 128) != 0 ? alertGroupUiItem6.AEQbTJ : null, (8191 & 256) != 0 ? alertGroupUiItem6.AYXKKw : false, (8191 & 512) != 0 ? alertGroupUiItem6.gEmmrt : true, (8191 & 1024) != 0 ? alertGroupUiItem6.valueOf : false, (8191 & 2048) != 0 ? alertGroupUiItem6.EZpvd : false, (8191 & 4096) != 0 ? alertGroupUiItem6.AhwBna : false);
                        } else {
                            alertGroupUiItemKWHzl = alertGroupUiItem6.KWHzl((8191 & 1) != 0 ? alertGroupUiItem6.KWHzl : null, (8191 & 2) != 0 ? alertGroupUiItem6.copydefault : null, (8191 & 4) != 0 ? alertGroupUiItem6.djBIcL : null, (8191 & 8) != 0 ? alertGroupUiItem6.fetchVPNInfo : null, (8191 & 16) != 0 ? alertGroupUiItem6.AkhnZx : null, (8191 & 32) != 0 ? alertGroupUiItem6.values : null, (8191 & 64) != 0 ? alertGroupUiItem6.OLrzqt : null, (8191 & 128) != 0 ? alertGroupUiItem6.AEQbTJ : null, (8191 & 256) != 0 ? alertGroupUiItem6.AYXKKw : false, (8191 & 512) != 0 ? alertGroupUiItem6.gEmmrt : false, (8191 & 1024) != 0 ? alertGroupUiItem6.valueOf : false, (8191 & 2048) != 0 ? alertGroupUiItem6.EZpvd : false, (8191 & 4096) != 0 ? alertGroupUiItem6.AhwBna : false);
                        }
                        arrayList4.add(alertGroupUiItemKWHzl);
                    }
                    return EZpvd(arrayList4);
                }
                return KWHzl(list, alertGroupUiItem.djBIcL(), alertGroupUiItem.KWHzl(), Intrinsics.EZpvd((java.lang.Object) alertGroupUiItem.djBIcL(), (java.lang.Object) str) && Intrinsics.EZpvd((java.lang.Object) alertGroupUiItem.KWHzl(), (java.lang.Object) str2));
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public static final java.util.List<AlertUiItem> KWHzl(@NotNull java.util.List<? extends AlertUiItem> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList<AlertGroupUiItem> arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (obj instanceof AlertGroupUiItem) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        for (AlertGroupUiItem alertGroupUiItem : arrayList) {
            arrayList2.add(alertGroupUiItem.KWHzl((8191 & 1) != 0 ? alertGroupUiItem.KWHzl : null, (8191 & 2) != 0 ? alertGroupUiItem.copydefault : null, (8191 & 4) != 0 ? alertGroupUiItem.djBIcL : null, (8191 & 8) != 0 ? alertGroupUiItem.fetchVPNInfo : null, (8191 & 16) != 0 ? alertGroupUiItem.AkhnZx : null, (8191 & 32) != 0 ? alertGroupUiItem.values : null, (8191 & 64) != 0 ? alertGroupUiItem.OLrzqt : null, (8191 & 128) != 0 ? alertGroupUiItem.AEQbTJ : null, (8191 & 256) != 0 ? alertGroupUiItem.AYXKKw : false, (8191 & 512) != 0 ? alertGroupUiItem.gEmmrt : false, (8191 & 1024) != 0 ? alertGroupUiItem.valueOf : false, (8191 & 2048) != 0 ? alertGroupUiItem.EZpvd : false, (8191 & 4096) != 0 ? alertGroupUiItem.AhwBna : false));
        }
        return EZpvd(arrayList2);
    }

    public static final java.util.List<AlertUiItem> EZpvd(@NotNull java.util.List<? extends AlertUiItem> list, boolean z) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList<AlertGroupUiItem> arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (obj instanceof AlertGroupUiItem) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        for (AlertGroupUiItem alertGroupUiItem : arrayList) {
            java.util.List<AlertDataUiItem> listEZpvd = alertGroupUiItem.EZpvd();
            java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(listEZpvd, 10));
            for (AlertDataUiItem alertDataUiItem : listEZpvd) {
                arrayList3.add(alertDataUiItem.AEQbTJ((1023 & 1) != 0 ? alertDataUiItem.AEQbTJ : null, (1023 & 2) != 0 ? alertDataUiItem.copydefault : null, (1023 & 4) != 0 ? alertDataUiItem.gEmmrt : null, (1023 & 8) != 0 ? alertDataUiItem.AkhnZx : null, (1023 & 16) != 0 ? alertDataUiItem.OLrzqt : null, (1023 & 32) != 0 ? alertDataUiItem.valueOf : null, (1023 & 64) != 0 ? alertDataUiItem.AhwBna : null, (1023 & 128) != 0 ? alertDataUiItem.djBIcL : null, (1023 & 256) != 0 ? alertDataUiItem.EZpvd : false, (1023 & 512) != 0 ? alertDataUiItem.KWHzl : false, (1023 & 1024) != 0 ? alertDataUiItem.AYXKKw : z));
            }
            arrayList2.add(alertGroupUiItem.KWHzl((8191 & 1) != 0 ? alertGroupUiItem.KWHzl : null, (8191 & 2) != 0 ? alertGroupUiItem.copydefault : null, (8191 & 4) != 0 ? alertGroupUiItem.djBIcL : null, (8191 & 8) != 0 ? alertGroupUiItem.fetchVPNInfo : null, (8191 & 16) != 0 ? alertGroupUiItem.AkhnZx : null, (8191 & 32) != 0 ? alertGroupUiItem.values : null, (8191 & 64) != 0 ? alertGroupUiItem.OLrzqt : null, (8191 & 128) != 0 ? alertGroupUiItem.AEQbTJ : arrayList3, (8191 & 256) != 0 ? alertGroupUiItem.AYXKKw : false, (8191 & 512) != 0 ? alertGroupUiItem.gEmmrt : false, (8191 & 1024) != 0 ? alertGroupUiItem.valueOf : false, (8191 & 2048) != 0 ? alertGroupUiItem.EZpvd : false, (8191 & 4096) != 0 ? alertGroupUiItem.AhwBna : z));
        }
        return EZpvd(arrayList2);
    }

    public static final java.util.List<AlertUiItem> KWHzl(@NotNull java.util.List<? extends AlertUiItem> list, @NotNull java.util.List<java.lang.String> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (obj instanceof AlertGroupUiItem) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList<AlertGroupUiItem> arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj2 : arrayList) {
            java.util.List<AlertDataUiItem> listEZpvd = ((AlertGroupUiItem) obj2).EZpvd();
            if (!(listEZpvd instanceof java.util.Collection) || !listEZpvd.isEmpty()) {
                java.util.Iterator<T> it = listEZpvd.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (!list2.contains(((AlertDataUiItem) it.next()).OLrzqt())) {
                        arrayList2.add(obj2);
                        break;
                    }
                }
            }
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList2, 10));
        for (AlertGroupUiItem alertGroupUiItem : arrayList2) {
            java.util.List<AlertDataUiItem> listEZpvd2 = alertGroupUiItem.EZpvd();
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            for (java.lang.Object obj3 : listEZpvd2) {
                if (!list2.contains(((AlertDataUiItem) obj3).OLrzqt())) {
                    arrayList4.add(obj3);
                }
            }
            arrayList3.add(alertGroupUiItem.KWHzl((8191 & 1) != 0 ? alertGroupUiItem.KWHzl : null, (8191 & 2) != 0 ? alertGroupUiItem.copydefault : null, (8191 & 4) != 0 ? alertGroupUiItem.djBIcL : null, (8191 & 8) != 0 ? alertGroupUiItem.fetchVPNInfo : null, (8191 & 16) != 0 ? alertGroupUiItem.AkhnZx : null, (8191 & 32) != 0 ? alertGroupUiItem.values : null, (8191 & 64) != 0 ? alertGroupUiItem.OLrzqt : null, (8191 & 128) != 0 ? alertGroupUiItem.AEQbTJ : arrayList4, (8191 & 256) != 0 ? alertGroupUiItem.AYXKKw : false, (8191 & 512) != 0 ? alertGroupUiItem.gEmmrt : false, (8191 & 1024) != 0 ? alertGroupUiItem.valueOf : false, (8191 & 2048) != 0 ? alertGroupUiItem.EZpvd : false, (8191 & 4096) != 0 ? alertGroupUiItem.AhwBna : false));
        }
        return EZpvd(arrayList3);
    }

    public static final java.util.List<AlertUiItem> copydefault(@NotNull java.util.List<? extends AlertUiItem> list, @NotNull AlertDataUiItem alertDataUiItem) {
        java.util.ArrayList arrayList;
        int i;
        AlertDataUiItem alertDataUiItemAEQbTJ;
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(alertDataUiItem, "");
        java.util.ArrayList<AlertGroupUiItem> arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (obj instanceof AlertGroupUiItem) {
                arrayList2.add(obj);
            }
        }
        int i2 = 10;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList2, 10));
        for (AlertGroupUiItem alertGroupUiItem : arrayList2) {
            java.util.List<AlertDataUiItem> listEZpvd = alertGroupUiItem.EZpvd();
            java.util.ArrayList arrayList4 = new java.util.ArrayList(C56403yEb.AYXKKw(listEZpvd, i2));
            for (AlertDataUiItem alertDataUiItem2 : listEZpvd) {
                if (alertDataUiItem2.EZpvd(alertDataUiItem)) {
                    arrayList = arrayList4;
                    i = i2;
                    alertDataUiItemAEQbTJ = alertDataUiItem.AEQbTJ((1023 & 1) != 0 ? alertDataUiItem.AEQbTJ : null, (1023 & 2) != 0 ? alertDataUiItem.copydefault : null, (1023 & 4) != 0 ? alertDataUiItem.gEmmrt : null, (1023 & 8) != 0 ? alertDataUiItem.AkhnZx : null, (1023 & 16) != 0 ? alertDataUiItem.OLrzqt : null, (1023 & 32) != 0 ? alertDataUiItem.valueOf : null, (1023 & 64) != 0 ? alertDataUiItem.AhwBna : null, (1023 & 128) != 0 ? alertDataUiItem.djBIcL : null, (1023 & 256) != 0 ? alertDataUiItem.EZpvd : !alertDataUiItem.EZpvd(), (1023 & 512) != 0 ? alertDataUiItem.KWHzl : false, (1023 & 1024) != 0 ? alertDataUiItem.AYXKKw : false);
                } else {
                    arrayList = arrayList4;
                    i = i2;
                    alertDataUiItemAEQbTJ = alertDataUiItem2.AEQbTJ((1023 & 1) != 0 ? alertDataUiItem2.AEQbTJ : null, (1023 & 2) != 0 ? alertDataUiItem2.copydefault : null, (1023 & 4) != 0 ? alertDataUiItem2.gEmmrt : null, (1023 & 8) != 0 ? alertDataUiItem2.AkhnZx : null, (1023 & 16) != 0 ? alertDataUiItem2.OLrzqt : null, (1023 & 32) != 0 ? alertDataUiItem2.valueOf : null, (1023 & 64) != 0 ? alertDataUiItem2.AhwBna : null, (1023 & 128) != 0 ? alertDataUiItem2.djBIcL : null, (1023 & 256) != 0 ? alertDataUiItem2.EZpvd : false, (1023 & 512) != 0 ? alertDataUiItem2.KWHzl : false, (1023 & 1024) != 0 ? alertDataUiItem2.AYXKKw : false);
                }
                java.util.ArrayList arrayList5 = arrayList;
                arrayList5.add(alertDataUiItemAEQbTJ);
                arrayList4 = arrayList5;
                i2 = i;
            }
            arrayList3.add(alertGroupUiItem.KWHzl((8191 & 1) != 0 ? alertGroupUiItem.KWHzl : null, (8191 & 2) != 0 ? alertGroupUiItem.copydefault : null, (8191 & 4) != 0 ? alertGroupUiItem.djBIcL : null, (8191 & 8) != 0 ? alertGroupUiItem.fetchVPNInfo : null, (8191 & 16) != 0 ? alertGroupUiItem.AkhnZx : null, (8191 & 32) != 0 ? alertGroupUiItem.values : null, (8191 & 64) != 0 ? alertGroupUiItem.OLrzqt : null, (8191 & 128) != 0 ? alertGroupUiItem.AEQbTJ : arrayList4, (8191 & 256) != 0 ? alertGroupUiItem.AYXKKw : false, (8191 & 512) != 0 ? alertGroupUiItem.gEmmrt : false, (8191 & 1024) != 0 ? alertGroupUiItem.valueOf : false, (8191 & 2048) != 0 ? alertGroupUiItem.EZpvd : false, (8191 & 4096) != 0 ? alertGroupUiItem.AhwBna : false));
        }
        return EZpvd(arrayList3);
    }

    public static final java.util.List<AlertUiItem> EZpvd(@NotNull java.util.List<? extends AlertUiItem> list, @NotNull AlertGroupUiItem alertGroupUiItem, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        java.lang.Object next;
        java.util.ArrayList arrayList;
        AlertGroupUiItem alertGroupUiItemKWHzl;
        java.util.ArrayList arrayList2;
        AlertGroupUiItem alertGroupUiItem2 = alertGroupUiItem;
        java.lang.String str3 = str;
        java.lang.String str4 = str2;
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(alertGroupUiItem2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        java.util.ArrayList<AlertGroupUiItem> arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (obj instanceof AlertGroupUiItem) {
                arrayList3.add(obj);
            }
        }
        java.util.Iterator it = arrayList3.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((AlertGroupUiItem) next).AEQbTJ(alertGroupUiItem2)) {
                break;
            }
        }
        if (((AlertGroupUiItem) next) == null) {
            return copydefault(CollectionsKt___CollectionsKt.copydefault((java.util.Collection<? extends AlertGroupUiItem>) arrayList3, alertGroupUiItem2), alertGroupUiItem2, str3, str4);
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList3, 10));
        for (AlertGroupUiItem alertGroupUiItem3 : arrayList3) {
            if (alertGroupUiItem3.AEQbTJ(alertGroupUiItem2)) {
                java.util.List<AlertDataUiItem> listEZpvd = alertGroupUiItem3.EZpvd();
                if (!(listEZpvd instanceof java.util.Collection) || !listEZpvd.isEmpty()) {
                    java.util.Iterator<T> it2 = listEZpvd.iterator();
                    while (it2.hasNext()) {
                        if (((AlertDataUiItem) CollectionsKt___CollectionsKt.AuCTelauCTel(alertGroupUiItem.EZpvd())).EZpvd((AlertDataUiItem) it2.next())) {
                            java.util.List<AlertDataUiItem> listEZpvd2 = alertGroupUiItem.EZpvd();
                            java.util.List<AlertDataUiItem> listEZpvd3 = alertGroupUiItem3.EZpvd();
                            java.util.ArrayList arrayList5 = new java.util.ArrayList();
                            for (java.lang.Object obj2 : listEZpvd3) {
                                if (!((AlertDataUiItem) CollectionsKt___CollectionsKt.AuCTelauCTel(alertGroupUiItem.EZpvd())).EZpvd((AlertDataUiItem) obj2)) {
                                    arrayList5.add(obj2);
                                }
                            }
                            alertGroupUiItemKWHzl = alertGroupUiItem3.KWHzl((8191 & 1) != 0 ? alertGroupUiItem3.KWHzl : null, (8191 & 2) != 0 ? alertGroupUiItem3.copydefault : null, (8191 & 4) != 0 ? alertGroupUiItem3.djBIcL : null, (8191 & 8) != 0 ? alertGroupUiItem3.fetchVPNInfo : null, (8191 & 16) != 0 ? alertGroupUiItem3.AkhnZx : null, (8191 & 32) != 0 ? alertGroupUiItem3.values : null, (8191 & 64) != 0 ? alertGroupUiItem3.OLrzqt : null, (8191 & 128) != 0 ? alertGroupUiItem3.AEQbTJ : CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) listEZpvd2, (java.lang.Iterable) arrayList5), (8191 & 256) != 0 ? alertGroupUiItem3.AYXKKw : false, (8191 & 512) != 0 ? alertGroupUiItem3.gEmmrt : false, (8191 & 1024) != 0 ? alertGroupUiItem3.valueOf : false, (8191 & 2048) != 0 ? alertGroupUiItem3.EZpvd : false, (8191 & 4096) != 0 ? alertGroupUiItem3.AhwBna : false);
                            arrayList2 = arrayList4;
                            arrayList2.add(alertGroupUiItemKWHzl);
                            alertGroupUiItem2 = alertGroupUiItem;
                            str3 = str;
                            str4 = str2;
                            arrayList4 = arrayList2;
                        }
                    }
                }
                arrayList = arrayList4;
                alertGroupUiItemKWHzl = alertGroupUiItem.KWHzl((8191 & 1) != 0 ? alertGroupUiItem.KWHzl : null, (8191 & 2) != 0 ? alertGroupUiItem.copydefault : null, (8191 & 4) != 0 ? alertGroupUiItem.djBIcL : null, (8191 & 8) != 0 ? alertGroupUiItem.fetchVPNInfo : null, (8191 & 16) != 0 ? alertGroupUiItem.AkhnZx : null, (8191 & 32) != 0 ? alertGroupUiItem.values : null, (8191 & 64) != 0 ? alertGroupUiItem.OLrzqt : null, (8191 & 128) != 0 ? alertGroupUiItem.AEQbTJ : CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) alertGroupUiItem.EZpvd(), (java.lang.Iterable) alertGroupUiItem3.EZpvd()), (8191 & 256) != 0 ? alertGroupUiItem.AYXKKw : false, (8191 & 512) != 0 ? alertGroupUiItem.gEmmrt : false, (8191 & 1024) != 0 ? alertGroupUiItem.valueOf : false, (8191 & 2048) != 0 ? alertGroupUiItem.EZpvd : false, (8191 & 4096) != 0 ? alertGroupUiItem.AhwBna : false);
            } else {
                arrayList = arrayList4;
                alertGroupUiItemKWHzl = alertGroupUiItem3.KWHzl((8191 & 1) != 0 ? alertGroupUiItem3.KWHzl : null, (8191 & 2) != 0 ? alertGroupUiItem3.copydefault : null, (8191 & 4) != 0 ? alertGroupUiItem3.djBIcL : null, (8191 & 8) != 0 ? alertGroupUiItem3.fetchVPNInfo : null, (8191 & 16) != 0 ? alertGroupUiItem3.AkhnZx : null, (8191 & 32) != 0 ? alertGroupUiItem3.values : null, (8191 & 64) != 0 ? alertGroupUiItem3.OLrzqt : null, (8191 & 128) != 0 ? alertGroupUiItem3.AEQbTJ : null, (8191 & 256) != 0 ? alertGroupUiItem3.AYXKKw : false, (8191 & 512) != 0 ? alertGroupUiItem3.gEmmrt : false, (8191 & 1024) != 0 ? alertGroupUiItem3.valueOf : false, (8191 & 2048) != 0 ? alertGroupUiItem3.EZpvd : false, (8191 & 4096) != 0 ? alertGroupUiItem3.AhwBna : false);
            }
            arrayList2 = arrayList;
            arrayList2.add(alertGroupUiItemKWHzl);
            alertGroupUiItem2 = alertGroupUiItem;
            str3 = str;
            str4 = str2;
            arrayList4 = arrayList2;
        }
        return copydefault(arrayList4, alertGroupUiItem2, str3, str4);
    }
}
