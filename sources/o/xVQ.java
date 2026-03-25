package o;

import com.okinc.rxutils.RxBus;
import com.okinc.unify_trade.biz.subscribe.WatchListData;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes12.dex */
public final class xVQ implements xVR {
    public final MutableStateFlow<java.util.List<WatchListData>> OLrzqt = StateFlowKt.MutableStateFlow(null);
    public final CoroutineScope AEQbTJ = CoroutineScopeKt.CoroutineScope(C54585xNv.KWHzl.gEmmrt().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null)));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MutableStateFlow<java.util.List<WatchListData>> AEQbTJ() {
        return this.OLrzqt;
    }

    public xVQ() {
        RxBus.AEQbTJ("trade_to_new_system").subscribe(new RxBus.EventCallback<java.lang.String>() { // from class: com.okinc.usecase.favorite.FavoriteRepository$1
            {
                super(this.this$0);
            }

            /* JADX DEBUG: Method merged with bridge method: onEvent(Ljava/lang/Object;)V */
            @Override // com.okinc.rxutils.RxBus.EventCallback
            public void onEvent(String str) {
                this.this$0.KWHzl();
            }
        });
    }

    public final void KWHzl() {
        AEQbTJ().setValue(null);
    }
}
