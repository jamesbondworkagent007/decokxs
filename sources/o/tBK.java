package o;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.planet.biz_performance.data.UserProfileOverviewDto;
import com.okinc.planet.biz_performance.usecase.FetchUserProfileStatsUseCase$execute$1;
import com.okinc.planet.biz_userprofile.data.PlanetAuthorId;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.AbstractC43419rot;
import o.C47501trL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class tBK extends AbstractC46360tRl<PlanetAuthorId, Activity> {
    public final tQP KWHzl;
    public final CoroutineDispatcher copydefault;

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, kotlin.coroutines.Continuation] */
    @Override // o.AbstractC46360tRl
    public /* synthetic */ java.lang.Object AEQbTJ(PlanetAuthorId planetAuthorId, Continuation<? super Activity> continuation) {
        return EZpvd(planetAuthorId.copydefault(), continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tBK(@NotNull tQP tqp, @NotNull CoroutineDispatcher coroutineDispatcher) {
        super(coroutineDispatcher);
        Intrinsics.checkNotNullParameter(tqp, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = tqp;
        this.copydefault = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull Continuation<? super Activity> continuation) throws java.lang.Throwable {
        FetchUserProfileStatsUseCase$execute$1 fetchUserProfileStatsUseCase$execute$1;
        AbstractC43419rot.ActionBar actionBar;
        AbstractC43419rot stateListAnimator;
        java.util.List list;
        UserProfileOverviewDto userProfileOverviewDto;
        ResponseData responseData;
        if (continuation instanceof FetchUserProfileStatsUseCase$execute$1) {
            fetchUserProfileStatsUseCase$execute$1 = (FetchUserProfileStatsUseCase$execute$1) continuation;
            int i = fetchUserProfileStatsUseCase$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchUserProfileStatsUseCase$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchUserProfileStatsUseCase$execute$1 = new FetchUserProfileStatsUseCase$execute$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = fetchUserProfileStatsUseCase$execute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = fetchUserProfileStatsUseCase$execute$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objOLrzqt);
                tQP tqp = this.KWHzl;
                fetchUserProfileStatsUseCase$execute$1.label = 1;
                objOLrzqt = tqp.OLrzqt(str, fetchUserProfileStatsUseCase$execute$1);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objOLrzqt);
            }
            responseData = (ResponseData) objOLrzqt;
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            stateListAnimator = new AbstractC43419rot.StateListAnimator(data);
            list = (java.util.List) stateListAnimator.copydefault();
            if (list != null) {
            }
            return Activity.Companion.copydefault();
        }
        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        stateListAnimator = actionBar;
        list = (java.util.List) stateListAnimator.copydefault();
        if (list != null || (userProfileOverviewDto = (UserProfileOverviewDto) CollectionsKt___CollectionsKt.firstOrNull(list)) == null) {
            return Activity.Companion.copydefault();
        }
        return new Activity(new TaskDescription(C47501trL.Fragment.clearRegistrations, C46367tRs.AEQbTJ(userProfileOverviewDto.AEQbTJ(), false), null, null, 12, null));
    }

    public static final class TaskDescription {
        public final java.lang.Integer AEQbTJ;
        public final java.lang.Integer EZpvd;
        public final int OLrzqt;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, int i, java.lang.String str, java.lang.Integer num, java.lang.Integer num2, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = taskDescription.OLrzqt;
            }
            if ((i2 & 2) != 0) {
                str = taskDescription.copydefault;
            }
            if ((i2 & 4) != 0) {
                num = taskDescription.EZpvd;
            }
            if ((i2 & 8) != 0) {
                num2 = taskDescription.AEQbTJ;
            }
            return taskDescription.AEQbTJ(i, str, num, num2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription AEQbTJ(@androidx.annotation.StringRes int i, @NotNull java.lang.String str, @androidx.annotation.StringRes java.lang.Integer num, @androidx.annotation.ColorInt java.lang.Integer num2) {
            Intrinsics.checkNotNullParameter(str, "");
            return new TaskDescription(i, str, num, num2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TaskDescription)) {
                return false;
            }
            TaskDescription taskDescription = (TaskDescription) obj;
            return this.OLrzqt == taskDescription.OLrzqt && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) taskDescription.copydefault) && Intrinsics.EZpvd(this.EZpvd, taskDescription.EZpvd) && Intrinsics.EZpvd(this.AEQbTJ, taskDescription.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = java.lang.Integer.hashCode(this.OLrzqt);
            int iHashCode2 = this.copydefault.hashCode();
            java.lang.Integer num = this.EZpvd;
            int iHashCode3 = num == null ? 0 : num.hashCode();
            java.lang.Integer num2 = this.AEQbTJ;
            return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (num2 != null ? num2.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Attribute(title=" + this.OLrzqt + ", value=" + this.copydefault + ", prompt=" + this.EZpvd + ", textColor=" + this.AEQbTJ + ")";
        }

        public TaskDescription(@androidx.annotation.StringRes int i, @NotNull java.lang.String str, @androidx.annotation.StringRes java.lang.Integer num, @androidx.annotation.ColorInt java.lang.Integer num2) {
            Intrinsics.checkNotNullParameter(str, "");
            this.OLrzqt = i;
            this.copydefault = str;
            this.EZpvd = num;
            this.AEQbTJ = num2;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r2v0 int)
  (r3v0 java.lang.String)
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r4v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r5v0 java.lang.Integer))
 A[MD:(int, java.lang.String, java.lang.Integer, java.lang.Integer):void (m)] (LINE:54) call: o.tBK.TaskDescription.<init>(int, java.lang.String, java.lang.Integer, java.lang.Integer):void type: THIS */
        public /* synthetic */ TaskDescription(int i, java.lang.String str, java.lang.Integer num, java.lang.Integer num2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, str, (i2 & 4) != 0 ? null : num, (i2 & 8) != 0 ? null : num2);
        }
    }

    public static final class Activity {
        public static final C0956Activity Companion = new C0956Activity(null);
        public static final Activity OLrzqt = new Activity(new TaskDescription(C47501trL.Fragment.clearRegistrations, "--", null, null, 12, null));
        public final TaskDescription EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, TaskDescription taskDescription, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                taskDescription = activity.EZpvd;
            }
            return activity.OLrzqt(taskDescription);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity OLrzqt(@NotNull TaskDescription taskDescription) {
            Intrinsics.checkNotNullParameter(taskDescription, "");
            return new Activity(taskDescription);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Activity) && Intrinsics.EZpvd(this.EZpvd, ((Activity) obj).EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "UserProfileStatsUiModel(asset=" + this.EZpvd + ")";
        }

        public Activity(@NotNull TaskDescription taskDescription) {
            Intrinsics.checkNotNullParameter(taskDescription, "");
            this.EZpvd = taskDescription;
        }

        /* JADX INFO: renamed from: o.tBK$Activity$Activity, reason: collision with other inner class name */
        public static final class C0956Activity {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tBK.Activity.Activity.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ C0956Activity(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0956Activity() {
            }

            public final Activity copydefault() {
                return Activity.OLrzqt;
            }
        }
    }
}
