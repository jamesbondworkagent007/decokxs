package com.okinc.im.imui.broadcastmessages.sendconfirmationdialog;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.okinc.im.imui.messageV2.model.StringResource;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C35445nvW;
import o.C36563odN;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes15.dex */
public final class SendConfirmationDialogFragment$onCreate$2 extends SuspendLambda implements Function2<StringResource, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C35445nvW this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendConfirmationDialogFragment$onCreate$2(C35445nvW c35445nvW, Continuation<? super SendConfirmationDialogFragment$onCreate$2> continuation) {
        super(2, continuation);
        this.this$0 = c35445nvW;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SendConfirmationDialogFragment$onCreate$2 sendConfirmationDialogFragment$onCreate$2 = new SendConfirmationDialogFragment$onCreate$2(this.this$0, continuation);
        sendConfirmationDialogFragment$onCreate$2.L$0 = obj;
        return sendConfirmationDialogFragment$onCreate$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(StringResource stringResource, Continuation<? super Unit> continuation) {
        return ((SendConfirmationDialogFragment$onCreate$2) create(stringResource, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            StringResource stringResource = (StringResource) this.L$0;
            Context contextRequireContext = this.this$0.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            C55326xho.toast$default(C36563odN.AEQbTJ(stringResource, contextRequireContext), (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
