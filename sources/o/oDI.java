package o;

import com.okinc.im.usecase.group.info.ObserveGroupInfoUseCase$execute$1;
import com.okinc.okimcore.model.other.GroupInfo;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oDI {
    public final sIR EZpvd;

    @yCM
    public oDI(@NotNull sIR sir) {
        Intrinsics.checkNotNullParameter(sir, "");
        this.EZpvd = sir;
    }

    public final Flow<GroupInfo> AEQbTJ(java.lang.String str) {
        return FlowKt.distinctUntilChanged(FlowKt.flow(new ObserveGroupInfoUseCase$execute$1(str, this, null)));
    }
}
