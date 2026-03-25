package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class UnsupportedEncodingException {
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ UnsupportedEncodingException copy$default(UnsupportedEncodingException unsupportedEncodingException, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = unsupportedEncodingException.OLrzqt;
        }
        if ((i & 2) != 0) {
            str2 = unsupportedEncodingException.copydefault;
        }
        return unsupportedEncodingException.OLrzqt(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UnsupportedEncodingException OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new UnsupportedEncodingException(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnsupportedEncodingException)) {
            return false;
        }
        UnsupportedEncodingException unsupportedEncodingException = (UnsupportedEncodingException) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) unsupportedEncodingException.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) unsupportedEncodingException.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.OLrzqt.hashCode() * 31) + this.copydefault.hashCode();
    }

    public UnsupportedEncodingException(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.OLrzqt = str;
        this.copydefault = str2;
    }

    public java.lang.String toString() {
        java.lang.String str = this.OLrzqt;
        java.lang.String str2 = this.copydefault;
        if (C59449zhJ.gEmmrt(str2, "true", true)) {
            str2 = null;
        }
        return Reader.AEQbTJ("cfg", str, str2);
    }
}
