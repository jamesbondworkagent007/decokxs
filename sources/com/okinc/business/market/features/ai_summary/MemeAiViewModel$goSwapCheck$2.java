package com.okinc.business.market.features.ai_summary;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C25624jAh;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC25627jAk;

/* JADX INFO: loaded from: classes6.dex */
public final class MemeAiViewModel$goSwapCheck$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chainId;
    final /* synthetic */ String $tokenContractAddress;
    int label;
    final /* synthetic */ MemeAiViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemeAiViewModel$goSwapCheck$2(MemeAiViewModel memeAiViewModel, String str, String str2, Continuation<? super MemeAiViewModel$goSwapCheck$2> continuation) {
        super(2, continuation);
        this.this$0 = memeAiViewModel;
        this.$chainId = str;
        this.$tokenContractAddress = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MemeAiViewModel$goSwapCheck$2(this.this$0, this.$chainId, this.$tokenContractAddress, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MemeAiViewModel$goSwapCheck$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objEZpvd;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C25624jAh c25624jAh = this.this$0.AhwBna;
            String str = this.$chainId;
            String str2 = this.$tokenContractAddress;
            this.label = 1;
            objEZpvd = c25624jAh.EZpvd(str, str2, this);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objEZpvd = ((Result) obj).m7386unboximpl();
        }
        MemeAiViewModel memeAiViewModel = this.this$0;
        if (Result.m7384isSuccessimpl(objEZpvd)) {
            memeAiViewModel.EZpvd.postValue((InterfaceC25627jAk) objEZpvd);
        }
        return Unit.INSTANCE;
    }
}
