package o;

import java.util.Collections;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rht, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43048rht {
    public static final C43048rht AEQbTJ = new C43048rht();
    public static final java.util.Set<java.lang.String> copydefault = Collections.synchronizedSet(new LinkedHashSet());
    public static final int KWHzl = 8;

    private C43048rht() {
    }

    public final void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C7870arw.KWHzl("[MiniApp]", "register " + str);
        copydefault.add(str);
    }

    public final java.util.Set<java.lang.String> copydefault() {
        java.util.Set<java.lang.String> set = copydefault;
        Intrinsics.checkNotNullExpressionValue(set, "");
        return set;
    }
}
