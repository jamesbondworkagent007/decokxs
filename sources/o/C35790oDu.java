package o;

import com.okinc.im.usecase.group.entryconfiguration.GroupEntryCurrencyListUseCase$execute$2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oDu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35790oDu {
    public final CoroutineDispatcher KWHzl;
    public final C44255sJa copydefault;

    @yCM
    public C35790oDu(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C44255sJa c44255sJa) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c44255sJa, "");
        this.KWHzl = coroutineDispatcher;
        this.copydefault = c44255sJa;
    }

    public final java.lang.Object copydefault(@NotNull Continuation<? super AbstractC44413sOx> continuation) {
        return BuildersKt.withContext(this.KWHzl, new GroupEntryCurrencyListUseCase$execute$2(this, null), continuation);
    }
}
