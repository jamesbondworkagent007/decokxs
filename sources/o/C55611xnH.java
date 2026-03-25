package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xnH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55611xnH {
    public static final java.lang.String EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        InterfaceC46557tYt interfaceC46557tYt = (InterfaceC46557tYt) C43251rlk.OLrzqt(InterfaceC46557tYt.class);
        java.lang.Integer numValueOf = interfaceC46557tYt != null ? java.lang.Integer.valueOf(interfaceC46557tYt.EZpvd()) : null;
        return (numValueOf != null && numValueOf.intValue() == 1) ? str2 : (numValueOf != null && numValueOf.intValue() == 2) ? str3 : str;
    }
}
