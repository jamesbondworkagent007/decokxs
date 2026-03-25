package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Mb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5291Mb implements java.lang.Comparable<C5291Mb> {
    public static final Application Companion = new Application(null);
    public final java.lang.String AEQbTJ;
    public final int EZpvd;
    public final int KWHzl;
    public final int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C5291Mb() {
        this(0, 0, 0, null, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C5291Mb copy$default(C5291Mb c5291Mb, int i, int i2, int i3, java.lang.String str, int i4, java.lang.Object obj) {
        if ((i4 & 1) != 0) {
            i = c5291Mb.EZpvd;
        }
        if ((i4 & 2) != 0) {
            i2 = c5291Mb.KWHzl;
        }
        if ((i4 & 4) != 0) {
            i3 = c5291Mb.copydefault;
        }
        if ((i4 & 8) != 0) {
            str = c5291Mb.AEQbTJ;
        }
        return c5291Mb.KWHzl(i, i2, i3, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5291Mb KWHzl(int i, int i2, int i3, java.lang.String str) {
        return new C5291Mb(i, i2, i3, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5291Mb)) {
            return false;
        }
        C5291Mb c5291Mb = (C5291Mb) obj;
        return this.EZpvd == c5291Mb.EZpvd && this.KWHzl == c5291Mb.KWHzl && this.copydefault == c5291Mb.copydefault && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c5291Mb.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = java.lang.Integer.hashCode(this.EZpvd);
        int iHashCode2 = java.lang.Integer.hashCode(this.KWHzl);
        int iHashCode3 = java.lang.Integer.hashCode(this.copydefault);
        java.lang.String str = this.AEQbTJ;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SemanticVersion(major=" + this.EZpvd + ", minor=" + this.KWHzl + ", patch=" + this.copydefault + ", preRelease=" + this.AEQbTJ + ')';
    }

    public C5291Mb(int i, int i2, int i3, java.lang.String str) {
        this.EZpvd = i;
        this.KWHzl = i2;
        this.copydefault = i3;
        this.AEQbTJ = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r2v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r4v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
 A[MD:(int, int, int, java.lang.String):void (m)] (LINE:27) call: o.Mb.<init>(int, int, int, java.lang.String):void type: THIS */
    public /* synthetic */ C5291Mb(int i, int i2, int i3, java.lang.String str, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3, (i4 & 8) != 0 ? null : str);
    }

    /* JADX INFO: renamed from: o.Mb$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.Mb.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C5291Mb copydefault(java.lang.String str) {
            MatchResult matchResultMatchEntire;
            java.util.List<java.lang.String> listOLrzqt;
            java.lang.Integer intOrNull;
            if (str != null && (matchResultMatchEntire = new Regex("(\\d+)\\.(\\d+)(\\.(\\d+)(-(([-\\w]+\\.?)*))?)?$").matchEntire(str)) != null && (listOLrzqt = matchResultMatchEntire.OLrzqt()) != null && (intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(listOLrzqt.get(1))) != null) {
                int iIntValue = intOrNull.intValue();
                java.lang.Integer intOrNull2 = StringsKt__StringNumberConversionsKt.toIntOrNull(listOLrzqt.get(2));
                if (intOrNull2 != null) {
                    int iIntValue2 = intOrNull2.intValue();
                    java.lang.Integer intOrNull3 = StringsKt__StringNumberConversionsKt.toIntOrNull(listOLrzqt.get(4));
                    int iIntValue3 = intOrNull3 != null ? intOrNull3.intValue() : 0;
                    java.lang.String str2 = listOLrzqt.get(5);
                    return new C5291Mb(iIntValue, iIntValue2, iIntValue3, str2.length() > 0 ? str2 : null);
                }
            }
            return null;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NotNull C5291Mb c5291Mb) {
        java.lang.String str;
        java.lang.String str2;
        Intrinsics.checkNotNullParameter(c5291Mb, "");
        int i = this.EZpvd;
        int i2 = c5291Mb.EZpvd;
        if (i <= i2) {
            if (i >= i2) {
                int i3 = this.KWHzl;
                int i4 = c5291Mb.KWHzl;
                if (i3 <= i4) {
                    if (i3 >= i4) {
                        int i5 = this.copydefault;
                        int i6 = c5291Mb.copydefault;
                        if (i5 <= i6) {
                            if (i5 >= i6 && ((str = this.AEQbTJ) == null || c5291Mb.AEQbTJ != null)) {
                                if (str != null || c5291Mb.AEQbTJ == null) {
                                    if (str == null || (str2 = c5291Mb.AEQbTJ) == null) {
                                        return 0;
                                    }
                                    return str.compareTo(str2);
                                }
                            }
                        }
                    }
                }
            }
            return -1;
        }
        return 1;
    }
}
