package com.okinc.business.market.features.address_tracker.repo;

import com.okinc.business.market.data.constant.AddressTrackerSortType;
import com.okinc.business.market.data.model.GetTrackingAddressListResponse;
import com.okinc.network.okg.response.ResponseData;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C25653jBj;
import o.C27603jyM;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC27595jyE;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.business.market.features.address_tracker.repo.TrackingAddressRepo$getTrackingAddressList-bMdYcbs$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class TrackingAddressRepo$getTrackingAddressListbMdYcbs$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends GetTrackingAddressListResponse>>, Object> {
    final /* synthetic */ String $address$inlined;
    final /* synthetic */ Long $groupId$inlined;
    final /* synthetic */ boolean $isAsc$inlined;
    final /* synthetic */ int $pageNum$inlined;
    final /* synthetic */ int $pageSize$inlined;
    final /* synthetic */ AddressTrackerSortType $sortType$inlined;
    int label;
    final /* synthetic */ C25653jBj this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackingAddressRepo$getTrackingAddressListbMdYcbs$$inlined$dexRunCatching$1(Continuation continuation, String str, Long l, int i, int i2, AddressTrackerSortType addressTrackerSortType, boolean z, C25653jBj c25653jBj) {
        super(2, continuation);
        this.$address$inlined = str;
        this.$groupId$inlined = l;
        this.$pageNum$inlined = i;
        this.$pageSize$inlined = i2;
        this.$sortType$inlined = addressTrackerSortType;
        this.$isAsc$inlined = z;
        this.this$0 = c25653jBj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TrackingAddressRepo$getTrackingAddressListbMdYcbs$$inlined$dexRunCatching$1(continuation, this.$address$inlined, this.$groupId$inlined, this.$pageNum$inlined, this.$pageSize$inlined, this.$sortType$inlined, this.$isAsc$inlined, this.this$0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends GetTrackingAddressListResponse>> continuation) {
        return ((TrackingAddressRepo$getTrackingAddressListbMdYcbs$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                C27603jyM c27603jyM = new C27603jyM(this.$address$inlined, this.$groupId$inlined, this.$pageNum$inlined, this.$pageSize$inlined, this.$sortType$inlined, this.$isAsc$inlined);
                InterfaceC27595jyE interfaceC27595jyE = this.this$0.KWHzl;
                Map<String, String> mapKWHzl = c27603jyM.KWHzl();
                this.label = 1;
                obj = interfaceC27595jyE.djBIcL(mapKWHzl, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            Object data = ((ResponseData) obj).getData();
            Intrinsics.copydefault(data);
            objM7377constructorimpl = Result.m7377constructorimpl(data);
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
