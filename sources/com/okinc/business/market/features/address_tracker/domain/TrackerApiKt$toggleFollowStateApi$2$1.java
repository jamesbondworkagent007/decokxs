package com.okinc.business.market.features.address_tracker.domain;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.okinc.business.market.features.identity.domain.DexUserIdentity;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C25640jAx;
import o.C28603kdr;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.jAF;
import o.jAK;
import o.jAL;
import o.jAT;

/* JADX INFO: loaded from: classes6.dex */
public final class TrackerApiKt$toggleFollowStateApi$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C25640jAx $addressTrackerNotificationUseCase;
    final /* synthetic */ jAF $batchUpdateTrackerGroupUseCase;
    final /* synthetic */ Bundle $bundle;
    final /* synthetic */ Function1<Boolean, Unit> $callback;
    final /* synthetic */ String $collectAddress;
    final /* synthetic */ Context $context;
    final /* synthetic */ DexUserIdentity $dexId;
    final /* synthetic */ FragmentManager $fragmentManager;
    final /* synthetic */ jAK $getSelectedGroupsUseCase;
    final /* synthetic */ jAL $getTrackingGroupsListUseCase;
    final /* synthetic */ String $holderAddress;
    final /* synthetic */ C28603kdr $jwtUseCase;
    final /* synthetic */ boolean $showToast;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r13v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TrackerApiKt$toggleFollowStateApi$2$1(C28603kdr c28603kdr, String str, DexUserIdentity dexUserIdentity, Bundle bundle, jAL jal, jAK jak, jAF jaf, C25640jAx c25640jAx, FragmentManager fragmentManager, String str2, Context context, boolean z, Function1<? super Boolean, Unit> function1, Continuation<? super TrackerApiKt$toggleFollowStateApi$2$1> continuation) {
        super(2, continuation);
        this.$jwtUseCase = c28603kdr;
        this.$holderAddress = str;
        this.$dexId = dexUserIdentity;
        this.$bundle = bundle;
        this.$getTrackingGroupsListUseCase = jal;
        this.$getSelectedGroupsUseCase = jak;
        this.$batchUpdateTrackerGroupUseCase = jaf;
        this.$addressTrackerNotificationUseCase = c25640jAx;
        this.$fragmentManager = fragmentManager;
        this.$collectAddress = str2;
        this.$context = context;
        this.$showToast = z;
        this.$callback = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TrackerApiKt$toggleFollowStateApi$2$1(this.$jwtUseCase, this.$holderAddress, this.$dexId, this.$bundle, this.$getTrackingGroupsListUseCase, this.$getSelectedGroupsUseCase, this.$batchUpdateTrackerGroupUseCase, this.$addressTrackerNotificationUseCase, this.$fragmentManager, this.$collectAddress, this.$context, this.$showToast, this.$callback, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TrackerApiKt$toggleFollowStateApi$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objKWHzl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C28603kdr c28603kdr = this.$jwtUseCase;
            String str = this.$holderAddress;
            long jOLrzqt = this.$dexId.OLrzqt();
            Bundle bundle = this.$bundle;
            this.label = 1;
            objKWHzl = c28603kdr.KWHzl(str, jOLrzqt, bundle, this);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            objKWHzl = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7380exceptionOrNullimpl(objKWHzl) != null) {
            objKWHzl = C56443yFo.KWHzl(false);
        }
        Boolean bool = (Boolean) objKWHzl;
        if (bool != null && bool.booleanValue()) {
            jAL jal = this.$getTrackingGroupsListUseCase;
            jAK jak = this.$getSelectedGroupsUseCase;
            jAF jaf = this.$batchUpdateTrackerGroupUseCase;
            C25640jAx c25640jAx = this.$addressTrackerNotificationUseCase;
            String str2 = this.$holderAddress;
            FragmentManager fragmentManager = this.$fragmentManager;
            String str3 = this.$collectAddress;
            Context context = this.$context;
            boolean z = this.$showToast;
            Function1<Boolean, Unit> function1 = this.$callback;
            this.label = 2;
            if (jAT.OLrzqt(jal, jak, jaf, c25640jAx, str2, fragmentManager, str3, context, z, (Function1<? super Boolean, Unit>) function1, (Continuation<? super Unit>) this) == objCopydefault) {
                return objCopydefault;
            }
        }
        return Unit.INSTANCE;
    }
}
