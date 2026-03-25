package com.okinc.business.dex.tee.common.viewmodel;

import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.AbstractC30510lcX;
import o.C28165kRh;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC28149kQs;
import o.gLQ;
import o.pUU;

/* JADX INFO: loaded from: classes5.dex */
public final class TradeAutoSellViewModel$restoreAutoSellCheckboxState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
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
    public TradeAutoSellViewModel$restoreAutoSellCheckboxState$1(TradeAutoSellViewModel tradeAutoSellViewModel, String str, Continuation<? super TradeAutoSellViewModel$restoreAutoSellCheckboxState$1> continuation) {
        super(2, continuation);
        this.this$0 = tradeAutoSellViewModel;
        this.$chainId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TradeAutoSellViewModel$restoreAutoSellCheckboxState$1(this.this$0, this.$chainId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TradeAutoSellViewModel$restoreAutoSellCheckboxState$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x014d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x011d -> B:43:0x0120). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Object value2;
        List list;
        Object value3;
        MutableStateFlow mutableStateFlow;
        TradeAutoSellViewModel tradeAutoSellViewModel;
        String str;
        List list2;
        MutableStateFlow mutableStateFlow2;
        TradeAutoSellViewModel tradeAutoSellViewModel2;
        String str2;
        Object obj2;
        List list3;
        gLQ glq;
        Object objEZpvd;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.this$0.KWHzl.KWHzl()) {
                C28165kRh c28165kRh = this.this$0.KWHzl;
                this.label = 1;
                if (c28165kRh.AEQbTJ(this) == objCopydefault) {
                    return objCopydefault;
                }
            }
        } else if (i == 1) {
            C56391yDq.AEQbTJ(obj);
            ((Result) obj).m7386unboximpl();
        } else if (i == 2) {
            C56391yDq.AEQbTJ(obj);
            if (!((Boolean) obj).booleanValue()) {
                InterfaceC28149kQs interfaceC28149kQs = this.this$0.copydefault;
                this.label = 3;
                obj = interfaceC28149kQs.OLrzqt(this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                list = (List) obj;
                if (!(!list.isEmpty())) {
                }
            } else {
                MutableStateFlow mutableStateFlow3 = this.this$0.OLrzqt;
                do {
                    value2 = mutableStateFlow3.getValue();
                } while (!mutableStateFlow3.compareAndSet(value2, AbstractC30510lcX.Activity.EZpvd));
                return Unit.INSTANCE;
            }
        } else {
            if (i != 3) {
                if (i == 4) {
                    List list4 = (List) this.L$5;
                    Object obj3 = this.L$4;
                    String str3 = (String) this.L$3;
                    TradeAutoSellViewModel tradeAutoSellViewModel3 = (TradeAutoSellViewModel) this.L$2;
                    MutableStateFlow mutableStateFlow4 = (MutableStateFlow) this.L$1;
                    List list5 = (List) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    list2 = list5;
                    mutableStateFlow2 = mutableStateFlow4;
                    tradeAutoSellViewModel2 = tradeAutoSellViewModel3;
                    str2 = str3;
                    obj2 = obj3;
                    list3 = list4;
                    glq = (gLQ) obj;
                    this.L$0 = list2;
                    this.L$1 = mutableStateFlow2;
                    this.L$2 = tradeAutoSellViewModel2;
                    this.L$3 = str2;
                    this.L$4 = obj2;
                    this.L$5 = list3;
                    this.L$6 = glq;
                    this.label = 5;
                    obj = tradeAutoSellViewModel2.OLrzqt(str2, this);
                    if (obj == objCopydefault) {
                    }
                    if (!mutableStateFlow2.compareAndSet(obj2, new AbstractC30510lcX.StateListAnimator(list3, glq, ((Boolean) obj).booleanValue()))) {
                    }
                    return Unit.INSTANCE;
                }
                if (i != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                glq = (gLQ) this.L$6;
                list3 = (List) this.L$5;
                obj2 = this.L$4;
                str2 = (String) this.L$3;
                tradeAutoSellViewModel2 = (TradeAutoSellViewModel) this.L$2;
                mutableStateFlow2 = (MutableStateFlow) this.L$1;
                list2 = (List) this.L$0;
                C56391yDq.AEQbTJ(obj);
                if (!mutableStateFlow2.compareAndSet(obj2, new AbstractC30510lcX.StateListAnimator(list3, glq, ((Boolean) obj).booleanValue()))) {
                    str = str2;
                    tradeAutoSellViewModel = tradeAutoSellViewModel2;
                    mutableStateFlow = mutableStateFlow2;
                    list = list2;
                    Object value4 = mutableStateFlow.getValue();
                    this.L$0 = list;
                    this.L$1 = mutableStateFlow;
                    this.L$2 = tradeAutoSellViewModel;
                    this.L$3 = str;
                    this.L$4 = value4;
                    this.L$5 = list;
                    this.L$6 = null;
                    this.label = 4;
                    objEZpvd = tradeAutoSellViewModel.EZpvd(str, this);
                    if (objEZpvd != objCopydefault) {
                        return objCopydefault;
                    }
                    list2 = list;
                    mutableStateFlow2 = mutableStateFlow;
                    obj = objEZpvd;
                    tradeAutoSellViewModel2 = tradeAutoSellViewModel;
                    list3 = list2;
                    str2 = str;
                    obj2 = value4;
                    glq = (gLQ) obj;
                    this.L$0 = list2;
                    this.L$1 = mutableStateFlow2;
                    this.L$2 = tradeAutoSellViewModel2;
                    this.L$3 = str2;
                    this.L$4 = obj2;
                    this.L$5 = list3;
                    this.L$6 = glq;
                    this.label = 5;
                    obj = tradeAutoSellViewModel2.OLrzqt(str2, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                    if (!mutableStateFlow2.compareAndSet(obj2, new AbstractC30510lcX.StateListAnimator(list3, glq, ((Boolean) obj).booleanValue()))) {
                    }
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            list = (List) obj;
            if (!(!list.isEmpty())) {
                mutableStateFlow = this.this$0.OLrzqt;
                tradeAutoSellViewModel = this.this$0;
                str = this.$chainId;
                Object value42 = mutableStateFlow.getValue();
                this.L$0 = list;
                this.L$1 = mutableStateFlow;
                this.L$2 = tradeAutoSellViewModel;
                this.L$3 = str;
                this.L$4 = value42;
                this.L$5 = list;
                this.L$6 = null;
                this.label = 4;
                objEZpvd = tradeAutoSellViewModel.EZpvd(str, this);
                if (objEZpvd != objCopydefault) {
                }
            } else {
                MutableStateFlow mutableStateFlow5 = this.this$0.OLrzqt;
                do {
                    value3 = mutableStateFlow5.getValue();
                } while (!mutableStateFlow5.compareAndSet(value3, AbstractC30510lcX.Activity.EZpvd));
                return Unit.INSTANCE;
            }
        }
        boolean zOLrzqt = this.this$0.KWHzl.OLrzqt(this.$chainId);
        if (!this.this$0.OLrzqt() || !zOLrzqt) {
            pUU.KWHzl("TradeAutoSellViewModel", "Auto-sell unavailable. Reason: isSAFeatureEnabled: " + this.this$0.OLrzqt() + ", supported: " + zOLrzqt);
            MutableStateFlow mutableStateFlow6 = this.this$0.OLrzqt;
            do {
                value = mutableStateFlow6.getValue();
            } while (!mutableStateFlow6.compareAndSet(value, AbstractC30510lcX.TaskDescription.EZpvd));
            return Unit.INSTANCE;
        }
        InterfaceC28149kQs interfaceC28149kQs2 = this.this$0.copydefault;
        this.label = 2;
        obj = interfaceC28149kQs2.AEQbTJ(this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }
}
