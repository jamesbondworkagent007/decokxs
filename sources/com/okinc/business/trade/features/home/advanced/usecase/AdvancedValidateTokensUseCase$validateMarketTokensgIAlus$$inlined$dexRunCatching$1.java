package com.okinc.business.trade.features.home.advanced.usecase;

import com.okinc.business.trade.features.home.ui.cefi.data.ValidateTokensRequest;
import com.okinc.business.trade.features.home.ui.cefi.data.ValidateTokensResponse;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C28189kSe;
import o.C28196kSl;
import o.C56391yDq;
import o.C56442yFn;
import o.kQA;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.business.trade.features.home.advanced.usecase.AdvancedValidateTokensUseCase$validateMarketTokens-gIAlu-s$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedValidateTokensUseCase$validateMarketTokensgIAlus$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends ValidateTokensResponse>>, Object> {
    final /* synthetic */ ValidateTokensRequest $request$inlined;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ C28189kSe this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedValidateTokensUseCase$validateMarketTokensgIAlus$$inlined$dexRunCatching$1(Continuation continuation, C28189kSe c28189kSe, ValidateTokensRequest validateTokensRequest) {
        super(2, continuation);
        this.this$0 = c28189kSe;
        this.$request$inlined = validateTokensRequest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdvancedValidateTokensUseCase$validateMarketTokensgIAlus$$inlined$dexRunCatching$1(continuation, this.this$0, this.$request$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends ValidateTokensResponse>> continuation) {
        return ((AdvancedValidateTokensUseCase$validateMarketTokensgIAlus$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0097 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        kQA kqa;
        ValidateTokensRequest validateTokensRequest;
        String str;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            pUU.AEQbTJ("DEX", "dexRunCatching", th);
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Result.Application application2 = Result.Companion;
            kQA kqa2 = this.this$0.KWHzl;
            ValidateTokensRequest validateTokensRequest2 = this.$request$inlined;
            C28196kSl c28196kSl = this.this$0.EZpvd;
            this.L$0 = validateTokensRequest2;
            this.L$1 = kqa2;
            this.label = 1;
            Object objOLrzqt = c28196kSl.OLrzqt(this);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            kqa = kqa2;
            obj = objOLrzqt;
            validateTokensRequest = validateTokensRequest2;
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    objM7377constructorimpl = Result.m7377constructorimpl(((AbstractC43419rot) obj).AEQbTJ());
                    return Result.m7376boximpl(objM7377constructorimpl);
                }
                String str2 = (String) this.L$2;
                kQA kqa3 = (kQA) this.L$1;
                validateTokensRequest = (ValidateTokensRequest) this.L$0;
                C56391yDq.AEQbTJ(obj);
                str = str2;
                kqa = kqa3;
                ValidateTokensRequest validateTokensRequestCopy$default = ValidateTokensRequest.copy$default(validateTokensRequest, null, str, (String) obj, null, null, 25, null);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 3;
                obj = kqa.AEQbTJ(validateTokensRequestCopy$default, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                objM7377constructorimpl = Result.m7377constructorimpl(((AbstractC43419rot) obj).AEQbTJ());
                return Result.m7376boximpl(objM7377constructorimpl);
            }
            kqa = (kQA) this.L$1;
            validateTokensRequest = (ValidateTokensRequest) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        String str3 = (String) obj;
        C28196kSl c28196kSl2 = this.this$0.EZpvd;
        this.L$0 = validateTokensRequest;
        this.L$1 = kqa;
        this.L$2 = str3;
        this.label = 2;
        Object objCopydefault2 = c28196kSl2.copydefault(this);
        if (objCopydefault2 == objCopydefault) {
            return objCopydefault;
        }
        str = str3;
        obj = objCopydefault2;
        ValidateTokensRequest validateTokensRequestCopy$default2 = ValidateTokensRequest.copy$default(validateTokensRequest, null, str, (String) obj, null, null, 25, null);
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.label = 3;
        obj = kqa.AEQbTJ(validateTokensRequestCopy$default2, this);
        if (obj == objCopydefault) {
        }
        objM7377constructorimpl = Result.m7377constructorimpl(((AbstractC43419rot) obj).AEQbTJ());
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
