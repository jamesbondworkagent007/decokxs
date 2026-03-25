package o;

import java.util.regex.Pattern;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yXp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56930yXp {
    public static final C56935yXu AEQbTJ;
    public static final StateListAnimator KWHzl = new StateListAnimator(null);
    public static final Pattern copydefault;
    public transient C56933yXs AYXKKw;
    public transient C56935yXu AhwBna;
    public final java.lang.String EZpvd;
    public transient C56930yXp OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String), (r2v0 o.yXp), (r3v0 o.yXu) A[MD:(java.lang.String, o.yXp, o.yXu):void (m)] call: o.yXp.<init>(java.lang.String, o.yXp, o.yXu):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C56930yXp(java.lang.String str, C56930yXp c56930yXp, C56935yXu c56935yXu, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, c56930yXp, c56935yXu);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.EZpvd;
    }

    public C56930yXp(@NotNull java.lang.String str, @NotNull C56933yXs c56933yXs) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(c56933yXs, "");
        this.EZpvd = str;
        this.AYXKKw = c56933yXs;
    }

    public C56930yXp(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = str;
    }

    public C56930yXp(java.lang.String str, C56930yXp c56930yXp, C56935yXu c56935yXu) {
        this.EZpvd = str;
        this.OLrzqt = c56930yXp;
        this.AhwBna = c56935yXu;
    }

    public final void EZpvd() {
        int iOLrzqt = OLrzqt(this.EZpvd);
        if (iOLrzqt >= 0) {
            java.lang.String strSubstring = this.EZpvd.substring(iOLrzqt + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            this.AhwBna = C56935yXu.KWHzl(strSubstring);
            java.lang.String strSubstring2 = this.EZpvd.substring(0, iOLrzqt);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
            this.OLrzqt = new C56930yXp(strSubstring2);
            return;
        }
        this.AhwBna = C56935yXu.KWHzl(this.EZpvd);
        this.OLrzqt = C56933yXs.EZpvd.AYXKKw();
    }

    public final int OLrzqt(java.lang.String str) {
        int length = str.length() - 1;
        boolean z = false;
        while (length >= 0) {
            char cCharAt = str.charAt(length);
            if (cCharAt == '.' && !z) {
                return length;
            }
            if (cCharAt == '`') {
                z = !z;
            } else if (cCharAt == '\\') {
                length--;
            }
            length--;
        }
        return -1;
    }

    public final boolean copydefault() {
        return this.AYXKKw != null || StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) KWHzl(), '<', 0, false, 6, (java.lang.Object) null) < 0;
    }

    public final C56933yXs djBIcL() {
        C56933yXs c56933yXs = this.AYXKKw;
        if (c56933yXs != null) {
            return c56933yXs;
        }
        C56933yXs c56933yXs2 = new C56933yXs(this);
        this.AYXKKw = c56933yXs2;
        return c56933yXs2;
    }

    public final boolean OLrzqt() {
        return this.EZpvd.length() == 0;
    }

    public final C56930yXp AEQbTJ() {
        C56930yXp c56930yXp = this.OLrzqt;
        if (c56930yXp != null) {
            return c56930yXp;
        }
        if (!(!OLrzqt())) {
            throw new java.lang.IllegalStateException("root".toString());
        }
        EZpvd();
        C56930yXp c56930yXp2 = this.OLrzqt;
        Intrinsics.copydefault(c56930yXp2);
        return c56930yXp2;
    }

    public final C56930yXp AEQbTJ(@NotNull C56935yXu c56935yXu) {
        java.lang.String strAEQbTJ;
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        if (OLrzqt()) {
            strAEQbTJ = c56935yXu.AEQbTJ();
        } else {
            strAEQbTJ = this.EZpvd + '.' + c56935yXu.AEQbTJ();
        }
        Intrinsics.copydefault((java.lang.Object) strAEQbTJ);
        return new C56930yXp(strAEQbTJ, this, c56935yXu);
    }

    public final C56935yXu valueOf() {
        C56935yXu c56935yXu = this.AhwBna;
        if (c56935yXu != null) {
            return c56935yXu;
        }
        if (!(!OLrzqt())) {
            throw new java.lang.IllegalStateException("root".toString());
        }
        EZpvd();
        C56935yXu c56935yXu2 = this.AhwBna;
        Intrinsics.copydefault(c56935yXu2);
        return c56935yXu2;
    }

    public final C56935yXu AYXKKw() {
        return OLrzqt() ? AEQbTJ : valueOf();
    }

    public static final java.util.List<C56935yXu> copydefault(C56930yXp c56930yXp) {
        if (c56930yXp.OLrzqt()) {
            return new java.util.ArrayList();
        }
        java.util.List<C56935yXu> listCopydefault = copydefault(c56930yXp.AEQbTJ());
        listCopydefault.add(c56930yXp.valueOf());
        return listCopydefault;
    }

    public final java.util.List<C56935yXu> gEmmrt() {
        return copydefault(this);
    }

    public final boolean KWHzl(@NotNull C56935yXu c56935yXu) {
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        if (OLrzqt()) {
            return false;
        }
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) this.EZpvd, '.', 0, false, 6, (java.lang.Object) null);
        if (iIndexOf$default == -1) {
            iIndexOf$default = this.EZpvd.length();
        }
        int i = iIndexOf$default;
        java.lang.String strAEQbTJ = c56935yXu.AEQbTJ();
        Intrinsics.checkNotNullExpressionValue(strAEQbTJ, "");
        return i == strAEQbTJ.length() && C59449zhJ.regionMatches$default(this.EZpvd, 0, strAEQbTJ, 0, i, false, 16, (java.lang.Object) null);
    }

    public java.lang.String toString() {
        if (!OLrzqt()) {
            return this.EZpvd;
        }
        java.lang.String strAEQbTJ = AEQbTJ.AEQbTJ();
        Intrinsics.checkNotNullExpressionValue(strAEQbTJ, "");
        return strAEQbTJ;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C56930yXp) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) ((C56930yXp) obj).EZpvd);
    }

    public int hashCode() {
        return this.EZpvd.hashCode();
    }

    /* JADX INFO: renamed from: o.yXp$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.yXp.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C56930yXp copydefault(@NotNull C56935yXu c56935yXu) {
            Intrinsics.checkNotNullParameter(c56935yXu, "");
            java.lang.String strAEQbTJ = c56935yXu.AEQbTJ();
            Intrinsics.checkNotNullExpressionValue(strAEQbTJ, "");
            return new C56930yXp(strAEQbTJ, C56933yXs.EZpvd.AYXKKw(), c56935yXu, null);
        }
    }

    static {
        C56935yXu c56935yXuCopydefault = C56935yXu.copydefault("<root>");
        Intrinsics.checkNotNullExpressionValue(c56935yXuCopydefault, "");
        AEQbTJ = c56935yXuCopydefault;
        Pattern patternCompile = Pattern.compile("\\.");
        Intrinsics.checkNotNullExpressionValue(patternCompile, "");
        copydefault = patternCompile;
    }
}
