package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ySo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56794ySo {
    public final C56791ySl AEQbTJ;
    public final InterfaceC56802ySw EZpvd;
    public final InterfaceC56387yDm<C56774yRv> KWHzl;
    public final yTC copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final yTC AYXKKw() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC56802ySw AhwBna() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC56387yDm<C56774yRv> OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56791ySl copydefault() {
        return this.AEQbTJ;
    }

    public C56794ySo(@NotNull C56791ySl c56791ySl, @NotNull InterfaceC56802ySw interfaceC56802ySw, @NotNull InterfaceC56387yDm<C56774yRv> interfaceC56387yDm) {
        Intrinsics.checkNotNullParameter(c56791ySl, "");
        Intrinsics.checkNotNullParameter(interfaceC56802ySw, "");
        Intrinsics.checkNotNullParameter(interfaceC56387yDm, "");
        this.AEQbTJ = c56791ySl;
        this.EZpvd = interfaceC56802ySw;
        this.KWHzl = interfaceC56387yDm;
        this.copydefault = new yTC(this, interfaceC56802ySw);
    }

    public final C56774yRv KWHzl() {
        return this.KWHzl.getValue();
    }

    public final InterfaceC59187zcM EZpvd() {
        return this.AEQbTJ.uzCIH();
    }

    public final yNP AEQbTJ() {
        return this.AEQbTJ.fetchVPNInfo();
    }
}
