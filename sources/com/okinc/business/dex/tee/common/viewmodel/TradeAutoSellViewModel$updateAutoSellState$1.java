package com.okinc.business.dex.tee.common.viewmodel;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.AbstractC30510lcX;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC28149kQs;
import o.gLQ;

/* JADX INFO: loaded from: classes5.dex */
public final class TradeAutoSellViewModel$updateAutoSellState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chainId;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    final /* synthetic */ TradeAutoSellViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradeAutoSellViewModel$updateAutoSellState$1(TradeAutoSellViewModel tradeAutoSellViewModel, String str, Continuation<? super TradeAutoSellViewModel$updateAutoSellState$1> continuation) {
        super(2, continuation);
        this.this$0 = tradeAutoSellViewModel;
        this.$chainId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TradeAutoSellViewModel$updateAutoSellState$1(this.this$0, this.$chainId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TradeAutoSellViewModel$updateAutoSellState$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00b2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0106  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00d3 -> B:31:0x00d8). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objKWHzl;
        List list;
        Object value;
        MutableStateFlow mutableStateFlow;
        TradeAutoSellViewModel tradeAutoSellViewModel;
        String str;
        Object obj2;
        List list2;
        Object objEZpvd;
        TradeAutoSellViewModel tradeAutoSellViewModel2;
        List list3;
        MutableStateFlow mutableStateFlow2;
        Object obj3;
        Object objOLrzqt;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            TradeAutoSellViewModel tradeAutoSellViewModel3 = this.this$0;
            this.label = 1;
            objKWHzl = tradeAutoSellViewModel3.KWHzl(this);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else if (i == 1) {
            C56391yDq.AEQbTJ(obj);
            objKWHzl = obj;
        } else if (i == 2) {
            List list4 = (List) this.L$5;
            Object obj4 = this.L$4;
            String str2 = (String) this.L$3;
            TradeAutoSellViewModel tradeAutoSellViewModel4 = (TradeAutoSellViewModel) this.L$2;
            MutableStateFlow mutableStateFlow3 = (MutableStateFlow) this.L$1;
            List list5 = (List) this.L$0;
            C56391yDq.AEQbTJ(obj);
            list2 = list5;
            objEZpvd = obj;
            obj2 = obj4;
            list3 = list4;
            mutableStateFlow2 = mutableStateFlow3;
            tradeAutoSellViewModel2 = tradeAutoSellViewModel4;
            str = str2;
            obj3 = obj2;
            gLQ glq = (gLQ) objEZpvd;
            this.L$0 = list2;
            this.L$1 = mutableStateFlow2;
            this.L$2 = tradeAutoSellViewModel2;
            this.L$3 = str;
            this.L$4 = obj3;
            this.L$5 = list3;
            this.L$6 = glq;
            this.label = 3;
            objOLrzqt = tradeAutoSellViewModel2.OLrzqt(str, this);
            if (objOLrzqt != objCopydefault) {
            }
        } else {
            if (i != 3) {
                if (i != 4 && i != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            gLQ glq2 = (gLQ) this.L$6;
            list3 = (List) this.L$5;
            obj3 = this.L$4;
            str = (String) this.L$3;
            tradeAutoSellViewModel2 = (TradeAutoSellViewModel) this.L$2;
            MutableStateFlow mutableStateFlow4 = (MutableStateFlow) this.L$1;
            list2 = (List) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = obj;
            if (!mutableStateFlow4.compareAndSet(obj3, new AbstractC30510lcX.StateListAnimator(list3, glq2, ((Boolean) objOLrzqt).booleanValue()))) {
                InterfaceC28149kQs interfaceC28149kQs = this.this$0.copydefault;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.label = 4;
                if (interfaceC28149kQs.KWHzl(true, this) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            }
            tradeAutoSellViewModel = tradeAutoSellViewModel2;
            mutableStateFlow = mutableStateFlow4;
            list = list2;
            Object value2 = mutableStateFlow.getValue();
            this.L$0 = list;
            this.L$1 = mutableStateFlow;
            this.L$2 = tradeAutoSellViewModel;
            this.L$3 = str;
            this.L$4 = value2;
            this.L$5 = list;
            this.L$6 = null;
            this.label = 2;
            objEZpvd = tradeAutoSellViewModel.EZpvd(str, this);
            if (objEZpvd != objCopydefault) {
                return objCopydefault;
            }
            list2 = list;
            mutableStateFlow2 = mutableStateFlow;
            list3 = list2;
            obj2 = value2;
            tradeAutoSellViewModel2 = tradeAutoSellViewModel;
            obj3 = obj2;
            gLQ glq3 = (gLQ) objEZpvd;
            this.L$0 = list2;
            this.L$1 = mutableStateFlow2;
            this.L$2 = tradeAutoSellViewModel2;
            this.L$3 = str;
            this.L$4 = obj3;
            this.L$5 = list3;
            this.L$6 = glq3;
            this.label = 3;
            objOLrzqt = tradeAutoSellViewModel2.OLrzqt(str, this);
            if (objOLrzqt != objCopydefault) {
                return objCopydefault;
            }
            mutableStateFlow4 = mutableStateFlow2;
            glq2 = glq3;
            if (!mutableStateFlow4.compareAndSet(obj3, new AbstractC30510lcX.StateListAnimator(list3, glq2, ((Boolean) objOLrzqt).booleanValue()))) {
            }
        }
        list = (List) objKWHzl;
        if (!list.isEmpty()) {
            mutableStateFlow = this.this$0.OLrzqt;
            tradeAutoSellViewModel = this.this$0;
            str = this.$chainId;
            Object value22 = mutableStateFlow.getValue();
            this.L$0 = list;
            this.L$1 = mutableStateFlow;
            this.L$2 = tradeAutoSellViewModel;
            this.L$3 = str;
            this.L$4 = value22;
            this.L$5 = list;
            this.L$6 = null;
            this.label = 2;
            objEZpvd = tradeAutoSellViewModel.EZpvd(str, this);
            if (objEZpvd != objCopydefault) {
            }
        } else {
            MutableStateFlow mutableStateFlow5 = this.this$0.OLrzqt;
            do {
                value = mutableStateFlow5.getValue();
            } while (!mutableStateFlow5.compareAndSet(value, AbstractC30510lcX.Activity.EZpvd));
            InterfaceC28149kQs interfaceC28149kQs2 = this.this$0.copydefault;
            this.label = 5;
            if (interfaceC28149kQs2.KWHzl(false, this) == objCopydefault) {
                return objCopydefault;
            }
            return Unit.INSTANCE;
        }
    }
}
