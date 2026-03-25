package com.okinc.dexkline.market.features.risk_control.data;

import com.okinc.dexkline.market.data.model.CeDeFiCoinRiskData;
import com.okinc.network.okg.response.ResponseData;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C34531ndo;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC32162mRu;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.dexkline.market.features.risk_control.data.RiskControlRepo$getCeDeFiRiskInfo-BWLJW6A$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class RiskControlRepo$getCeDeFiRiskInfoBWLJW6A$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends CeDeFiCoinRiskData>>, Object> {
    final /* synthetic */ String $chainId$inlined;
    final /* synthetic */ String $token$inlined;
    final /* synthetic */ String $tokenContractAddress$inlined;
    int label;
    final /* synthetic */ C34531ndo this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiskControlRepo$getCeDeFiRiskInfoBWLJW6A$$inlined$dexRunCatching$1(Continuation continuation, C34531ndo c34531ndo, String str, String str2, String str3) {
        super(2, continuation);
        this.this$0 = c34531ndo;
        this.$chainId$inlined = str;
        this.$tokenContractAddress$inlined = str2;
        this.$token$inlined = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RiskControlRepo$getCeDeFiRiskInfoBWLJW6A$$inlined$dexRunCatching$1(continuation, this.this$0, this.$chainId$inlined, this.$tokenContractAddress$inlined, this.$token$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends CeDeFiCoinRiskData>> continuation) {
        return ((RiskControlRepo$getCeDeFiRiskInfoBWLJW6A$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC32162mRu interfaceC32162mRu = this.this$0.KWHzl;
                String str = this.$chainId$inlined;
                String str2 = this.$tokenContractAddress$inlined;
                String str3 = this.$token$inlined;
                this.label = 1;
                obj = interfaceC32162mRu.copydefault(str, str2, str3, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            List list = (List) ((ResponseData) obj).getData();
            objM7377constructorimpl = Result.m7377constructorimpl(list != null ? (CeDeFiCoinRiskData) CollectionsKt___CollectionsKt.firstOrNull(list) : null);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            pUU.AEQbTJ("cedefi", "dexRunCatching", th);
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
