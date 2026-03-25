package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C59863zp extends AbstractC59918zs {
    public final C59810zo copydefault = new C59810zo();

    @Override // o.InterfaceC59908zr
    public void copydefault(@NotNull byte[] bArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(bArr, "");
        this.copydefault.KWHzl(bArr, i, i2);
    }

    @Override // o.AbstractC59918zs
    public int OLrzqt() {
        return C56395yDu.EZpvd(this.copydefault.OLrzqt());
    }

    @Override // o.InterfaceC59908zr
    public void EZpvd() {
        this.copydefault.EZpvd();
    }
}
