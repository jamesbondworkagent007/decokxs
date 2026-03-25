package o;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sUd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C44552sUd {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public final sTP AEQbTJ;

    @yCM
    public C44552sUd(@NotNull sTP stp) {
        Intrinsics.checkNotNullParameter(stp, "");
        this.AEQbTJ = stp;
    }

    /* JADX INFO: renamed from: o.sUd$TaskDescription */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sUd.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull Continuation<? super sTB> continuation) {
        pUU.EZpvd("FetchChannelByShareCodeUseCase", "Fetching livestream status for shareCode: " + str);
        return this.AEQbTJ.KWHzl(str, continuation);
    }
}
