package com.okinc.im.usecase.dialogmodel;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import o.C35772oDc;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.oCT;
import o.oGB;

/* JADX INFO: loaded from: classes8.dex */
public final class GetLeaveThisChatDialogModelUseCase$execute$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super C35772oDc>, Object> {
    final /* synthetic */ boolean $isSentMessage;
    final /* synthetic */ String $textInput;
    int label;
    final /* synthetic */ oCT this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetLeaveThisChatDialogModelUseCase$execute$2(oCT oct, String str, boolean z, Continuation<? super GetLeaveThisChatDialogModelUseCase$execute$2> continuation) {
        super(2, continuation);
        this.this$0 = oct;
        this.$textInput = str;
        this.$isSentMessage = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetLeaveThisChatDialogModelUseCase$execute$2(this.this$0, this.$textInput, this.$isSentMessage, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super C35772oDc> continuation) {
        return ((GetLeaveThisChatDialogModelUseCase$execute$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            boolean zKWHzl = this.this$0.OLrzqt.KWHzl();
            String strAEQbTJ = this.this$0.AEQbTJ.AEQbTJ();
            if (zKWHzl && strAEQbTJ != null && (((str = this.$textInput) == null || StringsKt__StringsKt.fARcdN((CharSequence) str)) && this.$isSentMessage)) {
                oGB ogb = this.this$0.EZpvd;
                this.label = 1;
                obj = ogb.EZpvd(strAEQbTJ, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            }
            return null;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(obj);
        if (!Intrinsics.EZpvd(obj, C56443yFo.KWHzl(true))) {
            return C35772oDc.KWHzl;
        }
        return null;
    }
}
