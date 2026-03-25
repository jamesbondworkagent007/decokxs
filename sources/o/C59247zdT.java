package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zdT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59247zdT extends AbstractC59242zdO {
    public final boolean AEQbTJ;
    public final InterfaceC59315zei EZpvd;
    public final InterfaceC59098zad KWHzl;
    public final Function1<AbstractC59287zeG, AbstractC59242zdO> OLrzqt;
    public final java.util.List<InterfaceC59317zek> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC59233zdF
    public boolean AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC59233zdF
    public InterfaceC59098zad OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC59233zdF
    public java.util.List<InterfaceC59317zek> bY_() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC59233zdF
    public InterfaceC59315zei djBIcL() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends o.zek> */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: kotlin.jvm.functions.Function1<? super o.zeG, ? extends o.zdO> */
    /* JADX WARN: Multi-variable type inference failed */
    public C59247zdT(@NotNull InterfaceC59315zei interfaceC59315zei, @NotNull java.util.List<? extends InterfaceC59317zek> list, boolean z, @NotNull InterfaceC59098zad interfaceC59098zad, @NotNull Function1<? super AbstractC59287zeG, ? extends AbstractC59242zdO> function1) {
        Intrinsics.checkNotNullParameter(interfaceC59315zei, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(interfaceC59098zad, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.EZpvd = interfaceC59315zei;
        this.copydefault = list;
        this.AEQbTJ = z;
        this.KWHzl = interfaceC59098zad;
        this.OLrzqt = function1;
        if (!(OLrzqt() instanceof C59367zfh) || (OLrzqt() instanceof C59372zfm)) {
            return;
        }
        throw new java.lang.IllegalStateException("SimpleTypeImpl should not be created for error type: " + OLrzqt() + '\n' + djBIcL());
    }

    @Override // o.AbstractC59233zdF
    public C59308zeb bX_() {
        return C59308zeb.OLrzqt.copydefault();
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Lo/zeb;)Lo/zey; */
    @Override // o.AbstractC59331zey
    /* JADX INFO: renamed from: copydefault */
    public AbstractC59242zdO AEQbTJ(@NotNull C59308zeb c59308zeb) {
        Intrinsics.checkNotNullParameter(c59308zeb, "");
        return c59308zeb.OLrzqt() ? this : new C59244zdQ(this, c59308zeb);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Z)Lo/zey; */
    @Override // o.AbstractC59331zey
    /* JADX INFO: renamed from: copydefault */
    public AbstractC59242zdO AEQbTJ(boolean z) {
        if (z == AEQbTJ()) {
            return this;
        }
        if (z) {
            return new C59240zdM(this);
        }
        return new C59241zdN(this);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Lo/zeG;)Lo/zdF; */
    /* JADX DEBUG: Method merged with bridge method: KWHzl(Lo/zeG;)Lo/zey; */
    @Override // o.AbstractC59331zey
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public AbstractC59242zdO KWHzl(@NotNull AbstractC59287zeG abstractC59287zeG) {
        Intrinsics.checkNotNullParameter(abstractC59287zeG, "");
        AbstractC59242zdO abstractC59242zdOInvoke = this.OLrzqt.invoke(abstractC59287zeG);
        return abstractC59242zdOInvoke == null ? this : abstractC59242zdOInvoke;
    }
}
