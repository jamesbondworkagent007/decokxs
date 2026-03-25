package o;

import com.okinc.auth.impl.passkey.data.PasskeyApiService;
import com.okinc.auth.impl.passkey.domain.OkxPayPasskeyRegistrationInitiateUseCase$invoke$2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aFE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5898aFE {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public final PasskeyApiService EZpvd;
    public final CoroutineDispatcher OLrzqt;

    @yCM
    public C5898aFE(@NotNull PasskeyApiService passkeyApiService, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(passkeyApiService, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.EZpvd = passkeyApiService;
        this.OLrzqt = coroutineDispatcher;
    }

    /* JADX INFO: renamed from: o.aFE$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aFE.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public final java.lang.Object OLrzqt(@NotNull Continuation<? super Application> continuation) {
        return BuildersKt.withContext(this.OLrzqt, new OkxPayPasskeyRegistrationInitiateUseCase$invoke$2(this, null), continuation);
    }

    /* JADX INFO: renamed from: o.aFE$Application */
    /* JADX INFO: loaded from: classes14.dex */
    public static abstract class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aFE.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: o.aFE$Application$StateListAnimator */
        /* JADX INFO: loaded from: classes17.dex */
        public static final class StateListAnimator extends Application {
            public static final StateListAnimator OLrzqt = new StateListAnimator();

            private StateListAnimator() {
                super(null);
            }
        }

        private Application() {
        }

        /* JADX INFO: renamed from: o.aFE$Application$Application, reason: collision with other inner class name */
        /* JADX INFO: loaded from: classes17.dex */
        public static final class C0817Application extends Application {
            public static final C0817Application EZpvd = new C0817Application();

            private C0817Application() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: o.aFE$Application$TaskDescription */
        /* JADX INFO: loaded from: classes17.dex */
        public static final class TaskDescription extends Application {
            public final java.lang.Exception EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, java.lang.Exception exc, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    exc = taskDescription.EZpvd;
                }
                return taskDescription.OLrzqt(exc);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.Exception KWHzl() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final TaskDescription OLrzqt(@NotNull java.lang.Exception exc) {
                Intrinsics.checkNotNullParameter(exc, "");
                return new TaskDescription(exc);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof TaskDescription) && Intrinsics.EZpvd(this.EZpvd, ((TaskDescription) obj).EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.EZpvd.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Failure(exception=" + this.EZpvd + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TaskDescription(@NotNull java.lang.Exception exc) {
                super(null);
                Intrinsics.checkNotNullParameter(exc, "");
                this.EZpvd = exc;
            }
        }
    }
}
