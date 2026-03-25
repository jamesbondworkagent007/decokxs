package o;

import java.security.MessageDigest;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C60243zz extends AbstractC58428zC {
    public final MessageDigest EZpvd = MessageDigest.getInstance("SHA-256");

    @Override // o.InterfaceC59908zr
    public void copydefault(@NotNull byte[] bArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(bArr, "");
        this.EZpvd.update(bArr, i, i2);
    }

    @Override // o.InterfaceC59908zr
    public byte[] AEQbTJ() {
        byte[] bArrDigest = this.EZpvd.digest();
        Intrinsics.checkNotNullExpressionValue(bArrDigest, "");
        return bArrDigest;
    }

    @Override // o.InterfaceC59908zr
    public void EZpvd() {
        this.EZpvd.reset();
    }
}
