package o;

import com.okinc.market.ticker.datasource.impl.WatchEventDataSource$bindWatchListEvent$1;
import com.okinc.market.ticker.datasource.impl.WatchEventDataSource$bindWatchListEvent$2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: classes9.dex */
public final class qUD {
    @yCM
    public qUD() {
    }

    public Flow<C40398qUj> OLrzqt() {
        return FlowKt.onStart(FlowKt.callbackFlow(new WatchEventDataSource$bindWatchListEvent$1(null)), new WatchEventDataSource$bindWatchListEvent$2(null));
    }
}
