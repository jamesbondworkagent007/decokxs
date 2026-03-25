package o;

import com.okinc.im.usecase.dialogmodel.RecordLeaveThisChatDialogShowAlreadyUseCase$execute$2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oCY {
    public final oGC AEQbTJ;
    public final oCQ EZpvd;
    public final CoroutineDispatcher KWHzl;
    public final oGI OLrzqt;

    @yCM
    public oCY(@NotNull oGC ogc, @NotNull oGI ogi, @NotNull oCQ ocq, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(ogc, "");
        Intrinsics.checkNotNullParameter(ogi, "");
        Intrinsics.checkNotNullParameter(ocq, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = ogc;
        this.OLrzqt = ogi;
        this.EZpvd = ocq;
        this.KWHzl = coroutineDispatcher;
    }

    public final java.lang.Object copydefault(@NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext = BuildersKt.withContext(this.KWHzl, new RecordLeaveThisChatDialogShowAlreadyUseCase$execute$2(this, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }
}
