package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ixp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25498ixp extends C43265rly {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void attachBaseContext(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public int getPriority() {
        return 250;
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

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void onCreate() {
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

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void registerExtensions(@NotNull android.content.Context context, @NotNull InterfaceC43299rmf interfaceC43299rmf) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43299rmf, "");
        super.registerExtensions(context, interfaceC43299rmf);
        interfaceC43299rmf.EZpvd(InterfaceC9774bbt.class, C56392yDr.copydefault(new Function0() { // from class: o.ixt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C25498ixp.gEmmrt();
            }
        }));
        C7381aik.Companion.AEQbTJ(this, C56392yDr.copydefault(new Function0() { // from class: o.ixv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C25498ixp.AYXKKw();
            }
        }));
        interfaceC43299rmf.EZpvd(InterfaceC9770bbp.class, C56392yDr.copydefault(new Function0() { // from class: o.ixu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C25498ixp.AhwBna();
            }
        }));
    }

    public static final C25457ixA gEmmrt() {
        return new C25457ixA();
    }

    public static final C25417iwN AYXKKw() {
        return new C25417iwN();
    }

    public static final C25507ixy AhwBna() {
        return new C25507ixy();
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void registerService(@NotNull final android.content.Context context, @NotNull InterfaceC43253rlm interfaceC43253rlm) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43253rlm, "");
        super.registerService(context, interfaceC43253rlm);
        interfaceC43253rlm.EZpvd(InterfaceC25429iwZ.class, C56392yDr.copydefault(new Function0() { // from class: o.ixo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C25498ixp.EZpvd(context);
            }
        }));
        interfaceC43253rlm.EZpvd(InterfaceC23916iOb.class, C56392yDr.copydefault(new Function0() { // from class: o.ixq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C25498ixp.AEQbTJ(context);
            }
        }));
        interfaceC43253rlm.EZpvd(InterfaceC25424iwU.class, C56392yDr.copydefault(new Function0() { // from class: o.ixr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C25498ixp.isConnected();
            }
        }));
        interfaceC43253rlm.EZpvd(InterfaceC25426iwW.class, C56392yDr.copydefault(new Function0() { // from class: o.ixs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C25498ixp.fetchVPNInfo();
            }
        }));
    }

    public static final C25459ixC EZpvd(android.content.Context context) {
        return new C25459ixC(iNI.KWHzl(context).ORxRYg());
    }

    public static final InterfaceC23916iOb AEQbTJ(android.content.Context context) {
        return C23917iOc.Companion.copydefault(context);
    }

    public static final iOM isConnected() {
        return new iOM();
    }

    public static final C24206iYv fetchVPNInfo() {
        return new C24206iYv();
    }

    public static final C25494ixl valueOf() {
        return new C25494ixl();
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void registerDeeplinkHandlers(@NotNull android.content.Context context, @NotNull InterfaceC43237rlW interfaceC43237rlW) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43237rlW, "");
        interfaceC43237rlW.copydefault(C25496ixn.EZpvd, C56392yDr.copydefault(new Function0() { // from class: o.ixm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C25498ixp.valueOf();
            }
        }));
    }
}
