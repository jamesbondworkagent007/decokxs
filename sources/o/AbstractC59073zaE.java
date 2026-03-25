package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zaE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC59073zaE implements yNX {
    public C59083zaO EZpvd;
    public final InterfaceC59179zcE<C56933yXs, yNW> KWHzl;
    public final InterfaceC59150zbc OLrzqt;
    public final yNP copydefault;
    public final InterfaceC59187zcM gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC59187zcM EZpvd() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final yNP KWHzl() {
        return this.copydefault;
    }

    public abstract AbstractC59088zaT KWHzl(@NotNull C56933yXs c56933yXs);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull C59083zaO c59083zaO) {
        Intrinsics.checkNotNullParameter(c59083zaO, "");
        this.EZpvd = c59083zaO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC59150zbc copydefault() {
        return this.OLrzqt;
    }

    public AbstractC59073zaE(@NotNull InterfaceC59187zcM interfaceC59187zcM, @NotNull InterfaceC59150zbc interfaceC59150zbc, @NotNull yNP ynp) {
        Intrinsics.checkNotNullParameter(interfaceC59187zcM, "");
        Intrinsics.checkNotNullParameter(interfaceC59150zbc, "");
        Intrinsics.checkNotNullParameter(ynp, "");
        this.gEmmrt = interfaceC59187zcM;
        this.OLrzqt = interfaceC59150zbc;
        this.copydefault = ynp;
        this.KWHzl = interfaceC59187zcM.OLrzqt(new C59071zaC(this));
    }

    public final C59083zaO AEQbTJ() {
        C59083zaO c59083zaO = this.EZpvd;
        if (c59083zaO != null) {
            return c59083zaO;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public static final yNW AEQbTJ(AbstractC59073zaE abstractC59073zaE, C56933yXs c56933yXs) {
        Intrinsics.checkNotNullParameter(c56933yXs, "");
        AbstractC59088zaT abstractC59088zaTKWHzl = abstractC59073zaE.KWHzl(c56933yXs);
        if (abstractC59088zaTKWHzl == null) {
            return null;
        }
        abstractC59088zaTKWHzl.OLrzqt(abstractC59073zaE.AEQbTJ());
        return abstractC59088zaTKWHzl;
    }

    @Override // o.yNX
    public void EZpvd(@NotNull C56933yXs c56933yXs, @NotNull java.util.Collection<yNW> collection) {
        Intrinsics.checkNotNullParameter(c56933yXs, "");
        Intrinsics.checkNotNullParameter(collection, "");
        C59433zgu.EZpvd(collection, this.KWHzl.invoke(c56933yXs));
    }

    @Override // o.yNX
    public boolean OLrzqt(@NotNull C56933yXs c56933yXs) {
        InterfaceC56654yNj interfaceC56654yNjKWHzl;
        Intrinsics.checkNotNullParameter(c56933yXs, "");
        if (this.KWHzl.copydefault(c56933yXs)) {
            interfaceC56654yNjKWHzl = (yNW) this.KWHzl.invoke(c56933yXs);
        } else {
            interfaceC56654yNjKWHzl = KWHzl(c56933yXs);
        }
        return interfaceC56654yNjKWHzl == null;
    }

    @Override // o.yNU
    public java.util.List<yNW> copydefault(@NotNull C56933yXs c56933yXs) {
        Intrinsics.checkNotNullParameter(c56933yXs, "");
        return yDY.OLrzqt(this.KWHzl.invoke(c56933yXs));
    }

    @Override // o.yNU
    public java.util.Collection<C56933yXs> KWHzl(@NotNull C56933yXs c56933yXs, @NotNull Function1<? super C56935yXu, java.lang.Boolean> function1) {
        Intrinsics.checkNotNullParameter(c56933yXs, "");
        Intrinsics.checkNotNullParameter(function1, "");
        return yEE.copydefault();
    }
}
