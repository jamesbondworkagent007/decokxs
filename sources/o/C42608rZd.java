package o;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.okcomponents.feature.oknotificationcenter.api.business.notificationmessage.model.NotificationCategoryType;
import com.okinc.okcomponents.feature.oknotificationcenter.api.business.notificationmessage.model.UnViewedNotificationResp;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.domain.unreadcount.GetNotificationUnreadCountUseCase$invoke$1;
import kotlin.Result;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rZd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C42608rZd {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public final C42601rYx EZpvd;

    @yCM
    public C42608rZd(@NotNull C42601rYx c42601rYx) {
        Intrinsics.checkNotNullParameter(c42601rYx, "");
        this.EZpvd = c42601rYx;
    }

    /* JADX INFO: renamed from: o.rZd$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rZd.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull java.util.List<rXL> list, @NotNull NotificationCategoryType notificationCategoryType, @NotNull Continuation<? super UnViewedNotificationResp> continuation) throws java.lang.Throwable {
        GetNotificationUnreadCountUseCase$invoke$1 getNotificationUnreadCountUseCase$invoke$1;
        AbstractC43419rot.ActionBar actionBar;
        java.lang.Object objM7377constructorimpl;
        AbstractC43419rot stateListAnimator;
        java.lang.Throwable thM7380exceptionOrNullimpl;
        ResponseData responseData;
        if (continuation instanceof GetNotificationUnreadCountUseCase$invoke$1) {
            getNotificationUnreadCountUseCase$invoke$1 = (GetNotificationUnreadCountUseCase$invoke$1) continuation;
            int i = getNotificationUnreadCountUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getNotificationUnreadCountUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getNotificationUnreadCountUseCase$invoke$1 = new GetNotificationUnreadCountUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = getNotificationUnreadCountUseCase$invoke$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = getNotificationUnreadCountUseCase$invoke$1.label;
        try {
            try {
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(objCopydefault);
                    Result.Application application = Result.Companion;
                    java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
                    java.util.Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((rXL) it.next()).AEQbTJ());
                    }
                    C42601rYx c42601rYx = this.EZpvd;
                    getNotificationUnreadCountUseCase$invoke$1.L$0 = list;
                    getNotificationUnreadCountUseCase$invoke$1.label = 1;
                    objCopydefault = c42601rYx.copydefault(arrayList, notificationCategoryType, getNotificationUnreadCountUseCase$invoke$1);
                    if (objCopydefault == objCopydefault2) {
                        return objCopydefault2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list = (java.util.List) getNotificationUnreadCountUseCase$invoke$1.L$0;
                    C56391yDq.AEQbTJ(objCopydefault);
                }
                responseData = (ResponseData) objCopydefault;
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
            objM7377constructorimpl = Result.m7377constructorimpl((UnViewedNotificationResp) stateListAnimator.AEQbTJ());
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
            }
            if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            }
            C56391yDq.AEQbTJ(objM7377constructorimpl);
            return objM7377constructorimpl;
        }
        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        stateListAnimator = actionBar;
        objM7377constructorimpl = Result.m7377constructorimpl((UnViewedNotificationResp) stateListAnimator.AEQbTJ());
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.copydefault("GetNotificationUnreadCountUseCase", "fetchNotificationUnreadCount failed: " + CollectionsKt___CollectionsKt.joinToString$default(list, ", ", null, null, 0, null, new Function1() { // from class: o.rZh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C42608rZd.copydefault((rXL) obj);
                }
            }, 30, null) + " => " + thM7380exceptionOrNullimpl);
        }
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            pUU.KWHzl("GetNotificationUnreadCountUseCase", "fetchNotificationUnreadCount success: " + CollectionsKt___CollectionsKt.joinToString$default(list, ", ", null, null, 0, null, new Function1() { // from class: o.rZe
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C42608rZd.EZpvd((rXL) obj);
                }
            }, 30, null) + " => unread count: " + ((UnViewedNotificationResp) objM7377constructorimpl));
        }
        C56391yDq.AEQbTJ(objM7377constructorimpl);
        return objM7377constructorimpl;
    }

    public static /* synthetic */ java.lang.Object invoke$default(C42608rZd c42608rZd, java.util.List list, NotificationCategoryType notificationCategoryType, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            notificationCategoryType = NotificationCategoryType.New;
        }
        return c42608rZd.AEQbTJ(list, notificationCategoryType, continuation);
    }

    public static final java.lang.CharSequence copydefault(rXL rxl) {
        Intrinsics.checkNotNullParameter(rxl, "");
        return rxl.EZpvd();
    }

    public static final java.lang.CharSequence EZpvd(rXL rxl) {
        Intrinsics.checkNotNullParameter(rxl, "");
        return rxl.EZpvd();
    }
}
