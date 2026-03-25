package o;

import com.okinc.business.market.features.history.domain.MapHistoryUseCase$invoke$1;
import com.okinc.business.market.features.history.domain.MapHistoryUseCase$invokegIAlus$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.history.domain.model.HistoryChange;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jXm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C26250jXm {
    public final C29712kyn AEQbTJ;
    public final CoroutineDispatcher EZpvd;

    @yCM
    public C26250jXm(@NotNull C29712kyn c29712kyn, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c29712kyn, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = c29712kyn;
        this.EZpvd = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull HistoryChange historyChange, @NotNull Continuation<? super Result<C26277jYm>> continuation) {
        MapHistoryUseCase$invoke$1 mapHistoryUseCase$invoke$1;
        if (continuation instanceof MapHistoryUseCase$invoke$1) {
            mapHistoryUseCase$invoke$1 = (MapHistoryUseCase$invoke$1) continuation;
            int i = mapHistoryUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mapHistoryUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                mapHistoryUseCase$invoke$1 = new MapHistoryUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = mapHistoryUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = mapHistoryUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.EZpvd;
            MapHistoryUseCase$invokegIAlus$$inlined$dexRunCatching$1 mapHistoryUseCase$invokegIAlus$$inlined$dexRunCatching$1 = new MapHistoryUseCase$invokegIAlus$$inlined$dexRunCatching$1(null, historyChange, this);
            mapHistoryUseCase$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, mapHistoryUseCase$invokegIAlus$$inlined$dexRunCatching$1, mapHistoryUseCase$invoke$1);
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
