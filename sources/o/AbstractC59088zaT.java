package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zaT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC59088zaT extends yPE {
    public final InterfaceC59187zcM AEQbTJ;

    public abstract void OLrzqt(@NotNull C59083zaO c59083zaO);

    public abstract InterfaceC59082zaN djBIcL();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC59088zaT(@NotNull C56933yXs c56933yXs, @NotNull InterfaceC59187zcM interfaceC59187zcM, @NotNull yNP ynp) {
        super(ynp, c56933yXs);
        Intrinsics.checkNotNullParameter(c56933yXs, "");
        Intrinsics.checkNotNullParameter(interfaceC59187zcM, "");
        Intrinsics.checkNotNullParameter(ynp, "");
        this.AEQbTJ = interfaceC59187zcM;
    }

    public boolean KWHzl(@NotNull C56935yXu c56935yXu) {
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        InterfaceC59098zad interfaceC59098zadAEQbTJ = AEQbTJ();
        return (interfaceC59098zadAEQbTJ instanceof AbstractC59147zbZ) && ((AbstractC59147zbZ) interfaceC59098zadAEQbTJ).AYXKKw().contains(c56935yXu);
    }
}
