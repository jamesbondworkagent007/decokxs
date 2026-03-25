package o;

import com.github.mmin18.widget.RealtimeBlurView;

/* JADX INFO: renamed from: o.aqN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C7782aqN extends RealtimeBlurView {
    public boolean KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(boolean z) {
        this.KWHzl = z;
    }

    public C7782aqN(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.github.mmin18.widget.RealtimeBlurView
    public void blur(android.graphics.Bitmap bitmap, android.graphics.Bitmap bitmap2) {
        if (this.KWHzl) {
            return;
        }
        super.blur(bitmap, bitmap2);
    }

    @Override // android.view.View
    public void invalidate() {
        if (this.KWHzl) {
            return;
        }
        super.invalidate();
    }

    @Override // com.github.mmin18.widget.RealtimeBlurView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.KWHzl = false;
    }
}
