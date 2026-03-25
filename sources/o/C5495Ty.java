package o;

import o.C5492Tv;
import o.C5496Tz;

/* JADX INFO: renamed from: o.Ty, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5495Ty extends android.widget.FrameLayout {
    private final android.graphics.Paint mContentPaint;
    private final C5493Tw mShimmerDrawable;
    private boolean mShowShimmer;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isShimmerVisible() {
        return this.mShowShimmer;
    }

    public C5495Ty(android.content.Context context) {
        super(context);
        this.mContentPaint = new android.graphics.Paint();
        this.mShimmerDrawable = new C5493Tw();
        this.mShowShimmer = true;
        init(context, null);
    }

    public C5495Ty(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mContentPaint = new android.graphics.Paint();
        this.mShimmerDrawable = new C5493Tw();
        this.mShowShimmer = true;
        init(context, attributeSet);
    }

    public C5495Ty(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mContentPaint = new android.graphics.Paint();
        this.mShimmerDrawable = new C5493Tw();
        this.mShowShimmer = true;
        init(context, attributeSet);
    }

    public C5495Ty(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mContentPaint = new android.graphics.Paint();
        this.mShimmerDrawable = new C5493Tw();
        this.mShowShimmer = true;
        init(context, attributeSet);
    }

    private void init(android.content.Context context, @androidx.annotation.Nullable android.util.AttributeSet attributeSet) {
        setWillNotDraw(false);
        this.mShimmerDrawable.setCallback(this);
        if (attributeSet == null) {
            setShimmer(new C5492Tv.StateListAnimator().copydefault());
            return;
        }
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5496Tz.ActionBar.KWHzl, 0, 0);
        try {
            setShimmer(((typedArrayObtainStyledAttributes.hasValue(C5496Tz.ActionBar.AYXKKw) && typedArrayObtainStyledAttributes.getBoolean(C5496Tz.ActionBar.AYXKKw, false)) ? new C5492Tv.Activity() : new C5492Tv.StateListAnimator()).EZpvd(typedArrayObtainStyledAttributes).copydefault());
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public C5495Ty setShimmer(@androidx.annotation.Nullable C5492Tv c5492Tv) {
        this.mShimmerDrawable.EZpvd(c5492Tv);
        if (c5492Tv != null && c5492Tv.djBIcL) {
            setLayerType(2, this.mContentPaint);
        } else {
            setLayerType(0, null);
        }
        return this;
    }

    public void startShimmer() {
        this.mShimmerDrawable.EZpvd();
    }

    public void stopShimmer() {
        this.mShimmerDrawable.KWHzl();
    }

    public boolean isShimmerStarted() {
        return this.mShimmerDrawable.copydefault();
    }

    public void showShimmer(boolean z) {
        if (this.mShowShimmer) {
            return;
        }
        this.mShowShimmer = true;
        if (z) {
            startShimmer();
        }
    }

    public void hideShimmer() {
        if (this.mShowShimmer) {
            stopShimmer();
            this.mShowShimmer = false;
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.mShimmerDrawable.setBounds(0, 0, getWidth(), getHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mShimmerDrawable.OLrzqt();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        stopShimmer();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.mShowShimmer) {
            this.mShimmerDrawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(@androidx.annotation.NonNull android.graphics.drawable.Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.mShimmerDrawable;
    }
}
