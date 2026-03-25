package com.okinc.business.trade.features.home.advanced.viewmodel;

import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.trade.features.home.ui.cefi.data.ValidateTokensRequest;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C30798lhu;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedPlaceOrderVM$performTokenValidation$1$outcome$1 extends SuspendLambda implements Function2<ValidateTokensRequest, Continuation<? super Result<? extends Pair<? extends DexMultiTokenInfoBean, ? extends DexMultiTokenInfoBean>>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AdvancedPlaceOrderVM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedPlaceOrderVM$performTokenValidation$1$outcome$1(AdvancedPlaceOrderVM advancedPlaceOrderVM, Continuation<? super AdvancedPlaceOrderVM$performTokenValidation$1$outcome$1> continuation) {
        super(2, continuation);
        this.this$0 = advancedPlaceOrderVM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AdvancedPlaceOrderVM$performTokenValidation$1$outcome$1 advancedPlaceOrderVM$performTokenValidation$1$outcome$1 = new AdvancedPlaceOrderVM$performTokenValidation$1$outcome$1(this.this$0, continuation);
        advancedPlaceOrderVM$performTokenValidation$1$outcome$1.L$0 = obj;
        return advancedPlaceOrderVM$performTokenValidation$1$outcome$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(ValidateTokensRequest validateTokensRequest, Continuation<? super Result<Pair<DexMultiTokenInfoBean, DexMultiTokenInfoBean>>> continuation) {
        return ((AdvancedPlaceOrderVM$performTokenValidation$1$outcome$1) create(validateTokensRequest, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(ValidateTokensRequest validateTokensRequest, Continuation<? super Result<? extends Pair<? extends DexMultiTokenInfoBean, ? extends DexMultiTokenInfoBean>>> continuation) {
        return invoke2(validateTokensRequest, (Continuation<? super Result<Pair<DexMultiTokenInfoBean, DexMultiTokenInfoBean>>>) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objAEQbTJ;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            ValidateTokensRequest validateTokensRequest = (ValidateTokensRequest) this.L$0;
            C30798lhu c30798lhu = this.this$0.RlQdEF;
            this.label = 1;
            objAEQbTJ = c30798lhu.AEQbTJ(validateTokensRequest, this);
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
        return Result.m7376boximpl(objAEQbTJ);
    }
}
