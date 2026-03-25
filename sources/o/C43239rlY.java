package o;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rlY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43239rlY implements InterfaceC43237rlW {
    public static final C43239rlY AEQbTJ = new C43239rlY();
    public static final java.util.Map<java.lang.String, InterfaceC43233rlS> AhwBna = new LinkedHashMap(400);
    public static final java.util.Map<java.lang.String, InterfaceC43232rlR> OLrzqt = new LinkedHashMap();
    public static final java.util.Map<java.lang.String, InterfaceC56387yDm<InterfaceC43234rlT>> EZpvd = new LinkedHashMap(400);
    public static final java.util.Map<java.lang.String, InterfaceC56387yDm<InterfaceC43234rlT>> gEmmrt = new LinkedHashMap();
    public static final java.util.Map<java.lang.String, InterfaceC56387yDm<InterfaceC43236rlV>> copydefault = new LinkedHashMap();
    public static final int KWHzl = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, InterfaceC56387yDm<InterfaceC43234rlT>> AEQbTJ() {
        return gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, InterfaceC56387yDm<InterfaceC43234rlT>> EZpvd() {
        return EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, InterfaceC43232rlR> KWHzl() {
        return OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, InterfaceC56387yDm<InterfaceC43236rlV>> OLrzqt() {
        return copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, InterfaceC43233rlS> copydefault() {
        return AhwBna;
    }

    private C43239rlY() {
    }

    @Override // o.InterfaceC43237rlW
    public void copydefault(@NotNull InterfaceC43233rlS interfaceC43233rlS, @NotNull InterfaceC56387yDm<? extends InterfaceC43234rlT> interfaceC56387yDm) {
        Intrinsics.checkNotNullParameter(interfaceC43233rlS, "");
        Intrinsics.checkNotNullParameter(interfaceC56387yDm, "");
        java.lang.String str = interfaceC43233rlS.KWHzl().getMode() + "/" + interfaceC43233rlS.OLrzqt();
        java.util.Map<java.lang.String, InterfaceC56387yDm<InterfaceC43234rlT>> map = EZpvd;
        if (!map.containsKey(str)) {
            java.util.Map<java.lang.String, InterfaceC43233rlS> map2 = AhwBna;
            if (!map2.containsKey(str)) {
                map.put(str, interfaceC56387yDm);
                map2.put(str, interfaceC43233rlS);
                return;
            }
        }
        throw new java.lang.AssertionError("DeeplinkRegistryManagerImpl: registerHandler: path already registered - " + str);
    }

    @Override // o.InterfaceC43237rlW
    public void KWHzl(@NotNull InterfaceC43233rlS interfaceC43233rlS, @NotNull InterfaceC56387yDm<? extends InterfaceC43234rlT> interfaceC56387yDm) {
        Intrinsics.checkNotNullParameter(interfaceC43233rlS, "");
        Intrinsics.checkNotNullParameter(interfaceC56387yDm, "");
        java.util.Map<java.lang.String, InterfaceC56387yDm<InterfaceC43234rlT>> map = gEmmrt;
        if (map.containsKey(interfaceC43233rlS.OLrzqt())) {
            throw new java.lang.AssertionError("DeeplinkRegistryManagerImpl: registerScheme: scheme already registered - " + interfaceC43233rlS.OLrzqt());
        }
        map.put(interfaceC43233rlS.OLrzqt(), interfaceC56387yDm);
        AhwBna.put(interfaceC43233rlS.OLrzqt(), interfaceC43233rlS);
    }

    @Override // o.InterfaceC43237rlW
    public void EZpvd(@NotNull InterfaceC43232rlR interfaceC43232rlR, @NotNull InterfaceC56387yDm<? extends InterfaceC43236rlV> interfaceC56387yDm) {
        Intrinsics.checkNotNullParameter(interfaceC43232rlR, "");
        Intrinsics.checkNotNullParameter(interfaceC56387yDm, "");
        java.util.Map<java.lang.String, InterfaceC56387yDm<InterfaceC43236rlV>> map = copydefault;
        if (map.containsKey(interfaceC43232rlR.AEQbTJ())) {
            throw new java.lang.AssertionError("DeeplinkRegistryManagerImpl: registerAppLink: appLink already registered - " + interfaceC43232rlR.AEQbTJ());
        }
        map.put(interfaceC43232rlR.AEQbTJ(), interfaceC56387yDm);
        OLrzqt.put(interfaceC43232rlR.AEQbTJ(), interfaceC43232rlR);
    }
}
