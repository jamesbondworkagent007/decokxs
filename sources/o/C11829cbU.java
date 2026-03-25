package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cbU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C11829cbU extends AbstractC8422bCS {
    public final InterfaceC11843cbi AhwBna;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11829cbU(@NotNull AbstractC8564bFB<?, ?> abstractC8564bFB, @NotNull InterfaceC11843cbi interfaceC11843cbi) {
        super(abstractC8564bFB);
        Intrinsics.checkNotNullParameter(abstractC8564bFB, "");
        Intrinsics.checkNotNullParameter(interfaceC11843cbi, "");
        this.AhwBna = interfaceC11843cbi;
    }

    @Override // o.AbstractC8426bCW
    public java.lang.String AEQbTJ() {
        return this.AhwBna.EZpvd();
    }
}
