package o;

import java.util.zip.CRC32;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C59598zk extends AbstractC59918zs {
    public final CRC32 copydefault = new CRC32();

    @Override // o.InterfaceC59908zr
    public void copydefault(@NotNull byte[] bArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(bArr, "");
        this.copydefault.update(bArr, i, i2);
    }

    @Override // o.AbstractC59918zs
    public int OLrzqt() {
        return C56395yDu.EZpvd((int) this.copydefault.getValue());
    }

    @Override // o.InterfaceC59908zr
    public void EZpvd() {
        this.copydefault.reset();
    }
}
