package o;

import com.okinc.modular.deeplinkv2.DeeplinkMode;
import o.InterfaceC43233rlS;

/* JADX INFO: renamed from: o.ixn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25496ixn implements InterfaceC43233rlS {
    public static final C25496ixn EZpvd = new C25496ixn();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC43233rlS
    public java.lang.String OLrzqt() {
        return "invest/home";
    }

    @Override // o.InterfaceC43233rlS
    public boolean copydefault() {
        return false;
    }

    private C25496ixn() {
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
    public DeeplinkMode KWHzl() {
        return DeeplinkMode.WALLET;
    }
}
