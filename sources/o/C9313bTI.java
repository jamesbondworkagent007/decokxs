package o;

import com.okinc.business.defi.api.model.tx.FeeType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bTI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C9313bTI extends C9311bTG {
    public final FeeType gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC8485bDc, o.AbstractC8426bCW
    public java.lang.String AEQbTJ() {
        return "0";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC8485bDc, o.AbstractC8426bCW
    public FeeType copydefault() {
        return this.gEmmrt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9313bTI(@NotNull AbstractC8564bFB<?, ?> abstractC8564bFB, @NotNull InterfaceC8931bLy interfaceC8931bLy) {
        super(abstractC8564bFB, interfaceC8931bLy);
        Intrinsics.checkNotNullParameter(abstractC8564bFB, "");
        Intrinsics.checkNotNullParameter(interfaceC8931bLy, "");
        this.gEmmrt = FeeType.FEE_TYPE_FREE;
    }
}
