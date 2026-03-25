package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pSz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C38281pSz {
    public java.lang.String AEQbTJ;
    public boolean EZpvd;
    public java.util.Locale OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C38281pSz copy$default(C38281pSz c38281pSz, java.lang.String str, java.util.Locale locale, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c38281pSz.AEQbTJ;
        }
        if ((i & 2) != 0) {
            locale = c38281pSz.OLrzqt;
        }
        if ((i & 4) != 0) {
            z = c38281pSz.EZpvd;
        }
        return c38281pSz.KWHzl(str, locale, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C38281pSz KWHzl(@NotNull java.lang.String str, java.util.Locale locale, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        return new C38281pSz(str, locale, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38281pSz)) {
            return false;
        }
        C38281pSz c38281pSz = (C38281pSz) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c38281pSz.AEQbTJ) && Intrinsics.EZpvd(this.OLrzqt, c38281pSz.OLrzqt) && this.EZpvd == c38281pSz.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AEQbTJ.hashCode();
        java.util.Locale locale = this.OLrzqt;
        return (((iHashCode * 31) + (locale == null ? 0 : locale.hashCode())) * 31) + java.lang.Boolean.hashCode(this.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SupportLangBean(lang=" + this.AEQbTJ + ", locale=" + this.OLrzqt + ", isDefaultItem=" + this.EZpvd + ")";
    }

    public C38281pSz(@NotNull java.lang.String str, java.util.Locale locale, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = str;
        this.OLrzqt = locale;
        this.EZpvd = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 java.util.Locale)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
 A[MD:(java.lang.String, java.util.Locale, boolean):void (m)] (LINE:12) call: o.pSz.<init>(java.lang.String, java.util.Locale, boolean):void type: THIS */
    public /* synthetic */ C38281pSz(java.lang.String str, java.util.Locale locale, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, locale, (i & 4) != 0 ? false : z);
    }
}
