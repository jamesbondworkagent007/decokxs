package com.okinc.business.trade.features.home.advanced.viewmodel;

import android.os.Bundle;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.trade.features.home.advanced.viewmodel.AdvancedPlaceOrderVM$handleSubmitApproval$1;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedApproveState;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractActivityC33041mov;
import o.C25389ivm;
import o.C56391yDq;
import o.C56442yFn;
import o.kQF;

/* JADX INFO: loaded from: classes23.dex */
public final class AdvancedPlaceOrderVM$handleSubmitApproval$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AbstractActivityC33041mov $activity;
    final /* synthetic */ AdvancedApproveState $state;
    int label;
    final /* synthetic */ AdvancedPlaceOrderVM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedPlaceOrderVM$handleSubmitApproval$1(AdvancedPlaceOrderVM advancedPlaceOrderVM, AbstractActivityC33041mov abstractActivityC33041mov, AdvancedApproveState advancedApproveState, Continuation<? super AdvancedPlaceOrderVM$handleSubmitApproval$1> continuation) {
        super(2, continuation);
        this.this$0 = advancedPlaceOrderVM;
        this.$activity = abstractActivityC33041mov;
        this.$state = advancedApproveState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdvancedPlaceOrderVM$handleSubmitApproval$1(this.this$0, this.$activity, this.$state, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AdvancedPlaceOrderVM$handleSubmitApproval$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            final DexMultiTokenInfoBean value = this.this$0.ejfBZ().getValue();
            if (value == null) {
                return Unit.INSTANCE;
            }
            kQF kqf = this.this$0.hDKMBd;
            AbstractActivityC33041mov abstractActivityC33041mov = this.$activity;
            AdvancedApproveState advancedApproveState = this.$state;
            String str = (String) this.this$0.ejfBZ.getValue();
            String strEZpvd = this.this$0.DTwDnp.EZpvd();
            final AdvancedPlaceOrderVM advancedPlaceOrderVM = this.this$0;
            Function1<? super Bundle, Unit> function1 = new Function1() { // from class: o.kTh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return AdvancedPlaceOrderVM$handleSubmitApproval$1.invokeSuspend$lambda$0(advancedPlaceOrderVM, value, (android.os.Bundle) obj2);
                }
            };
            this.label = 1;
            if (kqf.KWHzl(abstractActivityC33041mov, advancedApproveState, value, str, strEZpvd, function1, this) == objCopydefault) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(AdvancedPlaceOrderVM advancedPlaceOrderVM, DexMultiTokenInfoBean dexMultiTokenInfoBean, Bundle bundle) {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(advancedPlaceOrderVM), null, null, new AdvancedPlaceOrderVM$handleSubmitApproval$1$1$1(advancedPlaceOrderVM, dexMultiTokenInfoBean, null), 3, null);
        return Unit.INSTANCE;
    }
}
