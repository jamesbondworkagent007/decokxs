package o;

import com.okinc.modular.deeplinkv2.DeeplinkMode;
import o.InterfaceC43233rlS;

/* JADX INFO: renamed from: o.rYj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C42587rYj {
    public static final InterfaceC43233rlS AEQbTJ = new ActionBar();
    public static final InterfaceC43233rlS copydefault = new Application();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final InterfaceC43233rlS EZpvd() {
        return copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final InterfaceC43233rlS KWHzl() {
        return AEQbTJ;
    }

    /* JADX INFO: renamed from: o.rYj$ActionBar */
    public static final class ActionBar implements InterfaceC43233rlS {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC43233rlS
        public java.lang.String OLrzqt() {
            return "lifecycle/channelSettings";
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
            return DeeplinkMode.PRO;
        }

        @Override // o.InterfaceC43233rlS
        public java.util.List<C43240rlZ> AEQbTJ() {
            return C56402yEa.EZpvd(new C43240rlZ("categoryType", false));
        }
    }

    /* JADX INFO: renamed from: o.rYj$Application */
    public static final class Application implements InterfaceC43233rlS {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC43233rlS
        public java.lang.String OLrzqt() {
            return "lifecycle/channelSettings";
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

        @Override // o.InterfaceC43233rlS
        public java.util.List<C43240rlZ> AEQbTJ() {
            return C56402yEa.EZpvd(new C43240rlZ("categoryType", false));
        }
    }
}
