package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yTy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56831yTy {
    public static /* synthetic */ C56829yTw toAttributes$default(TypeUsage typeUsage, boolean z, boolean z2, InterfaceC56691yOt interfaceC56691yOt, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        if ((i & 4) != 0) {
            interfaceC56691yOt = null;
        }
        return copydefault(typeUsage, z, z2, interfaceC56691yOt);
    }

    public static final C56829yTw copydefault(@NotNull TypeUsage typeUsage, boolean z, boolean z2, InterfaceC56691yOt interfaceC56691yOt) {
        Intrinsics.checkNotNullParameter(typeUsage, "");
        return new C56829yTw(typeUsage, null, z2, z, interfaceC56691yOt != null ? yED.AEQbTJ(interfaceC56691yOt) : null, null, 34, null);
    }
}
