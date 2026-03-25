package com.okinc.auth.impl.debugtool.passkey;

import android.widget.TextView;
import com.okinc.auth.api.passkey.PasskeyScenario;
import com.okinc.auth.api.passkey.PasskeyVersionState;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C43251rlk;
import o.C56391yDq;
import o.C5643aAO;
import o.C56442yFn;
import o.C8289azt;
import o.InterfaceC8196ayF;

/* JADX INFO: loaded from: classes14.dex */
public final class PasskeyDebugToolFragment$initView$22$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C5643aAO this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyDebugToolFragment$initView$22$1(C5643aAO c5643aAO, Continuation<? super PasskeyDebugToolFragment$initView$22$1> continuation) {
        super(2, continuation);
        this.this$0 = c5643aAO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PasskeyDebugToolFragment$initView$22$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PasskeyDebugToolFragment$initView$22$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        TextView textView;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC8196ayF interfaceC8196ayF = (InterfaceC8196ayF) C43251rlk.copydefault(InterfaceC8196ayF.class);
            PasskeyScenario.Account account = PasskeyScenario.Account.AEQbTJ;
            this.label = 1;
            obj = interfaceC8196ayF.AEQbTJ(account, true, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        PasskeyVersionState passkeyVersionState = (PasskeyVersionState) obj;
        C8289azt c8289azt = this.this$0.AhwBna;
        if (c8289azt != null && (textView = c8289azt.gHZMYf) != null) {
            textView.setText(passkeyVersionState.toString());
        }
        return Unit.INSTANCE;
    }
}
