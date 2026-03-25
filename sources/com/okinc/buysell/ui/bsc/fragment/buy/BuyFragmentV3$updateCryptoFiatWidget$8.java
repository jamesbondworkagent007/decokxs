package com.okinc.buysell.ui.bsc.fragment.buy;

import com.okinc.buysell.ui.bsc.BaseBuySellViewModel;
import com.okinc.buysell.ui.bsc.fragment.buy.BuyFragmentV3$updateCryptoFiatWidget$8;
import com.okinc.okpaymentapi.data.remote.model.experience.CurrencyToken;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C31351lsQ;
import o.C31392ltE;
import o.C31437ltx;
import o.C56391yDq;
import o.C56442yFn;
import o.lEN;
import o.mHA;
import o.yHO;

/* JADX INFO: loaded from: classes15.dex */
public final class BuyFragmentV3$updateCryptoFiatWidget$8 extends SuspendLambda implements yHO<lEN.Application, lEN.ActionBar, Continuation<? super C31437ltx>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ lEN this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyFragmentV3$updateCryptoFiatWidget$8(lEN len, Continuation<? super BuyFragmentV3$updateCryptoFiatWidget$8> continuation) {
        super(3, continuation);
        this.this$0 = len;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(lEN.Application application, lEN.ActionBar actionBar, Continuation<? super C31437ltx> continuation) {
        BuyFragmentV3$updateCryptoFiatWidget$8 buyFragmentV3$updateCryptoFiatWidget$8 = new BuyFragmentV3$updateCryptoFiatWidget$8(this.this$0, continuation);
        buyFragmentV3$updateCryptoFiatWidget$8.L$0 = application;
        buyFragmentV3$updateCryptoFiatWidget$8.L$1 = actionBar;
        return buyFragmentV3$updateCryptoFiatWidget$8.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            lEN.Application application = (lEN.Application) this.L$0;
            lEN.ActionBar actionBar = (lEN.ActionBar) this.L$1;
            String strOLrzqt = application.OLrzqt();
            String strKWHzl = application.KWHzl();
            String strAEQbTJ = application.AEQbTJ();
            String strCopydefault = application.copydefault();
            String strEZpvd = application.EZpvd();
            boolean zAEQbTJ = actionBar.AEQbTJ();
            String strEZpvd2 = actionBar.EZpvd();
            String strCopydefault2 = actionBar.copydefault();
            String strKWHzl2 = actionBar.KWHzl();
            String strOLrzqt2 = actionBar.OLrzqt();
            String string = this.this$0.getString(C31351lsQ.Activity.DcMfJKfwDlxl);
            Intrinsics.checkNotNullExpressionValue(string, "");
            String str = strAEQbTJ == null ? "" : strAEQbTJ;
            String str2 = strEZpvd == null ? "" : strEZpvd;
            final lEN len = this.this$0;
            C31392ltE c31392ltE = new C31392ltE(strOLrzqt, strKWHzl, false, true, string, str, "", "", str2, null, new Function0() { // from class: o.lGb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return BuyFragmentV3$updateCryptoFiatWidget$8.invokeSuspend$lambda$1(len);
                }
            }, 516, null);
            if (strOLrzqt2 == null || strOLrzqt2.length() == 0) {
                strOLrzqt2 = null;
            }
            String strUzCIH = strOLrzqt2 == null ? this.this$0.uzCIH() : strOLrzqt2;
            boolean zRlQdEF = this.this$0.sSMYrx().RlQdEF();
            String string2 = this.this$0.getString(C31351lsQ.Activity.DlABUU);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            String str3 = strEZpvd2 == null ? "" : strEZpvd2;
            String str4 = strCopydefault2 == null ? "" : strCopydefault2;
            String str5 = strKWHzl2 == null ? "" : strKWHzl2;
            final lEN len2 = this.this$0;
            return new C31437ltx(c31392ltE, new C31392ltE(strUzCIH, null, zRlQdEF, zAEQbTJ, string2, str3, str4, str5, null, strCopydefault, new Function0() { // from class: o.lFZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return BuyFragmentV3$updateCryptoFiatWidget$8.invokeSuspend$lambda$3(len2);
                }
            }, 258, null), null, 4, null);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(lEN len) {
        BaseBuySellViewModel.ActionBar actionBar = (BaseBuySellViewModel.ActionBar) mHA.OLrzqt.AEQbTJ(len.sSMYrx().QOLQEE());
        CurrencyToken currencyTokenCopydefault = actionBar != null ? actionBar.copydefault() : null;
        if (currencyTokenCopydefault != null) {
            len.EZpvd(currencyTokenCopydefault);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$3(lEN len) {
        len.QfsBiF();
        return Unit.INSTANCE;
    }
}
