package com.okinc.buysell.ui.bsc.fragment.sell;

import com.okinc.buysell.ui.bsc.BaseBuySellViewModel;
import com.okinc.buysell.ui.bsc.fragment.sell.SellFragmentV3$updateCryptoFiatWidget$11;
import com.okinc.okpaymentapi.data.remote.model.experience.CurrencyToken;
import com.okinc.okx.paymentapi.service.VerificationStatus;
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
import o.lGL;
import o.mHA;
import o.yHT;

/* JADX INFO: loaded from: classes15.dex */
public final class SellFragmentV3$updateCryptoFiatWidget$11 extends SuspendLambda implements yHT<lGL.TaskDescription, lGL.Activity, lGL.ActionBar, Continuation<? super C31437ltx>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;
    final /* synthetic */ lGL this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SellFragmentV3$updateCryptoFiatWidget$11(lGL lgl, Continuation<? super SellFragmentV3$updateCryptoFiatWidget$11> continuation) {
        super(4, continuation);
        this.this$0 = lgl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHT
    public final Object invoke(lGL.TaskDescription taskDescription, lGL.Activity activity, lGL.ActionBar actionBar, Continuation<? super C31437ltx> continuation) {
        SellFragmentV3$updateCryptoFiatWidget$11 sellFragmentV3$updateCryptoFiatWidget$11 = new SellFragmentV3$updateCryptoFiatWidget$11(this.this$0, continuation);
        sellFragmentV3$updateCryptoFiatWidget$11.L$0 = taskDescription;
        sellFragmentV3$updateCryptoFiatWidget$11.L$1 = activity;
        sellFragmentV3$updateCryptoFiatWidget$11.L$2 = actionBar;
        return sellFragmentV3$updateCryptoFiatWidget$11.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            lGL.TaskDescription taskDescription = (lGL.TaskDescription) this.L$0;
            lGL.Activity activity = (lGL.Activity) this.L$1;
            lGL.ActionBar actionBar = (lGL.ActionBar) this.L$2;
            boolean z = this.this$0.QfsBiF().fJNWhG() == VerificationStatus.PRE_LOGIN || this.this$0.QfsBiF().fJNWhG() == VerificationStatus.PRE_KYC;
            String strOLrzqt = activity.OLrzqt();
            String strKWHzl = activity.KWHzl();
            String strKWHzl2 = taskDescription.KWHzl();
            boolean zOLrzqt = taskDescription.OLrzqt();
            String strAEQbTJ = taskDescription.AEQbTJ();
            String strEZpvd = taskDescription.EZpvd();
            String strKWHzl3 = actionBar.KWHzl();
            String strOLrzqt2 = actionBar.OLrzqt();
            String strAEQbTJ2 = actionBar.AEQbTJ();
            String strCopydefault = actionBar.copydefault();
            String strEZpvd2 = actionBar.EZpvd();
            String string = this.this$0.getString(C31351lsQ.Activity.abAflu);
            Intrinsics.checkNotNullExpressionValue(string, "");
            String str = strKWHzl2 == null ? "" : strKWHzl2;
            String str2 = z ? "" : strAEQbTJ;
            String str3 = z ? "" : strEZpvd;
            final lGL lgl = this.this$0;
            C31392ltE c31392ltE = new C31392ltE(strOLrzqt, strKWHzl, false, true, string, str, str2, str3, null, null, new Function0() { // from class: o.lHJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return SellFragmentV3$updateCryptoFiatWidget$11.invokeSuspend$lambda$1(lgl);
                }
            }, 772, null);
            if (strOLrzqt2 == null || strOLrzqt2.length() == 0) {
                strOLrzqt2 = null;
            }
            String strUzCIH = strOLrzqt2 == null ? this.this$0.uzCIH() : strOLrzqt2;
            String string2 = this.this$0.getString(C31351lsQ.Activity.DlmWDR);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            String str4 = strKWHzl3 == null ? "" : strKWHzl3;
            String string3 = this.this$0.getString(C31351lsQ.Activity.DcMfJKsfEqpH);
            String str5 = strEZpvd2 == null ? "" : strEZpvd2;
            final lGL lgl2 = this.this$0;
            return new C31437ltx(c31392ltE, new C31392ltE(strUzCIH, null, false, zOLrzqt, string2, str4, strAEQbTJ2, string3, str5, strCopydefault, new Function0() { // from class: o.lHS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return SellFragmentV3$updateCryptoFiatWidget$11.invokeSuspend$lambda$3(lgl2);
                }
            }, 6, null), null, 4, null);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(lGL lgl) {
        BaseBuySellViewModel.ActionBar actionBar = (BaseBuySellViewModel.ActionBar) mHA.OLrzqt.AEQbTJ(lgl.AwvSrB().QOLQEE());
        CurrencyToken currencyTokenCopydefault = actionBar != null ? actionBar.copydefault() : null;
        if (currencyTokenCopydefault != null) {
            lgl.copydefault(currencyTokenCopydefault);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$3(lGL lgl) {
        lgl.djSkpj();
        return Unit.INSTANCE;
    }
}
