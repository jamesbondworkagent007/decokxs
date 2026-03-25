package o;

import com.okinc.business.market.features.meme.similar_tokens.domain.model.SimilarTokensResponseData;
import com.okinc.business.market.features.meme.similar_tokens.domain.repository.SimilarTokensRepositoryImpl$getSimilarTokens$1;
import com.okinc.business.market.features.meme.similar_tokens.domain.repository.SimilarTokensRepositoryImpl$getSimilarTokensBWLJW6A$$inlined$dexRunCatching$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.khG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28778khG implements InterfaceC28781khJ {
    public final InterfaceC23229huL KWHzl;
    public final CoroutineDispatcher OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC23229huL AEQbTJ() {
        return this.KWHzl;
    }

    @yCM
    public C28778khG(@NotNull InterfaceC23229huL interfaceC23229huL, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC23229huL, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = interfaceC23229huL;
        this.OLrzqt = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC28781khJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, @NotNull Continuation<? super Result<SimilarTokensResponseData>> continuation) {
        SimilarTokensRepositoryImpl$getSimilarTokens$1 similarTokensRepositoryImpl$getSimilarTokens$1;
        if (continuation instanceof SimilarTokensRepositoryImpl$getSimilarTokens$1) {
            similarTokensRepositoryImpl$getSimilarTokens$1 = (SimilarTokensRepositoryImpl$getSimilarTokens$1) continuation;
            int i = similarTokensRepositoryImpl$getSimilarTokens$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                similarTokensRepositoryImpl$getSimilarTokens$1.label = i - Integer.MIN_VALUE;
            } else {
                similarTokensRepositoryImpl$getSimilarTokens$1 = new SimilarTokensRepositoryImpl$getSimilarTokens$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = similarTokensRepositoryImpl$getSimilarTokens$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = similarTokensRepositoryImpl$getSimilarTokens$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.OLrzqt;
            SimilarTokensRepositoryImpl$getSimilarTokensBWLJW6A$$inlined$dexRunCatching$1 similarTokensRepositoryImpl$getSimilarTokensBWLJW6A$$inlined$dexRunCatching$1 = new SimilarTokensRepositoryImpl$getSimilarTokensBWLJW6A$$inlined$dexRunCatching$1(null, this, str, str2, str3);
            similarTokensRepositoryImpl$getSimilarTokens$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, similarTokensRepositoryImpl$getSimilarTokensBWLJW6A$$inlined$dexRunCatching$1, similarTokensRepositoryImpl$getSimilarTokens$1);
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
