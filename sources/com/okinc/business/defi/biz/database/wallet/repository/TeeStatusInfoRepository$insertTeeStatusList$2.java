package com.okinc.business.defi.biz.database.wallet.repository;

import com.okinc.business.defi.biz.database.wallet.entity.TeeStatusInfoEntity;
import java.util.List;
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
public final class TeeStatusInfoRepository$insertTeeStatusList$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<TeeStatusInfoEntity> $teeStatusInfoList;
    int label;
    final /* synthetic */ C11498cQm this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TeeStatusInfoRepository$insertTeeStatusList$2(C11498cQm c11498cQm, List<TeeStatusInfoEntity> list, Continuation<? super TeeStatusInfoRepository$insertTeeStatusList$2> continuation) {
        super(2, continuation);
        this.this$0 = c11498cQm;
        this.$teeStatusInfoList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TeeStatusInfoRepository$insertTeeStatusList$2(this.this$0, this.$teeStatusInfoList, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TeeStatusInfoRepository$insertTeeStatusList$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            cKU cku = this.this$0.copydefault;
            List<TeeStatusInfoEntity> list = this.$teeStatusInfoList;
            this.label = 1;
            if (cku.copydefault(list, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
