package o;

/* JADX INFO: renamed from: o.ubR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C48741ubR extends C7781aqM {
    public float AkhnZx;
    public boolean isConnected;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setAutoMirrored(boolean z) {
        this.isConnected = z;
    }

    public C48741ubR(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.AkhnZx = 0.5f;
        this.isConnected = false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean drawChild(android.graphics.Canvas canvas, android.view.View view, long j) {
        float f;
        float f2;
        int i;
        int width = (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
        int height = view.getHeight();
        int paddingTop = view.getPaddingTop();
        int paddingBottom = view.getPaddingBottom();
        int width2 = getWidth();
        if (width2 <= view.getWidth()) {
            return super.drawChild(canvas, view, j);
        }
        int i2 = (width2 - width) / 2;
        int left = view.getLeft();
        if (left <= i2) {
            f = this.AkhnZx;
            f2 = (1.0f - f) * 2.0f;
            i = left + width;
        } else {
            f = this.AkhnZx;
            f2 = (1.0f - f) * 2.0f;
            i = width2 - left;
        }
        float f3 = ((f2 * i) / (width2 + width)) + f;
        view.setPivotX(width / 2);
        view.setPivotY(((height - paddingTop) - paddingBottom) / 2);
        view.setScaleX(f3);
        view.setScaleY(f3);
        return super.drawChild(canvas, view, j);
    }

    public void AEQbTJ(float f) {
        this.AkhnZx = f;
        requestLayout();
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        AhwBna();
    }

    private void AhwBna() {
        setScaleX((this.isConnected && getLayoutDirection() == 1) ? -1.0f : 1.0f);
    }
}
