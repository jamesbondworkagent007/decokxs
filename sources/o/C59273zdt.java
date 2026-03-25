package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zdt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59273zdt {
    public static final InterfaceC59382zfw copydefault(@NotNull InterfaceC59324zer interfaceC59324zer, @NotNull InterfaceC59382zfw interfaceC59382zfw) {
        Intrinsics.checkNotNullParameter(interfaceC59324zer, "");
        Intrinsics.checkNotNullParameter(interfaceC59382zfw, "");
        return AEQbTJ(interfaceC59324zer, interfaceC59382zfw, new java.util.HashSet());
    }

    public static final InterfaceC59382zfw AEQbTJ(InterfaceC59324zer interfaceC59324zer, InterfaceC59382zfw interfaceC59382zfw, java.util.HashSet<InterfaceC59385zfz> hashSet) {
        InterfaceC59382zfw interfaceC59382zfwAEQbTJ;
        InterfaceC59382zfw interfaceC59382zfwUzCIH;
        InterfaceC59385zfz interfaceC59385zfzIwGUEr = interfaceC59324zer.iwGUEr(interfaceC59382zfw);
        if (!hashSet.add(interfaceC59385zfzIwGUEr)) {
            return null;
        }
        InterfaceC59383zfx interfaceC59383zfxCopydefault = interfaceC59324zer.copydefault(interfaceC59385zfzIwGUEr);
        if (interfaceC59383zfxCopydefault != null) {
            InterfaceC59382zfw interfaceC59382zfwOLrzqt = interfaceC59324zer.OLrzqt(interfaceC59383zfxCopydefault);
            interfaceC59382zfwAEQbTJ = AEQbTJ(interfaceC59324zer, interfaceC59382zfwOLrzqt, hashSet);
            if (interfaceC59382zfwAEQbTJ == null) {
                return null;
            }
            boolean z = interfaceC59324zer.djBIcL(interfaceC59324zer.iwGUEr(interfaceC59382zfwOLrzqt)) || ((interfaceC59382zfwOLrzqt instanceof InterfaceC59380zfu) && interfaceC59324zer.EZpvd((InterfaceC59380zfu) interfaceC59382zfwOLrzqt));
            if ((interfaceC59382zfwAEQbTJ instanceof InterfaceC59380zfu) && interfaceC59324zer.EZpvd((InterfaceC59380zfu) interfaceC59382zfwAEQbTJ) && interfaceC59324zer.fIwbmz(interfaceC59382zfw) && z) {
                interfaceC59382zfwUzCIH = interfaceC59324zer.uzCIH(interfaceC59382zfwOLrzqt);
            } else if (!interfaceC59324zer.fIwbmz(interfaceC59382zfwAEQbTJ) && interfaceC59324zer.values(interfaceC59382zfw)) {
                interfaceC59382zfwUzCIH = interfaceC59324zer.uzCIH(interfaceC59382zfwAEQbTJ);
            }
            return interfaceC59382zfwUzCIH;
        }
        if (!interfaceC59324zer.djBIcL(interfaceC59385zfzIwGUEr)) {
            return interfaceC59382zfw;
        }
        InterfaceC59382zfw interfaceC59382zfwDjBIcL = interfaceC59324zer.djBIcL(interfaceC59382zfw);
        if (interfaceC59382zfwDjBIcL == null || (interfaceC59382zfwAEQbTJ = AEQbTJ(interfaceC59324zer, interfaceC59382zfwDjBIcL, hashSet)) == null) {
            return null;
        }
        if (interfaceC59324zer.fIwbmz(interfaceC59382zfw)) {
            return interfaceC59324zer.fIwbmz(interfaceC59382zfwAEQbTJ) ? interfaceC59382zfw : ((interfaceC59382zfwAEQbTJ instanceof InterfaceC59380zfu) && interfaceC59324zer.EZpvd((InterfaceC59380zfu) interfaceC59382zfwAEQbTJ)) ? interfaceC59382zfw : interfaceC59324zer.uzCIH(interfaceC59382zfwAEQbTJ);
        }
        return interfaceC59382zfwAEQbTJ;
    }
}
