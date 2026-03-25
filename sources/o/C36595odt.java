package o;

import com.okinc.im.config.page.IMPageType;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.odt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C36595odt {
    public static final C36595odt EZpvd = new C36595odt();
    public static final java.util.Map<java.lang.String, InterfaceC35277nsL> KWHzl = new LinkedHashMap();
    public static final java.util.Map<IMPageType, InterfaceC35277nsL> copydefault = new LinkedHashMap();
    public static final int AEQbTJ = 8;

    private C36595odt() {
    }

    public final void KWHzl(@NotNull java.lang.String str, @NotNull InterfaceC35277nsL interfaceC35277nsL) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(interfaceC35277nsL, "");
        KWHzl.putIfAbsent(str, interfaceC35277nsL);
    }

    public final java.util.Map<java.lang.String, InterfaceC35277nsL> OLrzqt() {
        return C56424yEw.values(KWHzl);
    }

    public final void EZpvd(@NotNull IMPageType iMPageType, @NotNull InterfaceC35277nsL interfaceC35277nsL) {
        Intrinsics.checkNotNullParameter(iMPageType, "");
        Intrinsics.checkNotNullParameter(interfaceC35277nsL, "");
        copydefault.putIfAbsent(iMPageType, interfaceC35277nsL);
    }

    public final InterfaceC35277nsL KWHzl(@NotNull IMPageType iMPageType) {
        Intrinsics.checkNotNullParameter(iMPageType, "");
        return copydefault.get(iMPageType);
    }
}
