package com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.notificationcenter.viewmodel;

import com.okinc.okcomponents.feature.oknotificationcenter.api.business.notificationmessage.model.SystemNotification;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C42584rYg;
import o.C42590rYm;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;
import o.rYU;
import o.yDY;

/* JADX INFO: loaded from: classes10.dex */
public final class NotificationCenterViewModel$loadNotificationList$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isLoadMore;
    final /* synthetic */ boolean $isRefresh;
    final /* synthetic */ Ref.ObjectRef<Job> $loadingJob;
    final /* synthetic */ Long $maxPushTimestamp;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ NotificationCenterViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationCenterViewModel$loadNotificationList$2(NotificationCenterViewModel notificationCenterViewModel, Long l, boolean z, Ref.ObjectRef<Job> objectRef, boolean z2, Continuation<? super NotificationCenterViewModel$loadNotificationList$2> continuation) {
        super(2, continuation);
        this.this$0 = notificationCenterViewModel;
        this.$maxPushTimestamp = l;
        this.$isLoadMore = z;
        this.$loadingJob = objectRef;
        this.$isRefresh = z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        NotificationCenterViewModel$loadNotificationList$2 notificationCenterViewModel$loadNotificationList$2 = new NotificationCenterViewModel$loadNotificationList$2(this.this$0, this.$maxPushTimestamp, this.$isLoadMore, this.$loadingJob, this.$isRefresh, continuation);
        notificationCenterViewModel$loadNotificationList$2.L$0 = obj;
        return notificationCenterViewModel$loadNotificationList$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((NotificationCenterViewModel$loadNotificationList$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objAEQbTJ;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objAEQbTJ = obj;
            } else {
                C56391yDq.AEQbTJ(obj);
                NotificationCenterViewModel notificationCenterViewModel = this.this$0;
                Long l = this.$maxPushTimestamp;
                Result.Application application = Result.Companion;
                rYU ryu = notificationCenterViewModel.AkhnZx;
                String strKWHzl = notificationCenterViewModel.KWHzl();
                Integer numAEQbTJ = C56443yFo.AEQbTJ(20);
                this.label = 1;
                objAEQbTJ = ryu.AEQbTJ(strKWHzl, l, numAEQbTJ, this);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
            }
            objM7377constructorimpl = Result.m7377constructorimpl((List) objAEQbTJ);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        Long l2 = this.$maxPushTimestamp;
        boolean z = this.$isLoadMore;
        Ref.ObjectRef<Job> objectRef = this.$loadingJob;
        boolean z2 = this.$isRefresh;
        NotificationCenterViewModel notificationCenterViewModel2 = this.this$0;
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            List list = (List) objM7377constructorimpl;
            pUU.KWHzl("NotificationCenterViewModel", "loadNotificationList => maxPushTimeStamp:" + l2 + ", isLoadMore:" + z + " => success with list size:" + list.size());
            Job job = objectRef.element;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            if (!z2 && !z) {
                notificationCenterViewModel2.getNewProxyInstance();
            }
            notificationCenterViewModel2.zLjUOn();
            List listDjBIcL = z ? CollectionsKt___CollectionsKt.djBIcL((Collection) ((C42584rYg) notificationCenterViewModel2.djBIcL.getValue()).OLrzqt(), (Iterable) list) : list;
            notificationCenterViewModel2.djBIcL.setValue(new C42584rYg(false, listDjBIcL, list.size() == 20, false, false, false, 16, null));
            if (!z) {
                if (!list.isEmpty()) {
                    notificationCenterViewModel2.fJNWhG.OLrzqt(C42590rYm.OLrzqt.copydefault(notificationCenterViewModel2.AhwBna));
                }
                MutableStateFlow mutableStateFlow = notificationCenterViewModel2.valueOf;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : listDjBIcL) {
                    Integer readStatus = ((SystemNotification) obj2).getReadStatus();
                    if (readStatus != null && readStatus.intValue() == 0) {
                        arrayList.add(obj2);
                    }
                }
                mutableStateFlow.setValue(C56443yFo.AEQbTJ(arrayList.size()));
                notificationCenterViewModel2.uzCIH();
            }
        }
        Ref.ObjectRef<Job> objectRef2 = this.$loadingJob;
        boolean z3 = this.$isRefresh;
        NotificationCenterViewModel notificationCenterViewModel3 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            Job job2 = objectRef2.element;
            if (job2 != null) {
                Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
            }
            if (!z3) {
                notificationCenterViewModel3.getNewProxyInstance();
            }
            notificationCenterViewModel3.zLjUOn();
            pUU.copydefault("NotificationCenterViewModel", "loadNotificationList error: " + thM7380exceptionOrNullimpl.getMessage());
            notificationCenterViewModel3.OLrzqt.setValue(thM7380exceptionOrNullimpl.getMessage());
            notificationCenterViewModel3.djBIcL.setValue(new C42584rYg(false, yDY.AhwBna(), false, true, false, false, 48, null));
        }
        return Unit.INSTANCE;
    }
}
