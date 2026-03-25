package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C49511upt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.upU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C49486upU extends wXX {
    public final boolean EZpvd = true;
    public AbstractC49522uqD copydefault;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean isFullScreen() {
        return this.EZpvd;
    }

    public final AbstractC49522uqD copydefault() {
        AbstractC49522uqD abstractC49522uqD = this.copydefault;
        Intrinsics.copydefault(abstractC49522uqD);
        return abstractC49522uqD;
    }

    /* JADX INFO: renamed from: o.upU$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.upU.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C49486upU OLrzqt() {
            return new C49486upU();
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setDividerVisibility(false);
        wxq.AEQbTJ().setVisibility(8);
        wxq.KWHzl().setVisibility(0);
        wxq.KWHzl().setOnClickListener(new View.OnClickListener() { // from class: o.upS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C49486upU.OLrzqt(this.KWHzl, view);
            }
        });
        wxq.setStyle(1);
        wxq.setTitle(C33070mpX.AYXKKw(C49511upt.Activity.RcXXUw));
    }

    public static final void OLrzqt(C49486upU c49486upU, android.view.View view) {
        c49486upU.dismiss();
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        this.copydefault = (AbstractC49522uqD) DataBindingUtil.inflate(android.view.LayoutInflater.from(requireContext()), C49511upt.StateListAnimator.AEQbTJ, constraintLayout, false);
        constraintLayout.addView(copydefault().getRoot());
        copydefault().AEQbTJ.loadUrl(C33070mpX.AYXKKw(C49511upt.Activity.QfsBiF));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.copydefault = null;
    }
}
