package o;

import com.okinc.unify_trade.trade.core.config.TradeInit;
import com.okinc.unify_trade.trade.core.init.access.TradeTaskScheduler;
import com.okinc.unify_trade.trade.core.init.access.TradeTaskService$refreshCoins$1;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC54610xOt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xOx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54614xOx {
    public final ConcurrentHashMap<TradeInit, xNW> AEQbTJ = new ConcurrentHashMap<>();
    public final C54609xOs EZpvd = new C54609xOs();
    public final TradeTaskScheduler OLrzqt = new TradeTaskScheduler();
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.xOy
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C54614xOx.OLrzqt();
        }
    });

    public final C54611xOu KWHzl() {
        return (C54611xOu) this.KWHzl.getValue();
    }

    public static final C54611xOu OLrzqt() {
        return new C54611xOu();
    }

    public static final xNW AEQbTJ(Function1 function1, java.lang.Object obj) {
        return (xNW) function1.invoke(obj);
    }

    public final xNW AEQbTJ(@NotNull TradeInit tradeInit) {
        Intrinsics.checkNotNullParameter(tradeInit, "");
        ConcurrentHashMap<TradeInit, xNW> concurrentHashMap = this.AEQbTJ;
        final Function1 function1 = new Function1() { // from class: o.xOw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54614xOx.KWHzl(this.AEQbTJ, (TradeInit) obj);
            }
        };
        xNW xnwComputeIfAbsent = concurrentHashMap.computeIfAbsent(tradeInit, new java.util.function.Function() { // from class: o.xOz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return C54614xOx.AEQbTJ(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(xnwComputeIfAbsent, "");
        return xnwComputeIfAbsent;
    }

    public static final xNW KWHzl(C54614xOx c54614xOx, TradeInit tradeInit) {
        Intrinsics.checkNotNullParameter(tradeInit, "");
        return c54614xOx.EZpvd.EZpvd(tradeInit);
    }

    public static /* synthetic */ java.lang.Object initializeDataSources$default(C54614xOx c54614xOx, C54588xNy c54588xNy, boolean z, java.lang.String str, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str = "";
        }
        return c54614xOx.AEQbTJ(c54588xNy, z, str, continuation);
    }

    public final java.lang.Object AEQbTJ(@NotNull C54588xNy c54588xNy, boolean z, @NotNull java.lang.String str, @NotNull Continuation<? super AbstractC54610xOt> continuation) {
        pUU.KWHzl("trade_init", "[" + str + "] initializeDataSources: config " + c54588xNy + ",isForce = " + z);
        if (!z && AEQbTJ(c54588xNy, str)) {
            return AbstractC54610xOt.TaskDescription.AEQbTJ;
        }
        pUU.KWHzl("trade_init", "[" + str + "] 开始initializeDataSources流程");
        return this.OLrzqt.OLrzqt(c54588xNy, copydefault(c54588xNy), z, str, continuation);
    }

    public final java.util.List<xNW> copydefault(C54588xNy c54588xNy) {
        java.util.ArrayList<TradeInit> arrayListAEQbTJ = c54588xNy.AEQbTJ();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(arrayListAEQbTJ, 10));
        java.util.Iterator<T> it = arrayListAEQbTJ.iterator();
        while (it.hasNext()) {
            xNW xnwAEQbTJ = AEQbTJ((TradeInit) it.next());
            xnwAEQbTJ.KWHzl(c54588xNy);
            arrayList.add(xnwAEQbTJ);
        }
        return arrayList;
    }

    public static /* synthetic */ boolean isInitialized$default(C54614xOx c54614xOx, C54588xNy c54588xNy, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        return c54614xOx.AEQbTJ(c54588xNy, str);
    }

    public final boolean AEQbTJ(@NotNull C54588xNy c54588xNy, @NotNull java.lang.String str) {
        boolean z;
        Intrinsics.checkNotNullParameter(c54588xNy, "");
        Intrinsics.checkNotNullParameter(str, "");
        java.util.ArrayList<TradeInit> arrayListAEQbTJ = c54588xNy.AEQbTJ();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(arrayListAEQbTJ, 10));
        java.util.Iterator<T> it = arrayListAEQbTJ.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Boolean.valueOf(AEQbTJ((TradeInit) it.next()).fARcdN()));
        }
        if (arrayList.isEmpty()) {
            z = true;
        } else {
            java.util.Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (!((java.lang.Boolean) it2.next()).booleanValue()) {
                    z = false;
                    break;
                }
            }
            z = true;
        }
        pUU.KWHzl("trade_init", "[" + str + "] isInitialized: config " + c54588xNy + ",result = " + z);
        return z;
    }

    public final boolean copydefault() {
        return AEQbTJ(TradeInit.Activity.AEQbTJ).fARcdN();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        TradeTaskService$refreshCoins$1 tradeTaskService$refreshCoins$1;
        if (continuation instanceof TradeTaskService$refreshCoins$1) {
            tradeTaskService$refreshCoins$1 = (TradeTaskService$refreshCoins$1) continuation;
            int i = tradeTaskService$refreshCoins$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tradeTaskService$refreshCoins$1.label = i - Integer.MIN_VALUE;
            } else {
                tradeTaskService$refreshCoins$1 = new TradeTaskService$refreshCoins$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = tradeTaskService$refreshCoins$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = tradeTaskService$refreshCoins$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            pUU.KWHzl("trade_init", "refreshCoins: start refresh coin data");
            xNW xnwAEQbTJ = AEQbTJ(TradeInit.Activity.AEQbTJ);
            Intrinsics.copydefault(xnwAEQbTJ, "");
            C54611xOu c54611xOuKWHzl = KWHzl();
            tradeTaskService$refreshCoins$1.label = 1;
            objCopydefault = c54611xOuKWHzl.copydefault((xNQ) xnwAEQbTJ, tradeTaskService$refreshCoins$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objCopydefault);
        }
        boolean zBooleanValue = ((java.lang.Boolean) objCopydefault).booleanValue();
        pUU.KWHzl("trade_init", "refreshCoins: refresh result = " + zBooleanValue);
        return C56443yFo.KWHzl(zBooleanValue);
    }
}
