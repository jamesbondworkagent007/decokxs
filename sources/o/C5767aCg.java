package o;

import androidx.credentials.GetPublicKeyCredentialOption;
import com.google.android.gms.fido.fido2.Fido2ApiClient;
import com.google.android.gms.tasks.Task;
import com.okinc.auth.impl.mfa.domain.MfaStartPasskeyAuthenticateUseCase$fido2AndCredentialManagerHandling$1;
import com.okinc.auth.impl.mfa.domain.MfaStartPasskeyAuthenticateUseCase$invoke$2;
import com.okinc.auth.impl.mfa.model.MfaFailure;
import com.okinc.auth.impl.passkey.model.AuthenticationStartResponse;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aCg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5767aCg {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public final InterfaceC8196ayF AEQbTJ;
    public final Fido2ApiClient EZpvd;
    public final C5941aFv KWHzl;
    public final CoroutineDispatcher OLrzqt;

    @yCM
    public C5767aCg(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull Fido2ApiClient fido2ApiClient, @NotNull InterfaceC8196ayF interfaceC8196ayF, @NotNull C5941aFv c5941aFv) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(fido2ApiClient, "");
        Intrinsics.checkNotNullParameter(interfaceC8196ayF, "");
        Intrinsics.checkNotNullParameter(c5941aFv, "");
        this.OLrzqt = coroutineDispatcher;
        this.EZpvd = fido2ApiClient;
        this.AEQbTJ = interfaceC8196ayF;
        this.KWHzl = c5941aFv;
    }

    public static /* synthetic */ java.lang.Object invoke$default(C5767aCg c5767aCg, boolean z, AuthenticationStartResponse authenticationStartResponse, boolean z2, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        return c5767aCg.KWHzl(z, authenticationStartResponse, z2, continuation);
    }

    public final java.lang.Object KWHzl(boolean z, @NotNull AuthenticationStartResponse authenticationStartResponse, boolean z2, @NotNull Continuation<? super ActionBar> continuation) {
        return BuildersKt.withContext(this.OLrzqt, new MfaStartPasskeyAuthenticateUseCase$invoke$2(authenticationStartResponse, z2, this, z, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x009d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(AuthenticationStartResponse authenticationStartResponse, boolean z, Continuation<? super ActionBar> continuation) throws java.lang.Exception {
        MfaStartPasskeyAuthenticateUseCase$fido2AndCredentialManagerHandling$1 mfaStartPasskeyAuthenticateUseCase$fido2AndCredentialManagerHandling$1;
        C5767aCg c5767aCg;
        AuthenticationStartResponse authenticationStartResponse2;
        if (continuation instanceof MfaStartPasskeyAuthenticateUseCase$fido2AndCredentialManagerHandling$1) {
            mfaStartPasskeyAuthenticateUseCase$fido2AndCredentialManagerHandling$1 = (MfaStartPasskeyAuthenticateUseCase$fido2AndCredentialManagerHandling$1) continuation;
            int i = mfaStartPasskeyAuthenticateUseCase$fido2AndCredentialManagerHandling$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mfaStartPasskeyAuthenticateUseCase$fido2AndCredentialManagerHandling$1.label = i - Integer.MIN_VALUE;
            } else {
                mfaStartPasskeyAuthenticateUseCase$fido2AndCredentialManagerHandling$1 = new MfaStartPasskeyAuthenticateUseCase$fido2AndCredentialManagerHandling$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = mfaStartPasskeyAuthenticateUseCase$fido2AndCredentialManagerHandling$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = mfaStartPasskeyAuthenticateUseCase$fido2AndCredentialManagerHandling$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            if (!z) {
                C5941aFv c5941aFv = this.KWHzl;
                mfaStartPasskeyAuthenticateUseCase$fido2AndCredentialManagerHandling$1.L$0 = this;
                mfaStartPasskeyAuthenticateUseCase$fido2AndCredentialManagerHandling$1.L$1 = authenticationStartResponse;
                mfaStartPasskeyAuthenticateUseCase$fido2AndCredentialManagerHandling$1.label = 1;
                objCopydefault = c5941aFv.copydefault(mfaStartPasskeyAuthenticateUseCase$fido2AndCredentialManagerHandling$1);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
                c5767aCg = this;
                authenticationStartResponse2 = authenticationStartResponse;
            } else {
                c5767aCg = this;
                authenticationStartResponse2 = authenticationStartResponse;
                Task<android.app.PendingIntent> signPendingIntent = c5767aCg.EZpvd.getSignPendingIntent(authenticationStartResponse2.toPublicKeyCredentialRequestOptions());
                Intrinsics.checkNotNullExpressionValue(signPendingIntent, "");
                mfaStartPasskeyAuthenticateUseCase$fido2AndCredentialManagerHandling$1.L$0 = null;
                mfaStartPasskeyAuthenticateUseCase$fido2AndCredentialManagerHandling$1.L$1 = null;
                mfaStartPasskeyAuthenticateUseCase$fido2AndCredentialManagerHandling$1.label = 2;
                objCopydefault = C6617aSi.EZpvd(signPendingIntent, mfaStartPasskeyAuthenticateUseCase$fido2AndCredentialManagerHandling$1);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
                Intrinsics.checkNotNullExpressionValue(objCopydefault, "");
                return new ActionBar.FragmentManager((android.app.PendingIntent) objCopydefault);
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objCopydefault);
                Intrinsics.checkNotNullExpressionValue(objCopydefault, "");
                return new ActionBar.FragmentManager((android.app.PendingIntent) objCopydefault);
            }
            authenticationStartResponse2 = (AuthenticationStartResponse) mfaStartPasskeyAuthenticateUseCase$fido2AndCredentialManagerHandling$1.L$1;
            c5767aCg = (C5767aCg) mfaStartPasskeyAuthenticateUseCase$fido2AndCredentialManagerHandling$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
        }
        if (((java.lang.Boolean) objCopydefault).booleanValue()) {
            AuthenticationStartResponse.PublicKey publicKey = authenticationStartResponse2.getPublicKey();
            java.lang.String strEZpvd = publicKey != null ? C33488mxR.EZpvd(publicKey) : null;
            return new ActionBar.LoaderManager(new GetPublicKeyCredentialOption(strEZpvd == null ? "" : strEZpvd, (byte[]) null, (java.util.Set) null, 6, (DefaultConstructorMarker) null));
        }
        Task<android.app.PendingIntent> signPendingIntent2 = c5767aCg.EZpvd.getSignPendingIntent(authenticationStartResponse2.toPublicKeyCredentialRequestOptions());
        Intrinsics.checkNotNullExpressionValue(signPendingIntent2, "");
        mfaStartPasskeyAuthenticateUseCase$fido2AndCredentialManagerHandling$1.L$0 = null;
        mfaStartPasskeyAuthenticateUseCase$fido2AndCredentialManagerHandling$1.L$1 = null;
        mfaStartPasskeyAuthenticateUseCase$fido2AndCredentialManagerHandling$1.label = 2;
        objCopydefault = C6617aSi.EZpvd(signPendingIntent2, mfaStartPasskeyAuthenticateUseCase$fido2AndCredentialManagerHandling$1);
        if (objCopydefault == objCopydefault2) {
        }
        Intrinsics.checkNotNullExpressionValue(objCopydefault, "");
        return new ActionBar.FragmentManager((android.app.PendingIntent) objCopydefault);
    }

    /* JADX INFO: renamed from: o.aCg$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aCg.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    /* JADX INFO: renamed from: o.aCg$ActionBar */
    /* JADX INFO: loaded from: classes14.dex */
    public static abstract class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aCg.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        /* JADX INFO: renamed from: o.aCg$ActionBar$FragmentManager */
        public static final class FragmentManager extends ActionBar {
            public final android.app.PendingIntent KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ FragmentManager copy$default(FragmentManager fragmentManager, android.app.PendingIntent pendingIntent, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    pendingIntent = fragmentManager.KWHzl;
                }
                return fragmentManager.EZpvd(pendingIntent);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final android.app.PendingIntent AEQbTJ() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final FragmentManager EZpvd(@NotNull android.app.PendingIntent pendingIntent) {
                Intrinsics.checkNotNullParameter(pendingIntent, "");
                return new FragmentManager(pendingIntent);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof FragmentManager) && Intrinsics.EZpvd(this.KWHzl, ((FragmentManager) obj).KWHzl);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.KWHzl.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "SuccessWithFido2(pendingIntent=" + this.KWHzl + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FragmentManager(@NotNull android.app.PendingIntent pendingIntent) {
                super(null);
                Intrinsics.checkNotNullParameter(pendingIntent, "");
                this.KWHzl = pendingIntent;
            }
        }

        /* JADX INFO: renamed from: o.aCg$ActionBar$LoaderManager */
        public static final class LoaderManager extends ActionBar {
            public final GetPublicKeyCredentialOption EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ LoaderManager copy$default(LoaderManager loaderManager, GetPublicKeyCredentialOption getPublicKeyCredentialOption, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    getPublicKeyCredentialOption = loaderManager.EZpvd;
                }
                return loaderManager.KWHzl(getPublicKeyCredentialOption);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final GetPublicKeyCredentialOption KWHzl() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final LoaderManager KWHzl(@NotNull GetPublicKeyCredentialOption getPublicKeyCredentialOption) {
                Intrinsics.checkNotNullParameter(getPublicKeyCredentialOption, "");
                return new LoaderManager(getPublicKeyCredentialOption);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LoaderManager) && Intrinsics.EZpvd(this.EZpvd, ((LoaderManager) obj).EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.EZpvd.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "SuccessWithCredentialManager(credentialOption=" + this.EZpvd + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public LoaderManager(@NotNull GetPublicKeyCredentialOption getPublicKeyCredentialOption) {
                super(null);
                Intrinsics.checkNotNullParameter(getPublicKeyCredentialOption, "");
                this.EZpvd = getPublicKeyCredentialOption;
            }
        }

        /* JADX INFO: renamed from: o.aCg$ActionBar$PendingIntent */
        /* JADX INFO: loaded from: classes23.dex */
        public static final class PendingIntent extends ActionBar {
            public final AuthenticationStartResponse AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ PendingIntent copy$default(PendingIntent pendingIntent, AuthenticationStartResponse authenticationStartResponse, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    authenticationStartResponse = pendingIntent.AEQbTJ;
                }
                return pendingIntent.AEQbTJ(authenticationStartResponse);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final PendingIntent AEQbTJ(@NotNull AuthenticationStartResponse authenticationStartResponse) {
                Intrinsics.checkNotNullParameter(authenticationStartResponse, "");
                return new PendingIntent(authenticationStartResponse);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PendingIntent) && Intrinsics.EZpvd(this.AEQbTJ, ((PendingIntent) obj).AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.AEQbTJ.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "StartFido1(authStartResponse=" + this.AEQbTJ + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PendingIntent(@NotNull AuthenticationStartResponse authenticationStartResponse) {
                super(null);
                Intrinsics.checkNotNullParameter(authenticationStartResponse, "");
                this.AEQbTJ = authenticationStartResponse;
            }
        }

        /* JADX INFO: renamed from: o.aCg$ActionBar$Application */
        /* JADX INFO: loaded from: classes23.dex */
        public static final class Application extends ActionBar {
            public static final Application OLrzqt = new Application();

            private Application() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: o.aCg$ActionBar$Activity */
        /* JADX INFO: loaded from: classes23.dex */
        public static final class Activity extends ActionBar {
            public static final Activity AEQbTJ = new Activity();

            private Activity() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: o.aCg$ActionBar$TaskDescription */
        /* JADX INFO: loaded from: classes23.dex */
        public static final class TaskDescription extends ActionBar {
            public static final TaskDescription KWHzl = new TaskDescription();

            private TaskDescription() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: o.aCg$ActionBar$ActionBar, reason: collision with other inner class name */
        /* JADX INFO: loaded from: classes23.dex */
        public static final class C0814ActionBar extends ActionBar {
            public static final C0814ActionBar KWHzl = new C0814ActionBar();

            private C0814ActionBar() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: o.aCg$ActionBar$StateListAnimator */
        /* JADX INFO: loaded from: classes23.dex */
        public static final class StateListAnimator extends ActionBar {
            public final MfaFailure KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, MfaFailure mfaFailure, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    mfaFailure = stateListAnimator.KWHzl;
                }
                return stateListAnimator.OLrzqt(mfaFailure);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final MfaFailure EZpvd() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StateListAnimator OLrzqt(@NotNull MfaFailure mfaFailure) {
                Intrinsics.checkNotNullParameter(mfaFailure, "");
                return new StateListAnimator(mfaFailure);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StateListAnimator) && Intrinsics.EZpvd(this.KWHzl, ((StateListAnimator) obj).KWHzl);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.KWHzl.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Error(mfaFailure=" + this.KWHzl + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StateListAnimator(@NotNull MfaFailure mfaFailure) {
                super(null);
                Intrinsics.checkNotNullParameter(mfaFailure, "");
                this.KWHzl = mfaFailure;
            }
        }
    }
}
