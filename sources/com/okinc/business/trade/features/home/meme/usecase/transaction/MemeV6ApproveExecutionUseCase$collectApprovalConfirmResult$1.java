package com.okinc.business.trade.features.home.meme.usecase.transaction;

import android.os.Bundle;
import com.okinc.business.trade.features.home.meme.usecase.transaction.MemeV6ApproveExecutionUseCase;
import com.okinc.business.trade.features.home.meme.usecase.transaction.MemeV6ApproveExecutionUseCase$collectApprovalConfirmResult$1;
import com.okinc.business.trade.features.home.ui.meme.statepool.SwapState;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.SendChannel;
import o.AbstractC32996moC;
import o.C56391yDq;
import o.C56442yFn;
import o.kWG;

/* JADX INFO: loaded from: classes7.dex */
public final class MemeV6ApproveExecutionUseCase$collectApprovalConfirmResult$1 extends SuspendLambda implements Function2<ProducerScope<? super Bundle>, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $cancelApproveTag;
    final /* synthetic */ Function1<Bundle, Unit> $onApproveCallback;
    final /* synthetic */ MemeV6ApproveExecutionUseCase.ApproveExecutionParams $params;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MemeV6ApproveExecutionUseCase this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super android.os.Bundle, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MemeV6ApproveExecutionUseCase$collectApprovalConfirmResult$1(MemeV6ApproveExecutionUseCase memeV6ApproveExecutionUseCase, MemeV6ApproveExecutionUseCase.ApproveExecutionParams approveExecutionParams, String str, Function1<? super Bundle, Unit> function1, Continuation<? super MemeV6ApproveExecutionUseCase$collectApprovalConfirmResult$1> continuation) {
        super(2, continuation);
        this.this$0 = memeV6ApproveExecutionUseCase;
        this.$params = approveExecutionParams;
        this.$cancelApproveTag = str;
        this.$onApproveCallback = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MemeV6ApproveExecutionUseCase$collectApprovalConfirmResult$1 memeV6ApproveExecutionUseCase$collectApprovalConfirmResult$1 = new MemeV6ApproveExecutionUseCase$collectApprovalConfirmResult$1(this.this$0, this.$params, this.$cancelApproveTag, this.$onApproveCallback, continuation);
        memeV6ApproveExecutionUseCase$collectApprovalConfirmResult$1.L$0 = obj;
        return memeV6ApproveExecutionUseCase$collectApprovalConfirmResult$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProducerScope<? super Bundle> producerScope, Continuation<? super Unit> continuation) {
        return ((MemeV6ApproveExecutionUseCase$collectApprovalConfirmResult$1) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ProducerScope producerScope;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            final ProducerScope producerScope2 = (ProducerScope) this.L$0;
            kWG kwg = this.this$0.KWHzl;
            String chainId = this.$params.getChainId();
            String fromTokenAddress = this.$params.getFromTokenAddress();
            String toTokenAddress = this.$params.getToTokenAddress();
            AbstractC32996moC fragment = this.$params.getFragment();
            SwapState swapState = this.$params.getSwapState();
            String inputAmount = this.$params.getInputAmount();
            String str = this.$cancelApproveTag;
            String defiPlatformId = this.$params.getDefiPlatformId();
            final Function1<Bundle, Unit> function1 = this.$onApproveCallback;
            Function1<? super Bundle, Unit> function12 = new Function1() { // from class: o.kWK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return MemeV6ApproveExecutionUseCase$collectApprovalConfirmResult$1.invokeSuspend$lambda$0(producerScope2, function1, (android.os.Bundle) obj2);
                }
            };
            this.L$0 = producerScope2;
            this.label = 1;
            if (kwg.OLrzqt(chainId, fromTokenAddress, toTokenAddress, fragment, swapState, inputAmount, str, defiPlatformId, function12, this) == objCopydefault) {
                return objCopydefault;
            }
            producerScope = producerScope2;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            producerScope = (ProducerScope) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        Function0 function0 = new Function0() { // from class: o.kWI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return Unit.INSTANCE;
            }
        };
        this.L$0 = null;
        this.label = 2;
        if (ProduceKt.awaitClose(producerScope, function0, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(ProducerScope producerScope, Function1 function1, Bundle bundle) {
        producerScope.mo5769trySendJP2dKIU(bundle);
        function1.invoke(bundle);
        SendChannel.DefaultImpls.close$default(producerScope, null, 1, null);
        return Unit.INSTANCE;
    }
}
