package o;

import com.okinc.auth.impl.passkey.data.PasskeyApiService;
import com.okinc.auth.impl.passkey.domain.DexPasskeyStartAuthenticateUseCase$invoke$2;
import com.okinc.auth.impl.passkey.model.AuthenticationStartResponse;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aFA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5894aFA {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public final PasskeyApiService AEQbTJ;
    public final CoroutineDispatcher OLrzqt;

    @yCM
    public C5894aFA(@NotNull PasskeyApiService passkeyApiService, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(passkeyApiService, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = passkeyApiService;
        this.OLrzqt = coroutineDispatcher;
    }

    public final java.lang.Object KWHzl(@NotNull Continuation<? super TaskDescription> continuation) {
        return BuildersKt.withContext(this.OLrzqt, new DexPasskeyStartAuthenticateUseCase$invoke$2(this, null), continuation);
    }

    /* JADX INFO: renamed from: o.aFA$TaskDescription */
    /* JADX INFO: loaded from: classes14.dex */
    public static abstract class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aFA.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: o.aFA$TaskDescription$StateListAnimator */
        /* JADX INFO: loaded from: classes17.dex */
        public static final class StateListAnimator extends TaskDescription {
            public final AuthenticationStartResponse AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final AuthenticationStartResponse KWHzl() {
                return this.AEQbTJ;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StateListAnimator(@NotNull AuthenticationStartResponse authenticationStartResponse) {
                super(null);
                Intrinsics.checkNotNullParameter(authenticationStartResponse, "");
                this.AEQbTJ = authenticationStartResponse;
            }
        }

        private TaskDescription() {
        }

        /* JADX INFO: renamed from: o.aFA$TaskDescription$Application */
        /* JADX INFO: loaded from: classes17.dex */
        public static final class Application extends TaskDescription {
            public final java.lang.String EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String EZpvd() {
                return this.EZpvd;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Application(@NotNull java.lang.String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.EZpvd = str;
            }
        }

        /* JADX INFO: renamed from: o.aFA$TaskDescription$ActionBar */
        /* JADX INFO: loaded from: classes17.dex */
        public static final class ActionBar extends TaskDescription {
            public final java.lang.Exception KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.Exception OLrzqt() {
                return this.KWHzl;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ActionBar(@NotNull java.lang.Exception exc) {
                super(null);
                Intrinsics.checkNotNullParameter(exc, "");
                this.KWHzl = exc;
            }
        }
    }

    /* JADX INFO: renamed from: o.aFA$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aFA.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }
}
