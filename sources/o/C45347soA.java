package o;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.okex.article.bean.ArticleListResponse;
import com.okinc.okex.common.usecase.SupportCenterFaqUseCase$getArticleList$1;
import com.okinc.okex.common.usecase.SupportCenterFaqUseCase$getArticleList$result$1$1$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.soA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45347soA {
    public final CoroutineDispatcher OLrzqt;
    public final InterfaceC44921sfz copydefault;

    @yCM
    public C45347soA(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull InterfaceC44921sfz interfaceC44921sfz) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(interfaceC44921sfz, "");
        this.OLrzqt = coroutineDispatcher;
        this.copydefault = interfaceC44921sfz;
    }

    /* JADX INFO: renamed from: o.soA$ActionBar */
    public static abstract class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.soA.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: o.soA$ActionBar$TaskDescription */
        public static final class TaskDescription extends ActionBar {
            public final ArticleListResponse EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, ArticleListResponse articleListResponse, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    articleListResponse = taskDescription.EZpvd;
                }
                return taskDescription.copydefault(articleListResponse);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ArticleListResponse EZpvd() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final TaskDescription copydefault(@NotNull ArticleListResponse articleListResponse) {
                Intrinsics.checkNotNullParameter(articleListResponse, "");
                return new TaskDescription(articleListResponse);
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
                return "Success(response=" + this.EZpvd + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TaskDescription(@NotNull ArticleListResponse articleListResponse) {
                super(null);
                Intrinsics.checkNotNullParameter(articleListResponse, "");
                this.EZpvd = articleListResponse;
            }
        }

        private ActionBar() {
        }

        /* JADX INFO: renamed from: o.soA$ActionBar$Application */
        public static final class Application extends ActionBar {
            public final java.lang.Throwable KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Application copy$default(Application application, java.lang.Throwable th, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    th = application.KWHzl;
                }
                return application.copydefault(th);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.Throwable copydefault() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Application copydefault(@NotNull java.lang.Throwable th) {
                Intrinsics.checkNotNullParameter(th, "");
                return new Application(th);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Application) && Intrinsics.EZpvd(this.KWHzl, ((Application) obj).KWHzl);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.KWHzl.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Failure(throwable=" + this.KWHzl + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Application(@NotNull java.lang.Throwable th) {
                super(null);
                Intrinsics.checkNotNullParameter(th, "");
                this.KWHzl = th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.Integer num, java.lang.Integer num2, @NotNull Continuation<? super ActionBar> continuation) throws java.lang.Throwable {
        SupportCenterFaqUseCase$getArticleList$1 supportCenterFaqUseCase$getArticleList$1;
        java.lang.Object objM7377constructorimpl;
        AbstractC43419rot.ActionBar actionBar;
        AbstractC43419rot stateListAnimator;
        java.lang.Throwable thM7380exceptionOrNullimpl;
        ResponseData responseData;
        if (continuation instanceof SupportCenterFaqUseCase$getArticleList$1) {
            supportCenterFaqUseCase$getArticleList$1 = (SupportCenterFaqUseCase$getArticleList$1) continuation;
            int i = supportCenterFaqUseCase$getArticleList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                supportCenterFaqUseCase$getArticleList$1.label = i - Integer.MIN_VALUE;
            } else {
                supportCenterFaqUseCase$getArticleList$1 = new SupportCenterFaqUseCase$getArticleList$1(this, continuation);
            }
        }
        SupportCenterFaqUseCase$getArticleList$1 supportCenterFaqUseCase$getArticleList$12 = supportCenterFaqUseCase$getArticleList$1;
        java.lang.Object objWithContext = supportCenterFaqUseCase$getArticleList$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = supportCenterFaqUseCase$getArticleList$12.label;
        try {
            try {
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(objWithContext);
                    Result.Application application = Result.Companion;
                    CoroutineDispatcher coroutineDispatcher = this.OLrzqt;
                    SupportCenterFaqUseCase$getArticleList$result$1$1$1 supportCenterFaqUseCase$getArticleList$result$1$1$1 = new SupportCenterFaqUseCase$getArticleList$result$1$1$1(this, str, str2, str3, str4, num, num2, null);
                    supportCenterFaqUseCase$getArticleList$12.label = 1;
                    objWithContext = BuildersKt.withContext(coroutineDispatcher, supportCenterFaqUseCase$getArticleList$result$1$1$1, supportCenterFaqUseCase$getArticleList$12);
                    if (objWithContext == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(objWithContext);
                }
                responseData = (ResponseData) objWithContext;
            } catch (java.lang.Throwable th) {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
            }
        } catch (java.lang.Throwable th2) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            stateListAnimator = new AbstractC43419rot.StateListAnimator(data);
            objM7377constructorimpl = Result.m7377constructorimpl((ArticleListResponse) stateListAnimator.AEQbTJ());
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
            }
        } else {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            stateListAnimator = actionBar;
            objM7377constructorimpl = Result.m7377constructorimpl((ArticleListResponse) stateListAnimator.AEQbTJ());
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
                return new ActionBar.TaskDescription((ArticleListResponse) objM7377constructorimpl);
            }
            return new ActionBar.Application(thM7380exceptionOrNullimpl);
        }
    }
}
