package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rlJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43224rlJ implements InterfaceC43234rlT {
    public final InterfaceC56387yDm<InterfaceC43234rlT> OLrzqt;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: o.yDm<? extends o.rlT> */
    /* JADX WARN: Multi-variable type inference failed */
    public C43224rlJ(@NotNull InterfaceC56387yDm<? extends InterfaceC43234rlT> interfaceC56387yDm) {
        Intrinsics.checkNotNullParameter(interfaceC56387yDm, "");
        this.OLrzqt = interfaceC56387yDm;
    }

    @Override // o.InterfaceC43234rlT
    public void OLrzqt(@NotNull android.content.Context context, @NotNull InterfaceC43233rlS interfaceC43233rlS, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43233rlS, "");
        Intrinsics.checkNotNullParameter(map, "");
        InterfaceComponentCallbacks2C43266rlz interfaceComponentCallbacks2C43266rlzOLrzqt = C43226rlL.Companion.OLrzqt(interfaceC43233rlS);
        if (interfaceComponentCallbacks2C43266rlzOLrzqt != null) {
            interfaceComponentCallbacks2C43266rlzOLrzqt.doOnCreate();
        }
        this.OLrzqt.getValue().OLrzqt(context, interfaceC43233rlS, map);
    }
}
