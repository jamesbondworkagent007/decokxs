package com.okinc.auth.impl.passkey.domain.manage;

import com.okinc.auth.impl.passkey.data.PasskeyApiService;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.C5986aGn;
import o.C5987aGo;

/* JADX INFO: loaded from: classes3.dex */
public final class OkxPayRenameAuthenticatorUseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Unit>>, Object> {
    final /* synthetic */ String $credentialId;
    final /* synthetic */ String $updatedName;
    int label;
    final /* synthetic */ C5987aGo this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OkxPayRenameAuthenticatorUseCase$invoke$2(String str, String str2, C5987aGo c5987aGo, Continuation<? super OkxPayRenameAuthenticatorUseCase$invoke$2> continuation) {
        super(2, continuation);
        this.$updatedName = str;
        this.$credentialId = str2;
        this.this$0 = c5987aGo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OkxPayRenameAuthenticatorUseCase$invoke$2(this.$updatedName, this.$credentialId, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends Unit>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<Unit>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<Unit>> continuation) {
        return ((OkxPayRenameAuthenticatorUseCase$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C5986aGn c5986aGn = new C5986aGn(this.$updatedName, this.$credentialId);
                PasskeyApiService passkeyApiService = this.this$0.KWHzl;
                this.label = 1;
                obj = passkeyApiService.renameAuthenticatorForOkxPay(c5986aGn, this);
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
                Result.Application application = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(responseData.getData());
            } else {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(new Exception(responseData.getMsg())));
            }
        } catch (Exception e) {
            Result.Application application3 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(e));
        }
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
