package com.geetest.gtc4;

/* JADX INFO: loaded from: classes21.dex */
public final class g {
    public static final f[] d = new f[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f[] f450a;
    public int b;
    public boolean c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public g(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("'initialCapacity' must not be negative");
        }
        this.f450a = i == 0 ? d : new f[i];
        this.b = 0;
        this.c = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(f fVar) {
        if (fVar == null) {
            throw new NullPointerException("'element' cannot be null");
        }
        f[] fVarArr = this.f450a;
        int length = fVarArr.length;
        int i = this.b + 1;
        if (this.c | (i > length)) {
            f[] fVarArr2 = new f[Math.max(fVarArr.length, (i >> 1) + i)];
            System.arraycopy(this.f450a, 0, fVarArr2, 0, this.b);
            this.f450a = fVarArr2;
            this.c = false;
        }
        this.f450a[this.b] = fVar;
        this.b = i;
    }

    public final f a(int i) {
        if (i < this.b) {
            return this.f450a[i];
        }
        throw new ArrayIndexOutOfBoundsException(i + " >= " + this.b);
    }
}
