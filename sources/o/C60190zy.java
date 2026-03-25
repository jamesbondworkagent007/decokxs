package o;

import java.security.MessageDigest;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C60190zy extends AbstractC60137zx {
    public final MessageDigest AEQbTJ = MessageDigest.getInstance("SHA-1");

    @Override // o.InterfaceC59908zr
    public void copydefault(@NotNull byte[] bArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(bArr, "");
        this.AEQbTJ.update(bArr, i, i2);
    }

    @Override // o.InterfaceC59908zr
    public byte[] AEQbTJ() {
        byte[] bArrDigest = this.AEQbTJ.digest();
        Intrinsics.checkNotNullExpressionValue(bArrDigest, "");
        return bArrDigest;
    }

    @Override // o.InterfaceC59908zr
    public void EZpvd() {
        this.AEQbTJ.reset();
    }
}
