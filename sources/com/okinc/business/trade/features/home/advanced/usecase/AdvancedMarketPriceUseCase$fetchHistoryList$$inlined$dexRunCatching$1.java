package com.okinc.business.trade.features.home.advanced.usecase;

import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.market.data.model.history.HistoryChangeFilterRequest;
import com.okinc.business.market.data.model.history.HistoryChangeResponse;
import com.okinc.business.trade.features.home.ui.cefi.data.OrderBookInfo;
import com.okinc.network.okg.response.OKServerException;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C28179kRv;
import o.C28230kTs;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC28152kQv;
import o.pUU;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedMarketPriceUseCase$fetchHistoryList$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends AbstractC43419rot<? extends List<? extends C28230kTs>, ? extends OKServerException>>>, Object> {
    final /* synthetic */ DexMultiTokenInfoBean $baseToken$inlined;
    final /* synthetic */ OrderBookInfo $info$inlined;
    int label;
    final /* synthetic */ C28179kRv this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedMarketPriceUseCase$fetchHistoryList$$inlined$dexRunCatching$1(Continuation continuation, C28179kRv c28179kRv, OrderBookInfo orderBookInfo, DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        super(2, continuation);
        this.this$0 = c28179kRv;
        this.$info$inlined = orderBookInfo;
        this.$baseToken$inlined = dexMultiTokenInfoBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdvancedMarketPriceUseCase$fetchHistoryList$$inlined$dexRunCatching$1(continuation, this.this$0, this.$info$inlined, this.$baseToken$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends AbstractC43419rot<? extends List<? extends C28230kTs>, ? extends OKServerException>>> continuation) {
        return ((AdvancedMarketPriceUseCase$fetchHistoryList$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object actionBar;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Result.Application application = Result.Companion;
                InterfaceC28152kQv interfaceC28152kQv = this.this$0.copydefault;
                HistoryChangeFilterRequest historyChangeFilterRequestOLrzqt = this.this$0.AEQbTJ.OLrzqt(this.$info$inlined);
                this.label = 1;
                obj = interfaceC28152kQv.AEQbTJ(historyChangeFilterRequestOLrzqt, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            AbstractC43419rot abstractC43419rot = (AbstractC43419rot) obj;
            if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
                actionBar = new AbstractC43419rot.StateListAnimator(this.this$0.AEQbTJ.KWHzl(this.$baseToken$inlined, ((HistoryChangeResponse) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl()).getList()));
            } else {
                if (!(abstractC43419rot instanceof AbstractC43419rot.ActionBar)) {
                    throw new NoWhenBranchMatchedException();
                }
                actionBar = new AbstractC43419rot.ActionBar(((AbstractC43419rot.ActionBar) abstractC43419rot).KWHzl());
            }
            objM7377constructorimpl = Result.m7377constructorimpl(actionBar);
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
