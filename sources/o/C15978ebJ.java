package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ebJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C15978ebJ {
    public final byte[] EZpvd;
    public final byte[] copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final byte[] AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final byte[] OLrzqt() {
        return this.copydefault;
    }

    public C15978ebJ(@NotNull byte[] bArr, @NotNull byte[] bArr2) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(bArr2, "");
        this.copydefault = bArr;
        this.EZpvd = bArr2;
    }
}
