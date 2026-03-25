package o;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.oklive.app.manager.LiveStreamCustomMessageManager$startListening$1;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sUg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C44555sUg {
    public Job EZpvd;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;

    /* JADX INFO: renamed from: o.sUg$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sUg.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public final void OLrzqt(@NotNull java.lang.String str, @NotNull LifecycleOwner lifecycleOwner, @NotNull Function1<? super OKMessage, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(function1, "");
        OLrzqt();
        if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            this.EZpvd = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), Dispatchers.getIO(), null, new LiveStreamCustomMessageManager$startListening$1(str, function1, null), 2, null);
            pUU.EZpvd("LiveStreamCustomMessageManager", "Started listening for custom messages on channel: " + str);
            return;
        }
        pUU.valueOf("LiveStreamCustomMessageManager", "Cannot start listening: channelId is blank");
    }

    public final void OLrzqt() {
        Job job = this.EZpvd;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        this.EZpvd = null;
        pUU.EZpvd("LiveStreamCustomMessageManager", "Stopped listening for custom messages");
    }
}
