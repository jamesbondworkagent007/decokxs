package com.okinc.auth.impl.reset2fa.ui;

import com.okinc.auth.api.reset2fa.RebindMfaEntryPoint;
import com.okinc.network.okg.cor.SubdomainStrategy;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes3.dex */
public final class ResetMfaViewModel$createMfaSession$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $business;
    final /* synthetic */ SubdomainStrategy $subdomainStrategy;
    int label;
    final /* synthetic */ ResetMfaViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResetMfaViewModel$createMfaSession$1(ResetMfaViewModel resetMfaViewModel, String str, SubdomainStrategy subdomainStrategy, Continuation<? super ResetMfaViewModel$createMfaSession$1> continuation) {
        super(2, continuation);
        this.this$0 = resetMfaViewModel;
        this.$business = str;
        this.$subdomainStrategy = subdomainStrategy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ResetMfaViewModel$createMfaSession$1(this.this$0, this.$business, this.$subdomainStrategy, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ResetMfaViewModel$createMfaSession$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            RebindMfaEntryPoint rebindMfaEntryPoint = this.this$0.isConnected;
            if (rebindMfaEntryPoint instanceof RebindMfaEntryPoint.PreLogin) {
                this.this$0.copydefault(this.$business, this.$subdomainStrategy);
            } else if (rebindMfaEntryPoint instanceof RebindMfaEntryPoint.ForgetPassword) {
                this.this$0.AEQbTJ(this.$subdomainStrategy);
            } else {
                this.this$0.OLrzqt(this.$business);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
