package o;

import com.okinc.auth.impl.mfa.domain.RejectCrossDeviceVerificationUseCase$getData$1;
import com.okinc.auth.impl.passkey.data.PasskeyApiService;
import com.okinc.auth.impl.passkey.model.DecisionInHouseAuthenticationRequest;
import com.okinc.network.okg.response.OKServerException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aCj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5770aCj extends AbstractC5726aBs<TaskDescription, Application> {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public final CoroutineDispatcher EZpvd;
    public final PasskeyApiService KWHzl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public C5770aCj(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull PasskeyApiService passkeyApiService) {
        super(coroutineDispatcher);
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(passkeyApiService, "");
        this.EZpvd = coroutineDispatcher;
        this.KWHzl = passkeyApiService;
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.AbstractC5726aBs
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull TaskDescription taskDescription, @NotNull Continuation<? super Application> continuation) throws java.lang.Throwable {
        RejectCrossDeviceVerificationUseCase$getData$1 rejectCrossDeviceVerificationUseCase$getData$1;
        if (continuation instanceof RejectCrossDeviceVerificationUseCase$getData$1) {
            rejectCrossDeviceVerificationUseCase$getData$1 = (RejectCrossDeviceVerificationUseCase$getData$1) continuation;
            int i = rejectCrossDeviceVerificationUseCase$getData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                rejectCrossDeviceVerificationUseCase$getData$1.label = i - Integer.MIN_VALUE;
            } else {
                rejectCrossDeviceVerificationUseCase$getData$1 = new RejectCrossDeviceVerificationUseCase$getData$1(this, continuation);
            }
        }
        java.lang.Object obj = rejectCrossDeviceVerificationUseCase$getData$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = rejectCrossDeviceVerificationUseCase$getData$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                C5882aEp.KWHzl.KWHzl(taskDescription.KWHzl(), "start reject cross device verification, sessionId=" + taskDescription.AEQbTJ());
                DecisionInHouseAuthenticationRequest decisionInHouseAuthenticationRequest = new DecisionInHouseAuthenticationRequest(taskDescription.AEQbTJ(), "REJECT");
                PasskeyApiService passkeyApiService = this.KWHzl;
                rejectCrossDeviceVerificationUseCase$getData$1.L$0 = taskDescription;
                rejectCrossDeviceVerificationUseCase$getData$1.label = 1;
                if (passkeyApiService.decisionInHouseAuthentication(decisionInHouseAuthenticationRequest, rejectCrossDeviceVerificationUseCase$getData$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                taskDescription = (TaskDescription) rejectCrossDeviceVerificationUseCase$getData$1.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            C5882aEp.KWHzl.KWHzl(taskDescription.KWHzl(), "reject cross device verification success");
            return Application.Activity.KWHzl;
        } catch (OKServerException e) {
            C5882aEp.KWHzl.KWHzl(taskDescription.KWHzl(), "reject cross device verification error, code=" + e.getCode() + ", error=" + e.getMessage());
            if (e.getCode() == 3030) {
                return Application.C0815Application.AEQbTJ;
            }
            return new Application.StateListAnimator(e.getMessage());
        }
    }

    /* JADX INFO: renamed from: o.aCj$TaskDescription */
    /* JADX INFO: loaded from: classes14.dex */
    public static final class TaskDescription {
        public final java.lang.String EZpvd;
        public final java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = taskDescription.EZpvd;
            }
            if ((i & 2) != 0) {
                str2 = taskDescription.OLrzqt;
            }
            return taskDescription.copydefault(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new TaskDescription(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TaskDescription)) {
                return false;
            }
            TaskDescription taskDescription = (TaskDescription) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) taskDescription.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) taskDescription.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.EZpvd.hashCode() * 31) + this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Input(crossDevicePasskeySessionId=" + this.EZpvd + ", flow=" + this.OLrzqt + ")";
        }

        public TaskDescription(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.EZpvd = str;
            this.OLrzqt = str2;
        }
    }

    /* JADX INFO: renamed from: o.aCj$Application */
    /* JADX INFO: loaded from: classes14.dex */
    public interface Application {

        /* JADX INFO: renamed from: o.aCj$Application$Activity */
        public static final class Activity implements Application {
            public static final Activity KWHzl = new Activity();

            private Activity() {
            }
        }

        /* JADX INFO: renamed from: o.aCj$Application$StateListAnimator */
        public static final class StateListAnimator implements Application {
            public final java.lang.String OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = stateListAnimator.OLrzqt;
                }
                return stateListAnimator.KWHzl(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String EZpvd() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StateListAnimator KWHzl(java.lang.String str) {
                return new StateListAnimator(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StateListAnimator) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) ((StateListAnimator) obj).OLrzqt);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                java.lang.String str = this.OLrzqt;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Error(error=" + this.OLrzqt + ")";
            }

            public StateListAnimator(java.lang.String str) {
                this.OLrzqt = str;
            }
        }

        /* JADX INFO: renamed from: o.aCj$Application$Application, reason: collision with other inner class name */
        public static final class C0815Application implements Application {
            public static final C0815Application AEQbTJ = new C0815Application();

            private C0815Application() {
            }
        }
    }

    /* JADX INFO: renamed from: o.aCj$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aCj.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }
}
