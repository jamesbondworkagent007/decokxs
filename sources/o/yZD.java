package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import o.yMB;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yZD extends yZH<java.lang.Integer> {
    public yZD(int i) {
        super(java.lang.Integer.valueOf(i));
    }

    @Override // o.AbstractC56975yZg
    public AbstractC59233zdF OLrzqt(@NotNull yNP ynp) {
        AbstractC59242zdO abstractC59242zdOBQ_;
        Intrinsics.checkNotNullParameter(ynp, "");
        InterfaceC56658yNn interfaceC56658yNnCopydefault = yNE.copydefault(ynp, yMB.Application.OBJEWx);
        return (interfaceC56658yNnCopydefault == null || (abstractC59242zdOBQ_ = interfaceC56658yNnCopydefault.bQ_()) == null) ? C59370zfk.EZpvd(ErrorTypeKind.NOT_FOUND_UNSIGNED_TYPE, "UInt") : abstractC59242zdOBQ_;
    }

    @Override // o.AbstractC56975yZg
    public java.lang.String toString() {
        return KWHzl().intValue() + ".toUInt()";
    }
}
