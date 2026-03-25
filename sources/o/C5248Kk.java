package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Kk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5248Kk extends C5242Ke {
    public java.lang.String UeEOUB = "$groupidentify";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C5242Ke
    public void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.UeEOUB = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C5242Ke
    public java.lang.String copydefault() {
        return this.UeEOUB;
    }

    @Override // o.C5242Ke
    public boolean djBIcL() {
        return (KWHzl() == null || EZpvd() == null) ? false : true;
    }
}
