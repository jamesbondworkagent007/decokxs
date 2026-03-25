package o;

import com.okinc.oksearch.analytics.FuzzySearchEventSourceEnum;
import com.okinc.oksearch.analytics.FuzzySearchEventTracker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tlv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C47222tlv {
    public static final C47222tlv KWHzl = new C47222tlv();

    private C47222tlv() {
    }

    public static /* synthetic */ java.util.List searchAndSortItems$default(C47222tlv c47222tlv, java.lang.String str, java.util.List list, java.lang.String str2, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str2 = FuzzySearchEventSourceEnum.UNKNOWN.getSource();
        }
        if ((i & 8) != 0) {
            z = true;
        }
        return c47222tlv.copydefault(str, list, str2, z);
    }

    public final <T extends InterfaceC47221tlu> java.util.List<T> copydefault(@NotNull java.lang.String str, @NotNull java.util.List<? extends T> list, @NotNull java.lang.String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.List<T> listOLrzqt = C47225tly.copydefault.OLrzqt(str, list);
        long jCurrentTimeMillis2 = java.lang.System.currentTimeMillis();
        if (z) {
            FuzzySearchEventTracker.trackFuzzySearchStart$default(FuzzySearchEventTracker.EZpvd, str2, str, list, java.lang.String.valueOf(listOLrzqt.size()), java.lang.String.valueOf(jCurrentTimeMillis2 - jCurrentTimeMillis), null, 32, null);
        }
        return listOLrzqt;
    }

    public static /* synthetic */ java.util.List searchAndSortItemsExactMatch$default(C47222tlv c47222tlv, java.lang.String str, java.util.List list, java.lang.String str2, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str2 = FuzzySearchEventSourceEnum.UNKNOWN.getSource();
        }
        if ((i & 8) != 0) {
            z = true;
        }
        return c47222tlv.KWHzl(str, list, str2, z);
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.oksearch.analytics.FuzzySearchEventTracker.trackFuzzySearchStart$default(com.okinc.oksearch.analytics.FuzzySearchEventTracker, java.lang.String, java.lang.CharSequence, java.util.List, java.lang.String, java.lang.String, kotlinx.coroutines.CoroutineScope, int, java.lang.Object):void */
    public final <T extends InterfaceC47221tlu> java.util.List<T> KWHzl(@NotNull java.lang.String str, @NotNull java.util.List<? extends T> list, @NotNull java.lang.String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.List<T> listKWHzl = C47225tly.copydefault.KWHzl(str, list);
        long jCurrentTimeMillis2 = java.lang.System.currentTimeMillis();
        if (z) {
            FuzzySearchEventTracker.trackFuzzySearchStart$default(FuzzySearchEventTracker.EZpvd, str2, str, list, java.lang.String.valueOf(listKWHzl.size()), java.lang.String.valueOf(jCurrentTimeMillis2 - jCurrentTimeMillis), null, 32, null);
        }
        return listKWHzl;
    }

    public final double OLrzqt(@NotNull java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        return C47225tly.copydefault.copydefault(str, str2);
    }
}
