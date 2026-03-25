package com.okinc.tradingbot.impl.order.strategy.smartarbitrage.fragment;

import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.okinc.unify_trade.biz.ArbitrageInfoResponse;
import com.okinc.unify_trade.biz.CostVo;
import com.okinc.unify_trade.biz.EstimatedStakingVo;
import com.okinc.unify_trade.biz.SwapInstrument;
import java.math.RoundingMode;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C33069mpW;
import o.C33129mqd;
import o.C48033uCm;
import o.C52903wbR;
import o.C55326xho;
import o.C56033xvF;
import o.C56390yDp;
import o.C56391yDq;
import o.C56424yEw;
import o.C56442yFn;
import o.C56443yFo;
import o.rVN;
import o.uSW;
import o.vNB;
import o.xMR;

/* JADX INFO: loaded from: classes16.dex */
public final class SmartArbitrageManualFragment$initObserver$8 extends SuspendLambda implements Function2<vNB<? extends ArbitrageInfoResponse>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C52903wbR this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmartArbitrageManualFragment$initObserver$8(C52903wbR c52903wbR, Continuation<? super SmartArbitrageManualFragment$initObserver$8> continuation) {
        super(2, continuation);
        this.this$0 = c52903wbR;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SmartArbitrageManualFragment$initObserver$8 smartArbitrageManualFragment$initObserver$8 = new SmartArbitrageManualFragment$initObserver$8(this.this$0, continuation);
        smartArbitrageManualFragment$initObserver$8.L$0 = obj;
        return smartArbitrageManualFragment$initObserver$8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(vNB<? extends ArbitrageInfoResponse> vnb, Continuation<? super Unit> continuation) {
        return invoke2((vNB<ArbitrageInfoResponse>) vnb, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(vNB<ArbitrageInfoResponse> vnb, Continuation<? super Unit> continuation) {
        return ((SmartArbitrageManualFragment$initObserver$8) create(vnb, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            vNB vnb = (vNB) this.L$0;
            if (vnb instanceof vNB.TaskDescription) {
                ArbitrageInfoResponse arbitrageInfoResponse = (ArbitrageInfoResponse) ((vNB.TaskDescription) vnb).AEQbTJ();
                this.this$0.EZpvd(arbitrageInfoResponse.getEstimatedApyList());
                C52903wbR.gEmmrt(this.this$0).OLrzqt(arbitrageInfoResponse.getHighestApyPeriod());
                uSW uswIsConnected = C52903wbR.isConnected(this.this$0);
                C52903wbR c52903wbR = this.this$0;
                String minimalPaybackDays = arbitrageInfoResponse.getMinimalPaybackDays();
                if (!Boolean.parseBoolean(arbitrageInfoResponse.getDisplayMinPaybackDays())) {
                    minimalPaybackDays = null;
                }
                c52903wbR.KWHzl(uswIsConnected, minimalPaybackDays);
                c52903wbR.AhwBna(uswIsConnected);
                c52903wbR.AubY();
                String strCopydefault = "--";
                uswIsConnected.QKVWgx.setText(StringsKt__StringsKt.fARcdN((CharSequence) arbitrageInfoResponse.getMarketSpreadRatio()) ? "--" : xMR.copydefault.AEQbTJ(arbitrageInfoResponse.getMarketSpreadRatio(), 3, RoundingMode.FLOOR));
                uswIsConnected.copydefault.copydefault(arbitrageInfoResponse.getSpreadRatio(), arbitrageInfoResponse.getUnitAmt(), uswIsConnected.getFieldNames.fARcdN());
                TextView textView = uswIsConnected.RJOkX;
                Intrinsics.copydefault(textView);
                EstimatedStakingVo estimatedStaking = arbitrageInfoResponse.getEstimatedStaking();
                textView.setVisibility(C33129mqd.AEQbTJ(estimatedStaking != null ? estimatedStaking.getStakingTotalBaseAmt() : null, "0") ? 0 : 8);
                int i = C48033uCm.Fragment.DQnQnb;
                Pair[] pairArr = new Pair[2];
                EstimatedStakingVo estimatedStaking2 = arbitrageInfoResponse.getEstimatedStaking();
                String baseCcy = estimatedStaking2 != null ? estimatedStaking2.getBaseCcy() : null;
                if (baseCcy == null) {
                    baseCcy = "";
                }
                pairArr[0] = C56390yDp.OLrzqt("crypto1", baseCcy);
                EstimatedStakingVo estimatedStaking3 = arbitrageInfoResponse.getEstimatedStaking();
                String stakeBaseCcy = estimatedStaking3 != null ? estimatedStaking3.getStakeBaseCcy() : null;
                if (stakeBaseCcy == null) {
                    stakeBaseCcy = "";
                }
                pairArr[1] = C56390yDp.OLrzqt("crypto2", stakeBaseCcy);
                textView.setText(C33069mpW.copydefault(c52903wbR, i, (Map<String, ? extends Object>) C56424yEw.gEmmrt(pairArr)));
                TextView textView2 = uswIsConnected.ejfBZ;
                CostVo estimatedOpenCost = arbitrageInfoResponse.getEstimatedOpenCost();
                String totalCostAmt = estimatedOpenCost != null ? estimatedOpenCost.getTotalCostAmt() : null;
                String str = totalCostAmt != null ? totalCostAmt : "";
                SwapInstrument swapInstrumentOLrzqt = C52903wbR.gEmmrt(c52903wbR).OLrzqt();
                boolean z = StringsKt__StringsKt.fARcdN((CharSequence) str) || swapInstrumentOLrzqt == null || StringsKt__StringsKt.fARcdN((CharSequence) uswIsConnected.getFieldNames.AkhnZx());
                if (!z) {
                    strCopydefault = C56033xvF.copydefault(str, swapInstrumentOLrzqt.getCcyType(), (88 & 4) != 0 ? false : true, (88 & 8) != 0 ? null : "3", (88 & 16) != 0 ? false : false, (88 & 32) == 0, (88 & 64) == 0 ? null : null);
                }
                textView2.setText(strCopydefault);
                if (C56443yFo.KWHzl(z).booleanValue()) {
                    str = null;
                }
                textView2.setTextColor(C56033xvF.OLrzqt((Object) str));
                rVN.reportFullyDrawn$default((Fragment) this.this$0, true, (String) null, 2, (Object) null);
            } else if (vnb instanceof vNB.StateListAnimator) {
                String message = ((vNB.StateListAnimator) vnb).AEQbTJ().getMessage();
                if (message != null) {
                    C55326xho.toastWithFailedIcon$default(message, 0, 1, (Object) null);
                }
                rVN.reportFullyDrawn$default((Fragment) this.this$0, false, (String) null, 2, (Object) null);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
