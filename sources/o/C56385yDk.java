package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yDk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56385yDk implements java.lang.Comparable<C56385yDk> {
    public static final Application AEQbTJ = new Application(null);
    public static final C56385yDk KWHzl = C56384yDj.KWHzl();
    public final int AYXKKw;
    public final int EZpvd;
    public final int OLrzqt;
    public final int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ(int i, int i2, int i3) {
        int i4;
        int i5 = this.OLrzqt;
        return i5 > i || (i5 == i && ((i4 = this.copydefault) > i2 || (i4 == i2 && this.EZpvd >= i3)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.AYXKKw;
    }

    public C56385yDk(int i, int i2, int i3) {
        this.OLrzqt = i;
        this.copydefault = i2;
        this.EZpvd = i3;
        this.AYXKKw = EZpvd(i, i2, i3);
    }

    public C56385yDk(int i, int i2) {
        this(i, i2, 0);
    }

    public final int EZpvd(int i, int i2, int i3) {
        if (i >= 0 && i < 256 && i2 >= 0 && i2 < 256 && i3 >= 0 && i3 < 256) {
            return (i << 16) + (i2 << 8) + i3;
        }
        throw new java.lang.IllegalArgumentException(("Version components are out of range: " + i + '.' + i2 + '.' + i3).toString());
    }

    /* JADX DEBUG: TODO: convert one arg to string using `String.valueOf()`, args: (wrap:int:IGET), 46, (wrap:int:IGET), 46, (wrap:int:IGET) */
    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.OLrzqt);
        sb.append('.');
        sb.append(this.copydefault);
        sb.append('.');
        sb.append(this.EZpvd);
        return sb.toString();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        C56385yDk c56385yDk = obj instanceof C56385yDk ? (C56385yDk) obj : null;
        return c56385yDk != null && this.AYXKKw == c56385yDk.AYXKKw;
    }

    /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NotNull C56385yDk c56385yDk) {
        Intrinsics.checkNotNullParameter(c56385yDk, "");
        return this.AYXKKw - c56385yDk.AYXKKw;
    }

    /* JADX INFO: renamed from: o.yDk$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.yDk.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }
}
