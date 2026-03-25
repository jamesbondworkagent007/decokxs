package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import o.yMB;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yZz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56994yZz extends yZH<java.lang.Byte> {
    public C56994yZz(byte b) {
        super(java.lang.Byte.valueOf(b));
    }

    @Override // o.AbstractC56975yZg
    public AbstractC59233zdF OLrzqt(@NotNull yNP ynp) {
        AbstractC59242zdO abstractC59242zdOBQ_;
        Intrinsics.checkNotNullParameter(ynp, "");
        InterfaceC56658yNn interfaceC56658yNnCopydefault = yNE.copydefault(ynp, yMB.Application.DCUTEI);
        return (interfaceC56658yNnCopydefault == null || (abstractC59242zdOBQ_ = interfaceC56658yNnCopydefault.bQ_()) == null) ? C59370zfk.EZpvd(ErrorTypeKind.NOT_FOUND_UNSIGNED_TYPE, "UByte") : abstractC59242zdOBQ_;
    }

    @Override // o.AbstractC56975yZg
    public java.lang.String toString() {
        return KWHzl().intValue() + ".toUByte()";
    }
}
