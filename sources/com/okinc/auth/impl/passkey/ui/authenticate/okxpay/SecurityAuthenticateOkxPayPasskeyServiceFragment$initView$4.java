package com.okinc.auth.impl.passkey.ui.authenticate.okxpay;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.okinc.auth.api.passkey.PasskeyState;
import com.okinc.auth.impl.passkey.ui.authenticate.okxpay.SecurityAuthenticateOkxPayPasskeyServiceFragment$initView$4;
import com.okinc.auth.impl.passkey.ui.bottomsheet.Error50162BottomSheet;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import o.C56391yDq;
import o.C56442yFn;
import o.C5724aBq;
import o.C6046aHu;

/* JADX INFO: loaded from: classes14.dex */
public final class SecurityAuthenticateOkxPayPasskeyServiceFragment$initView$4 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C6046aHu this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecurityAuthenticateOkxPayPasskeyServiceFragment$initView$4(C6046aHu c6046aHu, Continuation<? super SecurityAuthenticateOkxPayPasskeyServiceFragment$initView$4> continuation) {
        super(2, continuation);
        this.this$0 = c6046aHu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SecurityAuthenticateOkxPayPasskeyServiceFragment$initView$4 securityAuthenticateOkxPayPasskeyServiceFragment$initView$4 = new SecurityAuthenticateOkxPayPasskeyServiceFragment$initView$4(this.this$0, continuation);
        securityAuthenticateOkxPayPasskeyServiceFragment$initView$4.L$0 = obj;
        return securityAuthenticateOkxPayPasskeyServiceFragment$initView$4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super Unit> continuation) {
        return ((SecurityAuthenticateOkxPayPasskeyServiceFragment$initView$4) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        FragmentManager supportFragmentManager;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            final String str = (String) this.L$0;
            FragmentActivity activity = this.this$0.getActivity();
            if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) {
                return Unit.INSTANCE;
            }
            final Error50162BottomSheet error50162BottomSheetEZpvd = Error50162BottomSheet.Companion.EZpvd(false, Error50162BottomSheet.EventFlow.PAY);
            final C6046aHu c6046aHu = this.this$0;
            error50162BottomSheetEZpvd.AEQbTJ(new Function0() { // from class: o.aHy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return SecurityAuthenticateOkxPayPasskeyServiceFragment$initView$4.invokeSuspend$lambda$3$lambda$1(error50162BottomSheetEZpvd);
                }
            });
            error50162BottomSheetEZpvd.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: o.aHx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(android.content.DialogInterface dialogInterface) {
                    SecurityAuthenticateOkxPayPasskeyServiceFragment$initView$4.invokeSuspend$lambda$3$lambda$2(c6046aHu, str, dialogInterface);
                }
            });
            error50162BottomSheetEZpvd.show(supportFragmentManager, Error50162BottomSheet.class.getName());
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$3$lambda$1(Error50162BottomSheet error50162BottomSheet) {
        FragmentActivity activity = error50162BottomSheet.getActivity();
        if (activity != null) {
            C5724aBq.EZpvd.OLrzqt(activity);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$3$lambda$2(C6046aHu c6046aHu, String str, DialogInterface dialogInterface) {
        c6046aHu.AEQbTJ(new PasskeyState.OkxPaySdkError(str, true));
    }
}
