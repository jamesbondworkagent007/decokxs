package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rlI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43223rlI implements InterfaceC43236rlV {
    public final InterfaceC56387yDm<InterfaceC43236rlV> copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: o.yDm<? extends o.rlV> */
    /* JADX WARN: Multi-variable type inference failed */
    public C43223rlI(@NotNull InterfaceC56387yDm<? extends InterfaceC43236rlV> interfaceC56387yDm) {
        Intrinsics.checkNotNullParameter(interfaceC56387yDm, "");
        this.copydefault = interfaceC56387yDm;
    }

    @Override // o.InterfaceC43236rlV
    public void KWHzl(@NotNull android.content.Context context, @NotNull InterfaceC43232rlR interfaceC43232rlR, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43232rlR, "");
        Intrinsics.checkNotNullParameter(map, "");
        InterfaceComponentCallbacks2C43266rlz interfaceComponentCallbacks2C43266rlzAEQbTJ = C43226rlL.Companion.AEQbTJ(interfaceC43232rlR);
        if (interfaceComponentCallbacks2C43266rlzAEQbTJ != null) {
            interfaceComponentCallbacks2C43266rlzAEQbTJ.doOnCreate();
        }
        this.copydefault.getValue().KWHzl(context, interfaceC43232rlR, map);
    }
}
