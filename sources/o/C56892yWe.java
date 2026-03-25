package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yWe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56892yWe implements InterfaceC56686yOo {
    public final ySZ AEQbTJ;

    public C56892yWe(@NotNull ySZ ysz) {
        Intrinsics.checkNotNullParameter(ysz, "");
        this.AEQbTJ = ysz;
    }

    public java.lang.String toString() {
        return this.AEQbTJ + ": " + this.AEQbTJ.AhwBna().keySet();
    }

    @Override // o.InterfaceC56686yOo
    public InterfaceC56684yOm copydefault() {
        InterfaceC56684yOm interfaceC56684yOm = InterfaceC56684yOm.EZpvd;
        Intrinsics.checkNotNullExpressionValue(interfaceC56684yOm, "");
        return interfaceC56684yOm;
    }
}
