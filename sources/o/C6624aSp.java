package o;

import com.okinc.auth.api.reset2fa.data.model.ResetMfaInitiateRequest;
import com.okinc.auth.api.reset2fa.data.model.ResetMfaInitiateResponse;
import com.okinc.auth.impl.reset2fa.data.datasource.Reset2faRemoteDataSource;
import com.okinc.auth.impl.reset2fa.domain.reset2fa.ResetMfaInitiateUseCase$invoke$2;
import com.okinc.network.okg.cor.SubdomainStrategy;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aSp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6624aSp {
    private static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public final CoroutineDispatcher KWHzl;
    public final Reset2faRemoteDataSource copydefault;

    @yCM
    public C6624aSp(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull Reset2faRemoteDataSource reset2faRemoteDataSource) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(reset2faRemoteDataSource, "");
        this.KWHzl = coroutineDispatcher;
        this.copydefault = reset2faRemoteDataSource;
    }

    /* JADX INFO: renamed from: o.aSp$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aSp.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public final java.lang.Object EZpvd(boolean z, @NotNull ResetMfaInitiateRequest resetMfaInitiateRequest, SubdomainStrategy subdomainStrategy, @NotNull Continuation<? super Application> continuation) {
        return BuildersKt.withContext(this.KWHzl, new ResetMfaInitiateUseCase$invoke$2(z, this, subdomainStrategy, resetMfaInitiateRequest, null), continuation);
    }

    /* JADX INFO: renamed from: o.aSp$Application */
    /* JADX INFO: loaded from: classes14.dex */
    public static abstract class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aSp.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: o.aSp$Application$Activity */
        /* JADX INFO: loaded from: classes23.dex */
        public static final class Activity extends Application {
            public static final int copydefault = ResetMfaInitiateResponse.$stable;
            public final ResetMfaInitiateResponse KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Activity copy$default(Activity activity, ResetMfaInitiateResponse resetMfaInitiateResponse, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    resetMfaInitiateResponse = activity.KWHzl;
                }
                return activity.EZpvd(resetMfaInitiateResponse);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ResetMfaInitiateResponse EZpvd() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Activity EZpvd(ResetMfaInitiateResponse resetMfaInitiateResponse) {
                return new Activity(resetMfaInitiateResponse);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Activity) && Intrinsics.EZpvd(this.KWHzl, ((Activity) obj).KWHzl);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                ResetMfaInitiateResponse resetMfaInitiateResponse = this.KWHzl;
                if (resetMfaInitiateResponse == null) {
                    return 0;
                }
                return resetMfaInitiateResponse.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Success(response=" + this.KWHzl + ")";
            }

            public Activity(ResetMfaInitiateResponse resetMfaInitiateResponse) {
                super(null);
                this.KWHzl = resetMfaInitiateResponse;
            }
        }

        private Application() {
        }

        /* JADX INFO: renamed from: o.aSp$Application$ActionBar */
        /* JADX INFO: loaded from: classes23.dex */
        public static final class ActionBar extends Application {
            public final int OLrzqt;
            public final java.lang.String copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, java.lang.String str, int i, int i2, java.lang.Object obj) {
                if ((i2 & 1) != 0) {
                    str = actionBar.copydefault;
                }
                if ((i2 & 2) != 0) {
                    i = actionBar.OLrzqt;
                }
                return actionBar.EZpvd(str, i);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ActionBar EZpvd(@NotNull java.lang.String str, int i) {
                Intrinsics.checkNotNullParameter(str, "");
                return new ActionBar(str, i);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String KWHzl() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ActionBar)) {
                    return false;
                }
                ActionBar actionBar = (ActionBar) obj;
                return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) actionBar.copydefault) && this.OLrzqt == actionBar.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.copydefault.hashCode() * 31) + java.lang.Integer.hashCode(this.OLrzqt);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Error(message=" + this.copydefault + ", code=" + this.OLrzqt + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ActionBar(@NotNull java.lang.String str, int i) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.copydefault = str;
                this.OLrzqt = i;
            }
        }

        /* JADX INFO: renamed from: o.aSp$Application$TaskDescription */
        /* JADX INFO: loaded from: classes23.dex */
        public static final class TaskDescription extends Application {
            public final java.lang.String KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = taskDescription.KWHzl;
                }
                return taskDescription.KWHzl(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String KWHzl() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final TaskDescription KWHzl(@NotNull java.lang.String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new TaskDescription(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof TaskDescription) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) ((TaskDescription) obj).KWHzl);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.KWHzl.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "NetworkError(message=" + this.KWHzl + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TaskDescription(@NotNull java.lang.String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.KWHzl = str;
            }
        }

        /* JADX INFO: renamed from: o.aSp$Application$StateListAnimator */
        /* JADX INFO: loaded from: classes23.dex */
        public static final class StateListAnimator extends Application {
            public final java.lang.String OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = stateListAnimator.OLrzqt;
                }
                return stateListAnimator.AEQbTJ(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String AEQbTJ() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StateListAnimator AEQbTJ(@NotNull java.lang.String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new StateListAnimator(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StateListAnimator) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) ((StateListAnimator) obj).OLrzqt);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.OLrzqt.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "NotAllowResetAll(message=" + this.OLrzqt + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StateListAnimator(@NotNull java.lang.String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.OLrzqt = str;
            }
        }

        /* JADX INFO: renamed from: o.aSp$Application$Application, reason: collision with other inner class name */
        /* JADX INFO: loaded from: classes23.dex */
        public static final class C0822Application extends Application {
            public static final C0822Application AEQbTJ = new C0822Application();

            private C0822Application() {
                super(null);
            }
        }
    }
}
