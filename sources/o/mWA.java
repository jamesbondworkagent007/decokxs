package o;

import com.okinc.dexkline.market.features.coindetail.domain.KlineDexFlashNewsUseCase$getDexContentFlashData$1;
import com.okinc.dexkline.market.features.coindetail.domain.KlineDexFlashNewsUseCase$getDexContentFlashDatabMdYcbs$$inlined$dexRunCatching$1;
import com.okinc.dexkline.market.features.coindetail.domain.KlineDexFlashNewsUseCase$getDexFlashNewsItems$1;
import com.okinc.dexkline.market.features.coindetail.domain.KlineDexFlashNewsUseCase$getDexFlashNewsItemsbMdYcbs$$inlined$dexRunCatching$1;
import com.okinc.kline.news.data.vo.KlineFlashItem;
import com.okinc.kline.news.data.vo.KlineFlashVo;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class mWA {
    public final CoroutineDispatcher KWHzl;
    public final mWJ copydefault;

    @yCM
    public mWA(@NotNull mWJ mwj, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(mwj, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = mwj;
        this.KWHzl = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.Integer num, @NotNull Continuation<? super Result<? extends java.util.List<KlineFlashItem>>> continuation) {
        KlineDexFlashNewsUseCase$getDexFlashNewsItems$1 klineDexFlashNewsUseCase$getDexFlashNewsItems$1;
        if (continuation instanceof KlineDexFlashNewsUseCase$getDexFlashNewsItems$1) {
            klineDexFlashNewsUseCase$getDexFlashNewsItems$1 = (KlineDexFlashNewsUseCase$getDexFlashNewsItems$1) continuation;
            int i = klineDexFlashNewsUseCase$getDexFlashNewsItems$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                klineDexFlashNewsUseCase$getDexFlashNewsItems$1.label = i - Integer.MIN_VALUE;
            } else {
                klineDexFlashNewsUseCase$getDexFlashNewsItems$1 = new KlineDexFlashNewsUseCase$getDexFlashNewsItems$1(this, continuation);
            }
        }
        KlineDexFlashNewsUseCase$getDexFlashNewsItems$1 klineDexFlashNewsUseCase$getDexFlashNewsItems$12 = klineDexFlashNewsUseCase$getDexFlashNewsItems$1;
        java.lang.Object objWithContext = klineDexFlashNewsUseCase$getDexFlashNewsItems$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = klineDexFlashNewsUseCase$getDexFlashNewsItems$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.KWHzl;
            KlineDexFlashNewsUseCase$getDexFlashNewsItemsbMdYcbs$$inlined$dexRunCatching$1 klineDexFlashNewsUseCase$getDexFlashNewsItemsbMdYcbs$$inlined$dexRunCatching$1 = new KlineDexFlashNewsUseCase$getDexFlashNewsItemsbMdYcbs$$inlined$dexRunCatching$1(null, this, str, str2, str3, str4, str5, num);
            klineDexFlashNewsUseCase$getDexFlashNewsItems$12.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, klineDexFlashNewsUseCase$getDexFlashNewsItemsbMdYcbs$$inlined$dexRunCatching$1, klineDexFlashNewsUseCase$getDexFlashNewsItems$12);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.Integer num, @NotNull Continuation<? super Result<? extends java.util.List<KlineFlashVo>>> continuation) {
        KlineDexFlashNewsUseCase$getDexContentFlashData$1 klineDexFlashNewsUseCase$getDexContentFlashData$1;
        if (continuation instanceof KlineDexFlashNewsUseCase$getDexContentFlashData$1) {
            klineDexFlashNewsUseCase$getDexContentFlashData$1 = (KlineDexFlashNewsUseCase$getDexContentFlashData$1) continuation;
            int i = klineDexFlashNewsUseCase$getDexContentFlashData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                klineDexFlashNewsUseCase$getDexContentFlashData$1.label = i - Integer.MIN_VALUE;
            } else {
                klineDexFlashNewsUseCase$getDexContentFlashData$1 = new KlineDexFlashNewsUseCase$getDexContentFlashData$1(this, continuation);
            }
        }
        KlineDexFlashNewsUseCase$getDexContentFlashData$1 klineDexFlashNewsUseCase$getDexContentFlashData$12 = klineDexFlashNewsUseCase$getDexContentFlashData$1;
        java.lang.Object objWithContext = klineDexFlashNewsUseCase$getDexContentFlashData$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = klineDexFlashNewsUseCase$getDexContentFlashData$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.KWHzl;
            KlineDexFlashNewsUseCase$getDexContentFlashDatabMdYcbs$$inlined$dexRunCatching$1 klineDexFlashNewsUseCase$getDexContentFlashDatabMdYcbs$$inlined$dexRunCatching$1 = new KlineDexFlashNewsUseCase$getDexContentFlashDatabMdYcbs$$inlined$dexRunCatching$1(null, this, str, str2, str3, str4, str5, num);
            klineDexFlashNewsUseCase$getDexContentFlashData$12.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, klineDexFlashNewsUseCase$getDexContentFlashDatabMdYcbs$$inlined$dexRunCatching$1, klineDexFlashNewsUseCase$getDexContentFlashData$12);
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
