package o;

import com.okinc.market.search.features.navigation.history.data.NavSearchHistoryRepository$addHistory$1;
import com.okinc.market.search.features.navigation.history.data.NavSearchHistoryRepository$addHistory$2;
import com.okinc.market.search.features.navigation.history.data.NavSearchHistoryRepository$getHistoryListFlow$1;
import com.okinc.market.search.features.navigation.history.data.NavSearchHistoryRepository$getHistoryListFlow$list$1;
import com.okinc.market.search.features.navigation.history.data.NavSearchHistoryRepository$removeAll$1;
import com.okinc.market.search.features.navigation.history.data.NavSearchHistoryRepository$removeAll$2;
import com.okinc.unify_trade.trade.source.SearchTradeBizInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qLR {
    public final CoroutineDispatcher EZpvd;
    public final InterfaceC56387yDm OLrzqt;
    public final qLJ copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CoroutineDispatcher OLrzqt() {
        return this.EZpvd;
    }

    @yCM
    public qLR(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull qLJ qlj) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(qlj, "");
        this.EZpvd = coroutineDispatcher;
        this.copydefault = qlj;
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.qLQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return qLR.EZpvd();
            }
        });
    }

    public final MutableSharedFlow<java.util.List<SearchTradeBizInfo>> copydefault() {
        return (MutableSharedFlow) this.OLrzqt.getValue();
    }

    public static final MutableSharedFlow EZpvd() {
        return SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull Continuation<? super Flow<? extends java.util.List<SearchTradeBizInfo>>> continuation) {
        NavSearchHistoryRepository$getHistoryListFlow$1 navSearchHistoryRepository$getHistoryListFlow$1;
        qLR qlr;
        qLR qlr2;
        if (continuation instanceof NavSearchHistoryRepository$getHistoryListFlow$1) {
            navSearchHistoryRepository$getHistoryListFlow$1 = (NavSearchHistoryRepository$getHistoryListFlow$1) continuation;
            int i = navSearchHistoryRepository$getHistoryListFlow$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                navSearchHistoryRepository$getHistoryListFlow$1.label = i - Integer.MIN_VALUE;
            } else {
                navSearchHistoryRepository$getHistoryListFlow$1 = new NavSearchHistoryRepository$getHistoryListFlow$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = navSearchHistoryRepository$getHistoryListFlow$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = navSearchHistoryRepository$getHistoryListFlow$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcherOLrzqt = OLrzqt();
            NavSearchHistoryRepository$getHistoryListFlow$list$1 navSearchHistoryRepository$getHistoryListFlow$list$1 = new NavSearchHistoryRepository$getHistoryListFlow$list$1(this, null);
            navSearchHistoryRepository$getHistoryListFlow$1.L$0 = this;
            navSearchHistoryRepository$getHistoryListFlow$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcherOLrzqt, navSearchHistoryRepository$getHistoryListFlow$list$1, navSearchHistoryRepository$getHistoryListFlow$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
            qlr = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                qlr2 = (qLR) navSearchHistoryRepository$getHistoryListFlow$1.L$0;
                C56391yDq.AEQbTJ(objWithContext);
                return qlr2.copydefault();
            }
            qlr = (qLR) navSearchHistoryRepository$getHistoryListFlow$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
        }
        MutableSharedFlow<java.util.List<SearchTradeBizInfo>> mutableSharedFlowCopydefault = qlr.copydefault();
        navSearchHistoryRepository$getHistoryListFlow$1.L$0 = qlr;
        navSearchHistoryRepository$getHistoryListFlow$1.label = 2;
        if (mutableSharedFlowCopydefault.emit((java.util.List) objWithContext, navSearchHistoryRepository$getHistoryListFlow$1) == objCopydefault) {
            return objCopydefault;
        }
        qlr2 = qlr;
        return qlr2.copydefault();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull SearchTradeBizInfo searchTradeBizInfo, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        NavSearchHistoryRepository$addHistory$1 navSearchHistoryRepository$addHistory$1;
        qLR qlr;
        if (continuation instanceof NavSearchHistoryRepository$addHistory$1) {
            navSearchHistoryRepository$addHistory$1 = (NavSearchHistoryRepository$addHistory$1) continuation;
            int i = navSearchHistoryRepository$addHistory$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                navSearchHistoryRepository$addHistory$1.label = i - Integer.MIN_VALUE;
            } else {
                navSearchHistoryRepository$addHistory$1 = new NavSearchHistoryRepository$addHistory$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = navSearchHistoryRepository$addHistory$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = navSearchHistoryRepository$addHistory$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcherOLrzqt = OLrzqt();
            NavSearchHistoryRepository$addHistory$2 navSearchHistoryRepository$addHistory$2 = new NavSearchHistoryRepository$addHistory$2(this, searchTradeBizInfo, null);
            navSearchHistoryRepository$addHistory$1.L$0 = this;
            navSearchHistoryRepository$addHistory$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcherOLrzqt, navSearchHistoryRepository$addHistory$2, navSearchHistoryRepository$addHistory$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
            qlr = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
                return Unit.INSTANCE;
            }
            qlr = (qLR) navSearchHistoryRepository$addHistory$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
        }
        MutableSharedFlow<java.util.List<SearchTradeBizInfo>> mutableSharedFlowCopydefault = qlr.copydefault();
        navSearchHistoryRepository$addHistory$1.L$0 = null;
        navSearchHistoryRepository$addHistory$1.label = 2;
        if (mutableSharedFlowCopydefault.emit((java.util.List) objWithContext, navSearchHistoryRepository$addHistory$1) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        NavSearchHistoryRepository$removeAll$1 navSearchHistoryRepository$removeAll$1;
        qLR qlr;
        if (continuation instanceof NavSearchHistoryRepository$removeAll$1) {
            navSearchHistoryRepository$removeAll$1 = (NavSearchHistoryRepository$removeAll$1) continuation;
            int i = navSearchHistoryRepository$removeAll$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                navSearchHistoryRepository$removeAll$1.label = i - Integer.MIN_VALUE;
            } else {
                navSearchHistoryRepository$removeAll$1 = new NavSearchHistoryRepository$removeAll$1(this, continuation);
            }
        }
        java.lang.Object obj = navSearchHistoryRepository$removeAll$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = navSearchHistoryRepository$removeAll$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineDispatcher coroutineDispatcherOLrzqt = OLrzqt();
            NavSearchHistoryRepository$removeAll$2 navSearchHistoryRepository$removeAll$2 = new NavSearchHistoryRepository$removeAll$2(this, null);
            navSearchHistoryRepository$removeAll$1.L$0 = this;
            navSearchHistoryRepository$removeAll$1.label = 1;
            if (BuildersKt.withContext(coroutineDispatcherOLrzqt, navSearchHistoryRepository$removeAll$2, navSearchHistoryRepository$removeAll$1) == objCopydefault) {
                return objCopydefault;
            }
            qlr = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            qlr = (qLR) navSearchHistoryRepository$removeAll$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        MutableSharedFlow<java.util.List<SearchTradeBizInfo>> mutableSharedFlowCopydefault = qlr.copydefault();
        java.util.List<SearchTradeBizInfo> listAhwBna = yDY.AhwBna();
        navSearchHistoryRepository$removeAll$1.L$0 = null;
        navSearchHistoryRepository$removeAll$1.label = 2;
        if (mutableSharedFlowCopydefault.emit(listAhwBna, navSearchHistoryRepository$removeAll$1) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }
}
