package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yWV {
    public static final boolean KWHzl(@NotNull yWQ ywq) {
        Intrinsics.checkNotNullParameter(ywq, "");
        return copydefault(ywq);
    }

    public static final boolean copydefault(@NotNull yWQ ywq) {
        Intrinsics.checkNotNullParameter(ywq, "");
        return (ywq.OLrzqt() == 1 && ywq.copydefault() >= 4) || ywq.OLrzqt() > 1;
    }
}
