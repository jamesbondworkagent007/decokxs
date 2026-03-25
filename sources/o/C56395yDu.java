package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.spongycastle.asn1.cmc.BodyPartID;

/* JADX INFO: renamed from: o.yDu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56395yDu implements java.lang.Comparable<C56395yDu> {
    public static final Application OLrzqt = new Application(null);
    public final int AEQbTJ;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (r1v0 int) A[MD:(int):void (m)] call: o.yDu.<init>(int):void type: CONSTRUCTOR */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final /* synthetic */ C56395yDu AEQbTJ(int i) {
        return new C56395yDu(i);
    }

    public static int EZpvd(int i) {
        return i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean EZpvd(int i, java.lang.Object obj) {
        return (obj instanceof C56395yDu) && i == ((C56395yDu) obj).copydefault();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static int KWHzl(int i) {
        return java.lang.Integer.hashCode(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final /* synthetic */ int copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        return EZpvd(this.AEQbTJ, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return KWHzl(this.AEQbTJ);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(C56395yDu c56395yDu) {
        return C56399yDy.KWHzl(copydefault(), c56395yDu.copydefault());
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [o.yDu.AEQbTJ(int):o.yDu] */
    public /* synthetic */ C56395yDu(int i) {
        this.AEQbTJ = i;
    }

    /* JADX INFO: renamed from: o.yDu$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.yDu.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public static java.lang.String OLrzqt(int i) {
        return java.lang.String.valueOf(((long) i) & BodyPartID.bodyIdMax);
    }

    public java.lang.String toString() {
        return OLrzqt(this.AEQbTJ);
    }
}
