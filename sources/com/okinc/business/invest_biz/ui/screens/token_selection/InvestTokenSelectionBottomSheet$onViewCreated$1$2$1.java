package com.okinc.business.invest_biz.ui.screens.token_selection;

import android.text.Editable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C26601jfR;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes15.dex */
public final class InvestTokenSelectionBottomSheet$onViewCreated$1$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Editable $it;
    int label;
    final /* synthetic */ C26601jfR this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestTokenSelectionBottomSheet$onViewCreated$1$2$1(C26601jfR c26601jfR, Editable editable, Continuation<? super InvestTokenSelectionBottomSheet$onViewCreated$1$2$1> continuation) {
        super(2, continuation);
        this.this$0 = c26601jfR;
        this.$it = editable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestTokenSelectionBottomSheet$onViewCreated$1$2$1(this.this$0, this.$it, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InvestTokenSelectionBottomSheet$onViewCreated$1$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableSharedFlow mutableSharedFlow = this.this$0.AhwBna;
            Editable editable = this.$it;
            String string = editable != null ? editable.toString() : null;
            if (string == null) {
                string = "";
            }
            this.label = 1;
            if (mutableSharedFlow.emit(string, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
