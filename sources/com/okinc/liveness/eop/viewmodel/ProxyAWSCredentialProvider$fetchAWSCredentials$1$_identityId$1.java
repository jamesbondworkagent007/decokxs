package com.okinc.liveness.eop.viewmodel;

import com.okinc.liveness.eop.viewmodel.ProxyAWSCredentialProvider$fetchAWSCredentials$1$_identityId$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C38260pSe;
import o.C56391yDq;
import o.C56442yFn;
import o.Character;
import o.IllegalAccessError;
import o.IllegalThreadStateException;

/* JADX INFO: loaded from: classes9.dex */
public final class ProxyAWSCredentialProvider$fetchAWSCredentials$1$_identityId$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
    final /* synthetic */ Character $identityPoolClient;
    int label;
    final /* synthetic */ C38260pSe this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProxyAWSCredentialProvider$fetchAWSCredentials$1$_identityId$1(Character character, C38260pSe c38260pSe, Continuation<? super ProxyAWSCredentialProvider$fetchAWSCredentials$1$_identityId$1> continuation) {
        super(2, continuation);
        this.$identityPoolClient = character;
        this.this$0 = c38260pSe;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ProxyAWSCredentialProvider$fetchAWSCredentials$1$_identityId$1(this.$identityPoolClient, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
        return ((ProxyAWSCredentialProvider$fetchAWSCredentials$1$_identityId$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            IllegalAccessError.ActionBar actionBar = IllegalAccessError.KWHzl;
            final C38260pSe c38260pSe = this.this$0;
            IllegalAccessError illegalAccessErrorAEQbTJ = actionBar.AEQbTJ(new Function1() { // from class: o.pSc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return ProxyAWSCredentialProvider$fetchAWSCredentials$1$_identityId$1.invokeSuspend$lambda$0(c38260pSe, (IllegalAccessError.Activity) obj2);
                }
            });
            Character character = this.$identityPoolClient;
            this.label = 1;
            obj = character.AEQbTJ(illegalAccessErrorAEQbTJ, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return ((IllegalThreadStateException) obj).copydefault();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(C38260pSe c38260pSe, IllegalAccessError.Activity activity) {
        activity.KWHzl(c38260pSe.OLrzqt);
        return Unit.INSTANCE;
    }
}
