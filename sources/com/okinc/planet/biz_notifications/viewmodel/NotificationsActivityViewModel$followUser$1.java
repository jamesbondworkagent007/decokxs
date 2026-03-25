package com.okinc.planet.biz_notifications.viewmodel;

import com.okinc.network.okg.response.OKServerException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C43422row;
import o.C46203tLq;
import o.C47925tzM;
import o.C56390yDp;
import o.C56391yDq;
import o.C56424yEw;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC7298ahG;

/* JADX INFO: loaded from: classes10.dex */
public final class NotificationsActivityViewModel$followUser$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $authorId;
    final /* synthetic */ Function2<Boolean, OKServerException, Unit> $callback;
    final /* synthetic */ String $followStatusV2;
    final /* synthetic */ boolean $isFollow;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    boolean Z$0;
    int label;
    final /* synthetic */ C47925tzM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super com.okinc.network.okg.response.OKServerException, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NotificationsActivityViewModel$followUser$1(C47925tzM c47925tzM, boolean z, String str, Function2<? super Boolean, ? super OKServerException, Unit> function2, String str2, Continuation<? super NotificationsActivityViewModel$followUser$1> continuation) {
        super(2, continuation);
        this.this$0 = c47925tzM;
        this.$isFollow = z;
        this.$authorId = str;
        this.$callback = function2;
        this.$followStatusV2 = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        NotificationsActivityViewModel$followUser$1 notificationsActivityViewModel$followUser$1 = new NotificationsActivityViewModel$followUser$1(this.this$0, this.$isFollow, this.$authorId, this.$callback, this.$followStatusV2, continuation);
        notificationsActivityViewModel$followUser$1.L$0 = obj;
        return notificationsActivityViewModel$followUser$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((NotificationsActivityViewModel$followUser$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        C47925tzM c47925tzM;
        String str;
        Function2<Boolean, OKServerException, Unit> function2;
        String str2;
        boolean z;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                c47925tzM = this.this$0;
                boolean z2 = this.$isFollow;
                str = this.$authorId;
                function2 = this.$callback;
                str2 = this.$followStatusV2;
                Result.Application application = Result.Companion;
                C46203tLq c46203tLq = c47925tzM.AhwBna;
                C46203tLq.StateListAnimator stateListAnimator = new C46203tLq.StateListAnimator(z2, str);
                this.L$0 = c47925tzM;
                this.L$1 = str;
                this.L$2 = function2;
                this.L$3 = str2;
                this.Z$0 = z2;
                this.label = 1;
                if (c46203tLq.KWHzl(stateListAnimator, this) == objCopydefault) {
                    return objCopydefault;
                }
                z = z2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z = this.Z$0;
                str2 = (String) this.L$3;
                function2 = (Function2) this.L$2;
                str = (String) this.L$1;
                c47925tzM = (C47925tzM) this.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            Unit unit = null;
            function2.invoke(C56443yFo.KWHzl(true), null);
            InterfaceC7298ahG interfaceC7298ahGAYXKKw = c47925tzM.AYXKKw();
            if (interfaceC7298ahGAYXKKw != null) {
                interfaceC7298ahGAYXKKw.AEQbTJ("follow_button_update_status_listener", null, C56424yEw.gEmmrt(C56390yDp.OLrzqt("isFollowing", C56443yFo.KWHzl(z)), C56390yDp.OLrzqt("followStatusV2", str2), C56390yDp.OLrzqt("authorId", str)));
                unit = Unit.INSTANCE;
            }
            objM7377constructorimpl = Result.m7377constructorimpl(unit);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        Function2<Boolean, OKServerException, Unit> function22 = this.$callback;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            function22.invoke(C56443yFo.KWHzl(false), C43422row.OLrzqt(thM7380exceptionOrNullimpl));
        }
        return Unit.INSTANCE;
    }
}
