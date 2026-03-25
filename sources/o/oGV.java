package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oGV {
    public static final oGV EZpvd = new oGV();

    private oGV() {
    }

    public final android.app.Activity copydefault(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        while (context != null) {
            if (context instanceof android.app.Activity) {
                return (android.app.Activity) context;
            }
            android.content.ContextWrapper contextWrapper = context instanceof android.content.ContextWrapper ? (android.content.ContextWrapper) context : null;
            context = contextWrapper != null ? contextWrapper.getBaseContext() : null;
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: o.oGV */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void processDeeplink$default(oGV ogv, android.content.Context context, java.lang.String str, java.util.Map map, Function0 function0, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            map = C56424yEw.KWHzl();
        }
        java.util.Map map2 = map;
        if ((i & 8) != 0) {
            function0 = null;
        }
        ogv.OLrzqt(context, str, map2, function0, function1);
    }

    public final void OLrzqt(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map, Function0<Unit> function0, @NotNull Function1<? super AbstractC43238rlX, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (sSI.copydefault.copydefault()) {
            pUU.KWHzl("DeeplinkUtil", "RM Mode is enabled, skipping deeplink processing.");
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        android.app.Activity activityCopydefault = copydefault(context);
        if (activityCopydefault == null) {
            pUU.copydefault("DeeplinkUtil", "Cannot process deeplink: no Activity found in context");
            C55326xho.OLrzqt("Context unavailable, cannot navigate");
            return;
        }
        InterfaceC43294rma interfaceC43294rma = (InterfaceC43294rma) C43251rlk.OLrzqt(InterfaceC43294rma.class);
        if (interfaceC43294rma != null) {
            interfaceC43294rma.KWHzl(activityCopydefault, str, map, function1);
            return;
        }
        pUU.copydefault("DeeplinkUtil", "DeeplinkService is unavailable, cannot process deeplink: " + str);
        C55326xho.OLrzqt("DeeplinkService unavailable, cannot navigate");
    }

    public final boolean KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC43294rma interfaceC43294rma = (InterfaceC43294rma) C43251rlk.OLrzqt(InterfaceC43294rma.class);
        if (interfaceC43294rma != null) {
            return interfaceC43294rma.AkhnZx(str);
        }
        return false;
    }

    public final boolean copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC43294rma interfaceC43294rma = (InterfaceC43294rma) C43251rlk.OLrzqt(InterfaceC43294rma.class);
        if (interfaceC43294rma != null) {
            return interfaceC43294rma.values(str);
        }
        return false;
    }

    public final java.util.Map<java.lang.String, java.lang.Object> AEQbTJ(@NotNull java.lang.String str) {
        java.util.Map<java.lang.String, java.lang.Object> mapFetchVPNInfo;
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC43294rma interfaceC43294rma = (InterfaceC43294rma) C43251rlk.OLrzqt(InterfaceC43294rma.class);
        return (interfaceC43294rma == null || (mapFetchVPNInfo = interfaceC43294rma.fetchVPNInfo(str)) == null) ? C56424yEw.KWHzl() : mapFetchVPNInfo;
    }
}
