package com.okinc.business.market.features.meme.ui;

import com.okinc.business.market.features.meme.domain.model.ConfigInfoData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC28637keY;
import o.InterfaceC28911kjh;
import o.InterfaceC28912kji;
import o.yHO;

/* JADX INFO: loaded from: classes7.dex */
public final class MemeActivityViewModelV2$networkListStateFlow$2 extends SuspendLambda implements yHO<InterfaceC28912kji, InterfaceC28637keY, Continuation<? super InterfaceC28911kjh>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ MemeActivityViewModelV2 this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemeActivityViewModelV2$networkListStateFlow$2(MemeActivityViewModelV2 memeActivityViewModelV2, Continuation<? super MemeActivityViewModelV2$networkListStateFlow$2> continuation) {
        super(3, continuation);
        this.this$0 = memeActivityViewModelV2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(InterfaceC28912kji interfaceC28912kji, InterfaceC28637keY interfaceC28637keY, Continuation<? super InterfaceC28911kjh> continuation) {
        MemeActivityViewModelV2$networkListStateFlow$2 memeActivityViewModelV2$networkListStateFlow$2 = new MemeActivityViewModelV2$networkListStateFlow$2(this.this$0, continuation);
        memeActivityViewModelV2$networkListStateFlow$2.L$0 = interfaceC28912kji;
        memeActivityViewModelV2$networkListStateFlow$2.L$1 = interfaceC28637keY;
        return memeActivityViewModelV2$networkListStateFlow$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC28912kji interfaceC28912kji = (InterfaceC28912kji) this.L$0;
            InterfaceC28637keY interfaceC28637keY = (InterfaceC28637keY) this.L$1;
            if (interfaceC28637keY instanceof InterfaceC28637keY.Activity) {
                MemePumpUseCase memePumpUseCase = this.this$0.values;
                ConfigInfoData configInfoDataOLrzqt = ((InterfaceC28637keY.Activity) interfaceC28637keY).OLrzqt();
                this.L$0 = null;
                this.label = 1;
                obj = memePumpUseCase.KWHzl(interfaceC28912kji, configInfoDataOLrzqt, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                return InterfaceC28911kjh.Application.AEQbTJ;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return (InterfaceC28911kjh) obj;
    }
}
