package o;

import com.okinc.market.ticker.BatchTickersLoader$getAllTickers$1;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import java.lang.ref.SoftReference;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class qTE {
    public static final qTE copydefault = new qTE();
    public static C56131xwy OLrzqt = new C56131xwy();
    public static ConcurrentHashMap<java.lang.String, SoftReference<java.util.List<TickersData>>> EZpvd = new ConcurrentHashMap<>();
    public static final int AEQbTJ = 8;

    private qTE() {
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, boolean z, @NotNull Continuation<? super kotlin.Pair<java.lang.Boolean, ? extends java.util.List<TickersData>>> continuation) throws java.lang.Throwable {
        BatchTickersLoader$getAllTickers$1 batchTickersLoader$getAllTickers$1;
        java.lang.Object objM7377constructorimpl;
        if (continuation instanceof BatchTickersLoader$getAllTickers$1) {
            batchTickersLoader$getAllTickers$1 = (BatchTickersLoader$getAllTickers$1) continuation;
            int i = batchTickersLoader$getAllTickers$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                batchTickersLoader$getAllTickers$1.label = i - Integer.MIN_VALUE;
            } else {
                batchTickersLoader$getAllTickers$1 = new BatchTickersLoader$getAllTickers$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = batchTickersLoader$getAllTickers$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = batchTickersLoader$getAllTickers$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objEZpvd);
                if (!z) {
                    SoftReference<java.util.List<TickersData>> softReference = EZpvd.get(str);
                    java.util.List<TickersData> list = softReference != null ? softReference.get() : null;
                    if (list != null) {
                        return C56390yDp.OLrzqt(C56443yFo.KWHzl(true), list);
                    }
                }
                Result.Application application = Result.Companion;
                C56131xwy c56131xwy = OLrzqt;
                batchTickersLoader$getAllTickers$1.L$0 = str;
                batchTickersLoader$getAllTickers$1.label = 1;
                objEZpvd = C55626xnW.EZpvd(c56131xwy, str, batchTickersLoader$getAllTickers$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (java.lang.String) batchTickersLoader$getAllTickers$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
            }
            objM7377constructorimpl = Result.m7377constructorimpl((java.util.List) objEZpvd);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.util.List list2 = (java.util.List) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
        EZpvd.put(str, new SoftReference<>(list2));
        return C56390yDp.OLrzqt(C56443yFo.KWHzl(false), list2);
    }
}
