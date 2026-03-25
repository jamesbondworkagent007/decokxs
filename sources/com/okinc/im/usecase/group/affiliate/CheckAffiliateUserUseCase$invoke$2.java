package com.okinc.im.usecase.group.affiliate;

import com.okinc.im.usecase.group.affiliate.CheckAffiliateUserUseCase$invoke$2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC58185ywX;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC58229yxO;
import o.InterfaceC8171axh;

/* JADX INFO: loaded from: classes8.dex */
public final class CheckAffiliateUserUseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ InterfaceC8171axh $service;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckAffiliateUserUseCase$invoke$2(InterfaceC8171axh interfaceC8171axh, Continuation<? super CheckAffiliateUserUseCase$invoke$2> continuation) {
        super(2, continuation);
        this.$service = interfaceC8171axh;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean invokeSuspend$lambda$2(Throwable th) {
        return Boolean.FALSE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CheckAffiliateUserUseCase$invoke$2(this.$service, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((CheckAffiliateUserUseCase$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            AbstractC58185ywX<Boolean> abstractC58185ywXKWHzl = this.$service.KWHzl();
            final Function1 function1 = new Function1() { // from class: o.oDq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return CheckAffiliateUserUseCase$invoke$2.invokeSuspend$lambda$0((java.lang.Boolean) obj2);
                }
            };
            AbstractC58185ywX<R> abstractC58185ywXAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.oDr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj2) {
                    return CheckAffiliateUserUseCase$invoke$2.invokeSuspend$lambda$1(function1, obj2);
                }
            });
            final Function1 function12 = new Function1() { // from class: o.oDs
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return CheckAffiliateUserUseCase$invoke$2.invokeSuspend$lambda$2((java.lang.Throwable) obj2);
                }
            };
            return abstractC58185ywXAEQbTJ.djBIcL(new InterfaceC58229yxO() { // from class: o.oDp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj2) {
                    return CheckAffiliateUserUseCase$invoke$2.invokeSuspend$lambda$3(function12, obj2);
                }
            }).AEQbTJ();
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean invokeSuspend$lambda$0(Boolean bool) {
        return Boolean.valueOf(!bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean invokeSuspend$lambda$1(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean invokeSuspend$lambda$3(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }
}
