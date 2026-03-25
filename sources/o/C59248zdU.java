package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zdU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59248zdU extends AbstractC59318zel {
    public final AbstractC59233zdF AEQbTJ;

    @Override // o.InterfaceC59317zek
    public boolean AEQbTJ() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59317zek
    public AbstractC59233zdF OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59317zek
    public InterfaceC59317zek copydefault(@NotNull AbstractC59287zeG abstractC59287zeG) {
        Intrinsics.checkNotNullParameter(abstractC59287zeG, "");
        return this;
    }

    public C59248zdU(@NotNull AbstractC56640yMw abstractC56640yMw) {
        Intrinsics.checkNotNullParameter(abstractC56640yMw, "");
        AbstractC59242zdO abstractC59242zdOIwGUEr = abstractC56640yMw.iwGUEr();
        Intrinsics.checkNotNullExpressionValue(abstractC59242zdOIwGUEr, "");
        this.AEQbTJ = abstractC59242zdOIwGUEr;
    }

    @Override // o.InterfaceC59317zek
    public Variance EZpvd() {
        return Variance.OUT_VARIANCE;
    }
}
