package com.okinc.planet.biz_content.leaderboard.viewmodel;

import com.okinc.network.okg.response.OKServerException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C43422row;
import o.C46203tLq;
import o.C47669tuV;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes19.dex */
public final class PlanetTopOrbitersViewModel$followUser$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $authorId;
    final /* synthetic */ Function2<Boolean, OKServerException, Unit> $callback;
    final /* synthetic */ boolean $isFollow;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C47669tuV this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super com.okinc.network.okg.response.OKServerException, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PlanetTopOrbitersViewModel$followUser$1(C47669tuV c47669tuV, boolean z, String str, Function2<? super Boolean, ? super OKServerException, Unit> function2, Continuation<? super PlanetTopOrbitersViewModel$followUser$1> continuation) {
        super(2, continuation);
        this.this$0 = c47669tuV;
        this.$isFollow = z;
        this.$authorId = str;
        this.$callback = function2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PlanetTopOrbitersViewModel$followUser$1 planetTopOrbitersViewModel$followUser$1 = new PlanetTopOrbitersViewModel$followUser$1(this.this$0, this.$isFollow, this.$authorId, this.$callback, continuation);
        planetTopOrbitersViewModel$followUser$1.L$0 = obj;
        return planetTopOrbitersViewModel$followUser$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PlanetTopOrbitersViewModel$followUser$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Function2<Boolean, OKServerException, Unit> function2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C47669tuV c47669tuV = this.this$0;
                boolean z = this.$isFollow;
                String str = this.$authorId;
                Function2<Boolean, OKServerException, Unit> function22 = this.$callback;
                Result.Application application = Result.Companion;
                C46203tLq c46203tLq = c47669tuV.copydefault;
                C46203tLq.StateListAnimator stateListAnimator = new C46203tLq.StateListAnimator(z, str);
                this.L$0 = function22;
                this.label = 1;
                if (c46203tLq.KWHzl(stateListAnimator, this) == objCopydefault) {
                    return objCopydefault;
                }
                function2 = function22;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function2 = (Function2) this.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            function2.invoke(C56443yFo.KWHzl(true), null);
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        Function2<Boolean, OKServerException, Unit> function23 = this.$callback;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            function23.invoke(C56443yFo.KWHzl(false), C43422row.OLrzqt(thM7380exceptionOrNullimpl));
        }
        return Unit.INSTANCE;
    }
}
