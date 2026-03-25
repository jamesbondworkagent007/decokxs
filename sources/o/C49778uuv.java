package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uuv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C49778uuv {
    public static final C49778uuv copydefault = new C49778uuv();

    private C49778uuv() {
    }

    public final boolean KWHzl(@NotNull java.lang.String str) {
        C56084xwD c56084xwDEZpvd;
        java.util.List<java.lang.String> listOLrzqt;
        Intrinsics.checkNotNullParameter(str, "");
        xOW xowKWHzl = KWHzl();
        return (xowKWHzl == null || xowKWHzl.getNewProxyInstance()) && (c56084xwDEZpvd = EZpvd()) != null && (listOLrzqt = c56084xwDEZpvd.OLrzqt()) != null && listOLrzqt.contains(str);
    }

    public final xOW KWHzl() {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null) {
            return interfaceC54581xNrOLrzqt.getNewProxyInstance();
        }
        return null;
    }

    public final C56084xwD EZpvd() {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null) {
            return interfaceC54581xNrOLrzqt.getFieldNames();
        }
        return null;
    }
}
