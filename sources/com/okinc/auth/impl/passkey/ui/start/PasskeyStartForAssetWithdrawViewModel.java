package com.okinc.auth.impl.passkey.ui.start;

import androidx.lifecycle.ViewModelKt;
import com.okinc.auth.api.passkey.PasskeyAuthenticateState;
import com.okinc.auth.api.passkey.PasskeyRegisterState;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import o.AbstractC33073mpa;
import o.InterfaceC8108awX;
import o.InterfaceC8196ayF;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class PasskeyStartForAssetWithdrawViewModel extends AbstractC33073mpa {
    public final SharedFlow<ActionBar> EZpvd;
    public final MutableSharedFlow<ActionBar> KWHzl;
    public final InterfaceC8108awX OLrzqt;
    public final InterfaceC8196ayF copydefault;
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<ActionBar> OLrzqt() {
        return this.EZpvd;
    }

    @yCM
    public PasskeyStartForAssetWithdrawViewModel(@NotNull InterfaceC8196ayF interfaceC8196ayF, @NotNull InterfaceC8108awX interfaceC8108awX) {
        Intrinsics.checkNotNullParameter(interfaceC8196ayF, "");
        Intrinsics.checkNotNullParameter(interfaceC8108awX, "");
        this.copydefault = interfaceC8196ayF;
        this.OLrzqt = interfaceC8108awX;
        MutableSharedFlow<ActionBar> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.KWHzl = mutableSharedFlowMutableSharedFlow$default;
        this.EZpvd = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.passkey.ui.start.PasskeyStartForAssetWithdrawViewModel.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static abstract class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.passkey.ui.start.PasskeyStartForAssetWithdrawViewModel.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: loaded from: classes23.dex */
        public static final class TaskDescription extends ActionBar {
            public final boolean KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = taskDescription.KWHzl;
                }
                return taskDescription.OLrzqt(z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean AEQbTJ() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final TaskDescription OLrzqt(boolean z) {
                return new TaskDescription(z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof TaskDescription) && this.KWHzl == ((TaskDescription) obj).KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return Boolean.hashCode(this.KWHzl);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Loading(show=" + this.KWHzl + ")";
            }

            public TaskDescription(boolean z) {
                super(null);
                this.KWHzl = z;
            }
        }

        private ActionBar() {
        }

        /* JADX INFO: loaded from: classes23.dex */
        public static final class Application extends ActionBar {
            public static final Application copydefault = new Application();

            private Application() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.okinc.auth.impl.passkey.ui.start.PasskeyStartForAssetWithdrawViewModel$ActionBar$ActionBar, reason: collision with other inner class name */
        /* JADX INFO: loaded from: classes23.dex */
        public static final class C0240ActionBar extends ActionBar {
            public static final C0240ActionBar copydefault = new C0240ActionBar();

            private C0240ActionBar() {
                super(null);
            }
        }

        /* JADX INFO: loaded from: classes23.dex */
        public static final class StateListAnimator extends ActionBar {
            public static final int copydefault = PasskeyRegisterState.$stable;
            public final PasskeyRegisterState OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, PasskeyRegisterState passkeyRegisterState, int i, Object obj) {
                if ((i & 1) != 0) {
                    passkeyRegisterState = stateListAnimator.OLrzqt;
                }
                return stateListAnimator.OLrzqt(passkeyRegisterState);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final PasskeyRegisterState AEQbTJ() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StateListAnimator OLrzqt(@NotNull PasskeyRegisterState passkeyRegisterState) {
                Intrinsics.checkNotNullParameter(passkeyRegisterState, "");
                return new StateListAnimator(passkeyRegisterState);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
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
            public String toString() {
                return "FinishRegisterWithResultOk(response=" + this.OLrzqt + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StateListAnimator(@NotNull PasskeyRegisterState passkeyRegisterState) {
                super(null);
                Intrinsics.checkNotNullParameter(passkeyRegisterState, "");
                this.OLrzqt = passkeyRegisterState;
            }
        }

        /* JADX INFO: loaded from: classes23.dex */
        public static final class Activity extends ActionBar {
            public static final int OLrzqt = PasskeyAuthenticateState.$stable;
            public final PasskeyAuthenticateState AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Activity copy$default(Activity activity, PasskeyAuthenticateState passkeyAuthenticateState, int i, Object obj) {
                if ((i & 1) != 0) {
                    passkeyAuthenticateState = activity.AEQbTJ;
                }
                return activity.EZpvd(passkeyAuthenticateState);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Activity EZpvd(@NotNull PasskeyAuthenticateState passkeyAuthenticateState) {
                Intrinsics.checkNotNullParameter(passkeyAuthenticateState, "");
                return new Activity(passkeyAuthenticateState);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final PasskeyAuthenticateState OLrzqt() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Activity) && Intrinsics.EZpvd(this.AEQbTJ, ((Activity) obj).AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.AEQbTJ.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "FinishAuthenticateWithResultOk(response=" + this.AEQbTJ + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Activity(@NotNull PasskeyAuthenticateState passkeyAuthenticateState) {
                super(null);
                Intrinsics.checkNotNullParameter(passkeyAuthenticateState, "");
                this.AEQbTJ = passkeyAuthenticateState;
            }
        }
    }

    public final Job AEQbTJ() {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PasskeyStartForAssetWithdrawViewModel$runPreStartPasskeyChecking$1(this, null), 3, null);
    }

    public final Job AEQbTJ(@NotNull PasskeyRegisterState passkeyRegisterState) {
        Intrinsics.checkNotNullParameter(passkeyRegisterState, "");
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PasskeyStartForAssetWithdrawViewModel$postRegister$1(passkeyRegisterState, this, null), 3, null);
    }

    public final Job KWHzl(@NotNull PasskeyAuthenticateState passkeyAuthenticateState) {
        Intrinsics.checkNotNullParameter(passkeyAuthenticateState, "");
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PasskeyStartForAssetWithdrawViewModel$postAuthenticate$1(passkeyAuthenticateState, this, null), 3, null);
    }
}
