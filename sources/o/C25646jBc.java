package o;

import com.okinc.business.market.features.address_tracker.domain.UpdateTrackerAliasUseCase$invoke$1;
import com.okinc.business.market.features.address_tracker.domain.UpdateTrackerAliasUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jBc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25646jBc {
    public final CoroutineDispatcher KWHzl;
    public final InterfaceC25651jBh OLrzqt;

    @yCM
    public C25646jBc(@NotNull InterfaceC25651jBh interfaceC25651jBh, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC25651jBh, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.OLrzqt = interfaceC25651jBh;
        this.KWHzl = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull Continuation<? super Result<? extends InterfaceC25647jBd>> continuation) {
        UpdateTrackerAliasUseCase$invoke$1 updateTrackerAliasUseCase$invoke$1;
        if (continuation instanceof UpdateTrackerAliasUseCase$invoke$1) {
            updateTrackerAliasUseCase$invoke$1 = (UpdateTrackerAliasUseCase$invoke$1) continuation;
            int i = updateTrackerAliasUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                updateTrackerAliasUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                updateTrackerAliasUseCase$invoke$1 = new UpdateTrackerAliasUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = updateTrackerAliasUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = updateTrackerAliasUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.KWHzl;
            UpdateTrackerAliasUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1 updateTrackerAliasUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1 = new UpdateTrackerAliasUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1(null, this, str, str2, str3);
            updateTrackerAliasUseCase$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, updateTrackerAliasUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1, updateTrackerAliasUseCase$invoke$1);
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
