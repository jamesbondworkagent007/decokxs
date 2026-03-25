package com.okinc.auth.impl.passkey.ui.authenticate.noui;

import androidx.credentials.GetPublicKeyCredentialOption;
import com.okinc.auth.api.passkey.PasskeySdkResult;
import com.okinc.auth.impl.passkey.ui.authenticate.noui.PasskeyAuthenticateWithoutUiServiceActivity;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.C6038aHm;

/* JADX INFO: loaded from: classes14.dex */
public final class PasskeyAuthenticateWithoutUiServiceFragment$initView$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PasskeyAuthenticateWithoutUiServiceActivity.Request $it;
    int label;
    final /* synthetic */ C6038aHm this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyAuthenticateWithoutUiServiceFragment$initView$1$1(C6038aHm c6038aHm, PasskeyAuthenticateWithoutUiServiceActivity.Request request, Continuation<? super PasskeyAuthenticateWithoutUiServiceFragment$initView$1$1> continuation) {
        super(2, continuation);
        this.this$0 = c6038aHm;
        this.$it = request;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PasskeyAuthenticateWithoutUiServiceFragment$initView$1$1(this.this$0, this.$it, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PasskeyAuthenticateWithoutUiServiceFragment$initView$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C6038aHm c6038aHm = this.this$0;
            GetPublicKeyCredentialOption getPublicKeyCredentialOption = new GetPublicKeyCredentialOption(((PasskeyAuthenticateWithoutUiServiceActivity.Request.CredentialManager) this.$it).OLrzqt(), (byte[]) null, (Set) null, 6, (DefaultConstructorMarker) null);
            this.label = 1;
            obj = c6038aHm.EZpvd(getPublicKeyCredentialOption, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        this.this$0.copydefault((PasskeySdkResult) obj);
        return Unit.INSTANCE;
    }
}
