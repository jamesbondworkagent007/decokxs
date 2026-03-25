package o;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.okcomponents.feature.oknotificationcenter.api.business.notificationmessage.model.NotificationCategoryType;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.domain.notificationcenter.UpdateNotificationReadAllUseCase$execute$1;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.notificationcenter.model.NotificationReadAllRequest;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rZa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C42605rZa {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public final C42601rYx EZpvd;

    @yCM
    public C42605rZa(@NotNull C42601rYx c42601rYx) {
        Intrinsics.checkNotNullParameter(c42601rYx, "");
        this.EZpvd = c42601rYx;
    }

    /* JADX INFO: renamed from: o.rZa$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rZa.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        UpdateNotificationReadAllUseCase$execute$1 updateNotificationReadAllUseCase$execute$1;
        AbstractC43419rot.ActionBar actionBar;
        AbstractC43419rot stateListAnimator;
        ResponseData responseData;
        if (continuation instanceof UpdateNotificationReadAllUseCase$execute$1) {
            updateNotificationReadAllUseCase$execute$1 = (UpdateNotificationReadAllUseCase$execute$1) continuation;
            int i = updateNotificationReadAllUseCase$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                updateNotificationReadAllUseCase$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                updateNotificationReadAllUseCase$execute$1 = new UpdateNotificationReadAllUseCase$execute$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = updateNotificationReadAllUseCase$execute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = updateNotificationReadAllUseCase$execute$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objAEQbTJ);
                pUU.KWHzl("UpdateNotificationReadAllUseCase", "execute...");
                NotificationReadAllRequest notificationReadAllRequest = new NotificationReadAllRequest(str, NotificationCategoryType.New.getValue());
                C42601rYx c42601rYx = this.EZpvd;
                updateNotificationReadAllUseCase$execute$1.label = 1;
                objAEQbTJ = c42601rYx.AEQbTJ(notificationReadAllRequest, updateNotificationReadAllUseCase$execute$1);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objAEQbTJ);
            }
            responseData = (ResponseData) objAEQbTJ;
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            stateListAnimator = new AbstractC43419rot.StateListAnimator(data);
            stateListAnimator.AEQbTJ();
            return C56443yFo.KWHzl(true);
        }
        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        stateListAnimator = actionBar;
        stateListAnimator.AEQbTJ();
        return C56443yFo.KWHzl(true);
    }
}
