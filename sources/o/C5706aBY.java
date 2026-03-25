package o;

import com.okinc.auth.impl.mfa.domain.KickOutInitialDeviceUseCase$getData$1;
import com.okinc.auth.impl.passkey.data.PasskeyApiService;
import com.okinc.auth.impl.passkey.model.AuthenticationStartResponse;
import com.okinc.auth.impl.passkey.model.FinishInHouseAuthenticationRequest;
import com.okinc.auth.impl.passkey.model.StartInHouseAuthenticationRequest;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.C5695aBN;
import o.InterfaceC5693aBL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aBY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5706aBY extends AbstractC5726aBs<Activity, TaskDescription> {
    public final PasskeyApiService EZpvd;
    public final C5695aBN KWHzl;
    public final CoroutineDispatcher copydefault;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public C5706aBY(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull PasskeyApiService passkeyApiService, @NotNull C5695aBN c5695aBN) {
        super(coroutineDispatcher);
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(passkeyApiService, "");
        Intrinsics.checkNotNullParameter(c5695aBN, "");
        this.copydefault = coroutineDispatcher;
        this.EZpvd = passkeyApiService;
        this.KWHzl = c5695aBN;
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d2 A[Catch: OKServerException -> 0x01ec, TryCatch #0 {OKServerException -> 0x01ec, blocks: (B:14:0x002f, B:41:0x00fb, B:19:0x0044, B:32:0x00c2, B:36:0x00cc, B:38:0x00d2, B:43:0x0109, B:45:0x010d, B:47:0x013d, B:48:0x0140, B:50:0x0148, B:51:0x014b, B:53:0x014f, B:54:0x0162, B:56:0x016a, B:58:0x016d, B:59:0x0172, B:60:0x0173, B:62:0x0177, B:64:0x01a4, B:66:0x01ac, B:69:0x01bc, B:71:0x01c2, B:72:0x01c6, B:74:0x01e6, B:75:0x01eb, B:22:0x0056, B:29:0x0094, B:25:0x005d), top: B:82:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0109 A[Catch: OKServerException -> 0x01ec, TryCatch #0 {OKServerException -> 0x01ec, blocks: (B:14:0x002f, B:41:0x00fb, B:19:0x0044, B:32:0x00c2, B:36:0x00cc, B:38:0x00d2, B:43:0x0109, B:45:0x010d, B:47:0x013d, B:48:0x0140, B:50:0x0148, B:51:0x014b, B:53:0x014f, B:54:0x0162, B:56:0x016a, B:58:0x016d, B:59:0x0172, B:60:0x0173, B:62:0x0177, B:64:0x01a4, B:66:0x01ac, B:69:0x01bc, B:71:0x01c2, B:72:0x01c6, B:74:0x01e6, B:75:0x01eb, B:22:0x0056, B:29:0x0094, B:25:0x005d), top: B:82:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.AbstractC5726aBs
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull Activity activity, @NotNull Continuation<? super TaskDescription> continuation) throws java.lang.Throwable {
        KickOutInitialDeviceUseCase$getData$1 kickOutInitialDeviceUseCase$getData$1;
        C5706aBY c5706aBY;
        java.lang.Object objKWHzl;
        C5695aBN.ActionBar actionBar;
        if (continuation instanceof KickOutInitialDeviceUseCase$getData$1) {
            kickOutInitialDeviceUseCase$getData$1 = (KickOutInitialDeviceUseCase$getData$1) continuation;
            int i = kickOutInitialDeviceUseCase$getData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                kickOutInitialDeviceUseCase$getData$1.label = i - Integer.MIN_VALUE;
            } else {
                kickOutInitialDeviceUseCase$getData$1 = new KickOutInitialDeviceUseCase$getData$1(this, continuation);
            }
        }
        java.lang.Object objStartInHouseAuthentication = kickOutInitialDeviceUseCase$getData$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = kickOutInitialDeviceUseCase$getData$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objStartInHouseAuthentication);
                C5882aEp.KWHzl.KWHzl(activity.copydefault(), "start kick out initial device, sessionId=" + activity.OLrzqt());
                StartInHouseAuthenticationRequest startInHouseAuthenticationRequest = new StartInHouseAuthenticationRequest(activity.OLrzqt());
                PasskeyApiService passkeyApiService = this.EZpvd;
                kickOutInitialDeviceUseCase$getData$1.L$0 = this;
                kickOutInitialDeviceUseCase$getData$1.L$1 = activity;
                kickOutInitialDeviceUseCase$getData$1.label = 1;
                objStartInHouseAuthentication = passkeyApiService.startInHouseAuthentication(startInHouseAuthenticationRequest, kickOutInitialDeviceUseCase$getData$1);
                if (objStartInHouseAuthentication == objCopydefault) {
                    return objCopydefault;
                }
                c5706aBY = this;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        activity = (Activity) kickOutInitialDeviceUseCase$getData$1.L$0;
                        C56391yDq.AEQbTJ(objStartInHouseAuthentication);
                        C5882aEp.KWHzl.KWHzl(activity.copydefault(), "finish in house authentication api success");
                        return TaskDescription.StateListAnimator.KWHzl;
                    }
                    activity = (Activity) kickOutInitialDeviceUseCase$getData$1.L$1;
                    c5706aBY = (C5706aBY) kickOutInitialDeviceUseCase$getData$1.L$0;
                    C56391yDq.AEQbTJ(objStartInHouseAuthentication);
                    objKWHzl = ((Result) objStartInHouseAuthentication).m7386unboximpl();
                    actionBar = (C5695aBN.ActionBar) (!Result.m7383isFailureimpl(objKWHzl) ? null : objKWHzl);
                    if (!(actionBar instanceof C5695aBN.ActionBar.C0808ActionBar)) {
                        C5882aEp.KWHzl.KWHzl(activity.copydefault(), "verify guard success");
                        FinishInHouseAuthenticationRequest finishInHouseAuthenticationRequest = new FinishInHouseAuthenticationRequest(activity.OLrzqt(), ((C5695aBN.ActionBar.C0808ActionBar) actionBar).OLrzqt());
                        PasskeyApiService passkeyApiService2 = c5706aBY.EZpvd;
                        kickOutInitialDeviceUseCase$getData$1.L$0 = activity;
                        kickOutInitialDeviceUseCase$getData$1.L$1 = null;
                        kickOutInitialDeviceUseCase$getData$1.label = 3;
                        if (passkeyApiService2.finishInHouseAuthentication(finishInHouseAuthenticationRequest, kickOutInitialDeviceUseCase$getData$1) == objCopydefault) {
                            return objCopydefault;
                        }
                        C5882aEp.KWHzl.KWHzl(activity.copydefault(), "finish in house authentication api success");
                        return TaskDescription.StateListAnimator.KWHzl;
                    }
                    if (actionBar instanceof C5695aBN.ActionBar.Application) {
                        C5882aEp.KWHzl.KWHzl(activity.copydefault(), "verify guard error, biometric error, error=" + ((C5695aBN.ActionBar.Application) actionBar).EZpvd());
                        InterfaceC5693aBL.StateListAnimator stateListAnimatorEZpvd = ((C5695aBN.ActionBar.Application) actionBar).EZpvd();
                        if (!Intrinsics.EZpvd(stateListAnimatorEZpvd, InterfaceC5693aBL.StateListAnimator.Application.EZpvd) && !Intrinsics.EZpvd(stateListAnimatorEZpvd, InterfaceC5693aBL.StateListAnimator.TaskDescription.EZpvd)) {
                            if (stateListAnimatorEZpvd instanceof InterfaceC5693aBL.StateListAnimator.ActionBar) {
                                return new TaskDescription.Application(((InterfaceC5693aBL.StateListAnimator.ActionBar) ((C5695aBN.ActionBar.Application) actionBar).EZpvd()).OLrzqt());
                            }
                            if (Intrinsics.EZpvd(stateListAnimatorEZpvd, InterfaceC5693aBL.StateListAnimator.Activity.copydefault)) {
                                return TaskDescription.C0810TaskDescription.KWHzl;
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                        return TaskDescription.Activity.KWHzl;
                    }
                    if (actionBar instanceof C5695aBN.ActionBar.Activity) {
                        C5882aEp.KWHzl.KWHzl(activity.copydefault(), "verify guard error, sign error, error=" + ((C5695aBN.ActionBar.Activity) actionBar).copydefault());
                        return new TaskDescription.Application(((C5695aBN.ActionBar.Activity) actionBar).copydefault());
                    }
                    if (Intrinsics.EZpvd(actionBar, C5695aBN.ActionBar.StateListAnimator.KWHzl)) {
                        C5882aEp.KWHzl.KWHzl(activity.copydefault(), "verify guard error, user key pair not exist");
                        return TaskDescription.Activity.KWHzl;
                    }
                    if (actionBar != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                    java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objKWHzl);
                    java.lang.String message = thM7380exceptionOrNullimpl != null ? thM7380exceptionOrNullimpl.getMessage() : null;
                    C5882aEp.KWHzl.KWHzl(activity.copydefault(), "verify guard error, error=" + message);
                    return new TaskDescription.Application(message);
                }
                activity = (Activity) kickOutInitialDeviceUseCase$getData$1.L$1;
                c5706aBY = (C5706aBY) kickOutInitialDeviceUseCase$getData$1.L$0;
                C56391yDq.AEQbTJ(objStartInHouseAuthentication);
            }
            java.lang.Object data = ((ResponseData) objStartInHouseAuthentication).getData();
            Intrinsics.copydefault(data);
            C5882aEp.KWHzl.KWHzl(activity.copydefault(), "start in house authentication api success");
            C5695aBN.Application application = new C5695aBN.Application(activity.AEQbTJ(), (AuthenticationStartResponse) data);
            C5695aBN c5695aBN = c5706aBY.KWHzl;
            kickOutInitialDeviceUseCase$getData$1.L$0 = c5706aBY;
            kickOutInitialDeviceUseCase$getData$1.L$1 = activity;
            kickOutInitialDeviceUseCase$getData$1.label = 2;
            objKWHzl = c5695aBN.KWHzl(application, (Continuation) kickOutInitialDeviceUseCase$getData$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            actionBar = (C5695aBN.ActionBar) (!Result.m7383isFailureimpl(objKWHzl) ? null : objKWHzl);
            if (!(actionBar instanceof C5695aBN.ActionBar.C0808ActionBar)) {
            }
        } catch (OKServerException e) {
            C5882aEp.KWHzl.KWHzl(activity.copydefault(), "kick out initial device error, code=" + e.getCode() + ", error=" + e.getMessage());
            if (e.getCode() == 3030) {
                return TaskDescription.ActionBar.copydefault;
            }
            return new TaskDescription.Application(e.getMessage());
        }
    }

    /* JADX INFO: renamed from: o.aBY$Activity */
    /* JADX INFO: loaded from: classes14.dex */
    public static final class Activity {
        public final androidx.fragment.app.Fragment AEQbTJ;
        public final java.lang.String EZpvd;
        public final java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, androidx.fragment.app.Fragment fragment, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                fragment = activity.AEQbTJ;
            }
            if ((i & 2) != 0) {
                str = activity.OLrzqt;
            }
            if ((i & 4) != 0) {
                str2 = activity.EZpvd;
            }
            return activity.copydefault(fragment, str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final androidx.fragment.app.Fragment AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity copydefault(@NotNull androidx.fragment.app.Fragment fragment, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(fragment, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new Activity(fragment, str, str2);
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
            return Intrinsics.EZpvd(this.AEQbTJ, activity.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) activity.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) activity.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.AEQbTJ.hashCode() * 31) + this.OLrzqt.hashCode()) * 31) + this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Input(fragment=" + this.AEQbTJ + ", crossDevicePasskeySessionId=" + this.OLrzqt + ", flow=" + this.EZpvd + ")";
        }

        public Activity(@NotNull androidx.fragment.app.Fragment fragment, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(fragment, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.AEQbTJ = fragment;
            this.OLrzqt = str;
            this.EZpvd = str2;
        }
    }

    /* JADX INFO: renamed from: o.aBY$TaskDescription */
    /* JADX INFO: loaded from: classes14.dex */
    public interface TaskDescription {

        /* JADX INFO: renamed from: o.aBY$TaskDescription$StateListAnimator */
        public static final class StateListAnimator implements TaskDescription {
            public static final StateListAnimator KWHzl = new StateListAnimator();

            private StateListAnimator() {
            }
        }

        /* JADX INFO: renamed from: o.aBY$TaskDescription$TaskDescription, reason: collision with other inner class name */
        public static final class C0810TaskDescription implements TaskDescription {
            public static final C0810TaskDescription KWHzl = new C0810TaskDescription();

            private C0810TaskDescription() {
            }
        }

        /* JADX INFO: renamed from: o.aBY$TaskDescription$ActionBar */
        public static final class ActionBar implements TaskDescription {
            public static final ActionBar copydefault = new ActionBar();

            private ActionBar() {
            }
        }

        /* JADX INFO: renamed from: o.aBY$TaskDescription$Activity */
        public static final class Activity implements TaskDescription {
            public static final Activity KWHzl = new Activity();

            private Activity() {
            }
        }

        /* JADX INFO: renamed from: o.aBY$TaskDescription$Application */
        public static final class Application implements TaskDescription {
            public final java.lang.String AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Application copy$default(Application application, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = application.AEQbTJ;
                }
                return application.AEQbTJ(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Application AEQbTJ(java.lang.String str) {
                return new Application(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String OLrzqt() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Application) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) ((Application) obj).AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                java.lang.String str = this.AEQbTJ;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Error(error=" + this.AEQbTJ + ")";
            }

            public Application(java.lang.String str) {
                this.AEQbTJ = str;
            }
        }
    }

    /* JADX INFO: renamed from: o.aBY$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aBY.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }
}
