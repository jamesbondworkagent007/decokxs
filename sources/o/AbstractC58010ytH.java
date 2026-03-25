package o;

/* JADX INFO: renamed from: o.ytH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC58010ytH implements InterfaceC58054ytz {
    public volatile boolean fARcdN = false;

    @Override // o.InterfaceC58036yth
    public void copydefault(boolean z) {
    }

    public void EZpvd() {
        C58013ytK.EZpvd("Matrix.Tracer", "[onAlive] %s", getClass().getName());
    }

    public final void djBIcL() {
        synchronized (this) {
            if (!this.fARcdN) {
                this.fARcdN = true;
                EZpvd();
            }
        }
    }

    public boolean AYXKKw() {
        return C58001ysz.AEQbTJ.ejfBZ();
    }
}
