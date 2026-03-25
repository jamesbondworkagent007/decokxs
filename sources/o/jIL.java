package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class jIL extends AbstractC48904ueV {
    private static final Application Companion = new Application(null);
    public final boolean OLrzqt;
    public final Function1<java.lang.Boolean, Unit> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC48901ueS
    public android.view.View KWHzl(@NotNull android.content.Context context, @NotNull InterfaceC48969ufh<?, ?> interfaceC48969ufh) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC48969ufh, "");
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public jIL(boolean z, @NotNull Function1<? super java.lang.Boolean, Unit> function1) {
        super("username_item", C33070mpX.AYXKKw(C55688xof.Application.MainThread), null, true, 4, null);
        Intrinsics.checkNotNullParameter(function1, "");
        this.OLrzqt = z;
        this.copydefault = function1;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jIL.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    @Override // o.InterfaceC48901ueS
    public boolean KWHzl() {
        return isChecked() == this.OLrzqt;
    }

    @Override // o.InterfaceC48901ueS
    public void EZpvd(@NotNull InterfaceC48969ufh<?, ?> interfaceC48969ufh) {
        Intrinsics.checkNotNullParameter(interfaceC48969ufh, "");
        setChecked(!isChecked());
        KWHzl(isChecked());
        InterfaceC48897ueO interfaceC48897ueOAEQbTJ = AEQbTJ();
        if (interfaceC48897ueOAEQbTJ != null) {
            interfaceC48897ueOAEQbTJ.KWHzl();
        }
    }

    @Override // o.InterfaceC48901ueS
    public void copydefault(@NotNull InterfaceC48969ufh<?, ?> interfaceC48969ufh) {
        Intrinsics.checkNotNullParameter(interfaceC48969ufh, "");
        setChecked(this.OLrzqt);
        InterfaceC48897ueO interfaceC48897ueOAEQbTJ = AEQbTJ();
        if (interfaceC48897ueOAEQbTJ != null) {
            interfaceC48897ueOAEQbTJ.KWHzl();
        }
        KWHzl(isChecked());
    }

    public final void KWHzl(boolean z) {
        this.copydefault.invoke(java.lang.Boolean.valueOf(z));
    }
}
