package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oxT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public abstract class AbstractC37629oxT extends RecyclerView.ViewHolder {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 android.view.View) A[MD:(android.view.View):void (m)] call: o.oxT.<init>(android.view.View):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC37629oxT(android.view.View view, DefaultConstructorMarker defaultConstructorMarker) {
        this(view);
    }

    public AbstractC37629oxT(android.view.View view) {
        super(view);
    }

    /* JADX INFO: renamed from: o.oxT$Application */
    public static final class Application extends AbstractC37629oxT {
        public final C34025nOq KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C34025nOq AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Application(@NotNull C34025nOq c34025nOq) {
            Intrinsics.checkNotNullParameter(c34025nOq, "");
            ConstraintLayout root = c34025nOq.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            super(root, null);
            this.KWHzl = c34025nOq;
        }
    }

    /* JADX INFO: renamed from: o.oxT$ActionBar */
    public static final class ActionBar extends AbstractC37629oxT {
        public final C34034nOz KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C34034nOz EZpvd() {
            return this.KWHzl;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public ActionBar(@NotNull C34034nOz c34034nOz) {
            Intrinsics.checkNotNullParameter(c34034nOz, "");
            ConstraintLayout root = c34034nOz.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            super(root, null);
            this.KWHzl = c34034nOz;
        }
    }
}
