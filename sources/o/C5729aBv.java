package o;

import com.okinc.auth.api.facerecognition.FacialRecognitionRequest;
import com.okinc.auth.impl.facerecognition.data.FaceRecognitionApiService;
import com.okinc.auth.impl.facerecognition.domain.FaceRecognitionCreateSessionUseCase$invoke$2;
import com.okinc.auth.impl.facerecognition.model.FaceVerifyCreateSessionResponse;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aBv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5729aBv {
    public final FaceRecognitionApiService EZpvd;
    public final CoroutineDispatcher KWHzl;

    @yCM
    public C5729aBv(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull FaceRecognitionApiService faceRecognitionApiService) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(faceRecognitionApiService, "");
        this.KWHzl = coroutineDispatcher;
        this.EZpvd = faceRecognitionApiService;
    }

    public final java.lang.Object AEQbTJ(@NotNull FacialRecognitionRequest facialRecognitionRequest, @NotNull Continuation<? super Activity> continuation) {
        return BuildersKt.withContext(this.KWHzl, new FaceRecognitionCreateSessionUseCase$invoke$2(this, facialRecognitionRequest, null), continuation);
    }

    /* JADX INFO: renamed from: o.aBv$Activity */
    /* JADX INFO: loaded from: classes14.dex */
    public static abstract class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aBv.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: o.aBv$Activity$ActionBar */
        /* JADX INFO: loaded from: classes22.dex */
        public static final class ActionBar extends Activity {
            public final FaceVerifyCreateSessionResponse copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, FaceVerifyCreateSessionResponse faceVerifyCreateSessionResponse, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    faceVerifyCreateSessionResponse = actionBar.copydefault;
                }
                return actionBar.AEQbTJ(faceVerifyCreateSessionResponse);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ActionBar AEQbTJ(@NotNull FaceVerifyCreateSessionResponse faceVerifyCreateSessionResponse) {
                Intrinsics.checkNotNullParameter(faceVerifyCreateSessionResponse, "");
                return new ActionBar(faceVerifyCreateSessionResponse);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final FaceVerifyCreateSessionResponse OLrzqt() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ActionBar) && Intrinsics.EZpvd(this.copydefault, ((ActionBar) obj).copydefault);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.copydefault.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Success(response=" + this.copydefault + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ActionBar(@NotNull FaceVerifyCreateSessionResponse faceVerifyCreateSessionResponse) {
                super(null);
                Intrinsics.checkNotNullParameter(faceVerifyCreateSessionResponse, "");
                this.copydefault = faceVerifyCreateSessionResponse;
            }
        }

        private Activity() {
        }

        /* JADX INFO: renamed from: o.aBv$Activity$StateListAnimator */
        /* JADX INFO: loaded from: classes22.dex */
        public static final class StateListAnimator extends Activity {
            public final FaceVerifyCreateSessionResponse copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, FaceVerifyCreateSessionResponse faceVerifyCreateSessionResponse, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    faceVerifyCreateSessionResponse = stateListAnimator.copydefault;
                }
                return stateListAnimator.KWHzl(faceVerifyCreateSessionResponse);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final FaceVerifyCreateSessionResponse KWHzl() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StateListAnimator KWHzl(@NotNull FaceVerifyCreateSessionResponse faceVerifyCreateSessionResponse) {
                Intrinsics.checkNotNullParameter(faceVerifyCreateSessionResponse, "");
                return new StateListAnimator(faceVerifyCreateSessionResponse);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StateListAnimator) && Intrinsics.EZpvd(this.copydefault, ((StateListAnimator) obj).copydefault);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.copydefault.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "ReachMaximumRetry(response=" + this.copydefault + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StateListAnimator(@NotNull FaceVerifyCreateSessionResponse faceVerifyCreateSessionResponse) {
                super(null);
                Intrinsics.checkNotNullParameter(faceVerifyCreateSessionResponse, "");
                this.copydefault = faceVerifyCreateSessionResponse;
            }
        }

        /* JADX INFO: renamed from: o.aBv$Activity$Application */
        /* JADX INFO: loaded from: classes22.dex */
        public static final class Application extends Activity {
            public final java.lang.String KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Application copy$default(Application application, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = application.KWHzl;
                }
                return application.KWHzl(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Application KWHzl(java.lang.String str) {
                return new Application(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String copydefault() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Application) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) ((Application) obj).KWHzl);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                java.lang.String str = this.KWHzl;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Failure(message=" + this.KWHzl + ")";
            }

            public Application(java.lang.String str) {
                super(null);
                this.KWHzl = str;
            }
        }
    }
}
