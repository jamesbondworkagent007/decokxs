package o;

import com.okinc.modular.deeplinkv2.DeeplinkMode;
import o.InterfaceC54415xHo;

/* JADX INFO: renamed from: o.xHw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54423xHw implements InterfaceC54415xHo {
    public static final C54423xHw EZpvd = new C54423xHw();
    public static final java.lang.String KWHzl = "trade_bot/transition_guide/page";
    public static final DeeplinkMode AEQbTJ = DeeplinkMode.PRO;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC43233rlS
    public DeeplinkMode KWHzl() {
        return AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC43233rlS
    public java.lang.String OLrzqt() {
        return KWHzl;
    }

    @Override // o.InterfaceC43233rlS
    public boolean copydefault() {
        return false;
    }

    private C54423xHw() {
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
