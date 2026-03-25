package o;

import android.view.View;
import androidx.activity.result.ActivityResultCaller;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class fUM extends wXX {
    public final boolean EZpvd = true;
    public fUG OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean getHasFooter() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: android.content.Context */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        super.onAttach(context);
        ActivityResultCaller parentFragment = getParentFragment();
        fUG fug = null;
        fUG fug2 = parentFragment instanceof fUG ? (fUG) parentFragment : null;
        if (fug2 != null) {
            fug = fug2;
        } else if (context instanceof fUG) {
            fug = (fUG) context;
        }
        this.OLrzqt = fug;
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        C17031evC c17031evCCopydefault = C17031evC.copydefault(android.view.LayoutInflater.from(getContext()), constraintLayout, true);
        Intrinsics.checkNotNullExpressionValue(c17031evCCopydefault, "");
        C55178xez c55178xez = c17031evCCopydefault.copydefault;
        c55178xez.setTitleText(c55178xez.getContext().getString(C13754dXa.FragmentManager.installViewFactory));
        c55178xez.setSubTitleText(c55178xez.getContext().getString(C13754dXa.FragmentManager.removeDelegateFromActives));
        c55178xez.setType(1);
        c55178xez.AEQbTJ().setVisibility(8);
        c55178xez.setStatus(5);
        C52794wYp c52794wYpCopydefault = c55178xez.OLrzqt().copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOKDSType(262);
            c52794wYpCopydefault.setVisibility(0);
            c52794wYpCopydefault.setText(c52794wYpCopydefault.getContext().getString(C13754dXa.FragmentManager.setCompatVectorFromResourcesEnabled));
            c52794wYpCopydefault.setOnClickListener(new Activity(c52794wYpCopydefault, 1000L, this));
        }
        C52794wYp c52794wYpAEQbTJ = c55178xez.OLrzqt().AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            c52794wYpAEQbTJ.setVisibility(0);
            c52794wYpAEQbTJ.setText(c52794wYpAEQbTJ.getContext().getString(C13754dXa.FragmentManager.AxsJAYsNCnLh));
            c52794wYpAEQbTJ.setOnClickListener(new Application(c52794wYpAEQbTJ, 1000L, this));
        }
    }

    @Override // o.wXX
    public void onCreateFooter(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateFooter(constraintLayout);
        constraintLayout.setVisibility(8);
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ fUM copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, fUM fum) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.copydefault = fum;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                fUG fug = this.copydefault.OLrzqt;
                if (fug != null) {
                    fug.OLrzqt();
                }
                this.copydefault.dismiss();
            }
        }
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ fUM AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, fUM fum) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.AEQbTJ = fum;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                fUG fug = this.AEQbTJ.OLrzqt;
                if (fug != null) {
                    fug.AEQbTJ();
                }
                this.AEQbTJ.dismiss();
            }
        }
    }
}
