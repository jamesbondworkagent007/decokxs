package o;

import com.okinc.auth.impl.mfa.domain.CheckCrossDeviceVerificationResultUseCase$getData$1;
import com.okinc.auth.impl.mfa.model.FinishCrossDeviceVerificationRequest;
import com.okinc.auth.impl.mfa.model.MfaFailure;
import com.okinc.auth.impl.passkey.data.PasskeyApiService;
import com.okinc.network.okg.response.OKServerException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aCb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5762aCb extends AbstractC5726aBs<TaskDescription, ActionBar> {
    public final PasskeyApiService AEQbTJ;
    public final CoroutineDispatcher copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public C5762aCb(@NotNull PasskeyApiService passkeyApiService, @NotNull CoroutineDispatcher coroutineDispatcher) {
        super(coroutineDispatcher);
        Intrinsics.checkNotNullParameter(passkeyApiService, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = passkeyApiService;
        this.copydefault = coroutineDispatcher;
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.AbstractC5726aBs
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull TaskDescription taskDescription, @NotNull Continuation<? super ActionBar> continuation) throws java.lang.Throwable {
        CheckCrossDeviceVerificationResultUseCase$getData$1 checkCrossDeviceVerificationResultUseCase$getData$1;
        if (continuation instanceof CheckCrossDeviceVerificationResultUseCase$getData$1) {
            checkCrossDeviceVerificationResultUseCase$getData$1 = (CheckCrossDeviceVerificationResultUseCase$getData$1) continuation;
            int i = checkCrossDeviceVerificationResultUseCase$getData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                checkCrossDeviceVerificationResultUseCase$getData$1.label = i - Integer.MIN_VALUE;
            } else {
                checkCrossDeviceVerificationResultUseCase$getData$1 = new CheckCrossDeviceVerificationResultUseCase$getData$1(this, continuation);
            }
        }
        java.lang.Object obj = checkCrossDeviceVerificationResultUseCase$getData$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = checkCrossDeviceVerificationResultUseCase$getData$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                FinishCrossDeviceVerificationRequest finishCrossDeviceVerificationRequest = new FinishCrossDeviceVerificationRequest(taskDescription.EZpvd(), taskDescription.copydefault());
                C5882aEp.KWHzl.KWHzl(taskDescription.OLrzqt(), "start check cross device verification result, request=" + finishCrossDeviceVerificationRequest);
                PasskeyApiService passkeyApiService = this.AEQbTJ;
                checkCrossDeviceVerificationResultUseCase$getData$1.L$0 = taskDescription;
                checkCrossDeviceVerificationResultUseCase$getData$1.label = 1;
                if (passkeyApiService.finishCrossDeviceVerification(finishCrossDeviceVerificationRequest, checkCrossDeviceVerificationResultUseCase$getData$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                taskDescription = (TaskDescription) checkCrossDeviceVerificationResultUseCase$getData$1.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            C5882aEp.KWHzl.KWHzl(taskDescription.OLrzqt(), "check cross device verification result success");
            return ActionBar.StateListAnimator.EZpvd;
        } catch (OKServerException e) {
            C5882aEp.KWHzl.KWHzl(taskDescription.OLrzqt(), "check cross device verification result error, code=" + e.getCode() + ", message=" + e.getMessage());
            MfaFailure mfaFailureKWHzl = C5774aCn.KWHzl(e);
            if (mfaFailureKWHzl instanceof MfaFailure.GenericFailure) {
                return new ActionBar.Application(((MfaFailure.GenericFailure) mfaFailureKWHzl).EZpvd());
            }
            return new ActionBar.TaskDescription(mfaFailureKWHzl);
        }
    }

    /* JADX INFO: renamed from: o.aCb$TaskDescription */
    /* JADX INFO: loaded from: classes14.dex */
    public static final class TaskDescription {
        public final java.lang.String AEQbTJ;
        public final java.lang.String EZpvd;
        public final java.lang.String KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = taskDescription.EZpvd;
            }
            if ((i & 2) != 0) {
                str2 = taskDescription.AEQbTJ;
            }
            if ((i & 4) != 0) {
                str3 = taskDescription.KWHzl;
            }
            return taskDescription.EZpvd(str, str2, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            return new TaskDescription(str, str2, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.AEQbTJ;
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
            return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) taskDescription.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) taskDescription.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) taskDescription.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.EZpvd.hashCode() * 31) + this.AEQbTJ.hashCode()) * 31) + this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Input(challenge=" + this.EZpvd + ", targetCredentialId=" + this.AEQbTJ + ", flow=" + this.KWHzl + ")";
        }

        public TaskDescription(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            this.EZpvd = str;
            this.AEQbTJ = str2;
            this.KWHzl = str3;
        }
    }

    /* JADX INFO: renamed from: o.aCb$ActionBar */
    /* JADX INFO: loaded from: classes14.dex */
    public interface ActionBar {

        /* JADX INFO: renamed from: o.aCb$ActionBar$StateListAnimator */
        public static final class StateListAnimator implements ActionBar {
            public static final StateListAnimator EZpvd = new StateListAnimator();

            private StateListAnimator() {
            }
        }

        /* JADX INFO: renamed from: o.aCb$ActionBar$Application */
        public static final class Application implements ActionBar {
            public final java.lang.String KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Application copy$default(Application application, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = application.KWHzl;
                }
                return application.AEQbTJ(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Application AEQbTJ(java.lang.String str) {
                return new Application(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String KWHzl() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Application) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) ((Application) obj).KWHzl);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                java.lang.String str = this.KWHzl;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Error(error=" + this.KWHzl + ")";
            }

            public Application(java.lang.String str) {
                this.KWHzl = str;
            }
        }

        /* JADX INFO: renamed from: o.aCb$ActionBar$TaskDescription */
        public static final class TaskDescription implements ActionBar {
            public final MfaFailure KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, MfaFailure mfaFailure, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    mfaFailure = taskDescription.KWHzl;
                }
                return taskDescription.KWHzl(mfaFailure);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final MfaFailure AEQbTJ() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final TaskDescription KWHzl(@NotNull MfaFailure mfaFailure) {
                Intrinsics.checkNotNullParameter(mfaFailure, "");
                return new TaskDescription(mfaFailure);
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
                return "MfaError(error=" + this.KWHzl + ")";
            }

            public TaskDescription(@NotNull MfaFailure mfaFailure) {
                Intrinsics.checkNotNullParameter(mfaFailure, "");
                this.KWHzl = mfaFailure;
            }
        }
    }
}
