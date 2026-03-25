package com.okinc.business.market.features.position.repo;

import com.okinc.business.market.data.model.position_pnl.LatestPnLData;
import com.okinc.network.okg.response.ResponseData;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C29134kns;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC27595jyE;

/* JADX INFO: loaded from: classes7.dex */
public final class LatestPnLRepositoryImpl$getLatestPnL$2 extends SuspendLambda implements Function1<Continuation<? super ResponseData<LatestPnLData>>, Object> {
    final /* synthetic */ String $chainId;
    final /* synthetic */ String $tokenContractAddress;
    final /* synthetic */ String $walletAddress;
    int label;
    final /* synthetic */ C29134kns this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LatestPnLRepositoryImpl$getLatestPnL$2(String str, String str2, String str3, C29134kns c29134kns, Continuation<? super LatestPnLRepositoryImpl$getLatestPnL$2> continuation) {
        super(1, continuation);
        this.$chainId = str;
        this.$walletAddress = str2;
        this.$tokenContractAddress = str3;
        this.this$0 = c29134kns;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new LatestPnLRepositoryImpl$getLatestPnL$2(this.$chainId, this.$walletAddress, this.$tokenContractAddress, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super ResponseData<LatestPnLData>> continuation) {
        return ((LatestPnLRepositoryImpl$getLatestPnL$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            HashMap<String, String> map = new HashMap<>();
            map.put("chainId", this.$chainId);
            map.put("walletAddress", this.$walletAddress);
            map.put("tokenContractAddress", this.$tokenContractAddress);
            InterfaceC27595jyE interfaceC27595jyE = this.this$0.copydefault;
            this.label = 1;
            obj = interfaceC27595jyE.AEQbTJ(map, (Continuation<? super ResponseData<LatestPnLData>>) this);
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
