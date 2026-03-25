package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bIi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8756bIi extends AbstractC8422bCS {
    public final AbstractC8752bIe djBIcL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8756bIi(@NotNull AbstractC8752bIe abstractC8752bIe) {
        super(abstractC8752bIe);
        Intrinsics.checkNotNullParameter(abstractC8752bIe, "");
        this.djBIcL = abstractC8752bIe;
    }

    @Override // o.AbstractC8426bCW
    public java.lang.String AEQbTJ() {
        return this.djBIcL.AEQbTJ();
    }
}
