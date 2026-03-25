package com.okinc.auth.impl.passkey.ui.register.withpasskey;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.okinc.auth.impl.passkey.ui.register.withpasskey.PasskeyPromotionServiceWIthPasskeyStepperFragment$initView$4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import o.C56391yDq;
import o.C56442yFn;
import o.C6020aHU;
import o.C6330aNM;

/* JADX INFO: loaded from: classes14.dex */
public final class PasskeyPromotionServiceWIthPasskeyStepperFragment$initView$4 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C6330aNM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyPromotionServiceWIthPasskeyStepperFragment$initView$4(C6330aNM c6330aNM, Continuation<? super PasskeyPromotionServiceWIthPasskeyStepperFragment$initView$4> continuation) {
        super(2, continuation);
        this.this$0 = c6330aNM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PasskeyPromotionServiceWIthPasskeyStepperFragment$initView$4 passkeyPromotionServiceWIthPasskeyStepperFragment$initView$4 = new PasskeyPromotionServiceWIthPasskeyStepperFragment$initView$4(this.this$0, continuation);
        passkeyPromotionServiceWIthPasskeyStepperFragment$initView$4.L$0 = obj;
        return passkeyPromotionServiceWIthPasskeyStepperFragment$initView$4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super Unit> continuation) {
        return ((PasskeyPromotionServiceWIthPasskeyStepperFragment$initView$4) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        FragmentManager supportFragmentManager;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            String str = (String) this.L$0;
            FragmentActivity activity = this.this$0.getActivity();
            if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
                final C6330aNM c6330aNM = this.this$0;
                C6020aHU c6020aHUNewInstance$default = C6020aHU.Activity.newInstance$default(C6020aHU.Companion, str, null, 2, null);
                c6020aHUNewInstance$default.KWHzl(new Function0() { // from class: o.aNL
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return PasskeyPromotionServiceWIthPasskeyStepperFragment$initView$4.invokeSuspend$lambda$3$lambda$2$lambda$0(c6330aNM);
                    }
                });
                c6020aHUNewInstance$default.AEQbTJ(new Function0() { // from class: o.aNT
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return Unit.INSTANCE;
                    }
                });
                c6020aHUNewInstance$default.show(supportFragmentManager);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$3$lambda$2$lambda$0(C6330aNM c6330aNM) {
        c6330aNM.AYXKKw().uzCIH();
        return Unit.INSTANCE;
    }
}
