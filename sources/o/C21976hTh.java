package o;

import androidx.core.widget.NestedScrollView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hTh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21976hTh extends NestedScrollView {
    public boolean OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setScrollingEnabled(boolean z) {
        this.OLrzqt = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21976hTh(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C21976hTh(@NotNull android.content.Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public boolean onTouchEvent(@NotNull android.view.MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        return this.OLrzqt && super.onTouchEvent(motionEvent);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull android.view.MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        return this.OLrzqt && super.onInterceptTouchEvent(motionEvent);
    }
}
