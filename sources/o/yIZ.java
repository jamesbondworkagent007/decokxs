package o;

/* JADX INFO: loaded from: classes13.dex */
public final class yIZ implements yIY<java.lang.Double> {
    public final double EZpvd;
    public final double KWHzl;

    public boolean AEQbTJ(double d, double d2) {
        return d <= d2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean KWHzl(double d) {
        return d >= this.KWHzl && d <= this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.yIY, o.InterfaceC56538yJb
    public boolean isEmpty() {
        return this.KWHzl > this.EZpvd;
    }

    public yIZ(double d, double d2) {
        this.KWHzl = d;
        this.EZpvd = d2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.lang.Comparable */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.lang.Comparable */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.yIY
    public /* synthetic */ boolean OLrzqt(java.lang.Comparable comparable, java.lang.Comparable comparable2) {
        return AEQbTJ(((java.lang.Number) comparable).doubleValue(), ((java.lang.Number) comparable2).doubleValue());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.lang.Comparable */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.yIY, o.InterfaceC56538yJb
    public /* synthetic */ boolean contains(java.lang.Comparable comparable) {
        return KWHzl(((java.lang.Number) comparable).doubleValue());
    }

    /* JADX DEBUG: Method merged with bridge method: getStart()Ljava/lang/Comparable; */
    @Override // o.InterfaceC56538yJb
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public java.lang.Double getStart() {
        return java.lang.Double.valueOf(this.KWHzl);
    }

    /* JADX DEBUG: Method merged with bridge method: getEndInclusive()Ljava/lang/Comparable; */
    @Override // o.InterfaceC56538yJb
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public java.lang.Double getEndInclusive() {
        return java.lang.Double.valueOf(this.EZpvd);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof yIZ) {
            if (!isEmpty() || !((yIZ) obj).isEmpty()) {
                yIZ yiz = (yIZ) obj;
                if (this.KWHzl != yiz.KWHzl || this.EZpvd != yiz.EZpvd) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (java.lang.Double.hashCode(this.KWHzl) * 31) + java.lang.Double.hashCode(this.EZpvd);
    }

    public java.lang.String toString() {
        return this.KWHzl + ".." + this.EZpvd;
    }
}
