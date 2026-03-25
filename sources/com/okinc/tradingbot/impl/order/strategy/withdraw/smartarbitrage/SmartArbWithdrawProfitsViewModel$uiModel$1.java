package com.okinc.tradingbot.impl.order.strategy.withdraw.smartarbitrage;

import com.okinc.tradingbot.impl.order.strategy.api.dto.smartarb.SmartArbWithdrawProfitResponse;
import com.okinc.tradingbot.impl.order.strategy.withdraw.smartarbitrage.SmartArbWithdrawProfitsViewModel;
import com.okinc.unify_trade.biz.ProfitDetailResponse;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import com.okinc.unify_trade.bot.data.TacticsData;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.uLP;
import o.uLU;
import o.yDY;
import o.yHQ;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes11.dex */
public final class SmartArbWithdrawProfitsViewModel$uiModel$1 extends SuspendLambda implements yHQ<uLU<? extends SmartArbWithdrawProfitResponse>, SmartArbWithdrawType, TickersData, Map<SmartArbWithdrawType, ? extends String>, Map<SmartArbWithdrawType, ? extends SmartArbWithdrawProfitsViewModel.Dialog>, Continuation<? super SmartArbWithdrawProfitsViewModel.PendingIntent>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    /* synthetic */ Object L$3;
    /* synthetic */ Object L$4;
    int label;
    final /* synthetic */ SmartArbWithdrawProfitsViewModel this$0;

    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[SmartArbWithdrawType.values().length];
            try {
                iArr[SmartArbWithdrawType.Arbitrage.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SmartArbWithdrawType.Staking.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            copydefault = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmartArbWithdrawProfitsViewModel$uiModel$1(SmartArbWithdrawProfitsViewModel smartArbWithdrawProfitsViewModel, Continuation<? super SmartArbWithdrawProfitsViewModel$uiModel$1> continuation) {
        super(6, continuation);
        this.this$0 = smartArbWithdrawProfitsViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHQ
    public /* bridge */ /* synthetic */ Object invoke(uLU<? extends SmartArbWithdrawProfitResponse> ulu, SmartArbWithdrawType smartArbWithdrawType, TickersData tickersData, Map<SmartArbWithdrawType, ? extends String> map, Map<SmartArbWithdrawType, ? extends SmartArbWithdrawProfitsViewModel.Dialog> map2, Continuation<? super SmartArbWithdrawProfitsViewModel.PendingIntent> continuation) {
        return invoke2((uLU<SmartArbWithdrawProfitResponse>) ulu, smartArbWithdrawType, tickersData, (Map<SmartArbWithdrawType, String>) map, (Map<SmartArbWithdrawType, SmartArbWithdrawProfitsViewModel.Dialog>) map2, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(uLU<SmartArbWithdrawProfitResponse> ulu, SmartArbWithdrawType smartArbWithdrawType, TickersData tickersData, Map<SmartArbWithdrawType, String> map, Map<SmartArbWithdrawType, SmartArbWithdrawProfitsViewModel.Dialog> map2, Continuation<? super SmartArbWithdrawProfitsViewModel.PendingIntent> continuation) {
        SmartArbWithdrawProfitsViewModel$uiModel$1 smartArbWithdrawProfitsViewModel$uiModel$1 = new SmartArbWithdrawProfitsViewModel$uiModel$1(this.this$0, continuation);
        smartArbWithdrawProfitsViewModel$uiModel$1.L$0 = ulu;
        smartArbWithdrawProfitsViewModel$uiModel$1.L$1 = smartArbWithdrawType;
        smartArbWithdrawProfitsViewModel$uiModel$1.L$2 = tickersData;
        smartArbWithdrawProfitsViewModel$uiModel$1.L$3 = map;
        smartArbWithdrawProfitsViewModel$uiModel$1.L$4 = map2;
        return smartArbWithdrawProfitsViewModel$uiModel$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ProfitDetailResponse profitDetailResponse;
        ProfitDetailResponse arbitrageProfit;
        Object next;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            uLU ulu = (uLU) this.L$0;
            SmartArbWithdrawType smartArbWithdrawType = (SmartArbWithdrawType) this.L$1;
            TickersData tickersData = (TickersData) this.L$2;
            Map map = (Map) this.L$3;
            Map map2 = (Map) this.L$4;
            if (!(ulu instanceof uLU.ActionBar)) {
                SmartArbWithdrawType smartArbWithdrawTypeAEQbTJ = this.this$0.AEQbTJ();
                SmartArbWithdrawProfitsViewModel smartArbWithdrawProfitsViewModel = this.this$0;
                return new SmartArbWithdrawProfitsViewModel.PendingIntent(smartArbWithdrawTypeAEQbTJ, smartArbWithdrawProfitsViewModel.AEQbTJ(null, smartArbWithdrawProfitsViewModel.AEQbTJ(), null, null, null, null), uLP.EZpvd("--", "0"), "USDT", null, null, false, 4, "", "", null);
            }
            uLU.ActionBar actionBar = (uLU.ActionBar) ulu;
            ProfitDetailResponse autoStakingProfit = ((SmartArbWithdrawProfitResponse) actionBar.KWHzl()).getAutoStakingProfit();
            if (autoStakingProfit == null) {
                TacticsData tacticsDataHDKMBd = this.this$0.hDKMBd();
                if (tacticsDataHDKMBd == null || !tacticsDataHDKMBd.isSmartArbitrageWithStaking()) {
                    String strOLrzqt = this.this$0.OLrzqt();
                    String str = strOLrzqt == null ? "" : strOLrzqt;
                    String strGEmmrt = this.this$0.gEmmrt();
                    profitDetailResponse = new ProfitDetailResponse(str, (String) null, (String) null, "0", (String) null, new ProfitDetailResponse(strGEmmrt == null ? "" : strGEmmrt, (String) null, (String) null, (String) null, (String) null, (ProfitDetailResponse) null, (String) null, WebSocketProtocol.PAYLOAD_SHORT, (DefaultConstructorMarker) null), (String) null, 86, (DefaultConstructorMarker) null);
                } else {
                    profitDetailResponse = null;
                }
            } else {
                profitDetailResponse = autoStakingProfit;
            }
            int i = ActionBar.copydefault[smartArbWithdrawType.ordinal()];
            if (i == 1) {
                arbitrageProfit = ((SmartArbWithdrawProfitResponse) actionBar.KWHzl()).getArbitrageProfit();
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                Iterator it = yDY.valueOf(((SmartArbWithdrawProfitResponse) actionBar.KWHzl()).getStakingProfit(), profitDetailResponse).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (Intrinsics.EZpvd((Object) ((ProfitDetailResponse) next).getCcy(), (Object) smartArbWithdrawType.getCcy())) {
                        break;
                    }
                }
                arbitrageProfit = (ProfitDetailResponse) next;
            }
            ProfitDetailResponse profitDetailResponse2 = arbitrageProfit;
            Pair pairEZpvd = this.this$0.EZpvd(smartArbWithdrawType, profitDetailResponse2, false);
            SmartArbWithdrawProfitsViewModel smartArbWithdrawProfitsViewModel2 = this.this$0;
            String str2 = (String) map.get(smartArbWithdrawType);
            SmartArbWithdrawProfitResponse smartArbWithdrawProfitResponse = (SmartArbWithdrawProfitResponse) actionBar.KWHzl();
            List listAEQbTJ = smartArbWithdrawProfitsViewModel2.AEQbTJ(profitDetailResponse2, smartArbWithdrawType, tickersData, str2, smartArbWithdrawProfitResponse != null ? smartArbWithdrawProfitResponse.getStakingProfit() : null, profitDetailResponse);
            String ccy = profitDetailResponse2 != null ? profitDetailResponse2.getCcy() : null;
            String str3 = ccy == null ? "" : ccy;
            SmartArbWithdrawProfitsViewModel.Dialog dialog = (SmartArbWithdrawProfitsViewModel.Dialog) map2.get(smartArbWithdrawType);
            Pair pairKWHzl = dialog != null ? dialog.KWHzl() : null;
            String strKWHzl = pairKWHzl != null ? SmartArbWithdrawProfitsViewModel.Dialog.KWHzl(pairKWHzl) : null;
            SmartArbWithdrawProfitsViewModel.Dialog dialog2 = (SmartArbWithdrawProfitsViewModel.Dialog) map2.get(smartArbWithdrawType);
            Pair pairKWHzl2 = dialog2 != null ? dialog2.KWHzl() : null;
            String strAEQbTJ = pairKWHzl2 != null ? SmartArbWithdrawProfitsViewModel.Dialog.AEQbTJ(pairKWHzl2) : null;
            boolean zOLrzqt = C33129mqd.OLrzqt(uLP.KWHzl(pairEZpvd), C56443yFo.AEQbTJ(0));
            String ccy2 = profitDetailResponse2 != null ? profitDetailResponse2.getCcy() : null;
            if (ccy2 == null) {
                ccy2 = "";
            }
            String ccy3 = profitDetailResponse != null ? profitDetailResponse.getCcy() : null;
            return new SmartArbWithdrawProfitsViewModel.PendingIntent(smartArbWithdrawType, listAEQbTJ, pairEZpvd, str3, strKWHzl, strAEQbTJ, zOLrzqt, 4, ccy2, ccy3 == null ? "" : ccy3, null);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
