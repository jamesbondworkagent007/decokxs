package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.resolve.deprecation.DeprecationLevelValue;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yRj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56762yRj extends yZG {
    public final InterfaceC56665yNu OLrzqt;

    public C56762yRj(@NotNull InterfaceC56665yNu interfaceC56665yNu) {
        Intrinsics.checkNotNullParameter(interfaceC56665yNu, "");
        this.OLrzqt = interfaceC56665yNu;
    }

    @Override // o.yZI
    public DeprecationLevelValue copydefault() {
        return DeprecationLevelValue.ERROR;
    }
}
