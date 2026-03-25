package com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.notificationcenter.viewmodel;

import androidx.lifecycle.SavedStateHandle;
import com.okinc.okcomponents.feature.oknotificationcenter.api.business.notificationmessage.model.NotificationCategoryBean;
import com.okinc.okcomponents.feature.oknotificationcenter.api.business.systempush.model.NotificationCategory;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C42584rYg;
import o.C44646sap;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.pUU;
import o.rYW;
import o.yDY;

/* JADX INFO: loaded from: classes10.dex */
public final class NotificationCenterViewModel$loadRemoteCategoryList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ NotificationCenterViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationCenterViewModel$loadRemoteCategoryList$1(NotificationCenterViewModel notificationCenterViewModel, Continuation<? super NotificationCenterViewModel$loadRemoteCategoryList$1> continuation) {
        super(2, continuation);
        this.this$0 = notificationCenterViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        NotificationCenterViewModel$loadRemoteCategoryList$1 notificationCenterViewModel$loadRemoteCategoryList$1 = new NotificationCenterViewModel$loadRemoteCategoryList$1(this.this$0, continuation);
        notificationCenterViewModel$loadRemoteCategoryList$1.L$0 = obj;
        return notificationCenterViewModel$loadRemoteCategoryList$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((NotificationCenterViewModel$loadRemoteCategoryList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            } else {
                C56391yDq.AEQbTJ(obj);
                NotificationCenterViewModel notificationCenterViewModel = this.this$0;
                Result.Application application = Result.Companion;
                rYW ryw = notificationCenterViewModel.DbNXlk;
                boolean zFetchVPNInfo = notificationCenterViewModel.fetchVPNInfo();
                this.label = 1;
                obj = ryw.AEQbTJ(zFetchVPNInfo, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            }
            objM7377constructorimpl = Result.m7377constructorimpl((List) obj);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        NotificationCenterViewModel notificationCenterViewModel2 = this.this$0;
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            List<NotificationCategoryBean> list = (List) objM7377constructorimpl;
            notificationCenterViewModel2.getFieldNames();
            if (list.isEmpty()) {
                if (notificationCenterViewModel2.iwGUEr.fIwbmz()) {
                    SavedStateHandle savedStateHandle = notificationCenterViewModel2.getNewProxyInstance;
                    NotificationCategory notificationCategory = NotificationCategory.All;
                    savedStateHandle.set("ARG_SELECTED_CATEGORY", notificationCategory.getValue());
                    notificationCenterViewModel2.getNewProxyInstance.set("ARG_MARK_READ_CATEGORY", notificationCategory.getValue());
                } else {
                    notificationCenterViewModel2.getNewProxyInstance.set("ARG_SELECTED_CATEGORY", null);
                }
                NotificationCenterViewModel.loadNotificationList$default(notificationCenterViewModel2, null, false, false, 7, null);
                notificationCenterViewModel2.fJNWhG.AEQbTJ(notificationCenterViewModel2.KWHzl());
            } else {
                String str = (String) notificationCenterViewModel2.getNewProxyInstance.get("ARG_TAB_NAVIGATION_CATEGORY_ID");
                if (str == null) {
                    NotificationCategoryBean notificationCategoryBean = (NotificationCategoryBean) CollectionsKt___CollectionsKt.firstOrNull(list);
                    String id = notificationCategoryBean != null ? notificationCategoryBean.getId() : null;
                    str = id == null ? "" : id;
                }
                ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
                for (NotificationCategoryBean notificationCategoryBean2 : list) {
                    arrayList.add(new C44646sap(notificationCategoryBean2, Intrinsics.EZpvd((Object) notificationCategoryBean2.getId(), (Object) str)));
                }
                notificationCenterViewModel2.EZpvd(str, arrayList);
            }
        }
        NotificationCenterViewModel notificationCenterViewModel3 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.copydefault("NotificationCenterViewModel", "loadCategoryTypeList error: " + thM7380exceptionOrNullimpl.getMessage());
            notificationCenterViewModel3.iwGUEr();
            notificationCenterViewModel3.OLrzqt.setValue(thM7380exceptionOrNullimpl.getMessage());
            notificationCenterViewModel3.KWHzl.setValue(yDY.AhwBna());
            notificationCenterViewModel3.djBIcL.setValue(new C42584rYg(false, yDY.AhwBna(), false, true, false, false, 48, null));
        }
        return Unit.INSTANCE;
    }
}
