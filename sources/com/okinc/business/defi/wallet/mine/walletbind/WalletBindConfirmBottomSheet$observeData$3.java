package com.okinc.business.defi.wallet.mine.walletbind;

import android.widget.TextView;
import com.okinc.business.defi.wallet.mine.walletbind.datasource.ValidateNonceResponseBody;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.AbstractC16479ekh;
import o.C13754dXa;
import o.C19356fzj;
import o.C33069mpW;
import o.C56390yDp;
import o.C56391yDq;
import o.C56423yEv;
import o.C56442yFn;
import o.pTB;

/* JADX INFO: loaded from: classes15.dex */
public final class WalletBindConfirmBottomSheet$observeData$3 extends SuspendLambda implements Function2<ValidateNonceResponseBody, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C19356fzj this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletBindConfirmBottomSheet$observeData$3(C19356fzj c19356fzj, Continuation<? super WalletBindConfirmBottomSheet$observeData$3> continuation) {
        super(2, continuation);
        this.this$0 = c19356fzj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        WalletBindConfirmBottomSheet$observeData$3 walletBindConfirmBottomSheet$observeData$3 = new WalletBindConfirmBottomSheet$observeData$3(this.this$0, continuation);
        walletBindConfirmBottomSheet$observeData$3.L$0 = obj;
        return walletBindConfirmBottomSheet$observeData$3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ValidateNonceResponseBody validateNonceResponseBody, Continuation<? super Unit> continuation) {
        return ((WalletBindConfirmBottomSheet$observeData$3) create(validateNonceResponseBody, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        TextView textView;
        String threshold;
        TextView textView2;
        String maskedUserName;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            ValidateNonceResponseBody validateNonceResponseBody = (ValidateNonceResponseBody) this.L$0;
            if (validateNonceResponseBody != null) {
                this.this$0.valueOf = validateNonceResponseBody;
                AbstractC16479ekh abstractC16479ekh = this.this$0.AYXKKw;
                String str = "";
                if (abstractC16479ekh != null && (textView2 = abstractC16479ekh.AEQbTJ) != null) {
                    C19356fzj c19356fzj = this.this$0;
                    int i = C13754dXa.FragmentManager.QKVWgx;
                    ValidateNonceResponseBody validateNonceResponseBody2 = c19356fzj.valueOf;
                    if (validateNonceResponseBody2 == null || (maskedUserName = validateNonceResponseBody2.getMaskedUserName()) == null) {
                        maskedUserName = "";
                    }
                    textView2.setText(C33069mpW.copydefault(c19356fzj, i, (Map<String, ? extends Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("exchangeAccount", maskedUserName))));
                }
                ValidateNonceResponseBody validateNonceResponseBody3 = this.this$0.valueOf;
                if (validateNonceResponseBody3 != null && (threshold = validateNonceResponseBody3.getThreshold()) != null) {
                    str = threshold;
                }
                String upToMax$default = pTB.formatUpToMax$default(pTB.OLrzqt((Object) str), 0, null, 3, null);
                AbstractC16479ekh abstractC16479ekh2 = this.this$0.AYXKKw;
                if (abstractC16479ekh2 != null && (textView = abstractC16479ekh2.EZpvd) != null) {
                    textView.setText(C33069mpW.copydefault(this.this$0, C13754dXa.FragmentManager.AubY, (Map<String, ? extends Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", upToMax$default))));
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
