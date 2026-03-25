package o;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.defi.biz.net.bean.EIP7702ChainStatusResp;
import com.okinc.business.defi.wallet.eip7702.ui.viewmodel.EIP7702UpgradeViewModel$init$1;
import com.okinc.business.defi.wallet.eip7702.ui.viewmodel.EIP7702UpgradeViewModel$refreshChainStatus$1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class eCH extends ViewModel {
    public final MutableSharedFlow<EIP7702ChainStatusResp.ChainStatusItem> AEQbTJ;
    public java.lang.String AYXKKw;
    public final SharedFlow<EIP7702ChainStatusResp.ChainStatusItem> EZpvd;
    public EIP7702ChainStatusResp.ChainStatusItem KWHzl;
    public final C15272eCe OLrzqt;
    public java.lang.Long copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<EIP7702ChainStatusResp.ChainStatusItem> copydefault() {
        return this.EZpvd;
    }

    public eCH(@NotNull C15272eCe c15272eCe) {
        Intrinsics.checkNotNullParameter(c15272eCe, "");
        this.OLrzqt = c15272eCe;
        MutableSharedFlow<EIP7702ChainStatusResp.ChainStatusItem> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.AEQbTJ = mutableSharedFlowMutableSharedFlow$default;
        this.EZpvd = mutableSharedFlowMutableSharedFlow$default;
    }

    public final void EZpvd(@NotNull java.lang.String str, long j, @NotNull EIP7702ChainStatusResp.ChainStatusItem chainStatusItem) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(chainStatusItem, "");
        this.AYXKKw = str;
        this.copydefault = java.lang.Long.valueOf(j);
        this.KWHzl = chainStatusItem;
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new EIP7702UpgradeViewModel$init$1(this, chainStatusItem, null), 3, null);
    }

    public final Job KWHzl() {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new EIP7702UpgradeViewModel$refreshChainStatus$1(this, null), 3, null);
    }
}
