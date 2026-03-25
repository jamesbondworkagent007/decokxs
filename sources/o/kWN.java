package o;

import com.okinc.business.dex.trade.core.domain.model.V6BaseQuoteResponse;
import com.okinc.business.dex.trade.core.domain.model.V6QuoteRequest;
import com.okinc.business.dex.trade.core.domain.model.V6QuoteResponseData;
import com.okinc.business.trade.features.home.meme.usecase.transaction.MemeV6QuoteUseCase$getMemeV6Quote$1;
import com.okinc.business.trade.features.home.meme.usecase.transaction.MemeV6QuoteUseCase$getMemeV6QuotegIAlus$$inlined$dexRunCatching$1;
import com.okinc.business.trade.features.home.meme.usecase.transaction.MemeV6QuoteUseCase$pollByStrategy$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kWN {
    public final CoroutineDispatcher EZpvd;
    public final gYX OLrzqt;

    @yCM
    public kWN(@NotNull gYX gyx, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(gyx, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.OLrzqt = gyx;
        this.EZpvd = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull V6QuoteRequest v6QuoteRequest, @NotNull Continuation<? super Result<V6QuoteResponseData>> continuation) {
        MemeV6QuoteUseCase$getMemeV6Quote$1 memeV6QuoteUseCase$getMemeV6Quote$1;
        if (continuation instanceof MemeV6QuoteUseCase$getMemeV6Quote$1) {
            memeV6QuoteUseCase$getMemeV6Quote$1 = (MemeV6QuoteUseCase$getMemeV6Quote$1) continuation;
            int i = memeV6QuoteUseCase$getMemeV6Quote$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                memeV6QuoteUseCase$getMemeV6Quote$1.label = i - Integer.MIN_VALUE;
            } else {
                memeV6QuoteUseCase$getMemeV6Quote$1 = new MemeV6QuoteUseCase$getMemeV6Quote$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = memeV6QuoteUseCase$getMemeV6Quote$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = memeV6QuoteUseCase$getMemeV6Quote$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.EZpvd;
            MemeV6QuoteUseCase$getMemeV6QuotegIAlus$$inlined$dexRunCatching$1 memeV6QuoteUseCase$getMemeV6QuotegIAlus$$inlined$dexRunCatching$1 = new MemeV6QuoteUseCase$getMemeV6QuotegIAlus$$inlined$dexRunCatching$1(null, this, v6QuoteRequest);
            memeV6QuoteUseCase$getMemeV6Quote$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, memeV6QuoteUseCase$getMemeV6QuotegIAlus$$inlined$dexRunCatching$1, memeV6QuoteUseCase$getMemeV6Quote$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    public final Flow<Result<V6BaseQuoteResponse>> OLrzqt(@NotNull gYS gys) {
        Intrinsics.checkNotNullParameter(gys, "");
        return FlowKt.flow(new MemeV6QuoteUseCase$pollByStrategy$1(this, gys, null));
    }
}
