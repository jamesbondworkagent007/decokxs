package com.okinc.core.ok_app.modeswitch;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC33240msi;
import o.AbstractC33249msr;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.yHO;

/* JADX INFO: loaded from: classes8.dex */
public final class OKLiteSubModeUtilsKt$setupConfigCollector$3 extends SuspendLambda implements yHO<CoroutineScope, Pair<? extends AbstractC33249msr, ? extends AbstractC33240msi>, Continuation<? super Unit>, Object> {
    final /* synthetic */ yHO<CoroutineScope, Pair<? extends AbstractC33249msr, ? extends AbstractC33240msi>, Continuation<? super Unit>, Object> $block;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.yHO<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.Pair<? extends o.msr, ? extends o.msi>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OKLiteSubModeUtilsKt$setupConfigCollector$3(yHO<? super CoroutineScope, ? super Pair<? extends AbstractC33249msr, ? extends AbstractC33240msi>, ? super Continuation<? super Unit>, ? extends Object> yho, Continuation<? super OKLiteSubModeUtilsKt$setupConfigCollector$3> continuation) {
        super(3, continuation);
        this.$block = yho;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(CoroutineScope coroutineScope, Pair<? extends AbstractC33249msr, ? extends AbstractC33240msi> pair, Continuation<? super Unit> continuation) {
        OKLiteSubModeUtilsKt$setupConfigCollector$3 oKLiteSubModeUtilsKt$setupConfigCollector$3 = new OKLiteSubModeUtilsKt$setupConfigCollector$3(this.$block, continuation);
        oKLiteSubModeUtilsKt$setupConfigCollector$3.L$0 = coroutineScope;
        oKLiteSubModeUtilsKt$setupConfigCollector$3.L$1 = pair;
        return oKLiteSubModeUtilsKt$setupConfigCollector$3.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            Pair<? extends AbstractC33249msr, ? extends AbstractC33240msi> pair = (Pair) this.L$1;
            pUU.KWHzl("ModeSwitch", "setupConfigCollector collectOnLifecycle: proSubMode=" + pair.getFirst() + ", liteSubMode=" + pair.getSecond());
            yHO<CoroutineScope, Pair<? extends AbstractC33249msr, ? extends AbstractC33240msi>, Continuation<? super Unit>, Object> yho = this.$block;
            this.L$0 = null;
            this.label = 1;
            if (yho.invoke(coroutineScope, pair, this) == objCopydefault) {
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
