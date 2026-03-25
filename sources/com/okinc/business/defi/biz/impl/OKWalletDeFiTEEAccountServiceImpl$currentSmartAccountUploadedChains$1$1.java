package com.okinc.business.defi.biz.impl;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC12782ctV;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC13426dKx;
import o.fVJ;

/* JADX INFO: loaded from: classes4.dex */
public final class OKWalletDeFiTEEAccountServiceImpl$currentSmartAccountUploadedChains$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AbstractC12782ctV $it;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKWalletDeFiTEEAccountServiceImpl$currentSmartAccountUploadedChains$1$1(AbstractC12782ctV abstractC12782ctV, Continuation<? super OKWalletDeFiTEEAccountServiceImpl$currentSmartAccountUploadedChains$1$1> continuation) {
        super(2, continuation);
        this.$it = abstractC12782ctV;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OKWalletDeFiTEEAccountServiceImpl$currentSmartAccountUploadedChains$1$1(this.$it, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OKWalletDeFiTEEAccountServiceImpl$currentSmartAccountUploadedChains$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            fVJ fieldNames = InterfaceC13426dKx.TaskDescription.getInstance$default(InterfaceC13426dKx.Companion, null, 1, null).getFieldNames();
            String strDbNXlk = this.$it.DbNXlk();
            String strEjfBZ = this.$it.ejfBZ();
            this.label = 1;
            if (fieldNames.AEQbTJ(strDbNXlk, strEjfBZ, false, true, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
