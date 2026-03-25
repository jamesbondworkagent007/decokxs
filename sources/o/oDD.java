package o;

import com.okinc.im.usecase.group.entryconfiguration.GroupEntryVerifyAssetUseCase$execute$2;
import com.okinc.okimcore.model.remote.GroupEntryVerifyAsset;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oDD {
    public final C44255sJa EZpvd;
    public final CoroutineDispatcher OLrzqt;

    @yCM
    public oDD(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C44255sJa c44255sJa) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c44255sJa, "");
        this.OLrzqt = coroutineDispatcher;
        this.EZpvd = c44255sJa;
    }

    public final java.lang.Object AEQbTJ(@NotNull GroupEntryVerifyAsset groupEntryVerifyAsset, @NotNull Continuation<? super AbstractC44414sOy> continuation) {
        return BuildersKt.withContext(this.OLrzqt, new GroupEntryVerifyAssetUseCase$execute$2(this, groupEntryVerifyAsset, null), continuation);
    }
}
