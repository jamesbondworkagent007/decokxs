package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xMV {
    public C54536xML EZpvd;
    public java.lang.String KWHzl = "";
    public java.lang.String copydefault = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.copydefault;
    }

    public final xMV KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.KWHzl = str;
        this.copydefault = str2;
        this.EZpvd = new C54536xML();
        return this;
    }

    public final C54536xML copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C54536xML c54536xML = this.EZpvd;
        if (c54536xML != null) {
            c54536xML.OLrzqt(str, this.copydefault, this.KWHzl, "");
        }
        C54536xML c54536xML2 = this.EZpvd;
        if (c54536xML2 != null) {
            c54536xML2.djBIcL();
        }
        return this.EZpvd;
    }

    public final C54536xML OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C54536xML c54536xML = this.EZpvd;
        if (c54536xML != null) {
            c54536xML.OLrzqt(str, this.copydefault, this.KWHzl, "");
        }
        return this.EZpvd;
    }
}
