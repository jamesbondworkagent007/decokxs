package com.okinc.auth.impl.passkey.domain.manage;

import com.okinc.auth.impl.passkey.data.PasskeyApiService;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC5979aGg;
import o.C56391yDq;
import o.C56442yFn;
import o.C5985aGm;
import o.C5994aGv;

/* JADX INFO: loaded from: classes3.dex */
public final class OkxPayUnlinkAuthenticatorUseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AbstractC5979aGg>, Object> {
    final /* synthetic */ String $credentialId;
    final /* synthetic */ String $unlockToken;
    int label;
    final /* synthetic */ C5985aGm this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OkxPayUnlinkAuthenticatorUseCase$invoke$2(String str, String str2, C5985aGm c5985aGm, Continuation<? super OkxPayUnlinkAuthenticatorUseCase$invoke$2> continuation) {
        super(2, continuation);
        this.$credentialId = str;
        this.$unlockToken = str2;
        this.this$0 = c5985aGm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OkxPayUnlinkAuthenticatorUseCase$invoke$2(this.$credentialId, this.$unlockToken, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super AbstractC5979aGg> continuation) {
        return ((OkxPayUnlinkAuthenticatorUseCase$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C5994aGv c5994aGv = new C5994aGv(this.$credentialId, this.$unlockToken);
                PasskeyApiService passkeyApiService = this.this$0.KWHzl;
                this.label = 1;
                obj = passkeyApiService.unlinkAuthenticatorForOkxPay(c5994aGv, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            ResponseData responseData = (ResponseData) obj;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                return AbstractC5979aGg.TaskDescription.copydefault;
            }
            return new AbstractC5979aGg.Application("");
        } catch (Exception e) {
            if ((e instanceof OKServerException) && ((OKServerException) e).getCode() == 42007) {
                return AbstractC5979aGg.Activity.EZpvd;
            }
            return new AbstractC5979aGg.Application(e.getMessage());
        }
    }
}
