package com.okinc.business.market.features.address_tracker.domain;

import com.okinc.business.market.data.constant.AddressTrackerSortType;
import com.okinc.business.market.data.model.GetTrackingAddressListResponse;
import com.okinc.business.market.data.model.TrackingAddressData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C25644jBa;
import o.C25653jBj;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.jAN;
import o.jAO;
import o.jAX;
import o.jAZ;
import o.pUU;
import o.xVW;

/* JADX INFO: renamed from: com.okinc.business.market.features.address_tracker.domain.GetTrackingAddressListUseCase$invoke-hUnOzRk$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class GetTrackingAddressListUseCase$invokehUnOzRk$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends jAX>>, Object> {
    final /* synthetic */ Integer $groupKey$inlined;
    final /* synthetic */ boolean $isAsc$inlined;
    final /* synthetic */ int $pageNum$inlined;
    final /* synthetic */ AddressTrackerSortType $sortType$inlined;
    final /* synthetic */ String $walletAddress$inlined;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ jAO this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetTrackingAddressListUseCase$invokehUnOzRk$$inlined$dexRunCatching$1(Continuation continuation, jAO jao, String str, Integer num, int i, AddressTrackerSortType addressTrackerSortType, boolean z) {
        super(2, continuation);
        this.this$0 = jao;
        this.$walletAddress$inlined = str;
        this.$groupKey$inlined = num;
        this.$pageNum$inlined = i;
        this.$sortType$inlined = addressTrackerSortType;
        this.$isAsc$inlined = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetTrackingAddressListUseCase$invokehUnOzRk$$inlined$dexRunCatching$1(continuation, this.this$0, this.$walletAddress$inlined, this.$groupKey$inlined, this.$pageNum$inlined, this.$sortType$inlined, this.$isAsc$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends jAX>> continuation) {
        return ((GetTrackingAddressListUseCase$invokehUnOzRk$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0098 A[Catch: all -> 0x00e2, CancellationException -> 0x00f9, TryCatch #2 {CancellationException -> 0x00f9, all -> 0x00e2, blocks: (B:7:0x001d, B:30:0x00b5, B:33:0x00bc, B:25:0x0092, B:27:0x0098, B:36:0x00c4, B:39:0x00d6, B:35:0x00c0, B:11:0x0030, B:17:0x0063, B:24:0x0084, B:20:0x0073, B:14:0x003d), top: B:47:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c0 A[Catch: all -> 0x00e2, CancellationException -> 0x00f9, TryCatch #2 {CancellationException -> 0x00f9, all -> 0x00e2, blocks: (B:7:0x001d, B:30:0x00b5, B:33:0x00bc, B:25:0x0092, B:27:0x0098, B:36:0x00c4, B:39:0x00d6, B:35:0x00c0, B:11:0x0030, B:17:0x0063, B:24:0x0084, B:20:0x0073, B:14:0x003d), top: B:47:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c4 A[Catch: all -> 0x00e2, CancellationException -> 0x00f9, TryCatch #2 {CancellationException -> 0x00f9, all -> 0x00e2, blocks: (B:7:0x001d, B:30:0x00b5, B:33:0x00bc, B:25:0x0092, B:27:0x0098, B:36:0x00c4, B:39:0x00d6, B:35:0x00c0, B:11:0x0030, B:17:0x0063, B:24:0x0084, B:20:0x0073, B:14:0x003d), top: B:47:0x0009 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00b2 -> B:30:0x00b5). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objEZpvd;
        int i;
        Collection arrayList;
        Iterator it;
        GetTrackingAddressListResponse getTrackingAddressListResponse;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = this.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            pUU.AEQbTJ("DEX", "dexRunCatching", th);
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            Result.Application application2 = Result.Companion;
            C25653jBj c25653jBj = this.this$0.AEQbTJ;
            String str = this.$walletAddress$inlined;
            Long lKWHzl = C56443yFo.KWHzl(C33129mqd.valueOf(this.$groupKey$inlined));
            int i3 = this.$pageNum$inlined;
            AddressTrackerSortType addressTrackerSortType = this.$sortType$inlined;
            boolean z = this.$isAsc$inlined;
            this.label = 1;
            objEZpvd = c25653jBj.EZpvd(str, lKWHzl, i3, 100, addressTrackerSortType, z, this);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else if (i2 == 1) {
            C56391yDq.AEQbTJ(obj);
            objEZpvd = ((Result) obj).m7386unboximpl();
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.I$0;
            it = (Iterator) this.L$2;
            arrayList = (Collection) this.L$1;
            getTrackingAddressListResponse = (GetTrackingAddressListResponse) this.L$0;
            C56391yDq.AEQbTJ(obj);
            Object objAEQbTJ = ((Result) obj).m7386unboximpl();
            if (Result.m7383isFailureimpl(objAEQbTJ)) {
                objAEQbTJ = null;
            }
            jAZ jaz = (jAZ) objAEQbTJ;
            if (jaz != null) {
                arrayList.add(jaz);
            }
            if (it.hasNext()) {
                TrackingAddressData trackingAddressData = (TrackingAddressData) it.next();
                jAN jan = this.this$0.EZpvd;
                this.L$0 = getTrackingAddressListResponse;
                this.L$1 = arrayList;
                this.L$2 = it;
                this.I$0 = i;
                this.label = 2;
                objAEQbTJ = jan.AEQbTJ(trackingAddressData, this);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
                if (Result.m7383isFailureimpl(objAEQbTJ)) {
                }
                jAZ jaz2 = (jAZ) objAEQbTJ;
                if (jaz2 != null) {
                }
                if (it.hasNext()) {
                    objM7377constructorimpl = Result.m7377constructorimpl(new jAX(new C25644jBa(this.$pageNum$inlined, this.$sortType$inlined, this.$isAsc$inlined), i == 0, (List) arrayList, getTrackingAddressListResponse.EZpvd()));
                    return Result.m7376boximpl(objM7377constructorimpl);
                }
            }
        }
        C56391yDq.AEQbTJ(objEZpvd);
        GetTrackingAddressListResponse getTrackingAddressListResponse2 = (GetTrackingAddressListResponse) objEZpvd;
        i = (getTrackingAddressListResponse2.copydefault().length() == 0 || Intrinsics.EZpvd((Object) xVW.copydefault(), (Object) getTrackingAddressListResponse2.copydefault())) ? 1 : 0;
        List<TrackingAddressData> listKWHzl = getTrackingAddressListResponse2.KWHzl();
        arrayList = new ArrayList();
        it = listKWHzl.iterator();
        getTrackingAddressListResponse = getTrackingAddressListResponse2;
        if (it.hasNext()) {
        }
    }
}
