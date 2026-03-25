package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bdp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9876bdp extends C9785bcD {
    public final java.lang.String AEQbTJ;
    public final java.lang.String KWHzl;
    public final boolean OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9876bdp(boolean z, boolean z2, @NotNull java.lang.String str, java.lang.String str2) {
        super(z, false);
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = z2;
        this.KWHzl = str;
        this.AEQbTJ = str2;
    }
}
