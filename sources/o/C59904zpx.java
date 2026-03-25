package o;

import org.jdom2.Content;
import org.jdom2.Element;
import org.jdom2.Parent;

/* JADX INFO: renamed from: o.zpx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C59904zpx implements InterfaceC59880zpQ<Content> {
    public boolean AEQbTJ;
    public final Parent KWHzl;
    public java.util.Iterator<Content> OLrzqt;
    public java.lang.Object[] djBIcL = new java.lang.Object[16];
    public int valueOf = 0;
    public java.util.Iterator<Content> copydefault = null;
    public java.util.Iterator<Content> EZpvd = null;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.AEQbTJ;
    }

    public C59904zpx(Parent parent) {
        this.OLrzqt = null;
        this.AEQbTJ = true;
        this.KWHzl = parent;
        java.util.Iterator<Content> it = parent.getContent().iterator();
        this.OLrzqt = it;
        this.AEQbTJ = it.hasNext();
    }

    /* JADX DEBUG: Method merged with bridge method: iterator()Ljava/util/Iterator; */
    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public C59904zpx iterator() {
        return new C59904zpx(this.KWHzl);
    }

    /* JADX DEBUG: Method merged with bridge method: next()Ljava/lang/Object; */
    @Override // java.util.Iterator
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public Content next() {
        java.util.Iterator<Content> it;
        java.util.Iterator<Content> it2 = this.copydefault;
        if (it2 != null) {
            this.OLrzqt = it2;
            this.copydefault = null;
        } else {
            java.util.Iterator<Content> it3 = this.EZpvd;
            if (it3 != null) {
                this.OLrzqt = it3;
                this.EZpvd = null;
            }
        }
        Content next = this.OLrzqt.next();
        if (next instanceof Element) {
            Element element = (Element) next;
            if (element.getContentSize() > 0) {
                this.copydefault = element.getContent().iterator();
                int i = this.valueOf;
                java.lang.Object[] objArr = this.djBIcL;
                if (i >= objArr.length) {
                    this.djBIcL = C59867zpD.copydefault(objArr, i + 16);
                }
                java.lang.Object[] objArr2 = this.djBIcL;
                int i2 = this.valueOf;
                this.valueOf = i2 + 1;
                objArr2[i2] = this.OLrzqt;
                return next;
            }
        }
        if (this.OLrzqt.hasNext()) {
            return next;
        }
        do {
            int i3 = this.valueOf;
            if (i3 <= 0) {
                this.EZpvd = null;
                this.AEQbTJ = false;
                return next;
            }
            java.lang.Object[] objArr3 = this.djBIcL;
            int i4 = i3 - 1;
            this.valueOf = i4;
            it = (java.util.Iterator) objArr3[i4];
            this.EZpvd = it;
            objArr3[i4] = null;
        } while (!it.hasNext());
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        java.util.Iterator<Content> it;
        this.OLrzqt.remove();
        this.copydefault = null;
        if (this.OLrzqt.hasNext() || this.EZpvd != null) {
            return;
        }
        do {
            int i = this.valueOf;
            if (i <= 0) {
                this.EZpvd = null;
                this.AEQbTJ = false;
                return;
            }
            java.lang.Object[] objArr = this.djBIcL;
            int i2 = i - 1;
            this.valueOf = i2;
            it = (java.util.Iterator) objArr[i2];
            objArr[i2] = null;
            this.EZpvd = it;
        } while (!it.hasNext());
    }
}
