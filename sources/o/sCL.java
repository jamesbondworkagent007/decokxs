package o;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class sCL extends C33005moL {
    public static final java.lang.String AEQbTJ;
    public static final TaskDescription Companion;
    public static final int copydefault;
    public AbstractC47422tpj KWHzl;

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sCL.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    static {
        TaskDescription taskDescription = new TaskDescription(null);
        Companion = taskDescription;
        copydefault = 8;
        AEQbTJ = taskDescription.getClass().getSimpleName();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        super.onAttach(context);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C33570myu.copydefault((android.app.Activity) activity);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        AbstractC47422tpj abstractC47422tpjAEQbTJ = AbstractC47422tpj.AEQbTJ(layoutInflater, viewGroup, false);
        this.KWHzl = abstractC47422tpjAEQbTJ;
        if (abstractC47422tpjAEQbTJ != null) {
            C52794wYp c52794wYp = abstractC47422tpjAEQbTJ.EZpvd;
            c52794wYp.setOnClickListener(new ActionBar(c52794wYp, 1000L, this));
            android.widget.ImageView imageView = abstractC47422tpjAEQbTJ.AEQbTJ;
            imageView.setOnClickListener(new StateListAnimator(imageView, 1000L, this));
        }
        AbstractC47422tpj abstractC47422tpj = this.KWHzl;
        if (abstractC47422tpj != null) {
            return abstractC47422tpj.getRoot();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        KWHzl(false);
        view.post(new java.lang.Runnable() { // from class: o.sCJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                sCL.KWHzl(this.AEQbTJ);
            }
        });
    }

    public static final void KWHzl(sCL scl) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) scl, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.C33005moL, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        android.view.Window window;
        android.view.ViewGroup viewGroup;
        super.onStart();
        android.app.Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null || (viewGroup = (android.view.ViewGroup) window.findViewById(com.google.android.material.R.id.design_bottom_sheet)) == null) {
            return;
        }
        viewGroup.setBackgroundResource(android.R.color.transparent);
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ sCL copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, sCL scl) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.copydefault = scl;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.copydefault.dismissAllowingStateLoss();
            }
        }
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ sCL copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, sCL scl) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.copydefault = scl;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.copydefault.dismissAllowingStateLoss();
            }
        }
    }
}
