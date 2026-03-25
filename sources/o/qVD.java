package o;

import com.okinc.market.watch.MarketWatchHelper$updateDataBaseFromNet$1;
import com.okinc.market.watch.database.MarketFavDataBase;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.WatchListBean;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qVD {
    public static final qVD AEQbTJ = new qVD();
    public static boolean KWHzl = true;
    public static final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.qVC
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Boolean.valueOf(qVD.KWHzl());
        }
    });
    public static final int OLrzqt = 8;

    public static final boolean KWHzl() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(boolean z) {
        KWHzl = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return KWHzl;
    }

    private qVD() {
    }

    public final boolean AEQbTJ() {
        return ((java.lang.Boolean) copydefault.getValue()).booleanValue();
    }

    public final InterfaceC54647xQc OLrzqt() {
        if (AEQbTJ()) {
            pUU.KWHzl("MarketWatchHelper", "factoryWatchImpl:  use database " + AEQbTJ() + " ");
            return new xPT();
        }
        pUU.KWHzl("MarketWatchHelper", "factoryWatchImpl:  use database " + AEQbTJ() + " ");
        KWHzl = true;
        return new xPU();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        MarketWatchHelper$updateDataBaseFromNet$1 marketWatchHelper$updateDataBaseFromNet$1;
        if (continuation instanceof MarketWatchHelper$updateDataBaseFromNet$1) {
            marketWatchHelper$updateDataBaseFromNet$1 = (MarketWatchHelper$updateDataBaseFromNet$1) continuation;
            int i = marketWatchHelper$updateDataBaseFromNet$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marketWatchHelper$updateDataBaseFromNet$1.label = i - Integer.MIN_VALUE;
            } else {
                marketWatchHelper$updateDataBaseFromNet$1 = new MarketWatchHelper$updateDataBaseFromNet$1(this, continuation);
            }
        }
        MarketWatchHelper$updateDataBaseFromNet$1 marketWatchHelper$updateDataBaseFromNet$12 = marketWatchHelper$updateDataBaseFromNet$1;
        java.lang.Object obj = marketWatchHelper$updateDataBaseFromNet$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = marketWatchHelper$updateDataBaseFromNet$12.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                Result.Application application = Result.Companion;
                if (AEQbTJ.AEQbTJ()) {
                    qWO qwoCopydefault = qWO.Companion.copydefault(MarketFavDataBase.Companion.KWHzl(C43246rlf.OLrzqt.valueOf()));
                    java.lang.String strKWHzl = C55686xod.KWHzl();
                    marketWatchHelper$updateDataBaseFromNet$12.L$0 = qwoCopydefault;
                    marketWatchHelper$updateDataBaseFromNet$12.label = 1;
                    if (qWO.syncWithServer$default(qwoCopydefault, strKWHzl, false, marketWatchHelper$updateDataBaseFromNet$12, 2, null) == objCopydefault) {
                        return objCopydefault;
                    }
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Unit.INSTANCE;
    }

    public final WatchListBean EZpvd(@NotNull java.util.List<WatchListBean> list, @NotNull BizInstrument bizInstrument) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        java.util.Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            WatchListBean watchListBean = (WatchListBean) next;
            java.lang.String instType = watchListBean.getInstType();
            xUV xuv = xUV.EZpvd;
            if (Intrinsics.EZpvd((java.lang.Object) instType, (java.lang.Object) xuv.OLrzqt(bizInstrument)) && Intrinsics.EZpvd((java.lang.Object) watchListBean.getInstId(), (java.lang.Object) xuv.KWHzl(bizInstrument))) {
                java.lang.String alias = watchListBean.getAlias();
                java.lang.String strCopydefault = xuv.copydefault(bizInstrument);
                if (strCopydefault == null) {
                    strCopydefault = "";
                }
                if (Intrinsics.EZpvd((java.lang.Object) alias, (java.lang.Object) strCopydefault)) {
                    break;
                }
            }
        }
        return (WatchListBean) next;
    }
}
