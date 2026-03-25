package o;

import com.okinc.modular.deeplinkv2.DeeplinkMode;
import o.InterfaceC43233rlS;

/* JADX INFO: renamed from: o.sqW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45475sqW implements InterfaceC43233rlS {
    public final DeeplinkMode OLrzqt = DeeplinkMode.APP;
    public final java.lang.String copydefault = "supportcenter";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC43233rlS
    public DeeplinkMode KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC43233rlS
    public java.lang.String OLrzqt() {
        return this.copydefault;
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
}
