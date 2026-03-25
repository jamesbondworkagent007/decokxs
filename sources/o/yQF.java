package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yQF extends AbstractC56740yQo implements yTV {
    public final java.lang.Enum<?> AEQbTJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yQF(C56935yXu c56935yXu, @NotNull java.lang.Enum<?> r3) {
        super(c56935yXu, null);
        Intrinsics.checkNotNullParameter(r3, "");
        this.AEQbTJ = r3;
    }

    @Override // o.yTV
    public C56929yXo EZpvd() {
        java.lang.Class<?> enclosingClass = this.AEQbTJ.getClass();
        if (!enclosingClass.isEnum()) {
            enclosingClass = enclosingClass.getEnclosingClass();
        }
        Intrinsics.copydefault(enclosingClass);
        return C56743yQr.AEQbTJ(enclosingClass);
    }

    @Override // o.yTV
    public C56935yXu OLrzqt() {
        return C56935yXu.AEQbTJ(this.AEQbTJ.name());
    }
}
