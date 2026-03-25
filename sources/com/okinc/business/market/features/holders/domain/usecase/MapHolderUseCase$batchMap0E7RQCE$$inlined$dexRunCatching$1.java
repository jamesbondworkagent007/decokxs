package com.okinc.business.market.features.holders.domain.usecase;

import com.okinc.business.data.model.market.HolderRankingResponseData;
import com.okinc.business.market.features.holders.domain.model.HolderDetailModel;
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
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.jYH;
import o.pUU;
import o.yDY;

/* JADX INFO: renamed from: com.okinc.business.market.features.holders.domain.usecase.MapHolderUseCase$batchMap-0E7RQCE$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class MapHolderUseCase$batchMap0E7RQCE$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends List<? extends HolderDetailModel>>>, Object> {
    final /* synthetic */ Integer $limit$inlined;
    final /* synthetic */ List $list$inlined;
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ jYH this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapHolderUseCase$batchMap0E7RQCE$$inlined$dexRunCatching$1(Continuation continuation, Integer num, List list, jYH jyh) {
        super(2, continuation);
        this.$limit$inlined = num;
        this.$list$inlined = list;
        this.this$0 = jyh;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MapHolderUseCase$batchMap0E7RQCE$$inlined$dexRunCatching$1(continuation, this.$limit$inlined, this.$list$inlined, this.this$0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends List<? extends HolderDetailModel>>> continuation) {
        return ((MapHolderUseCase$batchMap0E7RQCE$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060 A[Catch: all -> 0x0096, CancellationException -> 0x00ad, TryCatch #2 {CancellationException -> 0x00ad, all -> 0x0096, blocks: (B:6:0x0015, B:25:0x007f, B:28:0x0086, B:30:0x008a, B:16:0x005a, B:18:0x0060, B:20:0x0068, B:21:0x006b, B:32:0x008f, B:11:0x002a, B:13:0x0030, B:15:0x003b, B:14:0x0035), top: B:40:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008a A[Catch: all -> 0x0096, CancellationException -> 0x00ad, TryCatch #2 {CancellationException -> 0x00ad, all -> 0x0096, blocks: (B:6:0x0015, B:25:0x007f, B:28:0x0086, B:30:0x008a, B:16:0x005a, B:18:0x0060, B:20:0x0068, B:21:0x006b, B:32:0x008f, B:11:0x002a, B:13:0x0030, B:15:0x003b, B:14:0x0035), top: B:40:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008f A[Catch: all -> 0x0096, CancellationException -> 0x00ad, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x00ad, all -> 0x0096, blocks: (B:6:0x0015, B:25:0x007f, B:28:0x0086, B:30:0x008a, B:16:0x005a, B:18:0x0060, B:20:0x0068, B:21:0x006b, B:32:0x008f, B:11:0x002a, B:13:0x0030, B:15:0x003b, B:14:0x0035), top: B:40:0x0007 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x007e -> B:25:0x007f). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Collection arrayList;
        Iterator it;
        int i;
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
            Integer num = this.$limit$inlined;
            List listAhwBna = CollectionsKt___CollectionsKt.AhwBna((Iterable) this.$list$inlined, Math.min((num != null ? num.intValue() : this.$list$inlined.size()) + 1, this.$list$inlined.size()));
            arrayList = new ArrayList();
            it = listAhwBna.iterator();
            i = 0;
            if (it.hasNext()) {
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i3 = this.I$0;
            it = (Iterator) this.L$1;
            arrayList = (Collection) this.L$0;
            C56391yDq.AEQbTJ(obj);
            Object objCopydefault2 = ((Result) obj).m7386unboximpl();
            if (Result.m7383isFailureimpl(objCopydefault2)) {
                objCopydefault2 = null;
            }
            HolderDetailModel holderDetailModel = (HolderDetailModel) objCopydefault2;
            if (holderDetailModel != null) {
                arrayList.add(holderDetailModel);
            }
            i = i3;
            if (it.hasNext()) {
                Object next = it.next();
                int i4 = i + 1;
                if (i < 0) {
                    yDY.AYXKKw();
                }
                jYH jyh = this.this$0;
                this.L$0 = arrayList;
                this.L$1 = it;
                this.I$0 = i4;
                this.label = 1;
                objCopydefault2 = jyh.copydefault((HolderRankingResponseData) next, i, this);
                if (objCopydefault2 == objCopydefault) {
                    return objCopydefault;
                }
                i3 = i4;
                if (Result.m7383isFailureimpl(objCopydefault2)) {
                }
                HolderDetailModel holderDetailModel2 = (HolderDetailModel) objCopydefault2;
                if (holderDetailModel2 != null) {
                }
                i = i3;
                if (it.hasNext()) {
                    objM7377constructorimpl = Result.m7377constructorimpl((List) arrayList);
                    return Result.m7376boximpl(objM7377constructorimpl);
                }
            }
        }
    }
}
