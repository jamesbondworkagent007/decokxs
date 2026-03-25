package o;

import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bIa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8748bIa extends AbstractC8422bCS {
    public final InterfaceC8702bHh AhwBna;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8748bIa(@NotNull AbstractC8564bFB<?, ?> abstractC8564bFB, @NotNull InterfaceC8702bHh interfaceC8702bHh) {
        super(abstractC8564bFB);
        Intrinsics.checkNotNullParameter(abstractC8564bFB, "");
        Intrinsics.checkNotNullParameter(interfaceC8702bHh, "");
        this.AhwBna = interfaceC8702bHh;
    }

    @Override // o.AbstractC8426bCW
    public java.lang.String AEQbTJ() {
        return C54862xYb.convertToBigIntegerString$default(C54862xYb.OLrzqt(this.AhwBna.OLrzqt(), this.AhwBna.copydefault()), false, RoundingMode.UP, 1, (java.lang.Object) null);
    }
}
