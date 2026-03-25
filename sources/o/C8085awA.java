package o;

/* JADX INFO: renamed from: o.awA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8085awA<A, B> {
    public final B EZpvd;
    public final A KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public A EZpvd() {
        return this.KWHzl;
    }

    public C8085awA(A a2, B b) {
        this.KWHzl = a2;
        this.EZpvd = b;
    }

    public static <A, B> C8085awA<A, B> copydefault(A a2, B b) {
        return new C8085awA<>(a2, b);
    }

    public int hashCode() {
        A a2 = this.KWHzl;
        int iHashCode = a2 == null ? 0 : a2.hashCode();
        B b = this.EZpvd;
        return ((iHashCode + 31) * 31) + (b != null ? b.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8085awA.class != obj.getClass()) {
            return false;
        }
        C8085awA c8085awA = (C8085awA) obj;
        A a2 = this.KWHzl;
        if (a2 == null) {
            if (c8085awA.KWHzl != null) {
                return false;
            }
        } else if (!a2.equals(c8085awA.KWHzl)) {
            return false;
        }
        B b = this.EZpvd;
        if (b == null) {
            if (c8085awA.EZpvd != null) {
                return false;
            }
        } else if (!b.equals(c8085awA.EZpvd)) {
            return false;
        }
        return true;
    }
}
