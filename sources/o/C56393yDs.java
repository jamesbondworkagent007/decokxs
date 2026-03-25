package o;

import com.google.common.primitives.UnsignedBytes;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.yDs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56393yDs implements java.lang.Comparable<C56393yDs> {
    public static final Application OLrzqt = new Application(null);
    public final byte EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static int EZpvd(byte b) {
        return java.lang.Byte.hashCode(b);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (r1v0 byte) A[MD:(byte):void (m)] call: o.yDs.<init>(byte):void type: CONSTRUCTOR */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final /* synthetic */ C56393yDs OLrzqt(byte b) {
        return new C56393yDs(b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean OLrzqt(byte b, java.lang.Object obj) {
        return (obj instanceof C56393yDs) && b == ((C56393yDs) obj).OLrzqt();
    }

    public static byte copydefault(byte b) {
        return b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final /* synthetic */ byte OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        return OLrzqt(this.EZpvd, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return EZpvd(this.EZpvd);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(C56393yDs c56393yDs) {
        return Intrinsics.copydefault(OLrzqt() & UnsignedBytes.MAX_VALUE, c56393yDs.OLrzqt() & UnsignedBytes.MAX_VALUE);
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [o.yDs.OLrzqt(byte):o.yDs] */
    public /* synthetic */ C56393yDs(byte b) {
        this.EZpvd = b;
    }

    /* JADX INFO: renamed from: o.yDs$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.yDs.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public static java.lang.String AEQbTJ(byte b) {
        return java.lang.String.valueOf(b & UnsignedBytes.MAX_VALUE);
    }

    public java.lang.String toString() {
        return AEQbTJ(this.EZpvd);
    }
}
