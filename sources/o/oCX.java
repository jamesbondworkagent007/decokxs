package o;

import com.okinc.im.usecase.dialogmodel.RecordSendConfirmationDialogShowAlreadyUseCase$execute$2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oCX {
    public final CoroutineDispatcher AEQbTJ;
    public final oCV EZpvd;
    public final oGI KWHzl;
    public final oGC copydefault;

    @yCM
    public oCX(@NotNull oGC ogc, @NotNull oGI ogi, @NotNull oCV ocv, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(ogc, "");
        Intrinsics.checkNotNullParameter(ogi, "");
        Intrinsics.checkNotNullParameter(ocv, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = ogc;
        this.KWHzl = ogi;
        this.EZpvd = ocv;
        this.AEQbTJ = coroutineDispatcher;
    }

    public final java.lang.Object AEQbTJ(@NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext = BuildersKt.withContext(this.AEQbTJ, new RecordSendConfirmationDialogShowAlreadyUseCase$execute$2(this, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }
}
