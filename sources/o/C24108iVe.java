package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iVe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C24108iVe extends iTL {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public final boolean EZpvd;
    public Application OLrzqt;

    /* JADX INFO: renamed from: o.iVe$Application */
    public interface Application {
        void copydefault();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.iTL
    public boolean djBIcL() {
        return this.EZpvd;
    }

    /* JADX INFO: renamed from: o.iVe$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.iVe.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C24108iVe AEQbTJ(Application application) {
            C24108iVe c24108iVe = new C24108iVe();
            c24108iVe.OLrzqt = application;
            return c24108iVe;
        }
    }

    @Override // o.iTL
    public android.view.View OLrzqt(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        iJU ijuEZpvd = iJU.EZpvd(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(ijuEZpvd, "");
        C52794wYp c52794wYp = ijuEZpvd.OLrzqt;
        c52794wYp.setOnClickListener(new ActionBar(c52794wYp, 1000L, this));
        C52794wYp c52794wYp2 = ijuEZpvd.EZpvd;
        c52794wYp2.setOnClickListener(new Activity(c52794wYp2, 1000L, this));
        ConstraintLayout root = ijuEZpvd.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // o.iTL
    public android.view.View copydefault(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        iJV ijvKWHzl = iJV.KWHzl(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(ijvKWHzl, "");
        android.widget.ImageView imageView = ijvKWHzl.KWHzl;
        imageView.setOnClickListener(new StateListAnimator(imageView, 1000L, this));
        ConstraintLayout root = ijvKWHzl.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    /* JADX INFO: renamed from: o.iVe$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C24108iVe EZpvd;
        public final /* synthetic */ android.view.View KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C24108iVe c24108iVe) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.EZpvd = c24108iVe;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.EZpvd.dismiss();
            }
        }
    }

    /* JADX INFO: renamed from: o.iVe$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ C24108iVe copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C24108iVe c24108iVe) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.copydefault = c24108iVe;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                Application application = this.copydefault.OLrzqt;
                if (application != null) {
                    application.copydefault();
                }
                this.copydefault.dismiss();
            }
        }
    }

    /* JADX INFO: renamed from: o.iVe$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ C24108iVe copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C24108iVe c24108iVe) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.copydefault = c24108iVe;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.copydefault.dismiss();
            }
        }
    }
}
