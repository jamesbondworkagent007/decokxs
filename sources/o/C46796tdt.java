package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tdt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46796tdt extends RecyclerView {
    public View.OnTouchListener EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEnhanceTouchListener(View.OnTouchListener onTouchListener) {
        this.EZpvd = onTouchListener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46796tdt(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46796tdt(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46796tdt(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        View.OnTouchListener onTouchListener;
        if ((motionEvent == null || motionEvent.getAction() != 0) && (onTouchListener = this.EZpvd) != null) {
            onTouchListener.onTouch(this, motionEvent);
        }
        View.OnTouchListener onTouchListener2 = this.EZpvd;
        if (onTouchListener2 != null) {
            onTouchListener2.onTouch(this, motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        View.OnTouchListener onTouchListener;
        if (motionEvent != null && motionEvent.getAction() == 0 && (onTouchListener = this.EZpvd) != null) {
            onTouchListener.onTouch(this, motionEvent);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
