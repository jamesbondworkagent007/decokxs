package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class oHO extends android.text.method.LinkMovementMethod {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public long AEQbTJ;
    public oHS EZpvd;
    public long KWHzl;

    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public boolean onTouchEvent(@NotNull android.widget.TextView textView, @NotNull android.text.Spannable spannable, @NotNull android.view.MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(textView, "");
        Intrinsics.checkNotNullParameter(spannable, "");
        Intrinsics.checkNotNullParameter(motionEvent, "");
        int action = motionEvent.getAction();
        if (action == 0) {
            oHS ohsCopydefault = copydefault(textView, spannable, motionEvent);
            this.EZpvd = ohsCopydefault;
            if (ohsCopydefault != null) {
                if (ohsCopydefault != null) {
                    ohsCopydefault.OLrzqt(true);
                }
                oHS ohs = this.EZpvd;
                if (ohs != null) {
                    ohs.KWHzl(false);
                }
                this.AEQbTJ = android.os.SystemClock.elapsedRealtime();
                android.text.Selection.setSelection(spannable, spannable.getSpanStart(this.EZpvd), spannable.getSpanEnd(this.EZpvd));
            }
        } else if (action == 2) {
            oHS ohsCopydefault2 = copydefault(textView, spannable, motionEvent);
            oHS ohs2 = this.EZpvd;
            if (ohs2 != null && !Intrinsics.EZpvd(ohsCopydefault2, ohs2)) {
                oHS ohs3 = this.EZpvd;
                if (ohs3 != null) {
                    ohs3.OLrzqt(false);
                }
                this.EZpvd = null;
                android.text.Selection.removeSelection(spannable);
            }
        } else {
            oHS ohs4 = this.EZpvd;
            if (ohs4 != null) {
                if (ohs4 != null) {
                    ohs4.OLrzqt(false);
                }
                long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
                this.KWHzl = jElapsedRealtime;
                oHS ohs5 = this.EZpvd;
                if (ohs5 != null) {
                    ohs5.KWHzl(jElapsedRealtime - this.AEQbTJ >= 600);
                }
                super.onTouchEvent(textView, spannable, motionEvent);
            }
            this.EZpvd = null;
            android.text.Selection.removeSelection(spannable);
        }
        return true;
    }

    public final oHS copydefault(android.widget.TextView textView, android.text.Spannable spannable, android.view.MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int totalPaddingLeft = textView.getTotalPaddingLeft();
        int totalPaddingTop = textView.getTotalPaddingTop();
        int scrollX = textView.getScrollX();
        int scrollY = textView.getScrollY();
        android.text.Layout layout = textView.getLayout();
        int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical((y - totalPaddingTop) + scrollY), (x - totalPaddingLeft) + scrollX);
        oHS[] ohsArr = (oHS[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, oHS.class);
        Intrinsics.copydefault(ohsArr);
        return (oHS) yDV.gEmmrt(ohsArr, 0);
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oHO.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }
}
