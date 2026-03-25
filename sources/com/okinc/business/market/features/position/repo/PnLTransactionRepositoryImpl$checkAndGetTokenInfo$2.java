package com.okinc.business.market.features.position.repo;

import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.network.okg.response.ResponseData;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C29139knx;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC27595jyE;

/* JADX INFO: loaded from: classes7.dex */
public final class PnLTransactionRepositoryImpl$checkAndGetTokenInfo$2 extends SuspendLambda implements Function1<Continuation<? super ResponseData<DexMultiTokenInfoBean>>, Object> {
    final /* synthetic */ String $accountId;
    final /* synthetic */ String $chainId;
    final /* synthetic */ String $tokenAddress;
    final /* synthetic */ String $userUniqueId;
    final /* synthetic */ String $walletAddress;
    int label;
    final /* synthetic */ C29139knx this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PnLTransactionRepositoryImpl$checkAndGetTokenInfo$2(String str, String str2, String str3, String str4, String str5, C29139knx c29139knx, Continuation<? super PnLTransactionRepositoryImpl$checkAndGetTokenInfo$2> continuation) {
        super(1, continuation);
        this.$chainId = str;
        this.$tokenAddress = str2;
        this.$userUniqueId = str3;
        this.$walletAddress = str4;
        this.$accountId = str5;
        this.this$0 = c29139knx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new PnLTransactionRepositoryImpl$checkAndGetTokenInfo$2(this.$chainId, this.$tokenAddress, this.$userUniqueId, this.$walletAddress, this.$accountId, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super ResponseData<DexMultiTokenInfoBean>> continuation) {
        return ((PnLTransactionRepositoryImpl$checkAndGetTokenInfo$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            HashMap<String, String> map = new HashMap<>();
            map.put("chainId", this.$chainId);
            map.put("tokenAddress", this.$tokenAddress);
            map.put("userUniqueId", this.$userUniqueId);
            map.put("userWalletAddress", this.$walletAddress);
            map.put("accountId", this.$accountId);
            map.put("businessType", "1");
            InterfaceC27595jyE interfaceC27595jyE = this.this$0.KWHzl;
            this.label = 1;
            obj = interfaceC27595jyE.OLrzqt(map, (Continuation<? super ResponseData<DexMultiTokenInfoBean>>) this);
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
