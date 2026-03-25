package com.okinc.business.dexlogic.liquiditypools;

import com.okinc.business.dexui.main.market.detail.fragment.chart.pooltransactions.liquiditypools.itemviewbinding.ChangedTokenInfoUIItem;
import com.okinc.business.dexui.main.market.detail.fragment.chart.pooltransactions.liquiditypools.itemviewbinding.LiquidityPoolListingUIItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.InterfaceC22375heF;
import o.hSE;

/* JADX INFO: loaded from: classes6.dex */
public final class LiquidityPoolTabListingViewModel$getLiquidityHistoryBottomSheetDetails$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LiquidityPoolListingUIItem $selectedItem;
    int label;
    final /* synthetic */ LiquidityPoolTabListingViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiquidityPoolTabListingViewModel$getLiquidityHistoryBottomSheetDetails$1(LiquidityPoolListingUIItem liquidityPoolListingUIItem, LiquidityPoolTabListingViewModel liquidityPoolTabListingViewModel, Continuation<? super LiquidityPoolTabListingViewModel$getLiquidityHistoryBottomSheetDetails$1> continuation) {
        super(2, continuation);
        this.$selectedItem = liquidityPoolListingUIItem;
        this.this$0 = liquidityPoolTabListingViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LiquidityPoolTabListingViewModel$getLiquidityHistoryBottomSheetDetails$1(this.$selectedItem, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LiquidityPoolTabListingViewModel$getLiquidityHistoryBottomSheetDetails$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            LiquidityPoolListingUIItem liquidityPoolListingUIItem = this.$selectedItem;
            LiquidityPoolTabListingViewModel liquidityPoolTabListingViewModel = this.this$0;
            List<ChangedTokenInfoUIItem> changedTokenInfo = liquidityPoolListingUIItem.getChangedTokenInfo();
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(changedTokenInfo, 10));
            for (ChangedTokenInfoUIItem changedTokenInfoUIItem : changedTokenInfo) {
                arrayList.add(new hSE(changedTokenInfoUIItem.getTokenSymbol(), changedTokenInfoUIItem.getAmount(), liquidityPoolListingUIItem.getType()));
            }
            liquidityPoolTabListingViewModel.OLrzqt.setValue(new InterfaceC22375heF.Activity(arrayList));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
