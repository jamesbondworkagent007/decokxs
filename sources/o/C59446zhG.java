package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zhG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59446zhG extends C59445zhF {
    public static java.lang.StringBuilder EZpvd(@NotNull java.lang.StringBuilder sb, @NotNull java.lang.String... strArr) {
        Intrinsics.checkNotNullParameter(sb, "");
        Intrinsics.checkNotNullParameter(strArr, "");
        for (java.lang.String str : strArr) {
            sb.append(str);
        }
        return sb;
    }

    public static java.lang.StringBuilder copydefault(@NotNull java.lang.StringBuilder sb, @NotNull java.lang.Object... objArr) {
        Intrinsics.checkNotNullParameter(sb, "");
        Intrinsics.checkNotNullParameter(objArr, "");
        for (java.lang.Object obj : objArr) {
            sb.append(obj);
        }
        return sb;
    }
}
