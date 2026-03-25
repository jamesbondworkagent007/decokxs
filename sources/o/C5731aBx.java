package o;

import com.okinc.auth.api.facerecognition.FacialRecognitionRequest;
import com.okinc.auth.impl.facerecognition.data.FaceRecognitionApiService;
import com.okinc.auth.impl.facerecognition.domain.FaceRecognitionResultUseCase$invoke$2;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aBx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5731aBx {
    public final CoroutineDispatcher OLrzqt;
    public final FaceRecognitionApiService copydefault;

    @yCM
    public C5731aBx(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull FaceRecognitionApiService faceRecognitionApiService) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(faceRecognitionApiService, "");
        this.OLrzqt = coroutineDispatcher;
        this.copydefault = faceRecognitionApiService;
    }

    public final java.lang.Object KWHzl(@NotNull FacialRecognitionRequest facialRecognitionRequest, @NotNull java.lang.String str, @NotNull Continuation<? super Application> continuation) {
        return BuildersKt.withContext(this.OLrzqt, new FaceRecognitionResultUseCase$invoke$2(facialRecognitionRequest, str, this, null), continuation);
    }

    /* JADX INFO: renamed from: o.aBx$Application */
    /* JADX INFO: loaded from: classes14.dex */
    public static abstract class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aBx.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: o.aBx$Application$Activity */
        public static final class Activity extends Application {
            public final java.lang.String copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Activity copy$default(Activity activity, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = activity.copydefault;
                }
                return activity.KWHzl(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String EZpvd() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Activity KWHzl(java.lang.String str) {
                return new Activity(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Activity) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) ((Activity) obj).copydefault);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                java.lang.String str = this.copydefault;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Success(nextStep=" + this.copydefault + ")";
            }

            public Activity(java.lang.String str) {
                super(null);
                this.copydefault = str;
            }
        }

        private Application() {
        }

        /* JADX INFO: renamed from: o.aBx$Application$TaskDescription */
        public static final class TaskDescription extends Application {
            public final java.lang.String copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = taskDescription.copydefault;
                }
                return taskDescription.copydefault(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String OLrzqt() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final TaskDescription copydefault(java.lang.String str) {
                return new TaskDescription(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof TaskDescription) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) ((TaskDescription) obj).copydefault);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                java.lang.String str = this.copydefault;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Failure(message=" + this.copydefault + ")";
            }

            public TaskDescription(java.lang.String str) {
                super(null);
                this.copydefault = str;
            }
        }

        /* JADX INFO: renamed from: o.aBx$Application$Application, reason: collision with other inner class name */
        /* JADX INFO: loaded from: classes22.dex */
        public static final class C0812Application extends Application {
            public final java.lang.String EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ C0812Application copy$default(C0812Application c0812Application, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = c0812Application.EZpvd;
                }
                return c0812Application.EZpvd(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C0812Application EZpvd(java.lang.String str) {
                return new C0812Application(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String KWHzl() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0812Application) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) ((C0812Application) obj).EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                java.lang.String str = this.EZpvd;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Error(message=" + this.EZpvd + ")";
            }

            public C0812Application(java.lang.String str) {
                super(null);
                this.EZpvd = str;
            }
        }
    }

    public final Application OLrzqt(ResponseData<?> responseData, java.lang.String str) {
        if (responseData.getCode() == 0) {
            return new Application.Activity(str);
        }
        return new Application.TaskDescription(responseData.getMsg());
    }
}
