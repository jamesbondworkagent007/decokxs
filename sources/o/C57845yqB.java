package o;

/* JADX INFO: renamed from: o.yqB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57845yqB {
    public java.util.List<C57846yqC> EZpvd;
    public java.util.List<C57849yqF> KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.util.List<C57849yqF> OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.util.List<C57846yqC> copydefault() {
        return this.EZpvd;
    }

    public C57845yqB() {
        this(new java.util.ArrayList());
    }

    public C57845yqB(java.util.List<C57849yqF> list) {
        this.KWHzl = list;
        this.EZpvd = new java.util.ArrayList();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(java.lang.String.valueOf(copydefault(this.KWHzl)) + " {\n");
        java.util.Iterator<C57846yqC> it = this.EZpvd.iterator();
        while (it.hasNext()) {
            sb.append("\t" + it.next() + ";\n");
        }
        sb.append("}\n");
        return sb.toString();
    }

    public void AEQbTJ(C57846yqC c57846yqC) {
        this.EZpvd.add(c57846yqC);
    }

    public final java.lang.String copydefault(java.util.List<C57849yqF> list) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.util.Iterator<C57849yqF> it = list.iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    public void EZpvd(C57849yqF c57849yqF) {
        this.KWHzl.add(c57849yqF);
    }
}
