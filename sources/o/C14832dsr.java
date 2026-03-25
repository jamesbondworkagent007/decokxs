package o;

import com.okinc.modular.deeplinkv2.DeeplinkMode;
import o.InterfaceC43233rlS;

/* JADX INFO: renamed from: o.dsr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14832dsr implements InterfaceC43233rlS {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC43233rlS
    public java.lang.String OLrzqt() {
        return "dapp";
    }

    @Override // o.InterfaceC43233rlS
    public boolean copydefault() {
        return false;
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
