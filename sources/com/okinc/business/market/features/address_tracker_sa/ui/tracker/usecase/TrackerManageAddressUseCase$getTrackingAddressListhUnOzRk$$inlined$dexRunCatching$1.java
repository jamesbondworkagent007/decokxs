package com.okinc.business.market.features.address_tracker_sa.ui.tracker.usecase;

import com.okinc.business.market.data.constant.AddressTrackerSortType;
import com.okinc.business.market.data.model.GetTrackingAddressListResponse;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C25749jEy;
import o.C56391yDq;
import o.C56442yFn;
import o.jEA;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.business.market.features.address_tracker_sa.ui.tracker.usecase.TrackerManageAddressUseCase$getTrackingAddressList-hUnOzRk$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class TrackerManageAddressUseCase$getTrackingAddressListhUnOzRk$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends GetTrackingAddressListResponse>>, Object> {
    final /* synthetic */ Long $groupKey$inlined;
    final /* synthetic */ boolean $isAsc$inlined;
    final /* synthetic */ int $pageNum$inlined;
    final /* synthetic */ AddressTrackerSortType $sortType$inlined;
    final /* synthetic */ String $walletAddress$inlined;
    int label;
    final /* synthetic */ C25749jEy this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackerManageAddressUseCase$getTrackingAddressListhUnOzRk$$inlined$dexRunCatching$1(Continuation continuation, C25749jEy c25749jEy, String str, Long l, int i, AddressTrackerSortType addressTrackerSortType, boolean z) {
        super(2, continuation);
        this.this$0 = c25749jEy;
        this.$walletAddress$inlined = str;
        this.$groupKey$inlined = l;
        this.$pageNum$inlined = i;
        this.$sortType$inlined = addressTrackerSortType;
        this.$isAsc$inlined = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TrackerManageAddressUseCase$getTrackingAddressListhUnOzRk$$inlined$dexRunCatching$1(continuation, this.this$0, this.$walletAddress$inlined, this.$groupKey$inlined, this.$pageNum$inlined, this.$sortType$inlined, this.$isAsc$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends GetTrackingAddressListResponse>> continuation) {
        return ((TrackerManageAddressUseCase$getTrackingAddressListhUnOzRk$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                Long l = this.$groupKey$inlined;
                int i2 = this.$pageNum$inlined;
                AddressTrackerSortType addressTrackerSortType = this.$sortType$inlined;
                boolean z = this.$isAsc$inlined;
                this.label = 1;
                obj = jea.OLrzqt(str, l, i2, 100, addressTrackerSortType, z, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            objM7377constructorimpl = Result.m7377constructorimpl(((AbstractC43419rot) obj).AEQbTJ());
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
