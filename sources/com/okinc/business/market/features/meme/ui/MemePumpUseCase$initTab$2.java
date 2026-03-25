package com.okinc.business.market.features.meme.ui;

import com.okinc.business.market.features.meme.domain.model.ConfigInfoData;
import com.okinc.business.market.features.meme.domain.model.RankInfoData;
import com.okinc.business.market.features.meme.filter.domain.MemeFilter;
import com.okinc.business.market.features.meme.ui.MemePumpUseCase;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes7.dex */
public final class MemePumpUseCase$initTab$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chainId;
    final /* synthetic */ MemeFilter $localFilter;
    final /* synthetic */ List<String> $protocolIdList;
    final /* synthetic */ boolean $showLoading;
    final /* synthetic */ int $tabIndex;
    final /* synthetic */ String $walletAddress;
    int label;
    final /* synthetic */ MemePumpUseCase this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemePumpUseCase$initTab$2(MemePumpUseCase memePumpUseCase, int i, String str, List<String> list, String str2, MemeFilter memeFilter, boolean z, Continuation<? super MemePumpUseCase$initTab$2> continuation) {
        super(2, continuation);
        this.this$0 = memePumpUseCase;
        this.$tabIndex = i;
        this.$chainId = str;
        this.$protocolIdList = list;
        this.$walletAddress = str2;
        this.$localFilter = memeFilter;
        this.$showLoading = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MemePumpUseCase$initTab$2(this.this$0, this.$tabIndex, this.$chainId, this.$protocolIdList, this.$walletAddress, this.$localFilter, this.$showLoading, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MemePumpUseCase$initTab$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0096 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        List<RankInfoData> rankInfos;
        RankInfoData rankInfoData;
        MemePumpUseCase memePumpUseCase;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.sSMYrx.put(C56443yFo.AEQbTJ(this.$tabIndex), new MemePumpUseCase.StateListAnimator(this.$chainId, this.$protocolIdList, this.$walletAddress, this.$localFilter));
            ConfigInfoData configInfoData = this.this$0.AYXKKw;
            if (configInfoData != null && (rankInfos = configInfoData.getRankInfos()) != null && (rankInfoData = (RankInfoData) CollectionsKt___CollectionsKt.AkhnZx(rankInfos, this.$tabIndex)) != null) {
                MemePumpUseCase memePumpUseCase2 = this.this$0;
                int i2 = this.$tabIndex;
                boolean z = this.$showLoading;
                MemeFilter memeFilter = this.$localFilter;
                String rankType = rankInfoData.getRankType();
                this.label = 1;
                obj = memePumpUseCase2.AEQbTJ(i2, rankType, z, memeFilter, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            }
            memePumpUseCase = this.this$0;
            this.label = 2;
            if (MemePumpUseCase.getBlackListed$default(memePumpUseCase, false, this, 1, null) == objCopydefault) {
                return objCopydefault;
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return Unit.INSTANCE;
        }
        C56391yDq.AEQbTJ(obj);
        if (((Boolean) obj).booleanValue() && !this.this$0.DTwDnp && this.$showLoading) {
            this.this$0.djBIcL();
            this.this$0.DTwDnp = true;
        }
        memePumpUseCase = this.this$0;
        this.label = 2;
        if (MemePumpUseCase.getBlackListed$default(memePumpUseCase, false, this, 1, null) == objCopydefault) {
        }
        return Unit.INSTANCE;
    }
}
