package o;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.arH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C7829arH {
    public static final java.util.Map<java.lang.String, java.lang.String> EZpvd;
    public static final C7829arH KWHzl = new C7829arH();
    public static final int OLrzqt;

    private C7829arH() {
    }

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        EZpvd = linkedHashMap;
        linkedHashMap.put("font_silka_regular", "harmony_sans_regular.ttf");
        linkedHashMap.put("font_silka_medium", "harmony_sans_medium.ttf");
        linkedHashMap.put("font_silka_semibold", "harmony_sans_bold.ttf");
        OLrzqt = 8;
    }

    public final android.graphics.Typeface AEQbTJ(@NotNull java.lang.String str, @NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(context, "");
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "OKXSansTAB-Thin")) {
            return C55051xce.OLrzqt.djBIcL();
        }
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "OKXSansTAB-Light")) {
            return C55051xce.OLrzqt.copydefault();
        }
        java.lang.String str2 = EZpvd.get(str);
        return C55051xce.OLrzqt.AEQbTJ(str2 != null ? str2 : "");
    }
}
