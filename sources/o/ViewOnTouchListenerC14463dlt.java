package o;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dlt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnTouchListenerC14463dlt implements View.OnTouchListener {
    public final Function1<java.lang.Integer, Unit> AEQbTJ;
    public final android.widget.TextView KWHzl;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public ViewOnTouchListenerC14463dlt(@NotNull android.widget.TextView textView, @NotNull Function1<? super java.lang.Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(textView, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.KWHzl = textView;
        this.AEQbTJ = function1;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 1) {
            float x = motionEvent.getX();
            int y = (int) motionEvent.getY();
            android.text.Layout layout = this.KWHzl.getLayout();
            if (layout != null) {
                this.AEQbTJ.invoke(java.lang.Integer.valueOf(layout.getOffsetForHorizontal(layout.getLineForVertical(y), x)));
            }
        }
        return true;
    }
}
