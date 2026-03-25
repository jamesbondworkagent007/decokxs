package o;

import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ySe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56784ySe {
    public static final C56794ySo EZpvd(@NotNull C56794ySo c56794ySo, @NotNull InterfaceC56802ySw interfaceC56802ySw) {
        Intrinsics.checkNotNullParameter(c56794ySo, "");
        Intrinsics.checkNotNullParameter(interfaceC56802ySw, "");
        return new C56794ySo(c56794ySo.copydefault(), interfaceC56802ySw, c56794ySo.OLrzqt());
    }

    public static final C56774yRv KWHzl(@NotNull C56794ySo c56794ySo, @NotNull yOL yol) {
        Intrinsics.checkNotNullParameter(c56794ySo, "");
        Intrinsics.checkNotNullParameter(yol, "");
        return c56794ySo.copydefault().AEQbTJ().AEQbTJ(c56794ySo.KWHzl(), yol);
    }

    public static final C56794ySo AEQbTJ(@NotNull C56794ySo c56794ySo, @NotNull C56791ySl c56791ySl) {
        Intrinsics.checkNotNullParameter(c56794ySo, "");
        Intrinsics.checkNotNullParameter(c56791ySl, "");
        return new C56794ySo(c56791ySl, c56794ySo.AhwBna(), c56794ySo.OLrzqt());
    }

    public static final C56794ySo EZpvd(C56794ySo c56794ySo, InterfaceC56665yNu interfaceC56665yNu, InterfaceC56847yUn interfaceC56847yUn, int i, InterfaceC56387yDm<C56774yRv> interfaceC56387yDm) {
        InterfaceC56802ySw interfaceC56802ySwAhwBna;
        C56791ySl c56791ySlCopydefault = c56794ySo.copydefault();
        if (interfaceC56847yUn != null) {
            interfaceC56802ySwAhwBna = new C56796ySq(c56794ySo, interfaceC56665yNu, interfaceC56847yUn, i);
        } else {
            interfaceC56802ySwAhwBna = c56794ySo.AhwBna();
        }
        return new C56794ySo(c56791ySlCopydefault, interfaceC56802ySwAhwBna, interfaceC56387yDm);
    }

    public static /* synthetic */ C56794ySo childForMethod$default(C56794ySo c56794ySo, InterfaceC56665yNu interfaceC56665yNu, InterfaceC56847yUn interfaceC56847yUn, int i, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return AEQbTJ(c56794ySo, interfaceC56665yNu, interfaceC56847yUn, i);
    }

    public static final C56794ySo AEQbTJ(@NotNull C56794ySo c56794ySo, @NotNull InterfaceC56665yNu interfaceC56665yNu, @NotNull InterfaceC56847yUn interfaceC56847yUn, int i) {
        Intrinsics.checkNotNullParameter(c56794ySo, "");
        Intrinsics.checkNotNullParameter(interfaceC56665yNu, "");
        Intrinsics.checkNotNullParameter(interfaceC56847yUn, "");
        return EZpvd(c56794ySo, interfaceC56665yNu, interfaceC56847yUn, i, c56794ySo.OLrzqt());
    }

    public static /* synthetic */ C56794ySo childForClassOrPackage$default(C56794ySo c56794ySo, InterfaceC56654yNj interfaceC56654yNj, InterfaceC56847yUn interfaceC56847yUn, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            interfaceC56847yUn = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return OLrzqt(c56794ySo, interfaceC56654yNj, interfaceC56847yUn, i);
    }

    public static final C56774yRv KWHzl(C56794ySo c56794ySo, InterfaceC56654yNj interfaceC56654yNj) {
        return KWHzl(c56794ySo, interfaceC56654yNj.copydefault());
    }

    public static final C56794ySo OLrzqt(@NotNull C56794ySo c56794ySo, @NotNull InterfaceC56654yNj interfaceC56654yNj, InterfaceC56847yUn interfaceC56847yUn, int i) {
        Intrinsics.checkNotNullParameter(c56794ySo, "");
        Intrinsics.checkNotNullParameter(interfaceC56654yNj, "");
        return EZpvd(c56794ySo, interfaceC56654yNj, interfaceC56847yUn, i, C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new C56786ySg(c56794ySo, interfaceC56654yNj)));
    }

    public static final C56794ySo OLrzqt(@NotNull C56794ySo c56794ySo, @NotNull yOL yol) {
        Intrinsics.checkNotNullParameter(c56794ySo, "");
        Intrinsics.checkNotNullParameter(yol, "");
        return yol.AEQbTJ() ? c56794ySo : new C56794ySo(c56794ySo.copydefault(), c56794ySo.AhwBna(), C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new C56790ySk(c56794ySo, yol)));
    }

    public static final C56774yRv EZpvd(C56794ySo c56794ySo, yOL yol) {
        return KWHzl(c56794ySo, yol);
    }
}
