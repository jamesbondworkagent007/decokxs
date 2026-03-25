package o;

import com.okinc.auth.impl.guard.domain.ActivateGuardUseCase;
import com.okinc.auth.impl.passkey.data.PasskeyApiService;
import com.okinc.auth.impl.passkey.domain.PasskeyRegistrationFido1UseCase$invoke$2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aFQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5910aFQ {
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public final C5911aFR AEQbTJ;
    public final PasskeyApiService EZpvd;
    public final CoroutineDispatcher OLrzqt;
    public final ActivateGuardUseCase copydefault;

    @yCM
    public C5910aFQ(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull PasskeyApiService passkeyApiService, @NotNull ActivateGuardUseCase activateGuardUseCase, @NotNull C5911aFR c5911aFR) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(passkeyApiService, "");
        Intrinsics.checkNotNullParameter(activateGuardUseCase, "");
        Intrinsics.checkNotNullParameter(c5911aFR, "");
        this.OLrzqt = coroutineDispatcher;
        this.EZpvd = passkeyApiService;
        this.copydefault = activateGuardUseCase;
        this.AEQbTJ = c5911aFR;
    }

    public static /* synthetic */ java.lang.Object invoke$default(C5910aFQ c5910aFQ, java.lang.String str, java.lang.String str2, AbstractC32996moC abstractC32996moC, int i, Continuation continuation, int i2, java.lang.Object obj) {
        java.lang.String str3 = (i2 & 1) != 0 ? "" : str;
        java.lang.String str4 = (i2 & 2) != 0 ? "" : str2;
        if ((i2 & 8) != 0) {
            i = 1;
        }
        return c5910aFQ.copydefault(str3, str4, abstractC32996moC, i, continuation);
    }

    public final java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull AbstractC32996moC abstractC32996moC, int i, @NotNull Continuation<? super Application> continuation) {
        return BuildersKt.withContext(this.OLrzqt, new PasskeyRegistrationFido1UseCase$invoke$2(str, str2, this, i, abstractC32996moC, null), continuation);
    }

    /* JADX INFO: renamed from: o.aFQ$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aFQ.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    /* JADX INFO: renamed from: o.aFQ$Application */
    /* JADX INFO: loaded from: classes14.dex */
    public static abstract class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aFQ.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: o.aFQ$Application$Application, reason: collision with other inner class name */
        /* JADX INFO: loaded from: classes17.dex */
        public static final class C0818Application extends Application {
            public final ActivateGuardUseCase.TaskDescription KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ActivateGuardUseCase.TaskDescription EZpvd() {
                return this.KWHzl;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0818Application(@NotNull ActivateGuardUseCase.TaskDescription taskDescription) {
                super(null);
                Intrinsics.checkNotNullParameter(taskDescription, "");
                this.KWHzl = taskDescription;
            }
        }

        private Application() {
        }

        /* JADX INFO: renamed from: o.aFQ$Application$StateListAnimator */
        /* JADX INFO: loaded from: classes17.dex */
        public static final class StateListAnimator extends Application {
            public static final StateListAnimator OLrzqt = new StateListAnimator();

            private StateListAnimator() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: o.aFQ$Application$ActionBar */
        /* JADX INFO: loaded from: classes17.dex */
        public static final class ActionBar extends Application {
            public static final ActionBar EZpvd = new ActionBar();

            private ActionBar() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: o.aFQ$Application$TaskDescription */
        /* JADX INFO: loaded from: classes17.dex */
        public static final class TaskDescription extends Application {
            public final java.lang.String KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String OLrzqt() {
                return this.KWHzl;
            }

            public TaskDescription(java.lang.String str) {
                super(null);
                this.KWHzl = str;
            }
        }
    }
}
