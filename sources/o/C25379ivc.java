package o;

import com.okinc.business.dexui.utils.DefaultPollingManager$doPolling$1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import o.InterfaceC25391ivo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ivc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@yCR
public final class C25379ivc implements InterfaceC25391ivo {
    @yCM
    public C25379ivc() {
    }

    @Override // o.InterfaceC25391ivo
    public Job KWHzl(@NotNull CoroutineScope coroutineScope, long j, @NotNull InterfaceC25391ivo.StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        return C25389ivm.safeLaunch$default(coroutineScope, null, null, new DefaultPollingManager$doPolling$1(stateListAnimator, j, null), 3, null);
    }
}
