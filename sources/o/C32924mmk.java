package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mmk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C32924mmk {
    public static final C32924mmk KWHzl = new C32924mmk();
    public static final int OLrzqt = 8;
    public static InterfaceC32925mml copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(InterfaceC32925mml interfaceC32925mml) {
        copydefault = interfaceC32925mml;
    }

    private C32924mmk() {
    }

    public final java.lang.String KWHzl(@NotNull java.util.Map<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(map, "");
        java.lang.String str = map.get("app_mode_realtime_okx");
        if (str == null || str.length() == 0 || !C34704nhP.copydefault.copydefault()) {
            return null;
        }
        return map.get("app_mode_realtime_okx");
    }

    public final java.lang.String EZpvd() {
        InterfaceC32925mml interfaceC32925mml = copydefault;
        if (interfaceC32925mml != null) {
            return interfaceC32925mml.OLrzqt();
        }
        return null;
    }
}
