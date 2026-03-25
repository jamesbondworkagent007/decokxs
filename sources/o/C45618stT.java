package o;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.okex.feedback.net.FeedbackApiService;
import com.okinc.okex.feedback.net.bean.FileAttach;
import com.okinc.okex.feedback.net.bean.FileLimit;
import com.okinc.okex.feedback.net.bean.FileUpload;
import com.okinc.okex.feedback.net.bean.LoopholeReq;
import com.okinc.okex.feedback.net.bean.MainCategory;
import com.okinc.okex.feedback.usecase.FeedbackUseCase$getCategories$1;
import com.okinc.okex.feedback.usecase.FeedbackUseCase$getSubmitFileLimit$1;
import com.okinc.okex.feedback.usecase.FeedbackUseCase$getTotalOfPendingApproveFeedback$1;
import com.okinc.okex.feedback.usecase.FeedbackUseCase$submitAttachment$2;
import com.okinc.okex.feedback.usecase.FeedbackUseCase$submitLoophole$1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.stT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45618stT {
    public final FeedbackApiService AEQbTJ;
    public final InterfaceC47278tmy OLrzqt;

    @yCM
    public C45618stT(@NotNull FeedbackApiService feedbackApiService, @NotNull InterfaceC47278tmy interfaceC47278tmy) {
        Intrinsics.checkNotNullParameter(feedbackApiService, "");
        Intrinsics.checkNotNullParameter(interfaceC47278tmy, "");
        this.AEQbTJ = feedbackApiService;
        this.OLrzqt = interfaceC47278tmy;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull Continuation<? super AbstractC43419rot<java.lang.Integer, OKServerException>> continuation) throws java.lang.Throwable {
        FeedbackUseCase$getTotalOfPendingApproveFeedback$1 feedbackUseCase$getTotalOfPendingApproveFeedback$1;
        if (continuation instanceof FeedbackUseCase$getTotalOfPendingApproveFeedback$1) {
            feedbackUseCase$getTotalOfPendingApproveFeedback$1 = (FeedbackUseCase$getTotalOfPendingApproveFeedback$1) continuation;
            int i = feedbackUseCase$getTotalOfPendingApproveFeedback$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                feedbackUseCase$getTotalOfPendingApproveFeedback$1.label = i - Integer.MIN_VALUE;
            } else {
                feedbackUseCase$getTotalOfPendingApproveFeedback$1 = new FeedbackUseCase$getTotalOfPendingApproveFeedback$1(this, continuation);
            }
        }
        java.lang.Object feedbackVerifyNumber = feedbackUseCase$getTotalOfPendingApproveFeedback$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = feedbackUseCase$getTotalOfPendingApproveFeedback$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(feedbackVerifyNumber);
                FeedbackApiService feedbackApiService = this.AEQbTJ;
                feedbackUseCase$getTotalOfPendingApproveFeedback$1.label = 1;
                feedbackVerifyNumber = feedbackApiService.getFeedbackVerifyNumber(feedbackUseCase$getTotalOfPendingApproveFeedback$1);
                if (feedbackVerifyNumber == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(feedbackVerifyNumber);
            }
            ResponseData responseData = (ResponseData) feedbackVerifyNumber;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                return new AbstractC43419rot.StateListAnimator(data);
            }
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            return new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            return new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
    }

    /* JADX INFO: renamed from: o.stT$Application */
    /* JADX INFO: loaded from: classes16.dex */
    public static abstract class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.stT.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        /* JADX INFO: renamed from: o.stT$Application$Activity */
        public static final class Activity extends Application {
            public final int KWHzl;
            public final int copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Activity copy$default(Activity activity, int i, int i2, int i3, java.lang.Object obj) {
                if ((i3 & 1) != 0) {
                    i = activity.KWHzl;
                }
                if ((i3 & 2) != 0) {
                    i2 = activity.copydefault;
                }
                return activity.AEQbTJ(i, i2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Activity AEQbTJ(int i, int i2) {
                return new Activity(i, i2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final int KWHzl() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final int copydefault() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Activity)) {
                    return false;
                }
                Activity activity = (Activity) obj;
                return this.KWHzl == activity.KWHzl && this.copydefault == activity.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (java.lang.Integer.hashCode(this.KWHzl) * 31) + java.lang.Integer.hashCode(this.copydefault);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Success(maxFileSize=" + this.KWHzl + ", maxFileCount=" + this.copydefault + ")";
            }

            public Activity(int i, int i2) {
                super(null);
                this.KWHzl = i;
                this.copydefault = i2;
            }
        }

        /* JADX INFO: renamed from: o.stT$Application$ActionBar */
        public static final class ActionBar extends Application {
            public static final int copydefault = OKServerException.$stable;
            public final OKServerException KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, OKServerException oKServerException, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    oKServerException = actionBar.KWHzl;
                }
                return actionBar.EZpvd(oKServerException);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ActionBar EZpvd(@NotNull OKServerException oKServerException) {
                Intrinsics.checkNotNullParameter(oKServerException, "");
                return new ActionBar(oKServerException);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ActionBar) && Intrinsics.EZpvd(this.KWHzl, ((ActionBar) obj).KWHzl);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.KWHzl.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Failure(exception=" + this.KWHzl + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ActionBar(@NotNull OKServerException oKServerException) {
                super(null);
                Intrinsics.checkNotNullParameter(oKServerException, "");
                this.KWHzl = oKServerException;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull Continuation<? super Application> continuation) throws java.lang.Throwable {
        FeedbackUseCase$getSubmitFileLimit$1 feedbackUseCase$getSubmitFileLimit$1;
        AbstractC43419rot actionBar;
        if (continuation instanceof FeedbackUseCase$getSubmitFileLimit$1) {
            feedbackUseCase$getSubmitFileLimit$1 = (FeedbackUseCase$getSubmitFileLimit$1) continuation;
            int i = feedbackUseCase$getSubmitFileLimit$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                feedbackUseCase$getSubmitFileLimit$1.label = i - Integer.MIN_VALUE;
            } else {
                feedbackUseCase$getSubmitFileLimit$1 = new FeedbackUseCase$getSubmitFileLimit$1(this, continuation);
            }
        }
        java.lang.Object fileLimit = feedbackUseCase$getSubmitFileLimit$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = feedbackUseCase$getSubmitFileLimit$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(fileLimit);
                FeedbackApiService feedbackApiService = this.AEQbTJ;
                feedbackUseCase$getSubmitFileLimit$1.label = 1;
                fileLimit = feedbackApiService.getFileLimit(feedbackUseCase$getSubmitFileLimit$1);
                if (fileLimit == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(fileLimit);
            }
            ResponseData responseData = (ResponseData) fileLimit;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                actionBar = new AbstractC43419rot.StateListAnimator(data);
            } else {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            }
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
            AbstractC43419rot.StateListAnimator stateListAnimator = (AbstractC43419rot.StateListAnimator) actionBar;
            return new Application.Activity(((FileLimit) stateListAnimator.KWHzl()).getMaxFile(), ((FileLimit) stateListAnimator.KWHzl()).getMaxFileCount());
        }
        if (actionBar instanceof AbstractC43419rot.ActionBar) {
            return new Application.ActionBar((OKServerException) ((AbstractC43419rot.ActionBar) actionBar).KWHzl());
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: o.stT$Activity */
    /* JADX INFO: loaded from: classes16.dex */
    public static abstract class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.stT.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        /* JADX INFO: renamed from: o.stT$Activity$Application */
        public static final class Application extends Activity {
            public final java.util.List<MainCategory> copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.stT$Activity$Application */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Application copy$default(Application application, java.util.List list, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    list = application.copydefault;
                }
                return application.EZpvd(list);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Application EZpvd(@NotNull java.util.List<MainCategory> list) {
                Intrinsics.checkNotNullParameter(list, "");
                return new Application(list);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.util.List<MainCategory> OLrzqt() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Application) && Intrinsics.EZpvd(this.copydefault, ((Application) obj).copydefault);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.copydefault.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Success(listOfCategory=" + this.copydefault + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Application(@NotNull java.util.List<MainCategory> list) {
                super(null);
                Intrinsics.checkNotNullParameter(list, "");
                this.copydefault = list;
            }
        }

        /* JADX INFO: renamed from: o.stT$Activity$TaskDescription */
        public static final class TaskDescription extends Activity {
            public static final int KWHzl = OKServerException.$stable;
            public final OKServerException AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, OKServerException oKServerException, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    oKServerException = taskDescription.AEQbTJ;
                }
                return taskDescription.OLrzqt(oKServerException);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final TaskDescription OLrzqt(@NotNull OKServerException oKServerException) {
                Intrinsics.checkNotNullParameter(oKServerException, "");
                return new TaskDescription(oKServerException);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof TaskDescription) && Intrinsics.EZpvd(this.AEQbTJ, ((TaskDescription) obj).AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.AEQbTJ.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Failure(exception=" + this.AEQbTJ + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TaskDescription(@NotNull OKServerException oKServerException) {
                super(null);
                Intrinsics.checkNotNullParameter(oKServerException, "");
                this.AEQbTJ = oKServerException;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(int i, @NotNull Continuation<? super Activity> continuation) throws java.lang.Throwable {
        FeedbackUseCase$getCategories$1 feedbackUseCase$getCategories$1;
        AbstractC43419rot actionBar;
        AbstractC43419rot stateListAnimator;
        ResponseData responseData;
        if (continuation instanceof FeedbackUseCase$getCategories$1) {
            feedbackUseCase$getCategories$1 = (FeedbackUseCase$getCategories$1) continuation;
            int i2 = feedbackUseCase$getCategories$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                feedbackUseCase$getCategories$1.label = i2 - Integer.MIN_VALUE;
            } else {
                feedbackUseCase$getCategories$1 = new FeedbackUseCase$getCategories$1(this, continuation);
            }
        }
        java.lang.Object feedbackCategory = feedbackUseCase$getCategories$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = feedbackUseCase$getCategories$1.label;
        try {
            if (i3 == 0) {
                C56391yDq.AEQbTJ(feedbackCategory);
                FeedbackApiService feedbackApiService = this.AEQbTJ;
                feedbackUseCase$getCategories$1.label = 1;
                feedbackCategory = feedbackApiService.getFeedbackCategory(i, feedbackUseCase$getCategories$1);
                if (feedbackCategory == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i3 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(feedbackCategory);
            }
            responseData = (ResponseData) feedbackCategory;
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            stateListAnimator = new AbstractC43419rot.StateListAnimator(data);
            if (!(stateListAnimator instanceof AbstractC43419rot.StateListAnimator)) {
            }
        } else {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            stateListAnimator = actionBar;
            if (!(stateListAnimator instanceof AbstractC43419rot.StateListAnimator)) {
                return new Activity.Application((java.util.List) ((AbstractC43419rot.StateListAnimator) stateListAnimator).KWHzl());
            }
            if (stateListAnimator instanceof AbstractC43419rot.ActionBar) {
                return new Activity.TaskDescription((OKServerException) ((AbstractC43419rot.ActionBar) stateListAnimator).KWHzl());
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: o.stT$ActionBar */
    /* JADX INFO: loaded from: classes16.dex */
    public static abstract class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.stT.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: o.stT$ActionBar$TaskDescription */
        /* JADX INFO: loaded from: classes19.dex */
        public static final class TaskDescription extends ActionBar {
            public final FileUpload AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, FileUpload fileUpload, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    fileUpload = taskDescription.AEQbTJ;
                }
                return taskDescription.KWHzl(fileUpload);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final TaskDescription KWHzl(@NotNull FileUpload fileUpload) {
                Intrinsics.checkNotNullParameter(fileUpload, "");
                return new TaskDescription(fileUpload);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final FileUpload OLrzqt() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof TaskDescription) && Intrinsics.EZpvd(this.AEQbTJ, ((TaskDescription) obj).AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.AEQbTJ.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Success(file=" + this.AEQbTJ + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TaskDescription(@NotNull FileUpload fileUpload) {
                super(null);
                Intrinsics.checkNotNullParameter(fileUpload, "");
                this.AEQbTJ = fileUpload;
            }
        }

        private ActionBar() {
        }

        /* JADX INFO: renamed from: o.stT$ActionBar$Activity */
        /* JADX INFO: loaded from: classes19.dex */
        public static final class Activity extends ActionBar {
            public static final int EZpvd = OKServerException.$stable;
            public final OKServerException KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Activity copy$default(Activity activity, OKServerException oKServerException, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    oKServerException = activity.KWHzl;
                }
                return activity.KWHzl(oKServerException);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Activity KWHzl(@NotNull OKServerException oKServerException) {
                Intrinsics.checkNotNullParameter(oKServerException, "");
                return new Activity(oKServerException);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final OKServerException copydefault() {
                return this.KWHzl;
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
                return this.KWHzl.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Failure(exception=" + this.KWHzl + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Activity(@NotNull OKServerException oKServerException) {
                super(null);
                Intrinsics.checkNotNullParameter(oKServerException, "");
                this.KWHzl = oKServerException;
            }
        }
    }

    public final java.lang.Object OLrzqt(@NotNull java.io.File file, @NotNull Continuation<? super ActionBar> continuation) {
        return BuildersKt.withContext(C44711scA.EZpvd.OLrzqt(), new FeedbackUseCase$submitAttachment$2(this, file, null), continuation);
    }

    /* JADX INFO: renamed from: o.stT$TaskDescription */
    /* JADX INFO: loaded from: classes16.dex */
    public static abstract class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.stT.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: o.stT$TaskDescription$Application */
        public static final class Application extends TaskDescription {
            public static final Application copydefault = new Application();

            private Application() {
                super(null);
            }
        }

        private TaskDescription() {
        }

        /* JADX INFO: renamed from: o.stT$TaskDescription$StateListAnimator */
        public static final class StateListAnimator extends TaskDescription {
            public static final int copydefault = OKServerException.$stable;
            public final OKServerException KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, OKServerException oKServerException, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    oKServerException = stateListAnimator.KWHzl;
                }
                return stateListAnimator.copydefault(oKServerException);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final OKServerException AEQbTJ() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StateListAnimator copydefault(@NotNull OKServerException oKServerException) {
                Intrinsics.checkNotNullParameter(oKServerException, "");
                return new StateListAnimator(oKServerException);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StateListAnimator) && Intrinsics.EZpvd(this.KWHzl, ((StateListAnimator) obj).KWHzl);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.KWHzl.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Failure(exception=" + this.KWHzl + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StateListAnimator(@NotNull OKServerException oKServerException) {
                super(null);
                Intrinsics.checkNotNullParameter(oKServerException, "");
                this.KWHzl = oKServerException;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(int i, int i2, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.List<FileUpload> list, @NotNull Continuation<? super TaskDescription> continuation) throws java.lang.Throwable {
        FeedbackUseCase$submitLoophole$1 feedbackUseCase$submitLoophole$1;
        AbstractC43419rot actionBar;
        if (continuation instanceof FeedbackUseCase$submitLoophole$1) {
            feedbackUseCase$submitLoophole$1 = (FeedbackUseCase$submitLoophole$1) continuation;
            int i3 = feedbackUseCase$submitLoophole$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                feedbackUseCase$submitLoophole$1.label = i3 - Integer.MIN_VALUE;
            } else {
                feedbackUseCase$submitLoophole$1 = new FeedbackUseCase$submitLoophole$1(this, continuation);
            }
        }
        java.lang.Object objAddLoophole = feedbackUseCase$submitLoophole$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i4 = feedbackUseCase$submitLoophole$1.label;
        try {
            if (i4 == 0) {
                C56391yDq.AEQbTJ(objAddLoophole);
                FeedbackApiService feedbackApiService = this.AEQbTJ;
                java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
                for (FileUpload fileUpload : list) {
                    arrayList.add(new FileAttach(fileUpload.getName(), fileUpload.getPath()));
                }
                LoopholeReq loopholeReq = new LoopholeReq(i, i2, str, str2, i, arrayList);
                feedbackUseCase$submitLoophole$1.label = 1;
                objAddLoophole = feedbackApiService.addLoophole(loopholeReq, feedbackUseCase$submitLoophole$1);
                if (objAddLoophole == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i4 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objAddLoophole);
            }
            ResponseData responseData = (ResponseData) objAddLoophole;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                actionBar = new AbstractC43419rot.StateListAnimator(data);
            } else {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            }
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
            return TaskDescription.Application.copydefault;
        }
        if (actionBar instanceof AbstractC43419rot.ActionBar) {
            return new TaskDescription.StateListAnimator((OKServerException) ((AbstractC43419rot.ActionBar) actionBar).KWHzl());
        }
        throw new NoWhenBranchMatchedException();
    }
}
