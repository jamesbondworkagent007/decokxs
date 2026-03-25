package com.okinc.business.market.features.address_tracker_sa.ui.tracker.usecase;

import com.okinc.business.market.data.model.GetTrackingAddressGroup;
import com.okinc.business.market.features.address_tracker_sa.ui.user_management.manage.TrackerAddressGroupUIModel;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C25749jEy;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.jEA;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.business.market.features.address_tracker_sa.ui.tracker.usecase.TrackerManageAddressUseCase$getTrackingGroupsList-gIAlu-s$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class TrackerManageAddressUseCase$getTrackingGroupsListgIAlus$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends List<? extends TrackerAddressGroupUIModel>>>, Object> {
    final /* synthetic */ String $walletAddress$inlined;
    int label;
    final /* synthetic */ C25749jEy this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackerManageAddressUseCase$getTrackingGroupsListgIAlus$$inlined$dexRunCatching$1(Continuation continuation, C25749jEy c25749jEy, String str) {
        super(2, continuation);
        this.this$0 = c25749jEy;
        this.$walletAddress$inlined = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TrackerManageAddressUseCase$getTrackingGroupsListgIAlus$$inlined$dexRunCatching$1(continuation, this.this$0, this.$walletAddress$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends List<? extends TrackerAddressGroupUIModel>>> continuation) {
        return ((TrackerManageAddressUseCase$getTrackingGroupsListgIAlus$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Result.Application application = Result.Companion;
                jEA jea = this.this$0.copydefault;
                String str = this.$walletAddress$inlined;
                this.label = 1;
                obj = jea.AEQbTJ(str, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            List<GetTrackingAddressGroup> listEZpvd = CollectionsKt___CollectionsKt.EZpvd((List) ((AbstractC43419rot) obj).AEQbTJ(), new C25749jEy.Activity());
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listEZpvd, 10));
            for (GetTrackingAddressGroup getTrackingAddressGroup : listEZpvd) {
                arrayList.add(new TrackerAddressGroupUIModel(getTrackingAddressGroup.AEQbTJ(), getTrackingAddressGroup.OLrzqt(), 0, getTrackingAddressGroup.KWHzl(), getTrackingAddressGroup.gEmmrt(), 0, false, false, 228, null));
            }
            objM7377constructorimpl = Result.m7377constructorimpl(arrayList);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            pUU.AEQbTJ("DEX", "dexRunCatching", th);
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
