package o;

import com.okinc.modular.deeplinkv2.DeeplinkMode;
import o.InterfaceC54415xHo;

/* JADX INFO: renamed from: o.xHs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54419xHs implements InterfaceC54415xHo {
    public static final C54419xHs EZpvd = new C54419xHs();
    public static final java.lang.String OLrzqt = "trade_bot/my_bot/page";
    public static final DeeplinkMode KWHzl = DeeplinkMode.PRO;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC43233rlS
    public DeeplinkMode KWHzl() {
        return KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC43233rlS
    public java.lang.String OLrzqt() {
        return OLrzqt;
    }

    @Override // o.InterfaceC43233rlS
    public boolean copydefault() {
        return true;
    }

    private C54419xHs() {
    }

    @Override // o.InterfaceC43233rlS
    public java.util.List<C43240rlZ> AEQbTJ() {
        return InterfaceC54415xHo.StateListAnimator.AEQbTJ(this);
    }

    @Override // o.InterfaceC43233rlS
    public boolean AYXKKw() {
        return InterfaceC54415xHo.StateListAnimator.KWHzl(this);
    }

    @Override // o.InterfaceC43233rlS
    public boolean EZpvd() {
        return InterfaceC54415xHo.StateListAnimator.copydefault(this);
    }
}
