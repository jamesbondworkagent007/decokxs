package com.okinc.unify_trade.trade.source;

import com.okinc.market.watch.data.MarketUserFavorite;
import com.okinc.unify_trade.biz.subscribe.WatchListData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.qWJ;
import o.qWN;
import o.xPT;

/* JADX INFO: loaded from: classes12.dex */
public final class DataBaseWatchImpl$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ xPT this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataBaseWatchImpl$1(xPT xpt, Continuation<? super DataBaseWatchImpl$1> continuation) {
        super(2, continuation);
        this.this$0 = xpt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DataBaseWatchImpl$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DataBaseWatchImpl$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public static final class TaskDescription implements Flow<List<? extends WatchListData>> {
        public final /* synthetic */ Flow AEQbTJ;

        /* JADX INFO: renamed from: com.okinc.unify_trade.trade.source.DataBaseWatchImpl$1$TaskDescription$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass1(FlowCollector flowCollector) {
                this.EZpvd = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                DataBaseWatchImpl$1$invokeSuspend$lambda$2$$inlined$map$1$2$1 dataBaseWatchImpl$1$invokeSuspend$lambda$2$$inlined$map$1$2$1;
                if (continuation instanceof DataBaseWatchImpl$1$invokeSuspend$lambda$2$$inlined$map$1$2$1) {
                    dataBaseWatchImpl$1$invokeSuspend$lambda$2$$inlined$map$1$2$1 = (DataBaseWatchImpl$1$invokeSuspend$lambda$2$$inlined$map$1$2$1) continuation;
                    int i = dataBaseWatchImpl$1$invokeSuspend$lambda$2$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        dataBaseWatchImpl$1$invokeSuspend$lambda$2$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        dataBaseWatchImpl$1$invokeSuspend$lambda$2$$inlined$map$1$2$1 = new DataBaseWatchImpl$1$invokeSuspend$lambda$2$$inlined$map$1$2$1(this, continuation);
                    }
                }
                Object obj2 = dataBaseWatchImpl$1$invokeSuspend$lambda$2$$inlined$map$1$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = dataBaseWatchImpl$1$invokeSuspend$lambda$2$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.EZpvd;
                    List list = (List) obj;
                    ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(qWJ.EZpvd((MarketUserFavorite) it.next()));
                    }
                    dataBaseWatchImpl$1$invokeSuspend$lambda$2$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(arrayList, dataBaseWatchImpl$1$invokeSuspend$lambda$2$$inlined$map$1$2$1) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public TaskDescription(Flow flow) {
            this.AEQbTJ = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super List<? extends WatchListData>> flowCollector, Continuation continuation) {
            Object objCollect = this.AEQbTJ.collect(new AnonymousClass1(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        xPT xpt;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            xpt = this.this$0;
            Result.Application application2 = Result.Companion;
            qWN qwnCopydefault = xpt.copydefault();
            this.L$0 = xpt;
            this.label = 1;
            obj = qwnCopydefault.EZpvd(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                Result.m7377constructorimpl(Unit.INSTANCE);
                return Unit.INSTANCE;
            }
            xpt = (xPT) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        Flow flowConflate = FlowKt.conflate(FlowKt.m7441catch(FlowKt.flowOn(FlowKt.distinctUntilChanged(new TaskDescription((Flow) obj)), Dispatchers.getDefault()), new DataBaseWatchImpl$1$1$2(null)));
        ActionBar actionBar = new ActionBar(xpt);
        this.L$0 = null;
        this.label = 2;
        if (flowConflate.collect(actionBar, this) == objCopydefault) {
            return objCopydefault;
        }
        Result.m7377constructorimpl(Unit.INSTANCE);
        return Unit.INSTANCE;
    }

    public static final class ActionBar<T> implements FlowCollector {
        public final /* synthetic */ xPT AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(xPT xpt) {
            this.AEQbTJ = xpt;
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public final Object emit(List<WatchListData> list, Continuation<? super Unit> continuation) {
            Unit unit;
            xPT xpt = this.AEQbTJ;
            try {
                Result.Application application = Result.Companion;
                ArrayList<WatchListData> arrayList = new ArrayList<>(list);
                xpt.AEQbTJ(arrayList);
                xpt.EZpvd(arrayList);
                Function0 function0 = xpt.EZpvd;
                if (function0 != null) {
                    function0.invoke();
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
                Result.m7377constructorimpl(unit);
            } catch (Throwable th) {
                Result.Application application2 = Result.Companion;
                Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            return Unit.INSTANCE;
        }
    }
}
