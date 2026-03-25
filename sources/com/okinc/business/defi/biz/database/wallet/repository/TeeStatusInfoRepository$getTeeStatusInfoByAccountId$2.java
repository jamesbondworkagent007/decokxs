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
public final class TeeStatusInfoRepository$getTeeStatusInfoByAccountId$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super TeeStatusInfoEntity>, Object> {
    final /* synthetic */ String $accountId;
    int label;
    final /* synthetic */ C11498cQm this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TeeStatusInfoRepository$getTeeStatusInfoByAccountId$2(C11498cQm c11498cQm, String str, Continuation<? super TeeStatusInfoRepository$getTeeStatusInfoByAccountId$2> continuation) {
        super(2, continuation);
        this.this$0 = c11498cQm;
        this.$accountId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TeeStatusInfoRepository$getTeeStatusInfoByAccountId$2(this.this$0, this.$accountId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super TeeStatusInfoEntity> continuation) {
        return ((TeeStatusInfoRepository$getTeeStatusInfoByAccountId$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            cKU cku = this.this$0.copydefault;
            String str = this.$accountId;
            this.label = 1;
            obj = cku.EZpvd(str, this);
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
