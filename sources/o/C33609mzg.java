package o;

import android.view.View;

/* JADX INFO: renamed from: o.mzg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C33609mzg extends C55239xgG {
    public boolean AEQbTJ;
    public View.OnClickListener EZpvd;
    public int OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setTouchable(boolean z) {
        this.AEQbTJ = z;
    }

    public C33609mzg(android.content.Context context) {
        super(context);
        this.AEQbTJ = false;
        EZpvd(context);
    }

    public C33609mzg(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.AEQbTJ = false;
        EZpvd(context);
    }

    public C33609mzg(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.AEQbTJ = false;
        EZpvd(context);
    }

    private void EZpvd(android.content.Context context) {
        this.OLrzqt = android.view.ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override // android.view.View
    public void setOnClickListener(@androidx.annotation.Nullable View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        this.EZpvd = onClickListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public boolean performClick() {
        if (EZpvd()) {
            return super.performClick();
        }
        boolean z = false;
        if (isClickable() && this.EZpvd != null) {
            playSoundEffect(0);
            this.EZpvd.onClick(this);
            z = true;
        }
        sendAccessibilityEvent(1);
        return z;
    }

    @Override // androidx.appcompat.widget.SwitchCompat, android.widget.TextView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (EZpvd()) {
            return super.onTouchEvent(motionEvent);
        }
        if (!isClickable()) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action == 0) {
            setPressed(true);
        } else if (action != 1) {
            if (action != 2) {
                if (action == 3) {
                    setPressed(false);
                }
            } else if (!copydefault(x, y, this.OLrzqt)) {
                setPressed(false);
            }
        } else if (isPressed()) {
            performClick();
            setPressed(false);
        }
        return true;
    }

    public boolean copydefault(float f, float f2, float f3) {
        float f4 = -f3;
        return f >= f4 && f2 >= f4 && f < ((float) (getRight() - getLeft())) + f3 && f2 < ((float) (getBottom() - getTop())) + f3;
    }
}
