package o;

import com.okinc.modular.deeplinkv2.DeeplinkMode;
import o.InterfaceC43233rlS;

/* JADX INFO: renamed from: o.ugu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C49035ugu implements InterfaceC43233rlS {
    public static final C49035ugu EZpvd = new C49035ugu();
    public static final DeeplinkMode AEQbTJ = DeeplinkMode.APP;
    public static final java.lang.String copydefault = "share";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC43233rlS
    public DeeplinkMode KWHzl() {
        return AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC43233rlS
    public java.lang.String OLrzqt() {
        return copydefault;
    }

    @Override // o.InterfaceC43233rlS
    public boolean copydefault() {
        return false;
    }

    private C49035ugu() {
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
}
