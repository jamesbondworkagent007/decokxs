package com.okinc.business.market.features.watch_list_groups;

import android.os.Bundle;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.business.defi.api.bean.DappSignArgs;
import com.okinc.business.market.features.watch_list_groups.WatchlistGroupActivity$handleLoginFlow$1;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C25389ivm;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC9854bdT;
import o.kBV;

/* JADX INFO: loaded from: classes7.dex */
public final class WatchlistGroupActivity$handleLoginFlow$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function0<Unit> $onPostLogin;
    int label;
    final /* synthetic */ kBV this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WatchlistGroupActivity$handleLoginFlow$1(kBV kbv, Function0<Unit> function0, Continuation<? super WatchlistGroupActivity$handleLoginFlow$1> continuation) {
        super(2, continuation);
        this.this$0 = kbv;
        this.$onPostLogin = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WatchlistGroupActivity$handleLoginFlow$1(this.this$0, this.$onPostLogin, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WatchlistGroupActivity$handleLoginFlow$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            WatchlistJwtViewModel watchlistJwtViewModelDjBIcL = this.this$0.djBIcL();
            this.label = 1;
            objCopydefault = watchlistJwtViewModelDjBIcL.copydefault(this);
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
        if (Result.m7383isFailureimpl(objCopydefault)) {
            objCopydefault = null;
        }
        DappSignArgs dappSignArgs = (DappSignArgs) objCopydefault;
        if (dappSignArgs == null) {
            return Unit.INSTANCE;
        }
        InterfaceC9854bdT interfaceC9854bdT = (InterfaceC9854bdT) C43251rlk.copydefault(InterfaceC9854bdT.class);
        final kBV kbv = this.this$0;
        final Function0<Unit> function0 = this.$onPostLogin;
        interfaceC9854bdT.EZpvd(kbv, dappSignArgs, new Function1() { // from class: o.kCg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return WatchlistGroupActivity$handleLoginFlow$1.invokeSuspend$lambda$0(kbv, function0, (android.os.Bundle) obj2);
            }
        }, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(kBV kbv, Function0 function0, Bundle bundle) {
        C25389ivm.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(kbv), null, null, new WatchlistGroupActivity$handleLoginFlow$1$1$1(kbv, bundle, function0, null), 3, null);
        return Unit.INSTANCE;
    }
}
