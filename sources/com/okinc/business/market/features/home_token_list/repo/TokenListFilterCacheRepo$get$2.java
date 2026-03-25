package com.okinc.business.market.features.home_token_list.repo;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.business.market.common.constants.TimeIntervalType;
import com.okinc.business.market.features.filter.domain.AdvancedFilter;
import com.okinc.core.util.SPUtils;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C28548kcp;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes7.dex */
public final class TokenListFilterCacheRepo$get$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AdvancedFilter>, Object> {
    final /* synthetic */ AdvancedFilter $defaultFilter;
    final /* synthetic */ String $key;
    int label;
    final /* synthetic */ C28548kcp this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenListFilterCacheRepo$get$2(C28548kcp c28548kcp, String str, AdvancedFilter advancedFilter, Continuation<? super TokenListFilterCacheRepo$get$2> continuation) {
        super(2, continuation);
        this.this$0 = c28548kcp;
        this.$key = str;
        this.$defaultFilter = advancedFilter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TokenListFilterCacheRepo$get$2(this.this$0, this.$key, this.$defaultFilter, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super AdvancedFilter> continuation) {
        return ((TokenListFilterCacheRepo$get$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0041 A[PHI: r2
  0x0041: PHI (r2v9 com.okinc.business.market.features.filter.domain.AdvancedFilter) = 
  (r2v8 com.okinc.business.market.features.filter.domain.AdvancedFilter)
  (r2v15 com.okinc.business.market.features.filter.domain.AdvancedFilter)
 binds: [B:7:0x0022, B:9:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        AdvancedFilter advancedFilterCopydefault;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            C28548kcp c28548kcp = this.this$0;
            String str = this.$key;
            AdvancedFilter advancedFilter = this.$defaultFilter;
            try {
                try {
                    Result.Application application = Result.Companion;
                    AdvancedFilter advancedFilter2 = (AdvancedFilter) c28548kcp.AEQbTJ.get(str);
                    if (advancedFilter2 == null) {
                        advancedFilter2 = (AdvancedFilter) SPUtils.getObject("dex_market_home_filter" + str, AdvancedFilter.class, "dex_market");
                        AdvancedFilter advancedFilter3 = advancedFilter2 == null ? advancedFilter : advancedFilter2;
                        TimeIntervalType.Companion companion = TimeIntervalType.Companion;
                        Integer num = SPUtils.getInt("dex_market_home_time_interval", TimeIntervalType.ONE_HOUR.getValue(), "dex_market");
                        Intrinsics.checkNotNullExpressionValue(num, "");
                        TimeIntervalType timeIntervalTypeFromValue$default = TimeIntervalType.Companion.fromValue$default(companion, num.intValue(), null, 2, null);
                        boolean z = !SPUtils.contains("dex_market_home_time_interval", "dex_market");
                        try {
                            advancedFilterCopydefault = advancedFilter3.copydefault(((-1073741825) & 1) != 0 ? advancedFilter3.KWHzl : null, ((-1073741825) & 2) != 0 ? advancedFilter3.copydefault : null, ((-1073741825) & 4) != 0 ? advancedFilter3.OLrzqt : null, ((-1073741825) & 8) != 0 ? advancedFilter3.hDKMBd : null, ((-1073741825) & 16) != 0 ? advancedFilter3.getNewProxyInstance : null, ((-1073741825) & 32) != 0 ? advancedFilter3.iwGUEr : null, ((-1073741825) & 64) != 0 ? advancedFilter3.AwvSrB : null, ((-1073741825) & 128) != 0 ? advancedFilter3.AxsJAY : null, ((-1073741825) & 256) != 0 ? advancedFilter3.zuBGHE : null, ((-1073741825) & 512) != 0 ? advancedFilter3.AuCTelauCTel : null, ((-1073741825) & 1024) != 0 ? advancedFilter3.zLjUOn : null, ((-1073741825) & 2048) != 0 ? advancedFilter3.zsXlph : null, ((-1073741825) & 4096) != 0 ? advancedFilter3.gHZMYf : null, ((-1073741825) & 8192) != 0 ? advancedFilter3.wlaJM : null, ((-1073741825) & 16384) != 0 ? advancedFilter3.AubY : null, ((-1073741825) & 32768) != 0 ? advancedFilter3.fetchVPNInfo : null, ((-1073741825) & 65536) != 0 ? advancedFilter3.AkhnZx : null, ((-1073741825) & 131072) != 0 ? advancedFilter3.valueOf : null, ((-1073741825) & 262144) != 0 ? advancedFilter3.gEmmrt : null, ((-1073741825) & 524288) != 0 ? advancedFilter3.values : null, ((-1073741825) & 1048576) != 0 ? advancedFilter3.DbNXlk : null, ((-1073741825) & 2097152) != 0 ? advancedFilter3.getFieldNames : null, ((-1073741825) & 4194304) != 0 ? advancedFilter3.uzCIH : null, ((-1073741825) & 8388608) != 0 ? advancedFilter3.AuCTel : null, ((-1073741825) & 16777216) != 0 ? advancedFilter3.fARcdN : 0, ((-1073741825) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? advancedFilter3.fIwbmz : false, ((-1073741825) & 67108864) != 0 ? advancedFilter3.AhwBna : null, ((-1073741825) & 134217728) != 0 ? advancedFilter3.djBIcL : null, ((-1073741825) & 268435456) != 0 ? advancedFilter3.EZpvd : false, ((-1073741825) & 536870912) != 0 ? advancedFilter3.fJNWhG : null, ((-1073741825) & 1073741824) != 0 ? advancedFilter3.isConnected : timeIntervalTypeFromValue$default, ((-1073741825) & Integer.MIN_VALUE) != 0 ? advancedFilter3.ejfBZ : false, (0 & 1) != 0 ? advancedFilter3.AEQbTJ : null, (0 & 2) != 0 ? advancedFilter3.AYXKKw : z);
                        } catch (Exception unused) {
                            advancedFilterCopydefault = advancedFilter.copydefault(((-1073741825) & 1) != 0 ? advancedFilter.KWHzl : null, ((-1073741825) & 2) != 0 ? advancedFilter.copydefault : null, ((-1073741825) & 4) != 0 ? advancedFilter.OLrzqt : null, ((-1073741825) & 8) != 0 ? advancedFilter.hDKMBd : null, ((-1073741825) & 16) != 0 ? advancedFilter.getNewProxyInstance : null, ((-1073741825) & 32) != 0 ? advancedFilter.iwGUEr : null, ((-1073741825) & 64) != 0 ? advancedFilter.AwvSrB : null, ((-1073741825) & 128) != 0 ? advancedFilter.AxsJAY : null, ((-1073741825) & 256) != 0 ? advancedFilter.zuBGHE : null, ((-1073741825) & 512) != 0 ? advancedFilter.AuCTelauCTel : null, ((-1073741825) & 1024) != 0 ? advancedFilter.zLjUOn : null, ((-1073741825) & 2048) != 0 ? advancedFilter.zsXlph : null, ((-1073741825) & 4096) != 0 ? advancedFilter.gHZMYf : null, ((-1073741825) & 8192) != 0 ? advancedFilter.wlaJM : null, ((-1073741825) & 16384) != 0 ? advancedFilter.AubY : null, ((-1073741825) & 32768) != 0 ? advancedFilter.fetchVPNInfo : null, ((-1073741825) & 65536) != 0 ? advancedFilter.AkhnZx : null, ((-1073741825) & 131072) != 0 ? advancedFilter.valueOf : null, ((-1073741825) & 262144) != 0 ? advancedFilter.gEmmrt : null, ((-1073741825) & 524288) != 0 ? advancedFilter.values : null, ((-1073741825) & 1048576) != 0 ? advancedFilter.DbNXlk : null, ((-1073741825) & 2097152) != 0 ? advancedFilter.getFieldNames : null, ((-1073741825) & 4194304) != 0 ? advancedFilter.uzCIH : null, ((-1073741825) & 8388608) != 0 ? advancedFilter.AuCTel : null, ((-1073741825) & 16777216) != 0 ? advancedFilter.fARcdN : 0, ((-1073741825) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? advancedFilter.fIwbmz : false, ((-1073741825) & 67108864) != 0 ? advancedFilter.AhwBna : null, ((-1073741825) & 134217728) != 0 ? advancedFilter.djBIcL : null, ((-1073741825) & 268435456) != 0 ? advancedFilter.EZpvd : false, ((-1073741825) & 536870912) != 0 ? advancedFilter.fJNWhG : null, ((-1073741825) & 1073741824) != 0 ? advancedFilter.isConnected : timeIntervalTypeFromValue$default, ((-1073741825) & Integer.MIN_VALUE) != 0 ? advancedFilter.ejfBZ : false, (0 & 1) != 0 ? advancedFilter.AEQbTJ : null, (0 & 2) != 0 ? advancedFilter.AYXKKw : z);
                        }
                        objM7377constructorimpl = Result.m7377constructorimpl(advancedFilterCopydefault);
                    }
                } catch (Throwable th) {
                    pUU.AEQbTJ("DEX", "dexRunCatching", th);
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
                return Result.m7380exceptionOrNullimpl(objM7377constructorimpl) == null ? objM7377constructorimpl : this.$defaultFilter;
            } catch (CancellationException e) {
                throw e;
            }
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
