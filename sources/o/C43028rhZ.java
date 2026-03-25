package o;

import android.os.MessageQueue;
import com.okinc.modular.deeplinkv2.DeeplinkMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C48846udQ;
import o.InterfaceC43233rlS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rhZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43028rhZ {
    public static final C43028rhZ copydefault = new C43028rhZ();
    public static boolean KWHzl = true;
    public static final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.rie
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C43028rhZ.values();
        }
    });
    public static final int EZpvd = 8;

    private C43028rhZ() {
    }

    public static final C58216yxB values() {
        return new C58216yxB();
    }

    public final void EZpvd(@NotNull final android.app.Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        if (KWHzl) {
            C43082ria.EZpvd.AEQbTJ(application);
            android.os.Looper.getMainLooper().getQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: o.rih
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.os.MessageQueue.IdleHandler
                public final boolean queueIdle() {
                    return C43028rhZ.copydefault(application);
                }
            });
            C30360lVm c30360lVm = C30360lVm.KWHzl;
            c30360lVm.AEQbTJ(new C43127rjS());
            c30360lVm.AEQbTJ(new C43041rhm());
        }
        C48846udQ.OLrzqt.EZpvd(new Fragment());
        application.registerActivityLifecycleCallbacks(new C43106riy());
        KWHzl(application);
    }

    public static final boolean copydefault(android.app.Application application) {
        C43082ria.initMLN$default(application, null, 2, null);
        return false;
    }

    /* JADX INFO: renamed from: o.rhZ$Fragment */
    public static final class Fragment implements C48846udQ.Activity {
        @Override // o.C48846udQ.Activity
        public void AEQbTJ(java.lang.String str, android.net.Uri uri) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(uri, "");
            InterfaceC7298ahG interfaceC7298ahGKWHzl = C7323ahf.KWHzl();
            if (interfaceC7298ahGKWHzl != null) {
                interfaceC7298ahGKWHzl.AEQbTJ("UIApplicationUserDidTakeScreenshotNotification", null, C56423yEv.EZpvd(C56390yDp.OLrzqt("path", str)));
            }
        }
    }

    public final void KWHzl(@NotNull android.app.Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        InterfaceC43237rlW interfaceC43237rlWCopydefault = C43252rll.copydefault(application, "MLN");
        if (interfaceC43237rlWCopydefault != null) {
            DeeplinkMode deeplinkMode = DeeplinkMode.APP;
            interfaceC43237rlWCopydefault.copydefault(new Activity(deeplinkMode), C56392yDr.copydefault(new Function0() { // from class: o.rif
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C43028rhZ.DbNXlk();
                }
            }));
            DeeplinkMode deeplinkMode2 = DeeplinkMode.PRO;
            interfaceC43237rlWCopydefault.copydefault(new Activity(deeplinkMode2), C56392yDr.copydefault(new Function0() { // from class: o.rii
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C43028rhZ.isConnected();
                }
            }));
            DeeplinkMode deeplinkMode3 = DeeplinkMode.LITE;
            interfaceC43237rlWCopydefault.copydefault(new Activity(deeplinkMode3), C56392yDr.copydefault(new Function0() { // from class: o.rig
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C43028rhZ.AkhnZx();
                }
            }));
            DeeplinkMode deeplinkMode4 = DeeplinkMode.WALLET;
            interfaceC43237rlWCopydefault.copydefault(new Activity(deeplinkMode4), C56392yDr.copydefault(new Function0() { // from class: o.rin
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C43028rhZ.ejfBZ();
                }
            }));
            interfaceC43237rlWCopydefault.copydefault(new StateListAnimator(deeplinkMode), C56392yDr.copydefault(new Function0() { // from class: o.rik
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C43028rhZ.fIwbmz();
                }
            }));
            interfaceC43237rlWCopydefault.copydefault(new StateListAnimator(deeplinkMode2), C56392yDr.copydefault(new Function0() { // from class: o.rim
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C43028rhZ.fJNWhG();
                }
            }));
            interfaceC43237rlWCopydefault.copydefault(new StateListAnimator(deeplinkMode3), C56392yDr.copydefault(new Function0() { // from class: o.ril
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C43028rhZ.fARcdN();
                }
            }));
            interfaceC43237rlWCopydefault.copydefault(new StateListAnimator(deeplinkMode4), C56392yDr.copydefault(new Function0() { // from class: o.rij
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C43028rhZ.AuCTel();
                }
            }));
            interfaceC43237rlWCopydefault.copydefault(new ActionBar(deeplinkMode), C56392yDr.copydefault(new Function0() { // from class: o.rir
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C43028rhZ.fetchVPNInfo();
                }
            }));
        }
    }

    public static final Application DbNXlk() {
        return new Application();
    }

    public static final Application isConnected() {
        return new Application();
    }

    public static final Application AkhnZx() {
        return new Application();
    }

    public static final Application ejfBZ() {
        return new Application();
    }

    public static final Application fIwbmz() {
        return new Application();
    }

    public static final Application fJNWhG() {
        return new Application();
    }

    public static final Application fARcdN() {
        return new Application();
    }

    public static final Application AuCTel() {
        return new Application();
    }

    public static final TaskDescription fetchVPNInfo() {
        return new TaskDescription();
    }

    /* JADX INFO: renamed from: o.rhZ$Activity */
    public static final class Activity implements InterfaceC43233rlS {
        public final java.lang.String AEQbTJ;
        public final DeeplinkMode OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC43233rlS
        public DeeplinkMode KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC43233rlS
        public java.lang.String OLrzqt() {
            return this.AEQbTJ;
        }

        @Override // o.InterfaceC43233rlS
        public boolean copydefault() {
            return false;
        }

        public Activity(@NotNull DeeplinkMode deeplinkMode) {
            Intrinsics.checkNotNullParameter(deeplinkMode, "");
            this.OLrzqt = deeplinkMode;
            this.AEQbTJ = "miniapp";
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

    /* JADX INFO: renamed from: o.rhZ$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC43233rlS {
        public final java.lang.String KWHzl;
        public final DeeplinkMode OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC43233rlS
        public DeeplinkMode KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC43233rlS
        public java.lang.String OLrzqt() {
            return this.KWHzl;
        }

        @Override // o.InterfaceC43233rlS
        public boolean copydefault() {
            return true;
        }

        public StateListAnimator(@NotNull DeeplinkMode deeplinkMode) {
            Intrinsics.checkNotNullParameter(deeplinkMode, "");
            this.OLrzqt = deeplinkMode;
            this.KWHzl = "miniapp/auth";
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

    /* JADX INFO: renamed from: o.rhZ$Application */
    public static final class Application implements InterfaceC43234rlT {
        @Override // o.InterfaceC43234rlT
        public void OLrzqt(@NotNull android.content.Context context, @NotNull InterfaceC43233rlS interfaceC43233rlS, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(interfaceC43233rlS, "");
            Intrinsics.checkNotNullParameter(map, "");
            C43056riA.AEQbTJ.EZpvd(context, map);
        }
    }

    /* JADX INFO: renamed from: o.rhZ$ActionBar */
    public static final class ActionBar implements InterfaceC43233rlS {
        public final java.lang.String KWHzl;
        public final DeeplinkMode OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC43233rlS
        public DeeplinkMode KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC43233rlS
        public java.lang.String OLrzqt() {
            return this.KWHzl;
        }

        @Override // o.InterfaceC43233rlS
        public boolean copydefault() {
            return false;
        }

        public ActionBar(@NotNull DeeplinkMode deeplinkMode) {
            Intrinsics.checkNotNullParameter(deeplinkMode, "");
            this.OLrzqt = deeplinkMode;
            this.KWHzl = "debug_mln";
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

    /* JADX INFO: renamed from: o.rhZ$TaskDescription */
    public static final class TaskDescription implements InterfaceC43234rlT {
        @Override // o.InterfaceC43234rlT
        public void OLrzqt(@NotNull android.content.Context context, @NotNull InterfaceC43233rlS interfaceC43233rlS, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(interfaceC43233rlS, "");
            Intrinsics.checkNotNullParameter(map, "");
            Function2<android.content.Context, java.util.Map<java.lang.String, ? extends java.lang.Object>, Unit> function2OLrzqt = C43047rhs.AEQbTJ.OLrzqt().OLrzqt();
            if (function2OLrzqt != null) {
                function2OLrzqt.invoke(context, map);
            }
        }
    }
}
