package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class pMR implements ARK {
    public final InterfaceC43232rlR OLrzqt;

    @Override // o.ARK
    public boolean KWHzl() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC43232rlR djBIcL() {
        return this.OLrzqt;
    }

    public pMR(@NotNull InterfaceC43232rlR interfaceC43232rlR) {
        Intrinsics.checkNotNullParameter(interfaceC43232rlR, "");
        this.OLrzqt = interfaceC43232rlR;
    }

    @Override // o.ARK
    public java.lang.String AEQbTJ() {
        return this.OLrzqt.AEQbTJ();
    }

    @Override // o.ARK
    public java.lang.String OLrzqt() {
        return this.OLrzqt.copydefault().getMode();
    }

    @Override // o.ARK
    public boolean copydefault() {
        return this.OLrzqt.EZpvd();
    }

    @Override // o.ARK
    public java.util.List<java.lang.String> EZpvd() {
        return this.OLrzqt.djBIcL();
    }

    @Override // o.ARK
    public boolean AYXKKw() {
        return this.OLrzqt.KWHzl();
    }

    @Override // o.ARK
    public boolean AhwBna() {
        return this.OLrzqt.OLrzqt();
    }
}
