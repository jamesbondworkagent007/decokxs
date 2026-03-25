package com.okinc.business.market.features.smart_money.signal.domain;

import com.okinc.business.market.data.model.common.DexTokenMeta;
import com.okinc.business.market.data.model.smart_money.SignalAlertResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C29463kuC;
import o.C29502kup;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.InterfaceC29466kuF;
import o.pUU;
import o.xVW;

/* JADX INFO: renamed from: com.okinc.business.market.features.smart_money.signal.domain.GetSignalAlertsUseCase$invoke-gIAlu-s$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class GetSignalAlertsUseCase$invokegIAlus$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends C29463kuC>>, Object> {
    final /* synthetic */ String $walletAddress$inlined;
    int label;
    final /* synthetic */ C29502kup this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetSignalAlertsUseCase$invokegIAlus$$inlined$dexRunCatching$1(Continuation continuation, C29502kup c29502kup, String str) {
        super(2, continuation);
        this.this$0 = c29502kup;
        this.$walletAddress$inlined = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetSignalAlertsUseCase$invokegIAlus$$inlined$dexRunCatching$1(continuation, this.this$0, this.$walletAddress$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends C29463kuC>> continuation) {
        return ((GetSignalAlertsUseCase$invokegIAlus$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC29466kuF interfaceC29466kuF = this.this$0.EZpvd;
                String str = this.$walletAddress$inlined;
                this.label = 1;
                obj = interfaceC29466kuF.EZpvd(str, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            SignalAlertResponse signalAlertResponse = (SignalAlertResponse) ((AbstractC43419rot) obj).AEQbTJ();
            boolean zEZpvd = Intrinsics.EZpvd((Object) signalAlertResponse.EZpvd(), (Object) xVW.copydefault());
            boolean zAEQbTJ = signalAlertResponse.AEQbTJ();
            List<DexTokenMeta> listOLrzqt = signalAlertResponse.OLrzqt();
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listOLrzqt, 10));
            for (DexTokenMeta dexTokenMeta : listOLrzqt) {
                arrayList.add(new C29463kuC.Application(dexTokenMeta.AEQbTJ(), dexTokenMeta.KWHzl()));
            }
            objM7377constructorimpl = Result.m7377constructorimpl(new C29463kuC(!zEZpvd, zAEQbTJ, CollectionsKt___CollectionsKt.OqFWZa(arrayList)));
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
