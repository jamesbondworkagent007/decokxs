package com.okinc.business.market.features.address_tracker.repo;

import com.okinc.business.market.data.model.BatchImportAddressData;
import com.okinc.business.market.data.model.BatchImportAddressListRequest;
import com.okinc.business.market.data.model.BatchImportAddressListResponse;
import com.okinc.network.okg.response.ResponseData;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C25642jAz;
import o.C25653jBj;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.InterfaceC27595jyE;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.business.market.features.address_tracker.repo.TrackingAddressRepo$batchImportAddressList-yxL6bBk$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class TrackingAddressRepo$batchImportAddressListyxL6bBk$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends BatchImportAddressListResponse>>, Object> {
    final /* synthetic */ List $addressList$inlined;
    final /* synthetic */ int $groupId$inlined;
    final /* synthetic */ String $jwt$inlined;
    final /* synthetic */ String $walletAddress$inlined;
    int label;
    final /* synthetic */ C25653jBj this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackingAddressRepo$batchImportAddressListyxL6bBk$$inlined$dexRunCatching$1(Continuation continuation, String str, int i, List list, C25653jBj c25653jBj, String str2) {
        super(2, continuation);
        this.$walletAddress$inlined = str;
        this.$groupId$inlined = i;
        this.$addressList$inlined = list;
        this.this$0 = c25653jBj;
        this.$jwt$inlined = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TrackingAddressRepo$batchImportAddressListyxL6bBk$$inlined$dexRunCatching$1(continuation, this.$walletAddress$inlined, this.$groupId$inlined, this.$addressList$inlined, this.this$0, this.$jwt$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends BatchImportAddressListResponse>> continuation) {
        return ((TrackingAddressRepo$batchImportAddressListyxL6bBk$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                String str = this.$walletAddress$inlined;
                int i2 = this.$groupId$inlined;
                List<C25642jAz> list = this.$addressList$inlined;
                ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
                for (C25642jAz c25642jAz : list) {
                    arrayList.add(new BatchImportAddressData(c25642jAz.copydefault(), c25642jAz.KWHzl()));
                }
                BatchImportAddressListRequest batchImportAddressListRequest = new BatchImportAddressListRequest(str, i2, arrayList);
                InterfaceC27595jyE interfaceC27595jyE = this.this$0.KWHzl;
                String str2 = this.$jwt$inlined;
                this.label = 1;
                obj = interfaceC27595jyE.EZpvd(str2, batchImportAddressListRequest, this);
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
