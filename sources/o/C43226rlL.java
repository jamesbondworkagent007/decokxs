package o;

import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rlL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43226rlL implements InterfaceC43237rlW {
    public final InterfaceC43237rlW AEQbTJ;
    public final InterfaceComponentCallbacks2C43266rlz OLrzqt;
    public static final Activity Companion = new Activity(null);
    public static final java.util.Map<InterfaceC43233rlS, InterfaceComponentCallbacks2C43266rlz> EZpvd = new LinkedHashMap(400);
    public static final java.util.Map<InterfaceC43233rlS, InterfaceComponentCallbacks2C43266rlz> copydefault = new LinkedHashMap();
    public static final java.util.Map<InterfaceC43232rlR, InterfaceComponentCallbacks2C43266rlz> KWHzl = new LinkedHashMap();

    public C43226rlL(@NotNull InterfaceC43237rlW interfaceC43237rlW, @NotNull InterfaceComponentCallbacks2C43266rlz interfaceComponentCallbacks2C43266rlz) {
        Intrinsics.checkNotNullParameter(interfaceC43237rlW, "");
        Intrinsics.checkNotNullParameter(interfaceComponentCallbacks2C43266rlz, "");
        this.AEQbTJ = interfaceC43237rlW;
        this.OLrzqt = interfaceComponentCallbacks2C43266rlz;
    }

    /* JADX INFO: renamed from: o.rlL$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rlL.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final InterfaceComponentCallbacks2C43266rlz OLrzqt(@NotNull InterfaceC43233rlS interfaceC43233rlS) {
            Intrinsics.checkNotNullParameter(interfaceC43233rlS, "");
            return (InterfaceComponentCallbacks2C43266rlz) C43226rlL.EZpvd.remove(interfaceC43233rlS);
        }

        public final InterfaceComponentCallbacks2C43266rlz AEQbTJ(@NotNull InterfaceC43232rlR interfaceC43232rlR) {
            Intrinsics.checkNotNullParameter(interfaceC43232rlR, "");
            return (InterfaceComponentCallbacks2C43266rlz) C43226rlL.KWHzl.remove(interfaceC43232rlR);
        }
    }

    @Override // o.InterfaceC43237rlW
    public void copydefault(@NotNull InterfaceC43233rlS interfaceC43233rlS, @NotNull final InterfaceC56387yDm<? extends InterfaceC43234rlT> interfaceC56387yDm) {
        Intrinsics.checkNotNullParameter(interfaceC43233rlS, "");
        Intrinsics.checkNotNullParameter(interfaceC56387yDm, "");
        if (EZpvd(this.OLrzqt, interfaceC43233rlS)) {
            this.AEQbTJ.copydefault(interfaceC43233rlS, C56392yDr.copydefault(new Function0() { // from class: o.rlM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C43226rlL.OLrzqt(interfaceC56387yDm);
                }
            }));
            EZpvd.put(interfaceC43233rlS, this.OLrzqt);
        }
    }

    public static final C43224rlJ OLrzqt(InterfaceC56387yDm interfaceC56387yDm) {
        return new C43224rlJ(interfaceC56387yDm);
    }

    @Override // o.InterfaceC43237rlW
    public void KWHzl(@NotNull InterfaceC43233rlS interfaceC43233rlS, @NotNull final InterfaceC56387yDm<? extends InterfaceC43234rlT> interfaceC56387yDm) {
        Intrinsics.checkNotNullParameter(interfaceC43233rlS, "");
        Intrinsics.checkNotNullParameter(interfaceC56387yDm, "");
        if (OLrzqt(this.OLrzqt, interfaceC43233rlS)) {
            this.AEQbTJ.KWHzl(interfaceC43233rlS, C56392yDr.copydefault(new Function0() { // from class: o.rlN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C43226rlL.valueOf(interfaceC56387yDm);
                }
            }));
            copydefault.put(interfaceC43233rlS, this.OLrzqt);
        }
    }

    public static final C43224rlJ valueOf(InterfaceC56387yDm interfaceC56387yDm) {
        return new C43224rlJ(interfaceC56387yDm);
    }

    @Override // o.InterfaceC43237rlW
    public void EZpvd(@NotNull InterfaceC43232rlR interfaceC43232rlR, @NotNull final InterfaceC56387yDm<? extends InterfaceC43236rlV> interfaceC56387yDm) {
        Intrinsics.checkNotNullParameter(interfaceC43232rlR, "");
        Intrinsics.checkNotNullParameter(interfaceC56387yDm, "");
        if (EZpvd(this.OLrzqt, interfaceC43232rlR)) {
            this.AEQbTJ.EZpvd(interfaceC43232rlR, C56392yDr.copydefault(new Function0() { // from class: o.rlO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C43226rlL.KWHzl(interfaceC56387yDm);
                }
            }));
            KWHzl.put(interfaceC43232rlR, this.OLrzqt);
        }
    }

    public static final C43223rlI KWHzl(InterfaceC56387yDm interfaceC56387yDm) {
        return new C43223rlI(interfaceC56387yDm);
    }

    public final boolean EZpvd(InterfaceComponentCallbacks2C43266rlz interfaceComponentCallbacks2C43266rlz, InterfaceC43232rlR interfaceC43232rlR) {
        boolean zContains;
        java.util.List<java.lang.String> sites = interfaceComponentCallbacks2C43266rlz.getSites();
        if (sites == null || sites.isEmpty()) {
            zContains = !KWHzl.containsKey(interfaceC43232rlR);
        } else {
            java.util.List<java.lang.String> sites2 = interfaceComponentCallbacks2C43266rlz.getSites();
            Intrinsics.copydefault(sites2);
            zContains = sites2.contains(C43246rlf.OLrzqt.AhwBna());
        }
        pUU.EZpvd("IMC", "register for " + interfaceComponentCallbacks2C43266rlz.getSites() + ", applink: " + interfaceC43232rlR.AEQbTJ() + ", shouldRegister: " + zContains);
        if (zContains) {
            pUU.EZpvd("Module", "[" + interfaceComponentCallbacks2C43266rlz.getClass().getSimpleName() + "] register applink: " + interfaceC43232rlR.AEQbTJ());
        }
        return zContains;
    }

    public final boolean EZpvd(InterfaceComponentCallbacks2C43266rlz interfaceComponentCallbacks2C43266rlz, InterfaceC43233rlS interfaceC43233rlS) {
        boolean zContains;
        java.util.List<java.lang.String> sites = interfaceComponentCallbacks2C43266rlz.getSites();
        if (sites == null || sites.isEmpty()) {
            zContains = !EZpvd.containsKey(interfaceC43233rlS);
        } else {
            java.util.List<java.lang.String> sites2 = interfaceComponentCallbacks2C43266rlz.getSites();
            Intrinsics.copydefault(sites2);
            zContains = sites2.contains(C43246rlf.OLrzqt.AhwBna());
        }
        pUU.EZpvd("IMC", "register for " + interfaceComponentCallbacks2C43266rlz.getSites() + ", metadata: " + interfaceC43233rlS.OLrzqt() + ", shouldRegister: " + zContains);
        if (zContains) {
            pUU.EZpvd("Module", "[" + interfaceComponentCallbacks2C43266rlz.getClass().getSimpleName() + "] register deeplink: " + interfaceC43233rlS.OLrzqt());
        }
        return zContains;
    }

    public final boolean OLrzqt(InterfaceComponentCallbacks2C43266rlz interfaceComponentCallbacks2C43266rlz, InterfaceC43233rlS interfaceC43233rlS) {
        boolean zContains;
        java.util.List<java.lang.String> sites = interfaceComponentCallbacks2C43266rlz.getSites();
        if (sites == null || sites.isEmpty()) {
            zContains = !copydefault.containsKey(interfaceC43233rlS);
        } else {
            java.util.List<java.lang.String> sites2 = interfaceComponentCallbacks2C43266rlz.getSites();
            Intrinsics.copydefault(sites2);
            zContains = sites2.contains(C43246rlf.OLrzqt.AhwBna());
        }
        pUU.EZpvd("IMC", "register for " + interfaceComponentCallbacks2C43266rlz.getSites() + ", scheme: " + interfaceC43233rlS.OLrzqt() + ", shouldRegister: " + zContains);
        if (zContains) {
            pUU.EZpvd("Module", "[" + interfaceComponentCallbacks2C43266rlz.getClass().getSimpleName() + "] register scheme: " + interfaceC43233rlS.OLrzqt());
        }
        return zContains;
    }
}
