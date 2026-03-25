package com.okinc.buysell.ui.paymentmethod;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.okinc.buysell.ui.paymentmethod.BasePaymentMethodFragment$runPreCheckFlow$1;
import com.okinc.okpaymentapi.data.remote.model.management.TradeType;
import com.okinc.okx.paymentapi.uv.PreCheckStatus;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractActivityC33041mov;
import o.AbstractC30075lKz;
import o.C43251rlk;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC47251tmX;
import o.lKA;
import o.mHA;

/* JADX INFO: loaded from: classes15.dex */
public final class BasePaymentMethodFragment$runPreCheckFlow$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ AbstractC30075lKz<BINDING, VM> this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasePaymentMethodFragment$runPreCheckFlow$1(AbstractC30075lKz<BINDING, VM> abstractC30075lKz, Continuation<? super BasePaymentMethodFragment$runPreCheckFlow$1> continuation) {
        super(2, continuation);
        this.this$0 = abstractC30075lKz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BasePaymentMethodFragment$runPreCheckFlow$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BasePaymentMethodFragment$runPreCheckFlow$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.fetchVPNInfo().EZpvd(true);
            InterfaceC47251tmX interfaceC47251tmX = (InterfaceC47251tmX) C43251rlk.copydefault(InterfaceC47251tmX.class);
            FragmentActivity fragmentActivityRequireActivity = this.this$0.requireActivity();
            Intrinsics.copydefault(fragmentActivityRequireActivity, "");
            Context contextRequireContext = this.this$0.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            FragmentManager parentFragmentManager = this.this$0.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
            TradeType tradeTypeUeEOUB = this.this$0.fetchVPNInfo().UeEOUB();
            String strAxsJAY = this.this$0.fetchVPNInfo().AxsJAY();
            String fieldNames = this.this$0.fetchVPNInfo().getFieldNames();
            String strORxRYg = this.this$0.fetchVPNInfo().ORxRYg();
            String strAwvSrB = this.this$0.fetchVPNInfo().AwvSrB();
            String strAubY = this.this$0.fetchVPNInfo().AubY();
            String strQbewEr = this.this$0.fetchVPNInfo().QbewEr();
            String strUzCIH = this.this$0.fetchVPNInfo().uzCIH();
            boolean z = this.this$0.isConnected;
            final AbstractC30075lKz<BINDING, VM> abstractC30075lKz = this.this$0;
            Function1 function1 = new Function1() { // from class: o.lKE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return BasePaymentMethodFragment$runPreCheckFlow$1.invokeSuspend$lambda$2(abstractC30075lKz, (PreCheckStatus) obj2);
                }
            };
            this.label = 1;
            if (InterfaceC47251tmX.StateListAnimator.runPrecheckForBuySell$default(interfaceC47251tmX, (AbstractActivityC33041mov) fragmentActivityRequireActivity, contextRequireContext, parentFragmentManager, tradeTypeUeEOUB, strAxsJAY, fieldNames, strORxRYg, strAwvSrB, strAubY, strQbewEr, strUzCIH, z, null, function1, this, 4096, null) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$2(final AbstractC30075lKz abstractC30075lKz, PreCheckStatus preCheckStatus) {
        if (Intrinsics.EZpvd(preCheckStatus, PreCheckStatus.ApiFinishedLoad.copydefault)) {
            abstractC30075lKz.isConnected = false;
            abstractC30075lKz.fetchVPNInfo().EZpvd(false);
        } else if (preCheckStatus instanceof PreCheckStatus.Success) {
            abstractC30075lKz.fetchVPNInfo().EZpvd(true);
            abstractC30075lKz.isConnected().EZpvd(abstractC30075lKz.fetchVPNInfo().UeEOUB(), new Function1() { // from class: o.lKC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return BasePaymentMethodFragment$runPreCheckFlow$1.invokeSuspend$lambda$2$lambda$0(abstractC30075lKz, (lKA) obj);
                }
            }, new Function1() { // from class: o.lKF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return BasePaymentMethodFragment$runPreCheckFlow$1.invokeSuspend$lambda$2$lambda$1(abstractC30075lKz, (lKA) obj);
                }
            });
        } else if (preCheckStatus instanceof PreCheckStatus.ApiFailed) {
            abstractC30075lKz.fetchVPNInfo().EZpvd(false);
            C55326xho.toast$default(((PreCheckStatus.ApiFailed) preCheckStatus).KWHzl(), (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
        } else if (!Intrinsics.EZpvd(preCheckStatus, PreCheckStatus.NotSuccess.copydefault)) {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$2$lambda$0(AbstractC30075lKz abstractC30075lKz, lKA lka) {
        abstractC30075lKz.fetchVPNInfo().OLrzqt(abstractC30075lKz.isConnected().fARcdN());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$2$lambda$1(AbstractC30075lKz abstractC30075lKz, lKA lka) {
        mHA.OLrzqt.OLrzqt(abstractC30075lKz.fetchVPNInfo().gGvvIC(), lka);
        return Unit.INSTANCE;
    }
}
