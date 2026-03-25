package com.okinc.im.imui.messageV2.view.banner.joinreview;

import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.SavedStateHandle;
import com.okinc.okimcore.model.other.GroupInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.AbstractC33073mpa;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.oDI;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class PendingJoinReviewsBannerViewModel extends AbstractC33073mpa {
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public final SavedStateHandle AEQbTJ;
    public final LiveData<Integer> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Integer> OLrzqt() {
        return this.copydefault;
    }

    @yCM
    public PendingJoinReviewsBannerViewModel(@NotNull SavedStateHandle savedStateHandle, @NotNull oDI odi) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(odi, "");
        this.AEQbTJ = savedStateHandle;
        this.copydefault = FlowLiveDataConversions.asLiveData$default(FlowKt.distinctUntilChanged(FlowKt.transformLatest(new ActionBar(FlowKt.filterNotNull(savedStateHandle.getStateFlow("KEY_GROUP_ID", null))), new PendingJoinReviewsBannerViewModel$special$$inlined$flatMapLatest$1(null, odi))), (CoroutineContext) null, 0L, 3, (Object) null);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.messageV2.view.banner.joinreview.PendingJoinReviewsBannerViewModel.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public final void EZpvd(Long l) {
        this.AEQbTJ.set("KEY_GROUP_ID", l);
    }

    public static final class ActionBar implements Flow<Long> {
        public final /* synthetic */ Flow AEQbTJ;

        /* JADX INFO: renamed from: com.okinc.im.imui.messageV2.view.banner.joinreview.PendingJoinReviewsBannerViewModel$ActionBar$3, reason: invalid class name */
        public static final class AnonymousClass3<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass3(FlowCollector flowCollector) {
                this.AEQbTJ = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                PendingJoinReviewsBannerViewModel$special$$inlined$filter$1$2$1 pendingJoinReviewsBannerViewModel$special$$inlined$filter$1$2$1;
                if (continuation instanceof PendingJoinReviewsBannerViewModel$special$$inlined$filter$1$2$1) {
                    pendingJoinReviewsBannerViewModel$special$$inlined$filter$1$2$1 = (PendingJoinReviewsBannerViewModel$special$$inlined$filter$1$2$1) continuation;
                    int i = pendingJoinReviewsBannerViewModel$special$$inlined$filter$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        pendingJoinReviewsBannerViewModel$special$$inlined$filter$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        pendingJoinReviewsBannerViewModel$special$$inlined$filter$1$2$1 = new PendingJoinReviewsBannerViewModel$special$$inlined$filter$1$2$1(this, continuation);
                    }
                }
                Object obj2 = pendingJoinReviewsBannerViewModel$special$$inlined$filter$1$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = pendingJoinReviewsBannerViewModel$special$$inlined$filter$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.AEQbTJ;
                    if (((Number) obj).longValue() >= 0) {
                        pendingJoinReviewsBannerViewModel$special$$inlined$filter$1$2$1.label = 1;
                        if (flowCollector.emit(obj, pendingJoinReviewsBannerViewModel$special$$inlined$filter$1$2$1) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public ActionBar(Flow flow) {
            this.AEQbTJ = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super Long> flowCollector, Continuation continuation) {
            Object objCollect = this.AEQbTJ.collect(new AnonymousClass3(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public static final class TaskDescription implements Flow<Integer> {
        public final /* synthetic */ Flow OLrzqt;

        /* JADX INFO: renamed from: com.okinc.im.imui.messageV2.view.banner.joinreview.PendingJoinReviewsBannerViewModel$TaskDescription$2, reason: invalid class name */
        public static final class AnonymousClass2<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass2(FlowCollector flowCollector) {
                this.OLrzqt = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                PendingJoinReviewsBannerViewModel$pendingReviewsCount$lambda$2$$inlined$map$1$2$1 pendingJoinReviewsBannerViewModel$pendingReviewsCount$lambda$2$$inlined$map$1$2$1;
                if (continuation instanceof PendingJoinReviewsBannerViewModel$pendingReviewsCount$lambda$2$$inlined$map$1$2$1) {
                    pendingJoinReviewsBannerViewModel$pendingReviewsCount$lambda$2$$inlined$map$1$2$1 = (PendingJoinReviewsBannerViewModel$pendingReviewsCount$lambda$2$$inlined$map$1$2$1) continuation;
                    int i = pendingJoinReviewsBannerViewModel$pendingReviewsCount$lambda$2$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        pendingJoinReviewsBannerViewModel$pendingReviewsCount$lambda$2$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        pendingJoinReviewsBannerViewModel$pendingReviewsCount$lambda$2$$inlined$map$1$2$1 = new PendingJoinReviewsBannerViewModel$pendingReviewsCount$lambda$2$$inlined$map$1$2$1(this, continuation);
                    }
                }
                Object obj2 = pendingJoinReviewsBannerViewModel$pendingReviewsCount$lambda$2$$inlined$map$1$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = pendingJoinReviewsBannerViewModel$pendingReviewsCount$lambda$2$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.OLrzqt;
                    GroupInfo groupInfo = (GroupInfo) obj;
                    Integer numAEQbTJ = C56443yFo.AEQbTJ(groupInfo.getReviewJoinApplications() ? groupInfo.getPendingJoinRequests() : 0);
                    pendingJoinReviewsBannerViewModel$pendingReviewsCount$lambda$2$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(numAEQbTJ, pendingJoinReviewsBannerViewModel$pendingReviewsCount$lambda$2$$inlined$map$1$2$1) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public TaskDescription(Flow flow) {
            this.OLrzqt = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super Integer> flowCollector, Continuation continuation) {
            Object objCollect = this.OLrzqt.collect(new AnonymousClass2(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }
}
