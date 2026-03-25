package o;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mtI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33267mtI {
    public static final C33267mtI OLrzqt = new C33267mtI();
    public static final java.util.Map<java.lang.String, InterfaceC33213msH> EZpvd = new LinkedHashMap();
    public static final int AEQbTJ = 8;

    private C33267mtI() {
    }

    public final InterfaceC33213msH AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return EZpvd.get(str);
    }

    public final InterfaceC33213msH AEQbTJ(@NotNull InterfaceC33213msH interfaceC33213msH) {
        Intrinsics.checkNotNullParameter(interfaceC33213msH, "");
        return EZpvd.put(interfaceC33213msH.KWHzl().OLrzqt(), interfaceC33213msH);
    }
}
