package o;

import com.okinc.auth.api.passkey.TargetDeviceVerificationInfo;
import com.okinc.auth.impl.mfa.domain.GetTargetDeviceVerificationInfoUseCase$getData$1;
import com.okinc.auth.impl.passkey.data.PasskeyApiService;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aCa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5761aCa extends AbstractC5726aBs<Activity, Application> {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public final PasskeyApiService KWHzl;
    public final CoroutineDispatcher copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public C5761aCa(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull PasskeyApiService passkeyApiService) {
        super(coroutineDispatcher);
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(passkeyApiService, "");
        this.copydefault = coroutineDispatcher;
        this.KWHzl = passkeyApiService;
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.AbstractC5726aBs
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull Activity activity, @NotNull Continuation<? super Application> continuation) throws java.lang.Throwable {
        GetTargetDeviceVerificationInfoUseCase$getData$1 getTargetDeviceVerificationInfoUseCase$getData$1;
        if (continuation instanceof GetTargetDeviceVerificationInfoUseCase$getData$1) {
            getTargetDeviceVerificationInfoUseCase$getData$1 = (GetTargetDeviceVerificationInfoUseCase$getData$1) continuation;
            int i = getTargetDeviceVerificationInfoUseCase$getData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getTargetDeviceVerificationInfoUseCase$getData$1.label = i - Integer.MIN_VALUE;
            } else {
                getTargetDeviceVerificationInfoUseCase$getData$1 = new GetTargetDeviceVerificationInfoUseCase$getData$1(this, continuation);
            }
        }
        java.lang.Object crossDeviceVerificationInfo = getTargetDeviceVerificationInfoUseCase$getData$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getTargetDeviceVerificationInfoUseCase$getData$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(crossDeviceVerificationInfo);
                C5882aEp.KWHzl.KWHzl(activity.AEQbTJ(), "start load target device verification info, sessionId=" + activity.OLrzqt());
                PasskeyApiService passkeyApiService = this.KWHzl;
                java.lang.String strOLrzqt = activity.OLrzqt();
                getTargetDeviceVerificationInfoUseCase$getData$1.L$0 = activity;
                getTargetDeviceVerificationInfoUseCase$getData$1.label = 1;
                crossDeviceVerificationInfo = passkeyApiService.getCrossDeviceVerificationInfo(strOLrzqt, getTargetDeviceVerificationInfoUseCase$getData$1);
                if (crossDeviceVerificationInfo == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                activity = (Activity) getTargetDeviceVerificationInfoUseCase$getData$1.L$0;
                C56391yDq.AEQbTJ(crossDeviceVerificationInfo);
            }
            java.lang.Object data = ((ResponseData) crossDeviceVerificationInfo).getData();
            Intrinsics.copydefault(data);
            TargetDeviceVerificationInfo targetDeviceVerificationInfo = (TargetDeviceVerificationInfo) data;
            C5882aEp.KWHzl.KWHzl(activity.AEQbTJ(), "load target device verification info success, data=" + targetDeviceVerificationInfo);
            return new Application.ActionBar(targetDeviceVerificationInfo);
        } catch (OKServerException e) {
            C5882aEp.KWHzl.KWHzl(activity.AEQbTJ(), "load target device verification info error, code=" + e.getCode() + ", error=" + e.getMessage());
            if (e.getCode() == 3030) {
                return Application.C0813Application.OLrzqt;
            }
            return new Application.StateListAnimator(e.getMessage());
        }
    }

    /* JADX INFO: renamed from: o.aCa$Activity */
    /* JADX INFO: loaded from: classes14.dex */
    public static final class Activity {
        public final java.lang.String KWHzl;
        public final java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = activity.KWHzl;
            }
            if ((i & 2) != 0) {
                str2 = activity.OLrzqt;
            }
            return activity.KWHzl(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new Activity(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) activity.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) activity.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.KWHzl.hashCode() * 31) + this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Input(sessionId=" + this.KWHzl + ", flow=" + this.OLrzqt + ")";
        }

        public Activity(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.KWHzl = str;
            this.OLrzqt = str2;
        }
    }

    /* JADX INFO: renamed from: o.aCa$Application */
    /* JADX INFO: loaded from: classes14.dex */
    public interface Application {

        /* JADX INFO: renamed from: o.aCa$Application$ActionBar */
        public static final class ActionBar implements Application {
            public static final int OLrzqt = TargetDeviceVerificationInfo.$stable;
            public final TargetDeviceVerificationInfo KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, TargetDeviceVerificationInfo targetDeviceVerificationInfo, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    targetDeviceVerificationInfo = actionBar.KWHzl;
                }
                return actionBar.AEQbTJ(targetDeviceVerificationInfo);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ActionBar AEQbTJ(@NotNull TargetDeviceVerificationInfo targetDeviceVerificationInfo) {
                Intrinsics.checkNotNullParameter(targetDeviceVerificationInfo, "");
                return new ActionBar(targetDeviceVerificationInfo);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final TargetDeviceVerificationInfo OLrzqt() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ActionBar) && Intrinsics.EZpvd(this.KWHzl, ((ActionBar) obj).KWHzl);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.KWHzl.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Success(info=" + this.KWHzl + ")";
            }

            public ActionBar(@NotNull TargetDeviceVerificationInfo targetDeviceVerificationInfo) {
                Intrinsics.checkNotNullParameter(targetDeviceVerificationInfo, "");
                this.KWHzl = targetDeviceVerificationInfo;
            }
        }

        /* JADX INFO: renamed from: o.aCa$Application$StateListAnimator */
        public static final class StateListAnimator implements Application {
            public final java.lang.String EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = stateListAnimator.EZpvd;
                }
                return stateListAnimator.copydefault(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String OLrzqt() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StateListAnimator copydefault(java.lang.String str) {
                return new StateListAnimator(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StateListAnimator) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) ((StateListAnimator) obj).EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                java.lang.String str = this.EZpvd;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Error(error=" + this.EZpvd + ")";
            }

            public StateListAnimator(java.lang.String str) {
                this.EZpvd = str;
            }
        }

        /* JADX INFO: renamed from: o.aCa$Application$Application, reason: collision with other inner class name */
        public static final class C0813Application implements Application {
            public static final C0813Application OLrzqt = new C0813Application();

            private C0813Application() {
            }
        }
    }

    /* JADX INFO: renamed from: o.aCa$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aCa.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }
}
