package com.okinc.business.market.features.address_tracker_sa.ui.recommendation;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C25707jDj;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes15.dex */
public final class AddressTrackerRecommendationFragment$checkLoginStatus$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function0<Unit> $onPostLogin;
    int label;
    final /* synthetic */ C25707jDj this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressTrackerRecommendationFragment$checkLoginStatus$2(C25707jDj c25707jDj, Function0<Unit> function0, Continuation<? super AddressTrackerRecommendationFragment$checkLoginStatus$2> continuation) {
        super(2, continuation);
        this.this$0 = c25707jDj;
        this.$onPostLogin = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AddressTrackerRecommendationFragment$checkLoginStatus$2(this.this$0, this.$onPostLogin, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AddressTrackerRecommendationFragment$checkLoginStatus$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            AddressTrackerRecommendationViewModel addressTrackerRecommendationViewModelValueOf = this.this$0.valueOf();
            this.label = 1;
            objCopydefault = addressTrackerRecommendationViewModelValueOf.copydefault(this);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objCopydefault = ((Result) obj).m7386unboximpl();
        }
        Boolean boolKWHzl = C56443yFo.KWHzl(false);
        if (Result.m7383isFailureimpl(objCopydefault)) {
            objCopydefault = boolKWHzl;
        }
        if (!((Boolean) objCopydefault).booleanValue()) {
            this.this$0.OLrzqt((Function0<Unit>) this.$onPostLogin);
            return Unit.INSTANCE;
        }
        this.$onPostLogin.invoke();
        return Unit.INSTANCE;
    }
}
