package o;

import com.okinc.business.market.features.meme.similar_tokens.domain.FetchSimilarTokensUseCase$invoke$1;
import com.okinc.business.market.features.meme.similar_tokens.domain.FetchSimilarTokensUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.khC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28774khC {
    public final CoroutineDispatcher AEQbTJ;
    public final InterfaceC28781khJ copydefault;

    @yCM
    public C28774khC(@NotNull InterfaceC28781khJ interfaceC28781khJ, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC28781khJ, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = interfaceC28781khJ;
        this.AEQbTJ = coroutineDispatcher;
    }

    /* JADX INFO: renamed from: invoke-BWLJW6A$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m8664invokeBWLJW6A$default(C28774khC c28774khC, java.lang.String str, java.lang.String str2, java.lang.String str3, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str3 = null;
        }
        return c28774khC.copydefault(str, str2, str3, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, @NotNull Continuation<? super Result<C28775khD>> continuation) throws java.lang.Throwable {
        FetchSimilarTokensUseCase$invoke$1 fetchSimilarTokensUseCase$invoke$1;
        if (continuation instanceof FetchSimilarTokensUseCase$invoke$1) {
            fetchSimilarTokensUseCase$invoke$1 = (FetchSimilarTokensUseCase$invoke$1) continuation;
            int i = fetchSimilarTokensUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchSimilarTokensUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchSimilarTokensUseCase$invoke$1 = new FetchSimilarTokensUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = fetchSimilarTokensUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = fetchSimilarTokensUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
            FetchSimilarTokensUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1 fetchSimilarTokensUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1 = new FetchSimilarTokensUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1(null, this, str, str2, str3);
            fetchSimilarTokensUseCase$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, fetchSimilarTokensUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1, fetchSimilarTokensUseCase$invoke$1);
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
}
