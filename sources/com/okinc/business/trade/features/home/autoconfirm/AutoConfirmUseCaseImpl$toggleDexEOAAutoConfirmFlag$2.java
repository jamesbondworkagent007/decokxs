package com.okinc.business.trade.features.home.autoconfirm;

import android.content.SharedPreferences;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.kTV;

/* JADX INFO: loaded from: classes7.dex */
public final class AutoConfirmUseCaseImpl$toggleDexEOAAutoConfirmFlag$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ kTV this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoConfirmUseCaseImpl$toggleDexEOAAutoConfirmFlag$2(kTV ktv, Continuation<? super AutoConfirmUseCaseImpl$toggleDexEOAAutoConfirmFlag$2> continuation) {
        super(2, continuation);
        this.this$0 = ktv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AutoConfirmUseCaseImpl$toggleDexEOAAutoConfirmFlag$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AutoConfirmUseCaseImpl$toggleDexEOAAutoConfirmFlag$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            boolean z = this.this$0.AEQbTJ.getBoolean("key_dex_eoa_auto_confirm_flag", false);
            SharedPreferences.Editor editorEdit = this.this$0.AEQbTJ.edit();
            Intrinsics.checkNotNullExpressionValue(editorEdit, "");
            editorEdit.putBoolean("key_dex_eoa_auto_confirm_flag", !z);
            editorEdit.apply();
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
