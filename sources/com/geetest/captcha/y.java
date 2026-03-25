package com.geetest.captcha;

/* JADX INFO: loaded from: classes17.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f387a;
    public final int b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public y(int i, int i2) {
        this.f387a = i;
        this.b = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f387a == yVar.f387a && this.b == yVar.b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.f387a) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String toString() {
        return "ScreenMetrics(width=" + this.f387a + ", height=" + this.b + ')';
    }
}
