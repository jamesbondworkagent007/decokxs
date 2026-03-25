package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ySd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56783ySd extends C56788ySi {
    public final InterfaceC56687yOp AxsJAY;
    public final InterfaceC56676yOe wlaJM;
    public final InterfaceC56687yOp zsXlph;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56783ySd(@NotNull InterfaceC56658yNn interfaceC56658yNn, @NotNull InterfaceC56687yOp interfaceC56687yOp, InterfaceC56687yOp interfaceC56687yOp2, @NotNull InterfaceC56676yOe interfaceC56676yOe) {
        super(interfaceC56658yNn, yOL.KWHzl.OLrzqt(), interfaceC56687yOp.isConnected(), interfaceC56687yOp.getNewProxyInstance(), interfaceC56687yOp2 != null, interfaceC56676yOe.bR_(), interfaceC56687yOp.fARcdN(), null, CallableMemberDescriptor.Kind.DECLARATION, false, null);
        Intrinsics.checkNotNullParameter(interfaceC56658yNn, "");
        Intrinsics.checkNotNullParameter(interfaceC56687yOp, "");
        Intrinsics.checkNotNullParameter(interfaceC56676yOe, "");
        this.zsXlph = interfaceC56687yOp;
        this.AxsJAY = interfaceC56687yOp2;
        this.wlaJM = interfaceC56676yOe;
    }
}
