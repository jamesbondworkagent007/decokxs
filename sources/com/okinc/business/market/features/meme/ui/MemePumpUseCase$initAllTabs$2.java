package com.okinc.business.market.features.meme.ui;

import com.okinc.business.market.features.meme.domain.model.ConfigInfoData;
import com.okinc.business.market.features.meme.domain.model.RankInfoData;
import com.okinc.business.market.features.meme.filter.domain.MemeFilter;
import com.okinc.business.market.features.meme.ui.MemePumpUseCase;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.yDY;

/* JADX INFO: loaded from: classes7.dex */
public final class MemePumpUseCase$initAllTabs$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chainId;
    final /* synthetic */ List<String> $fallbackProtocols;
    final /* synthetic */ List<MemeFilter> $localFilters;
    final /* synthetic */ List<List<String>> $protocolIdList;
    final /* synthetic */ String $walletAddress;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MemePumpUseCase this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: java.util.List<? extends java.util.List<java.lang.String>> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MemePumpUseCase$initAllTabs$2(MemePumpUseCase memePumpUseCase, String str, List<String> list, String str2, List<MemeFilter> list2, List<? extends List<String>> list3, Continuation<? super MemePumpUseCase$initAllTabs$2> continuation) {
        super(2, continuation);
        this.this$0 = memePumpUseCase;
        this.$chainId = str;
        this.$fallbackProtocols = list;
        this.$walletAddress = str2;
        this.$localFilters = list2;
        this.$protocolIdList = list3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MemePumpUseCase$initAllTabs$2 memePumpUseCase$initAllTabs$2 = new MemePumpUseCase$initAllTabs$2(this.this$0, this.$chainId, this.$fallbackProtocols, this.$walletAddress, this.$localFilters, this.$protocolIdList, continuation);
        memePumpUseCase$initAllTabs$2.L$0 = obj;
        return memePumpUseCase$initAllTabs$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MemePumpUseCase$initAllTabs$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List listGEmmrt;
        Object objAwaitAll;
        List<RankInfoData> rankInfos;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            this.this$0.sSMYrx.put(C56443yFo.AEQbTJ(0), new MemePumpUseCase.StateListAnimator(this.$chainId, this.$fallbackProtocols, this.$walletAddress, (MemeFilter) CollectionsKt___CollectionsKt.AkhnZx(this.$localFilters, 0)));
            Map map = this.this$0.sSMYrx;
            Integer numAEQbTJ = C56443yFo.AEQbTJ(1);
            String str = this.$chainId;
            List<String> list = (List) CollectionsKt___CollectionsKt.AkhnZx(this.$protocolIdList, 1);
            if (list == null) {
                list = this.$fallbackProtocols;
            }
            map.put(numAEQbTJ, new MemePumpUseCase.StateListAnimator(str, list, this.$walletAddress, (MemeFilter) CollectionsKt___CollectionsKt.AkhnZx(this.$localFilters, 1)));
            Map map2 = this.this$0.sSMYrx;
            Integer numAEQbTJ2 = C56443yFo.AEQbTJ(2);
            String str2 = this.$chainId;
            List<String> list2 = (List) CollectionsKt___CollectionsKt.AkhnZx(this.$protocolIdList, 2);
            if (list2 == null) {
                list2 = this.$fallbackProtocols;
            }
            map2.put(numAEQbTJ2, new MemePumpUseCase.StateListAnimator(str2, list2, this.$walletAddress, (MemeFilter) CollectionsKt___CollectionsKt.AkhnZx(this.$localFilters, 2)));
            ConfigInfoData configInfoData = this.this$0.AYXKKw;
            if (configInfoData == null || (rankInfos = configInfoData.getRankInfos()) == null) {
                listGEmmrt = yDY.gEmmrt(BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new MemePumpUseCase$initAllTabs$2$results$2(this.this$0, this.$localFilters, null), 3, null), BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new MemePumpUseCase$initAllTabs$2$results$3(this.this$0, this.$localFilters, null), 3, null), BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new MemePumpUseCase$initAllTabs$2$results$4(this.this$0, this.$localFilters, null), 3, null));
            } else {
                MemePumpUseCase memePumpUseCase = this.this$0;
                List<MemeFilter> list3 = this.$localFilters;
                listGEmmrt = new ArrayList(C56403yEb.AYXKKw(rankInfos, 10));
                int i2 = 0;
                for (Object obj2 : rankInfos) {
                    if (i2 < 0) {
                        yDY.AYXKKw();
                    }
                    List list4 = listGEmmrt;
                    list4.add(BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new MemePumpUseCase$initAllTabs$2$results$1$1(memePumpUseCase, i2, (RankInfoData) obj2, list3, null), 3, null));
                    i2++;
                    listGEmmrt = list4;
                }
            }
            this.label = 1;
            objAwaitAll = AwaitKt.awaitAll(listGEmmrt, this);
            if (objAwaitAll == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            objAwaitAll = obj;
        }
        List list5 = (List) objAwaitAll;
        if (!(list5 instanceof Collection) || !list5.isEmpty()) {
            Iterator it = list5.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((Boolean) it.next()).booleanValue()) {
                    this.this$0.djBIcL();
                    break;
                }
            }
        }
        MemePumpUseCase memePumpUseCase2 = this.this$0;
        this.label = 2;
        if (MemePumpUseCase.getBlackListed$default(memePumpUseCase2, false, this, 1, null) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }
}
