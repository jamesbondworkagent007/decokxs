package com.okinc.core.ok_app;

import android.content.Context;
import android.os.Bundle;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC33240msi;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C56524yIo;
import o.InterfaceC33236mse;

/* JADX INFO: loaded from: classes8.dex */
public final class ModeManager$toPro$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ AbstractC33240msi $liteSubMode;
    final /* synthetic */ Bundle $newBundle;
    final /* synthetic */ Function1<Boolean, Unit> $onComplete;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ModeManager$toPro$2(AbstractC33240msi abstractC33240msi, Context context, Bundle bundle, Function1<? super Boolean, Unit> function1, Continuation<? super ModeManager$toPro$2> continuation) {
        super(2, continuation);
        this.$liteSubMode = abstractC33240msi;
        this.$context = context;
        this.$newBundle = bundle;
        this.$onComplete = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ModeManager$toPro$2(this.$liteSubMode, this.$context, this.$newBundle, this.$onComplete, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ModeManager$toPro$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC33236mse interfaceC33236mse = (InterfaceC33236mse) C43251rlk.AEQbTJ(C56524yIo.AEQbTJ(InterfaceC33236mse.class));
            AbstractC33240msi abstractC33240msi = this.$liteSubMode;
            Context context = this.$context;
            Bundle bundle = this.$newBundle;
            this.label = 1;
            if (interfaceC33236mse.copydefault(abstractC33240msi, context, bundle, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        this.$onComplete.invoke(C56443yFo.KWHzl(true));
        return Unit.INSTANCE;
    }
}
