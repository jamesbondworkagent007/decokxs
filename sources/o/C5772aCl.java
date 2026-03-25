package o;

import com.okinc.auth.impl.mfa.domain.StartCrossDeviceVerificationUseCase$getData$1;
import com.okinc.auth.impl.mfa.model.MfaFailure;
import com.okinc.auth.impl.mfa.model.StartCrossDeviceVerificationRequest;
import com.okinc.auth.impl.passkey.data.PasskeyApiService;
import com.okinc.network.okg.response.OKServerException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aCl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5772aCl extends AbstractC5726aBs<StateListAnimator, TaskDescription> {
    public final PasskeyApiService AEQbTJ;
    public final CoroutineDispatcher EZpvd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public C5772aCl(@NotNull PasskeyApiService passkeyApiService, @NotNull CoroutineDispatcher coroutineDispatcher) {
        super(coroutineDispatcher);
        Intrinsics.checkNotNullParameter(passkeyApiService, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = passkeyApiService;
        this.EZpvd = coroutineDispatcher;
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.AbstractC5726aBs
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull StateListAnimator stateListAnimator, @NotNull Continuation<? super TaskDescription> continuation) throws java.lang.Throwable {
        StartCrossDeviceVerificationUseCase$getData$1 startCrossDeviceVerificationUseCase$getData$1;
        if (continuation instanceof StartCrossDeviceVerificationUseCase$getData$1) {
            startCrossDeviceVerificationUseCase$getData$1 = (StartCrossDeviceVerificationUseCase$getData$1) continuation;
            int i = startCrossDeviceVerificationUseCase$getData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                startCrossDeviceVerificationUseCase$getData$1.label = i - Integer.MIN_VALUE;
            } else {
                startCrossDeviceVerificationUseCase$getData$1 = new StartCrossDeviceVerificationUseCase$getData$1(this, continuation);
            }
        }
        java.lang.Object obj = startCrossDeviceVerificationUseCase$getData$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = startCrossDeviceVerificationUseCase$getData$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                StartCrossDeviceVerificationRequest startCrossDeviceVerificationRequest = new StartCrossDeviceVerificationRequest(stateListAnimator.copydefault(), stateListAnimator.OLrzqt());
                C5882aEp.KWHzl.KWHzl(stateListAnimator.EZpvd(), "start cross device verification, request=" + startCrossDeviceVerificationRequest);
                PasskeyApiService passkeyApiService = this.AEQbTJ;
                startCrossDeviceVerificationUseCase$getData$1.L$0 = stateListAnimator;
                startCrossDeviceVerificationUseCase$getData$1.label = 1;
                if (passkeyApiService.startCrossDeviceVerification(startCrossDeviceVerificationRequest, startCrossDeviceVerificationUseCase$getData$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                stateListAnimator = (StateListAnimator) startCrossDeviceVerificationUseCase$getData$1.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            C5882aEp.KWHzl.KWHzl(stateListAnimator.EZpvd(), "start cross device verification success");
            return TaskDescription.C0816TaskDescription.AEQbTJ;
        } catch (OKServerException e) {
            C5882aEp.KWHzl.KWHzl(stateListAnimator.EZpvd(), "start cross device verification error, code=" + e.getCode() + ", message=" + e.getMessage());
            MfaFailure mfaFailureKWHzl = C5774aCn.KWHzl(e);
            if (mfaFailureKWHzl instanceof MfaFailure.GenericFailure) {
                return new TaskDescription.ActionBar(((MfaFailure.GenericFailure) mfaFailureKWHzl).EZpvd());
            }
            return new TaskDescription.StateListAnimator(mfaFailureKWHzl);
        }
    }

    /* JADX INFO: renamed from: o.aCl$StateListAnimator */
    /* JADX INFO: loaded from: classes14.dex */
    public static final class StateListAnimator {
        public final java.lang.String AEQbTJ;
        public final java.lang.String KWHzl;
        public final java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = stateListAnimator.OLrzqt;
            }
            if ((i & 2) != 0) {
                str2 = stateListAnimator.AEQbTJ;
            }
            if ((i & 4) != 0) {
                str3 = stateListAnimator.KWHzl;
            }
            return stateListAnimator.copydefault(str, str2, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            return new StateListAnimator(str, str2, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) stateListAnimator.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) stateListAnimator.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) stateListAnimator.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.OLrzqt.hashCode() * 31) + this.AEQbTJ.hashCode()) * 31) + this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Input(challenge=" + this.OLrzqt + ", targetCredentialId=" + this.AEQbTJ + ", flow=" + this.KWHzl + ")";
        }

        public StateListAnimator(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            this.OLrzqt = str;
            this.AEQbTJ = str2;
            this.KWHzl = str3;
        }
    }

    /* JADX INFO: renamed from: o.aCl$TaskDescription */
    /* JADX INFO: loaded from: classes14.dex */
    public interface TaskDescription {

        /* JADX INFO: renamed from: o.aCl$TaskDescription$TaskDescription, reason: collision with other inner class name */
        public static final class C0816TaskDescription implements TaskDescription {
            public static final C0816TaskDescription AEQbTJ = new C0816TaskDescription();

            private C0816TaskDescription() {
            }
        }

        /* JADX INFO: renamed from: o.aCl$TaskDescription$ActionBar */
        public static final class ActionBar implements TaskDescription {
            public final java.lang.String OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = actionBar.OLrzqt;
                }
                return actionBar.EZpvd(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ActionBar EZpvd(java.lang.String str) {
                return new ActionBar(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String OLrzqt() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ActionBar) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) ((ActionBar) obj).OLrzqt);
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

            public ActionBar(java.lang.String str) {
                this.OLrzqt = str;
            }
        }

        /* JADX INFO: renamed from: o.aCl$TaskDescription$StateListAnimator */
        public static final class StateListAnimator implements TaskDescription {
            public final MfaFailure EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, MfaFailure mfaFailure, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    mfaFailure = stateListAnimator.EZpvd;
                }
                return stateListAnimator.AEQbTJ(mfaFailure);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StateListAnimator AEQbTJ(@NotNull MfaFailure mfaFailure) {
                Intrinsics.checkNotNullParameter(mfaFailure, "");
                return new StateListAnimator(mfaFailure);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final MfaFailure KWHzl() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StateListAnimator) && Intrinsics.EZpvd(this.EZpvd, ((StateListAnimator) obj).EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.EZpvd.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "MfaError(error=" + this.EZpvd + ")";
            }

            public StateListAnimator(@NotNull MfaFailure mfaFailure) {
                Intrinsics.checkNotNullParameter(mfaFailure, "");
                this.EZpvd = mfaFailure;
            }
        }
    }
}
