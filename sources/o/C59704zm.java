package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC59439zh;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C59704zm extends AbstractC59439zh.StateListAnimator {
    public final java.io.File AEQbTJ;
    public final long EZpvd;
    public final boolean KWHzl;
    public final long OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC59439zh
    public boolean copydefault() {
        return this.KWHzl;
    }

    public C59704zm(@NotNull java.io.File file, long j, long j2) {
        Intrinsics.checkNotNullParameter(file, "");
        this.AEQbTJ = file;
        this.OLrzqt = j;
        this.EZpvd = j2;
    }

    @Override // o.AbstractC59439zh
    public java.lang.Long OLrzqt() {
        return java.lang.Long.valueOf((this.EZpvd - this.OLrzqt) + 1);
    }

    @Override // o.AbstractC59439zh.StateListAnimator
    public InterfaceC5060De AEQbTJ() {
        return CK.KWHzl(this.AEQbTJ, this.OLrzqt, this.EZpvd);
    }
}
