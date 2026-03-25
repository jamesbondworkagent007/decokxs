package com.okinc.business.defi.wallet.home;

import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.FragmentActivity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractActivityC33041mov;
import o.C15572eNh;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC15734eTh;

/* JADX INFO: loaded from: classes5.dex */
public final class DefiHomeFragmentNew$bindWalletConnectState$4$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $url;
    final /* synthetic */ WcConnectExtra $wcConnectExtra;
    int label;
    final /* synthetic */ C15572eNh this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiHomeFragmentNew$bindWalletConnectState$4$1$1(C15572eNh c15572eNh, String str, WcConnectExtra wcConnectExtra, Continuation<? super DefiHomeFragmentNew$bindWalletConnectState$4$1$1> continuation) {
        super(2, continuation);
        this.this$0 = c15572eNh;
        this.$url = str;
        this.$wcConnectExtra = wcConnectExtra;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiHomeFragmentNew$bindWalletConnectState$4$1$1(this.this$0, this.$url, this.$wcConnectExtra, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefiHomeFragmentNew$bindWalletConnectState$4$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            KeyEventDispatcher.Component activity = this.this$0.getActivity();
            InterfaceC15734eTh interfaceC15734eTh = activity instanceof InterfaceC15734eTh ? (InterfaceC15734eTh) activity : null;
            if (interfaceC15734eTh != null) {
                FragmentActivity activity2 = this.this$0.getActivity();
                AbstractActivityC33041mov abstractActivityC33041mov = activity2 instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activity2 : null;
                if (abstractActivityC33041mov != null) {
                    String str = this.$url;
                    WcConnectExtra wcConnectExtra = this.$wcConnectExtra;
                    this.label = 1;
                    if (interfaceC15734eTh.EZpvd(abstractActivityC33041mov, str, wcConnectExtra, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    return Unit.INSTANCE;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
