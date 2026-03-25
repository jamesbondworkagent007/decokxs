package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nty, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35369nty implements InterfaceC43234rlT {
    public static final C35369nty EZpvd = new C35369nty();

    private C35369nty() {
    }

    @Override // o.InterfaceC43234rlT
    public void OLrzqt(@NotNull android.content.Context context, @NotNull InterfaceC43233rlS interfaceC43233rlS, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43233rlS, "");
        Intrinsics.checkNotNullParameter(map, "");
        C43056riA.AEQbTJ.copydefault(context, "vipcrm", "/vipcrm/route", C56424yEw.OLrzqt(map, C56423yEv.EZpvd(C56390yDp.OLrzqt("IS_SECURE", java.lang.Boolean.valueOf(AEQbTJ(context))))));
    }

    public final boolean AEQbTJ(android.content.Context context) {
        return !C34703nhO.AhwBna(context);
    }
}
