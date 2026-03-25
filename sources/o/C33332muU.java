package o;

/* JADX INFO: renamed from: o.muU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C33332muU extends android.widget.VideoView {
    public C33332muU(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C33332muU(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet);
    }

    @Override // android.widget.VideoView, android.view.SurfaceView, android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(android.view.View.getDefaultSize(0, i), android.view.View.getDefaultSize(0, i2));
    }
}
