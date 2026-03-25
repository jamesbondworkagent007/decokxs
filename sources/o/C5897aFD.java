package o;

import com.okinc.auth.impl.passkey.data.PasskeyApiService;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aFD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5897aFD {
    public final PasskeyApiService EZpvd;
    public final CoroutineDispatcher OLrzqt;
    private static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;

    @yCM
    public C5897aFD(@NotNull PasskeyApiService passkeyApiService, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(passkeyApiService, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.EZpvd = passkeyApiService;
        this.OLrzqt = coroutineDispatcher;
    }

    /* JADX INFO: renamed from: o.aFD$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aFD.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }
}
