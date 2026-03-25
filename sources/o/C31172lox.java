package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: o.lox, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C31172lox {
    public final int OLrzqt;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = copydefault(0);
    public static final int EZpvd = copydefault(1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static int AEQbTJ(int i) {
        return java.lang.Integer.hashCode(i);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (r1v0 int) A[MD:(int):void (m)] call: o.lox.<init>(int):void type: CONSTRUCTOR */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final /* synthetic */ C31172lox KWHzl(int i) {
        return new C31172lox(i);
    }

    public static final boolean KWHzl(int i, int i2) {
        return i == i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean KWHzl(int i, java.lang.Object obj) {
        return (obj instanceof C31172lox) && i == ((C31172lox) obj).copydefault();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static java.lang.String OLrzqt(int i) {
        return "MemeUIStyle(value=" + i + ")";
    }

    public static int copydefault(int i) {
        return i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final /* synthetic */ int copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        return KWHzl(this.OLrzqt, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return AEQbTJ(this.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return OLrzqt(this.OLrzqt);
    }

    /* JADX INFO: renamed from: o.lox$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lox.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final int KWHzl() {
            return C31172lox.copydefault;
        }

        public final int OLrzqt() {
            return C31172lox.EZpvd;
        }

        public final int OLrzqt(int i) {
            if (i == 0) {
                return KWHzl();
            }
            if (i == 1) {
                return OLrzqt();
            }
            return KWHzl();
        }
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [o.lox.KWHzl(int):o.lox] */
    public /* synthetic */ C31172lox(int i) {
        this.OLrzqt = i;
    }
}
