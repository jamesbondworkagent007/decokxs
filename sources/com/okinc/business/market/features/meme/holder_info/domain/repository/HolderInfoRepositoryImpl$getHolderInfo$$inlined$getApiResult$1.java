package com.okinc.business.market.features.meme.holder_info.domain.repository;

import com.okinc.business.market.features.meme.holder_info.domain.model.HolderInfoData;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C28732kgN;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC23229huL;

/* JADX INFO: loaded from: classes7.dex */
public final class HolderInfoRepositoryImpl$getHolderInfo$$inlined$getApiResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ResponseData<HolderInfoData>>, Object> {
    final /* synthetic */ String $chainIndex$inlined;
    final /* synthetic */ String $holderAddress$inlined;
    final /* synthetic */ String $tokenContractAddress$inlined;
    int label;
    final /* synthetic */ C28732kgN this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HolderInfoRepositoryImpl$getHolderInfo$$inlined$getApiResult$1(Continuation continuation, C28732kgN c28732kgN, String str, String str2, String str3) {
        super(2, continuation);
        this.this$0 = c28732kgN;
        this.$chainIndex$inlined = str;
        this.$tokenContractAddress$inlined = str2;
        this.$holderAddress$inlined = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HolderInfoRepositoryImpl$getHolderInfo$$inlined$getApiResult$1(continuation, this.this$0, this.$chainIndex$inlined, this.$tokenContractAddress$inlined, this.$holderAddress$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ResponseData<HolderInfoData>> continuation) {
        return ((HolderInfoRepositoryImpl$getHolderInfo$$inlined$getApiResult$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC23229huL interfaceC23229huLKWHzl = this.this$0.KWHzl();
            String str = this.$chainIndex$inlined;
            String str2 = this.$tokenContractAddress$inlined;
            String str3 = this.$holderAddress$inlined;
            this.label = 1;
            obj = interfaceC23229huLKWHzl.OLrzqt(str, str2, str3, this);
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
