package o;

import java.security.MessageDigest;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C60077zv extends AbstractC60119zw {
    public final MessageDigest copydefault = MessageDigest.getInstance("MD5");

    @Override // o.InterfaceC59908zr
    public void copydefault(@NotNull byte[] bArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(bArr, "");
        this.copydefault.update(bArr, i, i2);
    }

    @Override // o.InterfaceC59908zr
    public byte[] AEQbTJ() {
        byte[] bArrDigest = this.copydefault.digest();
        Intrinsics.checkNotNullExpressionValue(bArrDigest, "");
        return bArrDigest;
    }

    @Override // o.InterfaceC59908zr
    public void EZpvd() {
        this.copydefault.reset();
    }
}
