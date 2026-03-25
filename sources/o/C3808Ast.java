package o;

/* JADX INFO: renamed from: o.Ast, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C3808Ast {
    public static final int $stable = 8;
    public boolean KWHzl;
    public boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C3808Ast copy$default(C3808Ast c3808Ast, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = c3808Ast.copydefault;
        }
        if ((i & 2) != 0) {
            z2 = c3808Ast.KWHzl;
        }
        return c3808Ast.AEQbTJ(z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3808Ast AEQbTJ(boolean z, boolean z2) {
        return new C3808Ast(z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3808Ast)) {
            return false;
        }
        C3808Ast c3808Ast = (C3808Ast) obj;
        return this.copydefault == c3808Ast.copydefault && this.KWHzl == c3808Ast.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (java.lang.Boolean.hashCode(this.copydefault) * 31) + java.lang.Boolean.hashCode(this.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "PaymentMethodInfo(isBalance=" + this.copydefault + ", isNative=" + this.KWHzl + ")";
    }

    public C3808Ast(boolean z, boolean z2) {
        this.copydefault = z;
        this.KWHzl = z2;
    }
}
