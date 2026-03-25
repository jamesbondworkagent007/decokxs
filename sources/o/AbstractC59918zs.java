package o;

/* JADX INFO: renamed from: o.zs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractC59918zs implements InterfaceC59908zr {
    public final int KWHzl = 4;
    public final int AEQbTJ = 4;

    public abstract int OLrzqt();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59908zr
    public int copydefault() {
        return this.KWHzl;
    }

    @Override // o.InterfaceC59908zr
    public byte[] AEQbTJ() {
        int iOLrzqt = OLrzqt();
        EZpvd();
        return new byte[]{(byte) C56395yDu.EZpvd(C56395yDu.EZpvd(iOLrzqt >>> 24) & 255), (byte) C56395yDu.EZpvd(C56395yDu.EZpvd(iOLrzqt >>> 16) & 255), (byte) C56395yDu.EZpvd(C56395yDu.EZpvd(iOLrzqt >>> 8) & 255), (byte) C56395yDu.EZpvd(iOLrzqt & 255)};
    }
}
