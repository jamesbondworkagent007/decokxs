package o;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: o.zoI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C59819zoI implements InterfaceC59859zow {
    public final java.util.List<InterfaceC59858zov> KWHzl;
    public java.lang.String OLrzqt;
    public int AEQbTJ = OLrzqt(-1);
    public int copydefault = -1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.AEQbTJ >= 0;
    }

    public C59819zoI(java.util.List<InterfaceC59858zov> list, java.lang.String str) {
        this.KWHzl = (java.util.List) C59825zoO.copydefault(list, "Header list");
        this.OLrzqt = str;
    }

    public int OLrzqt(int i) {
        if (i < -1) {
            return -1;
        }
        int size = this.KWHzl.size();
        boolean zEZpvd = false;
        while (!zEZpvd && i < size - 1) {
            i++;
            zEZpvd = EZpvd(i);
        }
        if (zEZpvd) {
            return i;
        }
        return -1;
    }

    public boolean EZpvd(int i) {
        if (this.OLrzqt == null) {
            return true;
        }
        return this.OLrzqt.equalsIgnoreCase(this.KWHzl.get(i).getName());
    }

    public InterfaceC59858zov AEQbTJ() throws NoSuchElementException {
        int i = this.AEQbTJ;
        if (i < 0) {
            throw new NoSuchElementException("Iteration already finished.");
        }
        this.copydefault = i;
        this.AEQbTJ = OLrzqt(i);
        return this.KWHzl.get(i);
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() throws NoSuchElementException {
        return AEQbTJ();
    }

    @Override // java.util.Iterator
    public void remove() throws java.lang.UnsupportedOperationException {
        C59826zoP.EZpvd(this.copydefault >= 0, "No header to remove");
        this.KWHzl.remove(this.copydefault);
        this.copydefault = -1;
        this.AEQbTJ--;
    }
}
