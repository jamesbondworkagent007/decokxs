package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.udD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C48833udD {
    public static final java.lang.String copydefault(@NotNull java.io.File file, @NotNull java.lang.String... strArr) {
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(strArr, "");
        java.util.Iterator it = yDV.getFieldNames(strArr).iterator();
        while (it.hasNext()) {
            file = new java.io.File(file, (java.lang.String) it.next());
        }
        java.lang.String path = file.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "");
        return path;
    }

    public static final int copydefault(java.lang.String str, java.lang.String str2) {
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str) && C33129mqd.OLrzqt((java.lang.CharSequence) str2)) {
            return C33573myx.copydefault(str, str2);
        }
        return C33129mqd.OLrzqt((java.lang.CharSequence) str2) ? -1 : 1;
    }

    public static final boolean KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new java.io.File(str).exists() && C59449zhJ.gEmmrt(str2, C33478mxH.KWHzl.OLrzqt(str), true);
    }
}
