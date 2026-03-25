package com.okinc.im.usecase.dialogmodel;

import android.content.SharedPreferences;
import com.okinc.im.usecase.dialogmodel.RecordSendConfirmationDialogShowAlreadyUseCase$execute$2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.oCX;
import o.oGC;

/* JADX INFO: loaded from: classes8.dex */
public final class RecordSendConfirmationDialogShowAlreadyUseCase$execute$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ oCX this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecordSendConfirmationDialogShowAlreadyUseCase$execute$2(oCX ocx, Continuation<? super RecordSendConfirmationDialogShowAlreadyUseCase$execute$2> continuation) {
        super(2, continuation);
        this.this$0 = ocx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RecordSendConfirmationDialogShowAlreadyUseCase$execute$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RecordSendConfirmationDialogShowAlreadyUseCase$execute$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            boolean zKWHzl = this.this$0.KWHzl.KWHzl();
            final String strKWHzl = this.this$0.EZpvd.KWHzl();
            if (zKWHzl && strKWHzl != null && !StringsKt__StringsKt.fARcdN((CharSequence) strKWHzl)) {
                oGC ogc = this.this$0.copydefault;
                Function1<? super SharedPreferences.Editor, Unit> function1 = new Function1() { // from class: o.oCZ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return RecordSendConfirmationDialogShowAlreadyUseCase$execute$2.invokeSuspend$lambda$0(strKWHzl, (SharedPreferences.Editor) obj2);
                    }
                };
                this.label = 1;
                if (ogc.OLrzqt(function1, this) == objCopydefault) {
                    return objCopydefault;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(String str, SharedPreferences.Editor editor) {
        editor.putBoolean(str, true);
        return Unit.INSTANCE;
    }
}
