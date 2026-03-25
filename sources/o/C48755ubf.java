package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ubf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C48755ubf extends C43265rly {
    public static final Activity Companion = new Activity(null);
    public static final yIP<java.lang.Object, android.app.Application> OLrzqt = yIJ.OLrzqt.EZpvd();

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public int getPriority() {
        return 302;
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

    @Override // o.C43265rly, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
    }

    /* JADX INFO: renamed from: o.ubf$Activity */
    public static final class Activity {
        public static final /* synthetic */ yJA<java.lang.Object>[] EZpvd = {C56524yIo.EZpvd(new MutablePropertyReference1Impl(Activity.class, "mApp", "getMApp()Landroid/app/Application;", 0))};

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ubf.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final void OLrzqt(@NotNull android.app.Application application) {
            Intrinsics.checkNotNullParameter(application, "");
            C48755ubf.OLrzqt.KWHzl(this, EZpvd[0], application);
        }
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void attachBaseContext(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        Companion.OLrzqt(getApplication());
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void onCreate() {
        ((InterfaceC48893ueK) C43251rlk.copydefault(InterfaceC48893ueK.class)).AEQbTJ(new C48748ubY());
        ((InterfaceC48893ueK) C43251rlk.copydefault(InterfaceC48893ueK.class)).copydefault("referralShareBottomProviderId", new C48744ubU());
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void registerService(@NotNull android.content.Context context, @NotNull InterfaceC43253rlm interfaceC43253rlm) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43253rlm, "");
        super.registerService(context, interfaceC43253rlm);
        interfaceC43253rlm.EZpvd(InterfaceC48694uaX.class, C56392yDr.copydefault(new Function0() { // from class: o.ubd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C48755ubf.djBIcL();
            }
        }));
    }

    public static final C48761ubl djBIcL() {
        return new C48761ubl();
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void registerExtensions(@NotNull android.content.Context context, @NotNull InterfaceC43299rmf interfaceC43299rmf) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43299rmf, "");
        super.registerExtensions(context, interfaceC43299rmf);
        interfaceC43299rmf.EZpvd(InterfaceC7377aig.class, C56392yDr.copydefault(new Function0() { // from class: o.ubc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C48755ubf.valueOf();
            }
        }));
        C43056riA.AEQbTJ.OLrzqt("referral", new C48762ubm());
    }

    public static final C48764ubo valueOf() {
        return new C48764ubo();
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void registerDeeplinkHandlers(@NotNull android.content.Context context, @NotNull InterfaceC43237rlW interfaceC43237rlW) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43237rlW, "");
        super.registerDeeplinkHandlers(context, interfaceC43237rlW);
        InterfaceC56387yDm<? extends InterfaceC43234rlT> interfaceC56387yDmCopydefault = C56392yDr.copydefault(new Function0() { // from class: o.ube
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C48755ubf.AEQbTJ();
            }
        });
        java.util.Iterator<T> it = C48759ubj.Companion.AEQbTJ().iterator();
        while (it.hasNext()) {
            interfaceC43237rlW.copydefault((InterfaceC43233rlS) it.next(), interfaceC56387yDmCopydefault);
        }
    }

    public static final C48759ubj AEQbTJ() {
        return new C48759ubj();
    }
}
