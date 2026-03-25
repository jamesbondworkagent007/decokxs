package o;

import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yse, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57980yse extends C57983ysh implements InterfaceC57916yrT {
    public final Function1<java.util.Collection<? extends InterfaceC57914yrR>, java.lang.Boolean> EZpvd;
    public final ConcurrentLinkedQueue<InterfaceC57918yrV> OLrzqt;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.util.Collection<? extends o.yrR>, java.lang.Boolean> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C57980yse(@NotNull Function1<? super java.util.Collection<? extends InterfaceC57914yrR>, java.lang.Boolean> function1, @NotNull InterfaceC57918yrV... interfaceC57918yrVArr) {
        super(true);
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(interfaceC57918yrVArr, "");
        this.EZpvd = function1;
        this.OLrzqt = new ConcurrentLinkedQueue<>();
        for (InterfaceC57918yrV interfaceC57918yrV : interfaceC57918yrVArr) {
            AEQbTJ(interfaceC57918yrV);
        }
    }

    public final void AEQbTJ(InterfaceC57918yrV interfaceC57918yrV) {
        if (interfaceC57918yrV instanceof C57980yse) {
            throw new java.lang.IllegalArgumentException("NOT allow to add MultiSourceStatefulOwner as source, consider to add its shadow owner");
        }
        this.OLrzqt.add(interfaceC57918yrV);
        interfaceC57918yrV.KWHzl(this);
    }

    public final void OLrzqt(C57983ysh c57983ysh) {
        this.OLrzqt.remove(c57983ysh);
        c57983ysh.AEQbTJ(this);
        copydefault();
    }

    public void copydefault(@NotNull C57983ysh c57983ysh) {
        Intrinsics.checkNotNullParameter(c57983ysh, "");
        AEQbTJ(c57983ysh);
    }

    public void KWHzl(@NotNull C57983ysh c57983ysh) {
        Intrinsics.checkNotNullParameter(c57983ysh, "");
        OLrzqt(c57983ysh);
    }

    @Override // o.InterfaceC57916yrT
    public void KWHzl() {
        copydefault();
    }

    @Override // o.InterfaceC57916yrT
    public void OLrzqt() {
        copydefault();
    }

    @Override // o.C57983ysh, o.InterfaceC57914yrR
    public boolean AEQbTJ() {
        if (this.OLrzqt.isEmpty()) {
            return super.AEQbTJ();
        }
        java.lang.Boolean boolInvoke = this.EZpvd.invoke(this.OLrzqt);
        if (boolInvoke.booleanValue()) {
            valueOf();
        } else {
            djBIcL();
        }
        return boolInvoke.booleanValue();
    }

    private final void copydefault() {
        if (this.EZpvd.invoke(this.OLrzqt).booleanValue()) {
            valueOf();
        } else {
            djBIcL();
        }
    }
}
