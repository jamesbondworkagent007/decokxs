package com.okinc.buysell.ui.bsc.view;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import o.C30019lIx;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class InputBoxWidgetV3$debounceNotifyTextChanged$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $text;
    int label;
    final /* synthetic */ C30019lIx this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputBoxWidgetV3$debounceNotifyTextChanged$1(C30019lIx c30019lIx, String str, Continuation<? super InputBoxWidgetV3$debounceNotifyTextChanged$1> continuation) {
        super(2, continuation);
        this.this$0 = c30019lIx;
        this.$text = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InputBoxWidgetV3$debounceNotifyTextChanged$1(this.this$0, this.$text, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InputBoxWidgetV3$debounceNotifyTextChanged$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!Intrinsics.EZpvd((Object) this.this$0.EZpvd, (Object) "0")) {
                this.label = 1;
                if (DelayKt.delay(500L, this) == objCopydefault) {
                    return objCopydefault;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        Function1 function1 = this.this$0.DbNXlk;
        if (function1 != null) {
            function1.invoke(this.$text);
        }
        return Unit.INSTANCE;
    }
}
