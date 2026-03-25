package o;

import com.okinc.market.search.features.main.root.data.po.SearchResultBotsTradersWeb3Po;
import com.okinc.market.search.features.main.root.data.po.SearchResultEarnProductPo;
import com.okinc.market.search.features.main.root.data.repository.MainSearchRepository$getAllEarnProducts$1;
import com.okinc.market.search.features.main.root.data.repository.MainSearchRepository$getAllEarnProducts$2$response$1;
import com.okinc.market.search.features.main.root.data.repository.MainSearchRepository$getAllInstrumentTickersData$2;
import com.okinc.market.search.features.main.root.data.repository.MainSearchRepository$searchBotsAndTraders$2;
import com.okinc.market.search.features.main.root.data.repository.MainSearchRepository$searchIMChats$2;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import java.lang.ref.SoftReference;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qGE {
    public final qGB AEQbTJ;
    public SoftReference<SearchResultEarnProductPo> EZpvd;
    public final CoroutineDispatcher OLrzqt;
    public final Mutex copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CoroutineDispatcher EZpvd() {
        return this.OLrzqt;
    }

    @yCM
    public qGE(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull qGB qgb) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(qgb, "");
        this.OLrzqt = coroutineDispatcher;
        this.AEQbTJ = qgb;
        this.copydefault = MutexKt.Mutex$default(false, 1, null);
    }

    public final java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull Continuation<? super SearchResultBotsTradersWeb3Po> continuation) {
        return BuildersKt.withContext(EZpvd(), new MainSearchRepository$searchBotsAndTraders$2(this, str, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull Continuation<? super SearchResultEarnProductPo> continuation) throws java.lang.Throwable {
        MainSearchRepository$getAllEarnProducts$1 mainSearchRepository$getAllEarnProducts$1;
        Mutex mutex;
        qGE qge;
        SearchResultEarnProductPo searchResultEarnProductPo;
        Mutex mutex2;
        qGE qge2;
        if (continuation instanceof MainSearchRepository$getAllEarnProducts$1) {
            mainSearchRepository$getAllEarnProducts$1 = (MainSearchRepository$getAllEarnProducts$1) continuation;
            int i = mainSearchRepository$getAllEarnProducts$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mainSearchRepository$getAllEarnProducts$1.label = i - Integer.MIN_VALUE;
            } else {
                mainSearchRepository$getAllEarnProducts$1 = new MainSearchRepository$getAllEarnProducts$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = mainSearchRepository$getAllEarnProducts$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = mainSearchRepository$getAllEarnProducts$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                mutex = this.copydefault;
                mainSearchRepository$getAllEarnProducts$1.L$0 = this;
                mainSearchRepository$getAllEarnProducts$1.L$1 = mutex;
                mainSearchRepository$getAllEarnProducts$1.label = 1;
                if (mutex.lock(null, mainSearchRepository$getAllEarnProducts$1) == objCopydefault) {
                    return objCopydefault;
                }
                qge = this;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutex2 = (Mutex) mainSearchRepository$getAllEarnProducts$1.L$1;
                    qge2 = (qGE) mainSearchRepository$getAllEarnProducts$1.L$0;
                    try {
                        C56391yDq.AEQbTJ(objWithContext);
                        searchResultEarnProductPo = (SearchResultEarnProductPo) objWithContext;
                        qge2.EZpvd = new SoftReference<>(searchResultEarnProductPo);
                        mutex = mutex2;
                        mutex.unlock(null);
                        return searchResultEarnProductPo;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        mutex = mutex2;
                        mutex.unlock(null);
                        throw th;
                    }
                }
                mutex = (Mutex) mainSearchRepository$getAllEarnProducts$1.L$1;
                qge = (qGE) mainSearchRepository$getAllEarnProducts$1.L$0;
                C56391yDq.AEQbTJ(objWithContext);
            }
            SoftReference<SearchResultEarnProductPo> softReference = qge.EZpvd;
            searchResultEarnProductPo = softReference != null ? softReference.get() : null;
            if (searchResultEarnProductPo == null) {
                CoroutineDispatcher coroutineDispatcherEZpvd = qge.EZpvd();
                MainSearchRepository$getAllEarnProducts$2$response$1 mainSearchRepository$getAllEarnProducts$2$response$1 = new MainSearchRepository$getAllEarnProducts$2$response$1(qge, null);
                mainSearchRepository$getAllEarnProducts$1.L$0 = qge;
                mainSearchRepository$getAllEarnProducts$1.L$1 = mutex;
                mainSearchRepository$getAllEarnProducts$1.label = 2;
                objWithContext = BuildersKt.withContext(coroutineDispatcherEZpvd, mainSearchRepository$getAllEarnProducts$2$response$1, mainSearchRepository$getAllEarnProducts$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
                mutex2 = mutex;
                qge2 = qge;
                searchResultEarnProductPo = (SearchResultEarnProductPo) objWithContext;
                qge2.EZpvd = new SoftReference<>(searchResultEarnProductPo);
                mutex = mutex2;
            }
            mutex.unlock(null);
            return searchResultEarnProductPo;
        } catch (java.lang.Throwable th2) {
            th = th2;
            mutex.unlock(null);
            throw th;
        }
    }

    public static /* synthetic */ java.lang.Object getAllInstrumentTickersData$default(qGE qge, boolean z, boolean z2, boolean z3, boolean z4, Continuation continuation, int i, java.lang.Object obj) {
        boolean z5 = (i & 1) != 0 ? true : z;
        boolean z6 = (i & 2) != 0 ? true : z2;
        boolean z7 = (i & 4) != 0 ? true : z3;
        if ((i & 8) != 0) {
            z4 = false;
        }
        return qge.KWHzl(z5, z6, z7, z4, continuation);
    }

    public final java.lang.Object KWHzl(boolean z, boolean z2, boolean z3, boolean z4, @NotNull Continuation<? super java.util.List<? extends java.util.List<TickersData>>> continuation) {
        C40375qTn.AEQbTJ.copydefault("MainSearchRepository", "getAllInstrumentTickersData, isSupportSwap: " + z + ", isSupportFuture: " + z2 + ", isSupportOption: " + z3 + ", isSupportCoin: " + z4);
        return BuildersKt.withContext(EZpvd(), new MainSearchRepository$getAllInstrumentTickersData$2(this, z, z2, z3, z4, null), continuation);
    }

    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull Continuation<? super java.util.List<qGF>> continuation) {
        return BuildersKt.withContext(EZpvd(), new MainSearchRepository$searchIMChats$2(this, str, null), continuation);
    }
}
