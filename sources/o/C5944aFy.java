package o;

import com.okinc.auth.impl.passkey.data.PasskeyApiService;
import com.okinc.auth.impl.passkey.domain.DexPasskeyRegistrationPreconditionUseCase$invoke$2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aFy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5944aFy {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public final CoroutineDispatcher EZpvd;
    public final PasskeyApiService OLrzqt;

    @yCM
    public C5944aFy(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull PasskeyApiService passkeyApiService) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(passkeyApiService, "");
        this.EZpvd = coroutineDispatcher;
        this.OLrzqt = passkeyApiService;
    }

    public final java.lang.Object OLrzqt(@NotNull Continuation<? super ActionBar> continuation) {
        return BuildersKt.withContext(this.EZpvd, new DexPasskeyRegistrationPreconditionUseCase$invoke$2(this, null), continuation);
    }

    /* JADX INFO: renamed from: o.aFy$ActionBar */
    /* JADX INFO: loaded from: classes14.dex */
    public static abstract class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aFy.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: o.aFy$ActionBar$StateListAnimator */
        /* JADX INFO: loaded from: classes17.dex */
        public static final class StateListAnimator extends ActionBar {
            public static final StateListAnimator EZpvd = new StateListAnimator();

            private StateListAnimator() {
                super(null);
            }
        }

        private ActionBar() {
        }

        /* JADX INFO: renamed from: o.aFy$ActionBar$TaskDescription */
        /* JADX INFO: loaded from: classes17.dex */
        public static final class TaskDescription extends ActionBar {
            public final java.lang.String OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String AEQbTJ() {
                return this.OLrzqt;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TaskDescription(@NotNull java.lang.String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.OLrzqt = str;
            }
        }

        /* JADX INFO: renamed from: o.aFy$ActionBar$Application */
        /* JADX INFO: loaded from: classes17.dex */
        public static final class Application extends ActionBar {
            public final java.lang.String copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String EZpvd() {
                return this.copydefault;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Application(@NotNull java.lang.String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.copydefault = str;
            }
        }

        /* JADX INFO: renamed from: o.aFy$ActionBar$ActionBar, reason: collision with other inner class name */
        /* JADX INFO: loaded from: classes17.dex */
        public static final class C0820ActionBar extends ActionBar {
            public final java.lang.Exception AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.Exception OLrzqt() {
                return this.AEQbTJ;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0820ActionBar(@NotNull java.lang.Exception exc) {
                super(null);
                Intrinsics.checkNotNullParameter(exc, "");
                this.AEQbTJ = exc;
            }
        }
    }

    /* JADX INFO: renamed from: o.aFy$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aFy.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }
}
