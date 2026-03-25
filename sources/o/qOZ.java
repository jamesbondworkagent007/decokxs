package o;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qOZ implements qPO {
    public final java.util.Map<java.lang.String, java.lang.Long> EZpvd = new LinkedHashMap();

    @Override // o.qPO
    public void fIwbmz(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd.put("biz_type_" + str, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
    }

    @Override // o.qPO
    public void KWHzl(android.view.View view, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        EZpvd(view, "biz_type_" + str, "market_nav_search_biz_type_page_load");
    }

    public void EZpvd() {
        this.EZpvd.put("biz_type_search", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
    }

    @Override // o.qPO
    public void OLrzqt(android.view.View view) {
        EZpvd(view, "biz_type_search", "market_nav_search_biz_type_search_load");
    }

    @Override // o.qPO
    public void fARcdN(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd.put("coin_type_" + str, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
    }

    @Override // o.qPO
    public void OLrzqt(android.view.View view, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        EZpvd(view, "coin_type_" + str, "market_nav_search_coin_type_page_load");
    }

    public void AEQbTJ() {
        this.EZpvd.put("coin_type_search", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
    }

    public final void KWHzl(java.lang.String str, java.lang.String str2) {
        java.lang.Long lRemove = this.EZpvd.remove(str);
        if (lRemove != null) {
            KWHzl(str, lRemove.longValue(), str2);
        }
    }

    public final void EZpvd(android.view.View view, java.lang.String str, java.lang.String str2) {
        KWHzl(str, str2);
    }

    public final void KWHzl(java.lang.String str, long j, java.lang.String str2) {
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        long j2 = jCurrentTimeMillis - j;
        pUU.EZpvd("LegacySearchGrafana", str + " page report: [start: " + j + ", end: " + jCurrentTimeMillis + ", cost: " + j2 + "]");
        C27986kKr.AEQbTJ.AEQbTJ(java.lang.String.valueOf(j2), str2);
    }

    public void EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C27986kKr.AEQbTJ.OLrzqt(str, str2);
    }
}
