package com.okinc.tradingbot.impl.strategy.fragment.detail;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.fragment.app.Fragment;
import com.okinc.unify_trade.bot.data.GridPendingEmptyData;
import com.okinc.unify_trade.bot.data.GridPendingItemData;
import com.okinc.unify_trade.bot.data.GridPendingOrderData;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C33070mpX;
import o.C50027uzf;
import o.C55173xeu;
import o.C55258xgZ;
import o.C55688xof;
import o.C56391yDq;
import o.C56402yEa;
import o.C56442yFn;
import o.rVN;
import o.wCY;

/* JADX INFO: loaded from: classes19.dex */
public final class GridPendingOrderFragment$subscribeOnUIChange$4 extends SuspendLambda implements Function2<GridPendingOrderData, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ wCY this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GridPendingOrderFragment$subscribeOnUIChange$4(wCY wcy, Continuation<? super GridPendingOrderFragment$subscribeOnUIChange$4> continuation) {
        super(2, continuation);
        this.this$0 = wcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GridPendingOrderFragment$subscribeOnUIChange$4 gridPendingOrderFragment$subscribeOnUIChange$4 = new GridPendingOrderFragment$subscribeOnUIChange$4(this.this$0, continuation);
        gridPendingOrderFragment$subscribeOnUIChange$4.L$0 = obj;
        return gridPendingOrderFragment$subscribeOnUIChange$4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(GridPendingOrderData gridPendingOrderData, Continuation<? super Unit> continuation) {
        return ((GridPendingOrderFragment$subscribeOnUIChange$4) create(gridPendingOrderData, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List<GridPendingItemData> buyList;
        List<GridPendingItemData> sellList;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            GridPendingOrderData gridPendingOrderData = (GridPendingOrderData) this.L$0;
            int i = this.this$0.AkhnZx().contains(this.this$0.dxcTrN().EZpvd().getOrderType()) ? C55688xof.Application.setListNavigationCallbacks : C55688xof.Application.startActionMode;
            int i2 = this.this$0.AkhnZx().contains(this.this$0.dxcTrN().EZpvd().getOrderType()) ? C55688xof.Application.setHomeButtonEnabled : C55688xof.Application.show;
            if (gridPendingOrderData.getBuyList().isEmpty()) {
                buyList = C56402yEa.EZpvd(new GridPendingEmptyData(C33070mpX.AYXKKw(i), true, 8.0f));
            } else {
                buyList = gridPendingOrderData.getBuyList();
            }
            C50027uzf.submitList$default(this.this$0.djBIcL(), buyList, null, 2, null);
            if (gridPendingOrderData.getSellList().isEmpty()) {
                sellList = C56402yEa.EZpvd(new GridPendingEmptyData(C33070mpX.AYXKKw(i2), false, 8.0f));
            } else {
                sellList = gridPendingOrderData.getSellList();
            }
            C50027uzf.submitList$default(this.this$0.AYXKKw(), sellList, null, 2, null);
            this.this$0.KWHzl(gridPendingOrderData.getBuyList().size(), gridPendingOrderData.getSellList().size());
            this.this$0.copydefault((List<GridPendingItemData>) gridPendingOrderData.getBuyList(), (List<GridPendingItemData>) gridPendingOrderData.getSellList());
            this.this$0.fetchVPNInfo();
            C55173xeu c55173xeu = this.this$0.gGvvIC().isConnected;
            Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
            c55173xeu.setVisibility(8);
            wCY wcy = this.this$0;
            List<GridPendingItemData> buyList2 = gridPendingOrderData.getBuyList();
            C55258xgZ c55258xgZ = this.this$0.gGvvIC().uzCIH;
            Intrinsics.checkNotNullExpressionValue(c55258xgZ, "");
            wcy.OLrzqt(buyList2, c55258xgZ, this.this$0.dxcTrN().EZpvd().getOrderType());
            wCY wcy2 = this.this$0;
            List<GridPendingItemData> sellList2 = gridPendingOrderData.getSellList();
            C55258xgZ c55258xgZ2 = this.this$0.gGvvIC().iwGUEr;
            Intrinsics.checkNotNullExpressionValue(c55258xgZ2, "");
            wcy2.OLrzqt(sellList2, c55258xgZ2, this.this$0.dxcTrN().EZpvd().getOrderType());
            boolean z = gridPendingOrderData.getBuyList().isEmpty() && gridPendingOrderData.getSellList().isEmpty();
            LinearLayoutCompat linearLayoutCompat = this.this$0.gGvvIC().fJNWhG;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
            linearLayoutCompat.setVisibility(z ^ true ? 0 : 8);
            C55173xeu c55173xeu2 = this.this$0.gGvvIC().AYXKKw;
            Intrinsics.checkNotNullExpressionValue(c55173xeu2, "");
            c55173xeu2.setVisibility(z ? 0 : 8);
            rVN.reportFullyDrawn$default((Fragment) this.this$0, true, (String) null, 2, (Object) null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
