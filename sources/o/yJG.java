package o;

import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC56558yJv;
import o.yJA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yJG {
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e3 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e5 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean EZpvd(@NotNull InterfaceC56549yJm<?> interfaceC56549yJm) {
        java.lang.reflect.Constructor constructorCopydefault;
        InterfaceC56627yMj<?> interfaceC56627yMjAhwBna;
        java.lang.reflect.Method methodKWHzl;
        java.lang.reflect.Method methodKWHzl2;
        java.lang.reflect.Method methodCopydefault;
        java.lang.reflect.Method methodCopydefault2;
        java.lang.reflect.Method methodCopydefault3;
        Intrinsics.checkNotNullParameter(interfaceC56549yJm, "");
        if (interfaceC56549yJm instanceof InterfaceC56558yJv) {
            yJA yja = (yJA) interfaceC56549yJm;
            java.lang.reflect.Field fieldKWHzl = yJN.KWHzl((yJA<?>) yja);
            return (fieldKWHzl == null || fieldKWHzl.isAccessible()) && ((methodCopydefault2 = yJN.copydefault((yJA<?>) yja)) == null || methodCopydefault2.isAccessible()) && ((methodCopydefault3 = yJN.copydefault((InterfaceC56558yJv<?>) interfaceC56549yJm)) == null || methodCopydefault3.isAccessible());
        }
        if (interfaceC56549yJm instanceof yJA) {
            yJA yja2 = (yJA) interfaceC56549yJm;
            java.lang.reflect.Field fieldKWHzl2 = yJN.KWHzl((yJA<?>) yja2);
            if ((fieldKWHzl2 == null || fieldKWHzl2.isAccessible()) && ((methodCopydefault = yJN.copydefault((yJA<?>) yja2)) == null || methodCopydefault.isAccessible())) {
            }
        } else if (interfaceC56549yJm instanceof yJA.StateListAnimator) {
            java.lang.reflect.Field fieldKWHzl3 = yJN.KWHzl((yJA<?>) ((yJA.StateListAnimator) interfaceC56549yJm).fetchVPNInfo());
            if ((fieldKWHzl3 == null || fieldKWHzl3.isAccessible()) && ((methodKWHzl2 = yJN.KWHzl((InterfaceC56555yJs<?>) interfaceC56549yJm)) == null || methodKWHzl2.isAccessible())) {
            }
        } else if (interfaceC56549yJm instanceof InterfaceC56558yJv.StateListAnimator) {
            java.lang.reflect.Field fieldKWHzl4 = yJN.KWHzl((yJA<?>) ((InterfaceC56558yJv.StateListAnimator) interfaceC56549yJm).fetchVPNInfo());
            if ((fieldKWHzl4 == null || fieldKWHzl4.isAccessible()) && ((methodKWHzl = yJN.KWHzl((InterfaceC56555yJs<?>) interfaceC56549yJm)) == null || methodKWHzl.isAccessible())) {
            }
        } else {
            if (interfaceC56549yJm instanceof InterfaceC56555yJs) {
                InterfaceC56555yJs interfaceC56555yJs = (InterfaceC56555yJs) interfaceC56549yJm;
                java.lang.reflect.Method methodKWHzl3 = yJN.KWHzl((InterfaceC56555yJs<?>) interfaceC56555yJs);
                if (methodKWHzl3 == null || methodKWHzl3.isAccessible()) {
                    AbstractC56573yKj<?> abstractC56573yKjAEQbTJ = yLX.AEQbTJ(interfaceC56549yJm);
                    java.lang.reflect.Member memberOLrzqt = (abstractC56573yKjAEQbTJ == null || (interfaceC56627yMjAhwBna = abstractC56573yKjAEQbTJ.AhwBna()) == null) ? null : interfaceC56627yMjAhwBna.OLrzqt();
                    java.lang.reflect.AccessibleObject accessibleObject = memberOLrzqt instanceof java.lang.reflect.AccessibleObject ? (java.lang.reflect.AccessibleObject) memberOLrzqt : null;
                    if ((accessibleObject == null || accessibleObject.isAccessible()) && ((constructorCopydefault = yJN.copydefault(interfaceC56555yJs)) == null || constructorCopydefault.isAccessible())) {
                    }
                }
            }
            throw new java.lang.UnsupportedOperationException("Unknown callable: " + interfaceC56549yJm + " (" + interfaceC56549yJm.getClass() + ')');
        }
    }

    public static final void OLrzqt(@NotNull InterfaceC56549yJm<?> interfaceC56549yJm, boolean z) {
        InterfaceC56627yMj<?> interfaceC56627yMjAhwBna;
        Intrinsics.checkNotNullParameter(interfaceC56549yJm, "");
        if (interfaceC56549yJm instanceof InterfaceC56558yJv) {
            yJA yja = (yJA) interfaceC56549yJm;
            java.lang.reflect.Field fieldKWHzl = yJN.KWHzl((yJA<?>) yja);
            if (fieldKWHzl != null) {
                fieldKWHzl.setAccessible(z);
            }
            java.lang.reflect.Method methodCopydefault = yJN.copydefault((yJA<?>) yja);
            if (methodCopydefault != null) {
                methodCopydefault.setAccessible(z);
            }
            java.lang.reflect.Method methodCopydefault2 = yJN.copydefault((InterfaceC56558yJv<?>) interfaceC56549yJm);
            if (methodCopydefault2 != null) {
                methodCopydefault2.setAccessible(z);
                return;
            }
            return;
        }
        if (interfaceC56549yJm instanceof yJA) {
            yJA yja2 = (yJA) interfaceC56549yJm;
            java.lang.reflect.Field fieldKWHzl2 = yJN.KWHzl((yJA<?>) yja2);
            if (fieldKWHzl2 != null) {
                fieldKWHzl2.setAccessible(z);
            }
            java.lang.reflect.Method methodCopydefault3 = yJN.copydefault((yJA<?>) yja2);
            if (methodCopydefault3 != null) {
                methodCopydefault3.setAccessible(z);
                return;
            }
            return;
        }
        if (interfaceC56549yJm instanceof yJA.StateListAnimator) {
            java.lang.reflect.Field fieldKWHzl3 = yJN.KWHzl((yJA<?>) ((yJA.StateListAnimator) interfaceC56549yJm).fetchVPNInfo());
            if (fieldKWHzl3 != null) {
                fieldKWHzl3.setAccessible(z);
            }
            java.lang.reflect.Method methodKWHzl = yJN.KWHzl((InterfaceC56555yJs<?>) interfaceC56549yJm);
            if (methodKWHzl != null) {
                methodKWHzl.setAccessible(z);
                return;
            }
            return;
        }
        if (interfaceC56549yJm instanceof InterfaceC56558yJv.StateListAnimator) {
            java.lang.reflect.Field fieldKWHzl4 = yJN.KWHzl((yJA<?>) ((InterfaceC56558yJv.StateListAnimator) interfaceC56549yJm).fetchVPNInfo());
            if (fieldKWHzl4 != null) {
                fieldKWHzl4.setAccessible(z);
            }
            java.lang.reflect.Method methodKWHzl2 = yJN.KWHzl((InterfaceC56555yJs<?>) interfaceC56549yJm);
            if (methodKWHzl2 != null) {
                methodKWHzl2.setAccessible(z);
                return;
            }
            return;
        }
        if (interfaceC56549yJm instanceof InterfaceC56555yJs) {
            InterfaceC56555yJs interfaceC56555yJs = (InterfaceC56555yJs) interfaceC56549yJm;
            java.lang.reflect.Method methodKWHzl3 = yJN.KWHzl((InterfaceC56555yJs<?>) interfaceC56555yJs);
            if (methodKWHzl3 != null) {
                methodKWHzl3.setAccessible(z);
            }
            AbstractC56573yKj<?> abstractC56573yKjAEQbTJ = yLX.AEQbTJ(interfaceC56549yJm);
            java.lang.reflect.Member memberOLrzqt = (abstractC56573yKjAEQbTJ == null || (interfaceC56627yMjAhwBna = abstractC56573yKjAEQbTJ.AhwBna()) == null) ? null : interfaceC56627yMjAhwBna.OLrzqt();
            java.lang.reflect.AccessibleObject accessibleObject = memberOLrzqt instanceof java.lang.reflect.AccessibleObject ? (java.lang.reflect.AccessibleObject) memberOLrzqt : null;
            if (accessibleObject != null) {
                accessibleObject.setAccessible(true);
            }
            java.lang.reflect.Constructor constructorCopydefault = yJN.copydefault(interfaceC56555yJs);
            if (constructorCopydefault != null) {
                constructorCopydefault.setAccessible(z);
                return;
            }
            return;
        }
        throw new java.lang.UnsupportedOperationException("Unknown callable: " + interfaceC56549yJm + " (" + interfaceC56549yJm.getClass() + ')');
    }
}
