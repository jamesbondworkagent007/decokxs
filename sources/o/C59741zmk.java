package o;

import java.util.LinkedList;
import java.util.Queue;
import org.apache.commons.logging.LogFactory;

/* JADX INFO: renamed from: o.zmk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@java.lang.Deprecated
public class C59741zmk {
    public final int KWHzl;
    public final InterfaceC59568zjW OLrzqt;
    public final C59570zjY gEmmrt;
    public final InterfaceC59499ziG copydefault = LogFactory.copydefault(getClass());
    public final LinkedList<C59739zmi> AEQbTJ = new LinkedList<>();
    public final Queue<C59740zmj> AhwBna = new LinkedList();
    public int EZpvd = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C59570zjY OLrzqt() {
        return this.gEmmrt;
    }

    public C59741zmk(C59570zjY c59570zjY, InterfaceC59568zjW interfaceC59568zjW) {
        this.gEmmrt = c59570zjY;
        this.OLrzqt = interfaceC59568zjW;
        this.KWHzl = interfaceC59568zjW.KWHzl(c59570zjY);
    }

    public boolean valueOf() {
        return this.EZpvd < 1 && this.AhwBna.isEmpty();
    }

    public int KWHzl() {
        return this.OLrzqt.KWHzl(this.gEmmrt) - this.EZpvd;
    }

    public C59739zmi AEQbTJ(java.lang.Object obj) {
        if (!this.AEQbTJ.isEmpty()) {
            LinkedList<C59739zmi> linkedList = this.AEQbTJ;
            java.util.ListIterator<C59739zmi> listIterator = linkedList.listIterator(linkedList.size());
            while (listIterator.hasPrevious()) {
                C59739zmi c59739zmiPrevious = listIterator.previous();
                if (c59739zmiPrevious.OLrzqt() == null || C59852zop.OLrzqt(obj, c59739zmiPrevious.OLrzqt())) {
                    listIterator.remove();
                    return c59739zmiPrevious;
                }
            }
        }
        if (KWHzl() != 0 || this.AEQbTJ.isEmpty()) {
            return null;
        }
        C59739zmi c59739zmiRemove = this.AEQbTJ.remove();
        c59739zmiRemove.copydefault();
        try {
            c59739zmiRemove.AEQbTJ().close();
        } catch (java.io.IOException e) {
            this.copydefault.debug("I/O error closing connection", e);
        }
        return c59739zmiRemove;
    }

    public void copydefault(C59739zmi c59739zmi) {
        int i = this.EZpvd;
        if (i < 1) {
            throw new java.lang.IllegalStateException("No entry created for this pool. " + this.gEmmrt);
        }
        if (i <= this.AEQbTJ.size()) {
            throw new java.lang.IllegalStateException("No entry allocated from this pool. " + this.gEmmrt);
        }
        this.AEQbTJ.add(c59739zmi);
    }

    public void AEQbTJ(C59739zmi c59739zmi) {
        C59851zoo.copydefault(this.gEmmrt.equals(c59739zmi.KWHzl()), "Entry not planned for this pool");
        this.EZpvd++;
    }

    public boolean KWHzl(C59739zmi c59739zmi) {
        boolean zRemove = this.AEQbTJ.remove(c59739zmi);
        if (zRemove) {
            this.EZpvd--;
        }
        return zRemove;
    }

    public void copydefault() {
        C59849zom.EZpvd(this.EZpvd > 0, "There is no entry that could be dropped");
        this.EZpvd--;
    }

    public void OLrzqt(C59740zmj c59740zmj) {
        C59851zoo.AEQbTJ(c59740zmj, "Waiting thread");
        this.AhwBna.add(c59740zmj);
    }

    public boolean EZpvd() {
        return !this.AhwBna.isEmpty();
    }

    public C59740zmj gEmmrt() {
        return this.AhwBna.peek();
    }

    public void copydefault(C59740zmj c59740zmj) {
        if (c59740zmj == null) {
            return;
        }
        this.AhwBna.remove(c59740zmj);
    }
}
