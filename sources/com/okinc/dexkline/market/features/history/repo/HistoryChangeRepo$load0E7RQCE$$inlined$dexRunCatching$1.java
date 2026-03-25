package com.okinc.dexkline.market.features.history.repo;

import com.okinc.dexkline.market.data.model.history.HistoryChangeData;
import com.okinc.dexkline.market.data.model.history.HistoryChangeFilterRequest;
import com.okinc.dexkline.market.data.model.history.HistoryChangeResponse;
import com.okinc.dexkline.market.features.filter.domain.TokenFilter;
import com.okinc.dexkline.market.features.history.domian.models.HistoryChange;
import com.okinc.network.okg.response.ResponseData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C32378mZu;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC32260mVk;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.dexkline.market.features.history.repo.HistoryChangeRepo$load-0E7RQCE$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class HistoryChangeRepo$load0E7RQCE$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Pair<? extends List<? extends HistoryChange>, ? extends Boolean>>>, Object> {
    final /* synthetic */ String $lastItemId$inlined;
    final /* synthetic */ TokenFilter $tokenFilter$inlined;
    int label;
    final /* synthetic */ C32378mZu this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HistoryChangeRepo$load0E7RQCE$$inlined$dexRunCatching$1(Continuation continuation, C32378mZu c32378mZu, TokenFilter tokenFilter, String str) {
        super(2, continuation);
        this.this$0 = c32378mZu;
        this.$tokenFilter$inlined = tokenFilter;
        this.$lastItemId$inlined = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HistoryChangeRepo$load0E7RQCE$$inlined$dexRunCatching$1(continuation, this.this$0, this.$tokenFilter$inlined, this.$lastItemId$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends Pair<? extends List<? extends HistoryChange>, ? extends Boolean>>> continuation) {
        return ((HistoryChangeRepo$load0E7RQCE$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        boolean z = true;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Result.Application application = Result.Companion;
                HistoryChangeFilterRequest historyChangeFilterRequest = new HistoryChangeFilterRequest(this.this$0.copydefault.AEQbTJ(this.$tokenFilter$inlined), this.$lastItemId$inlined, (String) null, false, (String) null, 28, (DefaultConstructorMarker) null);
                InterfaceC32260mVk interfaceC32260mVk = this.this$0.EZpvd;
                this.label = 1;
                obj = interfaceC32260mVk.OLrzqt(historyChangeFilterRequest, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            Object data = ((ResponseData) obj).getData();
            Intrinsics.copydefault(data);
            HistoryChangeResponse historyChangeResponse = (HistoryChangeResponse) data;
            List<HistoryChangeData> list = historyChangeResponse.getList();
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(this.this$0.copydefault.OLrzqt((HistoryChangeData) it.next()));
            }
            if (historyChangeResponse.getHasMore() <= 0) {
                z = false;
            }
            objM7377constructorimpl = Result.m7377constructorimpl(new Pair(arrayList, C56443yFo.KWHzl(z)));
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            pUU.AEQbTJ("cedefi", "dexRunCatching", th);
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
