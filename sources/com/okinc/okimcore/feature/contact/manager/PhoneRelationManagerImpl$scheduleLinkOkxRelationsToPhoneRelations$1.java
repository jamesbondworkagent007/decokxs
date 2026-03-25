package com.okinc.okimcore.feature.contact.manager;

import com.okinc.okimcore.model.room.inhouseim.InHouseIMContactInfoEntity;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C44124sEe;
import o.C44180sGg;
import o.C44520sSw;
import o.C56379yDe;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes10.dex */
public final class PhoneRelationManagerImpl$scheduleLinkOkxRelationsToPhoneRelations$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<InHouseIMContactInfoEntity> $list;
    long J$0;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C44180sGg this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhoneRelationManagerImpl$scheduleLinkOkxRelationsToPhoneRelations$1(C44180sGg c44180sGg, List<InHouseIMContactInfoEntity> list, Continuation<? super PhoneRelationManagerImpl$scheduleLinkOkxRelationsToPhoneRelations$1> continuation) {
        super(2, continuation);
        this.this$0 = c44180sGg;
        this.$list = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PhoneRelationManagerImpl$scheduleLinkOkxRelationsToPhoneRelations$1 phoneRelationManagerImpl$scheduleLinkOkxRelationsToPhoneRelations$1 = new PhoneRelationManagerImpl$scheduleLinkOkxRelationsToPhoneRelations$1(this.this$0, this.$list, continuation);
        phoneRelationManagerImpl$scheduleLinkOkxRelationsToPhoneRelations$1.L$0 = obj;
        return phoneRelationManagerImpl$scheduleLinkOkxRelationsToPhoneRelations$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PhoneRelationManagerImpl$scheduleLinkOkxRelationsToPhoneRelations$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        long jCurrentTimeMillis;
        long j;
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C44180sGg c44180sGg = this.this$0;
            List<InHouseIMContactInfoEntity> list = this.$list;
            jCurrentTimeMillis = System.currentTimeMillis();
            try {
                Result.Application application = Result.Companion;
                C44520sSw c44520sSw = c44180sGg.valueOf;
                this.J$0 = jCurrentTimeMillis;
                this.label = 1;
                if (c44520sSw.OLrzqt(list, this) == objCopydefault) {
                    return objCopydefault;
                }
                j = jCurrentTimeMillis;
            } catch (Throwable th) {
                th = th;
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                j = jCurrentTimeMillis;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = this.J$0;
            try {
                C56391yDq.AEQbTJ(obj);
            } catch (Throwable th2) {
                th = th2;
                jCurrentTimeMillis = j;
                Result.Application application22 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                j = jCurrentTimeMillis;
            }
        }
        objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            C44124sEe.copydefault("PhoneRelationManager", "scheduleLinkOkxRelationsToPhoneRelations failed: error=" + C56379yDe.AEQbTJ(thM7380exceptionOrNullimpl));
        }
        C44124sEe.copydefault("PhoneRelationManager", "scheduleLinkOkxRelationsToPhoneRelations timeCost=" + (System.currentTimeMillis() - j));
        return Unit.INSTANCE;
    }
}
