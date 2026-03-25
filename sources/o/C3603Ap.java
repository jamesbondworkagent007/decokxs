package o;

import kotlin.jvm.internal.Intrinsics;
import o.zP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Ap, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3603Ap extends zP.TaskDescription {
    public final byte[] OLrzqt;
    public final long copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.zP.TaskDescription
    public byte[] OLrzqt() {
        return this.OLrzqt;
    }

    public C3603Ap(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        this.OLrzqt = bArr;
        this.copydefault = bArr.length;
    }

    @Override // o.zP
    public java.lang.Long AEQbTJ() {
        return java.lang.Long.valueOf(this.copydefault);
    }
}
