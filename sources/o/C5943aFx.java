package o;

import com.okinc.auth.impl.passkey.domain.CheckXiaomiCredManUseCase$invoke$2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aFx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5943aFx {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public final C6609aSa EZpvd;
    public final CoroutineDispatcher copydefault;

    @yCM
    public C5943aFx(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C6609aSa c6609aSa) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c6609aSa, "");
        this.copydefault = coroutineDispatcher;
        this.EZpvd = c6609aSa;
    }

    public final java.lang.Object OLrzqt(@NotNull Continuation<? super java.lang.Boolean> continuation) {
        return BuildersKt.withContext(this.copydefault, new CheckXiaomiCredManUseCase$invoke$2(this, null), continuation);
    }

    /* JADX INFO: renamed from: o.aFx$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aFx.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }
}
