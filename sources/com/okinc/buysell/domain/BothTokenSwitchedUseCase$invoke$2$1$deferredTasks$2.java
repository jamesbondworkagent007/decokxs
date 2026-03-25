package com.okinc.buysell.domain;

import com.okinc.buysell.domain.BothTokenSwitchedUseCase;
import com.okinc.crcore.shared.net.responsebean.ConvertCurrencyBean;
import com.okinc.network.okg.response.OKServerException;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C56390yDp;
import o.C56391yDq;
import o.C56442yFn;
import o.lyV;

/* JADX INFO: loaded from: classes18.dex */
public final class BothTokenSwitchedUseCase$invoke$2$1$deferredTasks$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Pair<? extends BothTokenSwitchedUseCase.ApiTask, ? extends AbstractC43419rot<? extends List<? extends ConvertCurrencyBean>, ? extends OKServerException>>>, Object> {
    final /* synthetic */ Ref.ObjectRef<ConvertCurrencyBean> $newFromToken;
    final /* synthetic */ String $valuationUnit;
    Object L$0;
    int label;
    final /* synthetic */ BothTokenSwitchedUseCase this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BothTokenSwitchedUseCase$invoke$2$1$deferredTasks$2(BothTokenSwitchedUseCase bothTokenSwitchedUseCase, Ref.ObjectRef<ConvertCurrencyBean> objectRef, String str, Continuation<? super BothTokenSwitchedUseCase$invoke$2$1$deferredTasks$2> continuation) {
        super(2, continuation);
        this.this$0 = bothTokenSwitchedUseCase;
        this.$newFromToken = objectRef;
        this.$valuationUnit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BothTokenSwitchedUseCase$invoke$2$1$deferredTasks$2(this.this$0, this.$newFromToken, this.$valuationUnit, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Pair<? extends BothTokenSwitchedUseCase.ApiTask, ? extends AbstractC43419rot<? extends List<? extends ConvertCurrencyBean>, ? extends OKServerException>>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Pair<? extends BothTokenSwitchedUseCase.ApiTask, ? extends AbstractC43419rot<? extends List<ConvertCurrencyBean>, OKServerException>>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Pair<? extends BothTokenSwitchedUseCase.ApiTask, ? extends AbstractC43419rot<? extends List<ConvertCurrencyBean>, OKServerException>>> continuation) {
        return ((BothTokenSwitchedUseCase$invoke$2$1$deferredTasks$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        BothTokenSwitchedUseCase.ApiTask apiTask;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            BothTokenSwitchedUseCase.ApiTask apiTask2 = BothTokenSwitchedUseCase.ApiTask.GET_CONVERT_TO_LIST;
            lyV lyv = this.this$0.AEQbTJ;
            String ccy = this.$newFromToken.element.getCcy();
            String str = this.$valuationUnit;
            this.L$0 = apiTask2;
            this.label = 1;
            Object objInvoke$default = lyV.invoke$default(lyv, false, ccy, str, this, 1, null);
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
        return C56390yDp.OLrzqt(apiTask, obj);
    }
}
