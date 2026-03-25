package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Kn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5251Kn extends C5242Ke {
    public java.lang.String aKErDB = "revenue_amount";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C5242Ke
    public void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.aKErDB = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C5242Ke
    public java.lang.String copydefault() {
        return this.aKErDB;
    }
}
