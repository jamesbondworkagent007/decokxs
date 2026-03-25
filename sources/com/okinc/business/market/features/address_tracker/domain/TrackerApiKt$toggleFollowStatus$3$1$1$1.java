package com.okinc.business.market.features.address_tracker.domain;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C25640jAx;
import o.C56391yDq;
import o.C56442yFn;
import o.jAF;
import o.jAK;
import o.jAL;
import o.jAT;

/* JADX INFO: loaded from: classes6.dex */
public final class TrackerApiKt$toggleFollowStatus$3$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C25640jAx $addressTrackerNotificationUseCase;
    final /* synthetic */ jAF $batchUpdateTrackerGroupUseCase;
    final /* synthetic */ Function1<Boolean, Unit> $callback;
    final /* synthetic */ String $collectAddress;
    final /* synthetic */ Context $context;
    final /* synthetic */ FragmentManager $fragmentManager;
    final /* synthetic */ jAK $getSelectedGroupsUseCase;
    final /* synthetic */ jAL $getTrackingGroupsListUseCase;
    final /* synthetic */ String $holderAddress;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TrackerApiKt$toggleFollowStatus$3$1$1$1(jAL jal, jAK jak, jAF jaf, C25640jAx c25640jAx, FragmentManager fragmentManager, String str, String str2, Context context, Function1<? super Boolean, Unit> function1, Continuation<? super TrackerApiKt$toggleFollowStatus$3$1$1$1> continuation) {
        super(2, continuation);
        this.$getTrackingGroupsListUseCase = jal;
        this.$getSelectedGroupsUseCase = jak;
        this.$batchUpdateTrackerGroupUseCase = jaf;
        this.$addressTrackerNotificationUseCase = c25640jAx;
        this.$fragmentManager = fragmentManager;
        this.$holderAddress = str;
        this.$collectAddress = str2;
        this.$context = context;
        this.$callback = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TrackerApiKt$toggleFollowStatus$3$1$1$1(this.$getTrackingGroupsListUseCase, this.$getSelectedGroupsUseCase, this.$batchUpdateTrackerGroupUseCase, this.$addressTrackerNotificationUseCase, this.$fragmentManager, this.$holderAddress, this.$collectAddress, this.$context, this.$callback, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TrackerApiKt$toggleFollowStatus$3$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            jAL jal = this.$getTrackingGroupsListUseCase;
            jAK jak = this.$getSelectedGroupsUseCase;
            jAF jaf = this.$batchUpdateTrackerGroupUseCase;
            C25640jAx c25640jAx = this.$addressTrackerNotificationUseCase;
            FragmentManager fragmentManager = this.$fragmentManager;
            String str = this.$holderAddress;
            String str2 = this.$collectAddress;
            Context context = this.$context;
            Function1<Boolean, Unit> function1 = this.$callback;
            this.label = 1;
            if (jAT.OLrzqt(jal, jak, jaf, c25640jAx, fragmentManager, str, str2, context, true, (Function1<? super Boolean, Unit>) function1, (Continuation<? super Unit>) this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
