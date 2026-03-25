package o;

import com.okinc.business.market.features.scanner.surge.trending.data.SurgeTrendingChainFilterData;
import com.okinc.business.market.features.scanner.surge.trending.domain.SurgeTrendingFilterCacheUseCase$getLastSelectedChain$1;
import com.okinc.business.market.features.scanner.surge.trending.domain.SurgeTrendingFilterCacheUseCase$getLastSelectedChainIoAF18A$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.scanner.surge.trending.domain.SurgeTrendingFilterCacheUseCase$loadFilterCache$1;
import com.okinc.business.market.features.scanner.surge.trending.domain.SurgeTrendingFilterCacheUseCase$loadFilterCachegIAlus$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.scanner.surge.trending.domain.SurgeTrendingFilterCacheUseCase$saveFilterCache$1;
import com.okinc.business.market.features.scanner.surge.trending.domain.SurgeTrendingFilterCacheUseCase$saveFilterCache0E7RQCE$$inlined$dexRunCatching$1;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kqy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29299kqy {
    public final C29298kqx EZpvd;
    public final CoroutineDispatcher KWHzl;

    @yCM
    public C29299kqy(@NotNull C29298kqx c29298kqx, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c29298kqx, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.EZpvd = c29298kqx;
        this.KWHzl = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull Continuation<? super Result<SurgeTrendingChainFilterData>> continuation) {
        SurgeTrendingFilterCacheUseCase$loadFilterCache$1 surgeTrendingFilterCacheUseCase$loadFilterCache$1;
        if (continuation instanceof SurgeTrendingFilterCacheUseCase$loadFilterCache$1) {
            surgeTrendingFilterCacheUseCase$loadFilterCache$1 = (SurgeTrendingFilterCacheUseCase$loadFilterCache$1) continuation;
            int i = surgeTrendingFilterCacheUseCase$loadFilterCache$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                surgeTrendingFilterCacheUseCase$loadFilterCache$1.label = i - Integer.MIN_VALUE;
            } else {
                surgeTrendingFilterCacheUseCase$loadFilterCache$1 = new SurgeTrendingFilterCacheUseCase$loadFilterCache$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = surgeTrendingFilterCacheUseCase$loadFilterCache$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = surgeTrendingFilterCacheUseCase$loadFilterCache$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.KWHzl;
            SurgeTrendingFilterCacheUseCase$loadFilterCachegIAlus$$inlined$dexRunCatching$1 surgeTrendingFilterCacheUseCase$loadFilterCachegIAlus$$inlined$dexRunCatching$1 = new SurgeTrendingFilterCacheUseCase$loadFilterCachegIAlus$$inlined$dexRunCatching$1(null, this, str);
            surgeTrendingFilterCacheUseCase$loadFilterCache$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, surgeTrendingFilterCacheUseCase$loadFilterCachegIAlus$$inlined$dexRunCatching$1, surgeTrendingFilterCacheUseCase$loadFilterCache$1);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull C29346krs c29346krs, @NotNull Continuation<? super Result<Unit>> continuation) {
        SurgeTrendingFilterCacheUseCase$saveFilterCache$1 surgeTrendingFilterCacheUseCase$saveFilterCache$1;
        if (continuation instanceof SurgeTrendingFilterCacheUseCase$saveFilterCache$1) {
            surgeTrendingFilterCacheUseCase$saveFilterCache$1 = (SurgeTrendingFilterCacheUseCase$saveFilterCache$1) continuation;
            int i = surgeTrendingFilterCacheUseCase$saveFilterCache$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                surgeTrendingFilterCacheUseCase$saveFilterCache$1.label = i - Integer.MIN_VALUE;
            } else {
                surgeTrendingFilterCacheUseCase$saveFilterCache$1 = new SurgeTrendingFilterCacheUseCase$saveFilterCache$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = surgeTrendingFilterCacheUseCase$saveFilterCache$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = surgeTrendingFilterCacheUseCase$saveFilterCache$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.KWHzl;
            SurgeTrendingFilterCacheUseCase$saveFilterCache0E7RQCE$$inlined$dexRunCatching$1 surgeTrendingFilterCacheUseCase$saveFilterCache0E7RQCE$$inlined$dexRunCatching$1 = new SurgeTrendingFilterCacheUseCase$saveFilterCache0E7RQCE$$inlined$dexRunCatching$1(null, this, str, c29346krs);
            surgeTrendingFilterCacheUseCase$saveFilterCache$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, surgeTrendingFilterCacheUseCase$saveFilterCache0E7RQCE$$inlined$dexRunCatching$1, surgeTrendingFilterCacheUseCase$saveFilterCache$1);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull Continuation<? super Result<java.lang.String>> continuation) {
        SurgeTrendingFilterCacheUseCase$getLastSelectedChain$1 surgeTrendingFilterCacheUseCase$getLastSelectedChain$1;
        if (continuation instanceof SurgeTrendingFilterCacheUseCase$getLastSelectedChain$1) {
            surgeTrendingFilterCacheUseCase$getLastSelectedChain$1 = (SurgeTrendingFilterCacheUseCase$getLastSelectedChain$1) continuation;
            int i = surgeTrendingFilterCacheUseCase$getLastSelectedChain$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                surgeTrendingFilterCacheUseCase$getLastSelectedChain$1.label = i - Integer.MIN_VALUE;
            } else {
                surgeTrendingFilterCacheUseCase$getLastSelectedChain$1 = new SurgeTrendingFilterCacheUseCase$getLastSelectedChain$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = surgeTrendingFilterCacheUseCase$getLastSelectedChain$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = surgeTrendingFilterCacheUseCase$getLastSelectedChain$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.KWHzl;
            SurgeTrendingFilterCacheUseCase$getLastSelectedChainIoAF18A$$inlined$dexRunCatching$1 surgeTrendingFilterCacheUseCase$getLastSelectedChainIoAF18A$$inlined$dexRunCatching$1 = new SurgeTrendingFilterCacheUseCase$getLastSelectedChainIoAF18A$$inlined$dexRunCatching$1(null, this);
            surgeTrendingFilterCacheUseCase$getLastSelectedChain$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, surgeTrendingFilterCacheUseCase$getLastSelectedChainIoAF18A$$inlined$dexRunCatching$1, surgeTrendingFilterCacheUseCase$getLastSelectedChain$1);
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
