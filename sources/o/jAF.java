package o;

import com.okinc.business.market.features.address_tracker.domain.BatchUpdateTrackerGroupUseCase$invoke$1;
import com.okinc.business.market.features.address_tracker.domain.BatchUpdateTrackerGroupUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class jAF {
    public final C28586kda AEQbTJ;
    public final CoroutineDispatcher EZpvd;
    public final C25653jBj OLrzqt;
    public final C28603kdr copydefault;

    @yCM
    public jAF(@NotNull C25653jBj c25653jBj, @NotNull C28586kda c28586kda, @NotNull C28603kdr c28603kdr, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c25653jBj, "");
        Intrinsics.checkNotNullParameter(c28586kda, "");
        Intrinsics.checkNotNullParameter(c28603kdr, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.OLrzqt = c25653jBj;
        this.AEQbTJ = c28586kda;
        this.copydefault = c28603kdr;
        this.EZpvd = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.util.List<java.lang.Integer> list, @NotNull Continuation<? super Result<? extends jAC>> continuation) throws java.lang.Throwable {
        BatchUpdateTrackerGroupUseCase$invoke$1 batchUpdateTrackerGroupUseCase$invoke$1;
        if (continuation instanceof BatchUpdateTrackerGroupUseCase$invoke$1) {
            batchUpdateTrackerGroupUseCase$invoke$1 = (BatchUpdateTrackerGroupUseCase$invoke$1) continuation;
            int i = batchUpdateTrackerGroupUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                batchUpdateTrackerGroupUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                batchUpdateTrackerGroupUseCase$invoke$1 = new BatchUpdateTrackerGroupUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = batchUpdateTrackerGroupUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = batchUpdateTrackerGroupUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.EZpvd;
            BatchUpdateTrackerGroupUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1 batchUpdateTrackerGroupUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1 = new BatchUpdateTrackerGroupUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1(null, this, str, list);
            batchUpdateTrackerGroupUseCase$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, batchUpdateTrackerGroupUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1, batchUpdateTrackerGroupUseCase$invoke$1);
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

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.jAF */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: invoke-0E7RQCE$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m8630invoke0E7RQCE$default(jAF jaf, java.lang.String str, java.util.List list, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            list = yDY.AhwBna();
        }
        return jaf.AEQbTJ(str, list, continuation);
    }
}
