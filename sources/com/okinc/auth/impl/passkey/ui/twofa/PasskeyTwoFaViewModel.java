package com.okinc.auth.impl.passkey.ui.twofa;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import com.okinc.auth.impl.passkey.model.Fido2VerificationOption;
import com.okinc.auth.impl.passkey.model.GetAuthenticationTypeResponse;
import com.okinc.auth.impl.passkey.model.UnlockTokenResponse;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC33073mpa;
import o.C32989mnw;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class PasskeyTwoFaViewModel extends AbstractC33073mpa {
    public final SavedStateHandle AEQbTJ;
    public final LiveData<C32989mnw<Activity>> EZpvd;
    public final MutableLiveData<C32989mnw<Activity>> KWHzl;
    public final GetAuthenticationTypeResponse OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<Activity>> AEQbTJ() {
        return this.EZpvd;
    }

    @yCM
    public PasskeyTwoFaViewModel(@NotNull SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.AEQbTJ = savedStateHandle;
        Object obj = savedStateHandle.get("KEY_AUTH_TYPE_RESPONSE");
        this.OLrzqt = obj instanceof GetAuthenticationTypeResponse ? (GetAuthenticationTypeResponse) obj : null;
        MutableLiveData<C32989mnw<Activity>> mutableLiveData = new MutableLiveData<>();
        this.KWHzl = mutableLiveData;
        this.EZpvd = mutableLiveData;
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static abstract class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.passkey.ui.twofa.PasskeyTwoFaViewModel.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final class StateListAnimator extends ActionBar {
            public final Fido2VerificationOption copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Fido2VerificationOption OLrzqt() {
                return this.copydefault;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StateListAnimator(@NotNull Fido2VerificationOption fido2VerificationOption) {
                super(null);
                Intrinsics.checkNotNullParameter(fido2VerificationOption, "");
                this.copydefault = fido2VerificationOption;
            }
        }

        private ActionBar() {
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static abstract class Activity {

        /* JADX INFO: loaded from: classes18.dex */
        public static final class TaskDescription extends Activity {
            public final boolean AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean copydefault() {
                return this.AEQbTJ;
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.passkey.ui.twofa.PasskeyTwoFaViewModel.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public static final class FragmentManager extends Activity {
            public final String EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String AEQbTJ() {
                return this.EZpvd;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FragmentManager(@NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.EZpvd = str;
            }
        }

        public static final class StateListAnimator extends Activity {
            public final List<Fido2VerificationOption> copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<Fido2VerificationOption> EZpvd() {
                return this.copydefault;
            }

            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.okinc.auth.impl.passkey.model.Fido2VerificationOption> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public StateListAnimator(@NotNull List<? extends Fido2VerificationOption> list) {
                super(null);
                Intrinsics.checkNotNullParameter(list, "");
                this.copydefault = list;
            }
        }

        public static final class Application extends Activity {
            public final Fido2VerificationOption KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Fido2VerificationOption copydefault() {
                return this.KWHzl;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Application(@NotNull Fido2VerificationOption fido2VerificationOption) {
                super(null);
                Intrinsics.checkNotNullParameter(fido2VerificationOption, "");
                this.KWHzl = fido2VerificationOption;
            }
        }

        public static final class ActionBar extends Activity {
            public static final ActionBar OLrzqt = new ActionBar();

            private ActionBar() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.okinc.auth.impl.passkey.ui.twofa.PasskeyTwoFaViewModel$Activity$Activity, reason: collision with other inner class name */
        public static final class C0241Activity extends Activity {
            public final UnlockTokenResponse AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final UnlockTokenResponse AEQbTJ() {
                return this.AEQbTJ;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0241Activity(@NotNull UnlockTokenResponse unlockTokenResponse) {
                super(null);
                Intrinsics.checkNotNullParameter(unlockTokenResponse, "");
                this.AEQbTJ = unlockTokenResponse;
            }
        }
    }

    public final void OLrzqt() {
        GetAuthenticationTypeResponse getAuthenticationTypeResponse = this.OLrzqt;
        if (getAuthenticationTypeResponse != null) {
            List<Fido2VerificationOption> fido2VerificationOption = getAuthenticationTypeResponse.toFido2VerificationOption();
            if (fido2VerificationOption.size() == 1) {
                this.KWHzl.setValue(new C32989mnw<>(new Activity.Application((Fido2VerificationOption) CollectionsKt___CollectionsKt.AuCTelauCTel(fido2VerificationOption))));
                return;
            } else {
                this.KWHzl.setValue(new C32989mnw<>(new Activity.StateListAnimator(fido2VerificationOption)));
                return;
            }
        }
        this.KWHzl.setValue(new C32989mnw<>(new Activity.FragmentManager("_missing response")));
        this.KWHzl.setValue(new C32989mnw<>(Activity.ActionBar.OLrzqt));
    }

    public final void KWHzl(@NotNull ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        if (!(actionBar instanceof ActionBar.StateListAnimator)) {
            throw new NoWhenBranchMatchedException();
        }
        this.KWHzl.setValue(new C32989mnw<>(new Activity.Application(((ActionBar.StateListAnimator) actionBar).OLrzqt())));
    }

    public final void copydefault(UnlockTokenResponse unlockTokenResponse) {
        if (unlockTokenResponse != null) {
            this.KWHzl.setValue(new C32989mnw<>(new Activity.C0241Activity(unlockTokenResponse)));
        } else {
            this.KWHzl.setValue(new C32989mnw<>(new Activity.FragmentManager("_missing unlock token response")));
            this.KWHzl.setValue(new C32989mnw<>(Activity.ActionBar.OLrzqt));
        }
    }
}
