package o;

import org.slf4j.Marker;
import org.slf4j.event.Level;

/* JADX INFO: renamed from: o.zvj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C60102zvj implements InterfaceC60105zvm {
    public java.util.List<C60104zvl> AEQbTJ;
    public java.util.List<Marker> AYXKKw;
    public java.lang.String AhwBna;
    public Level EZpvd;
    public java.util.List<java.lang.Object> KWHzl;
    public InterfaceC60100zvh OLrzqt;
    public java.lang.String copydefault;
    public java.lang.Throwable valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC60105zvm
    public java.lang.String AEQbTJ() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC60105zvm
    public Level EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(java.lang.String str) {
        this.copydefault = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC60105zvm
    public java.util.List<C60104zvl> KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(java.lang.String str) {
        this.AhwBna = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(java.lang.Throwable th) {
        this.valueOf = th;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC60105zvm
    public java.util.List<Marker> copydefault() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC60105zvm
    public java.lang.Throwable gEmmrt() {
        return this.valueOf;
    }

    public C60102zvj(Level level, InterfaceC60100zvh interfaceC60100zvh) {
        this.OLrzqt = interfaceC60100zvh;
        this.EZpvd = level;
    }

    @Override // o.InterfaceC60105zvm
    public java.lang.Object[] OLrzqt() {
        java.util.List<java.lang.Object> list = this.KWHzl;
        if (list == null) {
            return null;
        }
        return list.toArray();
    }

    public void EZpvd(java.lang.String str, java.lang.Object obj) {
        valueOf().add(new C60104zvl(str, obj));
    }

    public final java.util.List<C60104zvl> valueOf() {
        if (this.AEQbTJ == null) {
            this.AEQbTJ = new java.util.ArrayList(4);
        }
        return this.AEQbTJ;
    }
}
