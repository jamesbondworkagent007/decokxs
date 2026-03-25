package com.okinc.business.market.market.fragment;

import androidx.fragment.app.FragmentManager;
import com.okinc.okmarket.ui.market.MarketModuleChooseFragment;
import com.okinc.tradeapi.bean.TradeGroupData;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC27884kGx;
import o.C28000kLe;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes18.dex */
public final class BaseMarketTabFragment$initView$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ AbstractC27884kGx this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseMarketTabFragment$initView$1$1(AbstractC27884kGx abstractC27884kGx, Continuation<? super BaseMarketTabFragment$initView$1$1> continuation) {
        super(2, continuation);
        this.this$0 = abstractC27884kGx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BaseMarketTabFragment$initView$1$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BaseMarketTabFragment$initView$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        TradeGroupData tradeGroupData;
        List<TradeGroupData> listKWHzl;
        C28000kLe c28000kLeKWHzl;
        List<TradeGroupData> listKWHzl2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        int i2 = 0;
        Integer numAEQbTJ = null;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            AbstractC27884kGx abstractC27884kGx = this.this$0;
            try {
                Result.Application application = Result.Companion;
                AbstractC27884kGx.StateListAnimator stateListAnimator = abstractC27884kGx.djBIcL;
                if (stateListAnimator == null || (listKWHzl = stateListAnimator.KWHzl()) == null) {
                    tradeGroupData = null;
                } else {
                    C28000kLe c28000kLeKWHzl2 = abstractC27884kGx.KWHzl();
                    tradeGroupData = listKWHzl.get(c28000kLeKWHzl2 != null ? c28000kLeKWHzl2.getCurrentItem() : 0);
                }
                objM7377constructorimpl = Result.m7377constructorimpl(tradeGroupData);
            } catch (Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                objM7377constructorimpl = null;
            }
            MarketModuleChooseFragment.Activity activity = MarketModuleChooseFragment.Companion;
            FragmentManager childFragmentManager = this.this$0.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            this.label = 1;
            obj = activity.KWHzl(childFragmentManager, (TradeGroupData) objM7377constructorimpl, "market_page", this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        TradeGroupData tradeGroupData2 = obj instanceof TradeGroupData ? (TradeGroupData) obj : null;
        AbstractC27884kGx.StateListAnimator stateListAnimator2 = this.this$0.djBIcL;
        if (stateListAnimator2 != null && (listKWHzl2 = stateListAnimator2.KWHzl()) != null) {
            Iterator<TradeGroupData> it = listKWHzl2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                }
                if (Intrinsics.EZpvd((Object) it.next().getId(), (Object) (tradeGroupData2 != null ? tradeGroupData2.getId() : null))) {
                    break;
                }
                i2++;
            }
            numAEQbTJ = C56443yFo.AEQbTJ(i2);
        }
        if (numAEQbTJ != null && numAEQbTJ.intValue() > 0 && (c28000kLeKWHzl = this.this$0.KWHzl()) != null) {
            c28000kLeKWHzl.setCurrentItem(numAEQbTJ.intValue(), true);
        }
        return Unit.INSTANCE;
    }
}
