package o;

import android.view.View;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentKt;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.im.imui.broadcastmessages.timeoutdialog.TimeoutDialogFragment$internalDismiss$1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nwi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C35510nwi extends AbstractC35509nwh {
    public static final Activity Companion = new Activity(null);
    public static final int djBIcL = 8;
    public final InterfaceC56387yDm AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.nwj
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C35510nwi.KWHzl(this.copydefault);
        }
    });
    public java.lang.String AhwBna = "ACTION_DISMISS";

    /* JADX INFO: renamed from: o.nwi$Activity */
    /* JADX INFO: loaded from: classes23.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nwi.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final java.lang.String copydefault(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return str + "/ACTION_START_OVER";
        }

        public final java.lang.String KWHzl(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return str + "/ACTION_DISMISS";
        }

        public final C35510nwi OLrzqt(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            C35510nwi c35510nwi = new C35510nwi();
            c35510nwi.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("KEY_FRAGMENT_RESULT_KEY", str)));
            return c35510nwi;
        }
    }

    private final java.lang.String AYXKKw() {
        return (java.lang.String) this.AYXKKw.getValue();
    }

    public static final java.lang.String KWHzl(C35510nwi c35510nwi) {
        java.lang.String string;
        android.os.Bundle arguments = c35510nwi.getArguments();
        return (arguments == null || (string = arguments.getString("KEY_FRAGMENT_RESULT_KEY")) == null) ? "" : string;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.AhwBna = "ACTION_DISMISS";
    }

    @Override // androidx.fragment.app.DialogFragment
    public android.app.Dialog onCreateDialog(android.os.Bundle bundle) {
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
        viewOnClickListenerC54939xaY.setTitle(getString(C35399nuc.LoaderManager.fZBcTu));
        viewOnClickListenerC54939xaY.EZpvd(getString(C35399nuc.LoaderManager.djSkpj));
        java.lang.String string = getString(C35399nuc.LoaderManager.RcXXUw);
        Intrinsics.checkNotNullExpressionValue(string, "");
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, new View.OnClickListener() { // from class: o.nwl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C35510nwi.KWHzl(this.EZpvd, view);
            }
        });
        viewOnClickListenerC54939xaY.setCancelable(true);
        viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(true);
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return viewOnClickListenerC54939xaY;
    }

    public static final void KWHzl(C35510nwi c35510nwi, android.view.View view) {
        c35510nwi.AhwBna = "ACTION_START_OVER";
        c35510nwi.valueOf();
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        this.AhwBna = "ACTION_DISMISS";
        KWHzl();
        super.onCancel(dialogInterface);
    }

    @Override // o.C32995moB, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        KWHzl();
        super.onDismiss(dialogInterface);
    }

    private final void valueOf() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new TimeoutDialogFragment$internalDismiss$1(this, null), 3, null);
    }

    private final void KWHzl() {
        java.lang.String strCopydefault = Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) "ACTION_START_OVER") ? Companion.copydefault(AYXKKw()) : Companion.KWHzl(AYXKKw());
        android.os.Bundle bundle = android.os.Bundle.EMPTY;
        Intrinsics.checkNotNullExpressionValue(bundle, "");
        FragmentKt.setFragmentResult(this, strCopydefault, bundle);
    }
}
