package com.okinc.okimcore.feature.message.manager;

import com.okinc.okimcore.feature.group.repository.local.InHouseIMGroupInfoDao;
import com.okinc.okimcore.feature.group.repository.remote.InHouseIMGroupService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C44302sKu;
import o.C56391yDq;
import o.C56442yFn;
import o.sFA;

/* JADX INFO: loaded from: classes10.dex */
public final class InHouseIMWebSocketSyncManagerImpl$updateInboundGroupInfoTransactions$2$1$tasks$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $it;
    final /* synthetic */ InHouseIMGroupInfoDao $this_run;
    int label;
    final /* synthetic */ C44302sKu this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InHouseIMWebSocketSyncManagerImpl$updateInboundGroupInfoTransactions$2$1$tasks$1$1(InHouseIMGroupInfoDao inHouseIMGroupInfoDao, C44302sKu c44302sKu, String str, Continuation<? super InHouseIMWebSocketSyncManagerImpl$updateInboundGroupInfoTransactions$2$1$tasks$1$1> continuation) {
        super(2, continuation);
        this.$this_run = inHouseIMGroupInfoDao;
        this.this$0 = c44302sKu;
        this.$it = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InHouseIMWebSocketSyncManagerImpl$updateInboundGroupInfoTransactions$2$1$tasks$1$1(this.$this_run, this.this$0, this.$it, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InHouseIMWebSocketSyncManagerImpl$updateInboundGroupInfoTransactions$2$1$tasks$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            sFA sfa = sFA.KWHzl;
            InHouseIMGroupInfoDao inHouseIMGroupInfoDao = this.$this_run;
            InHouseIMGroupService inHouseIMGroupService = this.this$0.fARcdN;
            String str = this.$it;
            this.label = 1;
            if (sfa.OLrzqt(inHouseIMGroupInfoDao, inHouseIMGroupService, str, this) == objCopydefault) {
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
