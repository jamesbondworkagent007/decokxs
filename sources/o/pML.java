package o;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.InterfaceC8104awT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@yCR
public final class pML implements pMK {
    public final InterfaceC8104awT EZpvd;
    public final InterfaceC8106awV OLrzqt;
    public final InterfaceC8108awX copydefault;

    @yCM
    public pML(InterfaceC8108awX interfaceC8108awX, InterfaceC8106awV interfaceC8106awV, InterfaceC8104awT interfaceC8104awT) {
        this.copydefault = interfaceC8108awX;
        this.OLrzqt = interfaceC8106awV;
        this.EZpvd = interfaceC8104awT;
    }

    @Override // o.pMK
    public boolean KWHzl() {
        InterfaceC8108awX interfaceC8108awX = this.copydefault;
        if (interfaceC8108awX != null) {
            return interfaceC8108awX.EZpvd();
        }
        return false;
    }

    @Override // o.pMK
    public StateFlow<java.lang.Boolean> AEQbTJ() {
        StateFlow<java.lang.Boolean> stateFlowOLrzqt;
        InterfaceC8108awX interfaceC8108awX = this.copydefault;
        return (interfaceC8108awX == null || (stateFlowOLrzqt = interfaceC8108awX.OLrzqt()) == null) ? FlowKt.asStateFlow(StateFlowKt.MutableStateFlow(java.lang.Boolean.TRUE)) : stateFlowOLrzqt;
    }

    @Override // o.pMK
    public void OLrzqt(@NotNull android.content.Context context, boolean z) {
        Intrinsics.checkNotNullParameter(context, "");
        InterfaceC8106awV interfaceC8106awV = this.OLrzqt;
        if (interfaceC8106awV != null) {
            interfaceC8106awV.OLrzqt(context, z);
        }
    }

    @Override // o.pMK
    public void EZpvd(@NotNull android.content.Context context, boolean z) {
        Intrinsics.checkNotNullParameter(context, "");
        InterfaceC8104awT interfaceC8104awT = this.EZpvd;
        if (interfaceC8104awT != null) {
            InterfaceC8104awT.StateListAnimator.routeRegisterV2$default(interfaceC8104awT, context, null, z, 2, null);
        }
    }
}
