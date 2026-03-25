package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Al, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C3391Al {
    public static final InterfaceC5037Ch OLrzqt(@NotNull InterfaceC59068za interfaceC59068za, @NotNull InterfaceC5037Ch interfaceC5037Ch) {
        Intrinsics.checkNotNullParameter(interfaceC59068za, "");
        Intrinsics.checkNotNullParameter(interfaceC5037Ch, "");
        AbstractC59439zh abstractC59439zhKWHzl = C58752zO.KWHzl(interfaceC5037Ch.KWHzl());
        if (abstractC59439zhKWHzl == null) {
            return interfaceC5037Ch;
        }
        C5036Cg c5036CgEZpvd = C5043Cn.EZpvd(interfaceC5037Ch);
        c5036CgEZpvd.EZpvd(C58752zO.EZpvd(interfaceC59068za.copydefault(abstractC59439zhKWHzl)));
        c5036CgEZpvd.AEQbTJ().OLrzqt("Content-Encoding", interfaceC59068za.copydefault());
        return c5036CgEZpvd.copydefault();
    }
}
