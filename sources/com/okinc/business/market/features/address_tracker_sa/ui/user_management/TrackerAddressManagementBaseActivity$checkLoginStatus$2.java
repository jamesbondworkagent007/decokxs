package com.okinc.business.market.features.address_tracker_sa.ui.user_management;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractActivityC25766jFo;
import o.AbstractC25769jFr;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes6.dex */
public final class TrackerAddressManagementBaseActivity$checkLoginStatus$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function0<Unit> $onPostLogin;
    int label;
    final /* synthetic */ AbstractActivityC25766jFo this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackerAddressManagementBaseActivity$checkLoginStatus$2(AbstractActivityC25766jFo abstractActivityC25766jFo, Function0<Unit> function0, Continuation<? super TrackerAddressManagementBaseActivity$checkLoginStatus$2> continuation) {
        super(2, continuation);
        this.this$0 = abstractActivityC25766jFo;
        this.$onPostLogin = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TrackerAddressManagementBaseActivity$checkLoginStatus$2(this.this$0, this.$onPostLogin, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TrackerAddressManagementBaseActivity$checkLoginStatus$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objOLrzqt;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            AbstractC25769jFr abstractC25769jFrAYXKKw = this.this$0.AYXKKw();
            this.label = 1;
            objOLrzqt = abstractC25769jFrAYXKKw.OLrzqt(this);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = ((Result) obj).m7386unboximpl();
        }
        Boolean boolKWHzl = C56443yFo.KWHzl(false);
        if (Result.m7383isFailureimpl(objOLrzqt)) {
            objOLrzqt = boolKWHzl;
        }
        if (!((Boolean) objOLrzqt).booleanValue()) {
            this.this$0.OLrzqt(this.$onPostLogin);
            return Unit.INSTANCE;
        }
        this.$onPostLogin.invoke();
        return Unit.INSTANCE;
    }
}
