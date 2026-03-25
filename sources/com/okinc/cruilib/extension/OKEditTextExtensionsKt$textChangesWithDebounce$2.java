package com.okinc.cruilib.extension;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes8.dex */
public final class OKEditTextExtensionsKt$textChangesWithDebounce$2 extends SuspendLambda implements Function2<CharSequence, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<CharSequence, Unit> $action;
    /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.CharSequence, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OKEditTextExtensionsKt$textChangesWithDebounce$2(Function1<? super CharSequence, Unit> function1, Continuation<? super OKEditTextExtensionsKt$textChangesWithDebounce$2> continuation) {
        super(2, continuation);
        this.$action = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OKEditTextExtensionsKt$textChangesWithDebounce$2 oKEditTextExtensionsKt$textChangesWithDebounce$2 = new OKEditTextExtensionsKt$textChangesWithDebounce$2(this.$action, continuation);
        oKEditTextExtensionsKt$textChangesWithDebounce$2.L$0 = obj;
        return oKEditTextExtensionsKt$textChangesWithDebounce$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CharSequence charSequence, Continuation<? super Unit> continuation) {
        return ((OKEditTextExtensionsKt$textChangesWithDebounce$2) create(charSequence, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            this.$action.invoke((CharSequence) this.L$0);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
