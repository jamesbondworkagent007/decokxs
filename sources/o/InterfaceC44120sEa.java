package o;

import com.okinc.core.util.SPUtils;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sEa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC44120sEa {

    /* JADX INFO: renamed from: o.sEa$Application */
    public static final class Application {
        public static boolean EZpvd(@NotNull InterfaceC44120sEa interfaceC44120sEa) {
            boolean zAEQbTJ = sDZ.AEQbTJ.fetchVPNInfo().getValue().AEQbTJ();
            boolean zDbNXlk = C44157sFk.gEmmrt().DbNXlk();
            boolean zValues = C44157sFk.gEmmrt().values();
            boolean zCopydefault = C34703nhO.copydefault();
            boolean z = SPUtils.getBoolean("KEY_DISABLE_COR_TOGGLE", false);
            boolean zCopydefault2 = sSI.copydefault.copydefault();
            boolean z2 = (!zAEQbTJ || z) && !((zValues && zDbNXlk) || zCopydefault);
            C33084mpl.AEQbTJ("KEY_IS_IM_ENABLE", java.lang.Boolean.valueOf(z2));
            return z2 || zCopydefault2;
        }
    }
}
