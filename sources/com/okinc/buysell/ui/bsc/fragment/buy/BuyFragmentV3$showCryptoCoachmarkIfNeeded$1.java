package com.okinc.buysell.ui.bsc.fragment.buy;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.okinc.buysell.ui.bsc.fragment.buy.BuyFragmentV3$showCryptoCoachmarkIfNeeded$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import o.C31351lsQ;
import o.C33069mpW;
import o.C33070mpX;
import o.C52794wYp;
import o.C52812wZg;
import o.C55298xhM;
import o.C56390yDp;
import o.C56391yDq;
import o.C56423yEv;
import o.C56442yFn;
import o.lEN;

/* JADX INFO: loaded from: classes15.dex */
public final class BuyFragmentV3$showCryptoCoachmarkIfNeeded$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $cryptoKey;
    int label;
    final /* synthetic */ lEN this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyFragmentV3$showCryptoCoachmarkIfNeeded$1(lEN len, String str, Continuation<? super BuyFragmentV3$showCryptoCoachmarkIfNeeded$1> continuation) {
        super(2, continuation);
        this.this$0 = len;
        this.$cryptoKey = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BuyFragmentV3$showCryptoCoachmarkIfNeeded$1(this.this$0, this.$cryptoKey, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BuyFragmentV3$showCryptoCoachmarkIfNeeded$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.label = 1;
            if (DelayKt.delay(200L, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        final FragmentActivity activity = this.this$0.getActivity();
        if (activity == null || !this.this$0.isAdded() || this.this$0.getView() == null) {
            return Unit.INSTANCE;
        }
        final View view = lEN.EZpvd(this.this$0).DbNXlk;
        Intrinsics.checkNotNullExpressionValue(view, "");
        final lEN len = this.this$0;
        final String str = this.$cryptoKey;
        view.post(new Runnable() { // from class: o.lFY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                BuyFragmentV3$showCryptoCoachmarkIfNeeded$1.invokeSuspend$lambda$3(len, activity, view, str);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$3(final lEN len, FragmentActivity fragmentActivity, View view, String str) {
        C52812wZg c52812wZg = new C52812wZg(fragmentActivity);
        C52812wZg.StateListAnimator stateListAnimator = new C52812wZg.StateListAnimator(view);
        stateListAnimator.EZpvd(3);
        stateListAnimator.OLrzqt(C55298xhM.dp2px$default(4.0f, null, 1, null));
        stateListAnimator.AEQbTJ(C33069mpW.OLrzqt(C33070mpX.AYXKKw(C31351lsQ.Activity.svY), C56423yEv.EZpvd(C56390yDp.OLrzqt("tokenListingName", str))));
        stateListAnimator.OLrzqt(C33070mpX.AYXKKw(C31351lsQ.Activity.DcMfJKDIADVb));
        c52812wZg.AEQbTJ(stateListAnimator);
        c52812wZg.OLrzqt(0);
        c52812wZg.KWHzl(false);
        TextView textViewValues = c52812wZg.values();
        if (textViewValues != null) {
            textViewValues.setVisibility(8);
        }
        C52794wYp c52794wYpIsConnected = c52812wZg.isConnected();
        if (c52794wYpIsConnected != null) {
            c52794wYpIsConnected.setVisibility(8);
        }
        C52794wYp c52794wYpAkhnZx = c52812wZg.AkhnZx();
        if (c52794wYpAkhnZx != null) {
            c52794wYpAkhnZx.setVisibility(8);
        }
        RelativeLayout relativeLayoutAhwBna = c52812wZg.AhwBna();
        if (relativeLayoutAhwBna != null) {
            relativeLayoutAhwBna.setVisibility(8);
        }
        c52812wZg.KWHzl(new Function0() { // from class: o.lFX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BuyFragmentV3$showCryptoCoachmarkIfNeeded$1.invokeSuspend$lambda$3$lambda$2$lambda$1(len);
            }
        });
        c52812wZg.fARcdN();
        len.getNewProxyInstance = c52812wZg;
        len.sSMYrx().hBpjJd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$3$lambda$2$lambda$1(lEN len) {
        len.getNewProxyInstance = null;
        return Unit.INSTANCE;
    }
}
