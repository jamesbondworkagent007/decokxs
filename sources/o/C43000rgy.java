package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rgy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C43000rgy extends android.widget.FrameLayout {
    public TaskDescription AEQbTJ;
    public boolean KWHzl;

    /* JADX INFO: renamed from: o.rgy$TaskDescription */
    public interface TaskDescription {
        void EZpvd(boolean z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlideListener(@NotNull TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        this.AEQbTJ = taskDescription;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43000rgy(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43000rgy(@NotNull android.content.Context context, @NotNull android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43000rgy(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        java.lang.Integer numValueOf = motionEvent != null ? java.lang.Integer.valueOf(motionEvent.getAction()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            this.KWHzl = true;
            TaskDescription taskDescription = this.AEQbTJ;
            if (taskDescription != null) {
                taskDescription.EZpvd(true);
            }
        } else if ((numValueOf != null && numValueOf.intValue() == 1) || ((numValueOf != null && numValueOf.intValue() == 3) || (numValueOf != null && numValueOf.intValue() == 4))) {
            this.KWHzl = false;
            TaskDescription taskDescription2 = this.AEQbTJ;
            if (taskDescription2 != null) {
                taskDescription2.EZpvd(false);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
