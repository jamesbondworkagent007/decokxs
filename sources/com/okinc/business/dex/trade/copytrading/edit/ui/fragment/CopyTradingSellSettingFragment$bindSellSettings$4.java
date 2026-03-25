package com.okinc.business.dex.trade.copytrading.edit.ui.fragment;

import androidx.fragment.app.Fragment;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.business.dex.tee.domain.model.Rules;
import com.okinc.business.dex.trade.copytrading.edit.data.model.SellSettings;
import com.okinc.business.dex.trade.copytrading.edit.ui.viewmodel.CopyTradingEditStrategyViewModel;
import com.okinc.business.dex.trade.copytrading.edit.ui.widget.BuySellConfigData;
import com.okinc.business.dex.trade.copytrading.edit.ui.widget.autosell.data.CopyTradingAutoSellStrategy;
import com.okinc.business.dex.trade.copytrading.strategyinfo.domain.model.CopyTradeDetail;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import o.C19872gSl;
import o.C19900gTm;
import o.C21460hAe;
import o.C23313hvq;
import o.C56391yDq;
import o.C56442yFn;
import o.gTC;
import o.rVN;
import o.yDY;

/* JADX INFO: loaded from: classes18.dex */
public final class CopyTradingSellSettingFragment$bindSellSettings$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C21460hAe $this_bindSellSettings;
    int label;
    final /* synthetic */ C19900gTm this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CopyTradingSellSettingFragment$bindSellSettings$4(C19900gTm c19900gTm, C21460hAe c21460hAe, Continuation<? super CopyTradingSellSettingFragment$bindSellSettings$4> continuation) {
        super(2, continuation);
        this.this$0 = c19900gTm;
        this.$this_bindSellSettings = c21460hAe;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CopyTradingSellSettingFragment$bindSellSettings$4(this.this$0, this.$this_bindSellSettings, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CopyTradingSellSettingFragment$bindSellSettings$4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.dex.trade.copytrading.edit.ui.fragment.CopyTradingSellSettingFragment$bindSellSettings$4$1, reason: invalid class name */
    public static final class AnonymousClass1<T> implements FlowCollector {
        public final /* synthetic */ C19900gTm EZpvd;
        public final /* synthetic */ C21460hAe copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(C19900gTm c19900gTm, C21460hAe c21460hAe) {
            this.EZpvd = c19900gTm;
            this.copydefault = c21460hAe;
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        /* JADX WARN: Removed duplicated region for block: B:76:0x0182  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x0185  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Result<gTC> result, Continuation<? super Unit> continuation) throws Throwable {
            CopyTradingSellSettingFragment$bindSellSettings$4$1$emit$1 copyTradingSellSettingFragment$bindSellSettings$4$1$emit$1;
            gTC gtc;
            AnonymousClass1<T> anonymousClass1;
            C19900gTm c19900gTm;
            AnonymousClass1<T> anonymousClass12;
            CopyTradingAutoSellStrategy takeProfit;
            SellSettings sellSettings;
            BuySellConfigData buySellConfigData;
            if (continuation instanceof CopyTradingSellSettingFragment$bindSellSettings$4$1$emit$1) {
                copyTradingSellSettingFragment$bindSellSettings$4$1$emit$1 = (CopyTradingSellSettingFragment$bindSellSettings$4$1$emit$1) continuation;
                int i = copyTradingSellSettingFragment$bindSellSettings$4$1$emit$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    copyTradingSellSettingFragment$bindSellSettings$4$1$emit$1.label = i - Integer.MIN_VALUE;
                } else {
                    copyTradingSellSettingFragment$bindSellSettings$4$1$emit$1 = new CopyTradingSellSettingFragment$bindSellSettings$4$1$emit$1(this, continuation);
                }
            }
            Object objOLrzqt = copyTradingSellSettingFragment$bindSellSettings$4$1$emit$1.result;
            Object objCopydefault = C56442yFn.copydefault();
            int i2 = copyTradingSellSettingFragment$bindSellSettings$4$1$emit$1.label;
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objOLrzqt);
                if (result != null) {
                    Object objM7386unboximpl = result.m7386unboximpl();
                    if (Result.m7383isFailureimpl(objM7386unboximpl)) {
                        objM7386unboximpl = null;
                    }
                    gtc = (gTC) objM7386unboximpl;
                    if (gtc != null) {
                        CopyTradingEditStrategyViewModel copyTradingEditStrategyViewModelCopydefault = this.EZpvd.copydefault();
                        copyTradingSellSettingFragment$bindSellSettings$4$1$emit$1.L$0 = this;
                        copyTradingSellSettingFragment$bindSellSettings$4$1$emit$1.L$1 = gtc;
                        copyTradingSellSettingFragment$bindSellSettings$4$1$emit$1.label = 1;
                        objOLrzqt = copyTradingEditStrategyViewModelCopydefault.OLrzqt(copyTradingSellSettingFragment$bindSellSettings$4$1$emit$1);
                        if (objOLrzqt == objCopydefault) {
                            return objCopydefault;
                        }
                        anonymousClass1 = this;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c19900gTm = (C19900gTm) copyTradingSellSettingFragment$bindSellSettings$4$1$emit$1.L$1;
                anonymousClass12 = (AnonymousClass1) copyTradingSellSettingFragment$bindSellSettings$4$1$emit$1.L$0;
                C56391yDq.AEQbTJ(objOLrzqt);
                buySellConfigData = (BuySellConfigData) objOLrzqt;
                if (buySellConfigData != null) {
                    return Unit.INSTANCE;
                }
                c19900gTm.AEQbTJ(buySellConfigData);
                rVN.reportFullyDrawn$default((Fragment) anonymousClass12.EZpvd, true, (String) null, 2, (Object) null);
                return Unit.INSTANCE;
            }
            gtc = (gTC) copyTradingSellSettingFragment$bindSellSettings$4$1$emit$1.L$1;
            anonymousClass1 = (AnonymousClass1) copyTradingSellSettingFragment$bindSellSettings$4$1$emit$1.L$0;
            C56391yDq.AEQbTJ(objOLrzqt);
            SellSettings sellSettings2 = (SellSettings) objOLrzqt;
            CopyTradeDetail copyTradeDetailEZpvd = gtc.EZpvd();
            if (copyTradeDetailEZpvd != null && (sellSettings = copyTradeDetailEZpvd.getSellSettings()) != null) {
                sellSettings2 = sellSettings;
            }
            anonymousClass1.copydefault.AEQbTJ.AEQbTJ().setChecked(sellSettings2 != null ? C19872gSl.copydefault(sellSettings2) : true);
            anonymousClass1.copydefault.AEQbTJ.KWHzl().setChecked(sellSettings2 != null && C19872gSl.EZpvd(sellSettings2));
            anonymousClass1.copydefault.AEQbTJ.setExpanded(sellSettings2 == null || C19872gSl.copydefault(sellSettings2) || C19872gSl.EZpvd(sellSettings2));
            anonymousClass1.copydefault.AEQbTJ.copydefault().EZpvd().OLrzqt();
            List<Rules> rules = sellSettings2 != null ? sellSettings2.getRules() : null;
            if (rules == null) {
                rules = yDY.AhwBna();
            }
            if (!rules.isEmpty()) {
                C21460hAe c21460hAe = anonymousClass1.copydefault;
                for (Rules rules2 : rules) {
                    int sellType = rules2.getSellType();
                    if (sellType == 1) {
                        takeProfit = new CopyTradingAutoSellStrategy.TakeProfit(rules2.getChangeScale(), rules2.getSellScale());
                    } else if (sellType == 2) {
                        takeProfit = new CopyTradingAutoSellStrategy.StopLoss(C23313hvq.mulCheckS$default(rules2.getChangeScale(), MultiTransferSignData.DEFAULT_INTERVAL, null, null, null, 14, null), rules2.getSellScale());
                    }
                    c21460hAe.AEQbTJ.copydefault().EZpvd().AEQbTJ(takeProfit);
                }
            } else {
                anonymousClass1.copydefault.AEQbTJ.copydefault().EZpvd().AEQbTJ(new CopyTradingAutoSellStrategy.TakeProfit("", ""));
                anonymousClass1.copydefault.AEQbTJ.copydefault().EZpvd().AEQbTJ(new CopyTradingAutoSellStrategy.StopLoss("", ""));
            }
            C19900gTm c19900gTm2 = anonymousClass1.EZpvd;
            CopyTradingEditStrategyViewModel copyTradingEditStrategyViewModelCopydefault2 = c19900gTm2.copydefault();
            copyTradingSellSettingFragment$bindSellSettings$4$1$emit$1.L$0 = anonymousClass1;
            copyTradingSellSettingFragment$bindSellSettings$4$1$emit$1.L$1 = c19900gTm2;
            copyTradingSellSettingFragment$bindSellSettings$4$1$emit$1.label = 2;
            Object objAEQbTJ = copyTradingEditStrategyViewModelCopydefault2.AEQbTJ(true, (Continuation<? super BuySellConfigData>) copyTradingSellSettingFragment$bindSellSettings$4$1$emit$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            c19900gTm = c19900gTm2;
            objOLrzqt = objAEQbTJ;
            anonymousClass12 = anonymousClass1;
            buySellConfigData = (BuySellConfigData) objOLrzqt;
            if (buySellConfigData != null) {
            }
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            StateFlow<Result<gTC>> stateFlowFJNWhG = this.this$0.copydefault().fJNWhG();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$this_bindSellSettings);
            this.label = 1;
            if (stateFlowFJNWhG.collect(anonymousClass1, this) == objCopydefault) {
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
