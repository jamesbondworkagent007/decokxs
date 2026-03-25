package o;

import com.okinc.auth.api.passkey.PasskeyVersionState;
import com.okinc.auth.impl.passkey.domain.CheckFido2UseCase$invoke$2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aFs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5938aFs {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public final C5904aFK AEQbTJ;
    public final C5900aFG EZpvd;
    public final C5908aFO KWHzl;
    public final C5903aFJ copydefault;
    public final CoroutineDispatcher gEmmrt;

    @yCM
    public C5938aFs(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C5900aFG c5900aFG, @NotNull C5908aFO c5908aFO, @NotNull C5903aFJ c5903aFJ, @NotNull C5904aFK c5904aFK) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c5900aFG, "");
        Intrinsics.checkNotNullParameter(c5908aFO, "");
        Intrinsics.checkNotNullParameter(c5903aFJ, "");
        Intrinsics.checkNotNullParameter(c5904aFK, "");
        this.gEmmrt = coroutineDispatcher;
        this.EZpvd = c5900aFG;
        this.KWHzl = c5908aFO;
        this.copydefault = c5903aFJ;
        this.AEQbTJ = c5904aFK;
    }

    public final java.lang.Object KWHzl(@NotNull Continuation<? super PasskeyVersionState> continuation) {
        return BuildersKt.withContext(this.gEmmrt, new CheckFido2UseCase$invoke$2(this, null), continuation);
    }

    /* JADX INFO: renamed from: o.aFs$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aFs.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }
}
