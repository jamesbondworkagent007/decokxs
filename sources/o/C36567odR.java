package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.BundleCompat;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.okinc.im.bean.BottomSheetMessageListOptions;
import com.okinc.im.bean.ChatOrigin;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.odR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C36567odR extends AbstractC36654oez {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public C33889nJp AEQbTJ;
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.odQ
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C36567odR.EZpvd(this.EZpvd);
        }
    });

    @Override // o.C33005moL
    public boolean AhwBna() {
        return false;
    }

    @Override // o.C33005moL
    public boolean gEmmrt() {
        return true;
    }

    /* JADX INFO: renamed from: o.odR$TaskDescription */
    /* JADX INFO: loaded from: classes23.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.odR.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    /* JADX DEBUG: Possible override for method o.oez.OLrzqt()V */
    public final BottomSheetMessageListOptions OLrzqt() {
        return (BottomSheetMessageListOptions) this.EZpvd.getValue();
    }

    public static final BottomSheetMessageListOptions EZpvd(C36567odR c36567odR) {
        android.os.Bundle arguments = c36567odR.getArguments();
        if (arguments != null) {
            return (BottomSheetMessageListOptions) BundleCompat.getParcelable(arguments, "ARG_OPTIONS", BottomSheetMessageListOptions.class);
        }
        return null;
    }

    @Override // o.C33005moL, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        BottomSheetBehavior<android.widget.FrameLayout> bottomSheetBehaviorCopydefault;
        BottomSheetBehavior<android.widget.FrameLayout> bottomSheetBehaviorCopydefault2;
        android.view.Window window;
        android.view.ViewGroup viewGroup;
        super.onStart();
        android.app.Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null && (viewGroup = (android.view.ViewGroup) window.findViewById(com.google.android.material.R.id.design_bottom_sheet)) != null) {
            viewGroup.setBackgroundResource(android.R.color.transparent);
        }
        android.app.Dialog dialog2 = getDialog();
        DialogC33577mzA dialogC33577mzA = dialog2 instanceof DialogC33577mzA ? (DialogC33577mzA) dialog2 : null;
        if (dialogC33577mzA != null && (bottomSheetBehaviorCopydefault2 = dialogC33577mzA.copydefault()) != null) {
            bottomSheetBehaviorCopydefault2.setDraggable(false);
        }
        android.app.Dialog dialog3 = getDialog();
        DialogC33577mzA dialogC33577mzA2 = dialog3 instanceof DialogC33577mzA ? (DialogC33577mzA) dialog3 : null;
        if (dialogC33577mzA2 == null || (bottomSheetBehaviorCopydefault = dialogC33577mzA2.copydefault()) == null) {
            return;
        }
        bottomSheetBehaviorCopydefault.setHideable(false);
    }

    @Override // o.C33005moL, androidx.fragment.app.DialogFragment
    public android.app.Dialog onCreateDialog(android.os.Bundle bundle) {
        android.app.Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        Intrinsics.checkNotNullExpressionValue(dialogOnCreateDialog, "");
        android.view.Window window = dialogOnCreateDialog.getWindow();
        if (window != null) {
            window.setSoftInputMode(32);
        }
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.AEQbTJ = null;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C33889nJp c33889nJpAEQbTJ = C33889nJp.AEQbTJ(layoutInflater, viewGroup, false);
        this.AEQbTJ = c33889nJpAEQbTJ;
        if (c33889nJpAEQbTJ != null) {
            return c33889nJpAEQbTJ.getRoot();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        android.widget.ImageView imageView;
        android.widget.TextView textView;
        android.widget.LinearLayout root;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        C33566myq c33566myq = C33566myq.EZpvd;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        int iOLrzqt = c33566myq.OLrzqt(contextRequireContext);
        int iDp2px$default = C55298xhM.dp2px$default(60.0f, null, 1, null);
        C33889nJp c33889nJp = this.AEQbTJ;
        if (c33889nJp != null && (root = c33889nJp.getRoot()) != null) {
            ViewGroup.LayoutParams layoutParams = root.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = iOLrzqt - iDp2px$default;
            } else {
                layoutParams = null;
            }
            root.setLayoutParams(layoutParams);
        }
        C33889nJp c33889nJp2 = this.AEQbTJ;
        if (c33889nJp2 != null && (textView = c33889nJp2.AEQbTJ) != null) {
            BottomSheetMessageListOptions bottomSheetMessageListOptionsOLrzqt = OLrzqt();
            textView.setText(bottomSheetMessageListOptionsOLrzqt != null ? getString(bottomSheetMessageListOptionsOLrzqt.AEQbTJ()) : null);
        }
        C33889nJp c33889nJp3 = this.AEQbTJ;
        if (c33889nJp3 != null && (imageView = c33889nJp3.OLrzqt) != null) {
            imageView.setOnClickListener(new Application(imageView, 1000L, this));
        }
        InterfaceC35180nqU interfaceC35180nqU = (InterfaceC35180nqU) C43251rlk.OLrzqt(InterfaceC35180nqU.class);
        BottomSheetMessageListOptions bottomSheetMessageListOptionsOLrzqt2 = OLrzqt();
        java.lang.String strOLrzqt = bottomSheetMessageListOptionsOLrzqt2 != null ? bottomSheetMessageListOptionsOLrzqt2.OLrzqt() : null;
        pUU.KWHzl("MessageListBottomSheetFragment", "channelId=" + strOLrzqt);
        pUU.KWHzl("MessageListBottomSheetFragment", "hasImService=" + (interfaceC35180nqU != null));
        if (interfaceC35180nqU == null || bottomSheetMessageListOptionsOLrzqt2 == null) {
            dismissAllowingStateLoss();
        } else {
            getChildFragmentManager().beginTransaction().replace(C35399nuc.StateListAnimator.iqeXgQ, interfaceC35180nqU.KWHzl(new C35241nrc(strOLrzqt, null, ChatOrigin.CHAT, null, null, null, null, null, null, null, null, null, false, false, false, false, false, null, null, 397306, null))).commitAllowingStateLoss();
        }
        view.post(new java.lang.Runnable() { // from class: o.odU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C36567odR.KWHzl(this.EZpvd);
            }
        });
    }

    public static final void KWHzl(C36567odR c36567odR) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c36567odR, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    /* JADX INFO: renamed from: o.odR$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C36567odR EZpvd;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C36567odR c36567odR) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.EZpvd = c36567odR;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.EZpvd.dismissAllowingStateLoss();
            }
        }
    }
}
