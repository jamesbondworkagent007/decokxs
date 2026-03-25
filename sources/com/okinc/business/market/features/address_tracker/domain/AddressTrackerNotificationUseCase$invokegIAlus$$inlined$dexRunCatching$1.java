package com.okinc.business.market.features.address_tracker.domain;

import com.okinc.business.market.data.model.AddressTrackerNotificationData;
import com.okinc.business.market.features.identity.domain.DexUserIdentity;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C25640jAx;
import o.C25653jBj;
import o.C28586kda;
import o.C56391yDq;
import o.C56442yFn;
import o.jAA;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.business.market.features.address_tracker.domain.AddressTrackerNotificationUseCase$invoke-gIAlu-s$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class AddressTrackerNotificationUseCase$invokegIAlus$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends AddressTrackerNotification>>, Object> {
    final /* synthetic */ String $targetAddress$inlined;
    int label;
    final /* synthetic */ C25640jAx this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressTrackerNotificationUseCase$invokegIAlus$$inlined$dexRunCatching$1(Continuation continuation, C25640jAx c25640jAx, String str) {
        super(2, continuation);
        this.this$0 = c25640jAx;
        this.$targetAddress$inlined = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AddressTrackerNotificationUseCase$invokegIAlus$$inlined$dexRunCatching$1(continuation, this.this$0, this.$targetAddress$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends AddressTrackerNotification>> continuation) {
        return ((AddressTrackerNotificationUseCase$invokegIAlus$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objOLrzqt;
        Object objKWHzl;
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
            C28586kda c28586kda = this.this$0.OLrzqt;
            this.label = 1;
            objOLrzqt = c28586kda.OLrzqt(this);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objKWHzl = ((Result) obj).m7386unboximpl();
                C56391yDq.AEQbTJ(objKWHzl);
                objM7377constructorimpl = Result.m7377constructorimpl(jAA.EZpvd((AddressTrackerNotificationData) objKWHzl));
                return Result.m7376boximpl(objM7377constructorimpl);
            }
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(objOLrzqt);
        C25653jBj c25653jBj = this.this$0.KWHzl;
        String strEZpvd = ((DexUserIdentity) objOLrzqt).EZpvd();
        String str = this.$targetAddress$inlined;
        this.label = 2;
        objKWHzl = c25653jBj.KWHzl(strEZpvd, str, this);
        if (objKWHzl == objCopydefault) {
            return objCopydefault;
        }
        C56391yDq.AEQbTJ(objKWHzl);
        objM7377constructorimpl = Result.m7377constructorimpl(jAA.EZpvd((AddressTrackerNotificationData) objKWHzl));
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
