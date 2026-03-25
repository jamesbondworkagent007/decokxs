package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.okO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public abstract class AbstractC36935okO extends RecyclerView.ViewHolder {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 android.view.View) A[MD:(android.view.View):void (m)] call: o.okO.<init>(android.view.View):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC36935okO(android.view.View view, DefaultConstructorMarker defaultConstructorMarker) {
        this(view);
    }

    public AbstractC36935okO(android.view.View view) {
        super(view);
    }

    /* JADX INFO: renamed from: o.okO$TaskDescription */
    public static final class TaskDescription extends AbstractC36935okO {
        public final nOB AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final nOB copydefault() {
            return this.AEQbTJ;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public TaskDescription(@NotNull nOB nob) {
            Intrinsics.checkNotNullParameter(nob, "");
            ConstraintLayout root = nob.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            super(root, null);
            this.AEQbTJ = nob;
        }
    }
}
