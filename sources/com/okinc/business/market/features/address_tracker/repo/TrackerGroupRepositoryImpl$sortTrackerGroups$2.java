package com.okinc.business.market.features.address_tracker.repo;

import com.okinc.business.market.data.model.watchlist.TrackerGroupSortingRequest;
import com.okinc.business.market.features.identity.domain.DexUserIdentity;
import com.okinc.network.okg.response.ResponseData;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C25650jBg;
import o.C28586kda;
import o.C28603kdr;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC27595jyE;

/* JADX INFO: loaded from: classes6.dex */
public final class TrackerGroupRepositoryImpl$sortTrackerGroups$2 extends SuspendLambda implements Function1<Continuation<? super ResponseData<Unit>>, Object> {
    final /* synthetic */ List<Integer> $groupIds;
    final /* synthetic */ String $walletAddress;
    int label;
    final /* synthetic */ C25650jBg this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackerGroupRepositoryImpl$sortTrackerGroups$2(C25650jBg c25650jBg, String str, List<Integer> list, Continuation<? super TrackerGroupRepositoryImpl$sortTrackerGroups$2> continuation) {
        super(1, continuation);
        this.this$0 = c25650jBg;
        this.$walletAddress = str;
        this.$groupIds = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new TrackerGroupRepositoryImpl$sortTrackerGroups$2(this.this$0, this.$walletAddress, this.$groupIds, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super ResponseData<Unit>> continuation) {
        return ((TrackerGroupRepositoryImpl$sortTrackerGroups$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007d A[PHI: r7
  0x007d: PHI (r7v13 java.lang.Object) = (r7v11 java.lang.Object), (r7v0 java.lang.Object) binds: [B:22:0x007a, B:7:0x0011] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objOLrzqt;
        Object objAEQbTJ;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C28586kda c28586kda = this.this$0.copydefault;
            this.label = 1;
            objOLrzqt = c28586kda.OLrzqt(this);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        C56391yDq.AEQbTJ(obj);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objAEQbTJ = ((Result) obj).m7386unboximpl();
                if (Result.m7383isFailureimpl(objAEQbTJ)) {
                    objAEQbTJ = "";
                }
                InterfaceC27595jyE interfaceC27595jyE = this.this$0.AEQbTJ;
                TrackerGroupSortingRequest trackerGroupSortingRequest = new TrackerGroupSortingRequest(this.$walletAddress, this.$groupIds);
                this.label = 3;
                obj = interfaceC27595jyE.copydefault((String) objAEQbTJ, trackerGroupSortingRequest, this);
                return obj != objCopydefault ? objCopydefault : obj;
            }
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(objOLrzqt);
        String strEZpvd = ((DexUserIdentity) objOLrzqt).EZpvd();
        C28603kdr c28603kdr = this.this$0.OLrzqt;
        this.label = 2;
        objAEQbTJ = c28603kdr.AEQbTJ(strEZpvd, this);
        if (objAEQbTJ == objCopydefault) {
            return objCopydefault;
        }
        if (Result.m7383isFailureimpl(objAEQbTJ)) {
        }
        InterfaceC27595jyE interfaceC27595jyE2 = this.this$0.AEQbTJ;
        TrackerGroupSortingRequest trackerGroupSortingRequest2 = new TrackerGroupSortingRequest(this.$walletAddress, this.$groupIds);
        this.label = 3;
        obj = interfaceC27595jyE2.copydefault((String) objAEQbTJ, trackerGroupSortingRequest2, this);
        if (obj != objCopydefault) {
        }
    }
}
