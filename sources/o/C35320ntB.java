package o;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.okinc.modular.deeplinkv2.DeeplinkMode;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC43233rlS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ntB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35320ntB {
    public static final C35320ntB EZpvd = new C35320ntB();

    private C35320ntB() {
    }

    public final void KWHzl(@NotNull C35322ntD c35322ntD) {
        Intrinsics.checkNotNullParameter(c35322ntD, "");
        C35369nty.EZpvd.OLrzqt(c35322ntD.copydefault(), new Application(), C56424yEw.gEmmrt(C56390yDp.OLrzqt(FirebaseAnalytics.Param.DESTINATION, "VIPDetails"), C56390yDp.OLrzqt("uid", c35322ntD.OLrzqt())));
    }

    /* JADX INFO: renamed from: o.ntB$Application */
    public static final class Application implements InterfaceC43233rlS {
        public final java.lang.String OLrzqt = "";
        public final DeeplinkMode EZpvd = DeeplinkMode.PRO;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC43233rlS
        public DeeplinkMode KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC43233rlS
        public java.lang.String OLrzqt() {
            return this.OLrzqt;
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
    }

    public final void EZpvd(@NotNull C35322ntD c35322ntD) {
        Intrinsics.checkNotNullParameter(c35322ntD, "");
        C35369nty.EZpvd.OLrzqt(c35322ntD.copydefault(), new TaskDescription(), C56424yEw.gEmmrt(C56390yDp.OLrzqt(FirebaseAnalytics.Param.DESTINATION, "VIPPerformance"), C56390yDp.OLrzqt("uid", c35322ntD.OLrzqt())));
    }

    /* JADX INFO: renamed from: o.ntB$TaskDescription */
    public static final class TaskDescription implements InterfaceC43233rlS {
        public final java.lang.String KWHzl = "";
        public final DeeplinkMode copydefault = DeeplinkMode.PRO;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC43233rlS
        public DeeplinkMode KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC43233rlS
        public java.lang.String OLrzqt() {
            return this.KWHzl;
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
    }
}
