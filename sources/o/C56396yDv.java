package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: o.yDv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56396yDv implements java.lang.Comparable<C56396yDv> {
    public static final Activity AEQbTJ = new Activity(null);
    public final long EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static int AEQbTJ(long j) {
        return java.lang.Long.hashCode(j);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (r1v0 long) A[MD:(long):void (m)] call: o.yDv.<init>(long):void type: CONSTRUCTOR */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final /* synthetic */ C56396yDv KWHzl(long j) {
        return new C56396yDv(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean KWHzl(long j, java.lang.Object obj) {
        return (obj instanceof C56396yDv) && j == ((C56396yDv) obj).OLrzqt();
    }

    public static final boolean OLrzqt(long j, long j2) {
        return j == j2;
    }

    public static long copydefault(long j) {
        return j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final /* synthetic */ long OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        return KWHzl(this.EZpvd, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return AEQbTJ(this.EZpvd);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(C56396yDv c56396yDv) {
        return C56399yDy.AEQbTJ(OLrzqt(), c56396yDv.OLrzqt());
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [o.yDv.KWHzl(long):o.yDv] */
    public /* synthetic */ C56396yDv(long j) {
        this.EZpvd = j;
    }

    /* JADX INFO: renamed from: o.yDv$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.yDv.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public static java.lang.String EZpvd(long j) {
        return C56399yDy.OLrzqt(j, 10);
    }

    public java.lang.String toString() {
        return EZpvd(this.EZpvd);
    }
}
