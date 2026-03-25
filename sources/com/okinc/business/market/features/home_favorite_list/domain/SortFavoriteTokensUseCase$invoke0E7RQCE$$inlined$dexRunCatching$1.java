package com.okinc.business.market.features.home_favorite_list.domain;

import com.okinc.business.market.data.model.watchlist.FavoriteTokenData;
import com.okinc.business.market.data.model.watchlist.FavoriteTokensSortRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import o.C28418kaR;
import o.C28422kaV;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.InterfaceC27771kCt;
import o.kKG;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.business.market.features.home_favorite_list.domain.SortFavoriteTokensUseCase$invoke-0E7RQCE$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class SortFavoriteTokensUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Integer>>, Object> {
    final /* synthetic */ int $groupId$inlined;
    final /* synthetic */ List $tokens$inlined;
    int label;
    final /* synthetic */ C28418kaR this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SortFavoriteTokensUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1(Continuation continuation, C28418kaR c28418kaR, int i, List list) {
        super(2, continuation);
        this.this$0 = c28418kaR;
        this.$groupId$inlined = i;
        this.$tokens$inlined = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SortFavoriteTokensUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1(continuation, this.this$0, this.$groupId$inlined, this.$tokens$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends Integer>> continuation) {
        return ((SortFavoriteTokensUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objAEQbTJ;
        Object objKWHzl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            pUU.AEQbTJ("DEX", "dexRunCatching", th);
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Result.Application application2 = Result.Companion;
            kKG kkg = this.this$0.KWHzl;
            this.label = 1;
            objAEQbTJ = kkg.AEQbTJ(this);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objKWHzl = obj;
                objM7377constructorimpl = Result.m7377constructorimpl(objKWHzl);
                return Result.m7376boximpl(objM7377constructorimpl);
            }
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = obj;
        }
        String str = (String) objAEQbTJ;
        String strCopydefault = this.this$0.KWHzl.copydefault();
        int i2 = this.$groupId$inlined;
        List<C28422kaV> list = this.$tokens$inlined;
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
        for (C28422kaV c28422kaV : list) {
            arrayList.add(new FavoriteTokenData(c28422kaV.AkhnZx(), c28422kaV.EZpvd(), c28422kaV.AuCTel(), (List) null, c28422kaV.valueOf(), 8, (DefaultConstructorMarker) null));
        }
        FavoriteTokensSortRequest favoriteTokensSortRequest = new FavoriteTokensSortRequest(str, strCopydefault, i2, arrayList);
        InterfaceC27771kCt interfaceC27771kCt = this.this$0.copydefault;
        this.label = 2;
        objKWHzl = interfaceC27771kCt.KWHzl(favoriteTokensSortRequest, this);
        if (objKWHzl == objCopydefault) {
            return objCopydefault;
        }
        objM7377constructorimpl = Result.m7377constructorimpl(objKWHzl);
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
