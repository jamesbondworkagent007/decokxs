package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.InvalidModuleException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yNK {
    public static final yNN<yNI> copydefault = new yNN<>("InvalidModuleNotifier");

    public static final void KWHzl(@NotNull yNP ynp) {
        Intrinsics.checkNotNullParameter(ynp, "");
        yNI yni = (yNI) ynp.OLrzqt(copydefault);
        if (yni != null) {
            yni.copydefault(ynp);
            return;
        }
        throw new InvalidModuleException("Accessing invalid module descriptor " + ynp);
    }
}
