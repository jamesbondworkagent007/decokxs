package o;

/* JADX INFO: renamed from: o.vWn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C50657vWn {
    public final int AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static int AEQbTJ(int i) {
        return java.lang.Integer.hashCode(i);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (r1v0 int) A[MD:(int):void (m)] call: o.vWn.<init>(int):void type: CONSTRUCTOR */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final /* synthetic */ C50657vWn EZpvd(int i) {
        return new C50657vWn(i);
    }

    public static int OLrzqt(int i) {
        return i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static java.lang.String copydefault(int i) {
        return "TimeIndex(value=" + i + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean copydefault(int i, java.lang.Object obj) {
        return (obj instanceof C50657vWn) && i == ((C50657vWn) obj).OLrzqt();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final /* synthetic */ int OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        return copydefault(this.AEQbTJ, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return AEQbTJ(this.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return copydefault(this.AEQbTJ);
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [o.vWn.EZpvd(int):o.vWn] */
    public /* synthetic */ C50657vWn(int i) {
        this.AEQbTJ = i;
    }
}
