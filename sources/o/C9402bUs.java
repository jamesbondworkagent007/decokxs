package o;

import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bUs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C9402bUs extends AbstractC8422bCS {
    public final C9318bTN gEmmrt;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9402bUs(@NotNull C9318bTN c9318bTN) {
        super(c9318bTN);
        Intrinsics.checkNotNullParameter(c9318bTN, "");
        this.gEmmrt = c9318bTN;
    }

    @Override // o.AbstractC8426bCW
    public java.lang.String AEQbTJ() {
        return C54862xYb.convertToBigIntegerString$default(C54862xYb.OLrzqt(this.gEmmrt.zuBGHE(), java.lang.Integer.valueOf(this.gEmmrt.OcIXYQ().size())), false, RoundingMode.UP, 1, (java.lang.Object) null);
    }
}
