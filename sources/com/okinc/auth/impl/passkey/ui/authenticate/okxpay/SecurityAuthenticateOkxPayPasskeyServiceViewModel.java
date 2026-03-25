package com.okinc.auth.impl.passkey.ui.authenticate.okxpay;

import android.app.PendingIntent;
import androidx.lifecycle.ViewModelKt;
import com.okinc.auth.api.passkey.PasskeyAuthenticateRequest;
import com.okinc.auth.api.passkey.PasskeySdkResult;
import com.okinc.auth.api.passkey.PasskeyState;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import o.AbstractC33073mpa;
import o.C5902aFI;
import o.InterfaceC8196ayF;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class SecurityAuthenticateOkxPayPasskeyServiceViewModel extends AbstractC33073mpa {
    public final SharedFlow<String> AEQbTJ;
    public final InterfaceC8196ayF AYXKKw;
    public final MutableSharedFlow<TaskDescription> EZpvd;
    public final C5902aFI KWHzl;
    public final SharedFlow<TaskDescription> OLrzqt;
    public final MutableSharedFlow<String> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<String> EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<TaskDescription> copydefault() {
        return this.OLrzqt;
    }

    @yCM
    public SecurityAuthenticateOkxPayPasskeyServiceViewModel(@NotNull InterfaceC8196ayF interfaceC8196ayF, @NotNull C5902aFI c5902aFI) {
        Intrinsics.checkNotNullParameter(interfaceC8196ayF, "");
        Intrinsics.checkNotNullParameter(c5902aFI, "");
        this.AYXKKw = interfaceC8196ayF;
        this.KWHzl = c5902aFI;
        MutableSharedFlow<TaskDescription> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.EZpvd = mutableSharedFlowMutableSharedFlow$default;
        this.OLrzqt = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableSharedFlow<String> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.copydefault = mutableSharedFlowMutableSharedFlow$default2;
        this.AEQbTJ = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static abstract class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.passkey.ui.authenticate.okxpay.SecurityAuthenticateOkxPayPasskeyServiceViewModel.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: loaded from: classes17.dex */
        public static final class StateListAnimator extends TaskDescription {
            public final boolean EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = stateListAnimator.EZpvd;
                }
                return stateListAnimator.EZpvd(z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean AEQbTJ() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StateListAnimator EZpvd(boolean z) {
                return new StateListAnimator(z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StateListAnimator) && this.EZpvd == ((StateListAnimator) obj).EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return Boolean.hashCode(this.EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Loading(show=" + this.EZpvd + ")";
            }

            public StateListAnimator(boolean z) {
                super(null);
                this.EZpvd = z;
            }
        }

        private TaskDescription() {
        }

        /* JADX INFO: loaded from: classes17.dex */
        public static final class Activity extends TaskDescription {
            public final PendingIntent copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Activity copy$default(Activity activity, PendingIntent pendingIntent, int i, Object obj) {
                if ((i & 1) != 0) {
                    pendingIntent = activity.copydefault;
                }
                return activity.AEQbTJ(pendingIntent);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Activity AEQbTJ(@NotNull PendingIntent pendingIntent) {
                Intrinsics.checkNotNullParameter(pendingIntent, "");
                return new Activity(pendingIntent);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final PendingIntent copydefault() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Activity) && Intrinsics.EZpvd(this.copydefault, ((Activity) obj).copydefault);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.copydefault.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "StartSignInIntent(signInPendingIntent=" + this.copydefault + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Activity(@NotNull PendingIntent pendingIntent) {
                super(null);
                Intrinsics.checkNotNullParameter(pendingIntent, "");
                this.copydefault = pendingIntent;
            }
        }

        /* JADX INFO: loaded from: classes17.dex */
        public static final class ActionBar extends TaskDescription {
            public static final int EZpvd = PasskeyState.$stable;
            public final PasskeyState OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, PasskeyState passkeyState, int i, Object obj) {
                if ((i & 1) != 0) {
                    passkeyState = actionBar.OLrzqt;
                }
                return actionBar.copydefault(passkeyState);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final PasskeyState EZpvd() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ActionBar copydefault(@NotNull PasskeyState passkeyState) {
                Intrinsics.checkNotNullParameter(passkeyState, "");
                return new ActionBar(passkeyState);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ActionBar) && Intrinsics.EZpvd(this.OLrzqt, ((ActionBar) obj).OLrzqt);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.OLrzqt.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "FinishWithResultOk(response=" + this.OLrzqt + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ActionBar(@NotNull PasskeyState passkeyState) {
                super(null);
                Intrinsics.checkNotNullParameter(passkeyState, "");
                this.OLrzqt = passkeyState;
            }
        }
    }

    public final Object copydefault(@NotNull Continuation<? super PasskeyState> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new SecurityAuthenticateOkxPayPasskeyServiceViewModel$checkPasskey$2(this, null), continuation);
    }

    public final Job OLrzqt(@NotNull PasskeyAuthenticateRequest passkeyAuthenticateRequest) {
        Intrinsics.checkNotNullParameter(passkeyAuthenticateRequest, "");
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SecurityAuthenticateOkxPayPasskeyServiceViewModel$startAuthenticate$1(this, passkeyAuthenticateRequest, null), 3, null);
    }

    public final Job AEQbTJ(@NotNull PasskeySdkResult passkeySdkResult) {
        Intrinsics.checkNotNullParameter(passkeySdkResult, "");
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SecurityAuthenticateOkxPayPasskeyServiceViewModel$postSignInResponse$1(passkeySdkResult, this, null), 3, null);
    }
}
