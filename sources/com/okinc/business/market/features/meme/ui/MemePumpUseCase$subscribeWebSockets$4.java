package com.okinc.business.market.features.meme.ui;

import com.okinc.business.market.features.meme.data.model.PersonalizedInfoWsData;
import com.okinc.business.market.features.meme.data.model.PersonalizedInfoWsResponse;
import com.okinc.business.market.features.meme.filter.domain.MemeFilter;
import com.okinc.business.market.features.meme.ui.MemePumpUseCase;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC28701kfj;

/* JADX INFO: loaded from: classes7.dex */
public final class MemePumpUseCase$subscribeWebSockets$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chainId;
    final /* synthetic */ List<String> $protocolIdList;
    final /* synthetic */ String $walletAddress;
    int label;
    final /* synthetic */ MemePumpUseCase this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemePumpUseCase$subscribeWebSockets$4(String str, MemePumpUseCase memePumpUseCase, String str2, List<String> list, Continuation<? super MemePumpUseCase$subscribeWebSockets$4> continuation) {
        super(2, continuation);
        this.$walletAddress = str;
        this.this$0 = memePumpUseCase;
        this.$chainId = str2;
        this.$protocolIdList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MemePumpUseCase$subscribeWebSockets$4(this.$walletAddress, this.this$0, this.$chainId, this.$protocolIdList, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MemePumpUseCase$subscribeWebSockets$4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006e A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        FlowCollector flowCollector;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.$walletAddress.length() > 0) {
                MemePumpUseCase.StateListAnimator stateListAnimator = (MemePumpUseCase.StateListAnimator) this.this$0.sSMYrx.get(C56443yFo.AEQbTJ(0));
                MemeFilter memeFilterCopydefault = stateListAnimator != null ? stateListAnimator.copydefault() : null;
                InterfaceC28701kfj interfaceC28701kfj = this.this$0.uzCIH;
                String str = this.$chainId;
                String str2 = this.$walletAddress;
                List<String> list = this.$protocolIdList;
                Integer numAEQbTJ = C56443yFo.AEQbTJ(0);
                this.label = 1;
                obj = interfaceC28701kfj.OLrzqt(str, str2, list, numAEQbTJ, memeFilterCopydefault, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                final MemePumpUseCase memePumpUseCase = this.this$0;
                flowCollector = new FlowCollector() { // from class: com.okinc.business.market.features.meme.ui.MemePumpUseCase$subscribeWebSockets$4.3
                    /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
                    public final Object emit(PersonalizedInfoWsResponse personalizedInfoWsResponse, Continuation<? super Unit> continuation) {
                        memePumpUseCase.OLrzqt((List<PersonalizedInfoWsData>) personalizedInfoWsResponse.getDetailVOS());
                        return Unit.INSTANCE;
                    }
                };
                this.label = 2;
                if (((Flow) obj).collect(flowCollector, this) == objCopydefault) {
                }
            }
        } else if (i == 1) {
            C56391yDq.AEQbTJ(obj);
            final MemePumpUseCase memePumpUseCase2 = this.this$0;
            flowCollector = new FlowCollector() { // from class: com.okinc.business.market.features.meme.ui.MemePumpUseCase$subscribeWebSockets$4.3
                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
                public final Object emit(PersonalizedInfoWsResponse personalizedInfoWsResponse, Continuation<? super Unit> continuation) {
                    memePumpUseCase2.OLrzqt((List<PersonalizedInfoWsData>) personalizedInfoWsResponse.getDetailVOS());
                    return Unit.INSTANCE;
                }
            };
            this.label = 2;
            if (((Flow) obj).collect(flowCollector, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
