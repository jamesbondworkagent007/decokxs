package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xVC {
    public static final xVC OLrzqt = new xVC();

    private xVC() {
    }

    public final void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        try {
            pUU.KWHzl(str, str2);
        } catch (java.lang.Exception e) {
            pUU.copydefault(str, "Exception during log: " + e.getMessage());
        } catch (java.lang.OutOfMemoryError unused) {
            pUU.copydefault(str, "OOM ERROR during log print");
        }
    }
}
