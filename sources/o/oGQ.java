package o;

import com.okinc.im.usecase.userinfo.PreloadUserInfoUseCase$execute$2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oGQ {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public final CoroutineDispatcher AEQbTJ;
    public final InterfaceC44177sGd OLrzqt;

    @yCM
    public oGQ(@NotNull InterfaceC44177sGd interfaceC44177sGd, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC44177sGd, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.OLrzqt = interfaceC44177sGd;
        this.AEQbTJ = coroutineDispatcher;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oGQ.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public final java.lang.Object AEQbTJ(@NotNull Continuation<? super java.lang.Boolean> continuation) {
        return BuildersKt.withContext(this.AEQbTJ, new PreloadUserInfoUseCase$execute$2(this, null), continuation);
    }
}
