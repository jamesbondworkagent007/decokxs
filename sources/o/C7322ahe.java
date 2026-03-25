package o;

import org.luaj.vm2.Globals;

/* JADX INFO: renamed from: o.ahe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7322ahe implements InterfaceC60037zuM {
    public android.content.Context AEQbTJ;
    public android.util.SparseArray<InterfaceC7339ahv> AhwBna;
    public java.lang.String EZpvd;
    public java.io.PrintStream KWHzl;
    public C7328ahk copydefault;
    public java.lang.String gEmmrt;
    public java.lang.String valueOf;
    public boolean OLrzqt = false;
    public final C7382ail AYXKKw = new C7382ail();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(boolean z) {
        this.OLrzqt = z;
    }

    public C7322ahe(android.content.Context context) {
        this.AEQbTJ = context;
    }

    public void EZpvd(int i, InterfaceC7339ahv interfaceC7339ahv) {
        if (this.AhwBna == null) {
            this.AhwBna = new android.util.SparseArray<>();
        }
        this.AhwBna.put(i, interfaceC7339ahv);
    }

    public InterfaceC7339ahv KWHzl(int i) {
        android.util.SparseArray<InterfaceC7339ahv> sparseArray = this.AhwBna;
        if (sparseArray != null) {
            return sparseArray.get(i);
        }
        return null;
    }

    public void EZpvd(int i) {
        android.util.SparseArray<InterfaceC7339ahv> sparseArray = this.AhwBna;
        if (sparseArray != null) {
            sparseArray.remove(i);
        }
    }

    @Override // o.InterfaceC60037zuM
    public void KWHzl(Globals globals) {
        if (globals.hDKMBd()) {
            return;
        }
        this.AEQbTJ = null;
        this.copydefault = null;
        this.KWHzl = null;
        this.AYXKKw.OLrzqt();
        android.util.SparseArray<InterfaceC7339ahv> sparseArray = this.AhwBna;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // o.InterfaceC60046zuV
    public void AEQbTJ(long j, java.lang.String str, java.lang.String str2) {
        java.io.PrintStream printStream = this.KWHzl;
        if (printStream != null) {
            printStream.print(str2);
            printStream.println();
        }
        C7870arw.KWHzl(str, str2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: java.io.PrintStream */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC60046zuV
    public void KWHzl(long j, java.lang.String str, java.lang.String str2) {
        java.io.PrintStream printStream = this.KWHzl;
        if (printStream instanceof InterfaceC7851ard) {
            ((InterfaceC7851ard) printStream).OLrzqt(str2);
        } else if (printStream != 0) {
            printStream.print(str2);
            printStream.println();
        }
        C7870arw.KWHzl(str, str2);
    }

    public void KWHzl() {
        C7328ahk c7328ahk = this.copydefault;
        if (c7328ahk == null || c7328ahk.uzCIH() || this.copydefault.fJNWhG()) {
            return;
        }
        this.copydefault.EZpvd(true);
    }
}
