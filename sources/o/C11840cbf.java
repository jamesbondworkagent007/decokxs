package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cbf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C11840cbf extends AbstractC8422bCS {
    public final InterfaceC11794cam AYXKKw;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11840cbf(@NotNull AbstractC8564bFB<?, ?> abstractC8564bFB, @NotNull InterfaceC11794cam interfaceC11794cam) {
        super(abstractC8564bFB);
        Intrinsics.checkNotNullParameter(abstractC8564bFB, "");
        Intrinsics.checkNotNullParameter(interfaceC11794cam, "");
        this.AYXKKw = interfaceC11794cam;
    }

    @Override // o.AbstractC8426bCW
    public java.lang.String AEQbTJ() {
        return this.AYXKKw.AEQbTJ().djBIcL();
    }
}
