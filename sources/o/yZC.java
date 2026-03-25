package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import o.yMB;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yZC extends yZH<java.lang.Short> {
    public yZC(short s) {
        super(java.lang.Short.valueOf(s));
    }

    @Override // o.AbstractC56975yZg
    public AbstractC59233zdF OLrzqt(@NotNull yNP ynp) {
        AbstractC59242zdO abstractC59242zdOBQ_;
        Intrinsics.checkNotNullParameter(ynp, "");
        InterfaceC56658yNn interfaceC56658yNnCopydefault = yNE.copydefault(ynp, yMB.Application.dmfpNf);
        return (interfaceC56658yNnCopydefault == null || (abstractC59242zdOBQ_ = interfaceC56658yNnCopydefault.bQ_()) == null) ? C59370zfk.EZpvd(ErrorTypeKind.NOT_FOUND_UNSIGNED_TYPE, "UShort") : abstractC59242zdOBQ_;
    }

    @Override // o.AbstractC56975yZg
    public java.lang.String toString() {
        return KWHzl().intValue() + ".toUShort()";
    }
}
