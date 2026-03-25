package com.okinc.business.trade.features.home.advanced.viewmodel;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C30806liB;
import o.C30808liD;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC30595leC;
import o.kQV;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedPlaceOrderVM$updateSettingModel$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C30806liB $settingModel;
    Object L$0;
    int label;
    final /* synthetic */ AdvancedPlaceOrderVM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedPlaceOrderVM$updateSettingModel$1(AdvancedPlaceOrderVM advancedPlaceOrderVM, C30806liB c30806liB, Continuation<? super AdvancedPlaceOrderVM$updateSettingModel$1> continuation) {
        super(2, continuation);
        this.this$0 = advancedPlaceOrderVM;
        this.$settingModel = c30806liB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdvancedPlaceOrderVM$updateSettingModel$1(this.this$0, this.$settingModel, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AdvancedPlaceOrderVM$updateSettingModel$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AdvancedPlaceOrderVM advancedPlaceOrderVM;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.AuCTel.setValue(this.$settingModel.copydefault());
            this.this$0.EZpvd(this.$settingModel.copydefault());
            AdvancedPlaceOrderVM advancedPlaceOrderVM2 = this.this$0;
            kQV kqv = advancedPlaceOrderVM2.ORxRYg;
            C30808liD c30808liD = (C30808liD) this.this$0.AuCTel.getValue();
            this.L$0 = advancedPlaceOrderVM2;
            this.label = 1;
            Object objKWHzl = kqv.KWHzl(c30808liD, this);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            advancedPlaceOrderVM = advancedPlaceOrderVM2;
            obj = objKWHzl;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            advancedPlaceOrderVM = (AdvancedPlaceOrderVM) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        advancedPlaceOrderVM.EZpvd((InterfaceC30595leC) obj);
        return Unit.INSTANCE;
    }
}
