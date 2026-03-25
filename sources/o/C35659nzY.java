package o;

import android.view.View;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentKt;
import androidx.lifecycle.LifecycleOwnerKt;
import com.just.agentweb.ActionActivity;
import com.okinc.im.imui.contacts.addcontact.UnableToAddContactDialogFragment$internalCancel$1;
import com.okinc.im.imui.contacts.addcontact.UnableToAddContactDialogFragment$internalDismiss$1;
import com.okinc.im.imui.contacts.addcontact.UnableToAddContactDialogFragment$openContactList$1;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nzY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35659nzY extends C32995moB {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public java.lang.String copydefault;
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.nAg
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C35659nzY.AEQbTJ(this.EZpvd);
        }
    });
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.nAf
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C35659nzY.copydefault(this.copydefault);
        }
    });

    /* JADX INFO: renamed from: o.nzY$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nzY.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C35659nzY KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            C35659nzY c35659nzY = new C35659nzY();
            c35659nzY.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("KEY_FRAGMENT_RESULT_KEY", str), C56390yDp.OLrzqt("KEY_DESCRIPTION", str2)));
            return c35659nzY;
        }
    }

    private final java.lang.String EZpvd() {
        return (java.lang.String) this.EZpvd.getValue();
    }

    public static final java.lang.String AEQbTJ(C35659nzY c35659nzY) {
        java.lang.String string;
        android.os.Bundle arguments = c35659nzY.getArguments();
        if (arguments != null && (string = arguments.getString("KEY_FRAGMENT_RESULT_KEY")) != null) {
            return string;
        }
        java.lang.String string2 = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "");
        return string2;
    }

    private final java.lang.String KWHzl() {
        return (java.lang.String) this.AEQbTJ.getValue();
    }

    public static final java.lang.String copydefault(C35659nzY c35659nzY) {
        java.lang.String string;
        android.os.Bundle arguments = c35659nzY.getArguments();
        return (arguments == null || (string = arguments.getString("KEY_DESCRIPTION")) == null) ? "" : string;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.copydefault = null;
    }

    @Override // androidx.fragment.app.DialogFragment
    public android.app.Dialog onCreateDialog(android.os.Bundle bundle) {
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
        viewOnClickListenerC54939xaY.setTitle(getString(C35399nuc.LoaderManager.sSMYrx));
        viewOnClickListenerC54939xaY.EZpvd(KWHzl());
        java.lang.String string = getString(C35399nuc.LoaderManager.AwvSrB);
        Intrinsics.checkNotNullExpressionValue(string, "");
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, new View.OnClickListener() { // from class: o.nzZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C35659nzY.OLrzqt(this.EZpvd, view);
            }
        });
        java.lang.String string2 = getString(C35399nuc.LoaderManager.OqFWZa);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        viewOnClickListenerC54939xaY.AEQbTJ(string2, new View.OnClickListener() { // from class: o.nAa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C35659nzY.EZpvd(this.copydefault, view);
            }
        });
        viewOnClickListenerC54939xaY.setCancelable(true);
        viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(true);
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return viewOnClickListenerC54939xaY;
    }

    public static final void OLrzqt(C35659nzY c35659nzY, android.view.View view) {
        c35659nzY.copydefault();
        c35659nzY.copydefault = "ACTION_VIEW_CONTACT";
        c35659nzY.OLrzqt();
    }

    public static final void EZpvd(C35659nzY c35659nzY, android.view.View view) {
        c35659nzY.AEQbTJ();
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        this.copydefault = "ACTION_CANCEL";
        FragmentKt.setFragmentResult(this, EZpvd(), BundleKt.bundleOf(C56390yDp.OLrzqt(ActionActivity.KEY_ACTION, this.copydefault)));
        super.onCancel(dialogInterface);
    }

    @Override // o.C32995moB, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        FragmentKt.setFragmentResult(this, EZpvd(), BundleKt.bundleOf(C56390yDp.OLrzqt(ActionActivity.KEY_ACTION, this.copydefault)));
        super.onDismiss(dialogInterface);
    }

    public final void copydefault() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new UnableToAddContactDialogFragment$openContactList$1(this, null), 3, null);
    }

    private final void OLrzqt() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new UnableToAddContactDialogFragment$internalDismiss$1(this, null), 3, null);
    }

    private final void AEQbTJ() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new UnableToAddContactDialogFragment$internalCancel$1(this, null), 3, null);
    }
}
