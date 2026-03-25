package o;

import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zdW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59250zdW extends AbstractC59318zel {
    public final InterfaceC56387yDm EZpvd;
    public final InterfaceC56691yOt KWHzl;

    @Override // o.InterfaceC59317zek
    public boolean AEQbTJ() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59317zek
    public InterfaceC59317zek copydefault(@NotNull AbstractC59287zeG abstractC59287zeG) {
        Intrinsics.checkNotNullParameter(abstractC59287zeG, "");
        return this;
    }

    public C59250zdW(@NotNull InterfaceC56691yOt interfaceC56691yOt) {
        Intrinsics.checkNotNullParameter(interfaceC56691yOt, "");
        this.KWHzl = interfaceC56691yOt;
        this.EZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new C59251zdX(this));
    }

    @Override // o.InterfaceC59317zek
    public Variance EZpvd() {
        return Variance.OUT_VARIANCE;
    }

    public final AbstractC59233zdF copydefault() {
        return (AbstractC59233zdF) this.EZpvd.getValue();
    }

    public static final AbstractC59233zdF KWHzl(C59250zdW c59250zdW) {
        return C59252zdY.EZpvd(c59250zdW.KWHzl);
    }

    @Override // o.InterfaceC59317zek
    public AbstractC59233zdF OLrzqt() {
        return copydefault();
    }
}
