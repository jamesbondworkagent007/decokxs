package o;

import androidx.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes9.dex */
public class pXL extends NestedScrollView {
    public android.view.View AEQbTJ;
    public int AhwBna;
    public android.os.Handler EZpvd;
    public android.view.View KWHzl;
    public StateListAnimator OLrzqt;
    public int copydefault;

    public interface StateListAnimator {
        void copydefault(java.lang.Boolean bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setExtraView(android.view.View view) {
        this.KWHzl = view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setHeaderView(android.view.View view) {
        this.AEQbTJ = view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setOnScrollChanged(StateListAnimator stateListAnimator) {
        this.OLrzqt = stateListAnimator;
    }

    public pXL(@androidx.annotation.NonNull android.content.Context context) {
        super(context);
        this.copydefault = 0;
        this.AhwBna = -9983761;
        this.EZpvd = new android.os.Handler() { // from class: o.pXL.5
            @Override // android.os.Handler
            public void handleMessage(android.os.Message message) {
                super.handleMessage(message);
                if (message.what == pXL.this.AhwBna) {
                    if (pXL.this.copydefault == pXL.this.getScrollY()) {
                        pXL.this.copydefault();
                        return;
                    }
                    pXL.this.EZpvd.sendMessageDelayed(pXL.this.EZpvd.obtainMessage(pXL.this.AhwBna), 200L);
                    pXL pxl = pXL.this;
                    pxl.copydefault = pxl.getScrollY();
                }
            }
        };
    }

    public pXL(@androidx.annotation.NonNull android.content.Context context, @androidx.annotation.Nullable android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.copydefault = 0;
        this.AhwBna = -9983761;
        this.EZpvd = new android.os.Handler() { // from class: o.pXL.5
            @Override // android.os.Handler
            public void handleMessage(android.os.Message message) {
                super.handleMessage(message);
                if (message.what == pXL.this.AhwBna) {
                    if (pXL.this.copydefault == pXL.this.getScrollY()) {
                        pXL.this.copydefault();
                        return;
                    }
                    pXL.this.EZpvd.sendMessageDelayed(pXL.this.EZpvd.obtainMessage(pXL.this.AhwBna), 200L);
                    pXL pxl = pXL.this;
                    pxl.copydefault = pxl.getScrollY();
                }
            }
        };
    }

    public pXL(@androidx.annotation.NonNull android.content.Context context, @androidx.annotation.Nullable android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.copydefault = 0;
        this.AhwBna = -9983761;
        this.EZpvd = new android.os.Handler() { // from class: o.pXL.5
            @Override // android.os.Handler
            public void handleMessage(android.os.Message message) {
                super.handleMessage(message);
                if (message.what == pXL.this.AhwBna) {
                    if (pXL.this.copydefault == pXL.this.getScrollY()) {
                        pXL.this.copydefault();
                        return;
                    }
                    pXL.this.EZpvd.sendMessageDelayed(pXL.this.EZpvd.obtainMessage(pXL.this.AhwBna), 200L);
                    pXL pxl = pXL.this;
                    pxl.copydefault = pxl.getScrollY();
                }
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0010  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            StateListAnimator stateListAnimator = this.OLrzqt;
            if (stateListAnimator != null) {
                stateListAnimator.copydefault(java.lang.Boolean.TRUE);
            }
        } else if (action == 1) {
            android.os.Handler handler = this.EZpvd;
            handler.sendMessageDelayed(handler.obtainMessage(this.AhwBna), 5L);
        } else if (action != 2) {
            if (action == 3) {
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void copydefault() {
        StateListAnimator stateListAnimator = this.OLrzqt;
        if (stateListAnimator != null) {
            stateListAnimator.copydefault(java.lang.Boolean.FALSE);
        }
    }

    @Override // androidx.core.widget.NestedScrollView, androidx.core.view.NestedScrollingParent2
    public void onNestedPreScroll(@androidx.annotation.NonNull android.view.View view, int i, int i2, @androidx.annotation.NonNull int[] iArr, int i3) {
        if (this.AEQbTJ != null) {
            int iAEQbTJ = AEQbTJ();
            if (i2 > 0 && getScrollY() < iAEQbTJ) {
                int iMin = java.lang.Math.min(i2, iAEQbTJ - getScrollY());
                scrollBy(0, iMin);
                iArr[1] = iMin;
                return;
            }
        }
        super.onNestedPreScroll(view, i, i2, iArr, i3);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(@androidx.annotation.NonNull android.view.View view, float f, float f2) {
        if (this.AEQbTJ != null && f2 > 0.0f && getScrollY() < AEQbTJ()) {
            fling((int) f2);
            return false;
        }
        return super.onNestedPreFling(view, f, f2);
    }

    private int AEQbTJ() {
        if (this.KWHzl == null) {
            return this.AEQbTJ.getTop();
        }
        return this.AEQbTJ.getTop() + this.KWHzl.getHeight();
    }
}
