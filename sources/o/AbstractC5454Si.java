package o;

/* JADX INFO: renamed from: o.Si, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public abstract class AbstractC5454Si<Z> extends AbstractC5453Sh<Z> {
    public final int EZpvd;
    public final int OLrzqt;

    @Override // o.InterfaceC5462Sq
    public void EZpvd(@androidx.annotation.NonNull InterfaceC5457Sl interfaceC5457Sl) {
    }

    public AbstractC5454Si() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public AbstractC5454Si(int i, int i2) {
        this.OLrzqt = i;
        this.EZpvd = i2;
    }

    @Override // o.InterfaceC5462Sq
    public final void OLrzqt(@androidx.annotation.NonNull InterfaceC5457Sl interfaceC5457Sl) {
        if (!SI.OLrzqt(this.OLrzqt, this.EZpvd)) {
            throw new java.lang.IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + this.OLrzqt + " and height: " + this.EZpvd + ", either provide dimensions in the constructor or call override()");
        }
        interfaceC5457Sl.OLrzqt(this.OLrzqt, this.EZpvd);
    }
}
