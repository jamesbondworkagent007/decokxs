package com.okinc.buysell.ui.bsc;

import android.graphics.drawable.Drawable;
import androidx.fragment.app.FragmentActivity;
import com.okinc.buysell.ui.bsc.BaseBuySellConvertFragment$clickVerifyBtn$1;
import com.okinc.buysell.util.PaymentLogger;
import com.okinc.okx.paymentapi.presentation.BSCLevel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C43251rlk;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC31670lzr;
import o.lzR;

/* JADX INFO: loaded from: classes15.dex */
public final class BaseBuySellConvertFragment$clickVerifyBtn$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ lzR<T> this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseBuySellConvertFragment$clickVerifyBtn$1(lzR<T> lzr, Continuation<? super BaseBuySellConvertFragment$clickVerifyBtn$1> continuation) {
        super(2, continuation);
        this.this$0 = lzr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BaseBuySellConvertFragment$clickVerifyBtn$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BaseBuySellConvertFragment$clickVerifyBtn$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            try {
                InterfaceC31670lzr interfaceC31670lzr = (InterfaceC31670lzr) C43251rlk.copydefault(InterfaceC31670lzr.class);
                FragmentActivity fragmentActivityRequireActivity = this.this$0.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                BSCLevel bSCLevel = BSCLevel.LEVEL1;
                Boolean boolKWHzl = C56443yFo.KWHzl(true);
                Function0 function0 = new Function0() { // from class: o.lzU
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                Function1 function1 = new Function1() { // from class: o.lzX
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return BaseBuySellConvertFragment$clickVerifyBtn$1.invokeSuspend$lambda$1(((java.lang.Boolean) obj2).booleanValue());
                    }
                };
                Function1 function12 = new Function1() { // from class: o.lzV
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return BaseBuySellConvertFragment$clickVerifyBtn$1.invokeSuspend$lambda$2((java.lang.String) obj2);
                    }
                };
                final lzR<T> lzr = this.this$0;
                InterfaceC31670lzr.TaskDescription.goToSubKycOnboarding$default(interfaceC31670lzr, fragmentActivityRequireActivity, bSCLevel, null, boolKWHzl, function0, function1, function12, new Function0() { // from class: o.lAd
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return BaseBuySellConvertFragment$clickVerifyBtn$1.invokeSuspend$lambda$3(lzr);
                    }
                }, 4, null);
            } catch (Exception e) {
                PaymentLogger.EZpvd.AEQbTJ(PaymentLogger.Type.UV, "Sub kyc api failed " + e.getMessage());
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(boolean z) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$2(String str) {
        PaymentLogger.EZpvd.AEQbTJ(PaymentLogger.Type.UV, "Sub kyc api failed");
        C55326xho.toast$default(str, (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$3(lzR lzr) {
        lzr.isConnected().fetchVPNInfo();
        return Unit.INSTANCE;
    }
}
