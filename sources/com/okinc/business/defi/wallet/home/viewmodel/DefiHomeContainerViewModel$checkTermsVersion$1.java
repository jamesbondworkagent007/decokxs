package com.okinc.business.defi.wallet.home.viewmodel;

import androidx.lifecycle.MutableLiveData;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C18814fpX;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes5.dex */
public final class DefiHomeContainerViewModel$checkTermsVersion$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DefiHomeContainerViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiHomeContainerViewModel$checkTermsVersion$1(DefiHomeContainerViewModel defiHomeContainerViewModel, Continuation<? super DefiHomeContainerViewModel$checkTermsVersion$1> continuation) {
        super(2, continuation);
        this.this$0 = defiHomeContainerViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DefiHomeContainerViewModel$checkTermsVersion$1 defiHomeContainerViewModel$checkTermsVersion$1 = new DefiHomeContainerViewModel$checkTermsVersion$1(this.this$0, continuation);
        defiHomeContainerViewModel$checkTermsVersion$1.L$0 = obj;
        return defiHomeContainerViewModel$checkTermsVersion$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefiHomeContainerViewModel$checkTermsVersion$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objAEQbTJ;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                DefiHomeContainerViewModel defiHomeContainerViewModel = this.this$0;
                Result.Application application = Result.Companion;
                C18814fpX c18814fpX = defiHomeContainerViewModel.OLrzqt;
                this.label = 1;
                objAEQbTJ = c18814fpX.AEQbTJ(this);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objAEQbTJ = ((Result) obj).m7386unboximpl();
            }
            objM7377constructorimpl = Result.m7377constructorimpl(Result.m7376boximpl(objAEQbTJ));
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        DefiHomeContainerViewModel defiHomeContainerViewModel2 = this.this$0;
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            Object objM7386unboximpl = ((Result) objM7377constructorimpl).m7386unboximpl();
            MutableLiveData mutableLiveData = defiHomeContainerViewModel2.EZpvd;
            if (Result.m7383isFailureimpl(objM7386unboximpl)) {
                objM7386unboximpl = null;
            }
            mutableLiveData.postValue(objM7386unboximpl);
        }
        return Unit.INSTANCE;
    }
}
