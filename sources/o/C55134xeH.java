package o;

/* JADX INFO: renamed from: o.xeH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C55134xeH extends android.text.method.LinkMovementMethod {
    public static android.text.method.LinkMovementMethod AEQbTJ;
    public java.lang.Class<android.text.style.ImageSpan> EZpvd = android.text.style.ImageSpan.class;
    public int KWHzl;
    public int OLrzqt;
    public int copydefault;
    public int gEmmrt;

    @Override // android.text.method.LinkMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public boolean canSelectArbitrarily() {
        return true;
    }

    @Override // android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public boolean onKeyUp(android.widget.TextView textView, android.text.Spannable spannable, int i, android.view.KeyEvent keyEvent) {
        return false;
    }

    public static android.text.method.MovementMethod OLrzqt() {
        if (AEQbTJ == null) {
            AEQbTJ = new C55134xeH();
        }
        return AEQbTJ;
    }

    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public boolean onTouchEvent(android.widget.TextView textView, android.text.Spannable spannable, android.view.MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.OLrzqt = (int) motionEvent.getX();
            this.KWHzl = (int) motionEvent.getY();
        }
        if (motionEvent.getAction() == 1) {
            this.copydefault = (int) motionEvent.getX();
            this.gEmmrt = (int) motionEvent.getY();
            if (java.lang.Math.abs(this.OLrzqt - this.copydefault) < 10 && java.lang.Math.abs(this.KWHzl - this.gEmmrt) < 10) {
                this.copydefault -= textView.getTotalPaddingLeft();
                this.gEmmrt -= textView.getTotalPaddingTop();
                this.copydefault += textView.getScrollX();
                this.gEmmrt += textView.getScrollY();
                android.text.Layout layout = textView.getLayout();
                int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(this.gEmmrt), this.copydefault);
                if (spannable.getSpans(offsetForHorizontal, offsetForHorizontal, this.EZpvd).length != 0) {
                    return true;
                }
            }
        }
        return super.onTouchEvent(textView, spannable, motionEvent);
    }
}
