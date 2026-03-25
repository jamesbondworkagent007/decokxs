package o;

import com.okinc.auth.impl.passkey.domain.PasskeyRegistrationFido1v2UseCase$invoke$2;
import com.okinc.auth.impl.passkey.model.RegistrationFinishBody;
import com.okinc.auth.impl.passkey.model.RegistrationStartResponse;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import o.InterfaceC5693aBL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aFR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5911aFR {
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public final CoroutineDispatcher AEQbTJ;
    public final C5691aBJ KWHzl;
    public final InterfaceC58880zSu copydefault;

    @yCM
    public C5911aFR(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C5691aBJ c5691aBJ, @NotNull InterfaceC58880zSu interfaceC58880zSu) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c5691aBJ, "");
        Intrinsics.checkNotNullParameter(interfaceC58880zSu, "");
        this.AEQbTJ = coroutineDispatcher;
        this.KWHzl = c5691aBJ;
        this.copydefault = interfaceC58880zSu;
    }

    public static /* synthetic */ java.lang.Object invoke$default(C5911aFR c5911aFR, android.content.Context context, RegistrationStartResponse registrationStartResponse, boolean z, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return c5911aFR.copydefault(context, registrationStartResponse, z, continuation);
    }

    public final java.lang.Object copydefault(@NotNull android.content.Context context, @NotNull RegistrationStartResponse registrationStartResponse, boolean z, @NotNull Continuation<? super Application> continuation) {
        return BuildersKt.withContext(this.AEQbTJ, new PasskeyRegistrationFido1v2UseCase$invoke$2(this, registrationStartResponse, context, z, null), continuation);
    }

    /* JADX INFO: renamed from: o.aFR$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aFR.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    /* JADX INFO: renamed from: o.aFR$Application */
    /* JADX INFO: loaded from: classes14.dex */
    public static abstract class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aFR.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: o.aFR$Application$ActionBar */
        /* JADX INFO: loaded from: classes17.dex */
        public static final class ActionBar extends Application {
            public final RegistrationFinishBody OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final RegistrationFinishBody KWHzl() {
                return this.OLrzqt;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ActionBar(@NotNull RegistrationFinishBody registrationFinishBody) {
                super(null);
                Intrinsics.checkNotNullParameter(registrationFinishBody, "");
                this.OLrzqt = registrationFinishBody;
            }
        }

        private Application() {
        }

        /* JADX INFO: renamed from: o.aFR$Application$Application, reason: collision with other inner class name */
        /* JADX INFO: loaded from: classes17.dex */
        public static final class C0819Application extends Application {
            public static final C0819Application AEQbTJ = new C0819Application();

            private C0819Application() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: o.aFR$Application$Activity */
        /* JADX INFO: loaded from: classes17.dex */
        public static final class Activity extends Application {
            public static final Activity OLrzqt = new Activity();

            private Activity() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: o.aFR$Application$TaskDescription */
        /* JADX INFO: loaded from: classes17.dex */
        public static final class TaskDescription extends Application {
            public final InterfaceC5693aBL.StateListAnimator EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, InterfaceC5693aBL.StateListAnimator stateListAnimator, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    stateListAnimator = taskDescription.EZpvd;
                }
                return taskDescription.copydefault(stateListAnimator);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final InterfaceC5693aBL.StateListAnimator EZpvd() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final TaskDescription copydefault(@NotNull InterfaceC5693aBL.StateListAnimator stateListAnimator) {
                Intrinsics.checkNotNullParameter(stateListAnimator, "");
                return new TaskDescription(stateListAnimator);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof TaskDescription) && Intrinsics.EZpvd(this.EZpvd, ((TaskDescription) obj).EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.EZpvd.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "AuthBiometricError(error=" + this.EZpvd + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TaskDescription(@NotNull InterfaceC5693aBL.StateListAnimator stateListAnimator) {
                super(null);
                Intrinsics.checkNotNullParameter(stateListAnimator, "");
                this.EZpvd = stateListAnimator;
            }
        }

        /* JADX INFO: renamed from: o.aFR$Application$StateListAnimator */
        /* JADX INFO: loaded from: classes17.dex */
        public static final class StateListAnimator extends Application {
            public final java.lang.String AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = stateListAnimator.AEQbTJ;
                }
                return stateListAnimator.KWHzl(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String KWHzl() {
                return this.AEQbTJ;
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
                return (obj instanceof StateListAnimator) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) ((StateListAnimator) obj).AEQbTJ);
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
                return "UnknownError(message=" + this.AEQbTJ + ")";
            }

            public StateListAnimator(java.lang.String str) {
                super(null);
                this.AEQbTJ = str;
            }
        }
    }
}
