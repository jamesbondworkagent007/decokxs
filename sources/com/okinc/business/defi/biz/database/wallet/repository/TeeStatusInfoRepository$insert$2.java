package com.okinc.business.defi.biz.database.wallet.repository;

import com.okinc.business.defi.biz.database.wallet.entity.TeeStatusInfoEntity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C11498cQm;
import o.C56391yDq;
import o.C56442yFn;
import o.cKU;

/* JADX INFO: loaded from: classes4.dex */
public final class TeeStatusInfoRepository$insert$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Long>, Object> {
    final /* synthetic */ TeeStatusInfoEntity $teeStatusInfo;
    int label;
    final /* synthetic */ C11498cQm this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TeeStatusInfoRepository$insert$2(C11498cQm c11498cQm, TeeStatusInfoEntity teeStatusInfoEntity, Continuation<? super TeeStatusInfoRepository$insert$2> continuation) {
        super(2, continuation);
        this.this$0 = c11498cQm;
        this.$teeStatusInfo = teeStatusInfoEntity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TeeStatusInfoRepository$insert$2(this.this$0, this.$teeStatusInfo, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Long> continuation) {
        return ((TeeStatusInfoRepository$insert$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            cKU cku = this.this$0.copydefault;
            TeeStatusInfoEntity teeStatusInfoEntity = this.$teeStatusInfo;
            this.label = 1;
            obj = cku.EZpvd(teeStatusInfoEntity, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return obj;
    }
}
