package o;

import com.okinc.okcomponents.feature.oknotificationcenter.impl.domain.notificationcenter.MarkNotificationConversationAsViewedUseCase$execute$1;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.notificationcenter.model.NotificationViewAllRequest;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rZc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C42607rZc {
    public final rXQ EZpvd;
    public final C42601rYx KWHzl;

    @yCM
    public C42607rZc(@NotNull rXQ rxq, @NotNull C42601rYx c42601rYx) {
        Intrinsics.checkNotNullParameter(rxq, "");
        Intrinsics.checkNotNullParameter(c42601rYx, "");
        this.EZpvd = rxq;
        this.KWHzl = c42601rYx;
    }

    public static /* synthetic */ java.lang.Object execute$default(C42607rZc c42607rZc, java.lang.String str, boolean z, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return c42607rZc.copydefault(str, z, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull java.lang.String str, boolean z, @NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        MarkNotificationConversationAsViewedUseCase$execute$1 markNotificationConversationAsViewedUseCase$execute$1;
        C42607rZc c42607rZc;
        if (continuation instanceof MarkNotificationConversationAsViewedUseCase$execute$1) {
            markNotificationConversationAsViewedUseCase$execute$1 = (MarkNotificationConversationAsViewedUseCase$execute$1) continuation;
            int i = markNotificationConversationAsViewedUseCase$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                markNotificationConversationAsViewedUseCase$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                markNotificationConversationAsViewedUseCase$execute$1 = new MarkNotificationConversationAsViewedUseCase$execute$1(this, continuation);
            }
        }
        java.lang.Object obj = markNotificationConversationAsViewedUseCase$execute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = markNotificationConversationAsViewedUseCase$execute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            NotificationViewAllRequest notificationViewAllRequest = new NotificationViewAllRequest(str);
            C42601rYx c42601rYx = this.KWHzl;
            markNotificationConversationAsViewedUseCase$execute$1.L$0 = this;
            markNotificationConversationAsViewedUseCase$execute$1.Z$0 = z;
            markNotificationConversationAsViewedUseCase$execute$1.label = 1;
            if (c42601rYx.OLrzqt(notificationViewAllRequest, markNotificationConversationAsViewedUseCase$execute$1) == objCopydefault) {
                return objCopydefault;
            }
            c42607rZc = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = markNotificationConversationAsViewedUseCase$execute$1.Z$0;
            c42607rZc = (C42607rZc) markNotificationConversationAsViewedUseCase$execute$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        if (z) {
            c42607rZc.EZpvd.KWHzl();
        }
        return C56443yFo.KWHzl(true);
    }
}
