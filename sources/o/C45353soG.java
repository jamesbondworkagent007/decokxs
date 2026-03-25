package o;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.okex.center.bean.AllTopicPageData;
import com.okinc.okex.center.bean.TopicSectionsResponse;
import com.okinc.okex.common.usecase.SupportTopicUseCase$getTopicSections$1;
import com.okinc.okex.common.usecase.SupportTopicUseCase$getTopicSections$result$1$1$1;
import com.okinc.okex.common.usecase.SupportTopicUseCase$getTopicSections$result$2$1;
import com.okinc.okex.rating.net.RatingResult;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.soG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45353soG {
    public final InterfaceC44921sfz KWHzl;
    public final CoroutineDispatcher OLrzqt;
    public final CoroutineDispatcher copydefault;

    @yCM
    public C45353soG(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull CoroutineDispatcher coroutineDispatcher2, @NotNull InterfaceC44921sfz interfaceC44921sfz) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher2, "");
        Intrinsics.checkNotNullParameter(interfaceC44921sfz, "");
        this.copydefault = coroutineDispatcher;
        this.OLrzqt = coroutineDispatcher2;
        this.KWHzl = interfaceC44921sfz;
    }

    /* JADX INFO: renamed from: o.soG$Application */
    /* JADX INFO: loaded from: classes16.dex */
    public static abstract class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.soG.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: o.soG$Application$TaskDescription */
        public static final class TaskDescription extends Application {
            public final AllTopicPageData AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, AllTopicPageData allTopicPageData, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    allTopicPageData = taskDescription.AEQbTJ;
                }
                return taskDescription.copydefault(allTopicPageData);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final AllTopicPageData KWHzl() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final TaskDescription copydefault(@NotNull AllTopicPageData allTopicPageData) {
                Intrinsics.checkNotNullParameter(allTopicPageData, "");
                return new TaskDescription(allTopicPageData);
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
                return "Success(allTopicPageData=" + this.AEQbTJ + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TaskDescription(@NotNull AllTopicPageData allTopicPageData) {
                super(null);
                Intrinsics.checkNotNullParameter(allTopicPageData, "");
                this.AEQbTJ = allTopicPageData;
            }
        }

        private Application() {
        }

        /* JADX INFO: renamed from: o.soG$Application$StateListAnimator */
        public static final class StateListAnimator extends Application {
            public final java.lang.Throwable AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, java.lang.Throwable th, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    th = stateListAnimator.AEQbTJ;
                }
                return stateListAnimator.AEQbTJ(th);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StateListAnimator AEQbTJ(@NotNull java.lang.Throwable th) {
                Intrinsics.checkNotNullParameter(th, "");
                return new StateListAnimator(th);
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
                return "Failure(throwable=" + this.AEQbTJ + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StateListAnimator(@NotNull java.lang.Throwable th) {
                super(null);
                Intrinsics.checkNotNullParameter(th, "");
                this.AEQbTJ = th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007d A[Catch: all -> 0x0046, TRY_LEAVE, TryCatch #1 {all -> 0x0046, blocks: (B:16:0x0042, B:26:0x0062, B:28:0x006a, B:30:0x0070, B:31:0x007d), top: B:56:0x0042 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(java.lang.String str, @NotNull Continuation<? super Application> continuation) throws java.lang.Throwable {
        SupportTopicUseCase$getTopicSections$1 supportTopicUseCase$getTopicSections$1;
        C45353soG c45353soG;
        AbstractC43419rot actionBar;
        java.lang.Object objM7377constructorimpl;
        ResponseData responseData;
        java.util.List listAhwBna;
        if (continuation instanceof SupportTopicUseCase$getTopicSections$1) {
            supportTopicUseCase$getTopicSections$1 = (SupportTopicUseCase$getTopicSections$1) continuation;
            int i = supportTopicUseCase$getTopicSections$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                supportTopicUseCase$getTopicSections$1.label = i - Integer.MIN_VALUE;
            } else {
                supportTopicUseCase$getTopicSections$1 = new SupportTopicUseCase$getTopicSections$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = supportTopicUseCase$getTopicSections$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = supportTopicUseCase$getTopicSections$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            try {
                Result.Application application = Result.Companion;
                try {
                    CoroutineDispatcher coroutineDispatcher = this.copydefault;
                    SupportTopicUseCase$getTopicSections$result$1$1$1 supportTopicUseCase$getTopicSections$result$1$1$1 = new SupportTopicUseCase$getTopicSections$result$1$1$1(this, str, null);
                    supportTopicUseCase$getTopicSections$1.L$0 = this;
                    supportTopicUseCase$getTopicSections$1.label = 1;
                    objWithContext = BuildersKt.withContext(coroutineDispatcher, supportTopicUseCase$getTopicSections$result$1$1$1, supportTopicUseCase$getTopicSections$1);
                } catch (java.lang.Throwable th) {
                    th = th;
                    c45353soG = this;
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                    actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                c45353soG = this;
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
            c45353soG = this;
            responseData = (ResponseData) objWithContext;
            if (responseData.getCode() != 0) {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            }
            kotlin.Pair pair = (kotlin.Pair) objWithContext;
            listAhwBna = (java.util.List) pair.component1();
            RatingResult ratingResult = (RatingResult) pair.component2();
            if (listAhwBna == null) {
            }
            return new Application.TaskDescription(new AllTopicPageData(listAhwBna, ratingResult));
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
            kotlin.Pair pair2 = (kotlin.Pair) objWithContext;
            listAhwBna = (java.util.List) pair2.component1();
            RatingResult ratingResult2 = (RatingResult) pair2.component2();
            if (listAhwBna == null) {
                listAhwBna = yDY.AhwBna();
            }
            return new Application.TaskDescription(new AllTopicPageData(listAhwBna, ratingResult2));
        }
        c45353soG = (C45353soG) supportTopicUseCase$getTopicSections$1.L$0;
        try {
            C56391yDq.AEQbTJ(objWithContext);
            responseData = (ResponseData) objWithContext;
            if (responseData.getCode() != 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                actionBar = new AbstractC43419rot.StateListAnimator(data);
            } else {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
            try {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
            } catch (java.lang.Throwable th4) {
                th = th4;
                Result.Application application22 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        }
        objM7377constructorimpl = Result.m7377constructorimpl((TopicSectionsResponse) actionBar.AEQbTJ());
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl == null) {
            CoroutineDispatcher coroutineDispatcher2 = c45353soG.OLrzqt;
            SupportTopicUseCase$getTopicSections$result$2$1 supportTopicUseCase$getTopicSections$result$2$1 = new SupportTopicUseCase$getTopicSections$result$2$1((TopicSectionsResponse) objM7377constructorimpl, null);
            supportTopicUseCase$getTopicSections$1.L$0 = null;
            supportTopicUseCase$getTopicSections$1.label = 2;
            objWithContext = BuildersKt.withContext(coroutineDispatcher2, supportTopicUseCase$getTopicSections$result$2$1, supportTopicUseCase$getTopicSections$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
            kotlin.Pair pair22 = (kotlin.Pair) objWithContext;
            listAhwBna = (java.util.List) pair22.component1();
            RatingResult ratingResult22 = (RatingResult) pair22.component2();
            if (listAhwBna == null) {
            }
            return new Application.TaskDescription(new AllTopicPageData(listAhwBna, ratingResult22));
        }
        return new Application.StateListAnimator(thM7380exceptionOrNullimpl);
    }
}
