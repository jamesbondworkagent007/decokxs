package com.okinc.auth.impl.passkey.ui.twofa;

import com.google.gson.internal.LinkedTreeMap;
import com.okinc.auth.impl.passkey.data.PasskeyApiService;
import com.okinc.auth.impl.passkey.model.Fido2VerificationOption;
import com.okinc.auth.impl.passkey.model.UnlockTokenResponse;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C5996aGx;

/* JADX INFO: loaded from: classes3.dex */
public final class PasskeyTwoFaOtpViewModel$submit$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Fido2VerificationOption $authType;
    final /* synthetic */ String $code;
    Object L$0;
    int label;
    final /* synthetic */ PasskeyTwoFaOtpViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyTwoFaOtpViewModel$submit$1(PasskeyTwoFaOtpViewModel passkeyTwoFaOtpViewModel, Fido2VerificationOption fido2VerificationOption, String str, Continuation<? super PasskeyTwoFaOtpViewModel$submit$1> continuation) {
        super(2, continuation);
        this.this$0 = passkeyTwoFaOtpViewModel;
        this.$authType = fido2VerificationOption;
        this.$code = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PasskeyTwoFaOtpViewModel$submit$1(this.this$0, this.$authType, this.$code, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PasskeyTwoFaOtpViewModel$submit$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008d A[Catch: Exception -> 0x0036, TryCatch #0 {Exception -> 0x0036, blocks: (B:8:0x0021, B:11:0x002a, B:27:0x0087, B:29:0x008d, B:31:0x0095, B:34:0x009b, B:39:0x00a9, B:42:0x00c0, B:12:0x002e, B:24:0x006e, B:13:0x0032, B:21:0x0051, B:18:0x003d), top: B:53:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c0 A[Catch: Exception -> 0x0036, TRY_LEAVE, TryCatch #0 {Exception -> 0x0036, blocks: (B:8:0x0021, B:11:0x002a, B:27:0x0087, B:29:0x008d, B:31:0x0095, B:34:0x009b, B:39:0x00a9, B:42:0x00c0, B:12:0x002e, B:24:0x006e, B:13:0x0032, B:21:0x0051, B:18:0x003d), top: B:53:0x0008 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Exception exc;
        ResponseData responseData;
        MutableSharedFlow mutableSharedFlow;
        Boolean boolKWHzl;
        Object objCopydefault = C56442yFn.copydefault();
        try {
        } catch (Exception e) {
            exc = e;
            MutableSharedFlow mutableSharedFlow2 = this.this$0.KWHzl;
            Boolean boolKWHzl2 = C56443yFo.KWHzl(false);
            this.L$0 = exc;
            this.label = 6;
            if (mutableSharedFlow2.emit(boolKWHzl2, this) == objCopydefault) {
                return objCopydefault;
            }
        }
        switch (this.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                MutableSharedFlow mutableSharedFlow3 = this.this$0.KWHzl;
                Boolean boolKWHzl3 = C56443yFo.KWHzl(true);
                this.label = 1;
                if (mutableSharedFlow3.emit(boolKWHzl3, this) == objCopydefault) {
                    return objCopydefault;
                }
                PasskeyApiService passkeyApiService = this.this$0.values;
                C5996aGx c5996aGx = new C5996aGx(this.$authType.toAuthType(), this.$code);
                this.label = 2;
                obj = passkeyApiService.getUnlockTokenForOkxPay(c5996aGx, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                responseData = (ResponseData) obj;
                mutableSharedFlow = this.this$0.KWHzl;
                boolKWHzl = C56443yFo.KWHzl(false);
                this.L$0 = responseData;
                this.label = 3;
                if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                    return objCopydefault;
                }
                if (responseData.getCode() == 0) {
                    MutableSharedFlow mutableSharedFlow4 = this.this$0.fetchVPNInfo;
                    String msg = responseData.getMsg();
                    this.L$0 = null;
                    this.label = 5;
                    if (mutableSharedFlow4.emit(msg, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    Object data = responseData.getData();
                    LinkedTreeMap linkedTreeMap = data instanceof LinkedTreeMap ? (LinkedTreeMap) data : null;
                    String str = linkedTreeMap != null ? (String) linkedTreeMap.get("token") : null;
                    if (str == null) {
                        str = "";
                    }
                    MutableSharedFlow mutableSharedFlow5 = this.this$0.AYXKKw;
                    UnlockTokenResponse unlockTokenResponse = new UnlockTokenResponse(str);
                    this.L$0 = null;
                    this.label = 4;
                    if (mutableSharedFlow5.emit(unlockTokenResponse, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                return Unit.INSTANCE;
            case 1:
                C56391yDq.AEQbTJ(obj);
                PasskeyApiService passkeyApiService2 = this.this$0.values;
                C5996aGx c5996aGx2 = new C5996aGx(this.$authType.toAuthType(), this.$code);
                this.label = 2;
                obj = passkeyApiService2.getUnlockTokenForOkxPay(c5996aGx2, this);
                if (obj == objCopydefault) {
                }
                responseData = (ResponseData) obj;
                mutableSharedFlow = this.this$0.KWHzl;
                boolKWHzl = C56443yFo.KWHzl(false);
                this.L$0 = responseData;
                this.label = 3;
                if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                }
                if (responseData.getCode() == 0) {
                }
                return Unit.INSTANCE;
            case 2:
                C56391yDq.AEQbTJ(obj);
                responseData = (ResponseData) obj;
                mutableSharedFlow = this.this$0.KWHzl;
                boolKWHzl = C56443yFo.KWHzl(false);
                this.L$0 = responseData;
                this.label = 3;
                if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                }
                if (responseData.getCode() == 0) {
                }
                return Unit.INSTANCE;
            case 3:
                responseData = (ResponseData) this.L$0;
                C56391yDq.AEQbTJ(obj);
                if (responseData.getCode() == 0) {
                }
                return Unit.INSTANCE;
            case 4:
            case 5:
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            case 6:
                exc = (Exception) this.L$0;
                C56391yDq.AEQbTJ(obj);
                MutableSharedFlow mutableSharedFlow6 = this.this$0.fetchVPNInfo;
                String strGEmmrt = C33129mqd.gEmmrt(exc.getMessage());
                this.L$0 = null;
                this.label = 7;
                if (mutableSharedFlow6.emit(strGEmmrt, this) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            case 7:
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
