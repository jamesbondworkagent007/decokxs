package o;

import com.okinc.business.market.features.event.domain.usecase.BannerEventUseCase$invoke$1;
import com.okinc.business.market.features.event.domain.usecase.BannerEventUseCase$invokeIoAF18A$$inlined$dexRunCatching$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class jRQ {
    public final CoroutineDispatcher EZpvd;
    public final jRU copydefault;

    @yCM
    public jRQ(@NotNull jRU jru, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(jru, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = jru;
        this.EZpvd = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull Continuation<? super Result<? extends java.util.List<jRP>>> continuation) throws java.lang.Throwable {
        BannerEventUseCase$invoke$1 bannerEventUseCase$invoke$1;
        if (continuation instanceof BannerEventUseCase$invoke$1) {
            bannerEventUseCase$invoke$1 = (BannerEventUseCase$invoke$1) continuation;
            int i = bannerEventUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                bannerEventUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                bannerEventUseCase$invoke$1 = new BannerEventUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = bannerEventUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = bannerEventUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.EZpvd;
            BannerEventUseCase$invokeIoAF18A$$inlined$dexRunCatching$1 bannerEventUseCase$invokeIoAF18A$$inlined$dexRunCatching$1 = new BannerEventUseCase$invokeIoAF18A$$inlined$dexRunCatching$1(null, this);
            bannerEventUseCase$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, bannerEventUseCase$invokeIoAF18A$$inlined$dexRunCatching$1, bannerEventUseCase$invoke$1);
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
