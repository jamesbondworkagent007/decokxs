package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class pMQ implements ASC {
    public final InterfaceC43233rlS copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC43233rlS djBIcL() {
        return this.copydefault;
    }

    public pMQ(@NotNull InterfaceC43233rlS interfaceC43233rlS) {
        Intrinsics.checkNotNullParameter(interfaceC43233rlS, "");
        this.copydefault = interfaceC43233rlS;
    }

    @Override // o.ASC
    public java.lang.String copydefault() {
        return this.copydefault.OLrzqt();
    }

    @Override // o.ASC
    public java.lang.String EZpvd() {
        return this.copydefault.KWHzl().getMode();
    }

    @Override // o.ASC
    public boolean OLrzqt() {
        return this.copydefault.copydefault();
    }

    @Override // o.ASC
    public boolean KWHzl() {
        return this.copydefault.EZpvd();
    }

    @Override // o.ASC
    public boolean AEQbTJ() {
        return this.copydefault.AYXKKw();
    }
}
