package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zdr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59271zdr {
    public static /* synthetic */ InterfaceC59317zek computeProjection$default(C59271zdr c59271zdr, InterfaceC56691yOt interfaceC56691yOt, C59274zdu c59274zdu, C59320zen c59320zen, AbstractC59233zdF abstractC59233zdF, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: computeProjection");
        }
        if ((i & 8) != 0) {
            abstractC59233zdF = c59320zen.AEQbTJ(interfaceC56691yOt, c59274zdu);
        }
        return c59271zdr.OLrzqt(interfaceC56691yOt, c59274zdu, c59320zen, abstractC59233zdF);
    }

    public InterfaceC59317zek OLrzqt(@NotNull InterfaceC56691yOt interfaceC56691yOt, @NotNull C59274zdu c59274zdu, @NotNull C59320zen c59320zen, @NotNull AbstractC59233zdF abstractC59233zdF) {
        Intrinsics.checkNotNullParameter(interfaceC56691yOt, "");
        Intrinsics.checkNotNullParameter(c59274zdu, "");
        Intrinsics.checkNotNullParameter(c59320zen, "");
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        return new C59323zeq(Variance.OUT_VARIANCE, abstractC59233zdF);
    }
}
