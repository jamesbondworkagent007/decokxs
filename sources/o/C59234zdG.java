package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zdG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59234zdG extends AbstractC59330zex {
    public final InterfaceC59187zcM KWHzl;
    public final InterfaceC59182zcH<AbstractC59233zdF> OLrzqt;
    public final Function0<AbstractC59233zdF> copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function0<? extends o.zdF> */
    /* JADX WARN: Multi-variable type inference failed */
    public C59234zdG(@NotNull InterfaceC59187zcM interfaceC59187zcM, @NotNull Function0<? extends AbstractC59233zdF> function0) {
        Intrinsics.checkNotNullParameter(interfaceC59187zcM, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.KWHzl = interfaceC59187zcM;
        this.copydefault = function0;
        this.OLrzqt = interfaceC59187zcM.KWHzl(function0);
    }

    @Override // o.AbstractC59330zex
    public AbstractC59233zdF valueOf() {
        return this.OLrzqt.invoke();
    }

    @Override // o.AbstractC59330zex
    public boolean AYXKKw() {
        return this.OLrzqt.AEQbTJ();
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Lo/zeG;)Lo/zdF; */
    @Override // o.AbstractC59233zdF
    public C59234zdG KWHzl(@NotNull AbstractC59287zeG abstractC59287zeG) {
        Intrinsics.checkNotNullParameter(abstractC59287zeG, "");
        return new C59234zdG(this.KWHzl, new C59235zdH(abstractC59287zeG, this));
    }

    public static final AbstractC59233zdF EZpvd(AbstractC59287zeG abstractC59287zeG, C59234zdG c59234zdG) {
        return abstractC59287zeG.AEQbTJ(c59234zdG.copydefault.invoke());
    }
}
