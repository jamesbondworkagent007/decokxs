package com.okinc.auth.impl.mfa.ui.verifymfaotp;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt__StringsKt;
import o.C33069mpW;
import o.C33070mpX;
import o.C33129mqd;
import o.C52761wXj;
import o.C55326xho;
import o.C5629aAA;
import o.C56391yDq;
import o.C56442yFn;
import o.C5779aCs;
import o.C5863aEW;

/* JADX INFO: loaded from: classes14.dex */
public final class VerifyMfaOtpFragment$initView$2 extends SuspendLambda implements Function2<C5779aCs, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C5863aEW this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyMfaOtpFragment$initView$2(C5863aEW c5863aEW, Continuation<? super VerifyMfaOtpFragment$initView$2> continuation) {
        super(2, continuation);
        this.this$0 = c5863aEW;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        VerifyMfaOtpFragment$initView$2 verifyMfaOtpFragment$initView$2 = new VerifyMfaOtpFragment$initView$2(this.this$0, continuation);
        verifyMfaOtpFragment$initView$2.L$0 = obj;
        return verifyMfaOtpFragment$initView$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C5779aCs c5779aCs, Continuation<? super Unit> continuation) {
        return ((VerifyMfaOtpFragment$initView$2) create(c5779aCs, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        TextView textView;
        String strKWHzl;
        TextView textView2;
        Object objM7377constructorimpl;
        TextView textView3;
        TextView textView4;
        TextView textView5;
        TextView textView6;
        TextView textView7;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            C5779aCs c5779aCs = (C5779aCs) this.L$0;
            C5629aAA c5629aAA = this.this$0.valueOf;
            if (c5629aAA != null && (textView7 = c5629aAA.gEmmrt) != null) {
                textView7.setText(c5779aCs.AhwBna());
            }
            C5629aAA c5629aAA2 = this.this$0.valueOf;
            if (c5629aAA2 != null && (textView6 = c5629aAA2.gEmmrt) != null) {
                textView6.setContentDescription(c5779aCs.OLrzqt());
            }
            if (c5779aCs.EZpvd() == null) {
                C5629aAA c5629aAA3 = this.this$0.valueOf;
                if (c5629aAA3 != null && (textView5 = c5629aAA3.EZpvd) != null) {
                    textView5.setText("");
                }
            } else {
                C5629aAA c5629aAA4 = this.this$0.valueOf;
                if (c5629aAA4 != null && (textView = c5629aAA4.EZpvd) != null) {
                    Context context = this.this$0.getContext();
                    String strKWHzl2 = context != null ? C33069mpW.KWHzl(context, c5779aCs.EZpvd().getFirst().intValue(), c5779aCs.EZpvd().getSecond()) : null;
                    textView.setText(strKWHzl2 != null ? strKWHzl2 : "");
                }
            }
            String strGEmmrt = c5779aCs.gEmmrt();
            if (strGEmmrt != null) {
                C5863aEW c5863aEW = this.this$0;
                try {
                    Result.Application application = Result.Companion;
                    C5629aAA c5629aAA5 = c5863aEW.valueOf;
                    SpannableString spannableString = new SpannableString((c5629aAA5 == null || (textView4 = c5629aAA5.EZpvd) == null) ? null : textView4.getText());
                    ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
                    int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) spannableString, strGEmmrt, 0, false, 6, (Object) null);
                    spannableString.setSpan(foregroundColorSpan, iIndexOf$default, strGEmmrt.length() + iIndexOf$default, 17);
                    C5629aAA c5629aAA6 = c5863aEW.valueOf;
                    if (c5629aAA6 != null && (textView3 = c5629aAA6.EZpvd) != null) {
                        textView3.setText(spannableString);
                    }
                    objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                } catch (Throwable th) {
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
                Result.m7376boximpl(objM7377constructorimpl);
            }
            C5629aAA c5629aAA7 = this.this$0.valueOf;
            if (c5629aAA7 != null && (textView2 = c5629aAA7.copydefault) != null) {
                textView2.setVisibility(c5779aCs.AEQbTJ() ? 0 : 8);
            }
            if (c5779aCs.copydefault()) {
                this.this$0.showLoadingAtOnce();
            } else {
                this.this$0.releaseLoading();
            }
            if (C33129mqd.OLrzqt((CharSequence) c5779aCs.KWHzl()) && (strKWHzl = c5779aCs.KWHzl()) != null) {
                C55326xho.toastWithFailedIcon$default(strKWHzl, 0, 1, (Object) null);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
