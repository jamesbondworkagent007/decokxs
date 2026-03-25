package o;

import androidx.viewbinding.ViewBinding;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pkp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C39043pkp<VB extends ViewBinding> implements InterfaceC39045pkr {
    public android.view.ViewGroup AEQbTJ;
    public final InterfaceC39045pkr EZpvd;
    public VB KWHzl;
    public final Function1<android.view.View, VB> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39045pkr
    public android.view.View AEQbTJ() {
        return this.EZpvd.AEQbTJ();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VB KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt() {
        this.KWHzl = null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super android.view.View, ? extends VB extends androidx.viewbinding.ViewBinding> */
    /* JADX WARN: Multi-variable type inference failed */
    public C39043pkp(@NotNull InterfaceC39045pkr interfaceC39045pkr, @NotNull Function1<? super android.view.View, ? extends VB> function1) {
        Intrinsics.checkNotNullParameter(interfaceC39045pkr, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.EZpvd = interfaceC39045pkr;
        this.copydefault = function1;
    }

    @Override // o.InterfaceC39045pkr
    public void OLrzqt(android.view.ViewGroup viewGroup) {
        this.AEQbTJ = viewGroup;
        this.EZpvd.OLrzqt(viewGroup);
    }

    public final void EZpvd() {
        this.KWHzl = this.copydefault.invoke(AEQbTJ());
    }
}
