package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.suw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45700suw extends C43265rly {
    public InterfaceC45720svc EZpvd;
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.suA
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C45700suw.KWHzl(this.EZpvd);
        }
    });

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public boolean isLazyInit() {
        return false;
    }

    public static final C45743svz KWHzl(C45700suw c45700suw) {
        InterfaceC45720svc interfaceC45720svc = c45700suw.EZpvd;
        if (interfaceC45720svc == null) {
            Intrinsics.gEmmrt("");
            interfaceC45720svc = null;
        }
        return interfaceC45720svc.RzdrRQ();
    }

    @Override // o.C43265rly
    public void onInit(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        super.onInit(context);
        pUU.copydefault("LiteHeroPage", "OKHeroModule init");
        this.EZpvd = (InterfaceC45720svc) C58114yvF.OLrzqt(context, InterfaceC45720svc.class);
        C45662suK.KWHzl.OLrzqt(C56392yDr.copydefault(new Function0() { // from class: o.suC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C45700suw.gEmmrt(this.EZpvd);
            }
        }), C56392yDr.copydefault(new Function0() { // from class: o.suB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C45700suw.valueOf(this.copydefault);
            }
        }), C56392yDr.copydefault(new Function0() { // from class: o.suE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C45700suw.AhwBna(this.AEQbTJ);
            }
        }));
    }

    public static final C45706svB gEmmrt(C45700suw c45700suw) {
        InterfaceC45720svc interfaceC45720svc = c45700suw.EZpvd;
        if (interfaceC45720svc == null) {
            Intrinsics.gEmmrt("");
            interfaceC45720svc = null;
        }
        return interfaceC45720svc.iCPUKe();
    }

    public static final InterfaceC45723svf valueOf(C45700suw c45700suw) {
        InterfaceC45720svc interfaceC45720svc = c45700suw.EZpvd;
        if (interfaceC45720svc == null) {
            Intrinsics.gEmmrt("");
            interfaceC45720svc = null;
        }
        return interfaceC45720svc.UccSpe();
    }

    public static final C45730svm AhwBna(C45700suw c45700suw) {
        InterfaceC45720svc interfaceC45720svc = c45700suw.EZpvd;
        if (interfaceC45720svc == null) {
            Intrinsics.gEmmrt("");
            interfaceC45720svc = null;
        }
        return interfaceC45720svc.iHkeWl();
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void onLaunchComplete() {
        super.onLaunchComplete();
        pUU.copydefault("LiteHeroPage", "onLaunchComplete");
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void onCreate() {
        super.onCreate();
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void registerService(@NotNull android.content.Context context, @NotNull InterfaceC43253rlm interfaceC43253rlm) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43253rlm, "");
        super.registerService(context, interfaceC43253rlm);
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void registerDeeplinkHandlers(@NotNull android.content.Context context, @NotNull InterfaceC43237rlW interfaceC43237rlW) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43237rlW, "");
        super.registerDeeplinkHandlers(context, interfaceC43237rlW);
        interfaceC43237rlW.copydefault(C45674suW.KWHzl, C56392yDr.copydefault(new Function0() { // from class: o.sux
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C45700suw.AEQbTJ();
            }
        }));
    }

    public static final C45674suW AEQbTJ() {
        return new C45674suW();
    }
}
