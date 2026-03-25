package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yYV implements yYZ {
    public C59285zeE AEQbTJ;
    public final InterfaceC59317zek copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.yYZ
    public InterfaceC59317zek AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(C59285zeE c59285zeE) {
        this.AEQbTJ = c59285zeE;
    }

    public java.lang.Void AhwBna() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C59285zeE djBIcL() {
        return this.AEQbTJ;
    }

    @Override // o.InterfaceC59315zei
    public boolean gEmmrt() {
        return false;
    }

    public yYV(@NotNull InterfaceC59317zek interfaceC59317zek) {
        Intrinsics.checkNotNullParameter(interfaceC59317zek, "");
        this.copydefault = interfaceC59317zek;
        AEQbTJ().EZpvd();
        Variance variance = Variance.INVARIANT;
    }

    @Override // o.InterfaceC59315zei
    /* JADX INFO: renamed from: KWHzl */
    public /* synthetic */ InterfaceC56663yNs OLrzqt() {
        return (InterfaceC56663yNs) AhwBna();
    }

    @Override // o.InterfaceC59315zei
    public java.util.List<InterfaceC56691yOt> copydefault() {
        return yDY.AhwBna();
    }

    @Override // o.InterfaceC59315zei
    public java.util.Collection<AbstractC59233zdF> bV_() {
        AbstractC59233zdF abstractC59233zdFIwGUEr;
        if (AEQbTJ().EZpvd() == Variance.OUT_VARIANCE) {
            abstractC59233zdFIwGUEr = AEQbTJ().OLrzqt();
        } else {
            abstractC59233zdFIwGUEr = bU_().iwGUEr();
        }
        Intrinsics.copydefault(abstractC59233zdFIwGUEr);
        return C56402yEa.EZpvd(abstractC59233zdFIwGUEr);
    }

    public java.lang.String toString() {
        return "CapturedTypeConstructor(" + AEQbTJ() + ')';
    }

    @Override // o.InterfaceC59315zei
    public AbstractC56640yMw bU_() {
        AbstractC56640yMw abstractC56640yMwBU_ = AEQbTJ().OLrzqt().djBIcL().bU_();
        Intrinsics.checkNotNullExpressionValue(abstractC56640yMwBU_, "");
        return abstractC56640yMwBU_;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Lo/zeG;)Lo/zei; */
    @Override // o.InterfaceC59315zei
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public yYV AEQbTJ(@NotNull AbstractC59287zeG abstractC59287zeG) {
        Intrinsics.checkNotNullParameter(abstractC59287zeG, "");
        InterfaceC59317zek interfaceC59317zekCopydefault = AEQbTJ().copydefault(abstractC59287zeG);
        Intrinsics.checkNotNullExpressionValue(interfaceC59317zekCopydefault, "");
        return new yYV(interfaceC59317zekCopydefault);
    }
}
