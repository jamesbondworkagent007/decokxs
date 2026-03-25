package o;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: o.znG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59764znG implements InterfaceC59574zjc {
    public java.lang.String AEQbTJ;
    public final java.util.List<InterfaceC59518ziZ> OLrzqt;
    public int EZpvd = OLrzqt(-1);
    public int copydefault = -1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59574zjc, java.util.Iterator
    public boolean hasNext() {
        return this.EZpvd >= 0;
    }

    public C59764znG(java.util.List<InterfaceC59518ziZ> list, java.lang.String str) {
        this.OLrzqt = (java.util.List) C59851zoo.AEQbTJ(list, "Header list");
        this.AEQbTJ = str;
    }

    public int OLrzqt(int i) {
        if (i < -1) {
            return -1;
        }
        int size = this.OLrzqt.size();
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
        if (this.AEQbTJ == null) {
            return true;
        }
        return this.AEQbTJ.equalsIgnoreCase(this.OLrzqt.get(i).getName());
    }

    @Override // o.InterfaceC59574zjc
    public InterfaceC59518ziZ OLrzqt() throws NoSuchElementException {
        int i = this.EZpvd;
        if (i < 0) {
            throw new NoSuchElementException("Iteration already finished.");
        }
        this.copydefault = i;
        this.EZpvd = OLrzqt(i);
        return this.OLrzqt.get(i);
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() throws NoSuchElementException {
        return OLrzqt();
    }

    @Override // java.util.Iterator
    public void remove() throws java.lang.UnsupportedOperationException {
        C59849zom.EZpvd(this.copydefault >= 0, "No header to remove");
        this.OLrzqt.remove(this.copydefault);
        this.copydefault = -1;
        this.EZpvd--;
    }
}
