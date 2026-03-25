package o;

import com.okinc.modular.deeplinkv2.DeeplinkMode;
import o.InterfaceC43233rlS;

/* JADX INFO: renamed from: o.nih, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34769nih implements InterfaceC43233rlS {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC43233rlS
    public java.lang.String OLrzqt() {
        return "public_beta/landing";
    }

    @Override // o.InterfaceC43233rlS
    public java.util.List<C43240rlZ> AEQbTJ() {
        return InterfaceC43233rlS.Application.copydefault(this);
    }

    @Override // o.InterfaceC43233rlS
    public boolean AYXKKw() {
        return InterfaceC43233rlS.Application.AEQbTJ(this);
    }

    @Override // o.InterfaceC43233rlS
    public boolean EZpvd() {
        return InterfaceC43233rlS.Application.OLrzqt(this);
    }

    @Override // o.InterfaceC43233rlS
    public boolean copydefault() {
        return InterfaceC43233rlS.Application.EZpvd(this);
    }

    @Override // o.InterfaceC43233rlS
    public DeeplinkMode KWHzl() {
        return DeeplinkMode.LITE;
    }
}
