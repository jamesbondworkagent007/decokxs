package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.SignalListItem;
import com.okinc.unify_trade.biz.SignalPublishInfo;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class xAY extends xKE<java.util.List<? extends SignalListItem>> {
    public SignalPublishInfo KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final xAY copydefault(@NotNull SignalPublishInfo signalPublishInfo) {
        Intrinsics.checkNotNullParameter(signalPublishInfo, "");
        this.KWHzl = signalPublishInfo;
        return this;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.SignalListItem>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends SignalListItem>>> EZpvd() {
        BizApiService bizApiService = (BizApiService) C43417ror.OLrzqt(C56524yIo.AEQbTJ(BizApiService.class));
        SignalPublishInfo signalPublishInfo = this.KWHzl;
        if (signalPublishInfo == null) {
            Intrinsics.gEmmrt("");
            signalPublishInfo = null;
        }
        return bizApiService.publishSignal(signalPublishInfo);
    }
}
