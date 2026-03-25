package com.okinc.business.defi.wallet.eip7702.domain.usecase;

import com.okinc.business.defi.biz.net.bean.EIP7702WalletStatusResp;
import com.okinc.business.defi.wallet.eip7702.data.model.EIP7702WalletStatus;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C15274eCg;
import o.C15275eCh;
import o.C56391yDq;
import o.C56423yEv;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes5.dex */
public final class GetEIP7702WalletStatusUseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Map<String, ? extends EIP7702WalletStatus>>>, Object> {
    final /* synthetic */ boolean $requestApiFirst;
    final /* synthetic */ List<String> $walletIds;
    int label;
    final /* synthetic */ C15274eCg this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetEIP7702WalletStatusUseCase$invoke$2(C15274eCg c15274eCg, List<String> list, boolean z, Continuation<? super GetEIP7702WalletStatusUseCase$invoke$2> continuation) {
        super(2, continuation);
        this.this$0 = c15274eCg;
        this.$walletIds = list;
        this.$requestApiFirst = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetEIP7702WalletStatusUseCase$invoke$2(this.this$0, this.$walletIds, this.$requestApiFirst, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends Map<String, ? extends EIP7702WalletStatus>>> continuation) {
        return ((GetEIP7702WalletStatusUseCase$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objAEQbTJ;
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C15275eCh c15275eCh = this.this$0.EZpvd;
            List<String> list = this.$walletIds;
            boolean z = this.$requestApiFirst;
            this.label = 1;
            objAEQbTJ = c15275eCh.AEQbTJ(list, z, this);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7384isSuccessimpl(objAEQbTJ)) {
            try {
                Result.Application application = Result.Companion;
                Map map = (Map) objAEQbTJ;
                LinkedHashMap linkedHashMap = new LinkedHashMap(C56423yEv.copydefault(map.size()));
                for (Object obj2 : map.entrySet()) {
                    linkedHashMap.put(((Map.Entry) obj2).getKey(), EIP7702WalletStatus.Companion.KWHzl(C56443yFo.AEQbTJ(((EIP7702WalletStatusResp) ((Map.Entry) obj2).getValue()).getStatus())));
                }
                objM7377constructorimpl = Result.m7377constructorimpl(linkedHashMap);
            } catch (Throwable th) {
                Result.Application application2 = Result.Companion;
                objAEQbTJ = C56391yDq.EZpvd(th);
                objM7377constructorimpl = Result.m7377constructorimpl(objAEQbTJ);
            }
        } else {
            objM7377constructorimpl = Result.m7377constructorimpl(objAEQbTJ);
        }
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
