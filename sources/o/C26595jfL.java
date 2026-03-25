package o;

import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig;
import com.okinc.business.invest_biz.ui.screens.product_details.tab.Supply;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC26561jee;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jfL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C26595jfL {
    public static final TransactionConfig OLrzqt(@NotNull InterfaceC26561jee.ActionBar actionBar, @NotNull java.lang.String str) {
        long jLongValue;
        Intrinsics.checkNotNullParameter(actionBar, "");
        Intrinsics.checkNotNullParameter(str, "");
        long jGEmmrt = actionBar.gEmmrt();
        long jEZpvd = actionBar.EZpvd();
        boolean zAhwBna = actionBar.AhwBna();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int value = actionBar.djBIcL().getValue();
        int value2 = actionBar.fIwbmz().getValue();
        int value3 = actionBar.values().getValue();
        java.lang.String strIsConnected = actionBar.isConnected();
        java.lang.String strValueOf = actionBar.valueOf();
        if (actionBar.fARcdN() instanceof Supply) {
            jLongValue = ((Supply) actionBar.fARcdN()).EZpvd();
        } else {
            java.lang.Long lFetchVPNInfo = actionBar.fetchVPNInfo();
            jLongValue = lFetchVPNInfo != null ? lFetchVPNInfo.longValue() : 0L;
        }
        return new TransactionConfig(value, value2, jGEmmrt, zAhwBna, jLongValue, jEZpvd, strValueOf, str, arrayList, value3, null, 0L, 0, strIsConnected, actionBar.AkhnZx(), null, actionBar.KWHzl(), java.lang.Boolean.valueOf(actionBar.fARcdN() instanceof Supply), false, actionBar.AYXKKw(), actionBar.copydefault(), null, false, false, null, 31758336, null);
    }
}
