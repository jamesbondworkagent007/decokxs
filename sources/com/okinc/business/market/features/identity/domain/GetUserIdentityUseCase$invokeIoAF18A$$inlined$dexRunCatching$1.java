package com.okinc.business.market.features.identity.domain;

import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C28586kda;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC9731bbC;
import o.InterfaceC9738bbJ;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.business.market.features.identity.domain.GetUserIdentityUseCase$invoke-IoAF18A$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class GetUserIdentityUseCase$invokeIoAF18A$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends DexUserIdentity>>, Object> {
    int label;
    final /* synthetic */ C28586kda this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetUserIdentityUseCase$invokeIoAF18A$$inlined$dexRunCatching$1(Continuation continuation, C28586kda c28586kda) {
        super(2, continuation);
        this.this$0 = c28586kda;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetUserIdentityUseCase$invokeIoAF18A$$inlined$dexRunCatching$1(continuation, this.this$0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends DexUserIdentity>> continuation) {
        return ((GetUserIdentityUseCase$invokeIoAF18A$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        C56442yFn.copydefault();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(obj);
        try {
            Result.Application application = Result.Companion;
            InterfaceC9738bbJ interfaceC9738bbJValueOf = this.this$0.copydefault.valueOf();
            Intrinsics.copydefault(interfaceC9738bbJValueOf);
            long jFetchVPNInfo = interfaceC9738bbJValueOf.AubY() ? 1L : ((InterfaceC9731bbC) CollectionsKt___CollectionsKt.AuCTelauCTel(interfaceC9738bbJValueOf.RcXXUw())).fetchVPNInfo();
            objM7377constructorimpl = Result.m7377constructorimpl(new DexUserIdentity((interfaceC9738bbJValueOf.ORxRYg() || interfaceC9738bbJValueOf.gHZMYf() || interfaceC9738bbJValueOf.AubY()) ? interfaceC9738bbJValueOf.EZpvd(jFetchVPNInfo) : (String) CollectionsKt___CollectionsKt.dNCPSb(interfaceC9738bbJValueOf.copydefault()), jFetchVPNInfo, interfaceC9738bbJValueOf.QfsBiF()));
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            pUU.AEQbTJ("DEX", "dexRunCatching", th);
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
