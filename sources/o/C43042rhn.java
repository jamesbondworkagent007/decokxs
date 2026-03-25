package o;

import java.util.Collections;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rhn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43042rhn {
    public static final C43042rhn AEQbTJ = new C43042rhn();
    public static final java.util.Set<java.lang.String> copydefault = Collections.synchronizedSet(new LinkedHashSet());
    public static final int KWHzl = 8;

    private C43042rhn() {
    }

    public final java.util.Set<java.lang.String> AEQbTJ() {
        java.util.Set<java.lang.String> set = copydefault;
        Intrinsics.checkNotNullExpressionValue(set, "");
        return set;
    }

    public final boolean KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return copydefault.contains(str);
    }

    public final java.lang.String copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() < 4) {
            return "";
        }
        java.lang.String strSubstring = str.substring(0, str.length() - 4);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        return strSubstring;
    }
}
