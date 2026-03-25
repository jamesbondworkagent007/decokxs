package com.okinc.business.dexui.main.limitorder.orderdetail;

import android.app.Activity;
import android.content.Context;
import androidx.core.widget.NestedScrollView;
import com.okinc.business.dex.trade.order.domain.model.OrderSubStatus;
import com.okinc.business.dexlogic.main.limmitorder.bean.OrderDetailListItem;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import o.C21808hNb;
import o.C22313hcx;
import o.C23274hvD;
import o.C23377hxA;
import o.C25382ivf;
import o.C33070mpX;
import o.C33512mxp;
import o.C52761wXj;
import o.C55173xeu;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC22524hgw;
import o.rVN;

/* JADX INFO: loaded from: classes18.dex */
public final class LimitOrderDetailActivity$addDataListener$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ LimitOrderDetailActivity this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LimitOrderDetailActivity$addDataListener$1(LimitOrderDetailActivity limitOrderDetailActivity, Continuation<? super LimitOrderDetailActivity$addDataListener$1> continuation) {
        super(2, continuation);
        this.this$0 = limitOrderDetailActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LimitOrderDetailActivity$addDataListener$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LimitOrderDetailActivity$addDataListener$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            StateFlow<InterfaceC22524hgw> stateFlowValueOf = this.this$0.AhwBna().valueOf();
            final LimitOrderDetailActivity limitOrderDetailActivity = this.this$0;
            FlowCollector<? super InterfaceC22524hgw> flowCollector = new FlowCollector() { // from class: com.okinc.business.dexui.main.limitorder.orderdetail.LimitOrderDetailActivity$addDataListener$1.4
                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
                public final Object emit(InterfaceC22524hgw interfaceC22524hgw, Continuation<? super Unit> continuation) {
                    String tokenIcon;
                    String tokenIcon2;
                    String string;
                    if (interfaceC22524hgw instanceof InterfaceC22524hgw.Application) {
                        limitOrderDetailActivity.gEmmrt();
                        rVN.reportFullyDrawn$default((Activity) limitOrderDetailActivity, true, (String) null, 2, (Object) null);
                        C23377hxA c23377hxA = limitOrderDetailActivity.valueOf;
                        if (c23377hxA != null) {
                            LimitOrderDetailActivity limitOrderDetailActivity2 = limitOrderDetailActivity;
                            NestedScrollView nestedScrollView = c23377hxA.DbNXlk;
                            Intrinsics.checkNotNullExpressionValue(nestedScrollView, "");
                            nestedScrollView.setVisibility(0);
                            C55173xeu c55173xeu = c23377hxA.AEQbTJ;
                            Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
                            c55173xeu.setVisibility(8);
                            C22313hcx c22313hcx = c23377hxA.OLrzqt;
                            Intrinsics.checkNotNullExpressionValue(c22313hcx, "");
                            c22313hcx.setVisibility(8);
                            limitOrderDetailActivity2.AhwBna().isConnected();
                            InterfaceC22524hgw.Application application = (InterfaceC22524hgw.Application) interfaceC22524hgw;
                            OrderDetailListItem orderDetailListItem = (OrderDetailListItem) CollectionsKt___CollectionsKt.firstOrNull(application.AEQbTJ());
                            C21808hNb c21808hNb = c23377hxA.fJNWhG;
                            if (orderDetailListItem == null || (tokenIcon = orderDetailListItem.getTokenIcon()) == null) {
                                tokenIcon = "";
                            }
                            c21808hNb.OLrzqt(tokenIcon);
                            c21808hNb.setOrderSideMessage(C33070mpX.AYXKKw(C23274hvD.Fragment.UimiPO));
                            String strShowFromCoinAmountWithoutSymbol = orderDetailListItem != null ? orderDetailListItem.showFromCoinAmountWithoutSymbol() : null;
                            if (strShowFromCoinAmountWithoutSymbol == null) {
                                strShowFromCoinAmountWithoutSymbol = "";
                            }
                            String tokenSymbol = orderDetailListItem != null ? orderDetailListItem.getTokenSymbol() : null;
                            if (tokenSymbol == null) {
                                tokenSymbol = "";
                            }
                            c21808hNb.setValue(strShowFromCoinAmountWithoutSymbol, tokenSymbol);
                            Intrinsics.copydefault(c21808hNb);
                            limitOrderDetailActivity2.EZpvd(c21808hNb, orderDetailListItem);
                            String status = orderDetailListItem != null ? orderDetailListItem.getStatus() : null;
                            OrderSubStatus orderSubStatus = OrderSubStatus.Completed;
                            if (Intrinsics.EZpvd((Object) status, (Object) String.valueOf(orderSubStatus.getStatus()))) {
                                c21808hNb.setValueColor(C25382ivf.KWHzl(limitOrderDetailActivity2, C52761wXj.Activity.DeEinT));
                            }
                            OrderDetailListItem orderDetailListItem2 = (OrderDetailListItem) CollectionsKt___CollectionsKt.wlaJM(application.AEQbTJ());
                            C21808hNb c21808hNb2 = c23377hxA.ejfBZ;
                            if (orderDetailListItem2 == null || (tokenIcon2 = orderDetailListItem2.getTokenIcon()) == null) {
                                tokenIcon2 = "";
                            }
                            c21808hNb2.OLrzqt(tokenIcon2);
                            if (Intrinsics.EZpvd((Object) (orderDetailListItem2 != null ? orderDetailListItem2.getStatus() : null), (Object) String.valueOf(orderSubStatus.getStatus()))) {
                                string = limitOrderDetailActivity2.getString(C23274hvD.Fragment.onServiceConnected);
                            } else {
                                string = limitOrderDetailActivity2.getString(C23274hvD.Fragment.getPosition);
                            }
                            Intrinsics.copydefault((Object) string);
                            c21808hNb2.setOrderSideMessage(string);
                            String strShowFromCoinAmountWithoutSymbol2 = orderDetailListItem2 != null ? orderDetailListItem2.showFromCoinAmountWithoutSymbol() : null;
                            if (strShowFromCoinAmountWithoutSymbol2 == null) {
                                strShowFromCoinAmountWithoutSymbol2 = "";
                            }
                            String tokenSymbol2 = orderDetailListItem2 != null ? orderDetailListItem2.getTokenSymbol() : null;
                            if (tokenSymbol2 == null) {
                                tokenSymbol2 = "";
                            }
                            c21808hNb2.setValue(strShowFromCoinAmountWithoutSymbol2, tokenSymbol2);
                            Intrinsics.copydefault(c21808hNb2);
                            limitOrderDetailActivity2.EZpvd(c21808hNb2, orderDetailListItem2);
                            if (Intrinsics.EZpvd((Object) (orderDetailListItem2 != null ? orderDetailListItem2.getStatus() : null), (Object) String.valueOf(orderSubStatus.getStatus()))) {
                                C33512mxp c33512mxp = C33512mxp.AEQbTJ;
                                Context context = c21808hNb2.getContext();
                                Intrinsics.checkNotNullExpressionValue(context, "");
                                c21808hNb2.setValueColor(C33512mxp.tradeRiseDefault$default(c33512mxp, context, 0.0f, 2, null));
                            }
                        }
                    } else if (interfaceC22524hgw instanceof InterfaceC22524hgw.Activity) {
                        limitOrderDetailActivity.gEmmrt();
                        rVN.reportFullyDrawn$default((Activity) limitOrderDetailActivity, false, (String) null, 2, (Object) null);
                        limitOrderDetailActivity.AhwBna().DbNXlk();
                        limitOrderDetailActivity.EZpvd(((InterfaceC22524hgw.Activity) interfaceC22524hgw).EZpvd());
                    } else if (!Intrinsics.EZpvd(interfaceC22524hgw, InterfaceC22524hgw.TaskDescription.OLrzqt)) {
                        if (Intrinsics.EZpvd(interfaceC22524hgw, InterfaceC22524hgw.ActionBar.AEQbTJ)) {
                            limitOrderDetailActivity.AkhnZx();
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (stateFlowValueOf.collect(flowCollector, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        throw new KotlinNothingValueException();
    }
}
