package o;

import com.okinc.business.market.features.tag.domain.TagWrapper;
import com.okinc.business.market.features.token_detail.domain.GenerateDevAnalysisTagUseCase$invoke$1;
import com.okinc.business.market.features.token_detail.domain.GenerateDevAnalysisTagUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kzv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29773kzv {
    public final CoroutineDispatcher AEQbTJ;
    public final C29715kyq copydefault;

    @yCM
    public C29773kzv(@NotNull C29715kyq c29715kyq, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c29715kyq, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = c29715kyq;
        this.AEQbTJ = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(java.lang.Integer num, java.lang.Integer num2, @NotNull Continuation<? super Result<TagWrapper>> continuation) throws java.lang.Throwable {
        GenerateDevAnalysisTagUseCase$invoke$1 generateDevAnalysisTagUseCase$invoke$1;
        if (continuation instanceof GenerateDevAnalysisTagUseCase$invoke$1) {
            generateDevAnalysisTagUseCase$invoke$1 = (GenerateDevAnalysisTagUseCase$invoke$1) continuation;
            int i = generateDevAnalysisTagUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                generateDevAnalysisTagUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                generateDevAnalysisTagUseCase$invoke$1 = new GenerateDevAnalysisTagUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = generateDevAnalysisTagUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = generateDevAnalysisTagUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
            GenerateDevAnalysisTagUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1 generateDevAnalysisTagUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1 = new GenerateDevAnalysisTagUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1(null, num, num2, this);
            generateDevAnalysisTagUseCase$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, generateDevAnalysisTagUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1, generateDevAnalysisTagUseCase$invoke$1);
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
