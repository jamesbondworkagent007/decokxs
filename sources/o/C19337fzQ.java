package o;

import com.okinc.business.defi.wallet.mine.walletbind.datasource.ValidateNonceRequestBody;
import com.okinc.business.defi.wallet.mine.walletbind.datasource.ValidateNonceResponseBody;
import com.okinc.business.defi.wallet.mine.walletbind.datasource.WalletBindApiService;
import com.okinc.business.defi.wallet.mine.walletbind.usecase.WalletBindGetCeFiDetailByNonceUseCase$getData$1;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fzQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19337fzQ extends AbstractC19325fzE<ValidateNonceRequestBody, ValidateNonceResponseBody> {
    public final WalletBindApiService EZpvd;
    public final CoroutineDispatcher copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public C19337fzQ(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull WalletBindApiService walletBindApiService) {
        super(coroutineDispatcher);
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(walletBindApiService, "");
        this.copydefault = coroutineDispatcher;
        this.EZpvd = walletBindApiService;
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.AbstractC19325fzE
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull ValidateNonceRequestBody validateNonceRequestBody, @NotNull Continuation<? super ValidateNonceResponseBody> continuation) throws java.lang.Throwable {
        WalletBindGetCeFiDetailByNonceUseCase$getData$1 walletBindGetCeFiDetailByNonceUseCase$getData$1;
        if (continuation instanceof WalletBindGetCeFiDetailByNonceUseCase$getData$1) {
            walletBindGetCeFiDetailByNonceUseCase$getData$1 = (WalletBindGetCeFiDetailByNonceUseCase$getData$1) continuation;
            int i = walletBindGetCeFiDetailByNonceUseCase$getData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletBindGetCeFiDetailByNonceUseCase$getData$1.label = i - Integer.MIN_VALUE;
            } else {
                walletBindGetCeFiDetailByNonceUseCase$getData$1 = new WalletBindGetCeFiDetailByNonceUseCase$getData$1(this, continuation);
            }
        }
        WalletBindGetCeFiDetailByNonceUseCase$getData$1 walletBindGetCeFiDetailByNonceUseCase$getData$12 = walletBindGetCeFiDetailByNonceUseCase$getData$1;
        java.lang.Object objValidateNonce$default = walletBindGetCeFiDetailByNonceUseCase$getData$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletBindGetCeFiDetailByNonceUseCase$getData$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objValidateNonce$default);
            WalletBindApiService walletBindApiService = this.EZpvd;
            walletBindGetCeFiDetailByNonceUseCase$getData$12.label = 1;
            objValidateNonce$default = WalletBindApiService.TaskDescription.validateNonce$default(walletBindApiService, validateNonceRequestBody, null, walletBindGetCeFiDetailByNonceUseCase$getData$12, 2, null);
            if (objValidateNonce$default == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objValidateNonce$default);
        }
        java.lang.Object data = ((ResponseData) objValidateNonce$default).getData();
        Intrinsics.copydefault(data);
        return data;
    }
}
