package com.okinc.im.imui.debug;

import android.app.Activity;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import o.C34049nPn;
import o.C44124sEe;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes18.dex */
public final class OKIMClearIMDBExtension$Companion$clearIMDatabase$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Activity $activity;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKIMClearIMDBExtension$Companion$clearIMDatabase$1(Activity activity, Continuation<? super OKIMClearIMDBExtension$Companion$clearIMDatabase$1> continuation) {
        super(2, continuation);
        this.$activity = activity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OKIMClearIMDBExtension$Companion$clearIMDatabase$1 oKIMClearIMDBExtension$Companion$clearIMDatabase$1 = new OKIMClearIMDBExtension$Companion$clearIMDatabase$1(this.$activity, continuation);
        oKIMClearIMDBExtension$Companion$clearIMDatabase$1.L$0 = obj;
        return oKIMClearIMDBExtension$Companion$clearIMDatabase$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OKIMClearIMDBExtension$Companion$clearIMDatabase$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c5  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Activity activity;
        Object obj2;
        Activity activity2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C44124sEe.imLogDb$default("OKIMClearIMDBExtension: Clearing IM database...", null, 2, null);
            Activity activity3 = this.$activity;
            Result.Application application2 = Result.Companion;
            CoroutineDispatcher io2 = Dispatchers.getIO();
            OKIMClearIMDBExtension$Companion$clearIMDatabase$1$1$1 oKIMClearIMDBExtension$Companion$clearIMDatabase$1$1$1 = new OKIMClearIMDBExtension$Companion$clearIMDatabase$1$1$1(activity3, null);
            this.label = 1;
            if (BuildersKt.withContext(io2, oKIMClearIMDBExtension$Companion$clearIMDatabase$1$1$1, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        activity2 = (Activity) this.L$1;
                        C56391yDq.AEQbTJ(obj);
                        C34049nPn.Companion.EZpvd(activity2);
                        return Unit.INSTANCE;
                    }
                    activity = (Activity) this.L$1;
                    obj2 = this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    this.L$0 = obj2;
                    this.L$1 = activity;
                    this.label = 4;
                    if (DelayKt.delay(1000L, this) != objCopydefault) {
                        return objCopydefault;
                    }
                    activity2 = activity;
                    C34049nPn.Companion.EZpvd(activity2);
                    return Unit.INSTANCE;
                }
                Object obj3 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                objM7377constructorimpl = obj3;
                activity = this.$activity;
                if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
                    C44124sEe.imLogDb$default("OKIMClearIMDBExtension: Clearing IM database: Success", null, 2, null);
                    MainCoroutineDispatcher main = Dispatchers.getMain();
                    OKIMClearIMDBExtension$Companion$clearIMDatabase$1$3$1 oKIMClearIMDBExtension$Companion$clearIMDatabase$1$3$1 = new OKIMClearIMDBExtension$Companion$clearIMDatabase$1$3$1(null);
                    this.L$0 = objM7377constructorimpl;
                    this.L$1 = activity;
                    this.label = 3;
                    if (BuildersKt.withContext(main, oKIMClearIMDBExtension$Companion$clearIMDatabase$1$3$1, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    obj2 = objM7377constructorimpl;
                    this.L$0 = obj2;
                    this.L$1 = activity;
                    this.label = 4;
                    if (DelayKt.delay(1000L, this) != objCopydefault) {
                    }
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            C44124sEe.djBIcL("OKIMClearIMDBExtension: Clearing IM database: Failed", thM7380exceptionOrNullimpl);
            MainCoroutineDispatcher main2 = Dispatchers.getMain();
            OKIMClearIMDBExtension$Companion$clearIMDatabase$1$2$1 oKIMClearIMDBExtension$Companion$clearIMDatabase$1$2$1 = new OKIMClearIMDBExtension$Companion$clearIMDatabase$1$2$1(null);
            this.L$0 = objM7377constructorimpl;
            this.label = 2;
            if (BuildersKt.withContext(main2, oKIMClearIMDBExtension$Companion$clearIMDatabase$1$2$1, this) == objCopydefault) {
                return objCopydefault;
            }
        }
        activity = this.$activity;
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
        }
        return Unit.INSTANCE;
    }
}
