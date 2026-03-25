package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yQz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56751yQz extends AbstractC56740yQo implements yTR {
    public final java.lang.Class<?> EZpvd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56751yQz(C56935yXu c56935yXu, @NotNull java.lang.Class<?> cls) {
        super(c56935yXu, null);
        Intrinsics.checkNotNullParameter(cls, "");
        this.EZpvd = cls;
    }

    @Override // o.yTR
    public InterfaceC56839yUf OLrzqt() {
        return yQN.AYXKKw.EZpvd(this.EZpvd);
    }
}
