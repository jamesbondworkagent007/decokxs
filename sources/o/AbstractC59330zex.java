package o;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.zex, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC59330zex extends AbstractC59233zdF {
    public boolean AYXKKw() {
        return true;
    }

    public abstract AbstractC59233zdF valueOf();

    public AbstractC59330zex() {
        super(null);
    }

    @Override // o.AbstractC59233zdF
    public InterfaceC59315zei djBIcL() {
        return valueOf().djBIcL();
    }

    @Override // o.AbstractC59233zdF
    public java.util.List<InterfaceC59317zek> bY_() {
        return valueOf().bY_();
    }

    @Override // o.AbstractC59233zdF
    public boolean AEQbTJ() {
        return valueOf().AEQbTJ();
    }

    @Override // o.AbstractC59233zdF
    public InterfaceC59098zad OLrzqt() {
        return valueOf().OLrzqt();
    }

    @Override // o.AbstractC59233zdF
    public C59308zeb bX_() {
        return valueOf().bX_();
    }

    @Override // o.AbstractC59233zdF
    public final AbstractC59331zey AkhnZx() {
        AbstractC59233zdF abstractC59233zdFValueOf = valueOf();
        while (abstractC59233zdFValueOf instanceof AbstractC59330zex) {
            abstractC59233zdFValueOf = ((AbstractC59330zex) abstractC59233zdFValueOf).valueOf();
        }
        Intrinsics.copydefault(abstractC59233zdFValueOf, "");
        return (AbstractC59331zey) abstractC59233zdFValueOf;
    }

    public java.lang.String toString() {
        return AYXKKw() ? valueOf().toString() : "<Not computed yet>";
    }
}
