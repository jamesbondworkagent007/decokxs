package o;

import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nGb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33794nGb {
    public static final C33794nGb EZpvd = new C33794nGb();
    public static final java.util.Set<java.lang.String> OLrzqt = new LinkedHashSet();
    public static final int KWHzl = 8;

    private C33794nGb() {
    }

    public final void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        OLrzqt.add(str);
    }

    public final boolean AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return OLrzqt.contains(str);
    }
}
