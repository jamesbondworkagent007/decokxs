package com.okinc.auth.impl.debugtool.passkey;

import android.widget.TextView;
import androidx.credentials.GetPublicKeyCredentialOption;
import com.okinc.auth.api.passkey.PasskeySdkResult;
import com.okinc.auth.impl.passkey.model.AuthenticationStartResponse;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import o.C33488mxR;
import o.C56391yDq;
import o.C5643aAO;
import o.C56442yFn;
import o.C8289azt;

/* JADX INFO: loaded from: classes14.dex */
public final class PasskeyDebugToolFragment$initView$5$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C5643aAO this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyDebugToolFragment$initView$5$1(C5643aAO c5643aAO, Continuation<? super PasskeyDebugToolFragment$initView$5$1> continuation) {
        super(2, continuation);
        this.this$0 = c5643aAO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PasskeyDebugToolFragment$initView$5$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PasskeyDebugToolFragment$initView$5$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        TextView textView;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            AuthenticationStartResponse.PublicKey publicKey = this.this$0.AhwBna().getPublicKey();
            String strEZpvd = publicKey != null ? C33488mxR.EZpvd(publicKey) : null;
            if (strEZpvd == null) {
                strEZpvd = "";
            }
            GetPublicKeyCredentialOption getPublicKeyCredentialOption = new GetPublicKeyCredentialOption(strEZpvd, (byte[]) null, (Set) null, 6, (DefaultConstructorMarker) null);
            C5643aAO c5643aAO = this.this$0;
            this.label = 1;
            obj = c5643aAO.EZpvd(getPublicKeyCredentialOption, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        PasskeySdkResult passkeySdkResult = (PasskeySdkResult) obj;
        C8289azt c8289azt = this.this$0.AhwBna;
        if (c8289azt != null && (textView = c8289azt.ejfBZ) != null) {
            textView.setText(passkeySdkResult.toString());
        }
        return Unit.INSTANCE;
    }
}
