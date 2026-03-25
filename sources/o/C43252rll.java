package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rll, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43252rll {
    public static final java.util.List<java.lang.String> EZpvd = yDY.gEmmrt("MLN", "OKRuntime", "OKSecurity", "OKUser", "Pandora", "OKDebugger", "OKRiskLibrary", "OKPush");

    public static final InterfaceC43299rmf OLrzqt(@NotNull android.app.Application application, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(str, "");
        boolean zContains = EZpvd.contains(str);
        if (zContains) {
            InterfaceC43216rlB interfaceC43216rlBOLrzqt = C43251rlk.OLrzqt((java.lang.Class<InterfaceC43216rlB>) InterfaceC43298rme.class);
            interfaceC43299rmf = interfaceC43216rlBOLrzqt instanceof InterfaceC43299rmf ? (InterfaceC43299rmf) interfaceC43216rlBOLrzqt : null;
            if (interfaceC43299rmf == null) {
                throw new java.lang.IllegalStateException("Register service: IExtensionRegistry first.");
            }
        }
        return interfaceC43299rmf;
    }

    public static final InterfaceC43237rlW copydefault(@NotNull android.app.Application application, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (EZpvd.contains(str)) {
            return C43239rlY.AEQbTJ;
        }
        return null;
    }
}
