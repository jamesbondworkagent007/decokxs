package o;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.C8114awd;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.avY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C8056avY {
    public static final C8056avY OLrzqt = new C8056avY();
    public static final ConcurrentHashMap<java.lang.String, C8053avV> AEQbTJ = new ConcurrentHashMap<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ(java.lang.String str) {
        return str != null ? str : "default";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConcurrentHashMap<java.lang.String, C8053avV> OLrzqt() {
        return AEQbTJ;
    }

    private C8056avY() {
    }

    public final void OLrzqt(@NotNull android.content.Context context, @NotNull C8055avX c8055avX) {
        C8114awd.Application applicationKWHzl;
        yHO<java.lang.Boolean, java.lang.String, android.view.View, Unit> yhoOLrzqt;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(c8055avX, "");
        if (!AEQbTJ(c8055avX)) {
            C8053avV c8053avV = new C8053avV(context, c8055avX);
            if (c8053avV.AEQbTJ()) {
                ConcurrentHashMap<java.lang.String, C8053avV> concurrentHashMap = AEQbTJ;
                java.lang.String strDjBIcL = c8055avX.djBIcL();
                Intrinsics.copydefault((java.lang.Object) strDjBIcL);
                concurrentHashMap.put(strDjBIcL, c8053avV);
                return;
            }
            return;
        }
        InterfaceC8111awa interfaceC8111awaOLrzqt = c8055avX.OLrzqt();
        if (interfaceC8111awaOLrzqt != null) {
            interfaceC8111awaOLrzqt.EZpvd(false, "Tag exception. You need to set different EasyFloat tag.", null);
        }
        C8114awd c8114awdAYXKKw = c8055avX.AYXKKw();
        if (c8114awdAYXKKw != null && (applicationKWHzl = c8114awdAYXKKw.KWHzl()) != null && (yhoOLrzqt = applicationKWHzl.OLrzqt()) != null) {
            yhoOLrzqt.invoke(java.lang.Boolean.FALSE, "Tag exception. You need to set different EasyFloat tag.", null);
        }
        C8130awt.OLrzqt.KWHzl("Tag exception. You need to set different EasyFloat tag.");
    }

    public static /* synthetic */ Unit dismiss$default(C8056avY c8056avY, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return c8056avY.copydefault(str, z);
    }

    public final Unit copydefault(java.lang.String str, boolean z) {
        C8053avV c8053avVKWHzl = KWHzl(str);
        if (c8053avVKWHzl == null) {
            return null;
        }
        if (z) {
            c8053avVKWHzl.EZpvd(z);
        } else {
            c8053avVKWHzl.copydefault();
        }
        return Unit.INSTANCE;
    }

    public final C8053avV OLrzqt(java.lang.String str) {
        return AEQbTJ.remove(AEQbTJ(str));
    }

    public static /* synthetic */ Unit visible$default(C8056avY c8056avY, boolean z, java.lang.String str, boolean z2, int i, java.lang.Object obj) {
        C8055avX c8055avXEZpvd;
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            C8053avV c8053avV = AEQbTJ.get(str);
            z2 = (c8053avV == null || (c8055avXEZpvd = c8053avV.EZpvd()) == null) ? true : c8055avXEZpvd.fIwbmz();
        }
        return c8056avY.AEQbTJ(z, str, z2);
    }

    public final Unit AEQbTJ(boolean z, java.lang.String str, boolean z2) {
        C8053avV c8053avVKWHzl = KWHzl(str);
        if (c8053avVKWHzl == null) {
            return null;
        }
        c8053avVKWHzl.KWHzl(z ? 0 : 8, z2);
        return Unit.INSTANCE;
    }

    public final boolean AEQbTJ(C8055avX c8055avX) {
        c8055avX.KWHzl(AEQbTJ(c8055avX.djBIcL()));
        ConcurrentHashMap<java.lang.String, C8053avV> concurrentHashMap = AEQbTJ;
        java.lang.String strDjBIcL = c8055avX.djBIcL();
        Intrinsics.copydefault((java.lang.Object) strDjBIcL);
        return concurrentHashMap.containsKey(strDjBIcL);
    }

    public final C8053avV KWHzl(java.lang.String str) {
        return AEQbTJ.get(AEQbTJ(str));
    }
}
