package o;

import com.okinc.business.appupdate.app.AppUpdateApplicationDelegate;
import com.okinc.business.appupdate.app.GPUpgradeModule;
import com.okinc.business.defi.dapp.app.DappApplicationDelegate;
import com.okinc.business.rewards.app.RewardsApplicationDelegate;
import com.okinc.liveness.lca.LcaDynamicApplicationDelegate;
import com.okinc.nft.app.NFTModule;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rlf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43246rlf {
    public static android.app.Application AEQbTJ;
    public static boolean EZpvd;
    public static final C43246rlf OLrzqt = new C43246rlf();
    public static final C43257rlq KWHzl = new C43257rlq();
    public static java.lang.String valueOf = "";
    public static final int copydefault = 8;

    public static final boolean OLrzqt() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return valueOf;
    }

    private C43246rlf() {
    }

    public final void OLrzqt(@NotNull android.app.Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        AEQbTJ = application;
        C43248rlh.KWHzl.init(application);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.rlf */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void init$default(C43246rlf c43246rlf, android.app.Application application, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function0 = new Function0() { // from class: o.rld
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return java.lang.Boolean.valueOf(C43246rlf.OLrzqt());
                }
            };
        }
        c43246rlf.OLrzqt(application, function0);
    }

    public final void OLrzqt(@NotNull android.app.Application application, @NotNull Function0<java.lang.Boolean> function0) {
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(function0, "");
        AEQbTJ = application;
        C43248rlh.KWHzl.init(application);
        if (function0.invoke().booleanValue()) {
            AEQbTJ();
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.rlh.getLogger$default(o.rlh, java.lang.String, int, java.lang.Object):o.rlx */
    public final void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C43248rlh.getLogger$default(C43248rlh.KWHzl, null, 1, null).KWHzl("Global", "initSite: " + str);
        valueOf = str;
    }

    public final void copydefault(@NotNull Function1<? super java.util.Collection<? extends InterfaceComponentCallbacks2C43266rlz>, ? extends java.util.Set<? extends InterfaceComponentCallbacks2C43266rlz>> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        KWHzl.AEQbTJ(function1);
    }

    public final void OLrzqt(@NotNull Function2<? super java.lang.String, ? super java.lang.Long, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        java.util.Iterator<T> it = KWHzl.KWHzl().iterator();
        while (it.hasNext()) {
            ((InterfaceComponentCallbacks2C43266rlz) it.next()).setCallback(function2);
        }
    }

    public final android.app.Application valueOf() {
        android.app.Application application = AEQbTJ;
        if (application != null) {
            return application;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final void AEQbTJ() {
        EZpvd(new C8091awG());
        EZpvd(new C8199ayI());
        EZpvd(new AppUpdateApplicationDelegate());
        EZpvd(new GPUpgradeModule());
        EZpvd(new C9678baC());
        EZpvd(new C9687baL());
        EZpvd(new C9919bef());
        EZpvd(new DappApplicationDelegate());
        EZpvd(new C19688gLq());
        EZpvd(new C23328hwE());
        EZpvd(new C25498ixp());
        EZpvd(new RewardsApplicationDelegate());
        EZpvd(new lzD());
        EZpvd(new C30363lVp());
        EZpvd(new C32794mkM());
        EZpvd(new C33183mre());
        EZpvd(new mAT());
        EZpvd(new mHR());
        EZpvd(new C31974mKv());
        EZpvd(new C34708nhT());
        EZpvd(new C35397nua());
        EZpvd(new C34056nPu());
        EZpvd(new oKH());
        EZpvd(new oKK());
        EZpvd(new pHN());
        EZpvd(new pKJ());
        EZpvd(new pPY());
        EZpvd(new LcaDynamicApplicationDelegate());
        EZpvd(new C43195rkh());
        EZpvd(new NFTModule());
        EZpvd(new C42490rUu());
        EZpvd(new rUL());
        EZpvd(new C42610rZf());
        EZpvd(new C44630saZ());
        EZpvd(new C44716scF());
        EZpvd(new C45700suw());
        EZpvd(new C45655suD());
        EZpvd(new C45749swM());
        EZpvd(new C44532sTj());
        EZpvd(new C47188tlN());
        EZpvd(new tSZ());
        EZpvd(new C46418tTp());
        EZpvd(new tTE());
        EZpvd(new C46520tXj());
        EZpvd(new tZK());
        EZpvd(new C48755ubf());
        EZpvd(new C48832udC());
        EZpvd(new C48973ufl());
        EZpvd(new C49728uty());
        EZpvd(new C48037uCq());
        EZpvd(new C48045uCy());
        EZpvd(new C57000yaE());
    }

    public final void EZpvd(InterfaceComponentCallbacks2C43266rlz interfaceComponentCallbacks2C43266rlz) {
        java.lang.String name = interfaceComponentCallbacks2C43266rlz.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "");
        EZpvd(name, interfaceComponentCallbacks2C43266rlz);
    }

    public final java.lang.String gEmmrt() {
        android.app.Application application = AEQbTJ;
        if (application == null) {
            Intrinsics.gEmmrt("");
            application = null;
        }
        return C43308rmo.copydefault(application);
    }

    public void EZpvd(@NotNull java.lang.String str, @NotNull InterfaceComponentCallbacks2C43266rlz interfaceComponentCallbacks2C43266rlz) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(interfaceComponentCallbacks2C43266rlz, "");
        android.app.Application application = AEQbTJ;
        if (application != null) {
            if (application == null) {
                Intrinsics.gEmmrt("");
                application = null;
            }
            interfaceComponentCallbacks2C43266rlz.init(application);
            KWHzl.KWHzl(str, interfaceComponentCallbacks2C43266rlz);
        }
    }

    public void OLrzqt(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        for (InterfaceComponentCallbacks2C43266rlz interfaceComponentCallbacks2C43266rlz : KWHzl.KWHzl()) {
            if (interfaceComponentCallbacks2C43266rlz.needRunOnProcess(context, OLrzqt.gEmmrt())) {
                interfaceComponentCallbacks2C43266rlz.attachBaseContext(context);
            }
        }
    }

    public void copydefault() {
        for (InterfaceComponentCallbacks2C43266rlz interfaceComponentCallbacks2C43266rlz : KWHzl.KWHzl()) {
            android.app.Application application = AEQbTJ;
            if (application == null) {
                Intrinsics.gEmmrt("");
                application = null;
            }
            C43246rlf c43246rlf = OLrzqt;
            if (interfaceComponentCallbacks2C43266rlz.needRunOnProcess(application, c43246rlf.gEmmrt())) {
                android.app.Application application2 = AEQbTJ;
                if (application2 == null) {
                    Intrinsics.gEmmrt("");
                    application2 = null;
                }
                if (C43308rmo.KWHzl(application2)) {
                    if (!interfaceComponentCallbacks2C43266rlz.isLazyInit()) {
                        interfaceComponentCallbacks2C43266rlz.create();
                        C43248rlh.getLogger$default(C43248rlh.KWHzl, null, 1, null).AEQbTJ("AbsModule", interfaceComponentCallbacks2C43266rlz.getClass().getSimpleName() + " onCreate in UIProcess:" + c43246rlf.gEmmrt());
                    }
                } else {
                    interfaceComponentCallbacks2C43266rlz.create();
                    C43248rlh.getLogger$default(C43248rlh.KWHzl, null, 1, null).AEQbTJ("AbsModule", interfaceComponentCallbacks2C43266rlz.getClass().getSimpleName() + " onCreate in subProcess:" + c43246rlf.gEmmrt());
                }
            }
        }
    }

    public void djBIcL() {
        for (InterfaceComponentCallbacks2C43266rlz interfaceComponentCallbacks2C43266rlz : KWHzl.KWHzl()) {
            android.app.Application application = AEQbTJ;
            if (application == null) {
                Intrinsics.gEmmrt("");
                application = null;
            }
            if (interfaceComponentCallbacks2C43266rlz.needRunOnProcess(application, OLrzqt.gEmmrt())) {
                interfaceComponentCallbacks2C43266rlz.onTerminate();
            }
        }
    }

    public void EZpvd(@NotNull android.content.res.Configuration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "");
        for (InterfaceComponentCallbacks2C43266rlz interfaceComponentCallbacks2C43266rlz : KWHzl.KWHzl()) {
            android.app.Application application = AEQbTJ;
            if (application == null) {
                Intrinsics.gEmmrt("");
                application = null;
            }
            if (interfaceComponentCallbacks2C43266rlz.needRunOnProcess(application, OLrzqt.gEmmrt())) {
                interfaceComponentCallbacks2C43266rlz.onConfigurationChanged(configuration);
            }
        }
    }

    public void AYXKKw() {
        for (InterfaceComponentCallbacks2C43266rlz interfaceComponentCallbacks2C43266rlz : KWHzl.KWHzl()) {
            android.app.Application application = AEQbTJ;
            if (application == null) {
                Intrinsics.gEmmrt("");
                application = null;
            }
            if (interfaceComponentCallbacks2C43266rlz.needRunOnProcess(application, OLrzqt.gEmmrt())) {
                interfaceComponentCallbacks2C43266rlz.onLowMemory();
            }
        }
    }

    public void AEQbTJ(int i) {
        for (InterfaceComponentCallbacks2C43266rlz interfaceComponentCallbacks2C43266rlz : KWHzl.KWHzl()) {
            android.app.Application application = AEQbTJ;
            if (application == null) {
                Intrinsics.gEmmrt("");
                application = null;
            }
            if (interfaceComponentCallbacks2C43266rlz.needRunOnProcess(application, OLrzqt.gEmmrt())) {
                interfaceComponentCallbacks2C43266rlz.onTrimMemory(i);
            }
        }
    }

    public void EZpvd() {
        if (EZpvd) {
            return;
        }
        EZpvd = true;
        for (InterfaceComponentCallbacks2C43266rlz interfaceComponentCallbacks2C43266rlz : KWHzl.KWHzl()) {
            interfaceComponentCallbacks2C43266rlz.markLaunchComplete();
            if (!interfaceComponentCallbacks2C43266rlz.isLazyInit() || interfaceComponentCallbacks2C43266rlz.isCreated()) {
                interfaceComponentCallbacks2C43266rlz.onLaunchComplete();
                C43251rlk.logger$default(null, 1, null).KWHzl("Dispatcher", interfaceComponentCallbacks2C43266rlz.getClass().getSimpleName() + " onLaunchComplete in UIProcess:" + OLrzqt.gEmmrt());
            }
        }
    }

    public final InterfaceComponentCallbacks2C43266rlz OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return KWHzl.OLrzqt(str);
    }
}
