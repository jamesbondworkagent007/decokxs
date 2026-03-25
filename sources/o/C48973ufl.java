package o;

import android.view.ViewGroup;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.okinc.web.bean.WebShareInfo;
import com.okinc.web.web.IWebActivityAPI;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48931uew;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ufl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C48973ufl extends C43265rly {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static volatile boolean KWHzl;

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public int getPriority() {
        return 470;
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public boolean isLazyInit() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C43265rly, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull android.content.res.Configuration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "");
    }

    @Override // o.C43265rly, android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void onTerminate() {
    }

    @Override // o.C43265rly, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
    }

    /* JADX INFO: renamed from: o.ufl$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ufl.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void onCreate() {
        AkhnZx();
        ejfBZ();
        fIwbmz();
        pUU.KWHzl("ShareAppDelegate", "ShareApplicationDelegate->onCreate");
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void onLaunchComplete() {
        super.onLaunchComplete();
        pUU.EZpvd("ShareAppDelegate", "onLaunchComplete->");
        C49004ugP.OLrzqt.copydefault(getApplication());
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void registerExtensions(@NotNull android.content.Context context, @NotNull InterfaceC43299rmf interfaceC43299rmf) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43299rmf, "");
        super.registerExtensions(context, interfaceC43299rmf);
        interfaceC43299rmf.EZpvd(mMP.class, C56392yDr.copydefault(new Function0() { // from class: o.ufo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C48973ufl.AYXKKw();
            }
        }));
        interfaceC43299rmf.EZpvd(InterfaceC7377aig.class, C56392yDr.copydefault(new Function0() { // from class: o.ufp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C48973ufl.DbNXlk();
            }
        }));
    }

    public static final C49225ukY AYXKKw() {
        return new C49225ukY(C52761wXj.TaskDescription.clearRegistrations, 1, TypedValues.TransitionType.TYPE_DURATION);
    }

    public static final C49047uhF DbNXlk() {
        return new C49047uhF();
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void registerService(@NotNull android.content.Context context, @NotNull InterfaceC43253rlm interfaceC43253rlm) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43253rlm, "");
        super.registerService(context, interfaceC43253rlm);
        interfaceC43253rlm.EZpvd(InterfaceC48893ueK.class, C56392yDr.copydefault(new Function0() { // from class: o.ufr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C48973ufl.values();
            }
        }));
    }

    public static final C49013ugY values() {
        return new C49013ugY();
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void registerCustomHandler(@NotNull android.content.Context context, @NotNull InterfaceC43220rlF interfaceC43220rlF) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43220rlF, "");
        super.registerCustomHandler(context, interfaceC43220rlF);
        C57337ygX.EZpvd(interfaceC43220rlF, new C49092uhy());
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void registerDeeplinkHandlers(@NotNull android.content.Context context, @NotNull InterfaceC43237rlW interfaceC43237rlW) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43237rlW, "");
        super.registerDeeplinkHandlers(context, interfaceC43237rlW);
        interfaceC43237rlW.copydefault(C49035ugu.EZpvd, C56392yDr.copydefault(new Function0() { // from class: o.ufs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C48973ufl.gEmmrt();
            }
        }));
    }

    public static final C49033ugs gEmmrt() {
        return new C49033ugs();
    }

    public final void ejfBZ() {
        C57309yfw c57309yfw = C57309yfw.AEQbTJ;
        c57309yfw.copydefault(new Function0() { // from class: o.ufn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(C48973ufl.fetchVPNInfo());
            }
        });
        c57309yfw.KWHzl(new Function0() { // from class: o.ufq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C48973ufl.isConnected();
            }
        });
        c57309yfw.AEQbTJ(new yHO() { // from class: o.ufu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C48973ufl.OLrzqt((AbstractActivityC33041mov) obj, (IWebActivityAPI) obj2, (WebShareInfo) obj3);
            }
        });
        c57309yfw.AEQbTJ(new Function2() { // from class: o.ufv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C48973ufl.copydefault((IWebActivityAPI) obj, (WebShareInfo) obj2);
            }
        });
        pUU.KWHzl("StartupPreloader", "webViewConfig-->");
    }

    public static final boolean fetchVPNInfo() {
        return ((InterfaceC48893ueK) C43251rlk.copydefault(InterfaceC48893ueK.class)).uzCIH();
    }

    public static final android.view.View isConnected() {
        android.content.Context contextAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        if (contextAEQbTJ == null) {
            contextAEQbTJ = C32979mnm.EZpvd.OLrzqt();
        }
        android.view.View viewInflate = android.view.LayoutInflater.from(contextAEQbTJ).inflate(C48931uew.Application.wlaJM, (android.view.ViewGroup) null);
        viewInflate.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return viewInflate;
    }

    public static final Unit OLrzqt(AbstractActivityC33041mov abstractActivityC33041mov, IWebActivityAPI iWebActivityAPI, WebShareInfo webShareInfo) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        ((InterfaceC48893ueK) C43251rlk.copydefault(InterfaceC48893ueK.class)).EZpvd(abstractActivityC33041mov, iWebActivityAPI, webShareInfo);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(IWebActivityAPI iWebActivityAPI, WebShareInfo webShareInfo) {
        ((InterfaceC48893ueK) C43251rlk.copydefault(InterfaceC48893ueK.class)).copydefault(iWebActivityAPI, webShareInfo);
        return Unit.INSTANCE;
    }

    public final void fIwbmz() {
        C49181ujh.EZpvd.EZpvd(getApplication());
    }

    public final void AkhnZx() {
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: o.uft
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C48973ufl.AhwBna();
            }
        });
    }

    public static final void AhwBna() {
        try {
            if (KWHzl) {
                pUU.EZpvd("ShareAppDelegate", "Platform callback already registered, skip");
                return;
            }
            KWHzl = true;
            ANQ.registerPlatformPackageCallback(new C48888ueF());
            pUU.KWHzl("ShareAppDelegate", "registerPlatformPackageCallback success");
        } catch (java.lang.Throwable unused) {
            KWHzl = false;
            pUU.copydefault("ShareAppDelegate", "registerPlatformPackageCallback failed");
        }
    }
}
