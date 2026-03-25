package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.hpke.HPKE;

/* JADX INFO: loaded from: classes13.dex */
public final class yDB implements java.lang.Comparable<yDB> {
    public static final Application OLrzqt = new Application(null);
    public final short EZpvd;

    public static short AEQbTJ(short s) {
        return s;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (r1v0 short) A[MD:(short):void (m)] call: o.yDB.<init>(short):void type: CONSTRUCTOR */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final /* synthetic */ yDB EZpvd(short s) {
        return new yDB(s);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static int OLrzqt(short s) {
        return java.lang.Short.hashCode(s);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean OLrzqt(short s, java.lang.Object obj) {
        return (obj instanceof yDB) && s == ((yDB) obj).EZpvd();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final /* synthetic */ short EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        return OLrzqt(this.EZpvd, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return OLrzqt(this.EZpvd);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(yDB ydb) {
        return Intrinsics.copydefault(EZpvd() & HPKE.aead_EXPORT_ONLY, ydb.EZpvd() & HPKE.aead_EXPORT_ONLY);
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [o.yDB.EZpvd(short):o.yDB] */
    public /* synthetic */ yDB(short s) {
        this.EZpvd = s;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.yDB.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public static java.lang.String KWHzl(short s) {
        return java.lang.String.valueOf(s & HPKE.aead_EXPORT_ONLY);
    }

    public java.lang.String toString() {
        return KWHzl(this.EZpvd);
    }
}
