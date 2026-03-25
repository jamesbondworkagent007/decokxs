package o;

import com.okinc.auth.impl.passkey.data.PasskeyApiService;
import com.okinc.auth.impl.passkey.domain.PasskeyResetStatusUseCase$getData$1;
import com.okinc.auth.impl.passkey.model.PasskeyResetStatusResponse;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aFW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5916aFW extends AbstractC5726aBs<Unit, PasskeyResetStatusResponse> {
    public final PasskeyApiService KWHzl;
    public final CoroutineDispatcher copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public C5916aFW(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull PasskeyApiService passkeyApiService) {
        super(coroutineDispatcher);
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(passkeyApiService, "");
        this.copydefault = coroutineDispatcher;
        this.KWHzl = passkeyApiService;
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.AbstractC5726aBs
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull Unit unit, @NotNull Continuation<? super PasskeyResetStatusResponse> continuation) throws java.lang.Throwable {
        PasskeyResetStatusUseCase$getData$1 passkeyResetStatusUseCase$getData$1;
        if (continuation instanceof PasskeyResetStatusUseCase$getData$1) {
            passkeyResetStatusUseCase$getData$1 = (PasskeyResetStatusUseCase$getData$1) continuation;
            int i = passkeyResetStatusUseCase$getData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                passkeyResetStatusUseCase$getData$1.label = i - Integer.MIN_VALUE;
            } else {
                passkeyResetStatusUseCase$getData$1 = new PasskeyResetStatusUseCase$getData$1(this, continuation);
            }
        }
        java.lang.Object resetStatus = passkeyResetStatusUseCase$getData$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = passkeyResetStatusUseCase$getData$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(resetStatus);
            PasskeyApiService passkeyApiService = this.KWHzl;
            passkeyResetStatusUseCase$getData$1.label = 1;
            resetStatus = passkeyApiService.getResetStatus(passkeyResetStatusUseCase$getData$1);
            if (resetStatus == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(resetStatus);
        }
        java.lang.Object data = ((ResponseData) resetStatus).getData();
        Intrinsics.copydefault(data);
        return data;
    }
}
