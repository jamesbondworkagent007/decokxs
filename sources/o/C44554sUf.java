package o;

import com.okinc.oklive.app.data.model.remote.LivestreamInfoResponse;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sUf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C44554sUf {
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public final sTP KWHzl;

    @yCM
    public C44554sUf(@NotNull sTP stp) {
        Intrinsics.checkNotNullParameter(stp, "");
        this.KWHzl = stp;
    }

    /* JADX INFO: renamed from: o.sUf$Application */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sUf.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public final java.lang.Object KWHzl(long j, @NotNull Continuation<? super LivestreamInfoResponse> continuation) {
        pUU.EZpvd("GetLivestreamPreviewUseCase", "Getting livestream preview for uid: " + j);
        return this.KWHzl.AEQbTJ(j, continuation);
    }
}
