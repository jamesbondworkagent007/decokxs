package com.okinc.business.defi.biz.impl;

import com.okinc.business.defi.api.bean.ActivateTeeGuideModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AbstractC12782ctV;
import o.AbstractC58260yxt;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC13426dKx;

/* JADX INFO: loaded from: classes4.dex */
public final class OKWalletDeFiTEEAccountServiceImpl$startGeneralActivateSA$2$wallet$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AbstractC12782ctV>, Object> {
    final /* synthetic */ ActivateTeeGuideModel $teeParam;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKWalletDeFiTEEAccountServiceImpl$startGeneralActivateSA$2$wallet$1(ActivateTeeGuideModel activateTeeGuideModel, Continuation<? super OKWalletDeFiTEEAccountServiceImpl$startGeneralActivateSA$2$wallet$1> continuation) {
        super(2, continuation);
        this.$teeParam = activateTeeGuideModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OKWalletDeFiTEEAccountServiceImpl$startGeneralActivateSA$2$wallet$1(this.$teeParam, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super AbstractC12782ctV> continuation) {
        return ((OKWalletDeFiTEEAccountServiceImpl$startGeneralActivateSA$2$wallet$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtOLrzqt = InterfaceC13426dKx.TaskDescription.getInstance$default(InterfaceC13426dKx.Companion, null, 1, null).OcIXYQ().OLrzqt(this.$teeParam.getAccountId(), false);
            this.label = 1;
            obj = RxAwaitKt.await(abstractC58260yxtOLrzqt, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return obj;
    }
}
