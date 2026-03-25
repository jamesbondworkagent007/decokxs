package com.okinc.business.market.features.address_tracker.domain;

import com.okinc.business.market.data.constant.AddressTrackerUserAction;
import com.okinc.business.market.features.identity.domain.DexUserIdentity;
import java.util.ArrayList;
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
import o.C25648jBe;
import o.C25653jBj;
import o.C28586kda;
import o.C28603kdr;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;
import o.xVW;

/* JADX INFO: renamed from: com.okinc.business.market.features.address_tracker.domain.UpdateAddressTrackerNotificationUseCase$invoke-hUnOzRk$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class UpdateAddressTrackerNotificationUseCase$invokehUnOzRk$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Unit>>, Object> {
    final /* synthetic */ String $collectAddress$inlined;
    final /* synthetic */ int $notifyType$inlined;
    final /* synthetic */ List $userActionTypeList$inlined;
    final /* synthetic */ String $volumeMax$inlined;
    final /* synthetic */ String $volumeMin$inlined;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C25648jBe this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateAddressTrackerNotificationUseCase$invokehUnOzRk$$inlined$dexRunCatching$1(Continuation continuation, C25648jBe c25648jBe, String str, int i, String str2, String str3, List list) {
        super(2, continuation);
        this.this$0 = c25648jBe;
        this.$collectAddress$inlined = str;
        this.$notifyType$inlined = i;
        this.$volumeMin$inlined = str2;
        this.$volumeMax$inlined = str3;
        this.$userActionTypeList$inlined = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UpdateAddressTrackerNotificationUseCase$invokehUnOzRk$$inlined$dexRunCatching$1(continuation, this.this$0, this.$collectAddress$inlined, this.$notifyType$inlined, this.$volumeMin$inlined, this.$volumeMax$inlined, this.$userActionTypeList$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends Unit>> continuation) {
        return ((UpdateAddressTrackerNotificationUseCase$invokehUnOzRk$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00af A[Catch: all -> 0x00da, CancellationException -> 0x00f1, LOOP:0: B:27:0x00a9->B:29:0x00af, LOOP_END, TryCatch #2 {CancellationException -> 0x00f1, all -> 0x00da, blocks: (B:7:0x0011, B:33:0x00d0, B:12:0x002c, B:23:0x0078, B:26:0x0080, B:27:0x00a9, B:29:0x00af, B:30:0x00c1, B:13:0x0037, B:19:0x0055, B:16:0x0044), top: B:41:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cf A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objOLrzqt;
        DexUserIdentity dexUserIdentity;
        String str;
        Object objM7386unboximpl;
        Iterator it;
        Object objAEQbTJ;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            pUU.AEQbTJ("DEX", "dexRunCatching", th);
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Result.Application application2 = Result.Companion;
            C28586kda c28586kda = this.this$0.AEQbTJ;
            this.label = 1;
            objOLrzqt = c28586kda.OLrzqt(this);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    objAEQbTJ = ((Result) obj).m7386unboximpl();
                    C56391yDq.AEQbTJ(objAEQbTJ);
                    objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                    return Result.m7376boximpl(objM7377constructorimpl);
                }
                dexUserIdentity = (DexUserIdentity) this.L$1;
                String str2 = (String) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objM7386unboximpl = ((Result) obj).m7386unboximpl();
                str = str2;
                if (Result.m7383isFailureimpl(objM7386unboximpl)) {
                    objM7386unboximpl = "";
                }
                String str3 = (String) objM7386unboximpl;
                C25653jBj c25653jBj = this.this$0.copydefault;
                Intrinsics.copydefault((Object) str);
                String strEZpvd = dexUserIdentity.EZpvd();
                String str4 = this.$collectAddress$inlined;
                int i2 = this.$notifyType$inlined;
                String str5 = this.$volumeMin$inlined;
                String str6 = this.$volumeMax$inlined;
                List list = this.$userActionTypeList$inlined;
                ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
                it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(C56443yFo.AEQbTJ(((AddressTrackerUserAction) it.next()).getValue()));
                }
                this.L$0 = null;
                this.L$1 = null;
                this.label = 3;
                objAEQbTJ = c25653jBj.AEQbTJ(str, str3, strEZpvd, str4, i2, str5, str6, arrayList, this);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
                C56391yDq.AEQbTJ(objAEQbTJ);
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                return Result.m7376boximpl(objM7377constructorimpl);
            }
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(objOLrzqt);
        dexUserIdentity = (DexUserIdentity) objOLrzqt;
        String strCopydefault = xVW.copydefault();
        C28603kdr c28603kdr = this.this$0.EZpvd;
        String strEZpvd2 = dexUserIdentity.EZpvd();
        this.L$0 = strCopydefault;
        this.L$1 = dexUserIdentity;
        this.label = 2;
        Object objAEQbTJ2 = c28603kdr.AEQbTJ(strEZpvd2, this);
        if (objAEQbTJ2 == objCopydefault) {
            return objCopydefault;
        }
        str = strCopydefault;
        objM7386unboximpl = objAEQbTJ2;
        if (Result.m7383isFailureimpl(objM7386unboximpl)) {
        }
        String str32 = (String) objM7386unboximpl;
        C25653jBj c25653jBj2 = this.this$0.copydefault;
        Intrinsics.copydefault((Object) str);
        String strEZpvd3 = dexUserIdentity.EZpvd();
        String str42 = this.$collectAddress$inlined;
        int i22 = this.$notifyType$inlined;
        String str52 = this.$volumeMin$inlined;
        String str62 = this.$volumeMax$inlined;
        List list2 = this.$userActionTypeList$inlined;
        ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(list2, 10));
        it = list2.iterator();
        while (it.hasNext()) {
        }
        this.L$0 = null;
        this.L$1 = null;
        this.label = 3;
        objAEQbTJ = c25653jBj2.AEQbTJ(str, str32, strEZpvd3, str42, i22, str52, str62, arrayList2, this);
        if (objAEQbTJ == objCopydefault) {
        }
        C56391yDq.AEQbTJ(objAEQbTJ);
        objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
