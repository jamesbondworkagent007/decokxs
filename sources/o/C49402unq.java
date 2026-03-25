package o;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.unq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C49402unq {
    public static /* synthetic */ void reportTrack$default(android.view.View view, java.lang.String str, java.util.Map map, java.lang.Class[] clsArr, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            map = new java.util.HashMap();
        }
        copydefault(view, str, map, clsArr);
    }

    public static final void copydefault(@NotNull android.view.View view, @NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull java.lang.Class<?>... clsArr) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(clsArr, "");
        clickTrack$default(str, map, null, 4, null);
    }

    public static /* synthetic */ void clickTrack$default(java.lang.String str, java.util.Map map, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            map = new java.util.HashMap();
        }
        if ((i & 4) != 0) {
            str2 = "OKTrade-Track-Report";
        }
        OLrzqt(str, (java.util.Map<java.lang.String, java.lang.String>) map, str2);
    }

    public static final void OLrzqt(@NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("");
        for (Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
            stringBuffer.append(((java.lang.Object) entry.getKey()) + ":" + ((java.lang.Object) entry.getValue()) + "  ");
        }
        java.util.Map<java.lang.String, java.lang.String> mapGEmmrt = C56424yEw.gEmmrt(C56390yDp.OLrzqt("event_type", "view_click"), C56390yDp.OLrzqt("button_type", str), C56390yDp.OLrzqt("extra_params", stringBuffer.toString()));
        if (str2 == null || str2.length() == 0) {
            C49401unp.onEvent$default(C49401unp.OLrzqt, mapGEmmrt, null, 2, null);
        } else {
            C49401unp.OLrzqt.KWHzl(mapGEmmrt, str2);
        }
    }

    public static /* synthetic */ void statusTrack$default(java.lang.String str, java.util.Map map, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            map = new java.util.HashMap();
        }
        if ((i & 4) != 0) {
            str2 = "OKTrade-Track-Report";
        }
        EZpvd(str, map, str2);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.unp.onEvent$default(o.unp, java.util.Map, java.lang.String, int, java.lang.Object):void */
    public static final void EZpvd(@NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("");
        for (Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
            stringBuffer.append(((java.lang.Object) entry.getKey()) + ":" + ((java.lang.Object) entry.getValue()) + "  ");
        }
        java.util.Map<java.lang.String, java.lang.String> mapGEmmrt = C56424yEw.gEmmrt(C56390yDp.OLrzqt("event_type", "status_change"), C56390yDp.OLrzqt("status_type", str), C56390yDp.OLrzqt("extra_params", stringBuffer.toString()));
        if (str2 == null || str2.length() == 0) {
            C49401unp.onEvent$default(C49401unp.OLrzqt, mapGEmmrt, null, 2, null);
        } else {
            C49401unp.OLrzqt.KWHzl(mapGEmmrt, str2);
        }
    }

    public static /* synthetic */ void reportHttpResult$default(java.lang.String str, java.util.Map map, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            map = new java.util.HashMap();
        }
        if ((i & 4) != 0) {
            str2 = "OKTrade-Track-Report";
        }
        copydefault(str, map, str2);
    }

    public static final void copydefault(@NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("");
        for (Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
            stringBuffer.append(((java.lang.Object) entry.getKey()) + ":" + ((java.lang.Object) entry.getValue()) + "  ");
        }
        java.util.Map<java.lang.String, java.lang.String> mapGEmmrt = C56424yEw.gEmmrt(C56390yDp.OLrzqt("event_type", "http_result"), C56390yDp.OLrzqt("api", str), C56390yDp.OLrzqt("extra_params", stringBuffer.toString()));
        if (str2 == null || str2.length() == 0) {
            C49401unp.onEvent$default(C49401unp.OLrzqt, mapGEmmrt, null, 2, null);
        } else {
            C49401unp.OLrzqt.KWHzl(mapGEmmrt, str2);
        }
    }

    public static /* synthetic */ void tradeClickTrack$default(java.lang.String str, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            map = new java.util.HashMap();
        }
        OLrzqt(str, map);
    }

    public static final void OLrzqt(@NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        OLrzqt(str, map, "OKTrade-Track-Report");
    }

    public static /* synthetic */ void tradeReportHttpResult$default(java.lang.String str, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            map = new java.util.HashMap();
        }
        AEQbTJ(str, map);
    }

    public static final void AEQbTJ(@NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        copydefault(str, map, "OKTrade-Track-Report");
    }

    public static /* synthetic */ void tradeReportTrack$default(android.view.View view, java.lang.String str, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            map = new java.util.HashMap();
        }
        OLrzqt(view, str, (java.util.Map<java.lang.String, java.lang.String>) map);
    }

    public static final void OLrzqt(@NotNull android.view.View view, @NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        OLrzqt(str, map);
    }
}
