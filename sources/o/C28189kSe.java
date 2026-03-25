package o;

import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.trade.features.home.advanced.usecase.AdvancedValidateTokensUseCase$validateMarketTokens$1;
import com.okinc.business.trade.features.home.advanced.usecase.AdvancedValidateTokensUseCase$validateMarketTokensgIAlus$$inlined$dexRunCatching$1;
import com.okinc.business.trade.features.home.ui.cefi.data.ValidateTokensRequest;
import com.okinc.business.trade.features.home.ui.cefi.data.ValidateTokensResponse;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kSe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28189kSe {
    public final C28196kSl EZpvd;
    public final kQA KWHzl;
    public final CoroutineDispatcher OLrzqt;

    @yCM
    public C28189kSe(@NotNull kQA kqa, @NotNull C28196kSl c28196kSl, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(kqa, "");
        Intrinsics.checkNotNullParameter(c28196kSl, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = kqa;
        this.EZpvd = c28196kSl;
        this.OLrzqt = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull ValidateTokensRequest validateTokensRequest, @NotNull Continuation<? super Result<kotlin.Pair<DexMultiTokenInfoBean, DexMultiTokenInfoBean>>> continuation) {
        AdvancedValidateTokensUseCase$validateMarketTokens$1 advancedValidateTokensUseCase$validateMarketTokens$1;
        if (continuation instanceof AdvancedValidateTokensUseCase$validateMarketTokens$1) {
            advancedValidateTokensUseCase$validateMarketTokens$1 = (AdvancedValidateTokensUseCase$validateMarketTokens$1) continuation;
            int i = advancedValidateTokensUseCase$validateMarketTokens$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                advancedValidateTokensUseCase$validateMarketTokens$1.label = i - Integer.MIN_VALUE;
            } else {
                advancedValidateTokensUseCase$validateMarketTokens$1 = new AdvancedValidateTokensUseCase$validateMarketTokens$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = advancedValidateTokensUseCase$validateMarketTokens$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = advancedValidateTokensUseCase$validateMarketTokens$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.OLrzqt;
            AdvancedValidateTokensUseCase$validateMarketTokensgIAlus$$inlined$dexRunCatching$1 advancedValidateTokensUseCase$validateMarketTokensgIAlus$$inlined$dexRunCatching$1 = new AdvancedValidateTokensUseCase$validateMarketTokensgIAlus$$inlined$dexRunCatching$1(null, this, validateTokensRequest);
            advancedValidateTokensUseCase$validateMarketTokens$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, advancedValidateTokensUseCase$validateMarketTokensgIAlus$$inlined$dexRunCatching$1, advancedValidateTokensUseCase$validateMarketTokens$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        java.lang.Object objM7386unboximpl = ((Result) objWithContext).m7386unboximpl();
        if (Result.m7384isSuccessimpl(objM7386unboximpl)) {
            try {
                Result.Application application = Result.Companion;
                ValidateTokensResponse validateTokensResponse = (ValidateTokensResponse) objM7386unboximpl;
                return Result.m7377constructorimpl(C56390yDp.OLrzqt(validateTokensResponse.getFromTokenInfo(), validateTokensResponse.getToTokenInfo()));
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7386unboximpl = C56391yDq.EZpvd(th);
            }
        }
        return Result.m7377constructorimpl(objM7386unboximpl);
    }
}
