package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.AbstractC55709xp;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Ae, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3020Ae {
    public static /* synthetic */ InterfaceC52616wS sigV4$default(boolean z, java.lang.String str, java.lang.String str2, java.lang.Boolean bool, java.lang.Boolean bool2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            bool = null;
        }
        if ((i & 16) != 0) {
            bool2 = null;
        }
        return OLrzqt(z, str, str2, bool, bool2);
    }

    public static final InterfaceC52616wS OLrzqt(boolean z, java.lang.String str, java.lang.String str2, java.lang.Boolean bool, java.lang.Boolean bool2) {
        InterfaceC57843yq interfaceC57843yqCopydefault;
        if (z || str != null || str2 != null || bool != null || bool2 != null) {
            InterfaceC56293yA interfaceC56293yAAEQbTJ = C58108yv.AEQbTJ();
            copydefault(interfaceC56293yAAEQbTJ, C55232xg.EZpvd.gEmmrt(), str2);
            EZpvd(interfaceC56293yAAEQbTJ, z, str, bool, bool2);
            interfaceC57843yqCopydefault = interfaceC56293yAAEQbTJ;
        } else {
            interfaceC57843yqCopydefault = C58108yv.copydefault();
        }
        return C52589wR.copydefault(C52643wT.OLrzqt.OLrzqt(), interfaceC57843yqCopydefault);
    }

    public static final void copydefault(@NotNull InterfaceC56293yA interfaceC56293yA, @NotNull C57737yo<java.lang.String> c57737yo, java.lang.String str) {
        Intrinsics.checkNotNullParameter(interfaceC56293yA, "");
        Intrinsics.checkNotNullParameter(c57737yo, "");
        if (str == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            return;
        }
        interfaceC56293yA.OLrzqt(c57737yo, str);
    }

    public static /* synthetic */ void setCommonSigV4Attrs$default(InterfaceC56293yA interfaceC56293yA, boolean z, java.lang.String str, java.lang.Boolean bool, java.lang.Boolean bool2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            bool = null;
        }
        if ((i & 16) != 0) {
            bool2 = null;
        }
        EZpvd(interfaceC56293yA, z, str, bool, bool2);
    }

    public static final void EZpvd(@NotNull InterfaceC56293yA interfaceC56293yA, boolean z, java.lang.String str, java.lang.Boolean bool, java.lang.Boolean bool2) {
        Intrinsics.checkNotNullParameter(interfaceC56293yA, "");
        if (z) {
            interfaceC56293yA.OLrzqt(C55232xg.EZpvd.EZpvd(), AbstractC55709xp.LoaderManager.copydefault);
        }
        C55232xg c55232xg = C55232xg.EZpvd;
        copydefault(interfaceC56293yA, c55232xg.AYXKKw(), str);
        if (bool != null) {
            interfaceC56293yA.OLrzqt(c55232xg.valueOf(), java.lang.Boolean.valueOf(!bool.booleanValue()));
        }
        if (bool2 != null) {
            interfaceC56293yA.OLrzqt(c55232xg.AEQbTJ(), bool2);
        }
    }
}
