package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kDf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C27784kDf {
    public final C27781kDc OLrzqt;

    @yCM
    public C27784kDf(@NotNull C27781kDc c27781kDc) {
        Intrinsics.checkNotNullParameter(c27781kDc, "");
        this.OLrzqt = c27781kDc;
    }

    public final boolean OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return this.OLrzqt.copydefault(str, str2);
    }
}
