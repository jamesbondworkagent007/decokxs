package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kZq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28390kZq {
    public final kYC copydefault;

    @yCM
    public C28390kZq(@NotNull kYC kyc) {
        Intrinsics.checkNotNullParameter(kyc, "");
        this.copydefault = kyc;
    }

    public final AbstractC58185ywX<C9860bdZ> copydefault() {
        return this.copydefault.copydefault(java.lang.String.valueOf(java.lang.System.currentTimeMillis()));
    }
}
