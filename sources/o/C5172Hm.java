package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.time.DurationUnit;
import o.C5173Hn;
import o.C59462zhW;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Hm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5172Hm {
    public static final long AEQbTJ(@NotNull C5173Hn c5173Hn) {
        Intrinsics.checkNotNullParameter(c5173Hn, "");
        return (c5173Hn.KWHzl() * ((long) 1000)) + ((long) (c5173Hn.EZpvd() / 1000000));
    }

    public static final C5173Hn AEQbTJ(@NotNull C5173Hn.ActionBar actionBar, long j) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        long j2 = 1000;
        long j3 = j / j2;
        return actionBar.copydefault(j3, (int) ((j - (j2 * j3)) * ((long) 1000000)));
    }

    public static final long OLrzqt(@NotNull C5173Hn c5173Hn, @NotNull C5173Hn c5173Hn2) {
        Intrinsics.checkNotNullParameter(c5173Hn, "");
        Intrinsics.checkNotNullParameter(c5173Hn2, "");
        C59462zhW.Activity activity = C59462zhW.OLrzqt;
        return C59519zia.AEQbTJ(AEQbTJ(c5173Hn2) - AEQbTJ(c5173Hn), DurationUnit.MILLISECONDS);
    }
}
