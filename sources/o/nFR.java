package o;

import com.okinc.im.imui.conversationlist.OrbitNotificationService$startObservingOrbitUpdate$1;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@yCR
public final class nFR {
    public final CoroutineDispatcher AEQbTJ;
    public Job EZpvd;
    public final oCK OLrzqt;

    @yCM
    public nFR(@NotNull oCK ock, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(ock, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.OLrzqt = ock;
        this.AEQbTJ = coroutineDispatcher;
    }

    public final void AEQbTJ() {
        Job job = this.EZpvd;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        this.EZpvd = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.AEQbTJ), null, null, new OrbitNotificationService$startObservingOrbitUpdate$1(this, null), 3, null);
    }

    public final void KWHzl() {
        Job job = this.EZpvd;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
    }
}
