package o;

import androidx.core.widget.NestedScrollView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mUq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C32239mUq extends NestedScrollView {
    public boolean AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setScrollingEnabled(boolean z) {
        this.AEQbTJ = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32239mUq(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C32239mUq(@NotNull android.content.Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public boolean onTouchEvent(@NotNull android.view.MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        return this.AEQbTJ && super.onTouchEvent(motionEvent);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull android.view.MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        return this.AEQbTJ && super.onInterceptTouchEvent(motionEvent);
    }
}
