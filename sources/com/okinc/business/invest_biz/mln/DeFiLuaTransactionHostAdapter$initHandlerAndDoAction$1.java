package com.okinc.business.invest_biz.mln;

import com.okinc.business.invest_biz.data.bean.InvestUserRewardElementInfo;
import com.okinc.business.invest_biz.data.bean.InvestUserRewardInfoByInvestment;
import com.okinc.business.invest_biz.data.bean.InvestUserRewardsAction;
import com.okinc.business.invest_biz.data.contants.InvestAction;
import com.okinc.business.invest_biz.ui.widget.product_details.ProductDetailsClickAction;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C23646iEb;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.iNZ;
import o.pUU;
import o.yDY;

/* JADX INFO: loaded from: classes15.dex */
public final class DeFiLuaTransactionHostAdapter$initHandlerAndDoAction$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ iNZ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeFiLuaTransactionHostAdapter$initHandlerAndDoAction$1(iNZ inz, Continuation<? super DeFiLuaTransactionHostAdapter$initHandlerAndDoAction$1> continuation) {
        super(2, continuation);
        this.this$0 = inz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DeFiLuaTransactionHostAdapter$initHandlerAndDoAction$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DeFiLuaTransactionHostAdapter$initHandlerAndDoAction$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [154=5] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0097 A[Catch: Exception -> 0x0142, TryCatch #0 {Exception -> 0x0142, blocks: (B:5:0x000e, B:6:0x001c, B:8:0x0021, B:33:0x0097, B:35:0x00a3, B:37:0x00b3, B:40:0x00c0, B:42:0x00e0, B:44:0x0116, B:45:0x011a, B:46:0x0127, B:11:0x002b, B:14:0x0035, B:15:0x0048, B:18:0x0052, B:19:0x0059, B:22:0x0063, B:23:0x0072, B:26:0x007c, B:27:0x0083, B:30:0x008d), top: B:54:0x000e }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(obj);
        try {
            String strKWHzl = this.this$0.djBIcL.KWHzl();
            switch (strKWHzl.hashCode()) {
                case -1703735716:
                    if (strKWHzl.equals("claim_bonus")) {
                        if (this.this$0.djBIcL.AhwBna() == null) {
                            pUU.copydefault("initHandlerAndDoAction", "Reward type is null for claim action," + this.this$0.djBIcL);
                        } else {
                            InvestUserRewardInfoByInvestment investUserRewardInfoByInvestmentOLrzqt = this.this$0.AYXKKw.OLrzqt(this.this$0.djBIcL.copydefault(), this.this$0.djBIcL.AhwBna(), C33129mqd.OLrzqt((CharSequence) this.this$0.djBIcL.AYXKKw()) ? this.this$0.djBIcL.AYXKKw() : "");
                            if (investUserRewardInfoByInvestmentOLrzqt != null) {
                                iNZ inz = this.this$0;
                                InvestUserRewardInfoByInvestment investUserRewardInfoByInvestmentCopy = investUserRewardInfoByInvestmentOLrzqt.copy((1022 & 1) != 0 ? investUserRewardInfoByInvestmentOLrzqt.baseDefiTokenInfos : null, (1022 & 2) != 0 ? investUserRewardInfoByInvestmentOLrzqt.buttonType : null, (1022 & 4) != 0 ? investUserRewardInfoByInvestmentOLrzqt.claimMode : null, (1022 & 8) != 0 ? investUserRewardInfoByInvestmentOLrzqt.currencyAmount : null, (1022 & 16) != 0 ? investUserRewardInfoByInvestmentOLrzqt.extraData : null, (1022 & 32) != 0 ? investUserRewardInfoByInvestmentOLrzqt.rewardType : null, (1022 & 64) != 0 ? investUserRewardInfoByInvestmentOLrzqt.callDataExtJson : null, (1022 & 128) != 0 ? investUserRewardInfoByInvestmentOLrzqt.unclaimedTokenList : null, (1022 & 256) != 0 ? investUserRewardInfoByInvestmentOLrzqt.network : inz.djBIcL.AEQbTJ(), (1022 & 512) != 0 ? investUserRewardInfoByInvestmentOLrzqt.chainId : inz.djBIcL.EZpvd());
                                InvestAction investActionEZpvd = C23646iEb.EZpvd(investUserRewardInfoByInvestmentCopy.getRewardType());
                                InvestUserRewardsAction claimMode = investUserRewardInfoByInvestmentCopy.getClaimMode();
                                List<InvestUserRewardElementInfo> baseDefiTokenInfos = investUserRewardInfoByInvestmentCopy.getBaseDefiTokenInfos();
                                if (baseDefiTokenInfos == null) {
                                    baseDefiTokenInfos = yDY.AhwBna();
                                }
                                inz.KWHzl(new ProductDetailsClickAction.Activity(investActionEZpvd, claimMode, investUserRewardInfoByInvestmentCopy, baseDefiTokenInfos, false));
                            }
                        }
                    }
                    break;
                case -1693871368:
                    if (!strKWHzl.equals("claim_merkl")) {
                        break;
                    }
                    break;
                case -1183703051:
                    if (strKWHzl.equals("invest")) {
                        this.this$0.valueOf();
                    }
                    break;
                case -940242166:
                    if (strKWHzl.equals("withdraw")) {
                        iNZ inz2 = this.this$0;
                        inz2.AEQbTJ(inz2.djBIcL.copydefault());
                    }
                    break;
                case -934889060:
                    if (strKWHzl.equals("redeem")) {
                        this.this$0.gEmmrt();
                    }
                    break;
                case -891115281:
                    if (strKWHzl.equals("supply")) {
                        iNZ inz3 = this.this$0;
                        inz3.copydefault(C56443yFo.KWHzl(inz3.djBIcL.copydefault()));
                    }
                    break;
                case 94742588:
                    if (!strKWHzl.equals("claim")) {
                        break;
                    }
                    break;
            }
        } catch (Exception e) {
            pUU.AEQbTJ("initHandlerAndDoAction", "error: " + e.getMessage(), e);
        }
        return Unit.INSTANCE;
    }
}
