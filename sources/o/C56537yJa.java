package o;

/* JADX INFO: renamed from: o.yJa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56537yJa implements yIY<java.lang.Float> {
    public final float EZpvd;
    public final float OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean KWHzl(float f) {
        return f >= this.EZpvd && f <= this.OLrzqt;
    }

    public boolean KWHzl(float f, float f2) {
        return f <= f2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.yIY, o.InterfaceC56538yJb
    public boolean isEmpty() {
        return this.EZpvd > this.OLrzqt;
    }

    public C56537yJa(float f, float f2) {
        this.EZpvd = f;
        this.OLrzqt = f2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Comparable */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.lang.Comparable */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.yIY
    public /* synthetic */ boolean OLrzqt(java.lang.Comparable comparable, java.lang.Comparable comparable2) {
        return KWHzl(((java.lang.Number) comparable).floatValue(), ((java.lang.Number) comparable2).floatValue());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Comparable */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.yIY, o.InterfaceC56538yJb
    public /* synthetic */ boolean contains(java.lang.Comparable comparable) {
        return KWHzl(((java.lang.Number) comparable).floatValue());
    }

    /* JADX DEBUG: Method merged with bridge method: getStart()Ljava/lang/Comparable; */
    @Override // o.InterfaceC56538yJb
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public java.lang.Float getStart() {
        return java.lang.Float.valueOf(this.EZpvd);
    }

    /* JADX DEBUG: Method merged with bridge method: getEndInclusive()Ljava/lang/Comparable; */
    @Override // o.InterfaceC56538yJb
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public java.lang.Float getEndInclusive() {
        return java.lang.Float.valueOf(this.OLrzqt);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof C56537yJa) {
            if (!isEmpty() || !((C56537yJa) obj).isEmpty()) {
                C56537yJa c56537yJa = (C56537yJa) obj;
                if (this.EZpvd != c56537yJa.EZpvd || this.OLrzqt != c56537yJa.OLrzqt) {
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
        return (java.lang.Float.hashCode(this.EZpvd) * 31) + java.lang.Float.hashCode(this.OLrzqt);
    }

    public java.lang.String toString() {
        return this.EZpvd + ".." + this.OLrzqt;
    }
}
