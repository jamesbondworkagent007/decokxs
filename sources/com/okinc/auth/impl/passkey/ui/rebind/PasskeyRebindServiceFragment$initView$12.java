package com.okinc.auth.impl.passkey.ui.rebind;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.okinc.auth.impl.passkey.ui.rebind.PasskeyRebindServiceFragment$initView$12;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import o.C56391yDq;
import o.C56442yFn;
import o.C5724aBq;
import o.C6024aHY;
import o.C6254aLq;

/* JADX INFO: loaded from: classes14.dex */
public final class PasskeyRebindServiceFragment$initView$12 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C6254aLq this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyRebindServiceFragment$initView$12(C6254aLq c6254aLq, Continuation<? super PasskeyRebindServiceFragment$initView$12> continuation) {
        super(2, continuation);
        this.this$0 = c6254aLq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PasskeyRebindServiceFragment$initView$12(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
        return ((PasskeyRebindServiceFragment$initView$12) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        FragmentManager supportFragmentManager;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            FragmentActivity activity = this.this$0.getActivity();
            if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) {
                return Unit.INSTANCE;
            }
            final C6024aHY c6024aHYCopydefault = C6024aHY.Companion.copydefault();
            c6024aHYCopydefault.KWHzl(new Function0() { // from class: o.aLB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return PasskeyRebindServiceFragment$initView$12.invokeSuspend$lambda$2$lambda$1(c6024aHYCopydefault);
                }
            });
            c6024aHYCopydefault.show(supportFragmentManager, C6024aHY.class.getName());
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$2$lambda$1(C6024aHY c6024aHY) {
        FragmentActivity activity = c6024aHY.getActivity();
        if (activity != null) {
            C5724aBq.EZpvd.KWHzl(activity);
        }
        return Unit.INSTANCE;
    }
}
