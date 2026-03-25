package o;

import androidx.core.widget.NestedScrollView;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pzo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C39835pzo extends NestedScrollView {
    public boolean KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setScrollingEnabled(boolean z) {
        this.KWHzl = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39835pzo(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C39835pzo(@NotNull android.content.Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public boolean onTouchEvent(@NotNull android.view.MotionEvent motionEvent) {
        java.lang.Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(motionEvent, "");
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(java.lang.Boolean.valueOf(this.KWHzl && super.onTouchEvent(motionEvent)));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        java.lang.Boolean bool = (java.lang.Boolean) objM7377constructorimpl;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull android.view.MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        return this.KWHzl && super.onInterceptTouchEvent(motionEvent);
    }
}
