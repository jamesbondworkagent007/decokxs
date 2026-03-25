package o;

import com.okinc.im.usecase.group.entryconfiguration.GroupEntryGetVerificationDetails$execute$2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oDz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35795oDz {
    public final C44255sJa EZpvd;
    public final CoroutineDispatcher copydefault;

    @yCM
    public C35795oDz(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C44255sJa c44255sJa) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c44255sJa, "");
        this.copydefault = coroutineDispatcher;
        this.EZpvd = c44255sJa;
    }

    public final java.lang.Object KWHzl(long j, @NotNull Continuation<? super AbstractC44412sOw> continuation) {
        return BuildersKt.withContext(this.copydefault, new GroupEntryGetVerificationDetails$execute$2(this, j, null), continuation);
    }
}
