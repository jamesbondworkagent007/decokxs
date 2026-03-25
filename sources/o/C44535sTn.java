package o;

import com.okinc.oklive.app.auth.LiveTokenManager$acquireNonLoginToken$2;
import com.okinc.oklive.app.data.repository.remote.LiveAuthService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sTn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@yCR
public final class C44535sTn {
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public final LiveAuthService AEQbTJ;

    @yCM
    public C44535sTn(@NotNull LiveAuthService liveAuthService) {
        Intrinsics.checkNotNullParameter(liveAuthService, "");
        this.AEQbTJ = liveAuthService;
    }

    /* JADX INFO: renamed from: o.sTn$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sTn.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public final java.lang.Object copydefault(@NotNull Continuation<? super java.lang.Boolean> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new LiveTokenManager$acquireNonLoginToken$2(this, null), continuation);
    }

    public final void EZpvd() {
        C44539sTr.EZpvd.KWHzl();
    }
}
