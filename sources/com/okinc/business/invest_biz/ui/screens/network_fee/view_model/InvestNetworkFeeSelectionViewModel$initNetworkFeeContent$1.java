package com.okinc.business.invest_biz.ui.screens.network_fee.view_model;

import com.okinc.business.invest_biz.ui.screens.network_fee.model.InvestNetworkFeeItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C25493ixk;
import o.C26486jdI;
import o.C56391yDq;
import o.C56402yEa;
import o.C56403yEb;
import o.C56442yFn;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestNetworkFeeSelectionViewModel$initNetworkFeeContent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ InvestNetworkFeeSelectionViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestNetworkFeeSelectionViewModel$initNetworkFeeContent$1(InvestNetworkFeeSelectionViewModel investNetworkFeeSelectionViewModel, Continuation<? super InvestNetworkFeeSelectionViewModel$initNetworkFeeContent$1> continuation) {
        super(2, continuation);
        this.this$0 = investNetworkFeeSelectionViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestNetworkFeeSelectionViewModel$initNetworkFeeContent$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InvestNetworkFeeSelectionViewModel$initNetworkFeeContent$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        InvestNetworkFeeItem investNetworkFeeItemMapFromNetworkGear$default;
        InvestNetworkFeeItem investNetworkFeeItemAEQbTJ;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        } else {
            C56391yDq.AEQbTJ(obj);
            InvestNetworkFeeSelectionViewModel investNetworkFeeSelectionViewModel = this.this$0;
            List listOLrzqt = C56402yEa.OLrzqt();
            InvestNetworkFeeItem.Companion companion = InvestNetworkFeeItem.Companion;
            listOLrzqt.add(InvestNetworkFeeItem.Companion.mapFromNetworkGear$default(companion, C25493ixk.FragmentManager.gmHjFq, investNetworkFeeSelectionViewModel.OLrzqt().getSlowGear(), false, false, 8, null));
            listOLrzqt.add(companion.copydefault(C25493ixk.FragmentManager.gSBher, investNetworkFeeSelectionViewModel.OLrzqt().getAverageGear(), false, true));
            listOLrzqt.add(InvestNetworkFeeItem.Companion.mapFromNetworkGear$default(companion, C25493ixk.FragmentManager.gUEfcq, investNetworkFeeSelectionViewModel.OLrzqt().getFastGear(), false, false, 8, null));
            if (investNetworkFeeSelectionViewModel.AEQbTJ() != null && (investNetworkFeeItemAEQbTJ = investNetworkFeeSelectionViewModel.AEQbTJ()) != null && investNetworkFeeItemAEQbTJ.isCustom()) {
                investNetworkFeeItemMapFromNetworkGear$default = investNetworkFeeSelectionViewModel.AEQbTJ();
                Intrinsics.copydefault(investNetworkFeeItemMapFromNetworkGear$default);
            } else {
                investNetworkFeeItemMapFromNetworkGear$default = InvestNetworkFeeItem.Companion.mapFromNetworkGear$default(companion, C25493ixk.FragmentManager.KWHzl, investNetworkFeeSelectionViewModel.OLrzqt().getAverageGear(), true, false, 8, null);
            }
            listOLrzqt.add(investNetworkFeeItemMapFromNetworkGear$default);
            List<InvestNetworkFeeItem> listFARcdN = C56402yEa.fARcdN(listOLrzqt);
            InvestNetworkFeeSelectionViewModel investNetworkFeeSelectionViewModel2 = this.this$0;
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listFARcdN, 10));
            for (InvestNetworkFeeItem investNetworkFeeItem : listFARcdN) {
                arrayList.add(investNetworkFeeItem.copy((6143 & 1) != 0 ? investNetworkFeeItem.title : null, (6143 & 2) != 0 ? investNetworkFeeItem.iconRes : 0, (6143 & 4) != 0 ? investNetworkFeeItem.isCustom : false, (6143 & 8) != 0 ? investNetworkFeeItem.calculateGasPrice : null, (6143 & 16) != 0 ? investNetworkFeeItem.estimatedTime : null, (6143 & 32) != 0 ? investNetworkFeeItem.gasPrice : null, (6143 & 64) != 0 ? investNetworkFeeItem.priorityFee : null, (6143 & 128) != 0 ? investNetworkFeeItem.gasPriceUnit : investNetworkFeeSelectionViewModel2.OLrzqt().getGasPriceUnit(), (6143 & 256) != 0 ? investNetworkFeeItem.minGasPrice : investNetworkFeeSelectionViewModel2.OLrzqt().getMinGasPrice(), (6143 & 512) != 0 ? investNetworkFeeItem.maxGasPrice : investNetworkFeeSelectionViewModel2.OLrzqt().getMaxGasPrice(), (6143 & 1024) != 0 ? investNetworkFeeItem.isExpand : false, (6143 & 2048) != 0 ? investNetworkFeeItem.selected : false, (6143 & 4096) != 0 ? investNetworkFeeItem.customGasPrice : null));
            }
            MutableStateFlow mutableStateFlow = this.this$0.OLrzqt;
            C26486jdI c26486jdI = new C26486jdI(arrayList.isEmpty(), null, arrayList);
            this.label = 1;
            if (mutableStateFlow.emit(c26486jdI, this) == objCopydefault) {
                return objCopydefault;
            }
        }
        InvestNetworkFeeItem investNetworkFeeItemAEQbTJ2 = this.this$0.AEQbTJ();
        if (investNetworkFeeItemAEQbTJ2 != null) {
            this.this$0.KWHzl(investNetworkFeeItemAEQbTJ2, true);
        }
        return Unit.INSTANCE;
    }
}
