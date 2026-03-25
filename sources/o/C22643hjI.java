package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hjI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C22643hjI {
    public C22336hdT KWHzl = new C22336hdT("", null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C22336hdT KWHzl() {
        return this.KWHzl;
    }

    public void OLrzqt(@NotNull java.lang.String str, java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl.AEQbTJ(str);
        this.KWHzl.copydefault(list);
    }

    public void EZpvd() {
        this.KWHzl.copydefault(null);
        this.KWHzl.AEQbTJ("");
    }

    public java.util.List<java.lang.String> OLrzqt() {
        return KWHzl().copydefault();
    }

    public final java.lang.String copydefault(@NotNull java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        return str + str2;
    }
}
