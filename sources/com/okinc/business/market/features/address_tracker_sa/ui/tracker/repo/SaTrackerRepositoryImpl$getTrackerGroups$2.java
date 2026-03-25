package com.okinc.business.market.features.address_tracker_sa.ui.tracker.repo;

import com.okinc.business.market.data.model.GetTrackingAddressGroup;
import com.okinc.network.okg.response.ResponseData;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC27595jyE;
import o.jEC;

/* JADX INFO: loaded from: classes6.dex */
public final class SaTrackerRepositoryImpl$getTrackerGroups$2 extends SuspendLambda implements Function1<Continuation<? super ResponseData<List<? extends GetTrackingAddressGroup>>>, Object> {
    final /* synthetic */ String $walletAddress;
    int label;
    final /* synthetic */ jEC this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SaTrackerRepositoryImpl$getTrackerGroups$2(jEC jec, String str, Continuation<? super SaTrackerRepositoryImpl$getTrackerGroups$2> continuation) {
        super(1, continuation);
        this.this$0 = jec;
        this.$walletAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new SaTrackerRepositoryImpl$getTrackerGroups$2(this.this$0, this.$walletAddress, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Continuation<? super ResponseData<List<? extends GetTrackingAddressGroup>>> continuation) {
        return invoke2((Continuation<? super ResponseData<List<GetTrackingAddressGroup>>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Continuation<? super ResponseData<List<GetTrackingAddressGroup>>> continuation) {
        return ((SaTrackerRepositoryImpl$getTrackerGroups$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC27595jyE interfaceC27595jyE = this.this$0.EZpvd;
            String str = this.$walletAddress;
            this.label = 1;
            obj = interfaceC27595jyE.valueOf(str, this);
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
