package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import o.yMB;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yZB extends yZH<java.lang.Long> {
    public yZB(long j) {
        super(java.lang.Long.valueOf(j));
    }

    @Override // o.AbstractC56975yZg
    public AbstractC59233zdF OLrzqt(@NotNull yNP ynp) {
        AbstractC59242zdO abstractC59242zdOBQ_;
        Intrinsics.checkNotNullParameter(ynp, "");
        InterfaceC56658yNn interfaceC56658yNnCopydefault = yNE.copydefault(ynp, yMB.Application.RdAHlO);
        return (interfaceC56658yNnCopydefault == null || (abstractC59242zdOBQ_ = interfaceC56658yNnCopydefault.bQ_()) == null) ? C59370zfk.EZpvd(ErrorTypeKind.NOT_FOUND_UNSIGNED_TYPE, "ULong") : abstractC59242zdOBQ_;
    }

    @Override // o.AbstractC56975yZg
    public java.lang.String toString() {
        return KWHzl().longValue() + ".toULong()";
    }
}
