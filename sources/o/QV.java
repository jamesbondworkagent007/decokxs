package o;

/* JADX INFO: loaded from: classes2.dex */
public class QV extends QL<QX> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.OC
    public java.lang.Class<QX> copydefault() {
        return QX.class;
    }

    public QV(QX qx) {
        super(qx);
    }

    @Override // o.OC
    public int EZpvd() {
        return ((QX) this.EZpvd).gEmmrt();
    }

    @Override // o.OC
    public void djBIcL() {
        ((QX) this.EZpvd).stop();
        ((QX) this.EZpvd).AhwBna();
    }

    @Override // o.QL, o.InterfaceC5364Ow
    public void KWHzl() {
        ((QX) this.EZpvd).OLrzqt().prepareToDraw();
    }
}
