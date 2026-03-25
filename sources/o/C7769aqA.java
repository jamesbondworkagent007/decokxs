package o;

import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: renamed from: o.aqA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7769aqA extends MaterialTextView {
    private boolean enableForeground;
    private C7932atE mForegroundDelegate;
    private android.text.StaticLayout staticLayout;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void clearForeground() {
        this.enableForeground = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setStaticLayout(android.text.StaticLayout staticLayout) {
        this.staticLayout = staticLayout;
    }

    public C7769aqA(android.content.Context context) {
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

    @Override // android.widget.TextView, android.view.View
    public boolean verifyDrawable(android.graphics.drawable.Drawable drawable) {
        return super.verifyDrawable(drawable);
    }

    @Override // android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
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

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
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

    @Override // android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
    }
}
