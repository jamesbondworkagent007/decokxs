package o;

import com.okinc.market.discover.features.markets.boost.data.po.CedefiBoostPo;
import com.okinc.market.discover.features.markets.boost.data.repository.CedefiBoostRepository$getCedefiBoostData$1;
import com.okinc.network.okg.response.ResponseData;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pZL {
    public final CoroutineDispatcher KWHzl;
    public final pZG OLrzqt;

    @yCM
    public pZL(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull pZG pzg) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(pzg, "");
        this.KWHzl = coroutineDispatcher;
        this.OLrzqt = pzg;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull Continuation<? super CedefiBoostPo> continuation) {
        CedefiBoostRepository$getCedefiBoostData$1 cedefiBoostRepository$getCedefiBoostData$1;
        if (continuation instanceof CedefiBoostRepository$getCedefiBoostData$1) {
            cedefiBoostRepository$getCedefiBoostData$1 = (CedefiBoostRepository$getCedefiBoostData$1) continuation;
            int i = cedefiBoostRepository$getCedefiBoostData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                cedefiBoostRepository$getCedefiBoostData$1.label = i - Integer.MIN_VALUE;
            } else {
                cedefiBoostRepository$getCedefiBoostData$1 = new CedefiBoostRepository$getCedefiBoostData$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = cedefiBoostRepository$getCedefiBoostData$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = cedefiBoostRepository$getCedefiBoostData$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            pZG pzg = this.OLrzqt;
            cedefiBoostRepository$getCedefiBoostData$1.label = 1;
            objEZpvd = pzg.EZpvd(cedefiBoostRepository$getCedefiBoostData$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objEZpvd);
        }
        java.util.List list = (java.util.List) ((ResponseData) objEZpvd).getData();
        if (list != null) {
            return (CedefiBoostPo) CollectionsKt___CollectionsKt.firstOrNull(list);
        }
        return null;
    }
}
