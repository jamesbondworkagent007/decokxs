package o;

import com.google.android.flexbox.FlexboxLayout;

/* JADX INFO: renamed from: o.rle, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C43245rle extends FlexboxLayout {
    public boolean gEmmrt;

    public C43245rle(@androidx.annotation.NonNull android.content.Context context) {
        super(context);
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return super.getForegroundGravity();
    }

    @Override // android.view.View
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
        this.gEmmrt = drawable != null;
        super.setForeground(drawable);
    }

    @Override // android.view.View
    public android.graphics.drawable.Drawable getForeground() {
        return super.getForeground();
    }

    @Override // com.google.android.flexbox.FlexboxLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
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
}
