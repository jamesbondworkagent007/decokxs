package o;

import androidx.core.widget.NestedScrollView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ikk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24805ikk extends NestedScrollView {
    public boolean OLrzqt;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24805ikk(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C24805ikk(@NotNull android.content.Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    @Override // androidx.core.widget.NestedScrollView
    public int computeScrollDeltaToGetChildRectOnScreen(android.graphics.Rect rect) {
        if (this.OLrzqt) {
            return super.computeScrollDeltaToGetChildRectOnScreen(rect);
        }
        return 0;
    }
}
