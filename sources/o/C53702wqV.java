package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wqV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53702wqV extends AbstractC48904ueV {
    public boolean AYXKKw;
    public final boolean OLrzqt;
    public final Function1<java.lang.Boolean, Unit> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.Void AEQbTJ(@NotNull android.content.Context context, @NotNull InterfaceC48969ufh<?, ?> interfaceC48969ufh) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC48969ufh, "");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(boolean z) {
        this.AYXKKw = z;
    }

    @Override // o.InterfaceC48901ueS
    public /* synthetic */ android.view.View KWHzl(android.content.Context context, InterfaceC48969ufh interfaceC48969ufh) {
        return (android.view.View) AEQbTJ(context, interfaceC48969ufh);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C53702wqV(@NotNull java.lang.String str, java.lang.CharSequence charSequence, boolean z, @NotNull Function1<? super java.lang.Boolean, Unit> function1) {
        super(str, charSequence, null, z);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.OLrzqt = z;
        this.copydefault = function1;
        this.AYXKKw = true;
    }

    @Override // o.InterfaceC48901ueS
    public boolean KWHzl() {
        return isChecked() != this.OLrzqt;
    }

    @Override // o.InterfaceC48901ueS
    public void EZpvd(@NotNull InterfaceC48969ufh<?, ?> interfaceC48969ufh) {
        Intrinsics.checkNotNullParameter(interfaceC48969ufh, "");
        OLrzqt(!isChecked());
    }

    @Override // o.InterfaceC48901ueS
    public void copydefault(@NotNull InterfaceC48969ufh<?, ?> interfaceC48969ufh) {
        Intrinsics.checkNotNullParameter(interfaceC48969ufh, "");
        OLrzqt(this.OLrzqt);
    }

    public final void OLrzqt(boolean z) {
        if (this.AYXKKw) {
            setChecked(z);
            this.copydefault.invoke(java.lang.Boolean.valueOf(isChecked()));
        }
        InterfaceC48897ueO interfaceC48897ueOAEQbTJ = AEQbTJ();
        if (interfaceC48897ueOAEQbTJ != null) {
            interfaceC48897ueOAEQbTJ.KWHzl();
        }
    }
}
