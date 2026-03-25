package o;

/* JADX INFO: loaded from: classes2.dex */
public class QG implements OC<byte[]> {
    public final byte[] KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: AEQbTJ()Ljava/lang/Object; */
    @Override // o.OC
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public byte[] AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.OC
    public java.lang.Class<byte[]> copydefault() {
        return byte[].class;
    }

    @Override // o.OC
    public void djBIcL() {
    }

    public QG(byte[] bArr) {
        this.KWHzl = (byte[]) SE.OLrzqt(bArr);
    }

    @Override // o.OC
    public int EZpvd() {
        return this.KWHzl.length;
    }
}
