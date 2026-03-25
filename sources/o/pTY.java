package o;

import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pTY {
    public final java.util.Set<java.lang.String> AEQbTJ = new LinkedHashSet();

    public final void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ.add(str);
    }

    public final void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ.remove(str);
    }

    public final boolean AEQbTJ() {
        return this.AEQbTJ.isEmpty();
    }
}
