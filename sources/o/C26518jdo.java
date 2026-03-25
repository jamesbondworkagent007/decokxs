package o;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.invest_biz.ui.screens.home.container.InvestHomeContainerVM$notifyWalletChange$1;
import com.okinc.business.invest_biz.ui.screens.home.container.InvestHomeContainerVM$toggleSearchVisibility$1;
import kotlin.Unit;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: renamed from: o.jdo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C26518jdo extends ViewModel {
    public final SharedFlow<Unit> AEQbTJ;
    public final MutableSharedFlow<Unit> EZpvd;
    public final StateFlow<java.lang.Boolean> KWHzl;
    public final MutableStateFlow<java.lang.Boolean> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<java.lang.Boolean> copydefault() {
        return this.KWHzl;
    }

    @yCM
    public C26518jdo() {
        MutableStateFlow<java.lang.Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(java.lang.Boolean.TRUE);
        this.OLrzqt = MutableStateFlow;
        this.KWHzl = FlowKt.asStateFlow(MutableStateFlow);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.EZpvd = mutableSharedFlowMutableSharedFlow$default;
        this.AEQbTJ = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
    }

    public final void KWHzl(boolean z) {
        C27493jwI.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new InvestHomeContainerVM$toggleSearchVisibility$1(this, z, null), 3, null);
    }

    public final void KWHzl() {
        C27493jwI.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new InvestHomeContainerVM$notifyWalletChange$1(this, null), 3, null);
    }
}
