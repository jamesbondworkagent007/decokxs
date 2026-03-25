package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ijU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24736ijU extends android.widget.ExpandableListView {
    @Override // android.widget.AbsListView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24736ijU(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24736ijU(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24736ijU(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (EZpvd(this)) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return super.onTouchEvent(motionEvent);
    }

    public final boolean EZpvd(android.widget.AbsListView absListView) {
        if (absListView == null || absListView.getChildCount() <= 0) {
            return false;
        }
        boolean z = (absListView.getFirstVisiblePosition() == 0 && absListView.getChildAt(0).getTop() == 0) ? false : true;
        return z || (z && absListView.getLastVisiblePosition() == absListView.getChildCount());
    }
}
