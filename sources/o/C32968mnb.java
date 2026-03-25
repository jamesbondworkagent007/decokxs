package o;

/* JADX INFO: renamed from: o.mnb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public class C32968mnb extends android.widget.Scroller {
    public int OLrzqt;
    public boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(int i) {
        this.OLrzqt = i;
    }

    public C32968mnb(android.content.Context context) {
        super(context);
        this.OLrzqt = 800;
    }

    @Override // android.widget.Scroller
    public void startScroll(int i, int i2, int i3, int i4, int i5) {
        super.startScroll(i, i2, i3, i4, this.copydefault ? 0 : this.OLrzqt);
    }

    @Override // android.widget.Scroller
    public void startScroll(int i, int i2, int i3, int i4) {
        super.startScroll(i, i2, i3, i4, this.copydefault ? 0 : this.OLrzqt);
    }
}
