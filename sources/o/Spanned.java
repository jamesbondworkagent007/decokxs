package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class Spanned {
    public static final InterfaceC52697wV AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, C5173Hn c5173Hn, java.lang.String str4, java.lang.String str5) {
        InterfaceC57843yq interfaceC57843yqCopydefault;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (str4 != null || str5 != null) {
            InterfaceC56293yA interfaceC56293yAAEQbTJ = C58108yv.AEQbTJ();
            C58108yv.AEQbTJ(interfaceC56293yAAEQbTJ, C5046Cq.AEQbTJ.EZpvd(), str4);
            C58108yv.AEQbTJ(interfaceC56293yAAEQbTJ, FilterOutputStream.EZpvd.EZpvd(), str5);
            interfaceC57843yqCopydefault = interfaceC56293yAAEQbTJ;
        } else {
            interfaceC57843yqCopydefault = C58108yv.copydefault();
        }
        return InterfaceC52697wV.copydefault.copydefault(str, str2, (16 & 4) != 0 ? null : str3, (16 & 8) != 0 ? null : c5173Hn, (16 & 16) != 0 ? null : null, (16 & 32) != 0 ? null : interfaceC57843yqCopydefault);
    }
}
