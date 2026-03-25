package o;

import com.okinc.business.market.features.meme.token_detail_sheet.domain.repository.KLineRepositoryImpl$getCoinKLineInfo$1;
import com.okinc.business.market.features.meme.token_detail_sheet.domain.repository.KLineRepositoryImpl$getCoinKLineInfoBWLJW6A$$inlined$dexRunCatching$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.khF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28777khF implements InterfaceC28780khI {
    public final CoroutineDispatcher EZpvd;
    public final InterfaceC27595jyE KWHzl;

    @yCM
    public C28777khF(@NotNull InterfaceC27595jyE interfaceC27595jyE, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC27595jyE, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = interfaceC27595jyE;
        this.EZpvd = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC28780khI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull Continuation<? super Result<? extends java.util.List<? extends java.util.List<java.lang.String>>>> continuation) {
        KLineRepositoryImpl$getCoinKLineInfo$1 kLineRepositoryImpl$getCoinKLineInfo$1;
        if (continuation instanceof KLineRepositoryImpl$getCoinKLineInfo$1) {
            kLineRepositoryImpl$getCoinKLineInfo$1 = (KLineRepositoryImpl$getCoinKLineInfo$1) continuation;
            int i = kLineRepositoryImpl$getCoinKLineInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                kLineRepositoryImpl$getCoinKLineInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                kLineRepositoryImpl$getCoinKLineInfo$1 = new KLineRepositoryImpl$getCoinKLineInfo$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = kLineRepositoryImpl$getCoinKLineInfo$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = kLineRepositoryImpl$getCoinKLineInfo$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.EZpvd;
            KLineRepositoryImpl$getCoinKLineInfoBWLJW6A$$inlined$dexRunCatching$1 kLineRepositoryImpl$getCoinKLineInfoBWLJW6A$$inlined$dexRunCatching$1 = new KLineRepositoryImpl$getCoinKLineInfoBWLJW6A$$inlined$dexRunCatching$1(null, this, str, str2, str3);
            kLineRepositoryImpl$getCoinKLineInfo$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, kLineRepositoryImpl$getCoinKLineInfoBWLJW6A$$inlined$dexRunCatching$1, kLineRepositoryImpl$getCoinKLineInfo$1);
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
