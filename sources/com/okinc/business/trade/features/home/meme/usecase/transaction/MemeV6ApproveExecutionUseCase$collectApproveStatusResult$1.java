package com.okinc.business.trade.features.home.meme.usecase.transaction;

import android.os.Bundle;
import com.okinc.business.dexlogic.main.swap.operation_handler.bean.ApproveStatusGroup;
import com.okinc.business.trade.features.home.meme.usecase.transaction.MemeV6ApproveExecutionUseCase$collectApproveStatusResult$1;
import com.okinc.business.trade.features.home.ui.meme.statepool.TradeStatePool;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.SendChannel;
import o.C56391yDq;
import o.C56442yFn;
import o.kWG;

/* JADX INFO: loaded from: classes7.dex */
public final class MemeV6ApproveExecutionUseCase$collectApproveStatusResult$1 extends SuspendLambda implements Function2<ProducerScope<? super ApproveStatusGroup>, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $amount;
    final /* synthetic */ String $chainId;
    final /* synthetic */ String $decimals;
    final /* synthetic */ String $defiPlatformId;
    final /* synthetic */ boolean $isAutoSellEnabled;
    final /* synthetic */ Bundle $result;
    final /* synthetic */ String $toTokenContractAddress;
    final /* synthetic */ String $tokenContractAddress;
    final /* synthetic */ TradeStatePool $tradeStatePool;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MemeV6ApproveExecutionUseCase this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemeV6ApproveExecutionUseCase$collectApproveStatusResult$1(MemeV6ApproveExecutionUseCase memeV6ApproveExecutionUseCase, Bundle bundle, String str, String str2, String str3, String str4, String str5, TradeStatePool tradeStatePool, String str6, boolean z, Continuation<? super MemeV6ApproveExecutionUseCase$collectApproveStatusResult$1> continuation) {
        super(2, continuation);
        this.this$0 = memeV6ApproveExecutionUseCase;
        this.$result = bundle;
        this.$chainId = str;
        this.$tokenContractAddress = str2;
        this.$toTokenContractAddress = str3;
        this.$decimals = str4;
        this.$amount = str5;
        this.$tradeStatePool = tradeStatePool;
        this.$defiPlatformId = str6;
        this.$isAutoSellEnabled = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MemeV6ApproveExecutionUseCase$collectApproveStatusResult$1 memeV6ApproveExecutionUseCase$collectApproveStatusResult$1 = new MemeV6ApproveExecutionUseCase$collectApproveStatusResult$1(this.this$0, this.$result, this.$chainId, this.$tokenContractAddress, this.$toTokenContractAddress, this.$decimals, this.$amount, this.$tradeStatePool, this.$defiPlatformId, this.$isAutoSellEnabled, continuation);
        memeV6ApproveExecutionUseCase$collectApproveStatusResult$1.L$0 = obj;
        return memeV6ApproveExecutionUseCase$collectApproveStatusResult$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProducerScope<? super ApproveStatusGroup> producerScope, Continuation<? super Unit> continuation) {
        return ((MemeV6ApproveExecutionUseCase$collectApproveStatusResult$1) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            Bundle bundle = this.$result;
            String str = this.$chainId;
            String str2 = this.$tokenContractAddress;
            String str3 = this.$toTokenContractAddress;
            String str4 = this.$decimals;
            String str5 = this.$amount;
            TradeStatePool tradeStatePool = this.$tradeStatePool;
            String str6 = this.$defiPlatformId;
            boolean z = this.this$0.OLrzqt && !this.$isAutoSellEnabled;
            Function1<? super ApproveStatusGroup, Unit> function1 = new Function1() { // from class: o.kWM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return MemeV6ApproveExecutionUseCase$collectApproveStatusResult$1.invokeSuspend$lambda$0(producerScope2, (ApproveStatusGroup) obj2);
                }
            };
            this.L$0 = producerScope2;
            this.label = 1;
            if (kwg.OLrzqt(bundle, str, str2, str3, str4, str5, tradeStatePool, str6, z, function1, this) == objCopydefault) {
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
        Function0 function0 = new Function0() { // from class: o.kWP
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
    public static final Unit invokeSuspend$lambda$0(ProducerScope producerScope, ApproveStatusGroup approveStatusGroup) {
        producerScope.mo5769trySendJP2dKIU(approveStatusGroup);
        SendChannel.DefaultImpls.close$default(producerScope, null, 1, null);
        return Unit.INSTANCE;
    }
}
