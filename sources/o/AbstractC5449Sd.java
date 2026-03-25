package o;

/* JADX INFO: renamed from: o.Sd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5449Sd<T> implements InterfaceC5462Sq<T> {
    public final int AhwBna;
    public final int EZpvd;
    public RV gEmmrt;

    @Override // o.InterfaceC5462Sq
    public void AEQbTJ(@androidx.annotation.Nullable android.graphics.drawable.Drawable drawable) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC5462Sq
    public final void AEQbTJ(@androidx.annotation.Nullable RV rv) {
        this.gEmmrt = rv;
    }

    @Override // o.InterfaceC5441Rv
    public void AYXKKw() {
    }

    @Override // o.InterfaceC5441Rv
    public void AhwBna() {
    }

    @Override // o.InterfaceC5462Sq
    public final void EZpvd(@androidx.annotation.NonNull InterfaceC5457Sl interfaceC5457Sl) {
    }

    @Override // o.InterfaceC5462Sq
    public void KWHzl(@androidx.annotation.Nullable android.graphics.drawable.Drawable drawable) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC5462Sq
    public final RV OLrzqt() {
        return this.gEmmrt;
    }

    @Override // o.InterfaceC5441Rv
    public void valueOf() {
    }

    public AbstractC5449Sd() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public AbstractC5449Sd(int i, int i2) {
        if (SI.OLrzqt(i, i2)) {
            this.AhwBna = i;
            this.EZpvd = i2;
            return;
        }
        throw new java.lang.IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + i + " and height: " + i2);
    }

    @Override // o.InterfaceC5462Sq
    public final void OLrzqt(@androidx.annotation.NonNull InterfaceC5457Sl interfaceC5457Sl) {
        interfaceC5457Sl.OLrzqt(this.AhwBna, this.EZpvd);
    }
}
