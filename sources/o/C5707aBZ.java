package o;

import com.okinc.auth.impl.mfa.data.MfaApiService;
import com.okinc.auth.impl.mfa.domain.CreateFacialUseCase$invoke$2;
import com.okinc.auth.impl.mfa.model.MfaFailure;
import com.okinc.auth.impl.mfa.model.MfaScenario;
import com.okinc.network.okg.cor.SubdomainStrategy;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aBZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5707aBZ {
    public final MfaApiService EZpvd;
    public final CoroutineDispatcher copydefault;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;

    @yCM
    public C5707aBZ(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull MfaApiService mfaApiService) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(mfaApiService, "");
        this.copydefault = coroutineDispatcher;
        this.EZpvd = mfaApiService;
    }

    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, SubdomainStrategy subdomainStrategy, @NotNull MfaScenario mfaScenario, @NotNull Continuation<? super Activity> continuation) {
        return BuildersKt.withContext(this.copydefault, new CreateFacialUseCase$invoke$2(mfaScenario, this, subdomainStrategy, str, null), continuation);
    }

    /* JADX INFO: renamed from: o.aBZ$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aBZ.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX INFO: renamed from: o.aBZ$Activity */
    /* JADX INFO: loaded from: classes14.dex */
    public static abstract class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aBZ.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: o.aBZ$Activity$Activity, reason: collision with other inner class name */
        /* JADX INFO: loaded from: classes23.dex */
        public static final class C0811Activity extends Activity {
            public final java.lang.String copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ C0811Activity copy$default(C0811Activity c0811Activity, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = c0811Activity.copydefault;
                }
                return c0811Activity.OLrzqt(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C0811Activity OLrzqt(@NotNull java.lang.String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new C0811Activity(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String copydefault() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0811Activity) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) ((C0811Activity) obj).copydefault);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.copydefault.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Success(faceVerificationSessionId=" + this.copydefault + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0811Activity(@NotNull java.lang.String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.copydefault = str;
            }
        }

        private Activity() {
        }

        /* JADX INFO: renamed from: o.aBZ$Activity$StateListAnimator */
        /* JADX INFO: loaded from: classes23.dex */
        public static final class StateListAnimator extends Activity {
            public final MfaFailure AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, MfaFailure mfaFailure, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    mfaFailure = stateListAnimator.AEQbTJ;
                }
                return stateListAnimator.OLrzqt(mfaFailure);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final MfaFailure KWHzl() {
                return this.AEQbTJ;
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
                return (obj instanceof StateListAnimator) && Intrinsics.EZpvd(this.AEQbTJ, ((StateListAnimator) obj).AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.AEQbTJ.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Error(failureResponse=" + this.AEQbTJ + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StateListAnimator(@NotNull MfaFailure mfaFailure) {
                super(null);
                Intrinsics.checkNotNullParameter(mfaFailure, "");
                this.AEQbTJ = mfaFailure;
            }
        }
    }
}
