package o;

import com.okinc.auth.impl.mfa.data.MfaApiService;
import com.okinc.auth.impl.mfa.domain.MaxOutSupportNextStepUseCase$invoke$2;
import com.okinc.auth.impl.mfa.model.MfaFailure;
import com.okinc.auth.impl.mfa.model.MfaResponse;
import com.okinc.auth.impl.mfa.model.MfaScenario;
import com.okinc.network.okg.cor.SubdomainStrategy;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aCf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5766aCf {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public final CoroutineDispatcher EZpvd;
    public final MfaApiService KWHzl;

    @yCM
    public C5766aCf(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull MfaApiService mfaApiService) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(mfaApiService, "");
        this.EZpvd = coroutineDispatcher;
        this.KWHzl = mfaApiService;
    }

    public final java.lang.Object copydefault(@NotNull java.lang.String str, SubdomainStrategy subdomainStrategy, @NotNull MfaScenario mfaScenario, @NotNull Continuation<? super Application> continuation) {
        return BuildersKt.withContext(this.EZpvd, new MaxOutSupportNextStepUseCase$invoke$2(mfaScenario, this, subdomainStrategy, str, null), continuation);
    }

    /* JADX INFO: renamed from: o.aCf$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aCf.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    /* JADX INFO: renamed from: o.aCf$Application */
    /* JADX INFO: loaded from: classes14.dex */
    public static abstract class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aCf.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: o.aCf$Application$TaskDescription */
        /* JADX INFO: loaded from: classes23.dex */
        public static final class TaskDescription extends Application {
            public final MfaResponse KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, MfaResponse mfaResponse, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    mfaResponse = taskDescription.KWHzl;
                }
                return taskDescription.KWHzl(mfaResponse);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final MfaResponse AEQbTJ() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final TaskDescription KWHzl(@NotNull MfaResponse mfaResponse) {
                Intrinsics.checkNotNullParameter(mfaResponse, "");
                return new TaskDescription(mfaResponse);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof TaskDescription) && Intrinsics.EZpvd(this.KWHzl, ((TaskDescription) obj).KWHzl);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.KWHzl.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Success(response=" + this.KWHzl + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TaskDescription(@NotNull MfaResponse mfaResponse) {
                super(null);
                Intrinsics.checkNotNullParameter(mfaResponse, "");
                this.KWHzl = mfaResponse;
            }
        }

        private Application() {
        }

        /* JADX INFO: renamed from: o.aCf$Application$StateListAnimator */
        /* JADX INFO: loaded from: classes23.dex */
        public static final class StateListAnimator extends Application {
            public final MfaFailure OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, MfaFailure mfaFailure, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    mfaFailure = stateListAnimator.OLrzqt;
                }
                return stateListAnimator.EZpvd(mfaFailure);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final MfaFailure EZpvd() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StateListAnimator EZpvd(@NotNull MfaFailure mfaFailure) {
                Intrinsics.checkNotNullParameter(mfaFailure, "");
                return new StateListAnimator(mfaFailure);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StateListAnimator) && Intrinsics.EZpvd(this.OLrzqt, ((StateListAnimator) obj).OLrzqt);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.OLrzqt.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Error(mfaFailure=" + this.OLrzqt + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StateListAnimator(@NotNull MfaFailure mfaFailure) {
                super(null);
                Intrinsics.checkNotNullParameter(mfaFailure, "");
                this.OLrzqt = mfaFailure;
            }
        }
    }
}
