package o;

import com.okinc.wallet.widget.bottomsheet.DefiBottomSheetContainerTxConfirmBaseFragment;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gwm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C21281gwm extends DefiBottomSheetContainerTxConfirmBaseFragment {
    public InterfaceC9041bOB copydefault;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;

    /* JADX INFO: renamed from: o.gwm$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gwm.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C21281gwm EZpvd(@NotNull InterfaceC9041bOB interfaceC9041bOB) {
            Intrinsics.checkNotNullParameter(interfaceC9041bOB, "");
            C21281gwm c21281gwm = new C21281gwm();
            c21281gwm.copydefault = interfaceC9041bOB;
            return c21281gwm;
        }
    }

    @Override // com.okinc.wallet.widget.bottomsheet.DefiBottomSheetContainerTxConfirmBaseFragment, o.AbstractDialogInterfaceOnKeyListenerC57208yeA, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        C57211yeD c57211yeDKWHzl = KWHzl();
        if (c57211yeDKWHzl != null) {
            c57211yeDKWHzl.AEQbTJ(null, ViewOnClickListenerC21274gwf.Companion.AEQbTJ(this.copydefault), true, true);
        }
    }
}
