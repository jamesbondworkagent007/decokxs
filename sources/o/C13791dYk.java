package o;

import androidx.constraintlayout.motion.widget.MotionLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dYk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C13791dYk extends MotionLayout {
    public Function2<? super android.view.View, ? super java.lang.Integer, Unit> AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnStopNestedScrollListener(@NotNull Function2<? super android.view.View, ? super java.lang.Integer, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        this.AEQbTJ = function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13791dYk(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = new Function2() { // from class: o.dYj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C13791dYk.OLrzqt((android.view.View) obj, ((java.lang.Integer) obj2).intValue());
            }
        };
    }

    public static final Unit OLrzqt(android.view.View view, int i) {
        Intrinsics.checkNotNullParameter(view, "");
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C13791dYk(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C13791dYk(@NotNull android.content.Context context) {
        this(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout, androidx.core.view.NestedScrollingParent2
    public void onStopNestedScroll(@NotNull android.view.View view, int i) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onStopNestedScroll(view, i);
        this.AEQbTJ.invoke(view, java.lang.Integer.valueOf(i));
    }
}
