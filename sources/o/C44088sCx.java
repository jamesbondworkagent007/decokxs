package o;

import com.okinc.okex.uploadlog.usecase.GetLocalLogsUseCase$invoke$1;
import com.okinc.okex.uploadlog.usecase.GetLocalLogsUseCase$invoke$logFile$1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sCx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44088sCx {
    public final CoroutineDispatcher AEQbTJ;

    @yCM
    public C44088sCx(@NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull Continuation<? super java.io.File> continuation) throws java.lang.Throwable {
        GetLocalLogsUseCase$invoke$1 getLocalLogsUseCase$invoke$1;
        if (continuation instanceof GetLocalLogsUseCase$invoke$1) {
            getLocalLogsUseCase$invoke$1 = (GetLocalLogsUseCase$invoke$1) continuation;
            int i = getLocalLogsUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getLocalLogsUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getLocalLogsUseCase$invoke$1 = new GetLocalLogsUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = getLocalLogsUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getLocalLogsUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            C44760scx.log$default("Retrieving debug log files", null, 2, null);
            CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
            GetLocalLogsUseCase$invoke$logFile$1 getLocalLogsUseCase$invoke$logFile$1 = new GetLocalLogsUseCase$invoke$logFile$1(null);
            getLocalLogsUseCase$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, getLocalLogsUseCase$invoke$logFile$1, getLocalLogsUseCase$invoke$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        java.io.File file = (java.io.File) objWithContext;
        if (file != null) {
            return file;
        }
        throw new java.io.FileNotFoundException("Failed to retrieve app logs");
    }
}
