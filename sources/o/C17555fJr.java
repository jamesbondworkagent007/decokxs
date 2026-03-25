package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentKt;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.PasskeyOperationType;
import com.okinc.components.track.TrackChannel;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fJr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C17555fJr extends wXX {
    public boolean EZpvd;
    public boolean KWHzl;
    public static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;

    @Override // o.wXX
    public boolean getHasFooter() {
        return true;
    }

    /* JADX INFO: renamed from: o.fJr$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fJr.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C17555fJr EZpvd() {
            C17555fJr c17555fJr = new C17555fJr();
            c17555fJr.setArguments(BundleKt.bundleOf());
            return c17555fJr;
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(0);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        Intrinsics.checkNotNullExpressionValue(C16894esY.EZpvd(getLayoutInflater(), constraintLayout, true), "");
        C32866mlf.onEvent$default("Wallet_Create_PasskeyUnfound_View", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        C55118xds root;
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        C54946xaf binding = getBinding();
        if (binding != null && (root = binding.getRoot()) != null) {
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            root.setPadding(root.getPaddingLeft(), root.getPaddingTop(), root.getPaddingRight(), C55298xhM.KWHzl(16.0f, contextRequireContext));
        }
        wyf.setType(7);
        wyf.setPrimaryText(getString(C13754dXa.FragmentManager.adevsa));
        wyf.setSecondaryText(getString(C13754dXa.FragmentManager.dYepVG));
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOKDSType(257);
        }
        C52794wYp c52794wYpCopydefault2 = wyf.copydefault();
        if (c52794wYpCopydefault2 != null) {
            c52794wYpCopydefault2.setOnClickListener(new TaskDescription(c52794wYpCopydefault2, 1000L, this));
        }
        C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            c52794wYpAEQbTJ.setOKDSType(49);
        }
        C52794wYp c52794wYpAEQbTJ2 = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ2 != null) {
            c52794wYpAEQbTJ2.setOnClickListener(new ActionBar(c52794wYpAEQbTJ2, 1000L, this));
        }
    }

    public final void copydefault(PasskeyOperationType passkeyOperationType) {
        FragmentKt.setFragmentResult(this, "request_key_passkey_not_found", BundleKt.bundleOf(C56390yDp.OLrzqt("result_key_passkey_not_found", java.lang.Integer.valueOf(passkeyOperationType.ordinal()))));
        this.EZpvd = true;
        dismissAllowingStateLoss();
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        if (this.EZpvd) {
            return;
        }
        pUU.copydefault("PasskeyNotFoundBottomSheet", "isSlideToDismiss = " + this.KWHzl);
        FragmentKt.setFragmentResult(this, "request_key_passkey_not_found", BundleKt.bundleOf(C56390yDp.OLrzqt("result_key_passkey_not_found", java.lang.Integer.valueOf(PasskeyOperationType.UNKNOWN.ordinal()))));
    }

    /* JADX INFO: renamed from: o.fJr$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C17555fJr OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C17555fJr c17555fJr) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.OLrzqt = c17555fJr;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                C32866mlf.onEvent$default("Wallet_Create_AnotherDevice_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
                this.OLrzqt.copydefault(PasskeyOperationType.LINK_PASSKEY);
            }
        }
    }

    /* JADX INFO: renamed from: o.fJr$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C17555fJr OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C17555fJr c17555fJr) {
            this.KWHzl = view;
            this.copydefault = j;
            this.OLrzqt = c17555fJr;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                C32866mlf.onEvent$default("Wallet_Create_CreateNew_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
                this.OLrzqt.copydefault(PasskeyOperationType.REGISTER_PASSKEY);
            }
        }
    }
}
