package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yOa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56672yOa {
    public static final java.util.List<yNW> OLrzqt(@NotNull yNU ynu, @NotNull C56933yXs c56933yXs) {
        Intrinsics.checkNotNullParameter(ynu, "");
        Intrinsics.checkNotNullParameter(c56933yXs, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        AEQbTJ(ynu, c56933yXs, arrayList);
        return arrayList;
    }

    public static final boolean EZpvd(@NotNull yNU ynu, @NotNull C56933yXs c56933yXs) {
        Intrinsics.checkNotNullParameter(ynu, "");
        Intrinsics.checkNotNullParameter(c56933yXs, "");
        return ynu instanceof yNX ? ((yNX) ynu).OLrzqt(c56933yXs) : OLrzqt(ynu, c56933yXs).isEmpty();
    }

    public static final void AEQbTJ(@NotNull yNU ynu, @NotNull C56933yXs c56933yXs, @NotNull java.util.Collection<yNW> collection) {
        Intrinsics.checkNotNullParameter(ynu, "");
        Intrinsics.checkNotNullParameter(c56933yXs, "");
        Intrinsics.checkNotNullParameter(collection, "");
        if (ynu instanceof yNX) {
            ((yNX) ynu).EZpvd(c56933yXs, collection);
        } else {
            collection.addAll(ynu.copydefault(c56933yXs));
        }
    }
}
