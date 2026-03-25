package o;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.im.imui.broadcastmessages.messagelist.BroadcastMessageListFragmentShareViewModel$dispatchMessagesEvent$1;
import com.okinc.im.imui.broadcastmessages.messagelist.BroadcastMessageListFragmentShareViewModel$dispatchRetryMessageEvent$1;
import com.okinc.okimcore.model.im.OKMessage;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nvI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C35431nvI extends ViewModel {
    public final SharedFlow<kotlin.Pair<java.util.List<OKMessage>, java.lang.Boolean>> AEQbTJ;
    public final SharedFlow<OKMessage> KWHzl;
    public final MutableSharedFlow<OKMessage> OLrzqt;
    public final MutableSharedFlow<kotlin.Pair<java.util.List<OKMessage>, java.lang.Boolean>> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<OKMessage> EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<kotlin.Pair<java.util.List<OKMessage>, java.lang.Boolean>> OLrzqt() {
        return this.AEQbTJ;
    }

    public C35431nvI() {
        MutableSharedFlow<kotlin.Pair<java.util.List<OKMessage>, java.lang.Boolean>> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.copydefault = mutableSharedFlowMutableSharedFlow$default;
        this.AEQbTJ = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableSharedFlow<OKMessage> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.OLrzqt = mutableSharedFlowMutableSharedFlow$default2;
        this.KWHzl = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
    }

    public final void KWHzl(@NotNull java.util.List<OKMessage> list, boolean z) {
        Intrinsics.checkNotNullParameter(list, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BroadcastMessageListFragmentShareViewModel$dispatchMessagesEvent$1(this, list, z, null), 3, null);
    }

    public final void EZpvd(@NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(oKMessage, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BroadcastMessageListFragmentShareViewModel$dispatchRetryMessageEvent$1(this, oKMessage, null), 3, null);
    }
}
