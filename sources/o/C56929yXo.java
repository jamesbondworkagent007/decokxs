package o;

import com.fasterxml.jackson.core.JsonPointer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yXo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56929yXo {
    public static final ActionBar AEQbTJ = new ActionBar(null);
    public final C56933yXs EZpvd;
    public final C56933yXs OLrzqt;
    public final boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final C56929yXo copydefault(@NotNull C56933yXs c56933yXs) {
        return AEQbTJ.KWHzl(c56933yXs);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AhwBna() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56933yXs OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56933yXs copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C56929yXo)) {
            return false;
        }
        C56929yXo c56929yXo = (C56929yXo) obj;
        return Intrinsics.EZpvd(this.OLrzqt, c56929yXo.OLrzqt) && Intrinsics.EZpvd(this.EZpvd, c56929yXo.EZpvd) && this.copydefault == c56929yXo.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.OLrzqt.hashCode() * 31) + this.EZpvd.hashCode()) * 31) + java.lang.Boolean.hashCode(this.copydefault);
    }

    public C56929yXo(@NotNull C56933yXs c56933yXs, @NotNull C56933yXs c56933yXs2, boolean z) {
        Intrinsics.checkNotNullParameter(c56933yXs, "");
        Intrinsics.checkNotNullParameter(c56933yXs2, "");
        this.OLrzqt = c56933yXs;
        this.EZpvd = c56933yXs2;
        this.copydefault = z;
        c56933yXs2.AEQbTJ();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C56929yXo(@NotNull C56933yXs c56933yXs, @NotNull C56935yXu c56935yXu) {
        this(c56933yXs, C56933yXs.OLrzqt.KWHzl(c56935yXu), false);
        Intrinsics.checkNotNullParameter(c56933yXs, "");
        Intrinsics.checkNotNullParameter(c56935yXu, "");
    }

    public final C56935yXu AYXKKw() {
        return this.EZpvd.OLrzqt();
    }

    public final C56929yXo KWHzl() {
        C56933yXs c56933yXsEZpvd = this.EZpvd.EZpvd();
        if (!c56933yXsEZpvd.AEQbTJ()) {
            return new C56929yXo(this.OLrzqt, c56933yXsEZpvd, this.copydefault);
        }
        return null;
    }

    public final boolean valueOf() {
        return !this.EZpvd.EZpvd().AEQbTJ();
    }

    public final C56929yXo EZpvd(@NotNull C56935yXu c56935yXu) {
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        return new C56929yXo(this.OLrzqt, this.EZpvd.KWHzl(c56935yXu), this.copydefault);
    }

    public final C56933yXs AEQbTJ() {
        if (this.OLrzqt.AEQbTJ()) {
            return this.EZpvd;
        }
        return new C56933yXs(this.OLrzqt.KWHzl() + '.' + this.EZpvd.KWHzl());
    }

    public static final java.lang.String OLrzqt(C56933yXs c56933yXs) {
        java.lang.String strKWHzl = c56933yXs.KWHzl();
        if (!StringsKt__StringsKt.contains$default((java.lang.CharSequence) strKWHzl, JsonPointer.SEPARATOR, false, 2, (java.lang.Object) null)) {
            return strKWHzl;
        }
        return '`' + strKWHzl + '`';
    }

    public final java.lang.String EZpvd() {
        if (this.OLrzqt.AEQbTJ()) {
            return OLrzqt(this.EZpvd);
        }
        return C59449zhJ.replace$default(this.OLrzqt.KWHzl(), '.', JsonPointer.SEPARATOR, false, 4, (java.lang.Object) null) + "/" + OLrzqt(this.EZpvd);
    }

    public java.lang.String toString() {
        if (!this.OLrzqt.AEQbTJ()) {
            return EZpvd();
        }
        return JsonPointer.SEPARATOR + EZpvd();
    }

    /* JADX INFO: renamed from: o.yXo$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.yXo.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C56929yXo KWHzl(@NotNull C56933yXs c56933yXs) {
            Intrinsics.checkNotNullParameter(c56933yXs, "");
            return new C56929yXo(c56933yXs.EZpvd(), c56933yXs.OLrzqt());
        }

        public static /* synthetic */ C56929yXo fromString$default(ActionBar actionBar, java.lang.String str, boolean z, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return actionBar.copydefault(str, z);
        }

        public final C56929yXo copydefault(@NotNull java.lang.String str, boolean z) {
            java.lang.String strReplace$default;
            java.lang.String str2 = "";
            Intrinsics.checkNotNullParameter(str, "");
            int iIndexOf$default = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) str, '`', 0, false, 6, (java.lang.Object) null);
            if (iIndexOf$default == -1) {
                iIndexOf$default = str.length();
            }
            int iLastIndexOf$default = StringsKt__StringsKt.lastIndexOf$default((java.lang.CharSequence) str, "/", iIndexOf$default, false, 4, (java.lang.Object) null);
            if (iLastIndexOf$default == -1) {
                strReplace$default = C59449zhJ.replace$default(str, "`", "", false, 4, (java.lang.Object) null);
            } else {
                java.lang.String strSubstring = str.substring(0, iLastIndexOf$default);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                java.lang.String strReplace$default2 = C59449zhJ.replace$default(strSubstring, JsonPointer.SEPARATOR, '.', false, 4, (java.lang.Object) null);
                java.lang.String strSubstring2 = str.substring(iLastIndexOf$default + 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
                strReplace$default = C59449zhJ.replace$default(strSubstring2, "`", "", false, 4, (java.lang.Object) null);
                str2 = strReplace$default2;
            }
            return new C56929yXo(new C56933yXs(str2), new C56933yXs(strReplace$default), z);
        }
    }
}
