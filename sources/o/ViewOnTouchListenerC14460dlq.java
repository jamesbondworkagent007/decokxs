package o;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dlq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnTouchListenerC14460dlq implements View.OnTouchListener {
    public final java.lang.String AEQbTJ;
    public final android.widget.TextView EZpvd;
    public final java.lang.String KWHzl;
    public final Function0<Unit> copydefault;

    public ViewOnTouchListenerC14460dlq(android.widget.TextView textView, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.EZpvd = textView;
        this.KWHzl = str;
        this.AEQbTJ = str2;
        this.copydefault = function0;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 1) {
            float x = motionEvent.getX();
            int y = (int) motionEvent.getY();
            android.widget.TextView textView = this.EZpvd;
            android.text.Layout layout = textView != null ? textView.getLayout() : null;
            if (layout != null) {
                int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(y), x);
                int iIndexOf$default = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) this.KWHzl, this.AEQbTJ, 0, false, 6, (java.lang.Object) null);
                int length = this.AEQbTJ.length();
                if (iIndexOf$default <= offsetForHorizontal && offsetForHorizontal <= length + iIndexOf$default) {
                    this.copydefault.invoke();
                }
            }
        }
        return true;
    }
}
