package com.okinc.business.deeplink;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C23285hvO;
import o.C56391yDq;
import o.C56442yFn;
import o.C9705bad;
import o.C9708bag;
import o.InterfaceC25414iwK;
import o.kKG;

/* JADX INFO: loaded from: classes3.dex */
public final class DeeplinkUtil$processData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FragmentActivity $activity;
    final /* synthetic */ Bundle $bundle;
    final /* synthetic */ InterfaceC25414iwK $featureFlagManager;
    final /* synthetic */ C9708bag $referralCodeStore;
    final /* synthetic */ String $url;
    final /* synthetic */ kKG $walletUseCase;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeeplinkUtil$processData$1(String str, FragmentActivity fragmentActivity, Bundle bundle, C9708bag c9708bag, InterfaceC25414iwK interfaceC25414iwK, kKG kkg, Continuation<? super DeeplinkUtil$processData$1> continuation) {
        super(2, continuation);
        this.$url = str;
        this.$activity = fragmentActivity;
        this.$bundle = bundle;
        this.$referralCodeStore = c9708bag;
        this.$featureFlagManager = interfaceC25414iwK;
        this.$walletUseCase = kkg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DeeplinkUtil$processData$1(this.$url, this.$activity, this.$bundle, this.$referralCodeStore, this.$featureFlagManager, this.$walletUseCase, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DeeplinkUtil$processData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            String str = this.$url;
            FragmentActivity fragmentActivity = this.$activity;
            Bundle bundle = this.$bundle;
            C23285hvO c23285hvO = new C23285hvO();
            C9708bag c9708bag = this.$referralCodeStore;
            InterfaceC25414iwK interfaceC25414iwK = this.$featureFlagManager;
            kKG kkg = this.$walletUseCase;
            this.label = 1;
            if (C9705bad.copydefault(str, fragmentActivity, bundle, c23285hvO, c9708bag, interfaceC25414iwK, kkg, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
