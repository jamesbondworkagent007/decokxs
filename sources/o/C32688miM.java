package o;

import com.okinc.components.security.scanner.DeviceScanner;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.miM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C32688miM implements InterfaceC43234rlT {
    @Override // o.InterfaceC43234rlT
    public void OLrzqt(@NotNull android.content.Context context, @NotNull InterfaceC43233rlS interfaceC43233rlS, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        java.lang.String string;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43233rlS, "");
        Intrinsics.checkNotNullParameter(map, "");
        java.lang.Object obj = map.get("from");
        if (obj != null && (string = obj.toString()) != null) {
            str = string;
        }
        DeviceScanner.Companion.KWHzl(context, str);
    }
}
