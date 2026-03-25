package o;

import android.graphics.RectF;

/* JADX INFO: renamed from: o.aiG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C7351aiG extends android.text.method.LinkMovementMethod {
    public static C7351aiG copydefault;
    public final RectF EZpvd = new RectF();
    public int KWHzl;
    public android.text.style.ClickableSpan OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(android.widget.TextView textView) {
        this.OLrzqt = null;
    }

    public static C7351aiG copydefault() {
        if (copydefault == null) {
            copydefault = new C7351aiG();
        }
        return copydefault;
    }

    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public boolean onTouchEvent(android.widget.TextView textView, android.text.Spannable spannable, android.view.MotionEvent motionEvent) {
        if (this.KWHzl != textView.hashCode()) {
            this.KWHzl = textView.hashCode();
            textView.setAutoLinkMask(0);
        }
        android.text.style.ClickableSpan clickableSpanOLrzqt = OLrzqt(textView, spannable, motionEvent);
        if (motionEvent.getAction() == 0) {
            this.OLrzqt = clickableSpanOLrzqt;
        }
        boolean z = this.OLrzqt != null;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    return z;
                }
                if (action != 3) {
                    return false;
                }
                KWHzl(textView);
                return false;
            }
            if (z && clickableSpanOLrzqt == this.OLrzqt) {
                EZpvd(textView, clickableSpanOLrzqt);
            }
            KWHzl(textView);
        }
        return z;
    }

    public android.text.style.ClickableSpan OLrzqt(android.widget.TextView textView, android.text.Spannable spannable, android.view.MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int totalPaddingLeft = textView.getTotalPaddingLeft();
        int totalPaddingTop = textView.getTotalPaddingTop();
        int scrollX = textView.getScrollX();
        int scrollY = (y - totalPaddingTop) + textView.getScrollY();
        android.text.Layout layout = textView.getLayout();
        int lineForVertical = layout.getLineForVertical(scrollY);
        float f = (x - totalPaddingLeft) + scrollX;
        int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, f);
        this.EZpvd.left = layout.getLineLeft(lineForVertical);
        this.EZpvd.top = layout.getLineTop(lineForVertical);
        RectF rectF = this.EZpvd;
        float lineWidth = layout.getLineWidth(lineForVertical);
        RectF rectF2 = this.EZpvd;
        rectF.right = lineWidth + rectF2.left;
        rectF2.bottom = layout.getLineBottom(lineForVertical);
        if (!this.EZpvd.contains(f, scrollY)) {
            return null;
        }
        for (java.lang.Object obj : spannable.getSpans(offsetForHorizontal, offsetForHorizontal, android.text.style.ClickableSpan.class)) {
            if (obj instanceof android.text.style.ClickableSpan) {
                return (android.text.style.ClickableSpan) obj;
            }
        }
        return null;
    }

    public void EZpvd(android.widget.TextView textView, android.text.style.ClickableSpan clickableSpan) {
        StateListAnimator.AEQbTJ(textView, clickableSpan).OLrzqt().onClick(textView);
    }

    /* JADX INFO: renamed from: o.aiG$StateListAnimator */
    /* JADX INFO: loaded from: classes22.dex */
    public static class StateListAnimator {
        public android.text.style.ClickableSpan EZpvd;
        public java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public android.text.style.ClickableSpan OLrzqt() {
            return this.EZpvd;
        }

        public static StateListAnimator AEQbTJ(android.widget.TextView textView, android.text.style.ClickableSpan clickableSpan) {
            java.lang.String string;
            android.text.Spanned spanned = (android.text.Spanned) textView.getText();
            if (clickableSpan instanceof android.text.style.URLSpan) {
                string = ((android.text.style.URLSpan) clickableSpan).getURL();
            } else {
                string = spanned.subSequence(spanned.getSpanStart(clickableSpan), spanned.getSpanEnd(clickableSpan)).toString();
            }
            return new StateListAnimator(clickableSpan, string);
        }

        public StateListAnimator(android.text.style.ClickableSpan clickableSpan, java.lang.String str) {
            this.EZpvd = clickableSpan;
            this.OLrzqt = str;
        }
    }
}
