package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Kl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5249Kl extends C5242Ke {
    public java.lang.String djSkpj = "$identify";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C5242Ke
    public void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.djSkpj = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C5242Ke
    public java.lang.String copydefault() {
        return this.djSkpj;
    }
}
