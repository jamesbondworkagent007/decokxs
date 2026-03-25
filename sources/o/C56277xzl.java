package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.CustomerSignalsData;
import com.okinc.unify_trade.net.BotApiService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xzl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C56277xzl extends xKQ<java.util.List<? extends CustomerSignalsData>> {
    public java.lang.String AEQbTJ;
    public java.lang.String OLrzqt;
    public java.lang.String copydefault;
    public java.lang.String KWHzl = "";
    public java.lang.String EZpvd = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56277xzl KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56277xzl copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = str;
        return this;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlin.coroutines.Continuation<? super com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.CustomerSignalsData>>>] */
    @Override // o.xKQ
    public java.lang.Object KWHzl(@NotNull Continuation<? super ResponseData<java.util.List<? extends CustomerSignalsData>>> continuation) {
        return BotApiService.Companion.AEQbTJ().getCustomerSignals(this.KWHzl, this.EZpvd, this.OLrzqt, this.AEQbTJ, this.copydefault, continuation);
    }
}
