package o;

import com.okinc.modular.deeplinkv2.DeeplinkMode;
import o.InterfaceC54415xHo;

/* JADX INFO: renamed from: o.xHx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54424xHx implements InterfaceC54415xHo {
    public static final C54424xHx KWHzl = new C54424xHx();
    public static final java.lang.String copydefault = "trade_bot/signal_detail/page";
    public static final DeeplinkMode EZpvd = DeeplinkMode.LITE;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC43233rlS
    public DeeplinkMode KWHzl() {
        return EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC43233rlS
    public java.lang.String OLrzqt() {
        return copydefault;
    }

    @Override // o.InterfaceC43233rlS
    public boolean copydefault() {
        return true;
    }

    private C54424xHx() {
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
