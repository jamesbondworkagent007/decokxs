package o;

import kotlin.jvm.internal.Intrinsics;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xwl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C56118xwl {
    public static final C56118xwl OLrzqt = new C56118xwl();

    private C56118xwl() {
    }

    public final java.util.ArrayList<pWN> AEQbTJ(@NotNull java.util.ArrayList<pWN> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        arrayList.clear();
        arrayList.addAll(EZpvd());
        return arrayList;
    }

    public final java.util.ArrayList<pWN> EZpvd() {
        java.util.ArrayList<pWN> arrayList = new java.util.ArrayList<>();
        if (C34703nhO.AEQbTJ()) {
            arrayList.add(new pWN(qZH.PendingIntent.iRxXKY, "market_tab_derivatives", null, null, 12, null));
            if (C55608xnE.AEQbTJ()) {
                arrayList.add(new pWN(qZH.PendingIntent.RFmUsE, "BOTS", null, null, 12, null));
            }
        } else if (C34704nhP.copydefault.copydefault()) {
            arrayList.add(new pWN(qZH.PendingIntent.QKVWgx, "Watchlist", null, null, 12, null));
            arrayList.add(new pWN(qZH.PendingIntent.iRxXKY, "market_tab_derivatives", null, null, 12, null));
        } else {
            arrayList.add(new pWN(qZH.PendingIntent.QKVWgx, "Watchlist", null, null, 12, null));
            arrayList.add(new pWN(qZH.PendingIntent.AxsJAY, "COIN", null, null, 12, null));
            arrayList.add(new pWN(qZH.PendingIntent.hUfVAv, "SPOT", null, null, 12, null));
            arrayList.add(new pWN(qZH.PendingIntent.sSMYrx, "market_tab_derivatives", null, null, 12, null));
        }
        return arrayList;
    }

    public final boolean OLrzqt(boolean z, @NotNull java.util.ArrayList<pWN> arrayList) {
        pWN pwnPrevious;
        Intrinsics.checkNotNullParameter(arrayList, "");
        java.util.ListIterator<pWN> listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                pwnPrevious = null;
                break;
            }
            pwnPrevious = listIterator.previous();
            if (Intrinsics.EZpvd((java.lang.Object) pwnPrevious.AEQbTJ(), (java.lang.Object) "discover_community")) {
                break;
            }
        }
        pWN pwn = pwnPrevious;
        java.util.Iterator<pWN> it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (Intrinsics.EZpvd((java.lang.Object) it.next().AEQbTJ(), (java.lang.Object) "discover_community")) {
                break;
            }
            i++;
        }
        if (z && pwn == null) {
            return true;
        }
        return (z || i == -1) ? false : true;
    }
}
