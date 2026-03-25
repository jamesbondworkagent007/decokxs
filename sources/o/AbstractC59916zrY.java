package o;

import java.net.MalformedURLException;
import java.util.Collections;
import org.jsoup.nodes.Document;

/* JADX INFO: renamed from: o.zrY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractC59916zrY implements java.lang.Cloneable {
    public int AhwBna;
    public C59913zrV KWHzl;
    public java.lang.String djBIcL;
    public java.util.List<AbstractC59916zrY> gEmmrt;
    public AbstractC59916zrY valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AbstractC59916zrY AhwBna() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C59913zrV DbNXlk() {
        return this.KWHzl;
    }

    public abstract void KWHzl(java.lang.StringBuilder sb, int i, Document.Activity activity);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(int i) {
        this.AhwBna = i;
    }

    public abstract void OLrzqt(java.lang.StringBuilder sb, int i, Document.Activity activity);

    public abstract java.lang.String copydefault();

    public boolean equals(java.lang.Object obj) {
        return this == obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int iwGUEr() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String values() {
        return this.djBIcL;
    }

    public AbstractC59916zrY(java.lang.String str, C59913zrV c59913zrV) {
        C59912zrU.KWHzl((java.lang.Object) str);
        C59912zrU.KWHzl(c59913zrV);
        this.gEmmrt = new java.util.ArrayList(4);
        this.djBIcL = str.trim();
        this.KWHzl = c59913zrV;
    }

    public AbstractC59916zrY(java.lang.String str) {
        this(str, new C59913zrV());
    }

    public AbstractC59916zrY() {
        this.gEmmrt = Collections.emptyList();
        this.KWHzl = null;
    }

    public java.lang.String EZpvd(java.lang.String str) {
        C59912zrU.KWHzl((java.lang.Object) str);
        if (this.KWHzl.KWHzl(str)) {
            return this.KWHzl.copydefault(str);
        }
        return str.toLowerCase().startsWith("abs:") ? OLrzqt(str.substring(4)) : "";
    }

    public AbstractC59916zrY EZpvd(java.lang.String str, java.lang.String str2) {
        this.KWHzl.copydefault(str, str2);
        return this;
    }

    public boolean KWHzl(java.lang.String str) {
        C59912zrU.KWHzl((java.lang.Object) str);
        if (str.toLowerCase().startsWith("abs:")) {
            java.lang.String strSubstring = str.substring(4);
            if (this.KWHzl.KWHzl(strSubstring) && !OLrzqt(strSubstring).equals("")) {
                return true;
            }
        }
        return this.KWHzl.KWHzl(str);
    }

    public void gEmmrt(final java.lang.String str) {
        C59912zrU.KWHzl((java.lang.Object) str);
        EZpvd(new InterfaceC59958zsn() { // from class: o.zrY.5
            @Override // o.InterfaceC59958zsn
            public void EZpvd(AbstractC59916zrY abstractC59916zrY, int i) {
            }

            @Override // o.InterfaceC59958zsn
            public void copydefault(AbstractC59916zrY abstractC59916zrY, int i) {
                abstractC59916zrY.djBIcL = str;
            }
        });
    }

    public java.lang.String OLrzqt(java.lang.String str) {
        C59912zrU.copydefault(str);
        java.lang.String strEZpvd = EZpvd(str);
        try {
            if (!KWHzl(str)) {
                return "";
            }
            try {
                java.net.URL url = new java.net.URL(this.djBIcL);
                if (strEZpvd.startsWith("?")) {
                    strEZpvd = url.getPath() + strEZpvd;
                }
                return new java.net.URL(url, strEZpvd).toExternalForm();
            } catch (MalformedURLException unused) {
                return new java.net.URL(strEZpvd).toExternalForm();
            }
        } catch (MalformedURLException unused2) {
            return "";
        }
    }

    public AbstractC59916zrY copydefault(int i) {
        return this.gEmmrt.get(i);
    }

    public java.util.List<AbstractC59916zrY> fARcdN() {
        return Collections.unmodifiableList(this.gEmmrt);
    }

    public final int AkhnZx() {
        return this.gEmmrt.size();
    }

    public Document fJNWhG() {
        if (this instanceof Document) {
            return (Document) this;
        }
        AbstractC59916zrY abstractC59916zrY = this.valueOf;
        if (abstractC59916zrY == null) {
            return null;
        }
        return abstractC59916zrY.fJNWhG();
    }

    public void uzCIH() {
        C59912zrU.KWHzl(this.valueOf);
        this.valueOf.AYXKKw(this);
    }

    public AbstractC59916zrY AEQbTJ(AbstractC59916zrY abstractC59916zrY) {
        C59912zrU.KWHzl(abstractC59916zrY);
        C59912zrU.KWHzl(this.valueOf);
        this.valueOf.EZpvd(iwGUEr(), abstractC59916zrY);
        return this;
    }

    public void valueOf(AbstractC59916zrY abstractC59916zrY) {
        AbstractC59916zrY abstractC59916zrY2 = this.valueOf;
        if (abstractC59916zrY2 != null) {
            abstractC59916zrY2.AYXKKw(this);
        }
        this.valueOf = abstractC59916zrY;
    }

    public void AYXKKw(AbstractC59916zrY abstractC59916zrY) {
        C59912zrU.KWHzl(abstractC59916zrY.valueOf == this);
        this.gEmmrt.remove(abstractC59916zrY.iwGUEr());
        ejfBZ();
        abstractC59916zrY.valueOf = null;
    }

    public void AEQbTJ(AbstractC59916zrY... abstractC59916zrYArr) {
        for (AbstractC59916zrY abstractC59916zrY : abstractC59916zrYArr) {
            AhwBna(abstractC59916zrY);
            this.gEmmrt.add(abstractC59916zrY);
            abstractC59916zrY.OLrzqt(this.gEmmrt.size() - 1);
        }
    }

    public void EZpvd(int i, AbstractC59916zrY... abstractC59916zrYArr) {
        C59912zrU.copydefault(abstractC59916zrYArr);
        for (int length = abstractC59916zrYArr.length - 1; length >= 0; length--) {
            AbstractC59916zrY abstractC59916zrY = abstractC59916zrYArr[length];
            AhwBna(abstractC59916zrY);
            this.gEmmrt.add(i, abstractC59916zrY);
        }
        ejfBZ();
    }

    public final void AhwBna(AbstractC59916zrY abstractC59916zrY) {
        AbstractC59916zrY abstractC59916zrY2 = abstractC59916zrY.valueOf;
        if (abstractC59916zrY2 != null) {
            abstractC59916zrY2.AYXKKw(abstractC59916zrY);
        }
        abstractC59916zrY.valueOf(this);
    }

    public final void ejfBZ() {
        for (int i = 0; i < this.gEmmrt.size(); i++) {
            this.gEmmrt.get(i).OLrzqt(i);
        }
    }

    public java.util.List<AbstractC59916zrY> hDKMBd() {
        AbstractC59916zrY abstractC59916zrY = this.valueOf;
        if (abstractC59916zrY == null) {
            return Collections.emptyList();
        }
        java.util.List<AbstractC59916zrY> list = abstractC59916zrY.gEmmrt;
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size() - 1);
        for (AbstractC59916zrY abstractC59916zrY2 : list) {
            if (abstractC59916zrY2 != this) {
                arrayList.add(abstractC59916zrY2);
            }
        }
        return arrayList;
    }

    public AbstractC59916zrY fIwbmz() {
        AbstractC59916zrY abstractC59916zrY = this.valueOf;
        if (abstractC59916zrY == null) {
            return null;
        }
        java.util.List<AbstractC59916zrY> list = abstractC59916zrY.gEmmrt;
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(iwGUEr());
        C59912zrU.KWHzl(numValueOf);
        if (list.size() > numValueOf.intValue() + 1) {
            return list.get(numValueOf.intValue() + 1);
        }
        return null;
    }

    public AbstractC59916zrY EZpvd(InterfaceC59958zsn interfaceC59958zsn) {
        C59912zrU.KWHzl(interfaceC59958zsn);
        new C59959zso(interfaceC59958zsn).OLrzqt(this);
        return this;
    }

    public java.lang.String EZpvd() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(128);
        EZpvd(sb);
        return sb.toString();
    }

    public void EZpvd(java.lang.StringBuilder sb) {
        new C59959zso(new ActionBar(sb, AuCTel())).OLrzqt(this);
    }

    public final Document.Activity AuCTel() {
        return (fJNWhG() != null ? fJNWhG() : new Document("")).djBIcL();
    }

    public java.lang.String toString() {
        return EZpvd();
    }

    public void AEQbTJ(java.lang.StringBuilder sb, int i, Document.Activity activity) {
        sb.append("\n");
        sb.append(C59910zrS.AEQbTJ(i * activity.KWHzl()));
    }

    public int hashCode() {
        AbstractC59916zrY abstractC59916zrY = this.valueOf;
        int iHashCode = abstractC59916zrY != null ? abstractC59916zrY.hashCode() : 0;
        C59913zrV c59913zrV = this.KWHzl;
        return (iHashCode * 31) + (c59913zrV != null ? c59913zrV.hashCode() : 0);
    }

    /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
    @Override // 
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public AbstractC59916zrY clone() {
        return EZpvd((AbstractC59916zrY) null);
    }

    public AbstractC59916zrY EZpvd(AbstractC59916zrY abstractC59916zrY) {
        try {
            AbstractC59916zrY abstractC59916zrY2 = (AbstractC59916zrY) super.clone();
            abstractC59916zrY2.valueOf = abstractC59916zrY;
            abstractC59916zrY2.AhwBna = abstractC59916zrY == null ? 0 : this.AhwBna;
            C59913zrV c59913zrV = this.KWHzl;
            abstractC59916zrY2.KWHzl = c59913zrV != null ? c59913zrV.clone() : null;
            abstractC59916zrY2.djBIcL = this.djBIcL;
            abstractC59916zrY2.gEmmrt = new java.util.ArrayList(this.gEmmrt.size());
            java.util.Iterator<AbstractC59916zrY> it = this.gEmmrt.iterator();
            while (it.hasNext()) {
                abstractC59916zrY2.gEmmrt.add(it.next().EZpvd(abstractC59916zrY2));
            }
            return abstractC59916zrY2;
        } catch (java.lang.CloneNotSupportedException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: o.zrY$ActionBar */
    /* JADX INFO: loaded from: classes20.dex */
    public static class ActionBar implements InterfaceC59958zsn {
        public java.lang.StringBuilder OLrzqt;
        public Document.Activity copydefault;

        public ActionBar(java.lang.StringBuilder sb, Document.Activity activity) {
            this.OLrzqt = sb;
            this.copydefault = activity;
        }

        @Override // o.InterfaceC59958zsn
        public void copydefault(AbstractC59916zrY abstractC59916zrY, int i) {
            abstractC59916zrY.OLrzqt(this.OLrzqt, i, this.copydefault);
        }

        @Override // o.InterfaceC59958zsn
        public void EZpvd(AbstractC59916zrY abstractC59916zrY, int i) {
            if (abstractC59916zrY.copydefault().equals("#text")) {
                return;
            }
            abstractC59916zrY.KWHzl(this.OLrzqt, i, this.copydefault);
        }
    }
}
