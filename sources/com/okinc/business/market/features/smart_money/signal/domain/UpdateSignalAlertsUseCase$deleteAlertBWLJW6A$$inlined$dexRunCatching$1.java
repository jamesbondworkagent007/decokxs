package com.okinc.business.market.features.smart_money.signal.domain;

import com.okinc.business.market.data.model.UpdateSignalAlertsRequest;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C29461kuA;
import o.C29463kuC;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC29466kuF;
import o.pUU;
import o.xVW;

/* JADX INFO: renamed from: com.okinc.business.market.features.smart_money.signal.domain.UpdateSignalAlertsUseCase$deleteAlert-BWLJW6A$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class UpdateSignalAlertsUseCase$deleteAlertBWLJW6A$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Boolean>>, Object> {
    final /* synthetic */ long $chainIdForSignature$inlined;
    final /* synthetic */ C29463kuC.Application $tokenAlert$inlined;
    final /* synthetic */ String $walletAddress$inlined;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ C29461kuA this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateSignalAlertsUseCase$deleteAlertBWLJW6A$$inlined$dexRunCatching$1(Continuation continuation, C29461kuA c29461kuA, String str, C29463kuC.Application application, long j) {
        super(2, continuation);
        this.this$0 = c29461kuA;
        this.$walletAddress$inlined = str;
        this.$tokenAlert$inlined = application;
        this.$chainIdForSignature$inlined = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UpdateSignalAlertsUseCase$deleteAlertBWLJW6A$$inlined$dexRunCatching$1(continuation, this.this$0, this.$walletAddress$inlined, this.$tokenAlert$inlined, this.$chainIdForSignature$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends Boolean>> continuation) {
        return ((UpdateSignalAlertsUseCase$deleteAlertBWLJW6A$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0084  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        UpdateSignalAlertsRequest updateSignalAlertsRequestEZpvd;
        InterfaceC29466kuF interfaceC29466kuF;
        String strCopydefault;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        boolean z = true;
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
            updateSignalAlertsRequestEZpvd = this.this$0.EZpvd(this.$walletAddress$inlined, this.$tokenAlert$inlined, 0);
            interfaceC29466kuF = this.this$0.OLrzqt;
            strCopydefault = xVW.copydefault();
            Intrinsics.checkNotNullExpressionValue(strCopydefault, "");
            C29461kuA c29461kuA = this.this$0;
            String str = this.$walletAddress$inlined;
            this.L$0 = updateSignalAlertsRequestEZpvd;
            this.L$1 = strCopydefault;
            this.L$2 = interfaceC29466kuF;
            this.label = 1;
            obj = c29461kuA.OLrzqt(str, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                if (((Number) ((AbstractC43419rot) obj).AEQbTJ()).intValue() == 1) {
                    z = false;
                }
                objM7377constructorimpl = Result.m7377constructorimpl(C56443yFo.KWHzl(z));
                return Result.m7376boximpl(objM7377constructorimpl);
            }
            interfaceC29466kuF = (InterfaceC29466kuF) this.L$2;
            strCopydefault = (String) this.L$1;
            updateSignalAlertsRequestEZpvd = (UpdateSignalAlertsRequest) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        UpdateSignalAlertsRequest updateSignalAlertsRequest = updateSignalAlertsRequestEZpvd;
        String str2 = strCopydefault;
        InterfaceC29466kuF interfaceC29466kuF2 = interfaceC29466kuF;
        long j = this.$chainIdForSignature$inlined;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.label = 2;
        obj = interfaceC29466kuF2.EZpvd(str2, (String) obj, j, updateSignalAlertsRequest, this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        if (((Number) ((AbstractC43419rot) obj).AEQbTJ()).intValue() == 1) {
        }
        objM7377constructorimpl = Result.m7377constructorimpl(C56443yFo.KWHzl(z));
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
