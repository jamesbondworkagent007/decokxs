package com.okinc.business.market.features.coindetail.domain;

import com.okinc.business.market.features.coindetail.domain.models.EarlyBuyersWs;
import com.okinc.business.market.features.coindetail.domain.models.SniperHolder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.CoroutineScope;
import o.C26029jPh;
import o.C26041jPt;
import o.C56391yDq;
import o.C56442yFn;
import o.jNP;
import o.pUU;
import o.yDY;

/* JADX INFO: renamed from: com.okinc.business.market.features.coindetail.domain.MapSniperUseCase$map-0E7RQCE$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class MapSniperUseCase$map0E7RQCE$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends C26029jPh>>, Object> {
    final /* synthetic */ EarlyBuyersWs $from$inlined;
    final /* synthetic */ List $list$inlined;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ jNP this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapSniperUseCase$map0E7RQCE$$inlined$dexRunCatching$1(Continuation continuation, List list, EarlyBuyersWs earlyBuyersWs, jNP jnp) {
        super(2, continuation);
        this.$list$inlined = list;
        this.$from$inlined = earlyBuyersWs;
        this.this$0 = jnp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MapSniperUseCase$map0E7RQCE$$inlined$dexRunCatching$1(continuation, this.$list$inlined, this.$from$inlined, this.this$0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends C26029jPh>> continuation) {
        return ((MapSniperUseCase$map0E7RQCE$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:33:0x00d9) to fix multi-entry loop: BACK_EDGE: B:33:0x00d9 -> B:34:0x00da */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00da, code lost:
    
        r14 = r7;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062 A[Catch: all -> 0x01c6, CancellationException -> 0x01dd, TryCatch #2 {CancellationException -> 0x01dd, all -> 0x01c6, blocks: (B:7:0x001f, B:46:0x017c, B:49:0x0183, B:41:0x015d, B:43:0x0163, B:52:0x018b, B:54:0x0193, B:51:0x0187, B:12:0x003c, B:29:0x00cc, B:32:0x00d3, B:16:0x005c, B:18:0x0062, B:20:0x006a, B:21:0x006d, B:23:0x0099, B:25:0x009c, B:36:0x00e1, B:38:0x00fa, B:40:0x011c, B:35:0x00dc, B:15:0x004a), top: B:62:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00dc A[Catch: all -> 0x01c6, CancellationException -> 0x01dd, TryCatch #2 {CancellationException -> 0x01dd, all -> 0x01c6, blocks: (B:7:0x001f, B:46:0x017c, B:49:0x0183, B:41:0x015d, B:43:0x0163, B:52:0x018b, B:54:0x0193, B:51:0x0187, B:12:0x003c, B:29:0x00cc, B:32:0x00d3, B:16:0x005c, B:18:0x0062, B:20:0x006a, B:21:0x006d, B:23:0x0099, B:25:0x009c, B:36:0x00e1, B:38:0x00fa, B:40:0x011c, B:35:0x00dc, B:15:0x004a), top: B:62:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e1 A[Catch: all -> 0x01c6, CancellationException -> 0x01dd, TryCatch #2 {CancellationException -> 0x01dd, all -> 0x01c6, blocks: (B:7:0x001f, B:46:0x017c, B:49:0x0183, B:41:0x015d, B:43:0x0163, B:52:0x018b, B:54:0x0193, B:51:0x0187, B:12:0x003c, B:29:0x00cc, B:32:0x00d3, B:16:0x005c, B:18:0x0062, B:20:0x006a, B:21:0x006d, B:23:0x0099, B:25:0x009c, B:36:0x00e1, B:38:0x00fa, B:40:0x011c, B:35:0x00dc, B:15:0x004a), top: B:62:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0163 A[Catch: all -> 0x01c6, CancellationException -> 0x01dd, TryCatch #2 {CancellationException -> 0x01dd, all -> 0x01c6, blocks: (B:7:0x001f, B:46:0x017c, B:49:0x0183, B:41:0x015d, B:43:0x0163, B:52:0x018b, B:54:0x0193, B:51:0x0187, B:12:0x003c, B:29:0x00cc, B:32:0x00d3, B:16:0x005c, B:18:0x0062, B:20:0x006a, B:21:0x006d, B:23:0x0099, B:25:0x009c, B:36:0x00e1, B:38:0x00fa, B:40:0x011c, B:35:0x00dc, B:15:0x004a), top: B:62:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0187 A[Catch: all -> 0x01c6, CancellationException -> 0x01dd, TryCatch #2 {CancellationException -> 0x01dd, all -> 0x01c6, blocks: (B:7:0x001f, B:46:0x017c, B:49:0x0183, B:41:0x015d, B:43:0x0163, B:52:0x018b, B:54:0x0193, B:51:0x0187, B:12:0x003c, B:29:0x00cc, B:32:0x00d3, B:16:0x005c, B:18:0x0062, B:20:0x006a, B:21:0x006d, B:23:0x0099, B:25:0x009c, B:36:0x00e1, B:38:0x00fa, B:40:0x011c, B:35:0x00dc, B:15:0x004a), top: B:62:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x018b A[Catch: all -> 0x01c6, CancellationException -> 0x01dd, TryCatch #2 {CancellationException -> 0x01dd, all -> 0x01c6, blocks: (B:7:0x001f, B:46:0x017c, B:49:0x0183, B:41:0x015d, B:43:0x0163, B:52:0x018b, B:54:0x0193, B:51:0x0187, B:12:0x003c, B:29:0x00cc, B:32:0x00d3, B:16:0x005c, B:18:0x0062, B:20:0x006a, B:21:0x006d, B:23:0x0099, B:25:0x009c, B:36:0x00e1, B:38:0x00fa, B:40:0x011c, B:35:0x00dc, B:15:0x004a), top: B:62:0x0009 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00cb -> B:29:0x00cc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0179 -> B:46:0x017c). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Collection arrayList;
        Iterator it;
        int i;
        List list;
        Iterator it2;
        Collection collection;
        List list2;
        List list3;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = this.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            pUU.AEQbTJ("DEX", "dexRunCatching", th);
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            Result.Application application2 = Result.Companion;
            List list4 = this.$list$inlined;
            arrayList = new ArrayList();
            it = list4.iterator();
            i = 0;
            if (!it.hasNext()) {
            }
        } else if (i2 == 1) {
            int i3 = this.I$0;
            it = (Iterator) this.L$1;
            arrayList = (Collection) this.L$0;
            C56391yDq.AEQbTJ(obj);
            Object objCopydefault2 = ((Result) obj).m7386unboximpl();
            if (Result.m7383isFailureimpl(objCopydefault2)) {
                objCopydefault2 = null;
            }
            int i4 = i3;
            C26041jPt c26041jPt = (C26041jPt) objCopydefault2;
            i = i4;
            if (c26041jPt != null) {
                arrayList.add(c26041jPt);
            }
            if (!it.hasNext()) {
                Object next = it.next();
                int i5 = i + 1;
                if (i < 0) {
                    yDY.AYXKKw();
                }
                c26041jPt = (C26041jPt) next;
                int pageNum = this.$from$inlined.getPageNum();
                int pageSize = this.$from$inlined.getPageSize();
                if (i >= (this.$from$inlined.getPageNum() * this.$from$inlined.getPageSize()) + this.$from$inlined.getEarlyBuyerVO().getEarlyBuyerDetailVOList().size() || pageNum * pageSize > i) {
                    i = i5;
                    if (c26041jPt != null) {
                    }
                    if (!it.hasNext()) {
                        List listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG(arrayList);
                        if (listFJNWhG.size() < this.$from$inlined.getPageNum() * this.$from$inlined.getPageSize() || listFJNWhG.size() >= (this.$from$inlined.getPageNum() * this.$from$inlined.getPageSize()) + this.$from$inlined.getEarlyBuyerVO().getEarlyBuyerDetailVOList().size()) {
                            list = listFJNWhG;
                            objM7377constructorimpl = Result.m7377constructorimpl(new C26029jPh(this.$from$inlined.getEarlyBuyerVO().getTotalBuyInAmountPercentage(), this.$from$inlined.getEarlyBuyerVO().getTotalHoldAmountPercentage(), this.$from$inlined.getEarlyBuyerVO().getTokenContractAddress(), this.$from$inlined.getEarlyBuyerVO().getChainId(), list));
                            return Result.m7376boximpl(objM7377constructorimpl);
                        }
                        List listCopydefault = CollectionsKt___CollectionsKt.copydefault((List) this.$from$inlined.getEarlyBuyerVO().getEarlyBuyerDetailVOList(), new IntRange(listFJNWhG.size() - (this.$from$inlined.getPageNum() * this.$from$inlined.getPageSize()), this.$from$inlined.getEarlyBuyerVO().getEarlyBuyerDetailVOList().size() - 1));
                        ArrayList arrayList2 = new ArrayList();
                        it2 = listCopydefault.iterator();
                        collection = arrayList2;
                        list2 = listFJNWhG;
                        list3 = list2;
                        if (it2.hasNext()) {
                        }
                    }
                } else {
                    jNP jnp = this.this$0;
                    SniperHolder sniperHolder = this.$from$inlined.getEarlyBuyerVO().getEarlyBuyerDetailVOList().get(i - (this.$from$inlined.getPageNum() * this.$from$inlined.getPageSize()));
                    this.L$0 = arrayList;
                    this.L$1 = it;
                    this.I$0 = i5;
                    this.label = 1;
                    objCopydefault2 = jnp.copydefault(sniperHolder, this);
                    if (objCopydefault2 == objCopydefault) {
                        return objCopydefault;
                    }
                    i3 = i5;
                    if (Result.m7383isFailureimpl(objCopydefault2)) {
                    }
                    int i42 = i3;
                    C26041jPt c26041jPt2 = (C26041jPt) objCopydefault2;
                    i = i42;
                    if (c26041jPt2 != null) {
                    }
                    if (!it.hasNext()) {
                    }
                }
            }
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list2 = (List) this.L$3;
            list3 = (List) this.L$2;
            it2 = (Iterator) this.L$1;
            collection = (Collection) this.L$0;
            C56391yDq.AEQbTJ(obj);
            Object objCopydefault3 = ((Result) obj).m7386unboximpl();
            if (Result.m7383isFailureimpl(objCopydefault3)) {
                objCopydefault3 = null;
            }
            C26041jPt c26041jPt3 = (C26041jPt) objCopydefault3;
            if (c26041jPt3 != null) {
                collection.add(c26041jPt3);
            }
            if (it2.hasNext()) {
                SniperHolder sniperHolder2 = (SniperHolder) it2.next();
                jNP jnp2 = this.this$0;
                this.L$0 = collection;
                this.L$1 = it2;
                this.L$2 = list3;
                this.L$3 = list2;
                this.label = 2;
                objCopydefault3 = jnp2.copydefault(sniperHolder2, this);
                if (objCopydefault3 == objCopydefault) {
                    return objCopydefault;
                }
                if (Result.m7383isFailureimpl(objCopydefault3)) {
                }
                C26041jPt c26041jPt32 = (C26041jPt) objCopydefault3;
                if (c26041jPt32 != null) {
                }
                if (it2.hasNext()) {
                    list2.addAll((List) collection);
                    list = list3;
                    objM7377constructorimpl = Result.m7377constructorimpl(new C26029jPh(this.$from$inlined.getEarlyBuyerVO().getTotalBuyInAmountPercentage(), this.$from$inlined.getEarlyBuyerVO().getTotalHoldAmountPercentage(), this.$from$inlined.getEarlyBuyerVO().getTokenContractAddress(), this.$from$inlined.getEarlyBuyerVO().getChainId(), list));
                    return Result.m7376boximpl(objM7377constructorimpl);
                }
            }
        }
    }
}
