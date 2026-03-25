package o;

import android.content.DialogInterface;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractDialogInterfaceOnKeyListenerC57208yeA;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dpd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class DialogInterfaceOnKeyListenerC14659dpd extends wXX implements DialogInterface.OnKeyListener {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public float AEQbTJ;
    public boolean EZpvd;
    public AbstractC57212yeE KWHzl;
    public C57211yeD OLrzqt;
    public final java.util.ArrayList<AbstractDialogInterfaceOnKeyListenerC57208yeA.Activity> gEmmrt = new java.util.ArrayList<>();
    public AbstractDialogInterfaceOnKeyListenerC57208yeA.Activity valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C57211yeD AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull AbstractC57212yeE abstractC57212yeE) {
        Intrinsics.checkNotNullParameter(abstractC57212yeE, "");
        this.KWHzl = abstractC57212yeE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(float f) {
        this.AEQbTJ = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public float getHeightScale() {
        return this.AEQbTJ;
    }

    /* JADX INFO: renamed from: o.dpd$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.dpd.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public static /* synthetic */ DialogInterfaceOnKeyListenerC14659dpd newInstance$default(TaskDescription taskDescription, float f, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                f = 0.52f;
            }
            return taskDescription.copydefault(f);
        }

        public final DialogInterfaceOnKeyListenerC14659dpd copydefault(float f) {
            DialogInterfaceOnKeyListenerC14659dpd dialogInterfaceOnKeyListenerC14659dpd = new DialogInterfaceOnKeyListenerC14659dpd();
            dialogInterfaceOnKeyListenerC14659dpd.copydefault(f);
            return dialogInterfaceOnKeyListenerC14659dpd;
        }
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        this.OLrzqt = new C57211yeD(childFragmentManager, C13754dXa.ActionBar.fMBJsc, 0, 0, 0, 0, 60, null);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        AbstractC57212yeE abstractC57212yeE;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        android.content.Context context = constraintLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C57210yeC c57210yeC = new C57210yeC(context, null);
        c57210yeC.setId(C13754dXa.ActionBar.fMBJsc);
        constraintLayout.addView(c57210yeC, new ViewGroup.LayoutParams(-1, -1));
        C57211yeD c57211yeD = this.OLrzqt;
        if (c57211yeD == null || (abstractC57212yeE = this.KWHzl) == null) {
            return;
        }
        c57211yeD.AEQbTJ(null, abstractC57212yeE, false, true);
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        android.app.Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setOnKeyListener(this);
        }
        view.post(new java.lang.Runnable() { // from class: o.dph
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                DialogInterfaceOnKeyListenerC14659dpd.copydefault(this.OLrzqt);
            }
        });
    }

    public static final void copydefault(DialogInterfaceOnKeyListenerC14659dpd dialogInterfaceOnKeyListenerC14659dpd) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) dialogInterfaceOnKeyListenerC14659dpd, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public static /* synthetic */ void close$default(DialogInterfaceOnKeyListenerC14659dpd dialogInterfaceOnKeyListenerC14659dpd, android.os.Bundle bundle, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bundle = null;
        }
        dialogInterfaceOnKeyListenerC14659dpd.AEQbTJ(bundle);
    }

    public final void AEQbTJ(android.os.Bundle bundle) {
        this.EZpvd = true;
        AbstractDialogInterfaceOnKeyListenerC57208yeA.Activity activity = this.valueOf;
        if (activity != null) {
            activity.copydefault(bundle);
        }
        dismissAllowingStateLoss();
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        AbstractDialogInterfaceOnKeyListenerC57208yeA.Activity activity;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        if (this.EZpvd || (activity = this.valueOf) == null) {
            return;
        }
        activity.copydefault(null);
    }

    public final void copydefault(@NotNull AbstractDialogInterfaceOnKeyListenerC57208yeA.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.gEmmrt.add(activity);
    }

    public final void OLrzqt(@NotNull AbstractDialogInterfaceOnKeyListenerC57208yeA.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.gEmmrt.remove(activity);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(android.content.DialogInterface dialogInterface, int i, android.view.KeyEvent keyEvent) {
        C57211yeD c57211yeD;
        if (i != 4) {
            return false;
        }
        if (keyEvent == null || keyEvent.getAction() != 1 || (c57211yeD = this.OLrzqt) == null || !c57211yeD.EZpvd()) {
            return true;
        }
        dismissAllowingStateLoss();
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        C57211yeD c57211yeD = this.OLrzqt;
        if (c57211yeD != null) {
            c57211yeD.copydefault();
        }
        super.onDestroy();
    }
}
