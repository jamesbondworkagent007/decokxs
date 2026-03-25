package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C58108yv {
    public static final boolean EZpvd(@NotNull InterfaceC57843yq interfaceC57843yq) {
        Intrinsics.checkNotNullParameter(interfaceC57843yq, "");
        return !interfaceC57843yq.EZpvd();
    }

    public static final <T> T OLrzqt(@NotNull InterfaceC57843yq interfaceC57843yq, @NotNull C57737yo<T> c57737yo) {
        Intrinsics.checkNotNullParameter(interfaceC57843yq, "");
        Intrinsics.checkNotNullParameter(c57737yo, "");
        T t = (T) interfaceC57843yq.OLrzqt(c57737yo);
        if (t != null) {
            return t;
        }
        throw new java.lang.IllegalStateException("No instance for " + c57737yo);
    }

    public static final <T> void KWHzl(@NotNull InterfaceC56293yA interfaceC56293yA, @NotNull C57737yo<T> c57737yo, @NotNull T t) {
        Intrinsics.checkNotNullParameter(interfaceC56293yA, "");
        Intrinsics.checkNotNullParameter(c57737yo, "");
        Intrinsics.checkNotNullParameter(t, "");
        if (interfaceC56293yA.AEQbTJ(c57737yo)) {
            return;
        }
        interfaceC56293yA.OLrzqt(c57737yo, t);
    }

    public static final <T> void EZpvd(@NotNull InterfaceC56293yA interfaceC56293yA, @NotNull C57737yo<T> c57737yo, T t) {
        Intrinsics.checkNotNullParameter(interfaceC56293yA, "");
        Intrinsics.checkNotNullParameter(c57737yo, "");
        if (t != null) {
            KWHzl(interfaceC56293yA, c57737yo, t);
        }
    }

    public static final <T> void AEQbTJ(@NotNull InterfaceC56293yA interfaceC56293yA, @NotNull C57737yo<T> c57737yo, T t) {
        Intrinsics.checkNotNullParameter(interfaceC56293yA, "");
        Intrinsics.checkNotNullParameter(c57737yo, "");
        if (t != null) {
            interfaceC56293yA.OLrzqt(c57737yo, t);
        }
    }

    public static final <T> T copydefault(@NotNull InterfaceC56293yA interfaceC56293yA, @NotNull C57737yo<T> c57737yo) {
        Intrinsics.checkNotNullParameter(interfaceC56293yA, "");
        Intrinsics.checkNotNullParameter(c57737yo, "");
        T t = (T) interfaceC56293yA.OLrzqt(c57737yo);
        interfaceC56293yA.EZpvd(c57737yo);
        return t;
    }

    public static final void KWHzl(@NotNull InterfaceC56293yA interfaceC56293yA, @NotNull InterfaceC57843yq interfaceC57843yq) {
        Intrinsics.checkNotNullParameter(interfaceC56293yA, "");
        Intrinsics.checkNotNullParameter(interfaceC57843yq, "");
        java.util.Iterator<T> it = interfaceC57843yq.copydefault().iterator();
        while (it.hasNext()) {
            C57737yo c57737yo = (C57737yo) it.next();
            Intrinsics.copydefault(c57737yo, "");
            interfaceC56293yA.OLrzqt(c57737yo, OLrzqt(interfaceC57843yq, c57737yo));
        }
    }

    public static final InterfaceC57843yq copydefault() {
        return C58320yz.AEQbTJ;
    }

    public static final InterfaceC56293yA AEQbTJ() {
        return new C57896yr();
    }

    public static final InterfaceC56293yA OLrzqt(@NotNull InterfaceC57843yq interfaceC57843yq) {
        Intrinsics.checkNotNullParameter(interfaceC57843yq, "");
        return new C57896yr(interfaceC57843yq);
    }
}
