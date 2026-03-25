package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C18455fii;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fib, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C18448fib extends AbstractDialogInterfaceOnKeyListenerC57208yeA {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public InterfaceC9736bbH copydefault;

    /* JADX INFO: renamed from: o.fib$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fib.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C18448fib EZpvd(InterfaceC9736bbH interfaceC9736bbH) {
            C18448fib c18448fib = new C18448fib();
            c18448fib.copydefault = interfaceC9736bbH;
            return c18448fib;
        }
    }

    @Override // o.AbstractDialogInterfaceOnKeyListenerC57208yeA, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        InterfaceC9736bbH interfaceC9736bbH = this.copydefault;
        if (interfaceC9736bbH == null) {
            AbstractDialogInterfaceOnKeyListenerC57208yeA.close$default(this, null, 1, null);
            return;
        }
        C18455fii.ActionBar actionBar = C18455fii.Companion;
        Intrinsics.copydefault(interfaceC9736bbH);
        C18455fii c18455fiiKWHzl = actionBar.KWHzl(interfaceC9736bbH);
        C57211yeD c57211yeDKWHzl = KWHzl();
        if (c57211yeDKWHzl != null) {
            c57211yeDKWHzl.AEQbTJ(null, c18455fiiKWHzl, false, true);
        }
    }
}
