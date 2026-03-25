package com.okinc.business.trade.features.home.meme.repository;

import androidx.collection.LruCache;
import com.okinc.business.dexlogic.bean.DeFiPlatformTokenApprovalInfo;
import com.okinc.network.okg.response.ResponseData;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C28290kVy;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC23234huQ;

/* JADX INFO: loaded from: classes7.dex */
public final class MemeMarketApproveRepositoryImpl$getApproveAllowanceStatusForOKXPlatform$2 extends SuspendLambda implements Function1<Continuation<? super ResponseData<Map<String, ? extends DeFiPlatformTokenApprovalInfo>>>, Object> {
    final /* synthetic */ String $chainId;
    final /* synthetic */ String $toTokenContractAddress;
    final /* synthetic */ String $tokenContractAddress;
    final /* synthetic */ String $userWalletAddress;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ C28290kVy this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemeMarketApproveRepositoryImpl$getApproveAllowanceStatusForOKXPlatform$2(C28290kVy c28290kVy, String str, String str2, String str3, String str4, Continuation<? super MemeMarketApproveRepositoryImpl$getApproveAllowanceStatusForOKXPlatform$2> continuation) {
        super(1, continuation);
        this.this$0 = c28290kVy;
        this.$chainId = str;
        this.$userWalletAddress = str2;
        this.$tokenContractAddress = str3;
        this.$toTokenContractAddress = str4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new MemeMarketApproveRepositoryImpl$getApproveAllowanceStatusForOKXPlatform$2(this.this$0, this.$chainId, this.$userWalletAddress, this.$tokenContractAddress, this.$toTokenContractAddress, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Continuation<? super ResponseData<Map<String, ? extends DeFiPlatformTokenApprovalInfo>>> continuation) {
        return invoke2((Continuation<? super ResponseData<Map<String, DeFiPlatformTokenApprovalInfo>>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Continuation<? super ResponseData<Map<String, DeFiPlatformTokenApprovalInfo>>> continuation) {
        return ((MemeMarketApproveRepositoryImpl$getApproveAllowanceStatusForOKXPlatform$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2;
        Map map;
        LruCache lruCache;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC23234huQ interfaceC23234huQ = this.this$0.copydefault;
            String str = this.$chainId;
            String str2 = this.$userWalletAddress;
            String str3 = this.$tokenContractAddress;
            String str4 = this.$toTokenContractAddress;
            this.label = 1;
            obj = interfaceC23234huQ.copydefault(str, str2, str3, str4, "", this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                lruCache = (LruCache) this.L$3;
                map = (Map) this.L$2;
                obj2 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                lruCache.put(obj, map);
                return obj2;
            }
            C56391yDq.AEQbTJ(obj);
        }
        C28290kVy c28290kVy = this.this$0;
        String str5 = this.$chainId;
        String str6 = this.$tokenContractAddress;
        Map map2 = (Map) ((ResponseData) obj).getData();
        if (map2 == null) {
            return obj;
        }
        LruCache lruCache2 = c28290kVy.KWHzl;
        this.L$0 = obj;
        this.L$1 = map2;
        this.L$2 = map2;
        this.L$3 = lruCache2;
        this.label = 2;
        Object objEZpvd = c28290kVy.EZpvd(str5, str6, this);
        if (objEZpvd == objCopydefault) {
            return objCopydefault;
        }
        obj2 = obj;
        obj = objEZpvd;
        map = map2;
        lruCache = lruCache2;
        lruCache.put(obj, map);
        return obj2;
    }
}
