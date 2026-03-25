package o;

import com.okinc.business.market.features.address_tracker.domain.SortTrackerGroupsUseCase$invoke$1;
import com.okinc.business.market.features.address_tracker.domain.SortTrackerGroupsUseCase$invokegIAlus$$inlined$dexRunCatching$1;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class jAP {
    public final InterfaceC25651jBh AEQbTJ;
    public final kKG EZpvd;
    public final CoroutineDispatcher copydefault;

    @yCM
    public jAP(@NotNull InterfaceC25651jBh interfaceC25651jBh, @NotNull kKG kkg, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC25651jBh, "");
        Intrinsics.checkNotNullParameter(kkg, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = interfaceC25651jBh;
        this.EZpvd = kkg;
        this.copydefault = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull java.util.List<java.lang.Integer> list, @NotNull Continuation<? super Result<Unit>> continuation) {
        SortTrackerGroupsUseCase$invoke$1 sortTrackerGroupsUseCase$invoke$1;
        if (continuation instanceof SortTrackerGroupsUseCase$invoke$1) {
            sortTrackerGroupsUseCase$invoke$1 = (SortTrackerGroupsUseCase$invoke$1) continuation;
            int i = sortTrackerGroupsUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                sortTrackerGroupsUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                sortTrackerGroupsUseCase$invoke$1 = new SortTrackerGroupsUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = sortTrackerGroupsUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = sortTrackerGroupsUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.copydefault;
            SortTrackerGroupsUseCase$invokegIAlus$$inlined$dexRunCatching$1 sortTrackerGroupsUseCase$invokegIAlus$$inlined$dexRunCatching$1 = new SortTrackerGroupsUseCase$invokegIAlus$$inlined$dexRunCatching$1(null, this, list);
            sortTrackerGroupsUseCase$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, sortTrackerGroupsUseCase$invokegIAlus$$inlined$dexRunCatching$1, sortTrackerGroupsUseCase$invoke$1);
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
