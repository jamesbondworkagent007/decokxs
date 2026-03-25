package o;

import com.okinc.im.usecase.notification.FetchNotificationCategoriesUseCase$execute$1;
import com.okinc.okcomponents.feature.oknotificationcenter.api.business.notificationmessage.model.NotificationCategoryBean;
import com.okinc.okcomponents.feature.oknotificationcenter.api.business.notificationmessage.model.NotificationEntryPointEnum;
import com.okinc.okcomponents.feature.oknotificationcenter.api.business.systempush.model.NotificationCategory;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.rXL;
import o.sDX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oFg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35830oFg {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public final InterfaceC33171mrS KWHzl;
    public final rXQ copydefault;

    @yCM
    public C35830oFg(@NotNull rXQ rxq, @NotNull InterfaceC33171mrS interfaceC33171mrS) {
        Intrinsics.checkNotNullParameter(rxq, "");
        Intrinsics.checkNotNullParameter(interfaceC33171mrS, "");
        this.copydefault = rxq;
        this.KWHzl = interfaceC33171mrS;
    }

    /* JADX INFO: renamed from: o.oFg$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oFg.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        FetchNotificationCategoriesUseCase$execute$1 fetchNotificationCategoriesUseCase$execute$1;
        if (continuation instanceof FetchNotificationCategoriesUseCase$execute$1) {
            fetchNotificationCategoriesUseCase$execute$1 = (FetchNotificationCategoriesUseCase$execute$1) continuation;
            int i = fetchNotificationCategoriesUseCase$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchNotificationCategoriesUseCase$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchNotificationCategoriesUseCase$execute$1 = new FetchNotificationCategoriesUseCase$execute$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = fetchNotificationCategoriesUseCase$execute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = fetchNotificationCategoriesUseCase$execute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            pUU.KWHzl("FetchNotificationCategoriesUseCase", "execute...");
            NotificationEntryPointEnum notificationEntryPointEnum = this.KWHzl.fIwbmz() ? NotificationEntryPointEnum.WEB3 : NotificationEntryPointEnum.CEFI;
            rXQ rxq = this.copydefault;
            fetchNotificationCategoriesUseCase$execute$1.L$0 = this;
            fetchNotificationCategoriesUseCase$execute$1.label = 1;
            objEZpvd = rxq.EZpvd(notificationEntryPointEnum, fetchNotificationCategoriesUseCase$execute$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objEZpvd);
        }
        NotificationCategoryBean notificationCategoryBean = (NotificationCategoryBean) CollectionsKt___CollectionsKt.firstOrNull((java.util.List) objEZpvd);
        if (notificationCategoryBean != null) {
            java.lang.String id = notificationCategoryBean.getId();
            if ((id != null ? rXL.TaskDescription.putNotificationChannel$default(rXL.Companion, id, C33070mpX.AYXKKw(sDX.StateListAnimator.getNewProxyInstance), 0, true, 4, null) : null) == null) {
            }
        } else {
            rXL.TaskDescription.putNotificationChannel$default(rXL.Companion, NotificationCategory.AllExceptPriceAlert.getValue(), C33070mpX.AYXKKw(sDX.StateListAnimator.getNewProxyInstance), 0, true, 4, null);
        }
        rXL.TaskDescription.putNotificationChannel$default(rXL.Companion, NotificationCategory.PriceAlerts.getValue(), C33070mpX.AYXKKw(sDX.StateListAnimator.AEQbTJ), C52761wXj.TaskDescription.setProfilesSinceInitCount, false, 8, null);
        return Unit.INSTANCE;
    }
}
