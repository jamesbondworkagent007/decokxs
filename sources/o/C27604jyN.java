package o;

import com.okinc.business.market.data.model.alert.AlertDataResponse;
import com.okinc.business.market.data.model.alert.AlertDataUiItem;
import com.okinc.business.market.data.model.alert.AlertGroupUiItem;
import com.okinc.business.market.data.model.alert.AlertListResponse;
import com.okinc.business.market.data.model.alert.AlertUiItem;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jyN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C27604jyN {
    public static final AlertDataUiItem AEQbTJ(@NotNull AlertDataResponse alertDataResponse) {
        Intrinsics.checkNotNullParameter(alertDataResponse, "");
        return new AlertDataUiItem(alertDataResponse.valueOf(), alertDataResponse.EZpvd(), alertDataResponse.AYXKKw(), alertDataResponse.gEmmrt(), alertDataResponse.copydefault(), alertDataResponse.AEQbTJ(), alertDataResponse.djBIcL(), alertDataResponse.AhwBna(), alertDataResponse.OLrzqt(), false, false, 1536, null);
    }

    public static final java.util.List<AlertUiItem> EZpvd(@NotNull java.util.List<AlertListResponse> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (AlertListResponse alertListResponse : list) {
            java.lang.String strValueOf = alertListResponse.valueOf();
            java.lang.String strAEQbTJ = alertListResponse.AEQbTJ();
            java.lang.String strValueOf2 = alertListResponse.valueOf();
            java.lang.String strDjBIcL = alertListResponse.djBIcL();
            java.lang.String strGEmmrt = alertListResponse.gEmmrt();
            java.lang.String strAYXKKw = alertListResponse.AYXKKw();
            java.lang.String strOLrzqt = alertListResponse.OLrzqt();
            boolean zEZpvd = alertListResponse.EZpvd();
            java.util.List<AlertDataResponse> listKWHzl = alertListResponse.KWHzl();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(listKWHzl, 10));
            java.util.Iterator<T> it = listKWHzl.iterator();
            while (it.hasNext()) {
                arrayList2.add(AEQbTJ((AlertDataResponse) it.next()));
            }
            arrayList.add(new AlertGroupUiItem(strValueOf, strAEQbTJ, strValueOf2, strGEmmrt, strDjBIcL, strAYXKKw, strOLrzqt, arrayList2, zEZpvd, false, false, false, false, 7680, null));
        }
        return arrayList;
    }
}
