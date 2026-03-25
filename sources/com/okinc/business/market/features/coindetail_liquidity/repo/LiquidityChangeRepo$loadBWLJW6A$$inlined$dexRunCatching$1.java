package com.okinc.business.market.features.coindetail_liquidity.repo;

import com.okinc.business.market.data.model.LiquidityChangeData;
import com.okinc.business.market.data.model.LiquidityChangeFilterRequest;
import com.okinc.business.market.data.model.LiquidityChangeResponse;
import com.okinc.business.market.features.coindetail_liquidity.domain.LiquidityChange;
import com.okinc.business.market.features.filter.domain.TokenFilter;
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
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC27595jyE;
import o.jPU;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.business.market.features.coindetail_liquidity.repo.LiquidityChangeRepo$load-BWLJW6A$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class LiquidityChangeRepo$loadBWLJW6A$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Pair<? extends List<? extends LiquidityChange>, ? extends Boolean>>>, Object> {
    final /* synthetic */ boolean $isDescOrder$inlined;
    final /* synthetic */ String $lastItemId$inlined;
    final /* synthetic */ TokenFilter $tokenFilter$inlined;
    int label;
    final /* synthetic */ jPU this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiquidityChangeRepo$loadBWLJW6A$$inlined$dexRunCatching$1(Continuation continuation, jPU jpu, TokenFilter tokenFilter, String str, boolean z) {
        super(2, continuation);
        this.this$0 = jpu;
        this.$tokenFilter$inlined = tokenFilter;
        this.$lastItemId$inlined = str;
        this.$isDescOrder$inlined = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LiquidityChangeRepo$loadBWLJW6A$$inlined$dexRunCatching$1(continuation, this.this$0, this.$tokenFilter$inlined, this.$lastItemId$inlined, this.$isDescOrder$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends Pair<? extends List<? extends LiquidityChange>, ? extends Boolean>>> continuation) {
        return ((LiquidityChangeRepo$loadBWLJW6A$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                LiquidityChangeFilterRequest liquidityChangeFilterRequest = new LiquidityChangeFilterRequest(this.this$0.copydefault.AEQbTJ(this.$tokenFilter$inlined), this.$lastItemId$inlined, (String) null, this.$isDescOrder$inlined, "timestamp", 4, (DefaultConstructorMarker) null);
                InterfaceC27595jyE interfaceC27595jyE = this.this$0.OLrzqt;
                this.label = 1;
                obj = interfaceC27595jyE.copydefault(liquidityChangeFilterRequest, this);
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
            LiquidityChangeResponse liquidityChangeResponse = (LiquidityChangeResponse) data;
            List<LiquidityChangeData> listAEQbTJ = liquidityChangeResponse.AEQbTJ();
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listAEQbTJ, 10));
            Iterator<T> it = listAEQbTJ.iterator();
            while (it.hasNext()) {
                arrayList.add(this.this$0.copydefault.KWHzl((LiquidityChangeData) it.next()));
            }
            if (liquidityChangeResponse.EZpvd() <= 0) {
                z = false;
            }
            objM7377constructorimpl = Result.m7377constructorimpl(new Pair(arrayList, C56443yFo.KWHzl(z)));
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            pUU.AEQbTJ("DEX", "dexRunCatching", th);
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
