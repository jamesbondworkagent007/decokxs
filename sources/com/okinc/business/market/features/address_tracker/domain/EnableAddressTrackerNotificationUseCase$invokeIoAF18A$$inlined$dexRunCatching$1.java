package com.okinc.business.market.features.address_tracker.domain;

import com.okinc.business.market.features.identity.domain.DexUserIdentity;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C25653jBj;
import o.C28586kda;
import o.C28603kdr;
import o.C56391yDq;
import o.C56442yFn;
import o.jAG;
import o.pUU;
import o.xVW;

/* JADX INFO: renamed from: com.okinc.business.market.features.address_tracker.domain.EnableAddressTrackerNotificationUseCase$invoke-IoAF18A$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class EnableAddressTrackerNotificationUseCase$invokeIoAF18A$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Unit>>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ jAG this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnableAddressTrackerNotificationUseCase$invokeIoAF18A$$inlined$dexRunCatching$1(Continuation continuation, jAG jag) {
        super(2, continuation);
        this.this$0 = jag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EnableAddressTrackerNotificationUseCase$invokeIoAF18A$$inlined$dexRunCatching$1(continuation, this.this$0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends Unit>> continuation) {
        return ((EnableAddressTrackerNotificationUseCase$invokeIoAF18A$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a0 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        String str;
        Object objM7386unboximpl;
        String str2;
        Object objM7386unboximpl2;
        String str3;
        C25653jBj c25653jBj;
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
            String strCopydefault = xVW.copydefault();
            C28586kda c28586kda = this.this$0.copydefault;
            this.L$0 = strCopydefault;
            this.label = 1;
            Object objOLrzqt = c28586kda.OLrzqt(this);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            str = strCopydefault;
            objM7386unboximpl = objOLrzqt;
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    ((Result) obj).m7386unboximpl();
                    objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                    return Result.m7376boximpl(objM7377constructorimpl);
                }
                str2 = (String) this.L$1;
                str3 = (String) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objM7386unboximpl2 = ((Result) obj).m7386unboximpl();
                if (Result.m7383isFailureimpl(objM7386unboximpl2)) {
                    objM7386unboximpl2 = "";
                }
                c25653jBj = this.this$0.KWHzl;
                Intrinsics.copydefault((Object) str3);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 3;
                if (c25653jBj.copydefault(str3, (String) objM7386unboximpl2, str2, this) == objCopydefault) {
                    return objCopydefault;
                }
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                return Result.m7376boximpl(objM7377constructorimpl);
            }
            str = (String) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objM7386unboximpl = ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(objM7386unboximpl);
        String strEZpvd = ((DexUserIdentity) objM7386unboximpl).EZpvd();
        C28603kdr c28603kdr = this.this$0.EZpvd;
        this.L$0 = str;
        this.L$1 = strEZpvd;
        this.label = 2;
        Object objAEQbTJ = c28603kdr.AEQbTJ(strEZpvd, this);
        if (objAEQbTJ == objCopydefault) {
            return objCopydefault;
        }
        String str4 = str;
        str2 = strEZpvd;
        objM7386unboximpl2 = objAEQbTJ;
        str3 = str4;
        if (Result.m7383isFailureimpl(objM7386unboximpl2)) {
        }
        c25653jBj = this.this$0.KWHzl;
        Intrinsics.copydefault((Object) str3);
        this.L$0 = null;
        this.L$1 = null;
        this.label = 3;
        if (c25653jBj.copydefault(str3, (String) objM7386unboximpl2, str2, this) == objCopydefault) {
        }
        objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
