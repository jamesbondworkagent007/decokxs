package com.okinc.business.market.features.alert.create.ui;

import com.okinc.business.market.data.model.alert.LiveMarketPriceData;
import com.okinc.business.market.data.model.alert.TokenInfoForAlert;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C25802jGx;
import o.C27614jyX;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.jGX;

/* JADX INFO: loaded from: classes18.dex */
public final class Web3NewOrModifyAlertViewModel$subscribeToLivePrice$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ jGX this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Web3NewOrModifyAlertViewModel$subscribeToLivePrice$1(jGX jgx, Continuation<? super Web3NewOrModifyAlertViewModel$subscribeToLivePrice$1> continuation) {
        super(2, continuation);
        this.this$0 = jgx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new Web3NewOrModifyAlertViewModel$subscribeToLivePrice$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((Web3NewOrModifyAlertViewModel$subscribeToLivePrice$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006c A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        TokenInfoForAlert tokenInfoForAlert;
        jGX jgx;
        TaskDescription taskDescription;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            tokenInfoForAlert = this.this$0.DbNXlk;
            if (tokenInfoForAlert != null) {
                jGX jgx2 = this.this$0;
                C25802jGx c25802jGx = jgx2.gEmmrt;
                C27614jyX c27614jyX = new C27614jyX(tokenInfoForAlert.copydefault(), tokenInfoForAlert.valueOf(), null, 4, null);
                this.L$0 = jgx2;
                this.L$1 = tokenInfoForAlert;
                this.label = 1;
                Object objAEQbTJ = c25802jGx.AEQbTJ(c27614jyX, this);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
                jgx = jgx2;
                obj = objAEQbTJ;
                taskDescription = new TaskDescription(tokenInfoForAlert, jgx);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 2;
                if (((Flow) obj).collect(taskDescription, this) == objCopydefault) {
                }
            }
        } else if (i == 1) {
            tokenInfoForAlert = (TokenInfoForAlert) this.L$1;
            jgx = (jGX) this.L$0;
            C56391yDq.AEQbTJ(obj);
            taskDescription = new TaskDescription(tokenInfoForAlert, jgx);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
            if (((Flow) obj).collect(taskDescription, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }

    public static final class TaskDescription<T> implements FlowCollector {
        public final /* synthetic */ jGX EZpvd;
        public final /* synthetic */ TokenInfoForAlert OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(TokenInfoForAlert tokenInfoForAlert, jGX jgx) {
            this.OLrzqt = tokenInfoForAlert;
            this.EZpvd = jgx;
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: kotlinx.coroutines.flow.MutableStateFlow */
        /* JADX DEBUG: Multi-variable search result rejected for r4v5, resolved type: kotlinx.coroutines.flow.MutableStateFlow */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final Object emit(LiveMarketPriceData liveMarketPriceData, Continuation<? super Unit> continuation) {
            Object value;
            Object value2;
            if (C33129mqd.OLrzqt((CharSequence) (liveMarketPriceData != null ? liveMarketPriceData.AEQbTJ() : null))) {
                if (Intrinsics.EZpvd((Object) (liveMarketPriceData != null ? liveMarketPriceData.copydefault() : null), (Object) this.OLrzqt.valueOf())) {
                    MutableStateFlow mutableStateFlow = this.EZpvd.EZpvd;
                    do {
                        value = mutableStateFlow.getValue();
                    } while (!mutableStateFlow.compareAndSet(value, liveMarketPriceData.AEQbTJ()));
                    MutableStateFlow mutableStateFlow2 = this.EZpvd.KWHzl;
                    do {
                        value2 = mutableStateFlow2.getValue();
                    } while (!mutableStateFlow2.compareAndSet(value2, liveMarketPriceData.OLrzqt()));
                }
            }
            return Unit.INSTANCE;
        }
    }
}
