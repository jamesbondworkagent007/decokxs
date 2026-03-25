package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C49511upt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uqk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C49555uqk extends RecyclerView {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public int OLrzqt;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49555uqk(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C49511upt.Fragment.fetchVPNInfo);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        this.OLrzqt = typedArrayObtainStyledAttributes.getInt(C49511upt.Fragment.isConnected, 0);
        typedArrayObtainStyledAttributes.recycle();
        setOverScrollMode(2);
        setHorizontalFadingEdgeEnabled(true);
        setVerticalFadingEdgeEnabled(true);
    }

    /* JADX INFO: renamed from: o.uqk$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.uqk.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    @Override // android.view.View
    public float getLeftFadingEdgeStrength() {
        int i = this.OLrzqt;
        if (i == 0 || i == 1) {
            return super.getLeftFadingEdgeStrength();
        }
        return 0.0f;
    }

    @Override // android.view.View
    public float getRightFadingEdgeStrength() {
        int i = this.OLrzqt;
        if (i == 0 || i == 2) {
            return super.getRightFadingEdgeStrength();
        }
        return 0.0f;
    }
}
