package o;

import com.okinc.im.config.page.IMPageType;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.odu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C36596odu {
    public static final C36596odu copydefault = new C36596odu();
    public static final java.util.Map<IMPageType, C35285nsT> AEQbTJ = new LinkedHashMap();
    public static final java.util.Map<IMPageType, InterfaceC35280nsO> OLrzqt = new LinkedHashMap();
    public static final java.util.Map<IMPageType, InterfaceC35284nsS> KWHzl = new LinkedHashMap();
    public static final int EZpvd = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<IMPageType, InterfaceC35280nsO> KWHzl() {
        return OLrzqt;
    }

    private C36596odu() {
    }

    public final void KWHzl(@NotNull IMPageType iMPageType, @NotNull C35285nsT c35285nsT) {
        Intrinsics.checkNotNullParameter(iMPageType, "");
        Intrinsics.checkNotNullParameter(c35285nsT, "");
        AEQbTJ.put(iMPageType, c35285nsT);
    }

    public final C35285nsT KWHzl(IMPageType iMPageType) {
        return AEQbTJ.get(iMPageType);
    }

    public final void EZpvd(@NotNull IMPageType iMPageType, @NotNull InterfaceC35280nsO interfaceC35280nsO) {
        Intrinsics.checkNotNullParameter(iMPageType, "");
        Intrinsics.checkNotNullParameter(interfaceC35280nsO, "");
        OLrzqt.put(iMPageType, interfaceC35280nsO);
    }

    public final InterfaceC35284nsS OLrzqt(@NotNull IMPageType iMPageType) {
        Intrinsics.checkNotNullParameter(iMPageType, "");
        return KWHzl.get(iMPageType);
    }
}
