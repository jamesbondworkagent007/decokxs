package com.okinc.im.usecase.dialogmodel;

import android.content.SharedPreferences;
import com.okinc.im.usecase.dialogmodel.RecordLeaveThisChatDialogShowAlreadyUseCase$execute$2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.oCY;
import o.oGC;

/* JADX INFO: loaded from: classes8.dex */
public final class RecordLeaveThisChatDialogShowAlreadyUseCase$execute$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ oCY this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecordLeaveThisChatDialogShowAlreadyUseCase$execute$2(oCY ocy, Continuation<? super RecordLeaveThisChatDialogShowAlreadyUseCase$execute$2> continuation) {
        super(2, continuation);
        this.this$0 = ocy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RecordLeaveThisChatDialogShowAlreadyUseCase$execute$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RecordLeaveThisChatDialogShowAlreadyUseCase$execute$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            boolean zKWHzl = this.this$0.OLrzqt.KWHzl();
            final String strAEQbTJ = this.this$0.EZpvd.AEQbTJ();
            if (zKWHzl && strAEQbTJ != null && !StringsKt__StringsKt.fARcdN((CharSequence) strAEQbTJ)) {
                oGC ogc = this.this$0.AEQbTJ;
                Function1<? super SharedPreferences.Editor, Unit> function1 = new Function1() { // from class: o.oCW
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return RecordLeaveThisChatDialogShowAlreadyUseCase$execute$2.invokeSuspend$lambda$0(strAEQbTJ, (SharedPreferences.Editor) obj2);
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
