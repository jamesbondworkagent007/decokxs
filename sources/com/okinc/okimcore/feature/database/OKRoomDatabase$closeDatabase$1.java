package com.okinc.okimcore.feature.database;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import o.C44124sEe;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes10.dex */
public final class OKRoomDatabase$closeDatabase$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ InHouseIMDatabase $dbToClose;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKRoomDatabase$closeDatabase$1(InHouseIMDatabase inHouseIMDatabase, Continuation<? super OKRoomDatabase$closeDatabase$1> continuation) {
        super(2, continuation);
        this.$dbToClose = inHouseIMDatabase;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OKRoomDatabase$closeDatabase$1(this.$dbToClose, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OKRoomDatabase$closeDatabase$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C44124sEe.copydefault("InHouseIMDatabase", "closeDatabase: START, db=" + this.$dbToClose);
            this.label = 1;
            if (DelayKt.delay(1000L, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        try {
            InHouseIMDatabase inHouseIMDatabase = this.$dbToClose;
            if (inHouseIMDatabase != null) {
                if (inHouseIMDatabase.inTransaction()) {
                    try {
                        inHouseIMDatabase.endTransaction();
                    } catch (Exception e) {
                        pUU.AEQbTJ("InHouseIMDatabase", "closeDatabase: endTransaction FAILED", e);
                    }
                    pUU.valueOf("InHouseIMDatabase", "force endTransaction");
                }
                inHouseIMDatabase.close();
                pUU.KWHzl("InHouseIMDatabase", "closeDatabase: SQLite CLOSED");
            }
        } catch (Exception e2) {
            pUU.AEQbTJ("InHouseIMDatabase", "closeDatabase: close FAILED", e2);
        }
        pUU.KWHzl("InHouseIMDatabase", "closeDatabase: repository cleared");
        C44124sEe.copydefault("InHouseIMDatabase", "closeDatabase: COMPLETED");
        return Unit.INSTANCE;
    }
}
