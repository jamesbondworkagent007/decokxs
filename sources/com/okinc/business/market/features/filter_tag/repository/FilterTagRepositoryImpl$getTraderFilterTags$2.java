package com.okinc.business.market.features.filter_tag.repository;

import com.okinc.business.market.features.filter_tag.data.model.FilterTagData;
import com.okinc.network.okg.response.ResponseData;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C26212jWb;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC27595jyE;

/* JADX INFO: loaded from: classes7.dex */
public final class FilterTagRepositoryImpl$getTraderFilterTags$2 extends SuspendLambda implements Function1<Continuation<? super ResponseData<List<? extends FilterTagData>>>, Object> {
    final /* synthetic */ String $chainId;
    final /* synthetic */ String $tokenContractAddress;
    final /* synthetic */ String $walletAddress;
    int label;
    final /* synthetic */ C26212jWb this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilterTagRepositoryImpl$getTraderFilterTags$2(C26212jWb c26212jWb, String str, String str2, String str3, Continuation<? super FilterTagRepositoryImpl$getTraderFilterTags$2> continuation) {
        super(1, continuation);
        this.this$0 = c26212jWb;
        this.$tokenContractAddress = str;
        this.$walletAddress = str2;
        this.$chainId = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new FilterTagRepositoryImpl$getTraderFilterTags$2(this.this$0, this.$tokenContractAddress, this.$walletAddress, this.$chainId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Continuation<? super ResponseData<List<? extends FilterTagData>>> continuation) {
        return invoke2((Continuation<? super ResponseData<List<FilterTagData>>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Continuation<? super ResponseData<List<FilterTagData>>> continuation) {
        return ((FilterTagRepositoryImpl$getTraderFilterTags$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC27595jyE interfaceC27595jyE = this.this$0.EZpvd;
            String str = this.$tokenContractAddress;
            String str2 = this.$walletAddress;
            String str3 = this.$chainId;
            this.label = 1;
            obj = interfaceC27595jyE.EZpvd(str, str2, str3, this);
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
