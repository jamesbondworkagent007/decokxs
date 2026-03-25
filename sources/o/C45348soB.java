package o;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.okex.center.bean.ChatbotUnreadMessageResponse;
import com.okinc.okex.center.bean.LandingTransactionDisplayModel;
import com.okinc.okex.center.bean.SupportBannerBean;
import com.okinc.okex.center.bean.SupportLandingResponse;
import com.okinc.okex.common.usecase.SupportCenterUseCase$getBannerList$1;
import com.okinc.okex.common.usecase.SupportCenterUseCase$getBannerList$call$1$1;
import com.okinc.okex.common.usecase.SupportCenterUseCase$getChatbotUnreadMessageCount$1;
import com.okinc.okex.common.usecase.SupportCenterUseCase$getChatbotUnreadMessageCount$2$response$1$1;
import com.okinc.okex.common.usecase.SupportCenterUseCase$getHomeTicketStatus$1;
import com.okinc.okex.common.usecase.SupportCenterUseCase$getHomeTicketStatus$2;
import com.okinc.okex.common.usecase.SupportCenterUseCase$getSupportLandingSections$1;
import com.okinc.okex.common.usecase.SupportCenterUseCase$getSupportLandingSections$response$1$1;
import com.okinc.okex.common.usecase.SupportCenterUseCase$getSupportLandingTransactions$1;
import com.okinc.okex.common.usecase.SupportCenterUseCase$getSupportLandingTransactions$2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.soB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45348soB {
    public static final int AEQbTJ = 8;
    public final InterfaceC44921sfz EZpvd;
    public final CoroutineDispatcher copydefault;

    @yCM
    public C45348soB(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull InterfaceC44921sfz interfaceC44921sfz) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(interfaceC44921sfz, "");
        this.copydefault = coroutineDispatcher;
        this.EZpvd = interfaceC44921sfz;
    }

    /* JADX INFO: renamed from: o.soB$Activity */
    /* JADX INFO: loaded from: classes16.dex */
    public static abstract class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.soB.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        /* JADX INFO: renamed from: o.soB$Activity$Application */
        public static final class Application extends Activity {
            public final java.util.List<SupportBannerBean> AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.soB$Activity$Application */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Application copy$default(Application application, java.util.List list, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    list = application.AEQbTJ;
                }
                return application.KWHzl(list);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Application KWHzl(@NotNull java.util.List<SupportBannerBean> list) {
                Intrinsics.checkNotNullParameter(list, "");
                return new Application(list);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.util.List<SupportBannerBean> OLrzqt() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Application) && Intrinsics.EZpvd(this.AEQbTJ, ((Application) obj).AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.AEQbTJ.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Success(banners=" + this.AEQbTJ + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Application(@NotNull java.util.List<SupportBannerBean> list) {
                super(null);
                Intrinsics.checkNotNullParameter(list, "");
                this.AEQbTJ = list;
            }
        }

        /* JADX INFO: renamed from: o.soB$Activity$ActionBar */
        public static final class ActionBar extends Activity {
            public static final int copydefault = OKServerException.$stable;
            public final OKServerException OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, OKServerException oKServerException, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    oKServerException = actionBar.OLrzqt;
                }
                return actionBar.AEQbTJ(oKServerException);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ActionBar AEQbTJ(@NotNull OKServerException oKServerException) {
                Intrinsics.checkNotNullParameter(oKServerException, "");
                return new ActionBar(oKServerException);
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
                return "Failure(exception=" + this.OLrzqt + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ActionBar(@NotNull OKServerException oKServerException) {
                super(null);
                Intrinsics.checkNotNullParameter(oKServerException, "");
                this.OLrzqt = oKServerException;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull Continuation<? super Activity> continuation) throws java.lang.Throwable {
        SupportCenterUseCase$getBannerList$1 supportCenterUseCase$getBannerList$1;
        AbstractC43419rot actionBar;
        if (continuation instanceof SupportCenterUseCase$getBannerList$1) {
            supportCenterUseCase$getBannerList$1 = (SupportCenterUseCase$getBannerList$1) continuation;
            int i = supportCenterUseCase$getBannerList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                supportCenterUseCase$getBannerList$1.label = i - Integer.MIN_VALUE;
            } else {
                supportCenterUseCase$getBannerList$1 = new SupportCenterUseCase$getBannerList$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = supportCenterUseCase$getBannerList$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = supportCenterUseCase$getBannerList$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher coroutineDispatcher = this.copydefault;
                SupportCenterUseCase$getBannerList$call$1$1 supportCenterUseCase$getBannerList$call$1$1 = new SupportCenterUseCase$getBannerList$call$1$1(this, null);
                supportCenterUseCase$getBannerList$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, supportCenterUseCase$getBannerList$call$1$1, supportCenterUseCase$getBannerList$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            ResponseData responseData = (ResponseData) objWithContext;
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
        C45366soT.KWHzl.AYXKKw();
        if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
            return new Activity.Application((java.util.List) ((AbstractC43419rot.StateListAnimator) actionBar).KWHzl());
        }
        if (!(actionBar instanceof AbstractC43419rot.ActionBar)) {
            throw new NoWhenBranchMatchedException();
        }
        return new Activity.ActionBar((OKServerException) ((AbstractC43419rot.ActionBar) actionBar).KWHzl());
    }

    /* JADX INFO: renamed from: o.soB$StateListAnimator */
    /* JADX INFO: loaded from: classes16.dex */
    public static abstract class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.soB.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        /* JADX INFO: renamed from: o.soB$StateListAnimator$ActionBar */
        public static final class ActionBar extends StateListAnimator {
            public final SupportLandingResponse copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, SupportLandingResponse supportLandingResponse, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    supportLandingResponse = actionBar.copydefault;
                }
                return actionBar.EZpvd(supportLandingResponse);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ActionBar EZpvd(@NotNull SupportLandingResponse supportLandingResponse) {
                Intrinsics.checkNotNullParameter(supportLandingResponse, "");
                return new ActionBar(supportLandingResponse);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final SupportLandingResponse copydefault() {
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
                return "Success(landingCards=" + this.copydefault + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ActionBar(@NotNull SupportLandingResponse supportLandingResponse) {
                super(null);
                Intrinsics.checkNotNullParameter(supportLandingResponse, "");
                this.copydefault = supportLandingResponse;
            }
        }

        /* JADX INFO: renamed from: o.soB$StateListAnimator$StateListAnimator, reason: collision with other inner class name */
        public static final class C0950StateListAnimator extends StateListAnimator {
            public static final int OLrzqt = OKServerException.$stable;
            public final OKServerException AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ C0950StateListAnimator copy$default(C0950StateListAnimator c0950StateListAnimator, OKServerException oKServerException, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    oKServerException = c0950StateListAnimator.AEQbTJ;
                }
                return c0950StateListAnimator.EZpvd(oKServerException);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C0950StateListAnimator EZpvd(@NotNull OKServerException oKServerException) {
                Intrinsics.checkNotNullParameter(oKServerException, "");
                return new C0950StateListAnimator(oKServerException);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final OKServerException copydefault() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0950StateListAnimator) && Intrinsics.EZpvd(this.AEQbTJ, ((C0950StateListAnimator) obj).AEQbTJ);
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
            public C0950StateListAnimator(@NotNull OKServerException oKServerException) {
                super(null);
                Intrinsics.checkNotNullParameter(oKServerException, "");
                this.AEQbTJ = oKServerException;
            }
        }
    }

    public static /* synthetic */ java.lang.Object getSupportLandingSections$default(C45348soB c45348soB, java.lang.String str, java.lang.String str2, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return c45348soB.AEQbTJ(str, str2, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(java.lang.String str, java.lang.String str2, @NotNull Continuation<? super StateListAnimator> continuation) throws java.lang.Throwable {
        SupportCenterUseCase$getSupportLandingSections$1 supportCenterUseCase$getSupportLandingSections$1;
        AbstractC43419rot actionBar;
        AbstractC43419rot stateListAnimator;
        ResponseData responseData;
        if (continuation instanceof SupportCenterUseCase$getSupportLandingSections$1) {
            supportCenterUseCase$getSupportLandingSections$1 = (SupportCenterUseCase$getSupportLandingSections$1) continuation;
            int i = supportCenterUseCase$getSupportLandingSections$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                supportCenterUseCase$getSupportLandingSections$1.label = i - Integer.MIN_VALUE;
            } else {
                supportCenterUseCase$getSupportLandingSections$1 = new SupportCenterUseCase$getSupportLandingSections$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = supportCenterUseCase$getSupportLandingSections$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = supportCenterUseCase$getSupportLandingSections$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher coroutineDispatcher = this.copydefault;
                SupportCenterUseCase$getSupportLandingSections$response$1$1 supportCenterUseCase$getSupportLandingSections$response$1$1 = new SupportCenterUseCase$getSupportLandingSections$response$1$1(this, str, str2, null);
                supportCenterUseCase$getSupportLandingSections$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, supportCenterUseCase$getSupportLandingSections$response$1$1, supportCenterUseCase$getSupportLandingSections$1);
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
                return new StateListAnimator.ActionBar((SupportLandingResponse) ((AbstractC43419rot.StateListAnimator) stateListAnimator).KWHzl());
            }
            if (!(stateListAnimator instanceof AbstractC43419rot.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            return new StateListAnimator.C0950StateListAnimator((OKServerException) ((AbstractC43419rot.ActionBar) stateListAnimator).KWHzl());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull Continuation<? super Result<java.lang.Boolean>> continuation) throws java.lang.Throwable {
        SupportCenterUseCase$getHomeTicketStatus$1 supportCenterUseCase$getHomeTicketStatus$1;
        if (continuation instanceof SupportCenterUseCase$getHomeTicketStatus$1) {
            supportCenterUseCase$getHomeTicketStatus$1 = (SupportCenterUseCase$getHomeTicketStatus$1) continuation;
            int i = supportCenterUseCase$getHomeTicketStatus$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                supportCenterUseCase$getHomeTicketStatus$1.label = i - Integer.MIN_VALUE;
            } else {
                supportCenterUseCase$getHomeTicketStatus$1 = new SupportCenterUseCase$getHomeTicketStatus$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = supportCenterUseCase$getHomeTicketStatus$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = supportCenterUseCase$getHomeTicketStatus$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcherOLrzqt = C44711scA.EZpvd.OLrzqt();
            SupportCenterUseCase$getHomeTicketStatus$2 supportCenterUseCase$getHomeTicketStatus$2 = new SupportCenterUseCase$getHomeTicketStatus$2(this, null);
            supportCenterUseCase$getHomeTicketStatus$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcherOLrzqt, supportCenterUseCase$getHomeTicketStatus$2, supportCenterUseCase$getHomeTicketStatus$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull Continuation<? super java.lang.Integer> continuation) throws java.lang.Throwable {
        SupportCenterUseCase$getChatbotUnreadMessageCount$1 supportCenterUseCase$getChatbotUnreadMessageCount$1;
        AbstractC43419rot actionBar;
        java.lang.Object objM7377constructorimpl;
        if (continuation instanceof SupportCenterUseCase$getChatbotUnreadMessageCount$1) {
            supportCenterUseCase$getChatbotUnreadMessageCount$1 = (SupportCenterUseCase$getChatbotUnreadMessageCount$1) continuation;
            int i = supportCenterUseCase$getChatbotUnreadMessageCount$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                supportCenterUseCase$getChatbotUnreadMessageCount$1.label = i - Integer.MIN_VALUE;
            } else {
                supportCenterUseCase$getChatbotUnreadMessageCount$1 = new SupportCenterUseCase$getChatbotUnreadMessageCount$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = supportCenterUseCase$getChatbotUnreadMessageCount$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = supportCenterUseCase$getChatbotUnreadMessageCount$1.label;
        try {
            try {
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(objWithContext);
                    Result.Application application = Result.Companion;
                    CoroutineDispatcher coroutineDispatcher = this.copydefault;
                    SupportCenterUseCase$getChatbotUnreadMessageCount$2$response$1$1 supportCenterUseCase$getChatbotUnreadMessageCount$2$response$1$1 = new SupportCenterUseCase$getChatbotUnreadMessageCount$2$response$1$1(this, null);
                    supportCenterUseCase$getChatbotUnreadMessageCount$1.label = 1;
                    objWithContext = BuildersKt.withContext(coroutineDispatcher, supportCenterUseCase$getChatbotUnreadMessageCount$2$response$1$1, supportCenterUseCase$getChatbotUnreadMessageCount$1);
                    if (objWithContext == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(objWithContext);
                }
                ResponseData responseData = (ResponseData) objWithContext;
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
            java.lang.Integer unreadCount = ((ChatbotUnreadMessageResponse) actionBar.AEQbTJ()).getUnreadCount();
            objM7377constructorimpl = Result.m7377constructorimpl(C56443yFo.AEQbTJ(unreadCount != null ? unreadCount.intValue() : 0));
        } catch (java.lang.Throwable th2) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
        }
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            C45193slF.copydefault.OLrzqt(((java.lang.Number) objM7377constructorimpl).intValue() > 0);
        }
        if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
            C45193slF.copydefault.OLrzqt(false);
        }
        C56391yDq.AEQbTJ(objM7377constructorimpl);
        return objM7377constructorimpl;
    }

    /* JADX INFO: renamed from: getSupportLandingTransactions-gIAlu-s$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m8710getSupportLandingTransactionsgIAlus$default(C45348soB c45348soB, java.lang.String str, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return c45348soB.AEQbTJ(str, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(java.lang.String str, @NotNull Continuation<? super Result<? extends java.util.List<LandingTransactionDisplayModel>>> continuation) throws java.lang.Throwable {
        SupportCenterUseCase$getSupportLandingTransactions$1 supportCenterUseCase$getSupportLandingTransactions$1;
        if (continuation instanceof SupportCenterUseCase$getSupportLandingTransactions$1) {
            supportCenterUseCase$getSupportLandingTransactions$1 = (SupportCenterUseCase$getSupportLandingTransactions$1) continuation;
            int i = supportCenterUseCase$getSupportLandingTransactions$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                supportCenterUseCase$getSupportLandingTransactions$1.label = i - Integer.MIN_VALUE;
            } else {
                supportCenterUseCase$getSupportLandingTransactions$1 = new SupportCenterUseCase$getSupportLandingTransactions$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = supportCenterUseCase$getSupportLandingTransactions$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = supportCenterUseCase$getSupportLandingTransactions$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcherOLrzqt = C44711scA.EZpvd.OLrzqt();
            SupportCenterUseCase$getSupportLandingTransactions$2 supportCenterUseCase$getSupportLandingTransactions$2 = new SupportCenterUseCase$getSupportLandingTransactions$2(this, str, null);
            supportCenterUseCase$getSupportLandingTransactions$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcherOLrzqt, supportCenterUseCase$getSupportLandingTransactions$2, supportCenterUseCase$getSupportLandingTransactions$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }
}
