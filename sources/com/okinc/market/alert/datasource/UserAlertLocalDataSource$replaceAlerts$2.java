package com.okinc.market.alert.datasource;

import com.okinc.market.alert.data.MarketUserAlert;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C38377pWn;
import o.C56391yDq;
import o.C56405yEd;
import o.C56442yFn;

/* JADX INFO: loaded from: classes9.dex */
public final class UserAlertLocalDataSource$replaceAlerts$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<MarketUserAlert> $newAlerts;
    final /* synthetic */ String $userId;
    int label;
    final /* synthetic */ C38377pWn this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserAlertLocalDataSource$replaceAlerts$2(C38377pWn c38377pWn, String str, List<MarketUserAlert> list, Continuation<? super UserAlertLocalDataSource$replaceAlerts$2> continuation) {
        super(2, continuation);
        this.this$0 = c38377pWn;
        this.$userId = str;
        this.$newAlerts = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UserAlertLocalDataSource$replaceAlerts$2(this.this$0, this.$userId, this.$newAlerts, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((UserAlertLocalDataSource$replaceAlerts$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.copydefault.copydefault(this.$userId, C56405yEd.hDKMBd(this.$newAlerts));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
