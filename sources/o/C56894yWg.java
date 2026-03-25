package o;

import java.util.LinkedHashSet;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yWg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56894yWg {
    public static final C56894yWg AEQbTJ = new C56894yWg();

    private C56894yWg() {
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return "java/lang/" + str;
    }

    public final java.lang.String AhwBna(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return "java/util/" + str;
    }

    public final java.lang.String OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return "java/util/function/" + str;
    }

    public final java.util.Set<java.lang.String> KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String... strArr) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(strArr, "");
        return EZpvd(KWHzl(str), (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length));
    }

    public final java.util.Set<java.lang.String> OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String... strArr) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(strArr, "");
        return EZpvd(AhwBna(str), (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length));
    }

    public final java.util.Set<java.lang.String> EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String... strArr) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(strArr, "");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (java.lang.String str2 : strArr) {
            linkedHashSet.add(str + '.' + str2);
        }
        return linkedHashSet;
    }

    public final java.lang.String copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return str + '.' + str2;
    }

    public static final java.lang.CharSequence EZpvd(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return AEQbTJ.AEQbTJ(str);
    }

    public final java.lang.String EZpvd(@NotNull java.lang.String str, @NotNull java.util.List<java.lang.String> list, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return str + '(' + CollectionsKt___CollectionsKt.joinToString$default(list, "", null, null, 0, null, C56898yWk.KWHzl, 30, null) + ')' + AEQbTJ(str2);
    }

    public final java.lang.String AEQbTJ(java.lang.String str) {
        if (str.length() <= 1) {
            return str;
        }
        return 'L' + str + ';';
    }

    public final java.lang.String[] AEQbTJ(@NotNull java.lang.String... strArr) {
        Intrinsics.checkNotNullParameter(strArr, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(strArr.length);
        for (java.lang.String str : strArr) {
            arrayList.add("<init>(" + str + ")V");
        }
        return (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
    }
}
