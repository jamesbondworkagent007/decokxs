package o;

import com.okinc.biz.model.ModuleType;
import com.okinc.biz.model.SubmitRatingResult;
import com.okinc.okex.rating.bean.PostSupportRatingRequestBean;
import com.okinc.okex.rating.bean.PostUpdateRatingRequestBean;
import com.okinc.okex.rating.net.RatingResult;
import com.okinc.okex.rating.usecase.RatingUseCase$getRatingForm$3;
import com.okinc.okex.rating.usecase.RatingUseCase$getRatingMetadata$2;
import com.okinc.okex.rating.usecase.RatingUseCase$submitRating$2;
import com.okinc.okex.rating.usecase.RatingUseCase$updateRating$2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class syS {
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public final sxL KWHzl;

    @yCM
    public syS(@NotNull sxL sxl) {
        Intrinsics.checkNotNullParameter(sxl, "");
        this.KWHzl = sxl;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.syS.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static abstract class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.syS.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: o.syS$Activity$Activity, reason: collision with other inner class name */
        /* JADX INFO: loaded from: classes19.dex */
        public static final class C0952Activity extends Activity {
            public static final C0952Activity AEQbTJ = new C0952Activity();

            private C0952Activity() {
                super(null);
            }
        }

        private Activity() {
        }

        /* JADX INFO: loaded from: classes19.dex */
        public static final class TaskDescription extends Activity {
            public final java.lang.String AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = taskDescription.AEQbTJ;
                }
                return taskDescription.OLrzqt(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String OLrzqt() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final TaskDescription OLrzqt(@NotNull java.lang.String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new TaskDescription(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof TaskDescription) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) ((TaskDescription) obj).AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.AEQbTJ.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "ApiError(errorMessage=" + this.AEQbTJ + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TaskDescription(@NotNull java.lang.String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.AEQbTJ = str;
            }
        }

        /* JADX INFO: loaded from: classes19.dex */
        public static final class Application extends Activity {
            public static final Application KWHzl = new Application();

            private Application() {
                super(null);
            }
        }

        /* JADX INFO: loaded from: classes19.dex */
        public static final class ActionBar extends Activity {
            public final java.lang.Throwable OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, java.lang.Throwable th, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    th = actionBar.OLrzqt;
                }
                return actionBar.OLrzqt(th);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.Throwable EZpvd() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ActionBar OLrzqt(@NotNull java.lang.Throwable th) {
                Intrinsics.checkNotNullParameter(th, "");
                return new ActionBar(th);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
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
            public java.lang.String toString() {
                return "Failure(error=" + this.OLrzqt + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ActionBar(@NotNull java.lang.Throwable th) {
                super(null);
                Intrinsics.checkNotNullParameter(th, "");
                this.OLrzqt = th;
            }
        }
    }

    public final java.lang.Object EZpvd(@NotNull ModuleType moduleType, java.lang.String str, @NotNull Continuation<? super C6808aWP> continuation) {
        return BuildersKt.withContext(C44711scA.EZpvd.OLrzqt(), new RatingUseCase$getRatingMetadata$2(this, moduleType, str, null), continuation);
    }

    public final java.lang.Object OLrzqt(@NotNull ModuleType moduleType, java.lang.String str, java.lang.String str2, JsonObject jsonObject, @NotNull Continuation<? super RatingResult> continuation) {
        return EZpvd(moduleType.getValue(), str, str2, jsonObject, continuation);
    }

    public final java.lang.Object EZpvd(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, JsonObject jsonObject, @NotNull Continuation<? super RatingResult> continuation) {
        return BuildersKt.withContext(C44711scA.EZpvd.OLrzqt(), new RatingUseCase$getRatingForm$3(str, str2, str3, this, jsonObject, null), continuation);
    }

    public final java.lang.Object copydefault(@NotNull PostSupportRatingRequestBean postSupportRatingRequestBean, @NotNull Continuation<? super SubmitRatingResult> continuation) {
        return BuildersKt.withContext(C44711scA.EZpvd.OLrzqt(), new RatingUseCase$submitRating$2(postSupportRatingRequestBean, this, null), continuation);
    }

    public final java.lang.Object AEQbTJ(@NotNull PostUpdateRatingRequestBean postUpdateRatingRequestBean, @NotNull Continuation<? super Activity> continuation) {
        return BuildersKt.withContext(C44711scA.EZpvd.OLrzqt(), new RatingUseCase$updateRating$2(postUpdateRatingRequestBean, this, null), continuation);
    }
}
