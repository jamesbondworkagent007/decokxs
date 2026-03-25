package com.okinc.tradingbot.impl.strategy.fragment.auto_earn.presenter;

import com.okinc.tradingbot.impl.strategy.fragment.auto_earn.bean.AutoEarnStakingProfitHistory;
import com.okinc.tradingbot.impl.strategy.fragment.auto_earn.bean.AutoEarnStakingProfitHistoryOverView;
import com.okinc.tradingbot.impl.strategy.fragment.auto_earn.presenter.AutoEarnProfitPresenter;
import com.okinc.unify_trade.bot.data.TacticsData;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C33129mqd;
import o.C54138wyh;
import o.C54146wyp;
import o.C56033xvF;
import o.C56068xvo;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.pTA;
import o.vNB;
import o.yDY;

/* JADX INFO: loaded from: classes11.dex */
public final class AutoEarnProfitPresenter$fetchHistory$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $currentCcy;
    final /* synthetic */ boolean $isRefresh;
    Object L$0;
    int label;
    final /* synthetic */ AutoEarnProfitPresenter this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoEarnProfitPresenter$fetchHistory$1(AutoEarnProfitPresenter autoEarnProfitPresenter, String str, boolean z, Continuation<? super AutoEarnProfitPresenter$fetchHistory$1> continuation) {
        super(2, continuation);
        this.this$0 = autoEarnProfitPresenter;
        this.$currentCcy = str;
        this.$isRefresh = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AutoEarnProfitPresenter$fetchHistory$1(this.this$0, this.$currentCcy, this.$isRefresh, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AutoEarnProfitPresenter$fetchHistory$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objKWHzl;
        String str;
        String algoId;
        List listDjBIcL;
        AutoEarnProfitPresenter.StateListAnimator stateListAnimator;
        String instType;
        String instId;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                String strCopydefault = this.this$0.copydefault(this.$currentCcy);
                C54146wyp c54146wyp = this.this$0.djBIcL;
                TacticsData tacticsDataValueOf = this.this$0.valueOf();
                C54146wyp.TaskDescription taskDescription = new C54146wyp.TaskDescription((tacticsDataValueOf == null || (algoId = tacticsDataValueOf.getAlgoId()) == null) ? "" : algoId, C33129mqd.gEmmrt(strCopydefault), this.this$0.DbNXlk(), this.this$0.copydefault, this.this$0.gEmmrt);
                this.L$0 = strCopydefault;
                this.label = 1;
                objKWHzl = c54146wyp.KWHzl(taskDescription, this);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
                str = strCopydefault;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objKWHzl = obj;
            }
            AutoEarnStakingProfitHistoryOverView autoEarnStakingProfitHistoryOverView = (AutoEarnStakingProfitHistoryOverView) objKWHzl;
            this.this$0.values = autoEarnStakingProfitHistoryOverView.getTotal();
            List<AutoEarnStakingProfitHistory> list = autoEarnStakingProfitHistoryOverView.getList();
            AutoEarnProfitPresenter autoEarnProfitPresenter = this.this$0;
            String str2 = this.$currentCcy;
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AutoEarnStakingProfitHistory autoEarnStakingProfitHistory = (AutoEarnStakingProfitHistory) it.next();
                C56068xvo c56068xvo = C56068xvo.copydefault;
                String rateRatio = autoEarnStakingProfitHistory.getRateRatio();
                if (rateRatio == null) {
                    rateRatio = "";
                }
                String strCopydefault2 = c56068xvo.copydefault(rateRatio, false);
                String strFmtBotValueBySymbol$default = C56033xvF.fmtBotValueBySymbol$default(autoEarnProfitPresenter.copydefault(str2), C33129mqd.gEmmrt(autoEarnStakingProfitHistory.getAmount()), RoundingMode.UP, false, null, false, null, null, null, null, null, 2032, null);
                String profit = autoEarnStakingProfitHistory.getProfit();
                String str3 = profit == null ? "" : profit;
                String strCopydefault3 = autoEarnProfitPresenter.copydefault(str2);
                TacticsData tacticsDataValueOf2 = autoEarnProfitPresenter.valueOf();
                String str4 = (tacticsDataValueOf2 == null || (instId = tacticsDataValueOf2.getInstId()) == null) ? "" : instId;
                TacticsData tacticsDataValueOf3 = autoEarnProfitPresenter.valueOf();
                String botPnl$default = C56033xvF.getBotPnl$default(str4, (tacticsDataValueOf3 == null || (instType = tacticsDataValueOf3.getInstType()) == null) ? "" : instType, str3, strCopydefault3, false, false, "8", false, null, null, null, 1968, null);
                String vipLevel = autoEarnStakingProfitHistory.getVipLevel();
                if (vipLevel == null) {
                    vipLevel = "";
                }
                Iterator it2 = it;
                ArrayList arrayList2 = arrayList;
                arrayList2.add(new C54138wyh(strFmtBotValueBySymbol$default, botPnl$default, strCopydefault2, vipLevel, pTA.formatSimpleDateTime$default(new Date(C33129mqd.valueOf(autoEarnStakingProfitHistory.getTime())), null, 1, null), autoEarnProfitPresenter.DbNXlk(), str));
                arrayList = arrayList2;
                it = it2;
            }
            ArrayList arrayList3 = arrayList;
            List listAEQbTJ = this.this$0.AEQbTJ(autoEarnStakingProfitHistoryOverView);
            List listOLrzqt = this.this$0.OLrzqt(autoEarnStakingProfitHistoryOverView);
            if (this.$isRefresh) {
                listDjBIcL = arrayList3;
            } else {
                Object value = this.this$0.AEQbTJ.getValue();
                vNB.TaskDescription taskDescription2 = value instanceof vNB.TaskDescription ? (vNB.TaskDescription) value : null;
                List<C54138wyh> listKWHzl = (taskDescription2 == null || (stateListAnimator = (AutoEarnProfitPresenter.StateListAnimator) taskDescription2.AEQbTJ()) == null) ? null : stateListAnimator.KWHzl();
                if (listKWHzl == null) {
                    listKWHzl = yDY.AhwBna();
                }
                listDjBIcL = CollectionsKt___CollectionsKt.djBIcL((Collection) listKWHzl, (Iterable) arrayList3);
            }
            this.this$0.copydefault = autoEarnStakingProfitHistoryOverView.getCurrentPage();
            this.this$0.AEQbTJ.setValue(new vNB.TaskDescription(new AutoEarnProfitPresenter.StateListAnimator(listDjBIcL, this.this$0.AEQbTJ(), listOLrzqt, listAEQbTJ, autoEarnStakingProfitHistoryOverView.getTotalEarn(), C56033xvF.fmtBotValueBySymbol$default("USDT", autoEarnStakingProfitHistoryOverView.getAutoEarnProfitUsdt(), RoundingMode.DOWN, true, null, false, null, null, null, null, null, 2032, null))));
        } catch (Throwable th) {
            this.this$0.AEQbTJ.setValue(new vNB.StateListAnimator(th));
            if (!this.$isRefresh) {
                this.this$0.copydefault--;
            }
        }
        return Unit.INSTANCE;
    }
}
