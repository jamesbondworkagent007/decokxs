package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pIl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C37998pIl extends android.text.method.LinkMovementMethod {
    public static final C37998pIl AEQbTJ = new C37998pIl();

    private C37998pIl() {
    }

    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public boolean onTouchEvent(@NotNull android.widget.TextView textView, @NotNull android.text.Spannable spannable, @NotNull android.view.MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(textView, "");
        Intrinsics.checkNotNullParameter(spannable, "");
        Intrinsics.checkNotNullParameter(motionEvent, "");
        int action = motionEvent.getAction();
        if (action == 0 || action == 1) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int totalPaddingLeft = textView.getTotalPaddingLeft();
            int totalPaddingTop = textView.getTotalPaddingTop();
            int scrollX = textView.getScrollX();
            int scrollY = textView.getScrollY();
            android.text.Layout layout = textView.getLayout();
            int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical((y - totalPaddingTop) + scrollY), (x - totalPaddingLeft) + scrollX);
            android.text.style.ClickableSpan[] clickableSpanArr = (android.text.style.ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, android.text.style.ClickableSpan.class);
            Intrinsics.copydefault(clickableSpanArr);
            if (!(clickableSpanArr.length == 0)) {
                android.text.style.ClickableSpan clickableSpan = clickableSpanArr[0];
                if (action == 1) {
                    clickableSpan.onClick(textView);
                }
                return true;
            }
            android.text.Selection.removeSelection(spannable);
        }
        return super.onTouchEvent(textView, spannable, motionEvent);
    }
}
