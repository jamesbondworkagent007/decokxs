package o;

import com.okinc.business.market.features.address_tracker.domain.DeleteTrackerGroupUseCase$invoke$1;
import com.okinc.business.market.features.address_tracker.domain.DeleteTrackerGroupUseCase$invokegIAlus$$inlined$dexRunCatching$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class jAI {
    public final CoroutineDispatcher AEQbTJ;
    public final kKG EZpvd;
    public final InterfaceC25651jBh copydefault;

    @yCM
    public jAI(@NotNull InterfaceC25651jBh interfaceC25651jBh, @NotNull kKG kkg, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC25651jBh, "");
        Intrinsics.checkNotNullParameter(kkg, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = interfaceC25651jBh;
        this.EZpvd = kkg;
        this.AEQbTJ = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(int i, @NotNull Continuation<? super Result<java.lang.Integer>> continuation) {
        DeleteTrackerGroupUseCase$invoke$1 deleteTrackerGroupUseCase$invoke$1;
        if (continuation instanceof DeleteTrackerGroupUseCase$invoke$1) {
            deleteTrackerGroupUseCase$invoke$1 = (DeleteTrackerGroupUseCase$invoke$1) continuation;
            int i2 = deleteTrackerGroupUseCase$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deleteTrackerGroupUseCase$invoke$1.label = i2 - Integer.MIN_VALUE;
            } else {
                deleteTrackerGroupUseCase$invoke$1 = new DeleteTrackerGroupUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = deleteTrackerGroupUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = deleteTrackerGroupUseCase$invoke$1.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
            DeleteTrackerGroupUseCase$invokegIAlus$$inlined$dexRunCatching$1 deleteTrackerGroupUseCase$invokegIAlus$$inlined$dexRunCatching$1 = new DeleteTrackerGroupUseCase$invokegIAlus$$inlined$dexRunCatching$1(null, this, i);
            deleteTrackerGroupUseCase$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, deleteTrackerGroupUseCase$invokegIAlus$$inlined$dexRunCatching$1, deleteTrackerGroupUseCase$invoke$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }
}
