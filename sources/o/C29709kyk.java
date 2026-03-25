package o;

import com.okinc.business.market.features.tag.domain.FetchTagMetaUseCase$fetchIfNotCached$1;
import com.okinc.business.market.features.tag.domain.FetchTagMetaUseCase$fetchIfNotCachedIoAF18A$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.tag.domain.FetchTagMetaUseCase$invoke$1;
import com.okinc.business.market.features.tag.domain.FetchTagMetaUseCase$invokeIoAF18A$$inlined$dexRunCatching$1;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kyk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29709kyk {
    public final C29710kyl KWHzl;
    public final CoroutineDispatcher OLrzqt;

    @yCM
    public C29709kyk(@NotNull C29710kyl c29710kyl, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c29710kyl, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = c29710kyl;
        this.OLrzqt = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull Continuation<? super Result<Unit>> continuation) throws java.lang.Throwable {
        FetchTagMetaUseCase$invoke$1 fetchTagMetaUseCase$invoke$1;
        if (continuation instanceof FetchTagMetaUseCase$invoke$1) {
            fetchTagMetaUseCase$invoke$1 = (FetchTagMetaUseCase$invoke$1) continuation;
            int i = fetchTagMetaUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchTagMetaUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchTagMetaUseCase$invoke$1 = new FetchTagMetaUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = fetchTagMetaUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = fetchTagMetaUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.OLrzqt;
            FetchTagMetaUseCase$invokeIoAF18A$$inlined$dexRunCatching$1 fetchTagMetaUseCase$invokeIoAF18A$$inlined$dexRunCatching$1 = new FetchTagMetaUseCase$invokeIoAF18A$$inlined$dexRunCatching$1(null, this);
            fetchTagMetaUseCase$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, fetchTagMetaUseCase$invokeIoAF18A$$inlined$dexRunCatching$1, fetchTagMetaUseCase$invoke$1);
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
    public final java.lang.Object EZpvd(@NotNull Continuation<? super Result<Unit>> continuation) throws java.lang.Throwable {
        FetchTagMetaUseCase$fetchIfNotCached$1 fetchTagMetaUseCase$fetchIfNotCached$1;
        if (continuation instanceof FetchTagMetaUseCase$fetchIfNotCached$1) {
            fetchTagMetaUseCase$fetchIfNotCached$1 = (FetchTagMetaUseCase$fetchIfNotCached$1) continuation;
            int i = fetchTagMetaUseCase$fetchIfNotCached$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchTagMetaUseCase$fetchIfNotCached$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchTagMetaUseCase$fetchIfNotCached$1 = new FetchTagMetaUseCase$fetchIfNotCached$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = fetchTagMetaUseCase$fetchIfNotCached$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = fetchTagMetaUseCase$fetchIfNotCached$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.OLrzqt;
            FetchTagMetaUseCase$fetchIfNotCachedIoAF18A$$inlined$dexRunCatching$1 fetchTagMetaUseCase$fetchIfNotCachedIoAF18A$$inlined$dexRunCatching$1 = new FetchTagMetaUseCase$fetchIfNotCachedIoAF18A$$inlined$dexRunCatching$1(null, this);
            fetchTagMetaUseCase$fetchIfNotCached$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, fetchTagMetaUseCase$fetchIfNotCachedIoAF18A$$inlined$dexRunCatching$1, fetchTagMetaUseCase$fetchIfNotCached$1);
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
