package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class iUZ extends iTL {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public final boolean AEQbTJ;
    public TaskDescription EZpvd;

    public interface TaskDescription {
        void KWHzl();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.iTL
    public android.view.View copydefault(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.iTL
    public boolean djBIcL() {
        return this.AEQbTJ;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.iUZ.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final iUZ OLrzqt(TaskDescription taskDescription) {
            iUZ iuz = new iUZ();
            iuz.EZpvd = taskDescription;
            return iuz;
        }
    }

    @Override // o.iTL
    public android.view.View OLrzqt(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        iKZ ikzEZpvd = iKZ.EZpvd(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(ikzEZpvd, "");
        android.widget.ImageView imageView = ikzEZpvd.KWHzl;
        imageView.setOnClickListener(new Activity(imageView, 1000L, this));
        C52794wYp c52794wYp = ikzEZpvd.EZpvd;
        c52794wYp.setOnClickListener(new ActionBar(c52794wYp, 1000L, this));
        ConstraintLayout root = ikzEZpvd.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ iUZ copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, iUZ iuz) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.copydefault = iuz;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                TaskDescription taskDescription = this.copydefault.EZpvd;
                if (taskDescription != null) {
                    taskDescription.KWHzl();
                }
                this.copydefault.dismiss();
            }
        }
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ iUZ OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, iUZ iuz) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.OLrzqt = iuz;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.OLrzqt.dismiss();
            }
        }
    }
}
