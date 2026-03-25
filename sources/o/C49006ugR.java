package o;

import com.okinc.share.bean.ShareConfig;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ugR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C49006ugR {
    public static final C49006ugR KWHzl = new C49006ugR();
    public static final ConcurrentHashMap<java.lang.String, InterfaceC49002ugN> AEQbTJ = new ConcurrentHashMap<>();
    public static final int OLrzqt = 8;

    private C49006ugR() {
    }

    public final void OLrzqt(@NotNull java.lang.String str, @NotNull InterfaceC49002ugN interfaceC49002ugN) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(interfaceC49002ugN, "");
        AEQbTJ.put(str, interfaceC49002ugN);
    }

    public final InterfaceC49002ugN KWHzl(java.lang.String str) {
        return AEQbTJ.getOrDefault(str, null);
    }

    public final AbstractC32996moC OLrzqt(@NotNull java.lang.String str, @NotNull ShareConfig shareConfig) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(shareConfig, "");
        InterfaceC49002ugN interfaceC49002ugNKWHzl = KWHzl(str);
        if (interfaceC49002ugNKWHzl != null) {
            return interfaceC49002ugNKWHzl.EZpvd(shareConfig);
        }
        return null;
    }
}
