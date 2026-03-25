package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fLh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C17599fLh extends wXX {
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public TaskDescription AEQbTJ;

    /* JADX INFO: renamed from: o.fLh$TaskDescription */
    /* JADX INFO: loaded from: classes5.dex */
    public interface TaskDescription {
        void AhwBna();

        void valueOf();
    }

    /* JADX INFO: renamed from: o.fLh$Activity */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fLh.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C17599fLh copydefault() {
            return new C17599fLh();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: android.content.Context */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        super.onAttach(context);
        if (context instanceof TaskDescription) {
            this.AEQbTJ = (TaskDescription) context;
        }
    }

    @Override // o.wXX
    public void onHeaderCreated(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onHeaderCreated(wxq);
        wxq.setStyle(0);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        C16484ekm c16484ekmAEQbTJ = C16484ekm.AEQbTJ(getCustomLayoutInflater(), constraintLayout, true);
        Intrinsics.checkNotNullExpressionValue(c16484ekmAEQbTJ, "");
        C52794wYp c52794wYp = c16484ekmAEQbTJ.KWHzl;
        c52794wYp.setOnClickListener(new ActionBar(c52794wYp, 1000L, this));
        C52794wYp c52794wYp2 = c16484ekmAEQbTJ.OLrzqt;
        c52794wYp2.setOnClickListener(new StateListAnimator(c52794wYp2, 1000L, this));
    }

    /* JADX INFO: renamed from: o.fLh$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C17599fLh KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C17599fLh c17599fLh) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.KWHzl = c17599fLh;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.KWHzl.dismiss();
                TaskDescription taskDescription = this.KWHzl.AEQbTJ;
                if (taskDescription != null) {
                    taskDescription.valueOf();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.fLh$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ C17599fLh KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C17599fLh c17599fLh) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.KWHzl = c17599fLh;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.KWHzl.dismiss();
                TaskDescription taskDescription = this.KWHzl.AEQbTJ;
                if (taskDescription != null) {
                    taskDescription.AhwBna();
                }
            }
        }
    }
}
