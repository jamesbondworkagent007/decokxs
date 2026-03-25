package o;

import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cdC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C11917cdC extends AbstractC8422bCS {
    public final InterfaceC11891ccd AYXKKw;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11917cdC(@NotNull AbstractC8564bFB<?, ?> abstractC8564bFB, @NotNull InterfaceC11891ccd interfaceC11891ccd) {
        super(abstractC8564bFB);
        Intrinsics.checkNotNullParameter(abstractC8564bFB, "");
        Intrinsics.checkNotNullParameter(interfaceC11891ccd, "");
        this.AYXKKw = interfaceC11891ccd;
    }

    @Override // o.AbstractC8426bCW
    public java.lang.String AEQbTJ() {
        return C54862xYb.convertToBigIntegerString$default(C54862xYb.KWHzl(this.AYXKKw.OLrzqt(), this.AYXKKw.EZpvd()), false, RoundingMode.UP, 1, (java.lang.Object) null);
    }
}
