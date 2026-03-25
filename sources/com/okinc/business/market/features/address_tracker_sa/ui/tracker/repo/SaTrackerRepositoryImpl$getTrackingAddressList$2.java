package com.okinc.business.market.features.address_tracker_sa.ui.tracker.repo;

import com.okinc.business.market.data.constant.AddressTrackerSortType;
import com.okinc.business.market.data.model.GetTrackingAddressListResponse;
import com.okinc.network.okg.response.ResponseData;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C27603jyM;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC27595jyE;
import o.jEC;

/* JADX INFO: loaded from: classes6.dex */
public final class SaTrackerRepositoryImpl$getTrackingAddressList$2 extends SuspendLambda implements Function1<Continuation<? super ResponseData<GetTrackingAddressListResponse>>, Object> {
    final /* synthetic */ String $address;
    final /* synthetic */ Long $groupId;
    final /* synthetic */ boolean $isAsc;
    final /* synthetic */ int $pageNum;
    final /* synthetic */ int $pageSize;
    final /* synthetic */ AddressTrackerSortType $sortType;
    int label;
    final /* synthetic */ jEC this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SaTrackerRepositoryImpl$getTrackingAddressList$2(String str, Long l, int i, int i2, AddressTrackerSortType addressTrackerSortType, boolean z, jEC jec, Continuation<? super SaTrackerRepositoryImpl$getTrackingAddressList$2> continuation) {
        super(1, continuation);
        this.$address = str;
        this.$groupId = l;
        this.$pageNum = i;
        this.$pageSize = i2;
        this.$sortType = addressTrackerSortType;
        this.$isAsc = z;
        this.this$0 = jec;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new SaTrackerRepositoryImpl$getTrackingAddressList$2(this.$address, this.$groupId, this.$pageNum, this.$pageSize, this.$sortType, this.$isAsc, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super ResponseData<GetTrackingAddressListResponse>> continuation) {
        return ((SaTrackerRepositoryImpl$getTrackingAddressList$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C27603jyM c27603jyM = new C27603jyM(this.$address, this.$groupId, this.$pageNum, this.$pageSize, this.$sortType, this.$isAsc);
            InterfaceC27595jyE interfaceC27595jyE = this.this$0.EZpvd;
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
        return obj;
    }
}
