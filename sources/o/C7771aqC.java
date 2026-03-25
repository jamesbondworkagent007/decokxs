package o;

import android.view.View;
import com.github.mmin18.widget.RealtimeBlurView;

/* JADX INFO: renamed from: o.aqC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7771aqC extends android.widget.FrameLayout implements InterfaceC7776aqH {
    private boolean enableForeground;
    private boolean mBlurViewVisibilityChangedBySkip;
    private C7932atE mForegroundDelegate;
    private int mMaxHeight;
    private int mMaxWidth;
    private boolean mSkipMeasureBlurView;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void clearForeground() {
        this.enableForeground = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC7776aqH
    public int getMaxHeight() {
        return this.mMaxHeight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC7776aqH
    public int getMaxWidth() {
        return this.mMaxWidth;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC7776aqH
    public void setMaxHeight(int i) {
        this.mMaxHeight = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC7776aqH
    public void setMaxWidth(int i) {
        this.mMaxWidth = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void skipMeasureBlurView(boolean z) {
        this.mSkipMeasureBlurView = z;
    }

    public C7771aqC(@androidx.annotation.NonNull android.content.Context context) {
        super(context);
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return super.getForegroundGravity();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void setForegroundGravity(int i) {
        super.setForegroundGravity(i);
    }

    @Override // android.view.View
    public boolean verifyDrawable(android.graphics.drawable.Drawable drawable) {
        return super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
    }

    @Override // android.view.View
    public void setForeground(android.graphics.drawable.Drawable drawable) {
        this.enableForeground = drawable != null;
        super.setForeground(drawable);
    }

    @Override // android.view.View
    public android.graphics.drawable.Drawable getForeground() {
        return super.getForeground();
    }

    public boolean hasForeground() {
        return super.getForeground() != null;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (C7330ahm.OLrzqt) {
            try {
                super.onLayout(z, i, i2, i3, i4);
            } catch (java.lang.NullPointerException e) {
                C7330ahm.values.AEQbTJ(this, e);
            }
        } else {
            super.onLayout(z, i, i2, i3, i4);
        }
        layoutBlurView(i, i2, i3, i4);
    }

    public final void layoutBlurView(int i, int i2, int i3, int i4) {
        try {
            if (this.mSkipMeasureBlurView && this.mBlurViewVisibilityChangedBySkip) {
                int childCount = getChildCount();
                for (int i5 = 0; i5 < childCount; i5++) {
                    android.view.View childAt = getChildAt(i5);
                    if (childAt instanceof RealtimeBlurView) {
                        childAt.setVisibility(0);
                        childAt.layout(i, i2, i3, i4);
                        this.mBlurViewVisibilityChangedBySkip = false;
                        return;
                    }
                }
            }
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        super.draw(canvas);
    }

    @Override // android.view.View
    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        measureBlurView();
        super.onMeasure(getSpec(i, this.mMaxWidth), getSpec(i2, this.mMaxHeight));
    }

    public final void measureBlurView() {
        try {
            if (this.mSkipMeasureBlurView) {
                int childCount = getChildCount();
                for (int i = 0; i < childCount; i++) {
                    android.view.View childAt = getChildAt(i);
                    if (childAt instanceof RealtimeBlurView) {
                        if (childAt.getVisibility() != 8 || this.mBlurViewVisibilityChangedBySkip) {
                            this.mBlurViewVisibilityChangedBySkip = true;
                            childAt.setVisibility(8);
                            return;
                        }
                        return;
                    }
                }
            }
        } catch (java.lang.Exception unused) {
        }
    }

    private int getSpec(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        return (mode != 1073741824 && View.MeasureSpec.getSize(i) > i2) ? View.MeasureSpec.makeMeasureSpec(i2, mode) : i;
    }
}
