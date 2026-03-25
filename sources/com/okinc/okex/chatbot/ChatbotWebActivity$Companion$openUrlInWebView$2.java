package com.okinc.okex.chatbot;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes10.dex */
public final class ChatbotWebActivity$Companion$openUrlInWebView$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ Intent $intent;
    final /* synthetic */ Integer $requestCode;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatbotWebActivity$Companion$openUrlInWebView$2(Integer num, Context context, Intent intent, Continuation<? super ChatbotWebActivity$Companion$openUrlInWebView$2> continuation) {
        super(2, continuation);
        this.$requestCode = num;
        this.$context = context;
        this.$intent = intent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatbotWebActivity$Companion$openUrlInWebView$2(this.$requestCode, this.$context, this.$intent, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChatbotWebActivity$Companion$openUrlInWebView$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            Integer num = this.$requestCode;
            if (num != null) {
                Context context = this.$context;
                if (context instanceof Activity) {
                    ((Activity) context).startActivityForResult(this.$intent, num.intValue());
                } else {
                    Context context2 = this.$context;
                    if (!(context2 instanceof Activity)) {
                        this.$intent.setFlags(268435456);
                        this.$context.startActivity(this.$intent);
                    } else {
                        ((Activity) context2).startActivity(this.$intent);
                    }
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
