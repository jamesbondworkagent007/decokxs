package o;

import com.okinc.oklive.app.data.repository.remote.LiveStreamStatusModelResponse;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class sTZ {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public final sTP copydefault;

    @yCM
    public sTZ(@NotNull sTP stp) {
        Intrinsics.checkNotNullParameter(stp, "");
        this.copydefault = stp;
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sTZ.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull Continuation<? super LiveStreamStatusModelResponse> continuation) {
        pUU.EZpvd("FetchLiveStreamStatusUseCase", "Fetching moderator invitation status for channelId: " + str);
        return this.copydefault.OLrzqt(str, continuation);
    }
}
