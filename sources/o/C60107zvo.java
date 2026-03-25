package o;

import org.slf4j.Marker;
import org.slf4j.event.Level;

/* JADX INFO: renamed from: o.zvo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C60107zvo implements InterfaceC60105zvm {
    public Level AEQbTJ;
    public java.util.List<Marker> AYXKKw;
    public java.lang.String AhwBna;
    public java.util.List<C60104zvl> EZpvd;
    public java.lang.Object[] KWHzl;
    public C60115zvw OLrzqt;
    public java.lang.String copydefault;
    public java.lang.Throwable djBIcL;
    public java.lang.String gEmmrt;
    public long valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC60105zvm
    public java.lang.String AEQbTJ() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(long j) {
        this.valueOf = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(java.lang.Throwable th) {
        this.djBIcL = th;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(Level level) {
        this.AEQbTJ = level;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C60115zvw AhwBna() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC60105zvm
    public Level EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(java.lang.String str) {
        this.copydefault = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC60105zvm
    public java.util.List<C60104zvl> KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(java.lang.String str) {
        this.gEmmrt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(java.lang.String str) {
        this.AhwBna = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(java.lang.Object[] objArr) {
        this.KWHzl = objArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC60105zvm
    public java.lang.Object[] OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC60105zvm
    public java.util.List<Marker> copydefault() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(C60115zvw c60115zvw) {
        this.OLrzqt = c60115zvw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC60105zvm
    public java.lang.Throwable gEmmrt() {
        return this.djBIcL;
    }

    public void AEQbTJ(Marker marker) {
        if (marker == null) {
            return;
        }
        if (this.AYXKKw == null) {
            this.AYXKKw = new java.util.ArrayList(2);
        }
        this.AYXKKw.add(marker);
    }
}
