package com.okinc.business.trade.features.home.advanced.viewmodel;

import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.kQF;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedPlaceOrderVM$bindDelegateCallbacks$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $amount;
    final /* synthetic */ DexMultiTokenInfoBean $fromToken;
    final /* synthetic */ String $platformId;
    int label;
    final /* synthetic */ AdvancedPlaceOrderVM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedPlaceOrderVM$bindDelegateCallbacks$1$1(AdvancedPlaceOrderVM advancedPlaceOrderVM, String str, DexMultiTokenInfoBean dexMultiTokenInfoBean, String str2, Continuation<? super AdvancedPlaceOrderVM$bindDelegateCallbacks$1$1> continuation) {
        super(2, continuation);
        this.this$0 = advancedPlaceOrderVM;
        this.$amount = str;
        this.$fromToken = dexMultiTokenInfoBean;
        this.$platformId = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdvancedPlaceOrderVM$bindDelegateCallbacks$1$1(this.this$0, this.$amount, this.$fromToken, this.$platformId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AdvancedPlaceOrderVM$bindDelegateCallbacks$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            kQF kqf = this.this$0.hDKMBd;
            String str = this.$amount;
            DexMultiTokenInfoBean dexMultiTokenInfoBean = this.$fromToken;
            String str2 = this.$platformId;
            if (str2.length() == 0) {
                str2 = "11";
            }
            this.label = 1;
            if (kqf.copydefault(str, dexMultiTokenInfoBean, str2, this) == objCopydefault) {
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
