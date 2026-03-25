package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public abstract class yNC {
    public abstract java.lang.String EZpvd();

    public abstract yNC KWHzl();

    public abstract boolean KWHzl(InterfaceC59070zaB interfaceC59070zaB, @NotNull InterfaceC56668yNx interfaceC56668yNx, @NotNull InterfaceC56665yNu interfaceC56665yNu, boolean z);

    public abstract yOD copydefault();

    public final boolean AEQbTJ() {
        return copydefault().OLrzqt();
    }

    public final java.lang.Integer KWHzl(@NotNull yNC ync) {
        Intrinsics.checkNotNullParameter(ync, "");
        return copydefault().OLrzqt(ync.copydefault());
    }

    public final java.lang.String toString() {
        return copydefault().toString();
    }
}
