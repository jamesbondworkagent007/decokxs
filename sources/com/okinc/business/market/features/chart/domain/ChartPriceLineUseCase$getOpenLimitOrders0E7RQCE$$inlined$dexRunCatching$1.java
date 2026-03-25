package com.okinc.business.market.features.chart.domain;

import com.okinc.business.trade.features.home.ui.meme.data.MemeExchangeDirection;
import com.okinc.business.trade.features.home.ui.meme.data.MemeOrdersStrategyType;
import com.okinc.business.trade.features.home.ui.meme.data.OpenOrderData;
import com.okinc.business.trade.features.home.ui.meme.data.OpenOrderReq;
import com.okinc.kline.data.KlineOpenOrderBean;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C25986jNs;
import o.C56391yDq;
import o.C56402yEa;
import o.C56403yEb;
import o.C56442yFn;
import o.InterfaceC28288kVw;
import o.kKG;
import o.pUU;
import o.yDY;

/* JADX INFO: renamed from: com.okinc.business.market.features.chart.domain.ChartPriceLineUseCase$getOpenLimitOrders-0E7RQCE$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class ChartPriceLineUseCase$getOpenLimitOrders0E7RQCE$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends List<? extends KlineOpenOrderBean>>>, Object> {
    final /* synthetic */ String $chainId$inlined;
    final /* synthetic */ String $tokenContractAddress$inlined;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C25986jNs this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChartPriceLineUseCase$getOpenLimitOrders0E7RQCE$$inlined$dexRunCatching$1(Continuation continuation, String str, C25986jNs c25986jNs, String str2) {
        super(2, continuation);
        this.$chainId$inlined = str;
        this.this$0 = c25986jNs;
        this.$tokenContractAddress$inlined = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChartPriceLineUseCase$getOpenLimitOrders0E7RQCE$$inlined$dexRunCatching$1(continuation, this.$chainId$inlined, this.this$0, this.$tokenContractAddress$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends List<? extends KlineOpenOrderBean>>> continuation) {
        return ((ChartPriceLineUseCase$getOpenLimitOrders0E7RQCE$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c9 A[Catch: all -> 0x00e2, CancellationException -> 0x00f9, LOOP:0: B:26:0x00c3->B:28:0x00c9, LOOP_END, TryCatch #2 {CancellationException -> 0x00f9, all -> 0x00e2, blocks: (B:6:0x0010, B:25:0x00ae, B:26:0x00c3, B:28:0x00c9, B:29:0x00dd, B:11:0x0025, B:18:0x005c, B:19:0x007a, B:21:0x0080, B:22:0x0092, B:14:0x002d), top: B:37:0x000a }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        String str;
        List list;
        Iterator it;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            pUU.AEQbTJ("DEX", "dexRunCatching", th);
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Result.Application application2 = Result.Companion;
            List listGEmmrt = yDY.gEmmrt(MemeOrdersStrategyType.BUY_DIP, MemeOrdersStrategyType.TAKE_PROFIT, MemeOrdersStrategyType.STOP_LOSS);
            String str2 = this.$chainId$inlined;
            kKG kkg = this.this$0.valueOf;
            this.L$0 = listGEmmrt;
            this.L$1 = str2;
            this.label = 1;
            Object objAEQbTJ = kkg.AEQbTJ(this);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            str = str2;
            list = listGEmmrt;
            obj = objAEQbTJ;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                Iterable iterable = (Iterable) ((AbstractC43419rot) obj).AEQbTJ();
                ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(iterable, 10));
                it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(this.this$0.KWHzl.OLrzqt((OpenOrderData) it.next()));
                }
                objM7377constructorimpl = Result.m7377constructorimpl(arrayList);
                return Result.m7376boximpl(objM7377constructorimpl);
            }
            String str3 = (String) this.L$1;
            list = (List) this.L$0;
            C56391yDq.AEQbTJ(obj);
            str = str3;
        }
        String str4 = (String) obj;
        List listEZpvd = C56402yEa.EZpvd(String.valueOf(MemeExchangeDirection.ALL.getValue()));
        ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(String.valueOf(((MemeOrdersStrategyType) it2.next()).getValue()));
        }
        OpenOrderReq openOrderReq = new OpenOrderReq(str, str4, listEZpvd, arrayList2, this.$tokenContractAddress$inlined);
        InterfaceC28288kVw interfaceC28288kVw = this.this$0.copydefault;
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        obj = interfaceC28288kVw.AEQbTJ(openOrderReq, this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        Iterable iterable2 = (Iterable) ((AbstractC43419rot) obj).AEQbTJ();
        ArrayList arrayList3 = new ArrayList(C56403yEb.AYXKKw(iterable2, 10));
        it = iterable2.iterator();
        while (it.hasNext()) {
        }
        objM7377constructorimpl = Result.m7377constructorimpl(arrayList3);
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
