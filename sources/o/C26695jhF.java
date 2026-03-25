package o;

import com.okinc.business.invest_biz.data.bean.TransactionMethod;
import com.okinc.business.invest_biz.data.contants.PaymentOption;
import com.okinc.business.invest_biz.data.models.InitialInfoModel;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig;
import com.okinc.business.invest_biz.ui.screens.transaction.mapper.TransactionMenuMapper$getInvestMenu$1;
import com.okinc.business.invest_biz.ui.screens.transaction.mapper.TransactionMenuMapper$getRedeemMenu$1;
import com.okinc.business.invest_biz.ui.screens.validator_selection.model.ValidatorSelectionParams;
import com.okinc.business.invest_biz.ui.screens.validator_selection.model.ValidatorTrxType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC26764jiV;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jhF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C26695jhF {
    public final C26545jeO OLrzqt;

    @yCM
    public C26695jhF(@NotNull C26545jeO c26545jeO) {
        Intrinsics.checkNotNullParameter(c26545jeO, "");
        this.OLrzqt = c26545jeO;
    }

    public final java.lang.Object copydefault(@NotNull InitialInfoModel initialInfoModel, @NotNull TransactionConfig transactionConfig, @NotNull Continuation<? super InterfaceC26764jiV> continuation) {
        if (initialInfoModel instanceof InitialInfoModel.InvestInitialInfo) {
            return OLrzqt((InitialInfoModel.InvestInitialInfo) initialInfoModel, transactionConfig, continuation);
        }
        if (!(initialInfoModel instanceof InitialInfoModel.RedeemInitialInfo)) {
            throw new NoWhenBranchMatchedException();
        }
        return OLrzqt((InitialInfoModel.RedeemInitialInfo) initialInfoModel, transactionConfig, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(InitialInfoModel.RedeemInitialInfo redeemInitialInfo, TransactionConfig transactionConfig, Continuation<? super InterfaceC26764jiV> continuation) throws java.lang.Throwable {
        TransactionMenuMapper$getRedeemMenu$1 transactionMenuMapper$getRedeemMenu$1;
        C26695jhF c26695jhF;
        if (continuation instanceof TransactionMenuMapper$getRedeemMenu$1) {
            transactionMenuMapper$getRedeemMenu$1 = (TransactionMenuMapper$getRedeemMenu$1) continuation;
            int i = transactionMenuMapper$getRedeemMenu$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                transactionMenuMapper$getRedeemMenu$1.label = i - Integer.MIN_VALUE;
            } else {
                transactionMenuMapper$getRedeemMenu$1 = new TransactionMenuMapper$getRedeemMenu$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = transactionMenuMapper$getRedeemMenu$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = transactionMenuMapper$getRedeemMenu$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            if (transactionConfig.QOLQEE() && redeemInitialInfo.zLjUOn()) {
                return InterfaceC26764jiV.TaskDescription.copydefault;
            }
            C26545jeO c26545jeO = this.OLrzqt;
            transactionMenuMapper$getRedeemMenu$1.L$0 = this;
            transactionMenuMapper$getRedeemMenu$1.L$1 = redeemInitialInfo;
            transactionMenuMapper$getRedeemMenu$1.label = 1;
            objCopydefault = c26545jeO.copydefault(false, transactionMenuMapper$getRedeemMenu$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            c26695jhF = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            redeemInitialInfo = (InitialInfoModel.RedeemInitialInfo) transactionMenuMapper$getRedeemMenu$1.L$1;
            c26695jhF = (C26695jhF) transactionMenuMapper$getRedeemMenu$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
        }
        PaymentOption paymentOption = (PaymentOption) objCopydefault;
        if (redeemInitialInfo.sSMYrx() && redeemInitialInfo.uzCIH() == TransactionMethod.BOTH) {
            return c26695jhF.copydefault(c26695jhF.OLrzqt(paymentOption));
        }
        if (redeemInitialInfo.AwvSrB() && C33129mqd.OLrzqt((java.lang.CharSequence) redeemInitialInfo.gHZMYf())) {
            return c26695jhF.AEQbTJ(new ValidatorSelectionParams(redeemInitialInfo.values(), redeemInitialInfo.gHZMYf(), redeemInitialInfo.copydefault(), ValidatorTrxType.REDEEM, redeemInitialInfo.AxsJAY()));
        }
        return InterfaceC26764jiV.Application.OLrzqt;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(InitialInfoModel.InvestInitialInfo investInitialInfo, TransactionConfig transactionConfig, Continuation<? super InterfaceC26764jiV> continuation) throws java.lang.Throwable {
        TransactionMenuMapper$getInvestMenu$1 transactionMenuMapper$getInvestMenu$1;
        C26695jhF c26695jhF;
        if (continuation instanceof TransactionMenuMapper$getInvestMenu$1) {
            transactionMenuMapper$getInvestMenu$1 = (TransactionMenuMapper$getInvestMenu$1) continuation;
            int i = transactionMenuMapper$getInvestMenu$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                transactionMenuMapper$getInvestMenu$1.label = i - Integer.MIN_VALUE;
            } else {
                transactionMenuMapper$getInvestMenu$1 = new TransactionMenuMapper$getInvestMenu$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = transactionMenuMapper$getInvestMenu$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = transactionMenuMapper$getInvestMenu$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            C26545jeO c26545jeO = this.OLrzqt;
            transactionMenuMapper$getInvestMenu$1.L$0 = this;
            transactionMenuMapper$getInvestMenu$1.L$1 = investInitialInfo;
            transactionMenuMapper$getInvestMenu$1.label = 1;
            objCopydefault = c26545jeO.copydefault(true, transactionMenuMapper$getInvestMenu$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            c26695jhF = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            investInitialInfo = (InitialInfoModel.InvestInitialInfo) transactionMenuMapper$getInvestMenu$1.L$1;
            c26695jhF = (C26695jhF) transactionMenuMapper$getInvestMenu$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
        }
        PaymentOption paymentOption = (PaymentOption) objCopydefault;
        if (investInitialInfo.wlaJM() && investInitialInfo.iwGUEr() == TransactionMethod.BOTH) {
            return c26695jhF.copydefault(c26695jhF.OLrzqt(paymentOption));
        }
        if (investInitialInfo.zsXlph() && C33129mqd.OLrzqt((java.lang.CharSequence) investInitialInfo.AubY())) {
            return c26695jhF.AEQbTJ(new ValidatorSelectionParams(investInitialInfo.gEmmrt(), investInitialInfo.AubY(), investInitialInfo.KWHzl(), ValidatorTrxType.INVEST, investInitialInfo.zuBGHE()));
        }
        return InterfaceC26764jiV.Application.OLrzqt;
    }

    public final TransactionMethod OLrzqt(PaymentOption paymentOption) {
        if (paymentOption == PaymentOption.MultiToken) {
            return TransactionMethod.MULTI;
        }
        return TransactionMethod.SINGLE;
    }

    public final InterfaceC26764jiV copydefault(TransactionMethod transactionMethod) {
        return new InterfaceC26764jiV.Activity(transactionMethod);
    }

    public final InterfaceC26764jiV AEQbTJ(ValidatorSelectionParams validatorSelectionParams) {
        return new InterfaceC26764jiV.StateListAnimator(validatorSelectionParams);
    }
}
