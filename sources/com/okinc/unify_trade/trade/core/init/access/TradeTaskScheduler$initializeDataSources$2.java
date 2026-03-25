package com.okinc.unify_trade.trade.core.init.access;

import com.okinc.unify_trade.trade.core.init.access.TradeTaskScheduler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.TimeoutCancellationException;
import o.AbstractC54610xOt;
import o.C33070mpX;
import o.C33129mqd;
import o.C54515xLg;
import o.C54588xNy;
import o.C55688xof;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;
import o.xNW;

/* JADX INFO: loaded from: classes12.dex */
public final class TradeTaskScheduler$initializeDataSources$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AbstractC54610xOt>, Object> {
    final /* synthetic */ C54588xNy $configs;
    final /* synthetic */ boolean $isForce;
    final /* synthetic */ List<xNW> $tasks;
    final /* synthetic */ String $traceId;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ TradeTaskScheduler this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.List<? extends o.xNW> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TradeTaskScheduler$initializeDataSources$2(List<? extends xNW> list, TradeTaskScheduler tradeTaskScheduler, String str, boolean z, C54588xNy c54588xNy, Continuation<? super TradeTaskScheduler$initializeDataSources$2> continuation) {
        super(2, continuation);
        this.$tasks = list;
        this.this$0 = tradeTaskScheduler;
        this.$traceId = str;
        this.$isForce = z;
        this.$configs = c54588xNy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TradeTaskScheduler$initializeDataSources$2 tradeTaskScheduler$initializeDataSources$2 = new TradeTaskScheduler$initializeDataSources$2(this.$tasks, this.this$0, this.$traceId, this.$isForce, this.$configs, continuation);
        tradeTaskScheduler$initializeDataSources$2.L$0 = obj;
        return tradeTaskScheduler$initializeDataSources$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super AbstractC54610xOt> continuation) {
        return ((TradeTaskScheduler$initializeDataSources$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:49:0x000f */
    /* JADX DEBUG: Type inference failed for r0v9. Raw type applied. Possible types: java.util.Iterator<T>, java.util.Iterator */
    /* JADX DEBUG: Type inference failed for r22v0. Raw type applied. Possible types: java.util.Iterator<T>, java.util.Iterator */
    /* JADX DEBUG: Type inference failed for r4v3. Raw type applied. Possible types: java.util.Iterator<T>, java.util.Iterator */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x022f  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlinx.coroutines.CoroutineScope] */
    /* JADX WARN: Type inference failed for: r2v15, types: [kotlinx.coroutines.CoroutineScope] */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v5, types: [kotlinx.coroutines.CoroutineScope] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        String strAYXKKw;
        AbstractC54610xOt abstractC54610xOt;
        long j;
        Object objCopydefault = C56442yFn.copydefault();
        ?? r2 = this.label;
        try {
            if (r2 != 0) {
                if (r2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                long j2 = this.J$0;
                abstractC54610xOt = (AbstractC54610xOt) this.L$1;
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                C56391yDq.AEQbTJ(obj);
                j = j2;
                r2 = coroutineScope;
            } else {
                C56391yDq.AEQbTJ(obj);
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                long jCurrentTimeMillis = System.currentTimeMillis();
                List<xNW> list = this.$tasks;
                TradeTaskScheduler tradeTaskScheduler = this.this$0;
                boolean z = this.$isForce;
                String str = this.$traceId;
                ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ArrayList arrayList2 = arrayList;
                    arrayList2.add(BuildersKt__Builders_commonKt.async$default(coroutineScope2, null, null, new TradeTaskScheduler$initializeDataSources$2$deferred$1$1(tradeTaskScheduler, (xNW) it.next(), z, str, null), 3, null));
                    arrayList = arrayList2;
                    tradeTaskScheduler = tradeTaskScheduler;
                    str = str;
                    z = z;
                }
                ArrayList arrayList3 = arrayList;
                AbstractC54610xOt.TaskDescription taskDescription = AbstractC54610xOt.TaskDescription.AEQbTJ;
                TradeTaskScheduler tradeTaskScheduler2 = this.this$0;
                String str2 = this.$traceId;
                this.L$0 = coroutineScope2;
                this.L$1 = taskDescription;
                this.J$0 = jCurrentTimeMillis;
                this.label = 1;
                if (tradeTaskScheduler2.EZpvd(arrayList3, str2, this) == objCopydefault) {
                    return objCopydefault;
                }
                abstractC54610xOt = taskDescription;
                j = jCurrentTimeMillis;
                r2 = coroutineScope2;
            }
            this.this$0.copydefault(this.$isForce, this.$configs, j, this.$traceId);
            pUU.KWHzl(this.this$0.KWHzl, "[" + this.$traceId + "] TradeTaskScheduler, configs = " + this.$configs + ",isForce = " + this.$isForce + ",all tasks success,结束initializeDataSources流程");
            return abstractC54610xOt;
        } catch (TradeTaskScheduler.TradeTaskException e) {
            pUU.copydefault(this.this$0.KWHzl, "[" + this.$traceId + "] configs = " + this.$configs + ",isForce = " + this.$isForce + ",One of the tasks failed: " + e.getMessage() + ",结束initializeDataSources流程");
            JobKt__JobKt.cancelChildren$default(r2.getCoroutineContext(), (CancellationException) null, 1, (Object) null);
            xNW xnwEZpvd = e.getResult().EZpvd();
            List<xNW> list2 = this.$tasks;
            ArrayList arrayList4 = new ArrayList();
            for (Object obj2 : list2) {
                if (!Intrinsics.EZpvd((xNW) obj2, xnwEZpvd)) {
                    arrayList4.add(obj2);
                }
            }
            Iterator it2 = arrayList4.iterator();
            while (it2.hasNext()) {
                ((xNW) it2.next()).valueOf();
            }
            String message = e.getMessage();
            if (message == null) {
                strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.putInt);
            } else {
                strAYXKKw = message.length() > 0 ? message : null;
                if (strAYXKKw == null) {
                }
            }
            return new AbstractC54610xOt.StateListAnimator(strAYXKKw);
        } catch (TimeoutCancellationException unused) {
            pUU.copydefault(this.this$0.KWHzl, "[" + this.$traceId + "] configs = " + this.$configs + ",isForce = " + this.$isForce + ",time out,结束initializeDataSources流程");
            JobKt__JobKt.cancelChildren$default(r2.getCoroutineContext(), (CancellationException) null, 1, (Object) null);
            Iterator it3 = this.$tasks.iterator();
            while (it3.hasNext()) {
                ((xNW) it3.next()).valueOf();
            }
            C54515xLg.OLrzqt.EZpvd("timeout", C33129mqd.gEmmrt(C56443yFo.KWHzl(30000L)), "", "TradeTaskScheduler,timeout");
            return new AbstractC54610xOt.StateListAnimator(C33070mpX.AYXKKw(C55688xof.Application.putInt));
        } catch (CancellationException unused2) {
            pUU.copydefault(this.this$0.KWHzl, "[" + this.$traceId + "] configs = " + this.$configs + ",isForce = " + this.$isForce + ",Cancellation,结束initializeDataSources流程");
            JobKt__JobKt.cancelChildren$default(r2.getCoroutineContext(), (CancellationException) null, 1, (Object) null);
            return new AbstractC54610xOt.StateListAnimator(C33070mpX.AYXKKw(C55688xof.Application.putInt));
        }
    }
}
