package o;

import com.okinc.business.dexlogic.main.market.bean.CandlesticksBean;
import com.okinc.business.market.features.meme.token_detail_sheet.domain.FetchKLineDataUseCase$invoke$1;
import com.okinc.business.market.features.meme.token_detail_sheet.domain.FetchKLineDataUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.khH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28779khH {
    public final InterfaceC28780khI EZpvd;
    public final CoroutineDispatcher copydefault;

    @yCM
    public C28779khH(@NotNull InterfaceC28780khI interfaceC28780khI, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC28780khI, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.EZpvd = interfaceC28780khI;
        this.copydefault = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull Continuation<? super Result<? extends java.util.List<CandlesticksBean>>> continuation) throws java.lang.Throwable {
        FetchKLineDataUseCase$invoke$1 fetchKLineDataUseCase$invoke$1;
        if (continuation instanceof FetchKLineDataUseCase$invoke$1) {
            fetchKLineDataUseCase$invoke$1 = (FetchKLineDataUseCase$invoke$1) continuation;
            int i = fetchKLineDataUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchKLineDataUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchKLineDataUseCase$invoke$1 = new FetchKLineDataUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = fetchKLineDataUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = fetchKLineDataUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.copydefault;
            FetchKLineDataUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1 fetchKLineDataUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1 = new FetchKLineDataUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1(null, this, str, str2, str3);
            fetchKLineDataUseCase$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, fetchKLineDataUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1, fetchKLineDataUseCase$invoke$1);
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
