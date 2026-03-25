package com.okinc.buysell.domain;

import com.okinc.buysell.domain.BothTokenSwitchedUseCase;
import com.okinc.crcore.shared.net.responsebean.ConvertCurrencyBean;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C56390yDp;
import o.C56391yDq;
import o.C56442yFn;
import o.lyO;

/* JADX INFO: loaded from: classes18.dex */
public final class BothTokenSwitchedUseCase$invoke$2$1$deferredTasks$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Pair<? extends BothTokenSwitchedUseCase.ApiTask, ? extends List<? extends ConvertCurrencyBean>>>, Object> {
    final /* synthetic */ String $valuationUnit;
    Object L$0;
    int label;
    final /* synthetic */ BothTokenSwitchedUseCase this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BothTokenSwitchedUseCase$invoke$2$1$deferredTasks$1(BothTokenSwitchedUseCase bothTokenSwitchedUseCase, String str, Continuation<? super BothTokenSwitchedUseCase$invoke$2$1$deferredTasks$1> continuation) {
        super(2, continuation);
        this.this$0 = bothTokenSwitchedUseCase;
        this.$valuationUnit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BothTokenSwitchedUseCase$invoke$2$1$deferredTasks$1(this.this$0, this.$valuationUnit, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Pair<? extends BothTokenSwitchedUseCase.ApiTask, ? extends List<? extends ConvertCurrencyBean>>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Pair<? extends BothTokenSwitchedUseCase.ApiTask, ? extends List<ConvertCurrencyBean>>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Pair<? extends BothTokenSwitchedUseCase.ApiTask, ? extends List<ConvertCurrencyBean>>> continuation) {
        return ((BothTokenSwitchedUseCase$invoke$2$1$deferredTasks$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        BothTokenSwitchedUseCase.ApiTask apiTask;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            BothTokenSwitchedUseCase.ApiTask apiTask2 = BothTokenSwitchedUseCase.ApiTask.GET_CONVERT_FROM_LIST;
            lyO lyo = this.this$0.OLrzqt;
            String str = this.$valuationUnit;
            this.L$0 = apiTask2;
            this.label = 1;
            Object objInvoke$default = lyO.invoke$default(lyo, false, str, this, 1, null);
            if (objInvoke$default == objCopydefault) {
                return objCopydefault;
            }
            apiTask = apiTask2;
            obj = objInvoke$default;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apiTask = (BothTokenSwitchedUseCase.ApiTask) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        return C56390yDp.OLrzqt(apiTask, ((AbstractC43419rot) obj).AEQbTJ());
    }
}
