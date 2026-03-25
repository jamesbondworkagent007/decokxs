package com.okinc.auth.impl.guard.utils;

import androidx.fragment.app.Fragment;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56434yFf;
import o.C56441yFm;
import o.C56442yFn;
import o.C56447yFs;
import o.C5698aBQ;
import o.C5700aBS;
import o.InterfaceC5693aBL;

/* JADX INFO: loaded from: classes3.dex */
public final class BiometricServiceImpl$authBiometric$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super InterfaceC5693aBL>, Object> {
    final /* synthetic */ Fragment $fragment;
    final /* synthetic */ C5700aBS $userKeyPair;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ C5698aBQ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BiometricServiceImpl$authBiometric$2(C5698aBQ c5698aBQ, Fragment fragment, C5700aBS c5700aBS, Continuation<? super BiometricServiceImpl$authBiometric$2> continuation) {
        super(2, continuation);
        this.this$0 = c5698aBQ;
        this.$fragment = fragment;
        this.$userKeyPair = c5700aBS;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BiometricServiceImpl$authBiometric$2(this.this$0, this.$fragment, this.$userKeyPair, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super InterfaceC5693aBL> continuation) {
        return ((BiometricServiceImpl$authBiometric$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C5698aBQ c5698aBQ = this.this$0;
            Fragment fragment = this.$fragment;
            C5700aBS c5700aBS = this.$userKeyPair;
            this.L$0 = c5698aBQ;
            this.L$1 = fragment;
            this.L$2 = c5700aBS;
            this.label = 1;
            C56434yFf c56434yFf = new C56434yFf(C56441yFm.OLrzqt(this));
            c5698aBQ.EZpvd(c56434yFf, fragment, c5700aBS);
            obj = c56434yFf.KWHzl();
            if (obj == C56442yFn.copydefault()) {
                C56447yFs.copydefault(this);
            }
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return obj;
    }
}
