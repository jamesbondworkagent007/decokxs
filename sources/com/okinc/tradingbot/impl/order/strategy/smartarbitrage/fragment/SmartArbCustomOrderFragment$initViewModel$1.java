package com.okinc.tradingbot.impl.order.strategy.smartarbitrage.fragment;

import android.text.SpannableStringBuilder;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.DataInputModuleModel;
import com.okinc.unify_trade.biz.FundingRateArbCoin;
import com.okinc.unify_trade.biz.FundingRateArbResult;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C33070mpX;
import o.C33129mqd;
import o.C48033uCm;
import o.C49952uyJ;
import o.C52902wbQ;
import o.C55113xdn;
import o.C55173xeu;
import o.C55688xof;
import o.C56391yDq;
import o.C56442yFn;
import o.rVN;
import o.uSO;
import o.vNB;
import o.xMR;
import o.yDY;

/* JADX INFO: loaded from: classes11.dex */
public final class SmartArbCustomOrderFragment$initViewModel$1 extends SuspendLambda implements Function2<vNB<? extends FundingRateArbResult>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C52902wbQ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmartArbCustomOrderFragment$initViewModel$1(C52902wbQ c52902wbQ, Continuation<? super SmartArbCustomOrderFragment$initViewModel$1> continuation) {
        super(2, continuation);
        this.this$0 = c52902wbQ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SmartArbCustomOrderFragment$initViewModel$1 smartArbCustomOrderFragment$initViewModel$1 = new SmartArbCustomOrderFragment$initViewModel$1(this.this$0, continuation);
        smartArbCustomOrderFragment$initViewModel$1.L$0 = obj;
        return smartArbCustomOrderFragment$initViewModel$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(vNB<? extends FundingRateArbResult> vnb, Continuation<? super Unit> continuation) {
        return invoke2((vNB<FundingRateArbResult>) vnb, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(vNB<FundingRateArbResult> vnb, Continuation<? super Unit> continuation) {
        return ((SmartArbCustomOrderFragment$initViewModel$1) create(vnb, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            vNB vnb = (vNB) this.L$0;
            uSO uso = this.this$0.valueOf;
            if (uso != null) {
                C52902wbQ c52902wbQ = this.this$0;
                boolean z = vnb instanceof vNB.TaskDescription;
                if (z) {
                    FundingRateArbResult fundingRateArbResult = (FundingRateArbResult) ((vNB.TaskDescription) vnb).AEQbTJ();
                    uso.KWHzl.setText(c52902wbQ.copydefault(new SpannableStringBuilder(C33070mpX.AYXKKw(C48033uCm.Fragment.fQQVvf)), DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, xMR.copydefault.copydefault(C33129mqd.AYXKKw(fundingRateArbResult.getUserCount()))));
                    List<FundingRateArbCoin> coins = fundingRateArbResult.getCoins();
                    if (coins == null) {
                        coins = yDY.AhwBna();
                    }
                    c52902wbQ.AhwBna = coins;
                    C49952uyJ.updateDataOrEmpty$default(c52902wbQ.djBIcL, c52902wbQ.AhwBna, C33070mpX.AYXKKw(C55688xof.Application.WorkerThread), 0, null, null, false, 56, null);
                }
                boolean z2 = vnb instanceof vNB.Activity;
                LinearLayoutCompat linearLayoutCompat = uso.AYXKKw;
                Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
                linearLayoutCompat.setVisibility(z ? 0 : 8);
                C55173xeu c55173xeu = uso.EZpvd;
                Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
                c55173xeu.setVisibility(vnb instanceof vNB.StateListAnimator ? 0 : 8);
                C55113xdn c55113xdn = uso.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
                c55113xdn.setVisibility(z2 ? 0 : 8);
                if (!z2) {
                    rVN.reportFullyDrawn$default(c52902wbQ, z, (String) null, 2, (Object) null);
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
