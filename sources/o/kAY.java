package o;

import com.okinc.business.market.features.vibes.domain.VibesOverviewData;
import com.okinc.business.market.features.vibes.repo.VibesRepositoryImpl$fetchOverviewInfo$1;
import com.okinc.business.market.features.vibes.repo.VibesRepositoryImpl$fetchOverviewInfo0E7RQCE$$inlined$dexRunCatching$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kAY implements kAM {
    public final InterfaceC23229huL KWHzl;
    public final CoroutineDispatcher OLrzqt;

    @yCM
    public kAY(@NotNull InterfaceC23229huL interfaceC23229huL, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC23229huL, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = interfaceC23229huL;
        this.OLrzqt = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.kAM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super Result<VibesOverviewData>> continuation) {
        VibesRepositoryImpl$fetchOverviewInfo$1 vibesRepositoryImpl$fetchOverviewInfo$1;
        if (continuation instanceof VibesRepositoryImpl$fetchOverviewInfo$1) {
            vibesRepositoryImpl$fetchOverviewInfo$1 = (VibesRepositoryImpl$fetchOverviewInfo$1) continuation;
            int i = vibesRepositoryImpl$fetchOverviewInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                vibesRepositoryImpl$fetchOverviewInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                vibesRepositoryImpl$fetchOverviewInfo$1 = new VibesRepositoryImpl$fetchOverviewInfo$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = vibesRepositoryImpl$fetchOverviewInfo$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = vibesRepositoryImpl$fetchOverviewInfo$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.OLrzqt;
            VibesRepositoryImpl$fetchOverviewInfo0E7RQCE$$inlined$dexRunCatching$1 vibesRepositoryImpl$fetchOverviewInfo0E7RQCE$$inlined$dexRunCatching$1 = new VibesRepositoryImpl$fetchOverviewInfo0E7RQCE$$inlined$dexRunCatching$1(null, this, str, str2);
            vibesRepositoryImpl$fetchOverviewInfo$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, vibesRepositoryImpl$fetchOverviewInfo0E7RQCE$$inlined$dexRunCatching$1, vibesRepositoryImpl$fetchOverviewInfo$1);
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
