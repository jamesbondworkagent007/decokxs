package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yOP {
    public static final yOL AEQbTJ(@NotNull yOL yol, @NotNull yOL yol2) {
        Intrinsics.checkNotNullParameter(yol, "");
        Intrinsics.checkNotNullParameter(yol2, "");
        if (!yol.AEQbTJ()) {
            if (yol2.AEQbTJ()) {
                return yol;
            }
            yol2 = new yOT(yol, yol2);
        }
        return yol2;
    }
}
