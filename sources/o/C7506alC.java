package o;

/* JADX INFO: renamed from: o.alC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C7506alC extends android.widget.Scroller {
    public int KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(int i) {
        this.KWHzl = i;
    }

    public C7506alC(android.content.Context context, android.view.animation.Interpolator interpolator) {
        super(context, interpolator);
        this.KWHzl = 250;
    }

    @Override // android.widget.Scroller
    public void startScroll(int i, int i2, int i3, int i4) {
        startScroll(i, i2, i3, i4, this.KWHzl);
    }

    @Override // android.widget.Scroller
    public void startScroll(int i, int i2, int i3, int i4, int i5) {
        super.startScroll(i, i2, i3, i4, this.KWHzl);
    }
}
