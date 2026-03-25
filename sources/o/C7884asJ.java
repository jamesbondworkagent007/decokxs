package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.C7343ahz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.asJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C7884asJ extends wXX {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public Function0<Unit> AEQbTJ;

    /* JADX INFO: renamed from: o.asJ$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ C7884asJ copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C7884asJ c7884asJ) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.copydefault = c7884asJ;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                Function0 function0 = this.copydefault.AEQbTJ;
                if (function0 != null) {
                    function0.invoke();
                }
                this.copydefault.dismiss();
            }
        }
    }

    /* JADX INFO: renamed from: o.asJ$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.asJ.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.asJ$Activity */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ C7884asJ newInstance$default(Activity activity, Function0 function0, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                function0 = null;
            }
            return activity.copydefault(function0);
        }

        public final C7884asJ copydefault(Function0<Unit> function0) {
            C7884asJ c7884asJ = new C7884asJ();
            c7884asJ.AEQbTJ = function0;
            return c7884asJ;
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
        constraintLayout.setPaddingRelative(constraintLayout.getPaddingStart(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.giSNqX), constraintLayout.getPaddingEnd(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.finit));
        android.widget.TextView textView = (android.widget.TextView) getLayoutInflater().inflate(C7343ahz.Activity.EZpvd, (android.view.ViewGroup) constraintLayout, true).findViewById(C7343ahz.TaskDescription.ejfBZ);
        textView.setText(C33070mpX.AYXKKw(C7343ahz.Fragment.fJNWhG));
        textView.setOnClickListener(new TaskDescription(textView, 1000L, this));
    }
}
