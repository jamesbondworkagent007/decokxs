package o;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iOz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@yCR
public final class C23940iOz {
    public final iEY EZpvd;
    public final InterfaceC23589iBz copydefault;

    @yCM
    public C23940iOz(@NotNull InterfaceC23589iBz interfaceC23589iBz, @NotNull iEY iey) {
        Intrinsics.checkNotNullParameter(interfaceC23589iBz, "");
        Intrinsics.checkNotNullParameter(iey, "");
        this.copydefault = interfaceC23589iBz;
        this.EZpvd = iey;
    }

    public final iEM KWHzl() {
        return new iOE(this.copydefault, this.EZpvd);
    }

    public final C26541jeK copydefault() {
        return new C26541jeK(KWHzl(), Dispatchers.getIO());
    }
}
