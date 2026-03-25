package o;

import androidx.lifecycle.ViewModel;
import com.okinc.business.invest_biz.ui.screens.defi_dashboard.asset_details.AssetDetailsParams;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.iYR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public abstract class iYG extends ViewModel implements InterfaceC25524iyO {
    public final MutableStateFlow<iYR> KWHzl;
    public final StateFlow<iYR> gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<iYR> EZpvd() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableStateFlow<iYR> OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(@NotNull AssetDetailsParams assetDetailsParams) {
        Intrinsics.checkNotNullParameter(assetDetailsParams, "");
    }

    public iYG() {
        MutableStateFlow<iYR> MutableStateFlow = StateFlowKt.MutableStateFlow(iYR.StateListAnimator.copydefault);
        this.KWHzl = MutableStateFlow;
        this.gEmmrt = FlowKt.asStateFlow(MutableStateFlow);
    }
}
