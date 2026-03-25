package o;

import com.google.gson.Gson;
import com.okinc.core.util.SPUtils;
import com.okinc.unify_trade.bot.market_place.search.SearchStrategyHistorySource;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xtX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C55945xtX {
    public static final C55945xtX OLrzqt = new C55945xtX();
    public static java.lang.String KWHzl = "";
    public static final int copydefault = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        KWHzl = str;
    }

    private C55945xtX() {
    }

    public final java.util.ArrayList<SearchStrategyHistorySource> EZpvd() {
        java.util.ArrayList<SearchStrategyHistorySource> arrayList = SPUtils.getArrayList(copydefault(), SearchStrategyHistorySource.class);
        return arrayList == null ? new java.util.ArrayList<>() : arrayList;
    }

    public final void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.util.ArrayList<SearchStrategyHistorySource> arrayListEZpvd = EZpvd();
        if (AEQbTJ(str, arrayListEZpvd)) {
            return;
        }
        OLrzqt(arrayListEZpvd);
        arrayListEZpvd.add(new SearchStrategyHistorySource(str));
        SPUtils.put(copydefault(), new Gson().toJson(arrayListEZpvd));
    }

    public final void OLrzqt(java.util.ArrayList<SearchStrategyHistorySource> arrayList) {
        if (arrayList.size() == 20) {
            arrayList.remove(0);
        }
    }

    public final java.util.ArrayList<SearchStrategyHistorySource> KWHzl(int i) {
        java.util.ArrayList<SearchStrategyHistorySource> arrayListEZpvd = EZpvd();
        return arrayListEZpvd.size() >= i ? new java.util.ArrayList<>(arrayListEZpvd.subList(0, i)) : arrayListEZpvd;
    }

    public final java.lang.String copydefault() {
        return C55697xoo.OLrzqt.copydefault() + "_" + C54589xNz.EZpvd.EZpvd() + "_search_stately_all_history";
    }

    public final void AEQbTJ() {
        SPUtils.remove(copydefault());
    }

    public final boolean AEQbTJ(java.lang.String str, java.util.ArrayList<SearchStrategyHistorySource> arrayList) {
        java.util.Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            if (Intrinsics.EZpvd((java.lang.Object) ((SearchStrategyHistorySource) it.next()).getName(), (java.lang.Object) str)) {
                return true;
            }
        }
        return false;
    }
}
